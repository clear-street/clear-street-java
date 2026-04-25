// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.marketdata

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
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
import com.clear_street.api.models.active.v1.marketdata.dailysummary.DailySummaryGetDailySummariesParams
import com.clear_street.api.models.active.v1.marketdata.dailysummary.DailySummaryGetDailySummariesResponse
import java.util.function.Consumer

/** Real-time market data snapshots. */
class DailySummaryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DailySummaryService {

    private val withRawResponse: DailySummaryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DailySummaryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DailySummaryService =
        DailySummaryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getDailySummaries(
        params: DailySummaryGetDailySummariesParams,
        requestOptions: RequestOptions,
    ): DailySummaryGetDailySummariesResponse =
        // get /active/v1/market-data/daily-summary
        withRawResponse().getDailySummaries(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DailySummaryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DailySummaryService.WithRawResponse =
            DailySummaryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getDailySummariesHandler: Handler<DailySummaryGetDailySummariesResponse> =
            jsonHandler<DailySummaryGetDailySummariesResponse>(clientOptions.jsonMapper)

        override fun getDailySummaries(
            params: DailySummaryGetDailySummariesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DailySummaryGetDailySummariesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "market-data", "daily-summary")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDailySummariesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
