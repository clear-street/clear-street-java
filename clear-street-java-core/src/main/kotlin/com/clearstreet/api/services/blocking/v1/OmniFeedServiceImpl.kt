// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

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
import com.clearstreet.api.core.prepare
import com.clearstreet.api.models.v1.omnifeed.OmniFeedGetFeedParams
import com.clearstreet.api.models.v1.omnifeed.OmniFeedGetFeedResponse
import com.clearstreet.api.models.v1.omnifeed.OmniFeedPostFeedEventParams
import java.util.function.Consumer

/**
 * Personalized feed of market stories: upcoming earnings, dividends, and splits, plus market news.
 * Served per caller in a stable order; item ids double as pagination cursors, so any previously
 * returned page can be re-read.
 */
class OmniFeedServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OmniFeedService {

    private val withRawResponse: OmniFeedService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OmniFeedService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniFeedService =
        OmniFeedServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getFeed(
        params: OmniFeedGetFeedParams,
        requestOptions: RequestOptions,
    ): OmniFeedGetFeedResponse =
        // get /v1/omni-ai/feed
        withRawResponse().getFeed(params, requestOptions).parse()

    override fun postFeedEvent(
        params: OmniFeedPostFeedEventParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/omni-ai/feed/events
        withRawResponse().postFeedEvent(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OmniFeedService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OmniFeedService.WithRawResponse =
            OmniFeedServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getFeedHandler: Handler<OmniFeedGetFeedResponse> =
            jsonHandler<OmniFeedGetFeedResponse>(clientOptions.jsonMapper)

        override fun getFeed(
            params: OmniFeedGetFeedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OmniFeedGetFeedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "feed")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getFeedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val postFeedEventHandler: Handler<Void?> = emptyHandler()

        override fun postFeedEvent(
            params: OmniFeedPostFeedEventParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "feed", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { postFeedEventHandler.handle(it) }
            }
        }
    }
}
