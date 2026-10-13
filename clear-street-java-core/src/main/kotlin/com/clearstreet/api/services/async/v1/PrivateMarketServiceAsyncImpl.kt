// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

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
import com.clearstreet.api.core.prepareAsync
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdResponse
import com.clearstreet.api.services.async.v1.privatemarkets.IoisServiceAsync
import com.clearstreet.api.services.async.v1.privatemarkets.IoisServiceAsyncImpl
import com.clearstreet.api.services.async.v1.privatemarkets.OfferingServiceAsync
import com.clearstreet.api.services.async.v1.privatemarkets.OfferingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
class PrivateMarketServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PrivateMarketServiceAsync {

    private val withRawResponse: PrivateMarketServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val iois: IoisServiceAsync by lazy { IoisServiceAsyncImpl(clientOptions) }

    private val offerings: OfferingServiceAsync by lazy { OfferingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PrivateMarketServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivateMarketServiceAsync =
        PrivateMarketServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    override fun iois(): IoisServiceAsync = iois

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    override fun offerings(): OfferingServiceAsync = offerings

    override fun getCompanyById(
        params: PrivateMarketGetCompanyByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateMarketGetCompanyByIdResponse> =
        // get /v1/private-markets/companies/{company_id}
        withRawResponse().getCompanyById(params, requestOptions).thenApply { it.parse() }

    override fun getSpvById(
        params: PrivateMarketGetSpvByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateMarketGetSpvByIdResponse> =
        // get /v1/private-markets/spvs/{spv_id}
        withRawResponse().getSpvById(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrivateMarketServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val iois: IoisServiceAsync.WithRawResponse by lazy {
            IoisServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val offerings: OfferingServiceAsync.WithRawResponse by lazy {
            OfferingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivateMarketServiceAsync.WithRawResponse =
            PrivateMarketServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        override fun iois(): IoisServiceAsync.WithRawResponse = iois

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        override fun offerings(): OfferingServiceAsync.WithRawResponse = offerings

        private val getCompanyByIdHandler: Handler<PrivateMarketGetCompanyByIdResponse> =
            jsonHandler<PrivateMarketGetCompanyByIdResponse>(clientOptions.jsonMapper)

        override fun getCompanyById(
            params: PrivateMarketGetCompanyByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetCompanyByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("companyId", params.companyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "companies", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCompanyByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSpvByIdHandler: Handler<PrivateMarketGetSpvByIdResponse> =
            jsonHandler<PrivateMarketGetSpvByIdResponse>(clientOptions.jsonMapper)

        override fun getSpvById(
            params: PrivateMarketGetSpvByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetSpvByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spvId", params.spvId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "spvs", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
