// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.calendars

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
import com.clear_street.api.models.v1.calendars.markethours.MarketHourGetMarketHoursCalendarParams
import com.clear_street.api.models.v1.calendars.markethours.MarketHourGetMarketHoursCalendarResponse
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class MarketHourServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketHourService {

    private val withRawResponse: MarketHourService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketHourService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketHourService =
        MarketHourServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getMarketHoursCalendar(
        params: MarketHourGetMarketHoursCalendarParams,
        requestOptions: RequestOptions,
    ): MarketHourGetMarketHoursCalendarResponse =
        // get /v1/calendars/market-hours
        withRawResponse().getMarketHoursCalendar(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketHourService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketHourService.WithRawResponse =
            MarketHourServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getMarketHoursCalendarHandler:
            Handler<MarketHourGetMarketHoursCalendarResponse> =
            jsonHandler<MarketHourGetMarketHoursCalendarResponse>(clientOptions.jsonMapper)

        override fun getMarketHoursCalendar(
            params: MarketHourGetMarketHoursCalendarParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketHourGetMarketHoursCalendarResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "calendars", "market-hours")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getMarketHoursCalendarHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
