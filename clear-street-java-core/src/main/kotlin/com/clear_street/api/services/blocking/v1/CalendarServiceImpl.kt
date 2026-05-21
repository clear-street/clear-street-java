// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.clear_street.api.models.v1.calendar.CalendarGetClockParams
import com.clear_street.api.models.v1.calendar.CalendarGetClockResponse
import com.clear_street.api.models.v1.calendar.CalendarGetMarketHoursCalendarParams
import com.clear_street.api.models.v1.calendar.CalendarGetMarketHoursCalendarResponse
import java.util.function.Consumer

/** Access clocks and financial calendars for market sessions and events. */
class CalendarServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CalendarService {

    private val withRawResponse: CalendarService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CalendarService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService =
        CalendarServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getClock(
        params: CalendarGetClockParams,
        requestOptions: RequestOptions,
    ): CalendarGetClockResponse =
        // get /v1/clock
        withRawResponse().getClock(params, requestOptions).parse()

    override fun getMarketHoursCalendar(
        params: CalendarGetMarketHoursCalendarParams,
        requestOptions: RequestOptions,
    ): CalendarGetMarketHoursCalendarResponse =
        // get /v1/calendars/market-hours
        withRawResponse().getMarketHoursCalendar(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalendarService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarService.WithRawResponse =
            CalendarServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getClockHandler: Handler<CalendarGetClockResponse> =
            jsonHandler<CalendarGetClockResponse>(clientOptions.jsonMapper)

        override fun getClock(
            params: CalendarGetClockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarGetClockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "clock")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getClockHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getMarketHoursCalendarHandler: Handler<CalendarGetMarketHoursCalendarResponse> =
            jsonHandler<CalendarGetMarketHoursCalendarResponse>(clientOptions.jsonMapper)

        override fun getMarketHoursCalendar(
            params: CalendarGetMarketHoursCalendarParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarGetMarketHoursCalendarResponse> {
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
