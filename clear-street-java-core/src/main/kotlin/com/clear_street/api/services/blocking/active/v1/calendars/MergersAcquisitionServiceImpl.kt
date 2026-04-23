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
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarParams
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class MergersAcquisitionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MergersAcquisitionService {

    private val withRawResponse: MergersAcquisitionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MergersAcquisitionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MergersAcquisitionService =
        MergersAcquisitionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getMergersAndAcquisitionsCalendar(
        params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams,
        requestOptions: RequestOptions,
    ): MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse =
        // get /active/v1/calendars/mergers-acquisitions
        withRawResponse().getMergersAndAcquisitionsCalendar(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MergersAcquisitionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MergersAcquisitionService.WithRawResponse =
            MergersAcquisitionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getMergersAndAcquisitionsCalendarHandler:
            Handler<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
            jsonHandler<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>(
                clientOptions.jsonMapper
            )

        override fun getMergersAndAcquisitionsCalendar(
            params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "mergers-acquisitions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getMergersAndAcquisitionsCalendarHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
