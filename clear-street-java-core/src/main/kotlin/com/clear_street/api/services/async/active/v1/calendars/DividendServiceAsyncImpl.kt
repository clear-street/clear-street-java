// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.handlers.jsonHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarParams
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class DividendServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DividendServiceAsync {

    private val withRawResponse: DividendServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DividendServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DividendServiceAsync =
        DividendServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getDividendsCalendar(
        params: DividendGetDividendsCalendarParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DividendGetDividendsCalendarResponse> =
        // get /active/v1/calendars/dividends
        withRawResponse().getDividendsCalendar(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DividendServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DividendServiceAsync.WithRawResponse =
            DividendServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getDividendsCalendarHandler: Handler<DividendGetDividendsCalendarResponse> =
            jsonHandler<DividendGetDividendsCalendarResponse>(clientOptions.jsonMapper)

        override fun getDividendsCalendar(
            params: DividendGetDividendsCalendarParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DividendGetDividendsCalendarResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "dividends")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDividendsCalendarHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
