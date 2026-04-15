// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.handlers.emptyHandler
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
import com.clear_street.api.models.active.v1.watchlists.WatchlistCreateWatchlistParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistCreateWatchlistResponse
import com.clear_street.api.models.active.v1.watchlists.WatchlistDeleteWatchlistParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistByIdParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistByIdResponse
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistsParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistsResponse
import com.clear_street.api.services.async.active.v1.watchlists.ItemServiceAsync
import com.clear_street.api.services.async.active.v1.watchlists.ItemServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class WatchlistServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WatchlistServiceAsync {

    private val withRawResponse: WatchlistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val items: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WatchlistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchlistServiceAsync =
        WatchlistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve details and lists of tradable instruments. */
    override fun items(): ItemServiceAsync = items

    override fun createWatchlist(
        params: WatchlistCreateWatchlistParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistCreateWatchlistResponse> =
        // post /active/v1/watchlists
        withRawResponse().createWatchlist(params, requestOptions).thenApply { it.parse() }

    override fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /active/v1/watchlists/{watchlist_id}
        withRawResponse().deleteWatchlist(params, requestOptions).thenAccept {}

    override fun getWatchlistById(
        params: WatchlistGetWatchlistByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistGetWatchlistByIdResponse> =
        // get /active/v1/watchlists/{watchlist_id}
        withRawResponse().getWatchlistById(params, requestOptions).thenApply { it.parse() }

    override fun getWatchlists(
        params: WatchlistGetWatchlistsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistGetWatchlistsResponse> =
        // get /active/v1/watchlists
        withRawResponse().getWatchlists(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WatchlistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val items: ItemServiceAsync.WithRawResponse by lazy {
            ItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WatchlistServiceAsync.WithRawResponse =
            WatchlistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Retrieve details and lists of tradable instruments. */
        override fun items(): ItemServiceAsync.WithRawResponse = items

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
                    .addPathSegments("active", "v1", "watchlists")
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

        private val deleteWatchlistHandler: Handler<Void?> = emptyHandler()

        override fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("watchlistId", params.watchlistId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "watchlists", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteWatchlistHandler.handle(it) }
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
                    .addPathSegments("active", "v1", "watchlists", params._pathParam(0))
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
                    .addPathSegments("active", "v1", "watchlists")
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
