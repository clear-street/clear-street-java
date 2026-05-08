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
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateMessageParams
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateMessageResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadParams
import com.clear_street.api.models.v1.omniai.threads.ThreadCreateThreadResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetMessagesParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetMessagesResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadByIdParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadByIdResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponseParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadResponseResponse
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadsParams
import com.clear_street.api.models.v1.omniai.threads.ThreadGetThreadsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
class ThreadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreadService {

    private val withRawResponse: ThreadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ThreadService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService =
        ThreadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createMessage(
        params: ThreadCreateMessageParams,
        requestOptions: RequestOptions,
    ): ThreadCreateMessageResponse =
        // post /v1/omni-ai/threads/{thread_id}/messages
        withRawResponse().createMessage(params, requestOptions).parse()

    override fun createThread(
        params: ThreadCreateThreadParams,
        requestOptions: RequestOptions,
    ): ThreadCreateThreadResponse =
        // post /v1/omni-ai/threads
        withRawResponse().createThread(params, requestOptions).parse()

    override fun getMessages(
        params: ThreadGetMessagesParams,
        requestOptions: RequestOptions,
    ): ThreadGetMessagesResponse =
        // get /v1/omni-ai/threads/{thread_id}/messages
        withRawResponse().getMessages(params, requestOptions).parse()

    override fun getThreadById(
        params: ThreadGetThreadByIdParams,
        requestOptions: RequestOptions,
    ): ThreadGetThreadByIdResponse =
        // get /v1/omni-ai/threads/{thread_id}
        withRawResponse().getThreadById(params, requestOptions).parse()

    override fun getThreadResponse(
        params: ThreadGetThreadResponseParams,
        requestOptions: RequestOptions,
    ): ThreadGetThreadResponseResponse =
        // get /v1/omni-ai/threads/{thread_id}/response
        withRawResponse().getThreadResponse(params, requestOptions).parse()

    override fun getThreads(
        params: ThreadGetThreadsParams,
        requestOptions: RequestOptions,
    ): ThreadGetThreadsResponse =
        // get /v1/omni-ai/threads
        withRawResponse().getThreads(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadService.WithRawResponse =
            ThreadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createMessageHandler: Handler<ThreadCreateMessageResponse> =
            jsonHandler<ThreadCreateMessageResponse>(clientOptions.jsonMapper)

        override fun createMessage(
            params: ThreadCreateMessageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadCreateMessageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "threads", params._pathParam(0), "messages")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createMessageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createThreadHandler: Handler<ThreadCreateThreadResponse> =
            jsonHandler<ThreadCreateThreadResponse>(clientOptions.jsonMapper)

        override fun createThread(
            params: ThreadCreateThreadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadCreateThreadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "threads")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createThreadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getMessagesHandler: Handler<ThreadGetMessagesResponse> =
            jsonHandler<ThreadGetMessagesResponse>(clientOptions.jsonMapper)

        override fun getMessages(
            params: ThreadGetMessagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadGetMessagesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "threads", params._pathParam(0), "messages")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getMessagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getThreadByIdHandler: Handler<ThreadGetThreadByIdResponse> =
            jsonHandler<ThreadGetThreadByIdResponse>(clientOptions.jsonMapper)

        override fun getThreadById(
            params: ThreadGetThreadByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadGetThreadByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "threads", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getThreadByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getThreadResponseHandler: Handler<ThreadGetThreadResponseResponse> =
            jsonHandler<ThreadGetThreadResponseResponse>(clientOptions.jsonMapper)

        override fun getThreadResponse(
            params: ThreadGetThreadResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadGetThreadResponseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "threads", params._pathParam(0), "response")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getThreadResponseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getThreadsHandler: Handler<ThreadGetThreadsResponse> =
            jsonHandler<ThreadGetThreadsResponse>(clientOptions.jsonMapper)

        override fun getThreads(
            params: ThreadGetThreadsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadGetThreadsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "threads")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getThreadsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
