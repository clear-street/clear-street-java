// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.handlers.jsonHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepareAsync
import com.clearstreet.api.models.v1.calendar.CalendarGetClockParams
import com.clearstreet.api.models.v1.calendar.CalendarGetClockResponse
import com.clearstreet.api.models.v1.calendar.CalendarGetMarketHoursCalendarParams
import com.clearstreet.api.models.v1.calendar.CalendarGetMarketHoursCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access clocks and financial calendars for market sessions and events. */
class CalendarServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CalendarServiceAsync {

    private val withRawResponse: CalendarServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CalendarServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarServiceAsync =
        CalendarServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getClock(
        params: CalendarGetClockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CalendarGetClockResponse> =
        // get /v1/clock
        withRawResponse().getClock(params, requestOptions).thenApply { it.parse() }

    override fun getMarketHoursCalendar(
        params: CalendarGetMarketHoursCalendarParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CalendarGetMarketHoursCalendarResponse> =
        // get /v1/calendars/market-hours
        withRawResponse().getMarketHoursCalendar(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalendarServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarServiceAsync.WithRawResponse =
            CalendarServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getClockHandler: Handler<CalendarGetClockResponse> =
            jsonHandler<CalendarGetClockResponse>(clientOptions.jsonMapper)

        override fun getClock(
            params: CalendarGetClockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CalendarGetClockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "clock")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getClockHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getMarketHoursCalendarHandler: Handler<CalendarGetMarketHoursCalendarResponse> =
            jsonHandler<CalendarGetMarketHoursCalendarResponse>(clientOptions.jsonMapper)

        override fun getMarketHoursCalendar(
            params: CalendarGetMarketHoursCalendarParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CalendarGetMarketHoursCalendarResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "calendars", "market-hours")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
