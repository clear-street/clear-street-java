// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.watchlists

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
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemParams
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemResponse
import com.clear_street.api.models.active.v1.watchlists.items.ItemDeleteWatchlistItemParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create and manage watchlists. */
class ItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ItemServiceAsync {

    private val withRawResponse: ItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ItemServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync =
        ItemServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addWatchlistItem(
        params: ItemAddWatchlistItemParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemAddWatchlistItemResponse> =
        // post /active/v1/watchlists/{watchlist_id}/items
        withRawResponse().addWatchlistItem(params, requestOptions).thenApply { it.parse() }

    override fun deleteWatchlistItem(
        params: ItemDeleteWatchlistItemParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /active/v1/watchlists/{watchlist_id}/items/{item_id}
        withRawResponse().deleteWatchlistItem(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ItemServiceAsync.WithRawResponse =
            ItemServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addWatchlistItemHandler: Handler<ItemAddWatchlistItemResponse> =
            jsonHandler<ItemAddWatchlistItemResponse>(clientOptions.jsonMapper)

        override fun addWatchlistItem(
            params: ItemAddWatchlistItemParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemAddWatchlistItemResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("watchlistId", params.watchlistId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "watchlists", params._pathParam(0), "items")
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

        private val deleteWatchlistItemHandler: Handler<Void?> = emptyHandler()

        override fun deleteWatchlistItem(
            params: ItemDeleteWatchlistItemParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
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
                        response.use { deleteWatchlistItemHandler.handle(it) }
                    }
                }
        }
    }
}
