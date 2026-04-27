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
import com.clear_street.api.models.active.v1.instruments.balancesheets.BalanceSheetGetInstrumentBalanceSheetStatementsParams
import com.clear_street.api.models.active.v1.instruments.balancesheets.BalanceSheetGetInstrumentBalanceSheetStatementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class BalanceSheetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceSheetServiceAsync {

    private val withRawResponse: BalanceSheetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceSheetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceSheetServiceAsync =
        BalanceSheetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getInstrumentBalanceSheetStatements(
        params: BalanceSheetGetInstrumentBalanceSheetStatementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceSheetGetInstrumentBalanceSheetStatementsResponse> =
        // get /active/v1/instruments/{security_id_source}/{security_id}/balance-sheets
        withRawResponse().getInstrumentBalanceSheetStatements(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceSheetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceSheetServiceAsync.WithRawResponse =
            BalanceSheetServiceAsyncImpl.WithRawResponseImpl(
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
        ): CompletableFuture<
            HttpResponseFor<BalanceSheetGetInstrumentBalanceSheetStatementsResponse>
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
                        "balance-sheets",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
