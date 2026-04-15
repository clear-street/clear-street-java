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
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarParams
import com.clear_street.api.models.active.v1.calendars.economic.EconomicGetEconomicCalendarResponse
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class EconomicServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EconomicService {

    private val withRawResponse: EconomicService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EconomicService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EconomicService =
        EconomicServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getEconomicCalendar(
        params: EconomicGetEconomicCalendarParams,
        requestOptions: RequestOptions,
    ): EconomicGetEconomicCalendarResponse =
        // get /active/v1/calendars/economic
        withRawResponse().getEconomicCalendar(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EconomicService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EconomicService.WithRawResponse =
            EconomicServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getEconomicCalendarHandler: Handler<EconomicGetEconomicCalendarResponse> =
            jsonHandler<EconomicGetEconomicCalendarResponse>(clientOptions.jsonMapper)

        override fun getEconomicCalendar(
            params: EconomicGetEconomicCalendarParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EconomicGetEconomicCalendarResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "economic")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEconomicCalendarHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
