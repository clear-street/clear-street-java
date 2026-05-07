// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.accounts

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
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionParams
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionResponse
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionsParams
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionsResponse
import com.clear_street.api.models.v1.accounts.positions.PositionGetPositionsParams
import com.clear_street.api.models.v1.accounts.positions.PositionGetPositionsResponse
import com.clear_street.api.services.async.v1.accounts.positions.InstructionServiceAsync
import com.clear_street.api.services.async.v1.accounts.positions.InstructionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** View account positions. */
class PositionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PositionServiceAsync {

    private val withRawResponse: PositionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val instructions: InstructionServiceAsync by lazy {
        InstructionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PositionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionServiceAsync =
        PositionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
    override fun instructions(): InstructionServiceAsync = instructions

    override fun closePosition(
        params: PositionClosePositionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionClosePositionResponse> =
        // delete /v1/accounts/{account_id}/positions/{instrument_id}
        withRawResponse().closePosition(params, requestOptions).thenApply { it.parse() }

    override fun closePositions(
        params: PositionClosePositionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionClosePositionsResponse> =
        // delete /v1/accounts/{account_id}/positions
        withRawResponse().closePositions(params, requestOptions).thenApply { it.parse() }

    override fun getPositions(
        params: PositionGetPositionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionGetPositionsResponse> =
        // get /v1/accounts/{account_id}/positions
        withRawResponse().getPositions(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PositionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val instructions: InstructionServiceAsync.WithRawResponse by lazy {
            InstructionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PositionServiceAsync.WithRawResponse =
            PositionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
        override fun instructions(): InstructionServiceAsync.WithRawResponse = instructions

        private val closePositionHandler: Handler<PositionClosePositionResponse> =
            jsonHandler<PositionClosePositionResponse>(clientOptions.jsonMapper)

        override fun closePosition(
            params: PositionClosePositionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "positions",
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
                    .addPathSegments("v1", "accounts", params._pathParam(0), "positions")
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
                    .addPathSegments("v1", "accounts", params._pathParam(0), "positions")
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
