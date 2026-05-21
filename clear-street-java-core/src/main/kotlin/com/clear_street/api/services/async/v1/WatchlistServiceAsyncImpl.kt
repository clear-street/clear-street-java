// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

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
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.v1.watchlist.WatchlistAddWatchlistItemParams
import com.clear_street.api.models.v1.watchlist.WatchlistAddWatchlistItemResponse
import com.clear_street.api.models.v1.watchlist.WatchlistCreateWatchlistParams
import com.clear_street.api.models.v1.watchlist.WatchlistCreateWatchlistResponse
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistItemParams
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistItemResponse
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistParams
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistResponse
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistByIdParams
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistByIdResponse
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistsParams
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create and manage watchlists. */
class WatchlistServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WatchlistServiceAsync {

    private val withRawResponse: WatchlistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WatchlistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchlistServiceAsync =
        WatchlistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addWatchlistItem(
        params: WatchlistAddWatchlistItemParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistAddWatchlistItemResponse> =
        // post /v1/watchlists/{watchlist_id}/items
        withRawResponse().addWatchlistItem(params, requestOptions).thenApply { it.parse() }

    override fun createWatchlist(
        params: WatchlistCreateWatchlistParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistCreateWatchlistResponse> =
        // post /v1/watchlists
        withRawResponse().createWatchlist(params, requestOptions).thenApply { it.parse() }

    override fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistDeleteWatchlistResponse> =
        // delete /v1/watchlists/{watchlist_id}
        withRawResponse().deleteWatchlist(params, requestOptions).thenApply { it.parse() }

    override fun deleteWatchlistItem(
        params: WatchlistDeleteWatchlistItemParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistDeleteWatchlistItemResponse> =
        // delete /v1/watchlists/{watchlist_id}/items/{item_id}
        withRawResponse().deleteWatchlistItem(params, requestOptions).thenApply { it.parse() }

    override fun getWatchlistById(
        params: WatchlistGetWatchlistByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistGetWatchlistByIdResponse> =
        // get /v1/watchlists/{watchlist_id}
        withRawResponse().getWatchlistById(params, requestOptions).thenApply { it.parse() }

    override fun getWatchlists(
        params: WatchlistGetWatchlistsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistGetWatchlistsResponse> =
        // get /v1/watchlists
        withRawResponse().getWatchlists(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WatchlistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WatchlistServiceAsync.WithRawResponse =
            WatchlistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addWatchlistItemHandler: Handler<WatchlistAddWatchlistItemResponse> =
            jsonHandler<WatchlistAddWatchlistItemResponse>(clientOptions.jsonMapper)

        override fun addWatchlistItem(
            params: WatchlistAddWatchlistItemParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchlistAddWatchlistItemResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("watchlistId", params.watchlistId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "watchlists", params._pathParam(0), "items")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addWatchlistItemHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createWatchlistHandler: Handler<WatchlistCreateWatchlistResponse> =
            jsonHandler<WatchlistCreateWatchlistResponse>(clientOptions.jsonMapper)

        override fun createWatchlist(
            params: WatchlistCreateWatchlistParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchlistCreateWatchlistResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "watchlists")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createWatchlistHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteWatchlistHandler: Handler<WatchlistDeleteWatchlistResponse> =
            jsonHandler<WatchlistDeleteWatchlistResponse>(clientOptions.jsonMapper)

        override fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("watchlistId", params.watchlistId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "watchlists", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteWatchlistHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteWatchlistItemHandler: Handler<WatchlistDeleteWatchlistItemResponse> =
            jsonHandler<WatchlistDeleteWatchlistItemResponse>(clientOptions.jsonMapper)

        override fun deleteWatchlistItem(
            params: WatchlistDeleteWatchlistItemParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistItemResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "watchlists",
                        params._pathParam(0),
                        "items",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteWatchlistItemHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getWatchlistByIdHandler: Handler<WatchlistGetWatchlistByIdResponse> =
            jsonHandler<WatchlistGetWatchlistByIdResponse>(clientOptions.jsonMapper)

        override fun getWatchlistById(
            params: WatchlistGetWatchlistByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("watchlistId", params.watchlistId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "watchlists", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getWatchlistByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getWatchlistsHandler: Handler<WatchlistGetWatchlistsResponse> =
            jsonHandler<WatchlistGetWatchlistsResponse>(clientOptions.jsonMapper)

        override fun getWatchlists(
            params: WatchlistGetWatchlistsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "watchlists")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getWatchlistsHandler.handle(it) }
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
