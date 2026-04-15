// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.watchlists

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
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemParams
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemResponse
import com.clear_street.api.models.active.v1.watchlists.items.ItemDeleteWatchlistItemParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class ItemServiceImpl internal constructor(private val clientOptions: ClientOptions) : ItemService {

    private val withRawResponse: ItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ItemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService =
        ItemServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addWatchlistItem(
        params: ItemAddWatchlistItemParams,
        requestOptions: RequestOptions,
    ): ItemAddWatchlistItemResponse =
        // post /active/v1/watchlists/{watchlist_id}/items
        withRawResponse().addWatchlistItem(params, requestOptions).parse()

    override fun deleteWatchlistItem(
        params: ItemDeleteWatchlistItemParams,
        requestOptions: RequestOptions,
    ) {
        // delete /active/v1/watchlists/{watchlist_id}/items/{item_id}
        withRawResponse().deleteWatchlistItem(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ItemService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ItemService.WithRawResponse =
            ItemServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addWatchlistItemHandler: Handler<ItemAddWatchlistItemResponse> =
            jsonHandler<ItemAddWatchlistItemResponse>(clientOptions.jsonMapper)

        override fun addWatchlistItem(
            params: ItemAddWatchlistItemParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ItemAddWatchlistItemResponse> {
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

        private val deleteWatchlistItemHandler: Handler<Void?> = emptyHandler()

        override fun deleteWatchlistItem(
            params: ItemDeleteWatchlistItemParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteWatchlistItemHandler.handle(it) }
            }
        }
    }
}
