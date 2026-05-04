// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.accounts

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Place, monitor, and manage trading orders. */
interface OrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderService

    /** Cancel all orders for an account */
    fun cancelAllOpenOrders(accountId: Long): OrderCancelAllOpenOrdersResponse =
        cancelAllOpenOrders(accountId, OrderCancelAllOpenOrdersParams.none())

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        accountId: Long,
        params: OrderCancelAllOpenOrdersParams = OrderCancelAllOpenOrdersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCancelAllOpenOrdersResponse =
        cancelAllOpenOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        accountId: Long,
        params: OrderCancelAllOpenOrdersParams = OrderCancelAllOpenOrdersParams.none(),
    ): OrderCancelAllOpenOrdersResponse =
        cancelAllOpenOrders(accountId, params, RequestOptions.none())

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        params: OrderCancelAllOpenOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCancelAllOpenOrdersResponse

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        params: OrderCancelAllOpenOrdersParams
    ): OrderCancelAllOpenOrdersResponse = cancelAllOpenOrders(params, RequestOptions.none())

    /** @see cancelAllOpenOrders */
    fun cancelAllOpenOrders(
        accountId: Long,
        requestOptions: RequestOptions,
    ): OrderCancelAllOpenOrdersResponse =
        cancelAllOpenOrders(accountId, OrderCancelAllOpenOrdersParams.none(), requestOptions)

    /** Cancel a specific order */
    fun cancelOpenOrder(
        orderId: String,
        params: OrderCancelOpenOrderParams,
    ): OrderCancelOpenOrderResponse = cancelOpenOrder(orderId, params, RequestOptions.none())

    /** @see cancelOpenOrder */
    fun cancelOpenOrder(
        orderId: String,
        params: OrderCancelOpenOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCancelOpenOrderResponse =
        cancelOpenOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see cancelOpenOrder */
    fun cancelOpenOrder(params: OrderCancelOpenOrderParams): OrderCancelOpenOrderResponse =
        cancelOpenOrder(params, RequestOptions.none())

    /** @see cancelOpenOrder */
    fun cancelOpenOrder(
        params: OrderCancelOpenOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderCancelOpenOrderResponse

    /** Get Order By ID */
    fun getOrderById(orderId: String, params: OrderGetOrderByIdParams): OrderGetOrderByIdResponse =
        getOrderById(orderId, params, RequestOptions.none())

    /** @see getOrderById */
    fun getOrderById(
        orderId: String,
        params: OrderGetOrderByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetOrderByIdResponse =
        getOrderById(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see getOrderById */
    fun getOrderById(params: OrderGetOrderByIdParams): OrderGetOrderByIdResponse =
        getOrderById(params, RequestOptions.none())

    /** @see getOrderById */
    fun getOrderById(
        params: OrderGetOrderByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetOrderByIdResponse

    /** List orders for an account with optional filtering */
    fun getOrders(accountId: Long): OrderGetOrdersResponse =
        getOrders(accountId, OrderGetOrdersParams.none())

    /** @see getOrders */
    fun getOrders(
        accountId: Long,
        params: OrderGetOrdersParams = OrderGetOrdersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetOrdersResponse =
        getOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getOrders */
    fun getOrders(
        accountId: Long,
        params: OrderGetOrdersParams = OrderGetOrdersParams.none(),
    ): OrderGetOrdersResponse = getOrders(accountId, params, RequestOptions.none())

    /** @see getOrders */
    fun getOrders(
        params: OrderGetOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderGetOrdersResponse

    /** @see getOrders */
    fun getOrders(params: OrderGetOrdersParams): OrderGetOrdersResponse =
        getOrders(params, RequestOptions.none())

    /** @see getOrders */
    fun getOrders(accountId: Long, requestOptions: RequestOptions): OrderGetOrdersResponse =
        getOrders(accountId, OrderGetOrdersParams.none(), requestOptions)

    /** Replace an order with new parameters */
    fun replaceOrder(orderId: String, params: OrderReplaceOrderParams): OrderReplaceOrderResponse =
        replaceOrder(orderId, params, RequestOptions.none())

    /** @see replaceOrder */
    fun replaceOrder(
        orderId: String,
        params: OrderReplaceOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderReplaceOrderResponse =
        replaceOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see replaceOrder */
    fun replaceOrder(params: OrderReplaceOrderParams): OrderReplaceOrderResponse =
        replaceOrder(params, RequestOptions.none())

    /** @see replaceOrder */
    fun replaceOrder(
        params: OrderReplaceOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderReplaceOrderResponse

    /** Submit new orders */
    fun submitOrders(accountId: Long, params: OrderSubmitOrdersParams): OrderSubmitOrdersResponse =
        submitOrders(accountId, params, RequestOptions.none())

    /** @see submitOrders */
    fun submitOrders(
        accountId: Long,
        params: OrderSubmitOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderSubmitOrdersResponse =
        submitOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see submitOrders */
    fun submitOrders(params: OrderSubmitOrdersParams): OrderSubmitOrdersResponse =
        submitOrders(params, RequestOptions.none())

    /** @see submitOrders */
    fun submitOrders(
        params: OrderSubmitOrdersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrderSubmitOrdersResponse

    /** A view of [OrderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{account_id}/orders`, but is
         * otherwise the same as [OrderService.cancelAllOpenOrders].
         */
        @MustBeClosed
        fun cancelAllOpenOrders(
            accountId: Long
        ): HttpResponseFor<OrderCancelAllOpenOrdersResponse> =
            cancelAllOpenOrders(accountId, OrderCancelAllOpenOrdersParams.none())

        /** @see cancelAllOpenOrders */
        @MustBeClosed
        fun cancelAllOpenOrders(
            accountId: Long,
            params: OrderCancelAllOpenOrdersParams = OrderCancelAllOpenOrdersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCancelAllOpenOrdersResponse> =
            cancelAllOpenOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see cancelAllOpenOrders */
        @MustBeClosed
        fun cancelAllOpenOrders(
            accountId: Long,
            params: OrderCancelAllOpenOrdersParams = OrderCancelAllOpenOrdersParams.none(),
        ): HttpResponseFor<OrderCancelAllOpenOrdersResponse> =
            cancelAllOpenOrders(accountId, params, RequestOptions.none())

        /** @see cancelAllOpenOrders */
        @MustBeClosed
        fun cancelAllOpenOrders(
            params: OrderCancelAllOpenOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCancelAllOpenOrdersResponse>

        /** @see cancelAllOpenOrders */
        @MustBeClosed
        fun cancelAllOpenOrders(
            params: OrderCancelAllOpenOrdersParams
        ): HttpResponseFor<OrderCancelAllOpenOrdersResponse> =
            cancelAllOpenOrders(params, RequestOptions.none())

        /** @see cancelAllOpenOrders */
        @MustBeClosed
        fun cancelAllOpenOrders(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderCancelAllOpenOrdersResponse> =
            cancelAllOpenOrders(accountId, OrderCancelAllOpenOrdersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{account_id}/orders/{order_id}`, but
         * is otherwise the same as [OrderService.cancelOpenOrder].
         */
        @MustBeClosed
        fun cancelOpenOrder(
            orderId: String,
            params: OrderCancelOpenOrderParams,
        ): HttpResponseFor<OrderCancelOpenOrderResponse> =
            cancelOpenOrder(orderId, params, RequestOptions.none())

        /** @see cancelOpenOrder */
        @MustBeClosed
        fun cancelOpenOrder(
            orderId: String,
            params: OrderCancelOpenOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCancelOpenOrderResponse> =
            cancelOpenOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see cancelOpenOrder */
        @MustBeClosed
        fun cancelOpenOrder(
            params: OrderCancelOpenOrderParams
        ): HttpResponseFor<OrderCancelOpenOrderResponse> =
            cancelOpenOrder(params, RequestOptions.none())

        /** @see cancelOpenOrder */
        @MustBeClosed
        fun cancelOpenOrder(
            params: OrderCancelOpenOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderCancelOpenOrderResponse>

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/orders/{order_id}`, but is
         * otherwise the same as [OrderService.getOrderById].
         */
        @MustBeClosed
        fun getOrderById(
            orderId: String,
            params: OrderGetOrderByIdParams,
        ): HttpResponseFor<OrderGetOrderByIdResponse> =
            getOrderById(orderId, params, RequestOptions.none())

        /** @see getOrderById */
        @MustBeClosed
        fun getOrderById(
            orderId: String,
            params: OrderGetOrderByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderGetOrderByIdResponse> =
            getOrderById(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see getOrderById */
        @MustBeClosed
        fun getOrderById(
            params: OrderGetOrderByIdParams
        ): HttpResponseFor<OrderGetOrderByIdResponse> = getOrderById(params, RequestOptions.none())

        /** @see getOrderById */
        @MustBeClosed
        fun getOrderById(
            params: OrderGetOrderByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderGetOrderByIdResponse>

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/orders`, but is otherwise
         * the same as [OrderService.getOrders].
         */
        @MustBeClosed
        fun getOrders(accountId: Long): HttpResponseFor<OrderGetOrdersResponse> =
            getOrders(accountId, OrderGetOrdersParams.none())

        /** @see getOrders */
        @MustBeClosed
        fun getOrders(
            accountId: Long,
            params: OrderGetOrdersParams = OrderGetOrdersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderGetOrdersResponse> =
            getOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getOrders */
        @MustBeClosed
        fun getOrders(
            accountId: Long,
            params: OrderGetOrdersParams = OrderGetOrdersParams.none(),
        ): HttpResponseFor<OrderGetOrdersResponse> =
            getOrders(accountId, params, RequestOptions.none())

        /** @see getOrders */
        @MustBeClosed
        fun getOrders(
            params: OrderGetOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderGetOrdersResponse>

        /** @see getOrders */
        @MustBeClosed
        fun getOrders(params: OrderGetOrdersParams): HttpResponseFor<OrderGetOrdersResponse> =
            getOrders(params, RequestOptions.none())

        /** @see getOrders */
        @MustBeClosed
        fun getOrders(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrderGetOrdersResponse> =
            getOrders(accountId, OrderGetOrdersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{account_id}/orders/{order_id}`, but
         * is otherwise the same as [OrderService.replaceOrder].
         */
        @MustBeClosed
        fun replaceOrder(
            orderId: String,
            params: OrderReplaceOrderParams,
        ): HttpResponseFor<OrderReplaceOrderResponse> =
            replaceOrder(orderId, params, RequestOptions.none())

        /** @see replaceOrder */
        @MustBeClosed
        fun replaceOrder(
            orderId: String,
            params: OrderReplaceOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderReplaceOrderResponse> =
            replaceOrder(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see replaceOrder */
        @MustBeClosed
        fun replaceOrder(
            params: OrderReplaceOrderParams
        ): HttpResponseFor<OrderReplaceOrderResponse> = replaceOrder(params, RequestOptions.none())

        /** @see replaceOrder */
        @MustBeClosed
        fun replaceOrder(
            params: OrderReplaceOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderReplaceOrderResponse>

        /**
         * Returns a raw HTTP response for `post /v1/accounts/{account_id}/orders`, but is otherwise
         * the same as [OrderService.submitOrders].
         */
        @MustBeClosed
        fun submitOrders(
            accountId: Long,
            params: OrderSubmitOrdersParams,
        ): HttpResponseFor<OrderSubmitOrdersResponse> =
            submitOrders(accountId, params, RequestOptions.none())

        /** @see submitOrders */
        @MustBeClosed
        fun submitOrders(
            accountId: Long,
            params: OrderSubmitOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderSubmitOrdersResponse> =
            submitOrders(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see submitOrders */
        @MustBeClosed
        fun submitOrders(
            params: OrderSubmitOrdersParams
        ): HttpResponseFor<OrderSubmitOrdersResponse> = submitOrders(params, RequestOptions.none())

        /** @see submitOrders */
        @MustBeClosed
        fun submitOrders(
            params: OrderSubmitOrdersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrderSubmitOrdersResponse>
    }
}
