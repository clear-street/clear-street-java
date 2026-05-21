// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.clear_street.api.models.v1.positions.PositionCancelPositionInstructionParams
import com.clear_street.api.models.v1.positions.PositionCancelPositionInstructionResponse
import com.clear_street.api.models.v1.positions.PositionClosePositionParams
import com.clear_street.api.models.v1.positions.PositionClosePositionResponse
import com.clear_street.api.models.v1.positions.PositionClosePositionsParams
import com.clear_street.api.models.v1.positions.PositionClosePositionsResponse
import com.clear_street.api.models.v1.positions.PositionGetPositionInstructionsParams
import com.clear_street.api.models.v1.positions.PositionGetPositionInstructionsResponse
import com.clear_street.api.models.v1.positions.PositionGetPositionsParams
import com.clear_street.api.models.v1.positions.PositionGetPositionsResponse
import com.clear_street.api.models.v1.positions.PositionSubmitPositionInstructionsParams
import com.clear_street.api.models.v1.positions.PositionSubmitPositionInstructionsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** View positions and manage position instructions. */
class PositionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PositionService {

    private val withRawResponse: PositionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PositionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionService =
        PositionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelPositionInstruction(
        params: PositionCancelPositionInstructionParams,
        requestOptions: RequestOptions,
    ): PositionCancelPositionInstructionResponse =
        // delete /v1/accounts/{account_id}/positions/instructions/{instruction_id}
        withRawResponse().cancelPositionInstruction(params, requestOptions).parse()

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

    override fun getPositionInstructions(
        params: PositionGetPositionInstructionsParams,
        requestOptions: RequestOptions,
    ): PositionGetPositionInstructionsResponse =
        // get /v1/accounts/{account_id}/positions/instructions
        withRawResponse().getPositionInstructions(params, requestOptions).parse()

    override fun getPositions(
        params: PositionGetPositionsParams,
        requestOptions: RequestOptions,
    ): PositionGetPositionsResponse =
        // get /v1/accounts/{account_id}/positions
        withRawResponse().getPositions(params, requestOptions).parse()

    override fun submitPositionInstructions(
        params: PositionSubmitPositionInstructionsParams,
        requestOptions: RequestOptions,
    ): PositionSubmitPositionInstructionsResponse =
        // post /v1/accounts/{account_id}/positions/instructions
        withRawResponse().submitPositionInstructions(params, requestOptions).parse()

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

        private val cancelPositionInstructionHandler:
            Handler<PositionCancelPositionInstructionResponse> =
            jsonHandler<PositionCancelPositionInstructionResponse>(clientOptions.jsonMapper)

        override fun cancelPositionInstruction(
            params: PositionCancelPositionInstructionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionCancelPositionInstructionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instructionId", params.instructionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "positions",
                        "instructions",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelPositionInstructionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

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

        private val getPositionInstructionsHandler:
            Handler<PositionGetPositionInstructionsResponse> =
            jsonHandler<PositionGetPositionInstructionsResponse>(clientOptions.jsonMapper)

        override fun getPositionInstructions(
            params: PositionGetPositionInstructionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionGetPositionInstructionsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "positions",
                        "instructions",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPositionInstructionsHandler.handle(it) }
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

        private val submitPositionInstructionsHandler:
            Handler<PositionSubmitPositionInstructionsResponse> =
            jsonHandler<PositionSubmitPositionInstructionsResponse>(clientOptions.jsonMapper)

        override fun submitPositionInstructions(
            params: PositionSubmitPositionInstructionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionSubmitPositionInstructionsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "positions",
                        "instructions",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitPositionInstructionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
