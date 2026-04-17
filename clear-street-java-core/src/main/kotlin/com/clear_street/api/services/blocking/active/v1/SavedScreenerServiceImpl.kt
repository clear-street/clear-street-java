// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.handlers.emptyHandler
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.handlers.jsonHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.core.http.json
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerDeleteScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenerByIdParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenerByIdResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenersParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenersResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class SavedScreenerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SavedScreenerService {

    private val withRawResponse: SavedScreenerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SavedScreenerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SavedScreenerService =
        SavedScreenerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createScreener(
        params: SavedScreenerCreateScreenerParams,
        requestOptions: RequestOptions,
    ): SavedScreenerCreateScreenerResponse =
        // post /active/v1/saved-screeners
        withRawResponse().createScreener(params, requestOptions).parse()

    override fun deleteScreener(
        params: SavedScreenerDeleteScreenerParams,
        requestOptions: RequestOptions,
    ) {
        // delete /active/v1/saved-screeners/{screener_id}
        withRawResponse().deleteScreener(params, requestOptions)
    }

    override fun getScreenerById(
        params: SavedScreenerGetScreenerByIdParams,
        requestOptions: RequestOptions,
    ): SavedScreenerGetScreenerByIdResponse =
        // get /active/v1/saved-screeners/{screener_id}
        withRawResponse().getScreenerById(params, requestOptions).parse()

    override fun getScreeners(
        params: SavedScreenerGetScreenersParams,
        requestOptions: RequestOptions,
    ): SavedScreenerGetScreenersResponse =
        // get /active/v1/saved-screeners
        withRawResponse().getScreeners(params, requestOptions).parse()

    override fun replaceScreener(
        params: SavedScreenerReplaceScreenerParams,
        requestOptions: RequestOptions,
    ): SavedScreenerReplaceScreenerResponse =
        // put /active/v1/saved-screeners/{screener_id}
        withRawResponse().replaceScreener(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SavedScreenerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SavedScreenerService.WithRawResponse =
            SavedScreenerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createScreenerHandler: Handler<SavedScreenerCreateScreenerResponse> =
            jsonHandler<SavedScreenerCreateScreenerResponse>(clientOptions.jsonMapper)

        override fun createScreener(
            params: SavedScreenerCreateScreenerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SavedScreenerCreateScreenerResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners")
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
            params: SavedScreenerDeleteScreenerParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteScreenerHandler.handle(it) }
            }
        }

        private val getScreenerByIdHandler: Handler<SavedScreenerGetScreenerByIdResponse> =
            jsonHandler<SavedScreenerGetScreenerByIdResponse>(clientOptions.jsonMapper)

        override fun getScreenerById(
            params: SavedScreenerGetScreenerByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SavedScreenerGetScreenerByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners", params._pathParam(0))
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

        private val getScreenersHandler: Handler<SavedScreenerGetScreenersResponse> =
            jsonHandler<SavedScreenerGetScreenersResponse>(clientOptions.jsonMapper)

        override fun getScreeners(
            params: SavedScreenerGetScreenersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SavedScreenerGetScreenersResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners")
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

        private val replaceScreenerHandler: Handler<SavedScreenerReplaceScreenerResponse> =
            jsonHandler<SavedScreenerReplaceScreenerResponse>(clientOptions.jsonMapper)

        override fun replaceScreener(
            params: SavedScreenerReplaceScreenerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SavedScreenerReplaceScreenerResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners", params._pathParam(0))
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
    }
}
