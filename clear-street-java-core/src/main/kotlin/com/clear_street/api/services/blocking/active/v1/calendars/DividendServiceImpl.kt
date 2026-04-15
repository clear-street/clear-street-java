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
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarParams
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarResponse
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class DividendServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DividendService {

    private val withRawResponse: DividendService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DividendService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DividendService =
        DividendServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getDividendsCalendar(
        params: DividendGetDividendsCalendarParams,
        requestOptions: RequestOptions,
    ): DividendGetDividendsCalendarResponse =
        // get /active/v1/calendars/dividends
        withRawResponse().getDividendsCalendar(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DividendService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DividendService.WithRawResponse =
            DividendServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getDividendsCalendarHandler: Handler<DividendGetDividendsCalendarResponse> =
            jsonHandler<DividendGetDividendsCalendarResponse>(clientOptions.jsonMapper)

        override fun getDividendsCalendar(
            params: DividendGetDividendsCalendarParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DividendGetDividendsCalendarResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "dividends")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDividendsCalendarHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
