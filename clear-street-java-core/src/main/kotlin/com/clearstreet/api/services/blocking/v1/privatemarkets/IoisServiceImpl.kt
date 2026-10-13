// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.privatemarkets

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
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisCreateIoiResponse
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisGetIoisResponse
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisUpdateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisUpdateIoiResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
class IoisServiceImpl internal constructor(private val clientOptions: ClientOptions) : IoisService {

    private val withRawResponse: IoisService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IoisService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IoisService =
        IoisServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createIoi(
        params: IoisCreateIoiParams,
        requestOptions: RequestOptions,
    ): IoisCreateIoiResponse =
        // post /v1/private-markets/iois
        withRawResponse().createIoi(params, requestOptions).parse()

    override fun deleteIoi(params: IoisDeleteIoiParams, requestOptions: RequestOptions) {
        // delete /v1/private-markets/iois/{ioi_id}
        withRawResponse().deleteIoi(params, requestOptions)
    }

    override fun getIois(
        params: IoisGetIoisParams,
        requestOptions: RequestOptions,
    ): IoisGetIoisResponse =
        // get /v1/private-markets/iois
        withRawResponse().getIois(params, requestOptions).parse()

    override fun updateIoi(
        params: IoisUpdateIoiParams,
        requestOptions: RequestOptions,
    ): IoisUpdateIoiResponse =
        // patch /v1/private-markets/iois/{ioi_id}
        withRawResponse().updateIoi(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IoisService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IoisService.WithRawResponse =
            IoisServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createIoiHandler: Handler<IoisCreateIoiResponse> =
            jsonHandler<IoisCreateIoiResponse>(clientOptions.jsonMapper)

        override fun createIoi(
            params: IoisCreateIoiParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IoisCreateIoiResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "iois")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createIoiHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteIoiHandler: Handler<Void?> = emptyHandler()

        override fun deleteIoi(
            params: IoisDeleteIoiParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ioiId", params.ioiId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "iois", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteIoiHandler.handle(it) }
            }
        }

        private val getIoisHandler: Handler<IoisGetIoisResponse> =
            jsonHandler<IoisGetIoisResponse>(clientOptions.jsonMapper)

        override fun getIois(
            params: IoisGetIoisParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IoisGetIoisResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "iois")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getIoisHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateIoiHandler: Handler<IoisUpdateIoiResponse> =
            jsonHandler<IoisUpdateIoiResponse>(clientOptions.jsonMapper)

        override fun updateIoi(
            params: IoisUpdateIoiParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IoisUpdateIoiResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ioiId", params.ioiId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "iois", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateIoiHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
