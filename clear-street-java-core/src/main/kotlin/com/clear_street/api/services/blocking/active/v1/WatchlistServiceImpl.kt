// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.watchlists.WatchlistCreateWatchlistParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistCreateWatchlistResponse
import com.clear_street.api.models.active.v1.watchlists.WatchlistDeleteWatchlistParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistByIdParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistByIdResponse
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistsParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistsResponse
import com.clear_street.api.services.blocking.active.v1.watchlists.ItemService
import com.clear_street.api.services.blocking.active.v1.watchlists.ItemServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class WatchlistServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WatchlistService {

    private val withRawResponse: WatchlistService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val items: ItemService by lazy { ItemServiceImpl(clientOptions) }

    override fun withRawResponse(): WatchlistService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchlistService =
        WatchlistServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve details and lists of tradable instruments. */
    override fun items(): ItemService = items

    override fun createWatchlist(
        params: WatchlistCreateWatchlistParams,
        requestOptions: RequestOptions,
    ): WatchlistCreateWatchlistResponse =
        // post /active/v1/watchlists
        withRawResponse().createWatchlist(params, requestOptions).parse()

    override fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams,
        requestOptions: RequestOptions,
    ) {
        // delete /active/v1/watchlists/{watchlist_id}
        withRawResponse().deleteWatchlist(params, requestOptions)
    }

    override fun getWatchlistById(
        params: WatchlistGetWatchlistByIdParams,
        requestOptions: RequestOptions,
    ): WatchlistGetWatchlistByIdResponse =
        // get /active/v1/watchlists/{watchlist_id}
        withRawResponse().getWatchlistById(params, requestOptions).parse()

    override fun getWatchlists(
        params: WatchlistGetWatchlistsParams,
        requestOptions: RequestOptions,
    ): WatchlistGetWatchlistsResponse =
        // get /active/v1/watchlists
        withRawResponse().getWatchlists(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WatchlistService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val items: ItemService.WithRawResponse by lazy {
            ItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WatchlistService.WithRawResponse =
            WatchlistServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Retrieve details and lists of tradable instruments. */
        override fun items(): ItemService.WithRawResponse = items

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
                    .addPathSegments("active", "v1", "watchlists")
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

        private val deleteWatchlistHandler: Handler<Void?> = emptyHandler()

        override fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteWatchlistHandler.handle(it) }
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
                    .addPathSegments("active", "v1", "watchlists", params._pathParam(0))
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
                    .addPathSegments("active", "v1", "watchlists")
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
