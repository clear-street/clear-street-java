// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

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
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsParams
import com.clear_street.api.models.active.v1.instruments.incomestatements.IncomeStatementGetInstrumentIncomeStatementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class IncomeStatementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : IncomeStatementServiceAsync {

    private val withRawResponse: IncomeStatementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IncomeStatementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): IncomeStatementServiceAsync =
        IncomeStatementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getInstrumentIncomeStatements(
        params: IncomeStatementGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IncomeStatementGetInstrumentIncomeStatementsResponse> =
        // get /active/v1/instruments/{security_id_source}/{security_id}/income-statements
        withRawResponse().getInstrumentIncomeStatements(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IncomeStatementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IncomeStatementServiceAsync.WithRawResponse =
            IncomeStatementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getInstrumentIncomeStatementsHandler:
            Handler<IncomeStatementGetInstrumentIncomeStatementsResponse> =
            jsonHandler<IncomeStatementGetInstrumentIncomeStatementsResponse>(
                clientOptions.jsonMapper
            )

        override fun getInstrumentIncomeStatements(
            params: IncomeStatementGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<IncomeStatementGetInstrumentIncomeStatementsResponse>
        > {
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
                        "income-statements",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentIncomeStatementsHandler.handle(it) }
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
