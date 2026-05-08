// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instrumentdata

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instrumentdata.news.NewsGetNewsParams
import com.clear_street.api.models.v1.instrumentdata.news.NewsGetNewsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve instrument analytics, market data, news, and related reference data. */
interface NewsServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NewsServiceAsync

    /**
     * Retrieves news items with optional filtering by security IDs, time range, publisher, type,
     * and text query.
     */
    fun getNews(): CompletableFuture<NewsGetNewsResponse> = getNews(NewsGetNewsParams.none())

    /** @see getNews */
    fun getNews(
        params: NewsGetNewsParams = NewsGetNewsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NewsGetNewsResponse>

    /** @see getNews */
    fun getNews(
        params: NewsGetNewsParams = NewsGetNewsParams.none()
    ): CompletableFuture<NewsGetNewsResponse> = getNews(params, RequestOptions.none())

    /** @see getNews */
    fun getNews(requestOptions: RequestOptions): CompletableFuture<NewsGetNewsResponse> =
        getNews(NewsGetNewsParams.none(), requestOptions)

    /** A view of [NewsServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NewsServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/news`, but is otherwise the same as
         * [NewsServiceAsync.getNews].
         */
        fun getNews(): CompletableFuture<HttpResponseFor<NewsGetNewsResponse>> =
            getNews(NewsGetNewsParams.none())

        /** @see getNews */
        fun getNews(
            params: NewsGetNewsParams = NewsGetNewsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NewsGetNewsResponse>>

        /** @see getNews */
        fun getNews(
            params: NewsGetNewsParams = NewsGetNewsParams.none()
        ): CompletableFuture<HttpResponseFor<NewsGetNewsResponse>> =
            getNews(params, RequestOptions.none())

        /** @see getNews */
        fun getNews(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NewsGetNewsResponse>> =
            getNews(NewsGetNewsParams.none(), requestOptions)
    }
}
