// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai.threads

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
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.omniai.threads.response.ResponseGetThreadResponseParams
import com.clear_street.api.models.active.v1.omniai.threads.response.ResponseGetThreadResponseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Every endpoint requires an explicit account_id.
 */
class ResponseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ResponseServiceAsync {

    private val withRawResponse: ResponseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ResponseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseServiceAsync =
        ResponseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getThreadResponse(
        params: ResponseGetThreadResponseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseGetThreadResponseResponse> =
        // get /active/v1/omni-ai/threads/{thread_id}/response
        withRawResponse().getThreadResponse(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResponseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResponseServiceAsync.WithRawResponse =
            ResponseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getThreadResponseHandler: Handler<ResponseGetThreadResponseResponse> =
            jsonHandler<ResponseGetThreadResponseResponse>(clientOptions.jsonMapper)

        override fun getThreadResponse(
            params: ResponseGetThreadResponseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseGetThreadResponseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "omni-ai",
                        "threads",
                        params._pathParam(0),
                        "response",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getThreadResponseHandler.handle(it) }
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
