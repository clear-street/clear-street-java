// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

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
import com.clear_street.api.core.http.json
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.omniai.feedback.FeedbackCreateFeedbackParams
import com.clear_street.api.models.active.v1.omniai.feedback.FeedbackCreateFeedbackResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** AI assistant for conversational trading interactions. */
class FeedbackServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FeedbackServiceAsync {

    private val withRawResponse: FeedbackServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FeedbackServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackServiceAsync =
        FeedbackServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createFeedback(
        params: FeedbackCreateFeedbackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackCreateFeedbackResponse> =
        // post /active/v1/omni-ai/feedback
        withRawResponse().createFeedback(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackServiceAsync.WithRawResponse =
            FeedbackServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createFeedbackHandler: Handler<FeedbackCreateFeedbackResponse> =
            jsonHandler<FeedbackCreateFeedbackResponse>(clientOptions.jsonMapper)

        override fun createFeedback(
            params: FeedbackCreateFeedbackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackCreateFeedbackResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "omni-ai", "feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createFeedbackHandler.handle(it) }
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
