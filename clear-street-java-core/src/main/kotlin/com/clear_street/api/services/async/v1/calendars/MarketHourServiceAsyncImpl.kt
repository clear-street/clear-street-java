// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.calendars

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
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.v1.calendars.markethours.MarketHourGetMarketHoursCalendarParams
import com.clear_street.api.models.v1.calendars.markethours.MarketHourGetMarketHoursCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class MarketHourServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketHourServiceAsync {

    private val withRawResponse: MarketHourServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketHourServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketHourServiceAsync =
        MarketHourServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getMarketHoursCalendar(
        params: MarketHourGetMarketHoursCalendarParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketHourGetMarketHoursCalendarResponse> =
        // get /v1/calendars/market-hours
        withRawResponse().getMarketHoursCalendar(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketHourServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketHourServiceAsync.WithRawResponse =
            MarketHourServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getMarketHoursCalendarHandler:
            Handler<MarketHourGetMarketHoursCalendarResponse> =
            jsonHandler<MarketHourGetMarketHoursCalendarResponse>(clientOptions.jsonMapper)

        override fun getMarketHoursCalendar(
            params: MarketHourGetMarketHoursCalendarParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketHourGetMarketHoursCalendarResponse>> {
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
