// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

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
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionResponse
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionsParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionClosePositionsResponse
import com.clear_street.api.models.active.v1.accounts.positions.PositionGetPositionsParams
import com.clear_street.api.models.active.v1.accounts.positions.PositionGetPositionsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** View account positions. */
class PositionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PositionServiceAsync {

    private val withRawResponse: PositionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PositionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionServiceAsync =
        PositionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun closePosition(
        params: PositionClosePositionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionClosePositionResponse> =
        // delete /active/v1/accounts/{account_id}/positions/{security_id_source}/{security_id}
        withRawResponse().closePosition(params, requestOptions).thenApply { it.parse() }

    override fun closePositions(
        params: PositionClosePositionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionClosePositionsResponse> =
        // delete /active/v1/accounts/{account_id}/positions
        withRawResponse().closePositions(params, requestOptions).thenApply { it.parse() }

    override fun getPositions(
        params: PositionGetPositionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionGetPositionsResponse> =
        // get /active/v1/accounts/{account_id}/positions
        withRawResponse().getPositions(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PositionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PositionServiceAsync.WithRawResponse =
            PositionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val closePositionHandler: Handler<PositionClosePositionResponse> =
            jsonHandler<PositionClosePositionResponse>(clientOptions.jsonMapper)

        override fun closePosition(
            params: PositionClosePositionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("securityId", params.securityId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "positions",
                        params._pathParam(1),
                        params._pathParam(2),
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
                            .use { closePositionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val closePositionsHandler: Handler<PositionClosePositionsResponse> =
            jsonHandler<PositionClosePositionsResponse>(clientOptions.jsonMapper)

        override fun closePositions(
            params: PositionClosePositionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "positions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { closePositionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPositionsHandler: Handler<PositionGetPositionsResponse> =
            jsonHandler<PositionGetPositionsResponse>(clientOptions.jsonMapper)

        override fun getPositions(
            params: PositionGetPositionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "positions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPositionsHandler.handle(it) }
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
