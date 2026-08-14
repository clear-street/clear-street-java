// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.privatemarkets

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
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingByIdParams
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingByIdResponse
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingsParams
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
class OfferingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OfferingServiceAsync {

    private val withRawResponse: OfferingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OfferingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OfferingServiceAsync =
        OfferingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getOfferingById(
        params: OfferingGetOfferingByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OfferingGetOfferingByIdResponse> =
        // get /v1/private-markets/offerings/{offering_id}
        withRawResponse().getOfferingById(params, requestOptions).thenApply { it.parse() }

    override fun getOfferings(
        params: OfferingGetOfferingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OfferingGetOfferingsResponse> =
        // get /v1/private-markets/offerings
        withRawResponse().getOfferings(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OfferingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OfferingServiceAsync.WithRawResponse =
            OfferingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getOfferingByIdHandler: Handler<OfferingGetOfferingByIdResponse> =
            jsonHandler<OfferingGetOfferingByIdResponse>(clientOptions.jsonMapper)

        override fun getOfferingById(
            params: OfferingGetOfferingByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OfferingGetOfferingByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("offeringId", params.offeringId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "offerings", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getOfferingByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getOfferingsHandler: Handler<OfferingGetOfferingsResponse> =
            jsonHandler<OfferingGetOfferingsResponse>(clientOptions.jsonMapper)

        override fun getOfferings(
            params: OfferingGetOfferingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OfferingGetOfferingsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "private-markets", "offerings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getOfferingsHandler.handle(it) }
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
