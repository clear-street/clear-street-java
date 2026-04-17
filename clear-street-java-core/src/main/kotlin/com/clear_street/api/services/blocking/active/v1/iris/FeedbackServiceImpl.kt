// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.iris.feedback.FeedbackCreateFeedbackDeprecatedParams
import com.clear_street.api.models.active.v1.iris.feedback.FeedbackCreateFeedbackDeprecatedResponse
import java.util.function.Consumer

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
class FeedbackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeedbackService {

    private val withRawResponse: FeedbackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FeedbackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService =
        FeedbackServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun createFeedbackDeprecated(
        params: FeedbackCreateFeedbackDeprecatedParams,
        requestOptions: RequestOptions,
    ): FeedbackCreateFeedbackDeprecatedResponse =
        // post /active/v1/iris/feedback
        withRawResponse().createFeedbackDeprecated(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackService.WithRawResponse =
            FeedbackServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createFeedbackDeprecatedHandler:
            Handler<FeedbackCreateFeedbackDeprecatedResponse> =
            jsonHandler<FeedbackCreateFeedbackDeprecatedResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun createFeedbackDeprecated(
            params: FeedbackCreateFeedbackDeprecatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackCreateFeedbackDeprecatedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "iris", "feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
