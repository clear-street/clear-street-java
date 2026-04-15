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
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarParams
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class EconomicServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EconomicServiceAsync {

    private val withRawResponse: EconomicServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EconomicServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EconomicServiceAsync =
        EconomicServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getEconomicCalendar(
        params: EconomicGetEconomicCalendarParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EconomicGetEconomicCalendarResponse> =
        // get /active/v1/calendars/economic
        withRawResponse().getEconomicCalendar(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EconomicServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EconomicServiceAsync.WithRawResponse =
            EconomicServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getEconomicCalendarHandler: Handler<EconomicGetEconomicCalendarResponse> =
            jsonHandler<EconomicGetEconomicCalendarResponse>(clientOptions.jsonMapper)

        override fun getEconomicCalendar(
            params: EconomicGetEconomicCalendarParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EconomicGetEconomicCalendarResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "economic")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getEconomicCalendarHandler.handle(it) }
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
