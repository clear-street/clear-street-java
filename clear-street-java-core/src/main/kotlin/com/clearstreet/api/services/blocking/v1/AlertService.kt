// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Create and manage alerts that watch market and portfolio conditions on an account and notify when
 * they trigger.
 */
interface AlertService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService

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
    fun createAlert(params: AlertCreateAlertParams): AlertCreateAlertResponse =
        createAlert(params, RequestOptions.none())

    /** @see createAlert */
    fun createAlert(
        params: AlertCreateAlertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertCreateAlertResponse

    /**
     * Delete an alert. It stops evaluating and disappears from this API; its trigger history is
     * retained server-side.
     *
     * Only `active` and `paused` alerts can be deleted; `completed` and `expired` alerts are
     * immutable history. Repeating a delete reports 404, matching what GET shows.
     */
    fun deleteAlert(alertId: String) = deleteAlert(alertId, AlertDeleteAlertParams.none())

    /** @see deleteAlert */
    fun deleteAlert(
        alertId: String,
        params: AlertDeleteAlertParams = AlertDeleteAlertParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAlert(params.toBuilder().alertId(alertId).build(), requestOptions)

    /** @see deleteAlert */
    fun deleteAlert(
        alertId: String,
        params: AlertDeleteAlertParams = AlertDeleteAlertParams.none(),
    ) = deleteAlert(alertId, params, RequestOptions.none())

    /** @see deleteAlert */
    fun deleteAlert(
        params: AlertDeleteAlertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteAlert */
    fun deleteAlert(params: AlertDeleteAlertParams) = deleteAlert(params, RequestOptions.none())

    /** @see deleteAlert */
    fun deleteAlert(alertId: String, requestOptions: RequestOptions) =
        deleteAlert(alertId, AlertDeleteAlertParams.none(), requestOptions)

    /** Get one alert by id. */
    fun getAlertById(alertId: String): AlertGetAlertByIdResponse =
        getAlertById(alertId, AlertGetAlertByIdParams.none())

    /** @see getAlertById */
    fun getAlertById(
        alertId: String,
        params: AlertGetAlertByIdParams = AlertGetAlertByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertGetAlertByIdResponse =
        getAlertById(params.toBuilder().alertId(alertId).build(), requestOptions)

    /** @see getAlertById */
    fun getAlertById(
        alertId: String,
        params: AlertGetAlertByIdParams = AlertGetAlertByIdParams.none(),
    ): AlertGetAlertByIdResponse = getAlertById(alertId, params, RequestOptions.none())

    /** @see getAlertById */
    fun getAlertById(
        params: AlertGetAlertByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertGetAlertByIdResponse

    /** @see getAlertById */
    fun getAlertById(params: AlertGetAlertByIdParams): AlertGetAlertByIdResponse =
        getAlertById(params, RequestOptions.none())

    /** @see getAlertById */
    fun getAlertById(alertId: String, requestOptions: RequestOptions): AlertGetAlertByIdResponse =
        getAlertById(alertId, AlertGetAlertByIdParams.none(), requestOptions)

    /**
     * List the caller's alerts, newest first.
     *
     * `status` narrows the result to a comma-separated set of statuses; when absent, alerts of
     * every status are returned. Deleted alerts are never returned.
     */
    fun getAlerts(): AlertGetAlertsResponse = getAlerts(AlertGetAlertsParams.none())

    /** @see getAlerts */
    fun getAlerts(
        params: AlertGetAlertsParams = AlertGetAlertsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertGetAlertsResponse

    /** @see getAlerts */
    fun getAlerts(
        params: AlertGetAlertsParams = AlertGetAlertsParams.none()
    ): AlertGetAlertsResponse = getAlerts(params, RequestOptions.none())

    /** @see getAlerts */
    fun getAlerts(requestOptions: RequestOptions): AlertGetAlertsResponse =
        getAlerts(AlertGetAlertsParams.none(), requestOptions)

    /** A view of [AlertService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/alerts`, but is otherwise the same as
         * [AlertService.createAlert].
         */
        @MustBeClosed
        fun createAlert(params: AlertCreateAlertParams): HttpResponseFor<AlertCreateAlertResponse> =
            createAlert(params, RequestOptions.none())

        /** @see createAlert */
        @MustBeClosed
        fun createAlert(
            params: AlertCreateAlertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertCreateAlertResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/alerts/{alert_id}`, but is otherwise the same
         * as [AlertService.deleteAlert].
         */
        @MustBeClosed
        fun deleteAlert(alertId: String): HttpResponse =
            deleteAlert(alertId, AlertDeleteAlertParams.none())

        /** @see deleteAlert */
        @MustBeClosed
        fun deleteAlert(
            alertId: String,
            params: AlertDeleteAlertParams = AlertDeleteAlertParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteAlert(params.toBuilder().alertId(alertId).build(), requestOptions)

        /** @see deleteAlert */
        @MustBeClosed
        fun deleteAlert(
            alertId: String,
            params: AlertDeleteAlertParams = AlertDeleteAlertParams.none(),
        ): HttpResponse = deleteAlert(alertId, params, RequestOptions.none())

        /** @see deleteAlert */
        @MustBeClosed
        fun deleteAlert(
            params: AlertDeleteAlertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteAlert */
        @MustBeClosed
        fun deleteAlert(params: AlertDeleteAlertParams): HttpResponse =
            deleteAlert(params, RequestOptions.none())

        /** @see deleteAlert */
        @MustBeClosed
        fun deleteAlert(alertId: String, requestOptions: RequestOptions): HttpResponse =
            deleteAlert(alertId, AlertDeleteAlertParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/alerts/{alert_id}`, but is otherwise the same as
         * [AlertService.getAlertById].
         */
        @MustBeClosed
        fun getAlertById(alertId: String): HttpResponseFor<AlertGetAlertByIdResponse> =
            getAlertById(alertId, AlertGetAlertByIdParams.none())

        /** @see getAlertById */
        @MustBeClosed
        fun getAlertById(
            alertId: String,
            params: AlertGetAlertByIdParams = AlertGetAlertByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertGetAlertByIdResponse> =
            getAlertById(params.toBuilder().alertId(alertId).build(), requestOptions)

        /** @see getAlertById */
        @MustBeClosed
        fun getAlertById(
            alertId: String,
            params: AlertGetAlertByIdParams = AlertGetAlertByIdParams.none(),
        ): HttpResponseFor<AlertGetAlertByIdResponse> =
            getAlertById(alertId, params, RequestOptions.none())

        /** @see getAlertById */
        @MustBeClosed
        fun getAlertById(
            params: AlertGetAlertByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertGetAlertByIdResponse>

        /** @see getAlertById */
        @MustBeClosed
        fun getAlertById(
            params: AlertGetAlertByIdParams
        ): HttpResponseFor<AlertGetAlertByIdResponse> = getAlertById(params, RequestOptions.none())

        /** @see getAlertById */
        @MustBeClosed
        fun getAlertById(
            alertId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertGetAlertByIdResponse> =
            getAlertById(alertId, AlertGetAlertByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/alerts`, but is otherwise the same as
         * [AlertService.getAlerts].
         */
        @MustBeClosed
        fun getAlerts(): HttpResponseFor<AlertGetAlertsResponse> =
            getAlerts(AlertGetAlertsParams.none())

        /** @see getAlerts */
        @MustBeClosed
        fun getAlerts(
            params: AlertGetAlertsParams = AlertGetAlertsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertGetAlertsResponse>

        /** @see getAlerts */
        @MustBeClosed
        fun getAlerts(
            params: AlertGetAlertsParams = AlertGetAlertsParams.none()
        ): HttpResponseFor<AlertGetAlertsResponse> = getAlerts(params, RequestOptions.none())

        /** @see getAlerts */
        @MustBeClosed
        fun getAlerts(requestOptions: RequestOptions): HttpResponseFor<AlertGetAlertsResponse> =
            getAlerts(AlertGetAlertsParams.none(), requestOptions)
    }
}
