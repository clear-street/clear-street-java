// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.accounts.orders.OrderCancelAllOpenOrdersParams
import com.clear_street.api.models.v1.accounts.orders.OrderCancelAllOpenOrdersResponse
import com.clear_street.api.models.v1.accounts.orders.OrderCancelOpenOrderParams
import com.clear_street.api.models.v1.accounts.orders.OrderCancelOpenOrderResponse
import com.clear_street.api.models.v1.accounts.orders.OrderGetOrderByIdParams
import com.clear_street.api.models.v1.accounts.orders.OrderGetOrderByIdResponse
import com.clear_street.api.models.v1.accounts.orders.OrderGetOrdersParams
import com.clear_street.api.models.v1.accounts.orders.OrderGetOrdersResponse
import com.clear_street.api.models.v1.accounts.orders.OrderReplaceOrderParams
import com.clear_street.api.models.v1.accounts.orders.OrderReplaceOrderResponse
import com.clear_street.api.models.v1.accounts.orders.OrderSubmitOrdersParams
import com.clear_street.api.models.v1.accounts.orders.OrderSubmitOrdersResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Place, monitor, and manage trading orders. */
interface OrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderServiceAsync

    /** Cancel all orders for an account */
    fun cancelAllOpenOrders(accountId: Long): CompletableFuture<OrderCancelAllOpenOrdersResponse> =
        cancelAllOpenOrders(accountId, OrderCancelAllOpenOrdersParams.none())

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        accountId: Long,
        params: OrderCancelAllOpenOrdersParams = OrderCancelAllOpenOrdersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderCancelAllOpenOrdersResponse> =
        cancelAllOpenOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        accountId: Long,
        params: OrderCancelAllOpenOrdersParams = OrderCancelAllOpenOrdersParams.none(),
    ): CompletableFuture<OrderCancelAllOpenOrdersResponse> =
        cancelAllOpenOrders(accountId, params, RequestOptions.none())

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        params: OrderCancelAllOpenOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderCancelAllOpenOrdersResponse>

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        params: OrderCancelAllOpenOrdersParams
    ): CompletableFuture<OrderCancelAllOpenOrdersResponse> =
        cancelAllOpenOrders(params, RequestOptions.none())

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderCancelAllOpenOrdersResponse> =
        cancelAllOpenOrders(accountId, OrderCancelAllOpenOrdersParams.none(), requestOptions)

    /** Cancel a specific order */
    fun cancelOpenOrder(
        orderId: String,
        params: OrderCancelOpenOrderParams,
    ): CompletableFuture<OrderCancelOpenOrderResponse> =
        cancelOpenOrder(orderId, params, RequestOptions.none())

    /** @see cancelOpenOrder */
    fun cancelOpenOrder(
        orderId: String,
        params: OrderCancelOpenOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderCancelOpenOrderResponse> =
        cancelOpenOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see cancelOpenOrder */
    fun cancelOpenOrder(
        params: OrderCancelOpenOrderParams
    ): CompletableFuture<OrderCancelOpenOrderResponse> =
        cancelOpenOrder(params, RequestOptions.none())

    /** @see cancelOpenOrder */
    fun cancelOpenOrder(
        params: OrderCancelOpenOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderCancelOpenOrderResponse>

    /** Get Order By ID */
    fun getOrderById(
        orderId: String,
        params: OrderGetOrderByIdParams,
    ): CompletableFuture<OrderGetOrderByIdResponse> =
        getOrderById(orderId, params, RequestOptions.none())

    /** @see getOrderById */
    fun getOrderById(
        orderId: String,
        params: OrderGetOrderByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderGetOrderByIdResponse> =
        getOrderById(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see getOrderById */
    fun getOrderById(
        params: OrderGetOrderByIdParams
    ): CompletableFuture<OrderGetOrderByIdResponse> = getOrderById(params, RequestOptions.none())

    /** @see getOrderById */
    fun getOrderById(
        params: OrderGetOrderByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderGetOrderByIdResponse>

    /** List orders for an account with optional filtering */
    fun getOrders(accountId: Long): CompletableFuture<OrderGetOrdersResponse> =
        getOrders(accountId, OrderGetOrdersParams.none())

    /** @see getOrders */
    fun getOrders(
        accountId: Long,
        params: OrderGetOrdersParams = OrderGetOrdersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderGetOrdersResponse> =
        getOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getOrders */
    fun getOrders(
        accountId: Long,
        params: OrderGetOrdersParams = OrderGetOrdersParams.none(),
    ): CompletableFuture<OrderGetOrdersResponse> =
        getOrders(accountId, params, RequestOptions.none())

    /** @see getOrders */
    fun getOrders(
        params: OrderGetOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderGetOrdersResponse>

    /** @see getOrders */
    fun getOrders(params: OrderGetOrdersParams): CompletableFuture<OrderGetOrdersResponse> =
        getOrders(params, RequestOptions.none())

    /** @see getOrders */
    fun getOrders(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderGetOrdersResponse> =
        getOrders(accountId, OrderGetOrdersParams.none(), requestOptions)

    /** Replace an order with new parameters */
    fun replaceOrder(
        orderId: String,
        params: OrderReplaceOrderParams,
    ): CompletableFuture<OrderReplaceOrderResponse> =
        replaceOrder(orderId, params, RequestOptions.none())

    /** @see replaceOrder */
    fun replaceOrder(
        orderId: String,
        params: OrderReplaceOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderReplaceOrderResponse> =
        replaceOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see replaceOrder */
    fun replaceOrder(
        params: OrderReplaceOrderParams
    ): CompletableFuture<OrderReplaceOrderResponse> = replaceOrder(params, RequestOptions.none())

    /** @see replaceOrder */
    fun replaceOrder(
        params: OrderReplaceOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderReplaceOrderResponse>

    /** Submit new orders */
    fun submitOrders(
        accountId: Long,
        params: OrderSubmitOrdersParams,
    ): CompletableFuture<OrderSubmitOrdersResponse> =
        submitOrders(accountId, params, RequestOptions.none())

    /** @see submitOrders */
    fun submitOrders(
        accountId: Long,
        params: OrderSubmitOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderSubmitOrdersResponse> =
        submitOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see submitOrders */
    fun submitOrders(
        params: OrderSubmitOrdersParams
    ): CompletableFuture<OrderSubmitOrdersResponse> = submitOrders(params, RequestOptions.none())

    /** @see submitOrders */
    fun submitOrders(
        params: OrderSubmitOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderSubmitOrdersResponse>

    /** A view of [OrderServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{account_id}/orders`, but is
         * otherwise the same as [OrderServiceAsync.cancelAllOpenOrders].
         */
        fun cancelAllOpenOrders(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOpenOrdersResponse>> =
            cancelAllOpenOrders(accountId, OrderCancelAllOpenOrdersParams.none())

        /** @see cancelAllOpenOrders */
        fun cancelAllOpenOrders(
            accountId: Long,
            params: OrderCancelAllOpenOrdersParams = OrderCancelAllOpenOrdersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOpenOrdersResponse>> =
            cancelAllOpenOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see cancelAllOpenOrders */
        fun cancelAllOpenOrders(
            accountId: Long,
            params: OrderCancelAllOpenOrdersParams = OrderCancelAllOpenOrdersParams.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOpenOrdersResponse>> =
            cancelAllOpenOrders(accountId, params, RequestOptions.none())

        /** @see cancelAllOpenOrders */
        fun cancelAllOpenOrders(
            params: OrderCancelAllOpenOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOpenOrdersResponse>>

        /** @see cancelAllOpenOrders */
        fun cancelAllOpenOrders(
            params: OrderCancelAllOpenOrdersParams
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOpenOrdersResponse>> =
            cancelAllOpenOrders(params, RequestOptions.none())

        /** @see cancelAllOpenOrders */
        fun cancelAllOpenOrders(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOpenOrdersResponse>> =
            cancelAllOpenOrders(accountId, OrderCancelAllOpenOrdersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{account_id}/orders/{order_id}`, but
         * is otherwise the same as [OrderServiceAsync.cancelOpenOrder].
         */
        fun cancelOpenOrder(
            orderId: String,
            params: OrderCancelOpenOrderParams,
        ): CompletableFuture<HttpResponseFor<OrderCancelOpenOrderResponse>> =
            cancelOpenOrder(orderId, params, RequestOptions.none())

        /** @see cancelOpenOrder */
        fun cancelOpenOrder(
            orderId: String,
            params: OrderCancelOpenOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelOpenOrderResponse>> =
            cancelOpenOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see cancelOpenOrder */
        fun cancelOpenOrder(
            params: OrderCancelOpenOrderParams
        ): CompletableFuture<HttpResponseFor<OrderCancelOpenOrderResponse>> =
            cancelOpenOrder(params, RequestOptions.none())

        /** @see cancelOpenOrder */
        fun cancelOpenOrder(
            params: OrderCancelOpenOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelOpenOrderResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/orders/{order_id}`, but is
         * otherwise the same as [OrderServiceAsync.getOrderById].
         */
        fun getOrderById(
            orderId: String,
            params: OrderGetOrderByIdParams,
        ): CompletableFuture<HttpResponseFor<OrderGetOrderByIdResponse>> =
            getOrderById(orderId, params, RequestOptions.none())

        /** @see getOrderById */
        fun getOrderById(
            orderId: String,
            params: OrderGetOrderByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderGetOrderByIdResponse>> =
            getOrderById(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see getOrderById */
        fun getOrderById(
            params: OrderGetOrderByIdParams
        ): CompletableFuture<HttpResponseFor<OrderGetOrderByIdResponse>> =
            getOrderById(params, RequestOptions.none())

        /** @see getOrderById */
        fun getOrderById(
            params: OrderGetOrderByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderGetOrderByIdResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/orders`, but is otherwise
         * the same as [OrderServiceAsync.getOrders].
         */
        fun getOrders(accountId: Long): CompletableFuture<HttpResponseFor<OrderGetOrdersResponse>> =
            getOrders(accountId, OrderGetOrdersParams.none())

        /** @see getOrders */
        fun getOrders(
            accountId: Long,
            params: OrderGetOrdersParams = OrderGetOrdersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderGetOrdersResponse>> =
            getOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getOrders */
        fun getOrders(
            accountId: Long,
            params: OrderGetOrdersParams = OrderGetOrdersParams.none(),
        ): CompletableFuture<HttpResponseFor<OrderGetOrdersResponse>> =
            getOrders(accountId, params, RequestOptions.none())

        /** @see getOrders */
        fun getOrders(
            params: OrderGetOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderGetOrdersResponse>>

        /** @see getOrders */
        fun getOrders(
            params: OrderGetOrdersParams
        ): CompletableFuture<HttpResponseFor<OrderGetOrdersResponse>> =
            getOrders(params, RequestOptions.none())

        /** @see getOrders */
        fun getOrders(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderGetOrdersResponse>> =
            getOrders(accountId, OrderGetOrdersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{account_id}/orders/{order_id}`, but
         * is otherwise the same as [OrderServiceAsync.replaceOrder].
         */
        fun replaceOrder(
            orderId: String,
            params: OrderReplaceOrderParams,
        ): CompletableFuture<HttpResponseFor<OrderReplaceOrderResponse>> =
            replaceOrder(orderId, params, RequestOptions.none())

        /** @see replaceOrder */
        fun replaceOrder(
            orderId: String,
            params: OrderReplaceOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderReplaceOrderResponse>> =
            replaceOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see replaceOrder */
        fun replaceOrder(
            params: OrderReplaceOrderParams
        ): CompletableFuture<HttpResponseFor<OrderReplaceOrderResponse>> =
            replaceOrder(params, RequestOptions.none())

        /** @see replaceOrder */
        fun replaceOrder(
            params: OrderReplaceOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderReplaceOrderResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/accounts/{account_id}/orders`, but is otherwise
         * the same as [OrderServiceAsync.submitOrders].
         */
        fun submitOrders(
            accountId: Long,
            params: OrderSubmitOrdersParams,
        ): CompletableFuture<HttpResponseFor<OrderSubmitOrdersResponse>> =
            submitOrders(accountId, params, RequestOptions.none())

        /** @see submitOrders */
        fun submitOrders(
            accountId: Long,
            params: OrderSubmitOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderSubmitOrdersResponse>> =
            submitOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see submitOrders */
        fun submitOrders(
            params: OrderSubmitOrdersParams
        ): CompletableFuture<HttpResponseFor<OrderSubmitOrdersResponse>> =
            submitOrders(params, RequestOptions.none())

        /** @see submitOrders */
        fun submitOrders(
            params: OrderSubmitOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderSubmitOrdersResponse>>
    }
}
