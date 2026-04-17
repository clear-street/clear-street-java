// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.iris

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
import com.clear_street.api.models.active.v1.iris.feedback.FeedbackCreateFeedbackDeprecatedParams
import com.clear_street.api.models.active.v1.iris.feedback.FeedbackCreateFeedbackDeprecatedResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
class FeedbackServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FeedbackServiceAsync {

    private val withRawResponse: FeedbackServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FeedbackServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackServiceAsync =
        FeedbackServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun createFeedbackDeprecated(
        params: FeedbackCreateFeedbackDeprecatedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackCreateFeedbackDeprecatedResponse> =
        // post /active/v1/iris/feedback
        withRawResponse().createFeedbackDeprecated(params, requestOptions).thenApply { it.parse() }

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

        private val createFeedbackDeprecatedHandler:
            Handler<FeedbackCreateFeedbackDeprecatedResponse> =
            jsonHandler<FeedbackCreateFeedbackDeprecatedResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun createFeedbackDeprecated(
            params: FeedbackCreateFeedbackDeprecatedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackCreateFeedbackDeprecatedResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "iris", "feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createFeedbackDeprecatedHandler.handle(it) }
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
