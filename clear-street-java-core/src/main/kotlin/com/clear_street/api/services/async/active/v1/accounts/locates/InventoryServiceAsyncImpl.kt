// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts.locates

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
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.accounts.locates.inventory.InventoryGetLocateInventoryParams
import com.clear_street.api.models.active.v1.accounts.locates.inventory.InventoryGetLocateInventoryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage locate requests for short selling. */
class InventoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InventoryServiceAsync {

    private val withRawResponse: InventoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InventoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InventoryServiceAsync =
        InventoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getLocateInventory(
        params: InventoryGetLocateInventoryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InventoryGetLocateInventoryResponse> =
        // get /active/v1/accounts/{account_id}/locates/inventory
        withRawResponse().getLocateInventory(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InventoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InventoryServiceAsync.WithRawResponse =
            InventoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getLocateInventoryHandler: Handler<InventoryGetLocateInventoryResponse> =
            jsonHandler<InventoryGetLocateInventoryResponse>(clientOptions.jsonMapper)

        override fun getLocateInventory(
            params: InventoryGetLocateInventoryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InventoryGetLocateInventoryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "locates",
                        "inventory",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLocateInventoryHandler.handle(it) }
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
