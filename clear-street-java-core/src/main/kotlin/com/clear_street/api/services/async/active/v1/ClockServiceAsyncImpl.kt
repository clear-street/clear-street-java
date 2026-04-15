// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

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
import com.clear_street.api.models.active.v1.clock.ClockGetClockParams
import com.clear_street.api.models.active.v1.clock.ClockGetClockResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class ClockServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ClockServiceAsync {

    private val withRawResponse: ClockServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClockServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClockServiceAsync =
        ClockServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getClock(
        params: ClockGetClockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClockGetClockResponse> =
        // get /active/v1/clock
        withRawResponse().getClock(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClockServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClockServiceAsync.WithRawResponse =
            ClockServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getClockHandler: Handler<ClockGetClockResponse> =
            jsonHandler<ClockGetClockResponse>(clientOptions.jsonMapper)

        override fun getClock(
            params: ClockGetClockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClockGetClockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "clock")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getClockHandler.handle(it) }
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
