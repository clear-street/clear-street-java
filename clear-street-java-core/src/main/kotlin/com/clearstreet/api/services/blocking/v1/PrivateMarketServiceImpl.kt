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
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdResponse
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

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    override fun iois(): IoisService = iois

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    override fun offerings(): OfferingService = offerings

    override fun getCompanyById(
        params: PrivateMarketGetCompanyByIdParams,
        requestOptions: RequestOptions,
    ): PrivateMarketGetCompanyByIdResponse =
        // get /v1/private-markets/companies/{company_id}
        withRawResponse().getCompanyById(params, requestOptions).parse()

    override fun getSpvById(
        params: PrivateMarketGetSpvByIdParams,
        requestOptions: RequestOptions,
    ): PrivateMarketGetSpvByIdResponse =
        // get /v1/private-markets/spvs/{spv_id}
        withRawResponse().getSpvById(params, requestOptions).parse()

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

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        override fun iois(): IoisService.WithRawResponse = iois

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        override fun offerings(): OfferingService.WithRawResponse = offerings

        private val getCompanyByIdHandler: Handler<PrivateMarketGetCompanyByIdResponse> =
            jsonHandler<PrivateMarketGetCompanyByIdResponse>(clientOptions.jsonMapper)

        override fun getCompanyById(
            params: PrivateMarketGetCompanyByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrivateMarketGetCompanyByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "companies", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCompanyByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSpvByIdHandler: Handler<PrivateMarketGetSpvByIdResponse> =
            jsonHandler<PrivateMarketGetSpvByIdResponse>(clientOptions.jsonMapper)

        override fun getSpvById(
            params: PrivateMarketGetSpvByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrivateMarketGetSpvByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spvId", params.spvId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "spvs", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSpvByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
