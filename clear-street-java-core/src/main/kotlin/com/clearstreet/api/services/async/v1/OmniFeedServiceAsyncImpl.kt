// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.handlers.emptyHandler
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.handlers.jsonHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.core.http.json
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepareAsync
import com.clearstreet.api.models.v1.omnifeed.OmniFeedGetFeedParams
import com.clearstreet.api.models.v1.omnifeed.OmniFeedGetFeedResponse
import com.clearstreet.api.models.v1.omnifeed.OmniFeedPostFeedEventParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Personalized feed of market stories: upcoming earnings, dividends, and splits, plus market news.
 * Served per caller in a stable order; item ids double as pagination cursors, so any previously
 * returned page can be re-read.
 */
class OmniFeedServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OmniFeedServiceAsync {

    private val withRawResponse: OmniFeedServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OmniFeedServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniFeedServiceAsync =
        OmniFeedServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getFeed(
        params: OmniFeedGetFeedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OmniFeedGetFeedResponse> =
        // get /v1/omni-ai/feed
        withRawResponse().getFeed(params, requestOptions).thenApply { it.parse() }

    override fun postFeedEvent(
        params: OmniFeedPostFeedEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/omni-ai/feed/events
        withRawResponse().postFeedEvent(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OmniFeedServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OmniFeedServiceAsync.WithRawResponse =
            OmniFeedServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getFeedHandler: Handler<OmniFeedGetFeedResponse> =
            jsonHandler<OmniFeedGetFeedResponse>(clientOptions.jsonMapper)

        override fun getFeed(
            params: OmniFeedGetFeedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OmniFeedGetFeedResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "feed")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getFeedHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val postFeedEventHandler: Handler<Void?> = emptyHandler()

        override fun postFeedEvent(
            params: OmniFeedPostFeedEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "feed", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { postFeedEventHandler.handle(it) }
                    }
                }
        }
    }
}
