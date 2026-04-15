// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadGetThreadResponse
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsParams
import com.clear_street.api.models.active.v1.omniai.threads.ThreadListThreadsResponse
import com.clear_street.api.services.blocking.active.v1.omniai.threads.MessageService
import com.clear_street.api.services.blocking.active.v1.omniai.threads.MessageServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** AI assistant for conversational trading interactions. */
class ThreadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreadService {

    private val withRawResponse: ThreadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    override fun withRawResponse(): ThreadService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService =
        ThreadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** AI assistant for conversational trading interactions. */
    override fun messages(): MessageService = messages

    override fun getThread(
        params: ThreadGetThreadParams,
        requestOptions: RequestOptions,
    ): ThreadGetThreadResponse =
        // get /active/v1/omni-ai/threads/{thread_id}
        withRawResponse().getThread(params, requestOptions).parse()

    override fun listThreads(
        params: ThreadListThreadsParams,
        requestOptions: RequestOptions,
    ): ThreadListThreadsResponse =
        // get /active/v1/omni-ai/threads
        withRawResponse().listThreads(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadService.WithRawResponse =
            ThreadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** AI assistant for conversational trading interactions. */
        override fun messages(): MessageService.WithRawResponse = messages

        private val getThreadHandler: Handler<ThreadGetThreadResponse> =
            jsonHandler<ThreadGetThreadResponse>(clientOptions.jsonMapper)

        override fun getThread(
            params: ThreadGetThreadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadGetThreadResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "omni-ai", "threads", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getThreadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listThreadsHandler: Handler<ThreadListThreadsResponse> =
            jsonHandler<ThreadListThreadsResponse>(clientOptions.jsonMapper)

        override fun listThreads(
            params: ThreadListThreadsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadListThreadsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "omni-ai", "threads")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listThreadsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
