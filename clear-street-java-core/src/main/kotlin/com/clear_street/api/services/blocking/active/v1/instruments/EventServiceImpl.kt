// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.checkRequired
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
import com.clear_street.api.models.active.v1.instruments.events.EventGetAllInstrumentEventsParams
import com.clear_street.api.models.active.v1.instruments.events.EventGetAllInstrumentEventsResponse
import com.clear_street.api.models.active.v1.instruments.events.EventGetInstrumentEventsParams
import com.clear_street.api.models.active.v1.instruments.events.EventGetInstrumentEventsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService =
        EventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAllInstrumentEvents(
        params: EventGetAllInstrumentEventsParams,
        requestOptions: RequestOptions,
    ): EventGetAllInstrumentEventsResponse =
        // get /active/v1/instruments/events
        withRawResponse().getAllInstrumentEvents(params, requestOptions).parse()

    override fun getInstrumentEvents(
        params: EventGetInstrumentEventsParams,
        requestOptions: RequestOptions,
    ): EventGetInstrumentEventsResponse =
        // get /active/v1/instruments/{security_id_source}/{security_id}/events
        withRawResponse().getInstrumentEvents(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventService.WithRawResponse =
            EventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAllInstrumentEventsHandler: Handler<EventGetAllInstrumentEventsResponse> =
            jsonHandler<EventGetAllInstrumentEventsResponse>(clientOptions.jsonMapper)

        override fun getAllInstrumentEvents(
            params: EventGetAllInstrumentEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventGetAllInstrumentEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "instruments", "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAllInstrumentEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getInstrumentEventsHandler: Handler<EventGetInstrumentEventsResponse> =
            jsonHandler<EventGetInstrumentEventsResponse>(clientOptions.jsonMapper)

        override fun getInstrumentEvents(
            params: EventGetInstrumentEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventGetInstrumentEventsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("securityId", params.securityId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "instruments",
                        params._pathParam(0),
                        params._pathParam(1),
                        "events",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
