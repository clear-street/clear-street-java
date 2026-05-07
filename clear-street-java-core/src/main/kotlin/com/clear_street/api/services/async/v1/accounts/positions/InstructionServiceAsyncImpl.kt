// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.accounts.positions

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
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionCancelPositionInstructionParams
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionCancelPositionInstructionResponse
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionGetPositionInstructionsParams
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionGetPositionInstructionsResponse
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionSubmitPositionInstructionsParams
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionSubmitPositionInstructionsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
class InstructionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InstructionServiceAsync {

    private val withRawResponse: InstructionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstructionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstructionServiceAsync =
        InstructionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelPositionInstruction(
        params: InstructionCancelPositionInstructionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstructionCancelPositionInstructionResponse> =
        // delete /v1/accounts/{account_id}/positions/instructions/{instruction_id}
        withRawResponse().cancelPositionInstruction(params, requestOptions).thenApply { it.parse() }

    override fun getPositionInstructions(
        params: InstructionGetPositionInstructionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstructionGetPositionInstructionsResponse> =
        // get /v1/accounts/{account_id}/positions/instructions
        withRawResponse().getPositionInstructions(params, requestOptions).thenApply { it.parse() }

    override fun submitPositionInstructions(
        params: InstructionSubmitPositionInstructionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstructionSubmitPositionInstructionsResponse> =
        // post /v1/accounts/{account_id}/positions/instructions
        withRawResponse().submitPositionInstructions(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstructionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstructionServiceAsync.WithRawResponse =
            InstructionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelPositionInstructionHandler:
            Handler<InstructionCancelPositionInstructionResponse> =
            jsonHandler<InstructionCancelPositionInstructionResponse>(clientOptions.jsonMapper)

        override fun cancelPositionInstruction(
            params: InstructionCancelPositionInstructionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstructionCancelPositionInstructionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelPositionInstructionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPositionInstructionsHandler:
            Handler<InstructionGetPositionInstructionsResponse> =
            jsonHandler<InstructionGetPositionInstructionsResponse>(clientOptions.jsonMapper)

        override fun getPositionInstructions(
            params: InstructionGetPositionInstructionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstructionGetPositionInstructionsResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPositionInstructionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitPositionInstructionsHandler:
            Handler<InstructionSubmitPositionInstructionsResponse> =
            jsonHandler<InstructionSubmitPositionInstructionsResponse>(clientOptions.jsonMapper)

        override fun submitPositionInstructions(
            params: InstructionSubmitPositionInstructionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstructionSubmitPositionInstructionsResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
