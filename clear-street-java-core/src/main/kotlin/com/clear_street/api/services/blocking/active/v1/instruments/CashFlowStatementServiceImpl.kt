// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

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
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsParams
import com.clear_street.api.models.active.v1.instruments.cashflowstatements.CashFlowStatementGetInstrumentCashFlowStatementsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class CashFlowStatementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CashFlowStatementService {

    private val withRawResponse: CashFlowStatementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CashFlowStatementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CashFlowStatementService =
        CashFlowStatementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getInstrumentCashFlowStatements(
        params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions,
    ): CashFlowStatementGetInstrumentCashFlowStatementsResponse =
        // get /active/v1/instruments/{security_id_source}/{security_id}/cash-flow-statements
        withRawResponse().getInstrumentCashFlowStatements(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CashFlowStatementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CashFlowStatementService.WithRawResponse =
            CashFlowStatementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getInstrumentCashFlowStatementsHandler:
            Handler<CashFlowStatementGetInstrumentCashFlowStatementsResponse> =
            jsonHandler<CashFlowStatementGetInstrumentCashFlowStatementsResponse>(
                clientOptions.jsonMapper
            )

        override fun getInstrumentCashFlowStatements(
            params: CashFlowStatementGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CashFlowStatementGetInstrumentCashFlowStatementsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("securityId", params.securityId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "instruments",
                        params._pathParam(0),
                        params._pathParam(1),
                        "cash-flow-statements",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentCashFlowStatementsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
