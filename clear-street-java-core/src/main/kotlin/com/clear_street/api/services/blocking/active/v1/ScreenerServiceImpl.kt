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
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerParams
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerResponse
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
class ScreenerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScreenerService {

    private val withRawResponse: ScreenerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScreenerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerService =
        ScreenerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getScreener(
        params: ScreenerGetScreenerParams,
        requestOptions: RequestOptions,
    ): ScreenerGetScreenerResponse =
        // get /active/v1/screener
        withRawResponse().getScreener(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScreenerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScreenerService.WithRawResponse =
            ScreenerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getScreenerHandler: Handler<ScreenerGetScreenerResponse> =
            jsonHandler<ScreenerGetScreenerResponse>(clientOptions.jsonMapper)

        override fun getScreener(
            params: ScreenerGetScreenerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScreenerGetScreenerResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "screener")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getScreenerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
