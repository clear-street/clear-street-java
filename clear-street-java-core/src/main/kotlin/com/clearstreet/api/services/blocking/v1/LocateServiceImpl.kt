// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.handlers.jsonHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepare
import com.clearstreet.api.models.v1.locates.LocateGetLocateByIdParams
import com.clearstreet.api.models.v1.locates.LocateGetLocateByIdResponse
import com.clearstreet.api.models.v1.locates.LocateGetLocateRateByIdParams
import com.clearstreet.api.models.v1.locates.LocateGetLocateRateByIdResponse
import com.clearstreet.api.models.v1.locates.LocateGetLocateRatesParams
import com.clearstreet.api.models.v1.locates.LocateGetLocateRatesResponse
import com.clearstreet.api.models.v1.locates.LocateGetLocatesParams
import com.clearstreet.api.models.v1.locates.LocateGetLocatesResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Query locate requests, granted locates, and cached locate borrow rates. */
class LocateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LocateService {

    private val withRawResponse: LocateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LocateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateService =
        LocateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getLocateById(
        params: LocateGetLocateByIdParams,
        requestOptions: RequestOptions,
    ): LocateGetLocateByIdResponse =
        // get /v1/accounts/{account_id}/locates/{id}
        withRawResponse().getLocateById(params, requestOptions).parse()

    override fun getLocateRateById(
        params: LocateGetLocateRateByIdParams,
        requestOptions: RequestOptions,
    ): LocateGetLocateRateByIdResponse =
        // get /v1/locates/rates/{instrument_id}
        withRawResponse().getLocateRateById(params, requestOptions).parse()

    override fun getLocateRates(
        params: LocateGetLocateRatesParams,
        requestOptions: RequestOptions,
    ): LocateGetLocateRatesResponse =
        // get /v1/locates/rates
        withRawResponse().getLocateRates(params, requestOptions).parse()

    override fun getLocates(
        params: LocateGetLocatesParams,
        requestOptions: RequestOptions,
    ): LocateGetLocatesResponse =
        // get /v1/accounts/{account_id}/locates
        withRawResponse().getLocates(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocateService.WithRawResponse =
            LocateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getLocateByIdHandler: Handler<LocateGetLocateByIdResponse> =
            jsonHandler<LocateGetLocateByIdResponse>(clientOptions.jsonMapper)

        override fun getLocateById(
            params: LocateGetLocateByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateGetLocateByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "locates",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLocateByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLocateRateByIdHandler: Handler<LocateGetLocateRateByIdResponse> =
            jsonHandler<LocateGetLocateRateByIdResponse>(clientOptions.jsonMapper)

        override fun getLocateRateById(
            params: LocateGetLocateRateByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateGetLocateRateByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "locates", "rates", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLocateRateByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLocateRatesHandler: Handler<LocateGetLocateRatesResponse> =
            jsonHandler<LocateGetLocateRatesResponse>(clientOptions.jsonMapper)

        override fun getLocateRates(
            params: LocateGetLocateRatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateGetLocateRatesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "locates", "rates")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLocateRatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLocatesHandler: Handler<LocateGetLocatesResponse> =
            jsonHandler<LocateGetLocatesResponse>(clientOptions.jsonMapper)

        override fun getLocates(
            params: LocateGetLocatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateGetLocatesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "locates")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLocatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
