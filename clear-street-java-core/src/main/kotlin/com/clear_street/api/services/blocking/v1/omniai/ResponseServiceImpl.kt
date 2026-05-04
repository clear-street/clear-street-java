// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.handlers.jsonHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.core.http.json
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepare
import com.clear_street.api.models.v1.omniai.responses.ResponseCancelResponseParams
import com.clear_street.api.models.v1.omniai.responses.ResponseCancelResponseResponse
import com.clear_street.api.models.v1.omniai.responses.ResponseGetResponseParams
import com.clear_street.api.models.v1.omniai.responses.ResponseGetResponseResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
class ResponseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ResponseService {

    private val withRawResponse: ResponseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ResponseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseService =
        ResponseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelResponse(
        params: ResponseCancelResponseParams,
        requestOptions: RequestOptions,
    ): ResponseCancelResponseResponse =
        // delete /v1/omni-ai/responses/{response_id}
        withRawResponse().cancelResponse(params, requestOptions).parse()

    override fun getResponse(
        params: ResponseGetResponseParams,
        requestOptions: RequestOptions,
    ): ResponseGetResponseResponse =
        // get /v1/omni-ai/responses/{response_id}
        withRawResponse().getResponse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResponseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResponseService.WithRawResponse =
            ResponseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelResponseHandler: Handler<ResponseCancelResponseResponse> =
            jsonHandler<ResponseCancelResponseResponse>(clientOptions.jsonMapper)

        override fun cancelResponse(
            params: ResponseCancelResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseCancelResponseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("responseId", params.responseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "responses", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelResponseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getResponseHandler: Handler<ResponseGetResponseResponse> =
            jsonHandler<ResponseGetResponseResponse>(clientOptions.jsonMapper)

        override fun getResponse(
            params: ResponseGetResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseGetResponseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("responseId", params.responseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "responses", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getResponseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
