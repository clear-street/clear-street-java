// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

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
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelAllOpenOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelAllOpenOrdersResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelOpenOrderParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelOpenOrderResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrderByIdParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrderByIdResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrdersResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderReplaceOrderParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderReplaceOrderResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderSubmitOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderSubmitOrdersResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Place, monitor, and manage trading orders. */
class OrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrderService {

    private val withRawResponse: OrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderService =
        OrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelAllOpenOrders(
        params: OrderCancelAllOpenOrdersParams,
        requestOptions: RequestOptions,
    ): OrderCancelAllOpenOrdersResponse =
        // delete /active/v1/accounts/{account_id}/orders
        withRawResponse().cancelAllOpenOrders(params, requestOptions).parse()

    override fun cancelOpenOrder(
        params: OrderCancelOpenOrderParams,
        requestOptions: RequestOptions,
    ): OrderCancelOpenOrderResponse =
        // delete /active/v1/accounts/{account_id}/orders/{order_id}
        withRawResponse().cancelOpenOrder(params, requestOptions).parse()

    override fun getOrderById(
        params: OrderGetOrderByIdParams,
        requestOptions: RequestOptions,
    ): OrderGetOrderByIdResponse =
        // get /active/v1/accounts/{account_id}/orders/{order_id}
        withRawResponse().getOrderById(params, requestOptions).parse()

    override fun getOrders(
        params: OrderGetOrdersParams,
        requestOptions: RequestOptions,
    ): OrderGetOrdersResponse =
        // get /active/v1/accounts/{account_id}/orders
        withRawResponse().getOrders(params, requestOptions).parse()

    override fun replaceOrder(
        params: OrderReplaceOrderParams,
        requestOptions: RequestOptions,
    ): OrderReplaceOrderResponse =
        // patch /active/v1/accounts/{account_id}/orders/{order_id}
        withRawResponse().replaceOrder(params, requestOptions).parse()

    override fun submitOrders(
        params: OrderSubmitOrdersParams,
        requestOptions: RequestOptions,
    ): OrderSubmitOrdersResponse =
        // post /active/v1/accounts/{account_id}/orders
        withRawResponse().submitOrders(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrderService.WithRawResponse =
            OrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelAllOpenOrdersHandler: Handler<OrderCancelAllOpenOrdersResponse> =
            jsonHandler<OrderCancelAllOpenOrdersResponse>(clientOptions.jsonMapper)

        override fun cancelAllOpenOrders(
            params: OrderCancelAllOpenOrdersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderCancelAllOpenOrdersResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "orders")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelAllOpenOrdersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelOpenOrderHandler: Handler<OrderCancelOpenOrderResponse> =
            jsonHandler<OrderCancelOpenOrderResponse>(clientOptions.jsonMapper)

        override fun cancelOpenOrder(
            params: OrderCancelOpenOrderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderCancelOpenOrderResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "orders",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelOpenOrderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getOrderByIdHandler: Handler<OrderGetOrderByIdResponse> =
            jsonHandler<OrderGetOrderByIdResponse>(clientOptions.jsonMapper)

        override fun getOrderById(
            params: OrderGetOrderByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderGetOrderByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "orders",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getOrderByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getOrdersHandler: Handler<OrderGetOrdersResponse> =
            jsonHandler<OrderGetOrdersResponse>(clientOptions.jsonMapper)

        override fun getOrders(
            params: OrderGetOrdersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderGetOrdersResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "orders")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getOrdersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceOrderHandler: Handler<OrderReplaceOrderResponse> =
            jsonHandler<OrderReplaceOrderResponse>(clientOptions.jsonMapper)

        override fun replaceOrder(
            params: OrderReplaceOrderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderReplaceOrderResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "orders",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceOrderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val submitOrdersHandler: Handler<OrderSubmitOrdersResponse> =
            jsonHandler<OrderSubmitOrdersResponse>(clientOptions.jsonMapper)

        override fun submitOrders(
            params: OrderSubmitOrdersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderSubmitOrdersResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "orders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
