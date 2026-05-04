// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

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
import com.clear_street.api.models.v1.instruments.balancesheets.BalanceSheetGetInstrumentBalanceSheetStatementsParams
import com.clear_street.api.models.v1.instruments.balancesheets.BalanceSheetGetInstrumentBalanceSheetStatementsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class BalanceSheetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceSheetService {

    private val withRawResponse: BalanceSheetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceSheetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceSheetService =
        BalanceSheetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getInstrumentBalanceSheetStatements(
        params: BalanceSheetGetInstrumentBalanceSheetStatementsParams,
        requestOptions: RequestOptions,
    ): BalanceSheetGetInstrumentBalanceSheetStatementsResponse =
        // get /v1/instruments/{instrument_id}/balance-sheets
        withRawResponse().getInstrumentBalanceSheetStatements(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceSheetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceSheetService.WithRawResponse =
            BalanceSheetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getInstrumentBalanceSheetStatementsHandler:
            Handler<BalanceSheetGetInstrumentBalanceSheetStatementsResponse> =
            jsonHandler<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>(
                clientOptions.jsonMapper
            )

        override fun getInstrumentBalanceSheetStatements(
            params: BalanceSheetGetInstrumentBalanceSheetStatementsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceSheetGetInstrumentBalanceSheetStatementsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "balance-sheets")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentBalanceSheetStatementsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
