// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

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
import com.clearstreet.api.core.prepareAsync
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiResponse
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

    override fun iois(): IoisServiceAsync = iois

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    override fun offerings(): OfferingServiceAsync = offerings

    override fun createIoi(
        params: PrivateMarketCreateIoiParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateMarketCreateIoiResponse> =
        // post /v1/private-markets/iois
        withRawResponse().createIoi(params, requestOptions).thenApply { it.parse() }

    override fun deleteIoi(
        params: PrivateMarketDeleteIoiParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/private-markets/iois/{ioi_id}
        withRawResponse().deleteIoi(params, requestOptions).thenAccept {}

    override fun getIois(
        params: PrivateMarketGetIoisParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateMarketGetIoisResponse> =
        // get /v1/private-markets/iois
        withRawResponse().getIois(params, requestOptions).thenApply { it.parse() }

    override fun updateIoi(
        params: PrivateMarketUpdateIoiParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateMarketUpdateIoiResponse> =
        // patch /v1/private-markets/iois/{ioi_id}
        withRawResponse().updateIoi(params, requestOptions).thenApply { it.parse() }

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

        override fun iois(): IoisServiceAsync.WithRawResponse = iois

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        override fun offerings(): OfferingServiceAsync.WithRawResponse = offerings

        private val createIoiHandler: Handler<PrivateMarketCreateIoiResponse> =
            jsonHandler<PrivateMarketCreateIoiResponse>(clientOptions.jsonMapper)

        override fun createIoi(
            params: PrivateMarketCreateIoiParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateMarketCreateIoiResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "iois")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createIoiHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteIoiHandler: Handler<Void?> = emptyHandler()

        override fun deleteIoi(
            params: PrivateMarketDeleteIoiParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteIoiHandler.handle(it) }
                    }
                }
        }

        private val getIoisHandler: Handler<PrivateMarketGetIoisResponse> =
            jsonHandler<PrivateMarketGetIoisResponse>(clientOptions.jsonMapper)

        override fun getIois(
            params: PrivateMarketGetIoisParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetIoisResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "iois")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getIoisHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateIoiHandler: Handler<PrivateMarketUpdateIoiResponse> =
            jsonHandler<PrivateMarketUpdateIoiResponse>(clientOptions.jsonMapper)

        override fun updateIoi(
            params: PrivateMarketUpdateIoiParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateMarketUpdateIoiResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
