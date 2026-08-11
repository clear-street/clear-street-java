// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.alerts.AlertCreateAlertParams
import com.clearstreet.api.models.v1.alerts.AlertCreateAlertResponse
import com.clearstreet.api.models.v1.alerts.AlertDeleteAlertParams
import com.clearstreet.api.models.v1.alerts.AlertGetAlertByIdParams
import com.clearstreet.api.models.v1.alerts.AlertGetAlertByIdResponse
import com.clearstreet.api.models.v1.alerts.AlertGetAlertsParams
import com.clearstreet.api.models.v1.alerts.AlertGetAlertsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage alerts that watch market and portfolio conditions on an account and notify when
 * they trigger.
 */
interface AlertServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertServiceAsync

    /**
     * Create an alert that watches a market or portfolio condition on the account and notifies when
     * it triggers.
     *
     * The alert starts evaluating immediately. A `once` alert triggers a single time and then
     * completes. Instrument references in the condition accept a ticker symbol or an OEMS
     * instrument id; they are stored and returned as instrument ids.
     *
     * `account_id` is optional: an alert without one may only watch market conditions, so a
     * condition that reads account data (an `account.*` signal or a holdings scope) is rejected
     * without it.
     */
    fun createAlert(params: AlertCreateAlertParams): CompletableFuture<AlertCreateAlertResponse> =
        createAlert(params, RequestOptions.none())

    /** @see createAlert */
    fun createAlert(
        params: AlertCreateAlertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertCreateAlertResponse>

    /**
     * Delete an alert. It stops evaluating and disappears from this API; its trigger history is
     * retained server-side.
     *
     * Only `active` and `paused` alerts can be deleted; `completed` and `expired` alerts are
     * immutable history. Repeating a delete reports 404, matching what GET shows.
     */
    fun deleteAlert(alertId: String): CompletableFuture<Void?> =
        deleteAlert(alertId, AlertDeleteAlertParams.none())

    /** @see deleteAlert */
    fun deleteAlert(
        alertId: String,
        params: AlertDeleteAlertParams = AlertDeleteAlertParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteAlert(params.toBuilder().alertId(alertId).build(), requestOptions)

    /** @see deleteAlert */
    fun deleteAlert(
        alertId: String,
        params: AlertDeleteAlertParams = AlertDeleteAlertParams.none(),
    ): CompletableFuture<Void?> = deleteAlert(alertId, params, RequestOptions.none())

    /** @see deleteAlert */
    fun deleteAlert(
        params: AlertDeleteAlertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteAlert */
    fun deleteAlert(params: AlertDeleteAlertParams): CompletableFuture<Void?> =
        deleteAlert(params, RequestOptions.none())

    /** @see deleteAlert */
    fun deleteAlert(alertId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteAlert(alertId, AlertDeleteAlertParams.none(), requestOptions)

    /** Get one alert by id. */
    fun getAlertById(alertId: String): CompletableFuture<AlertGetAlertByIdResponse> =
        getAlertById(alertId, AlertGetAlertByIdParams.none())

    /** @see getAlertById */
    fun getAlertById(
        alertId: String,
        params: AlertGetAlertByIdParams = AlertGetAlertByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertGetAlertByIdResponse> =
        getAlertById(params.toBuilder().alertId(alertId).build(), requestOptions)

    /** @see getAlertById */
    fun getAlertById(
        alertId: String,
        params: AlertGetAlertByIdParams = AlertGetAlertByIdParams.none(),
    ): CompletableFuture<AlertGetAlertByIdResponse> =
        getAlertById(alertId, params, RequestOptions.none())

    /** @see getAlertById */
    fun getAlertById(
        params: AlertGetAlertByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertGetAlertByIdResponse>

    /** @see getAlertById */
    fun getAlertById(
        params: AlertGetAlertByIdParams
    ): CompletableFuture<AlertGetAlertByIdResponse> = getAlertById(params, RequestOptions.none())

    /** @see getAlertById */
    fun getAlertById(
        alertId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertGetAlertByIdResponse> =
        getAlertById(alertId, AlertGetAlertByIdParams.none(), requestOptions)

    /**
     * List the caller's alerts, newest first.
     *
     * `status` narrows the result to a comma-separated set of statuses; when absent, alerts of
     * every status are returned. Deleted alerts are never returned.
     */
    fun getAlerts(): CompletableFuture<AlertGetAlertsResponse> =
        getAlerts(AlertGetAlertsParams.none())

    /** @see getAlerts */
    fun getAlerts(
        params: AlertGetAlertsParams = AlertGetAlertsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertGetAlertsResponse>

    /** @see getAlerts */
    fun getAlerts(
        params: AlertGetAlertsParams = AlertGetAlertsParams.none()
    ): CompletableFuture<AlertGetAlertsResponse> = getAlerts(params, RequestOptions.none())

    /** @see getAlerts */
    fun getAlerts(requestOptions: RequestOptions): CompletableFuture<AlertGetAlertsResponse> =
        getAlerts(AlertGetAlertsParams.none(), requestOptions)

    /** A view of [AlertServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/alerts`, but is otherwise the same as
         * [AlertServiceAsync.createAlert].
         */
        fun createAlert(
            params: AlertCreateAlertParams
        ): CompletableFuture<HttpResponseFor<AlertCreateAlertResponse>> =
            createAlert(params, RequestOptions.none())

        /** @see createAlert */
        fun createAlert(
            params: AlertCreateAlertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertCreateAlertResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/alerts/{alert_id}`, but is otherwise the same
         * as [AlertServiceAsync.deleteAlert].
         */
        fun deleteAlert(alertId: String): CompletableFuture<HttpResponse> =
            deleteAlert(alertId, AlertDeleteAlertParams.none())

        /** @see deleteAlert */
        fun deleteAlert(
            alertId: String,
            params: AlertDeleteAlertParams = AlertDeleteAlertParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAlert(params.toBuilder().alertId(alertId).build(), requestOptions)

        /** @see deleteAlert */
        fun deleteAlert(
            alertId: String,
            params: AlertDeleteAlertParams = AlertDeleteAlertParams.none(),
        ): CompletableFuture<HttpResponse> = deleteAlert(alertId, params, RequestOptions.none())

        /** @see deleteAlert */
        fun deleteAlert(
            params: AlertDeleteAlertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteAlert */
        fun deleteAlert(params: AlertDeleteAlertParams): CompletableFuture<HttpResponse> =
            deleteAlert(params, RequestOptions.none())

        /** @see deleteAlert */
        fun deleteAlert(
            alertId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteAlert(alertId, AlertDeleteAlertParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/alerts/{alert_id}`, but is otherwise the same as
         * [AlertServiceAsync.getAlertById].
         */
        fun getAlertById(
            alertId: String
        ): CompletableFuture<HttpResponseFor<AlertGetAlertByIdResponse>> =
            getAlertById(alertId, AlertGetAlertByIdParams.none())

        /** @see getAlertById */
        fun getAlertById(
            alertId: String,
            params: AlertGetAlertByIdParams = AlertGetAlertByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertGetAlertByIdResponse>> =
            getAlertById(params.toBuilder().alertId(alertId).build(), requestOptions)

        /** @see getAlertById */
        fun getAlertById(
            alertId: String,
            params: AlertGetAlertByIdParams = AlertGetAlertByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<AlertGetAlertByIdResponse>> =
            getAlertById(alertId, params, RequestOptions.none())

        /** @see getAlertById */
        fun getAlertById(
            params: AlertGetAlertByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertGetAlertByIdResponse>>

        /** @see getAlertById */
        fun getAlertById(
            params: AlertGetAlertByIdParams
        ): CompletableFuture<HttpResponseFor<AlertGetAlertByIdResponse>> =
            getAlertById(params, RequestOptions.none())

        /** @see getAlertById */
        fun getAlertById(
            alertId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertGetAlertByIdResponse>> =
            getAlertById(alertId, AlertGetAlertByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/alerts`, but is otherwise the same as
         * [AlertServiceAsync.getAlerts].
         */
        fun getAlerts(): CompletableFuture<HttpResponseFor<AlertGetAlertsResponse>> =
            getAlerts(AlertGetAlertsParams.none())

        /** @see getAlerts */
        fun getAlerts(
            params: AlertGetAlertsParams = AlertGetAlertsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertGetAlertsResponse>>

        /** @see getAlerts */
        fun getAlerts(
            params: AlertGetAlertsParams = AlertGetAlertsParams.none()
        ): CompletableFuture<HttpResponseFor<AlertGetAlertsResponse>> =
            getAlerts(params, RequestOptions.none())

        /** @see getAlerts */
        fun getAlerts(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AlertGetAlertsResponse>> =
            getAlerts(AlertGetAlertsParams.none(), requestOptions)
    }
}
