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
import com.clear_street.api.models.v1.orders.OrderCancelAllOpenOrdersParams
import com.clear_street.api.models.v1.orders.OrderCancelAllOpenOrdersResponse
import com.clear_street.api.models.v1.orders.OrderCancelOpenOrderParams
import com.clear_street.api.models.v1.orders.OrderCancelOpenOrderResponse
import com.clear_street.api.models.v1.orders.OrderGetOrderByIdParams
import com.clear_street.api.models.v1.orders.OrderGetOrderByIdResponse
import com.clear_street.api.models.v1.orders.OrderGetOrdersParams
import com.clear_street.api.models.v1.orders.OrderGetOrdersResponse
import com.clear_street.api.models.v1.orders.OrderReplaceOrderParams
import com.clear_street.api.models.v1.orders.OrderReplaceOrderResponse
import com.clear_street.api.models.v1.orders.OrderSubmitOrdersParams
import com.clear_street.api.models.v1.orders.OrderSubmitOrdersResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Place, monitor, and manage trading orders. */
class OrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrderServiceAsync {

    private val withRawResponse: OrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderServiceAsync =
        OrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelAllOpenOrders(
        params: OrderCancelAllOpenOrdersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderCancelAllOpenOrdersResponse> =
        // delete /v1/accounts/{account_id}/orders
        withRawResponse().cancelAllOpenOrders(params, requestOptions).thenApply { it.parse() }

    override fun cancelOpenOrder(
        params: OrderCancelOpenOrderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderCancelOpenOrderResponse> =
        // delete /v1/accounts/{account_id}/orders/{order_id}
        withRawResponse().cancelOpenOrder(params, requestOptions).thenApply { it.parse() }

    override fun getOrderById(
        params: OrderGetOrderByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderGetOrderByIdResponse> =
        // get /v1/accounts/{account_id}/orders/{order_id}
        withRawResponse().getOrderById(params, requestOptions).thenApply { it.parse() }

    override fun getOrders(
        params: OrderGetOrdersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderGetOrdersResponse> =
        // get /v1/accounts/{account_id}/orders
        withRawResponse().getOrders(params, requestOptions).thenApply { it.parse() }

    override fun replaceOrder(
        params: OrderReplaceOrderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderReplaceOrderResponse> =
        // patch /v1/accounts/{account_id}/orders/{order_id}
        withRawResponse().replaceOrder(params, requestOptions).thenApply { it.parse() }

    override fun submitOrders(
        params: OrderSubmitOrdersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderSubmitOrdersResponse> =
        // post /v1/accounts/{account_id}/orders
        withRawResponse().submitOrders(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrderServiceAsync.WithRawResponse =
            OrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelAllOpenOrdersHandler: Handler<OrderCancelAllOpenOrdersResponse> =
            jsonHandler<OrderCancelAllOpenOrdersResponse>(clientOptions.jsonMapper)

        override fun cancelAllOpenOrders(
            params: OrderCancelAllOpenOrdersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOpenOrdersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "orders")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelAllOpenOrdersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelOpenOrderHandler: Handler<OrderCancelOpenOrderResponse> =
            jsonHandler<OrderCancelOpenOrderResponse>(clientOptions.jsonMapper)

        override fun cancelOpenOrder(
            params: OrderCancelOpenOrderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderCancelOpenOrderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "orders",
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
                            .use { cancelOpenOrderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getOrderByIdHandler: Handler<OrderGetOrderByIdResponse> =
            jsonHandler<OrderGetOrderByIdResponse>(clientOptions.jsonMapper)

        override fun getOrderById(
            params: OrderGetOrderByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderGetOrderByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "orders",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getOrderByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getOrdersHandler: Handler<OrderGetOrdersResponse> =
            jsonHandler<OrderGetOrdersResponse>(clientOptions.jsonMapper)

        override fun getOrders(
            params: OrderGetOrdersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderGetOrdersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "orders")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getOrdersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceOrderHandler: Handler<OrderReplaceOrderResponse> =
            jsonHandler<OrderReplaceOrderResponse>(clientOptions.jsonMapper)

        override fun replaceOrder(
            params: OrderReplaceOrderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderReplaceOrderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "orders",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { replaceOrderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitOrdersHandler: Handler<OrderSubmitOrdersResponse> =
            jsonHandler<OrderSubmitOrdersResponse>(clientOptions.jsonMapper)

        override fun submitOrders(
            params: OrderSubmitOrdersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderSubmitOrdersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "orders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitOrdersHandler.handle(it) }
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
