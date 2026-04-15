// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.clock.ClockGetClockParams
import com.clear_street.api.models.active.v1.clock.ClockGetClockResponse
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class ClockServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClockService {

    private val withRawResponse: ClockService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClockService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClockService =
        ClockServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getClock(
        params: ClockGetClockParams,
        requestOptions: RequestOptions,
    ): ClockGetClockResponse =
        // get /active/v1/clock
        withRawResponse().getClock(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClockService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClockService.WithRawResponse =
            ClockServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getClockHandler: Handler<ClockGetClockResponse> =
            jsonHandler<ClockGetClockResponse>(clientOptions.jsonMapper)

        override fun getClock(
            params: ClockGetClockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClockGetClockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "clock")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
