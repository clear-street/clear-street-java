// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.omnifeed.OmniFeedGetFeedParams
import com.clearstreet.api.models.v1.omnifeed.OmniFeedGetFeedResponse
import com.clearstreet.api.models.v1.omnifeed.OmniFeedPostFeedEventParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Personalized feed of market stories: upcoming earnings, dividends, and splits, plus market news.
 * Served per caller in a stable order; item ids double as pagination cursors, so any previously
 * returned page can be re-read.
 */
interface OmniFeedService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniFeedService

    /**
     * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
     *
     * Returns the caller's personalized feed of market stories: upcoming earnings, dividends, and
     * splits, plus market news.
     *
     * The feed is a stable, append-only sequence per caller. Without a `cursor`, the response
     * resumes from the caller's oldest unseen item and continues forward; passing the id of the
     * last item received as `cursor` returns the items after it. Either way, when the known
     * sequence runs short of `limit`, fresh stories are appended and included. Re-requesting an
     * earlier cursor replays the same items in the same order.
     */
    fun getFeed(): OmniFeedGetFeedResponse = getFeed(OmniFeedGetFeedParams.none())

    /** @see getFeed */
    fun getFeed(
        params: OmniFeedGetFeedParams = OmniFeedGetFeedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OmniFeedGetFeedResponse

    /** @see getFeed */
    fun getFeed(
        params: OmniFeedGetFeedParams = OmniFeedGetFeedParams.none()
    ): OmniFeedGetFeedResponse = getFeed(params, RequestOptions.none())

    /** @see getFeed */
    fun getFeed(requestOptions: RequestOptions): OmniFeedGetFeedResponse =
        getFeed(OmniFeedGetFeedParams.none(), requestOptions)

    /**
     * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
     *
     * Records one of the caller's interactions with a feed item: the item rendered on screen
     * (`seen`), expanded from its headline to its summary (`click`), or voted on (`upvote`,
     * `downvote`). Marking an item `seen` excludes it from the caller's next feed response.
     *
     * Each request records a new event, so a request that is retried after a failure of unknown
     * outcome may be recorded twice. That is harmless for `seen` and for votes — the first is a
     * yes-or-no exclusion and the latest vote is the one that counts — so retry freely for those.
     * The event is wrapped in an `event` field so that a future request may carry several at once
     * without breaking this one.
     */
    fun postFeedEvent(params: OmniFeedPostFeedEventParams) =
        postFeedEvent(params, RequestOptions.none())

    /** @see postFeedEvent */
    fun postFeedEvent(
        params: OmniFeedPostFeedEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [OmniFeedService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniFeedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/omni-ai/feed`, but is otherwise the same as
         * [OmniFeedService.getFeed].
         */
        @MustBeClosed
        fun getFeed(): HttpResponseFor<OmniFeedGetFeedResponse> =
            getFeed(OmniFeedGetFeedParams.none())

        /** @see getFeed */
        @MustBeClosed
        fun getFeed(
            params: OmniFeedGetFeedParams = OmniFeedGetFeedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OmniFeedGetFeedResponse>

        /** @see getFeed */
        @MustBeClosed
        fun getFeed(
            params: OmniFeedGetFeedParams = OmniFeedGetFeedParams.none()
        ): HttpResponseFor<OmniFeedGetFeedResponse> = getFeed(params, RequestOptions.none())

        /** @see getFeed */
        @MustBeClosed
        fun getFeed(requestOptions: RequestOptions): HttpResponseFor<OmniFeedGetFeedResponse> =
            getFeed(OmniFeedGetFeedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/omni-ai/feed/events`, but is otherwise the same
         * as [OmniFeedService.postFeedEvent].
         */
        @MustBeClosed
        fun postFeedEvent(params: OmniFeedPostFeedEventParams): HttpResponse =
            postFeedEvent(params, RequestOptions.none())

        /** @see postFeedEvent */
        @MustBeClosed
        fun postFeedEvent(
            params: OmniFeedPostFeedEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
