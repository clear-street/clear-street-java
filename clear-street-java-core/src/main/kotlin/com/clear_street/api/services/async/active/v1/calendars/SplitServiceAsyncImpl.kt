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
import com.clear_street.api.models.active.v1.calendars.splits.SplitGetSplitsCalendarParams
import com.clear_street.api.models.active.v1.calendars.splits.SplitGetSplitsCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class SplitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SplitServiceAsync {

    private val withRawResponse: SplitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SplitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitServiceAsync =
        SplitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getSplitsCalendar(
        params: SplitGetSplitsCalendarParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SplitGetSplitsCalendarResponse> =
        // get /active/v1/calendars/splits
        withRawResponse().getSplitsCalendar(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SplitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SplitServiceAsync.WithRawResponse =
            SplitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getSplitsCalendarHandler: Handler<SplitGetSplitsCalendarResponse> =
            jsonHandler<SplitGetSplitsCalendarResponse>(clientOptions.jsonMapper)

        override fun getSplitsCalendar(
            params: SplitGetSplitsCalendarParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SplitGetSplitsCalendarResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "splits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSplitsCalendarHandler.handle(it) }
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
