// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.iris

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
import com.clear_street.api.models.active.v1.iris.threads.ThreadGetThreadDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.ThreadGetThreadDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.threads.ThreadListThreadsDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.ThreadListThreadsDeprecatedResponse
import com.clear_street.api.services.async.active.v1.iris.threads.MessageServiceAsync
import com.clear_street.api.services.async.active.v1.iris.threads.MessageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
class ThreadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreadServiceAsync {

    private val withRawResponse: ThreadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ThreadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadServiceAsync =
        ThreadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    override fun messages(): MessageServiceAsync = messages

    @Deprecated("deprecated")
    override fun getThreadDeprecated(
        params: ThreadGetThreadDeprecatedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadGetThreadDeprecatedResponse> =
        // get /active/v1/iris/threads/{thread_id}
        withRawResponse().getThreadDeprecated(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun listThreadsDeprecated(
        params: ThreadListThreadsDeprecatedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadListThreadsDeprecatedResponse> =
        // get /active/v1/iris/threads
        withRawResponse().listThreadsDeprecated(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadServiceAsync.WithRawResponse =
            ThreadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        private val getThreadDeprecatedHandler: Handler<ThreadGetThreadDeprecatedResponse> =
            jsonHandler<ThreadGetThreadDeprecatedResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getThreadDeprecated(
            params: ThreadGetThreadDeprecatedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadGetThreadDeprecatedResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "iris", "threads", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getThreadDeprecatedHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listThreadsDeprecatedHandler: Handler<ThreadListThreadsDeprecatedResponse> =
            jsonHandler<ThreadListThreadsDeprecatedResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun listThreadsDeprecated(
            params: ThreadListThreadsDeprecatedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadListThreadsDeprecatedResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "iris", "threads")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listThreadsDeprecatedHandler.handle(it) }
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
