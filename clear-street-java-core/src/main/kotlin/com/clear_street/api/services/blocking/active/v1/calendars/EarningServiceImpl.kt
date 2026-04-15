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
import com.clear_street.api.models.active.v1.calendars.earnings.EarningGetEarningsCalendarParams
import com.clear_street.api.models.active.v1.calendars.earnings.EarningGetEarningsCalendarResponse
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class EarningServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EarningService {

    private val withRawResponse: EarningService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EarningService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EarningService =
        EarningServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getEarningsCalendar(
        params: EarningGetEarningsCalendarParams,
        requestOptions: RequestOptions,
    ): EarningGetEarningsCalendarResponse =
        // get /active/v1/calendars/earnings
        withRawResponse().getEarningsCalendar(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EarningService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EarningService.WithRawResponse =
            EarningServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getEarningsCalendarHandler: Handler<EarningGetEarningsCalendarResponse> =
            jsonHandler<EarningGetEarningsCalendarResponse>(clientOptions.jsonMapper)

        override fun getEarningsCalendar(
            params: EarningGetEarningsCalendarParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EarningGetEarningsCalendarResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "earnings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEarningsCalendarHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
