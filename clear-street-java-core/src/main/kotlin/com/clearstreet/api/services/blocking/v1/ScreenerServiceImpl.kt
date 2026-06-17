// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.handlers.emptyHandler
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.handlers.jsonHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.core.http.json
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepare
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerDeleteScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerByIdParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerByIdResponse
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenersParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenersResponse
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Search instruments and manage saved screeners. */
class ScreenerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScreenerService {

    private val withRawResponse: ScreenerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScreenerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerService =
        ScreenerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createScreener(
        params: ScreenerCreateScreenerParams,
        requestOptions: RequestOptions,
    ): ScreenerCreateScreenerResponse =
        // post /v1/saved-screeners
        withRawResponse().createScreener(params, requestOptions).parse()

    override fun deleteScreener(
        params: ScreenerDeleteScreenerParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/saved-screeners/{screener_id}
        withRawResponse().deleteScreener(params, requestOptions)
    }

    override fun getScreenerById(
        params: ScreenerGetScreenerByIdParams,
        requestOptions: RequestOptions,
    ): ScreenerGetScreenerByIdResponse =
        // get /v1/saved-screeners/{screener_id}
        withRawResponse().getScreenerById(params, requestOptions).parse()

    override fun getScreeners(
        params: ScreenerGetScreenersParams,
        requestOptions: RequestOptions,
    ): ScreenerGetScreenersResponse =
        // get /v1/saved-screeners
        withRawResponse().getScreeners(params, requestOptions).parse()

    override fun replaceScreener(
        params: ScreenerReplaceScreenerParams,
        requestOptions: RequestOptions,
    ): ScreenerReplaceScreenerResponse =
        // put /v1/saved-screeners/{screener_id}
        withRawResponse().replaceScreener(params, requestOptions).parse()

    override fun searchScreener(
        params: ScreenerSearchScreenerParams,
        requestOptions: RequestOptions,
    ): ScreenerSearchScreenerResponse =
        // post /v1/screener
        withRawResponse().searchScreener(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScreenerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScreenerService.WithRawResponse =
            ScreenerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createScreenerHandler: Handler<ScreenerCreateScreenerResponse> =
            jsonHandler<ScreenerCreateScreenerResponse>(clientOptions.jsonMapper)

        override fun createScreener(
            params: ScreenerCreateScreenerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScreenerCreateScreenerResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createScreenerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteScreenerHandler: Handler<Void?> = emptyHandler()

        override fun deleteScreener(
            params: ScreenerDeleteScreenerParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteScreenerHandler.handle(it) }
            }
        }

        private val getScreenerByIdHandler: Handler<ScreenerGetScreenerByIdResponse> =
            jsonHandler<ScreenerGetScreenerByIdResponse>(clientOptions.jsonMapper)

        override fun getScreenerById(
            params: ScreenerGetScreenerByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScreenerGetScreenerByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getScreenerByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getScreenersHandler: Handler<ScreenerGetScreenersResponse> =
            jsonHandler<ScreenerGetScreenersResponse>(clientOptions.jsonMapper)

        override fun getScreeners(
            params: ScreenerGetScreenersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScreenerGetScreenersResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getScreenersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceScreenerHandler: Handler<ScreenerReplaceScreenerResponse> =
            jsonHandler<ScreenerReplaceScreenerResponse>(clientOptions.jsonMapper)

        override fun replaceScreener(
            params: ScreenerReplaceScreenerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScreenerReplaceScreenerResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceScreenerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchScreenerHandler: Handler<ScreenerSearchScreenerResponse> =
            jsonHandler<ScreenerSearchScreenerResponse>(clientOptions.jsonMapper)

        override fun searchScreener(
            params: ScreenerSearchScreenerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScreenerSearchScreenerResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "screener")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchScreenerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
