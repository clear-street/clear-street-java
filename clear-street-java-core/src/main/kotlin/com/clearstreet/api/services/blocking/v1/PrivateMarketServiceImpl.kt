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
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiResponse
import com.clearstreet.api.services.blocking.v1.privatemarkets.IoisService
import com.clearstreet.api.services.blocking.v1.privatemarkets.IoisServiceImpl
import com.clearstreet.api.services.blocking.v1.privatemarkets.OfferingService
import com.clearstreet.api.services.blocking.v1.privatemarkets.OfferingServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
class PrivateMarketServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PrivateMarketService {

    private val withRawResponse: PrivateMarketService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val iois: IoisService by lazy { IoisServiceImpl(clientOptions) }

    private val offerings: OfferingService by lazy { OfferingServiceImpl(clientOptions) }

    override fun withRawResponse(): PrivateMarketService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivateMarketService =
        PrivateMarketServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun iois(): IoisService = iois

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    override fun offerings(): OfferingService = offerings

    override fun createIoi(
        params: PrivateMarketCreateIoiParams,
        requestOptions: RequestOptions,
    ): PrivateMarketCreateIoiResponse =
        // post /v1/private-markets/iois
        withRawResponse().createIoi(params, requestOptions).parse()

    override fun deleteIoi(params: PrivateMarketDeleteIoiParams, requestOptions: RequestOptions) {
        // delete /v1/private-markets/iois/{ioi_id}
        withRawResponse().deleteIoi(params, requestOptions)
    }

    override fun getIois(
        params: PrivateMarketGetIoisParams,
        requestOptions: RequestOptions,
    ): PrivateMarketGetIoisResponse =
        // get /v1/private-markets/iois
        withRawResponse().getIois(params, requestOptions).parse()

    override fun updateIoi(
        params: PrivateMarketUpdateIoiParams,
        requestOptions: RequestOptions,
    ): PrivateMarketUpdateIoiResponse =
        // patch /v1/private-markets/iois/{ioi_id}
        withRawResponse().updateIoi(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrivateMarketService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val iois: IoisService.WithRawResponse by lazy {
            IoisServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val offerings: OfferingService.WithRawResponse by lazy {
            OfferingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivateMarketService.WithRawResponse =
            PrivateMarketServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun iois(): IoisService.WithRawResponse = iois

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        override fun offerings(): OfferingService.WithRawResponse = offerings

        private val createIoiHandler: Handler<PrivateMarketCreateIoiResponse> =
            jsonHandler<PrivateMarketCreateIoiResponse>(clientOptions.jsonMapper)

        override fun createIoi(
            params: PrivateMarketCreateIoiParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrivateMarketCreateIoiResponse> {
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
            params: PrivateMarketDeleteIoiParams,
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

        private val getIoisHandler: Handler<PrivateMarketGetIoisResponse> =
            jsonHandler<PrivateMarketGetIoisResponse>(clientOptions.jsonMapper)

        override fun getIois(
            params: PrivateMarketGetIoisParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrivateMarketGetIoisResponse> {
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

        private val updateIoiHandler: Handler<PrivateMarketUpdateIoiResponse> =
            jsonHandler<PrivateMarketUpdateIoiResponse>(clientOptions.jsonMapper)

        override fun updateIoi(
            params: PrivateMarketUpdateIoiParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrivateMarketUpdateIoiResponse> {
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
