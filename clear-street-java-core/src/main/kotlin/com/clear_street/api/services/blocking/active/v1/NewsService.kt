// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.news.NewsGetNewsParams
import com.clear_street.api.models.active.v1.news.NewsGetNewsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface NewsService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NewsService

    /**
     * Retrieves news items with optional filtering by security IDs, time range, publisher, type,
     * and text query.
     */
    fun getNews(): NewsGetNewsResponse = getNews(NewsGetNewsParams.none())

    /** @see getNews */
    fun getNews(
        params: NewsGetNewsParams = NewsGetNewsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NewsGetNewsResponse

    /** @see getNews */
    fun getNews(params: NewsGetNewsParams = NewsGetNewsParams.none()): NewsGetNewsResponse =
        getNews(params, RequestOptions.none())

    /** @see getNews */
    fun getNews(requestOptions: RequestOptions): NewsGetNewsResponse =
        getNews(NewsGetNewsParams.none(), requestOptions)

    /** A view of [NewsService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NewsService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/news`, but is otherwise the same as
         * [NewsService.getNews].
         */
        @MustBeClosed
        fun getNews(): HttpResponseFor<NewsGetNewsResponse> = getNews(NewsGetNewsParams.none())

        /** @see getNews */
        @MustBeClosed
        fun getNews(
            params: NewsGetNewsParams = NewsGetNewsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NewsGetNewsResponse>

        /** @see getNews */
        @MustBeClosed
        fun getNews(
            params: NewsGetNewsParams = NewsGetNewsParams.none()
        ): HttpResponseFor<NewsGetNewsResponse> = getNews(params, RequestOptions.none())

        /** @see getNews */
        @MustBeClosed
        fun getNews(requestOptions: RequestOptions): HttpResponseFor<NewsGetNewsResponse> =
            getNews(NewsGetNewsParams.none(), requestOptions)
    }
}
