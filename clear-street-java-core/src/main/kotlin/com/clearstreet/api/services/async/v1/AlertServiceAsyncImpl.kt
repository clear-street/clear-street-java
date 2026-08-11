// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.handlers.emptyHandler
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.handlers.jsonHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.core.http.json
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepareAsync
import com.clearstreet.api.models.v1.alerts.AlertCreateAlertParams
import com.clearstreet.api.models.v1.alerts.AlertCreateAlertResponse
import com.clearstreet.api.models.v1.alerts.AlertDeleteAlertParams
import com.clearstreet.api.models.v1.alerts.AlertGetAlertByIdParams
import com.clearstreet.api.models.v1.alerts.AlertGetAlertByIdResponse
import com.clearstreet.api.models.v1.alerts.AlertGetAlertsParams
import com.clearstreet.api.models.v1.alerts.AlertGetAlertsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage alerts that watch market and portfolio conditions on an account and notify when
 * they trigger.
 */
class AlertServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertServiceAsync {

    private val withRawResponse: AlertServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertServiceAsync =
        AlertServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAlert(
        params: AlertCreateAlertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertCreateAlertResponse> =
        // post /v1/alerts
        withRawResponse().createAlert(params, requestOptions).thenApply { it.parse() }

    override fun deleteAlert(
        params: AlertDeleteAlertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/alerts/{alert_id}
        withRawResponse().deleteAlert(params, requestOptions).thenAccept {}

    override fun getAlertById(
        params: AlertGetAlertByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertGetAlertByIdResponse> =
        // get /v1/alerts/{alert_id}
        withRawResponse().getAlertById(params, requestOptions).thenApply { it.parse() }

    override fun getAlerts(
        params: AlertGetAlertsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertGetAlertsResponse> =
        // get /v1/alerts
        withRawResponse().getAlerts(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertServiceAsync.WithRawResponse =
            AlertServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createAlertHandler: Handler<AlertCreateAlertResponse> =
            jsonHandler<AlertCreateAlertResponse>(clientOptions.jsonMapper)

        override fun createAlert(
            params: AlertCreateAlertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertCreateAlertResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "alerts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAlertHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAlertHandler: Handler<Void?> = emptyHandler()

        override fun deleteAlert(
            params: AlertDeleteAlertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertId", params.alertId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "alerts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteAlertHandler.handle(it) }
                    }
                }
        }

        private val getAlertByIdHandler: Handler<AlertGetAlertByIdResponse> =
            jsonHandler<AlertGetAlertByIdResponse>(clientOptions.jsonMapper)

        override fun getAlertById(
            params: AlertGetAlertByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertGetAlertByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertId", params.alertId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "alerts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAlertByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getAlertsHandler: Handler<AlertGetAlertsResponse> =
            jsonHandler<AlertGetAlertsResponse>(clientOptions.jsonMapper)

        override fun getAlerts(
            params: AlertGetAlertsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertGetAlertsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "alerts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAlertsHandler.handle(it) }
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
