// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelAllOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelAllOrdersResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelOrderParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelOrderResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrderByIdParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrderByIdResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrdersResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderReplaceOrderParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderReplaceOrderResponse
import com.clear_street.api.models.active.v1.accounts.orders.OrderSubmitOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderSubmitOrdersResponse
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

    /**
     * Cancel all orders for an account
     *
     * All filter parameters can be used independently or combined. The only constraint is that
     * `security_id` and `security_id_source` must be provided together if either is specified.
     */
    fun cancelAllOrders(accountId: Long): CompletableFuture<OrderCancelAllOrdersResponse> =
        cancelAllOrders(accountId, OrderCancelAllOrdersParams.none())

    /** @see cancelAllOrders */
    fun cancelAllOrders(
        accountId: Long,
        params: OrderCancelAllOrdersParams = OrderCancelAllOrdersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderCancelAllOrdersResponse> =
        cancelAllOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see cancelAllOrders */
    fun cancelAllOrders(
        accountId: Long,
        params: OrderCancelAllOrdersParams = OrderCancelAllOrdersParams.none(),
    ): CompletableFuture<OrderCancelAllOrdersResponse> =
        cancelAllOrders(accountId, params, RequestOptions.none())

    /** @see cancelAllOrders */
    fun cancelAllOrders(
        params: OrderCancelAllOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderCancelAllOrdersResponse>

    /** @see cancelAllOrders */
    fun cancelAllOrders(
        params: OrderCancelAllOrdersParams
    ): CompletableFuture<OrderCancelAllOrdersResponse> =
        cancelAllOrders(params, RequestOptions.none())

    /** @see cancelAllOrders */
    fun cancelAllOrders(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrderCancelAllOrdersResponse> =
        cancelAllOrders(accountId, OrderCancelAllOrdersParams.none(), requestOptions)

    /** Cancel a specific order */
    fun cancelOrder(
        orderId: String,
        params: OrderCancelOrderParams,
    ): CompletableFuture<OrderCancelOrderResponse> =
        cancelOrder(orderId, params, RequestOptions.none())

    /** @see cancelOrder */
    fun cancelOrder(
        orderId: String,
        params: OrderCancelOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderCancelOrderResponse> =
        cancelOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see cancelOrder */
    fun cancelOrder(params: OrderCancelOrderParams): CompletableFuture<OrderCancelOrderResponse> =
        cancelOrder(params, RequestOptions.none())

    /** @see cancelOrder */
    fun cancelOrder(
        params: OrderCancelOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrderCancelOrderResponse>

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
         * Returns a raw HTTP response for `delete /active/v1/accounts/{account_id}/orders`, but is
         * otherwise the same as [OrderServiceAsync.cancelAllOrders].
         */
        fun cancelAllOrders(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOrdersResponse>> =
            cancelAllOrders(accountId, OrderCancelAllOrdersParams.none())

        /** @see cancelAllOrders */
        fun cancelAllOrders(
            accountId: Long,
            params: OrderCancelAllOrdersParams = OrderCancelAllOrdersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOrdersResponse>> =
            cancelAllOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see cancelAllOrders */
        fun cancelAllOrders(
            accountId: Long,
            params: OrderCancelAllOrdersParams = OrderCancelAllOrdersParams.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOrdersResponse>> =
            cancelAllOrders(accountId, params, RequestOptions.none())

        /** @see cancelAllOrders */
        fun cancelAllOrders(
            params: OrderCancelAllOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOrdersResponse>>

        /** @see cancelAllOrders */
        fun cancelAllOrders(
            params: OrderCancelAllOrdersParams
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOrdersResponse>> =
            cancelAllOrders(params, RequestOptions.none())

        /** @see cancelAllOrders */
        fun cancelAllOrders(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrderCancelAllOrdersResponse>> =
            cancelAllOrders(accountId, OrderCancelAllOrdersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /active/v1/accounts/{account_id}/orders/{order_id}`, but is otherwise the same as
         * [OrderServiceAsync.cancelOrder].
         */
        fun cancelOrder(
            orderId: String,
            params: OrderCancelOrderParams,
        ): CompletableFuture<HttpResponseFor<OrderCancelOrderResponse>> =
            cancelOrder(orderId, params, RequestOptions.none())

        /** @see cancelOrder */
        fun cancelOrder(
            orderId: String,
            params: OrderCancelOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelOrderResponse>> =
            cancelOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see cancelOrder */
        fun cancelOrder(
            params: OrderCancelOrderParams
        ): CompletableFuture<HttpResponseFor<OrderCancelOrderResponse>> =
            cancelOrder(params, RequestOptions.none())

        /** @see cancelOrder */
        fun cancelOrder(
            params: OrderCancelOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrderCancelOrderResponse>>

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/orders/{order_id}`,
         * but is otherwise the same as [OrderServiceAsync.getOrderById].
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
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/orders`, but is
         * otherwise the same as [OrderServiceAsync.getOrders].
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
         * Returns a raw HTTP response for `patch
         * /active/v1/accounts/{account_id}/orders/{order_id}`, but is otherwise the same as
         * [OrderServiceAsync.replaceOrder].
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
         * Returns a raw HTTP response for `post /active/v1/accounts/{account_id}/orders`, but is
         * otherwise the same as [OrderServiceAsync.submitOrders].
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
