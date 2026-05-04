// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

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
import com.clear_street.api.core.http.json
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementCreateEntitlementsResponse
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementDeleteEntitlementParams
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementDeleteEntitlementResponse
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementListEntitlementsParams
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementListEntitlementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
class EntitlementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EntitlementServiceAsync {

    private val withRawResponse: EntitlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntitlementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementServiceAsync =
        EntitlementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createEntitlements(
        params: EntitlementCreateEntitlementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementCreateEntitlementsResponse> =
        // post /v1/omni-ai/entitlements
        withRawResponse().createEntitlements(params, requestOptions).thenApply { it.parse() }

    override fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementDeleteEntitlementResponse> =
        // delete /v1/omni-ai/entitlements/{entitlement_id}
        withRawResponse().deleteEntitlement(params, requestOptions).thenApply { it.parse() }

    override fun listEntitlements(
        params: EntitlementListEntitlementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementListEntitlementsResponse> =
        // get /v1/omni-ai/entitlements
        withRawResponse().listEntitlements(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntitlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementServiceAsync.WithRawResponse =
            EntitlementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createEntitlementsHandler: Handler<EntitlementCreateEntitlementsResponse> =
            jsonHandler<EntitlementCreateEntitlementsResponse>(clientOptions.jsonMapper)

        override fun createEntitlements(
            params: EntitlementCreateEntitlementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementCreateEntitlementsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "entitlements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createEntitlementsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteEntitlementHandler: Handler<EntitlementDeleteEntitlementResponse> =
            jsonHandler<EntitlementDeleteEntitlementResponse>(clientOptions.jsonMapper)

        override fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementDeleteEntitlementResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entitlementId", params.entitlementId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "entitlements", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteEntitlementHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listEntitlementsHandler: Handler<EntitlementListEntitlementsResponse> =
            jsonHandler<EntitlementListEntitlementsResponse>(clientOptions.jsonMapper)

        override fun listEntitlements(
            params: EntitlementListEntitlementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementListEntitlementsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "entitlements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEntitlementsHandler.handle(it) }
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
