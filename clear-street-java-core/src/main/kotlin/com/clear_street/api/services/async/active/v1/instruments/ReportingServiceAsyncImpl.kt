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
import com.clear_street.api.models.active.v1.instruments.reporting.ReportingGetInstrumentReportingParams
import com.clear_street.api.models.active.v1.instruments.reporting.ReportingGetInstrumentReportingResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class ReportingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportingServiceAsync {

    private val withRawResponse: ReportingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReportingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingServiceAsync =
        ReportingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getInstrumentReporting(
        params: ReportingGetInstrumentReportingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportingGetInstrumentReportingResponse> =
        // get /active/v1/instruments/{security_id_source}/{security_id}/reporting
        withRawResponse().getInstrumentReporting(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportingServiceAsync.WithRawResponse =
            ReportingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getInstrumentReportingHandler:
            Handler<ReportingGetInstrumentReportingResponse> =
            jsonHandler<ReportingGetInstrumentReportingResponse>(clientOptions.jsonMapper)

        override fun getInstrumentReporting(
            params: ReportingGetInstrumentReportingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportingGetInstrumentReportingResponse>> {
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
                        "reporting",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentReportingHandler.handle(it) }
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
