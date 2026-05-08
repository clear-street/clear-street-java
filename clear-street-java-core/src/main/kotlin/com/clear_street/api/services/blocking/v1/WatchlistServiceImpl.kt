// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.clear_street.api.core.prepare
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
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create and manage watchlists. */
class WatchlistServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WatchlistService {

    private val withRawResponse: WatchlistService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WatchlistService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchlistService =
        WatchlistServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addWatchlistItem(
        params: WatchlistAddWatchlistItemParams,
        requestOptions: RequestOptions,
    ): WatchlistAddWatchlistItemResponse =
        // post /v1/watchlists/{watchlist_id}/items
        withRawResponse().addWatchlistItem(params, requestOptions).parse()

    override fun createWatchlist(
        params: WatchlistCreateWatchlistParams,
        requestOptions: RequestOptions,
    ): WatchlistCreateWatchlistResponse =
        // post /v1/watchlists
        withRawResponse().createWatchlist(params, requestOptions).parse()

    override fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams,
        requestOptions: RequestOptions,
    ): WatchlistDeleteWatchlistResponse =
        // delete /v1/watchlists/{watchlist_id}
        withRawResponse().deleteWatchlist(params, requestOptions).parse()

    override fun deleteWatchlistItem(
        params: WatchlistDeleteWatchlistItemParams,
        requestOptions: RequestOptions,
    ): WatchlistDeleteWatchlistItemResponse =
        // delete /v1/watchlists/{watchlist_id}/items/{item_id}
        withRawResponse().deleteWatchlistItem(params, requestOptions).parse()

    override fun getWatchlistById(
        params: WatchlistGetWatchlistByIdParams,
        requestOptions: RequestOptions,
    ): WatchlistGetWatchlistByIdResponse =
        // get /v1/watchlists/{watchlist_id}
        withRawResponse().getWatchlistById(params, requestOptions).parse()

    override fun getWatchlists(
        params: WatchlistGetWatchlistsParams,
        requestOptions: RequestOptions,
    ): WatchlistGetWatchlistsResponse =
        // get /v1/watchlists
        withRawResponse().getWatchlists(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WatchlistService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WatchlistService.WithRawResponse =
            WatchlistServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addWatchlistItemHandler: Handler<WatchlistAddWatchlistItemResponse> =
            jsonHandler<WatchlistAddWatchlistItemResponse>(clientOptions.jsonMapper)

        override fun addWatchlistItem(
            params: WatchlistAddWatchlistItemParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchlistAddWatchlistItemResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addWatchlistItemHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createWatchlistHandler: Handler<WatchlistCreateWatchlistResponse> =
            jsonHandler<WatchlistCreateWatchlistResponse>(clientOptions.jsonMapper)

        override fun createWatchlist(
            params: WatchlistCreateWatchlistParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchlistCreateWatchlistResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "watchlists")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createWatchlistHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteWatchlistHandler: Handler<WatchlistDeleteWatchlistResponse> =
            jsonHandler<WatchlistDeleteWatchlistResponse>(clientOptions.jsonMapper)

        override fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchlistDeleteWatchlistResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteWatchlistHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteWatchlistItemHandler: Handler<WatchlistDeleteWatchlistItemResponse> =
            jsonHandler<WatchlistDeleteWatchlistItemResponse>(clientOptions.jsonMapper)

        override fun deleteWatchlistItem(
            params: WatchlistDeleteWatchlistItemParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchlistDeleteWatchlistItemResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteWatchlistItemHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getWatchlistByIdHandler: Handler<WatchlistGetWatchlistByIdResponse> =
            jsonHandler<WatchlistGetWatchlistByIdResponse>(clientOptions.jsonMapper)

        override fun getWatchlistById(
            params: WatchlistGetWatchlistByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchlistGetWatchlistByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("watchlistId", params.watchlistId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "watchlists", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getWatchlistByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getWatchlistsHandler: Handler<WatchlistGetWatchlistsResponse> =
            jsonHandler<WatchlistGetWatchlistsResponse>(clientOptions.jsonMapper)

        override fun getWatchlists(
            params: WatchlistGetWatchlistsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchlistGetWatchlistsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "watchlists")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
