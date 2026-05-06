// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.accounts

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
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionParams
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionResponse
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionsParams
import com.clear_street.api.models.v1.accounts.positions.PositionClosePositionsResponse
import com.clear_street.api.models.v1.accounts.positions.PositionGetPositionsParams
import com.clear_street.api.models.v1.accounts.positions.PositionGetPositionsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** View account positions. */
class PositionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PositionService {

    private val withRawResponse: PositionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PositionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionService =
        PositionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun closePosition(
        params: PositionClosePositionParams,
        requestOptions: RequestOptions,
    ): PositionClosePositionResponse =
        // delete /v1/accounts/{account_id}/positions/{instrument_id}
        withRawResponse().closePosition(params, requestOptions).parse()

    override fun closePositions(
        params: PositionClosePositionsParams,
        requestOptions: RequestOptions,
    ): PositionClosePositionsResponse =
        // delete /v1/accounts/{account_id}/positions
        withRawResponse().closePositions(params, requestOptions).parse()

    override fun getPositions(
        params: PositionGetPositionsParams,
        requestOptions: RequestOptions,
    ): PositionGetPositionsResponse =
        // get /v1/accounts/{account_id}/positions
        withRawResponse().getPositions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PositionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PositionService.WithRawResponse =
            PositionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val closePositionHandler: Handler<PositionClosePositionResponse> =
            jsonHandler<PositionClosePositionResponse>(clientOptions.jsonMapper)

        override fun closePosition(
            params: PositionClosePositionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionClosePositionResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { closePositionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val closePositionsHandler: Handler<PositionClosePositionsResponse> =
            jsonHandler<PositionClosePositionsResponse>(clientOptions.jsonMapper)

        override fun closePositions(
            params: PositionClosePositionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionClosePositionsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { closePositionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPositionsHandler: Handler<PositionGetPositionsResponse> =
            jsonHandler<PositionGetPositionsResponse>(clientOptions.jsonMapper)

        override fun getPositions(
            params: PositionGetPositionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionGetPositionsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "positions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
