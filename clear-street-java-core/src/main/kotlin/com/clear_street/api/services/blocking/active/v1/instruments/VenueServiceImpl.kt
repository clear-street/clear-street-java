// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

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
import com.clear_street.api.models.active.v1.instruments.venues.VenueGetVenuesParams
import com.clear_street.api.models.active.v1.instruments.venues.VenueGetVenuesResponse
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
class VenueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VenueService {

    private val withRawResponse: VenueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VenueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VenueService =
        VenueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getVenues(
        params: VenueGetVenuesParams,
        requestOptions: RequestOptions,
    ): VenueGetVenuesResponse =
        // get /active/v1/instruments/venues
        withRawResponse().getVenues(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VenueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VenueService.WithRawResponse =
            VenueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getVenuesHandler: Handler<VenueGetVenuesResponse> =
            jsonHandler<VenueGetVenuesResponse>(clientOptions.jsonMapper)

        override fun getVenues(
            params: VenueGetVenuesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VenueGetVenuesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "instruments", "venues")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getVenuesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
