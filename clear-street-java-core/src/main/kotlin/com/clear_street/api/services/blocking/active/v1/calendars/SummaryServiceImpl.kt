// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

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
import com.clear_street.api.models.active.v1.calendars.summary.SummaryGetCalendarSummaryParams
import com.clear_street.api.models.active.v1.calendars.summary.SummaryGetCalendarSummaryResponse
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class SummaryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SummaryService {

    private val withRawResponse: SummaryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SummaryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SummaryService =
        SummaryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getCalendarSummary(
        params: SummaryGetCalendarSummaryParams,
        requestOptions: RequestOptions,
    ): SummaryGetCalendarSummaryResponse =
        // get /active/v1/calendars/summary
        withRawResponse().getCalendarSummary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SummaryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SummaryService.WithRawResponse =
            SummaryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getCalendarSummaryHandler: Handler<SummaryGetCalendarSummaryResponse> =
            jsonHandler<SummaryGetCalendarSummaryResponse>(clientOptions.jsonMapper)

        override fun getCalendarSummary(
            params: SummaryGetCalendarSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SummaryGetCalendarSummaryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "summary")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCalendarSummaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
