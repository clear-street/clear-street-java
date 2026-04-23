// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementCreateEntitlementsParams
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementCreateEntitlementsResponse
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementDeleteEntitlementParams
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementDeleteEntitlementResponse
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementListEntitlementsParams
import com.clear_street.api.models.active.v1.omniai.entitlements.EntitlementListEntitlementsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
class EntitlementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EntitlementService {

    private val withRawResponse: EntitlementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntitlementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementService =
        EntitlementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createEntitlements(
        params: EntitlementCreateEntitlementsParams,
        requestOptions: RequestOptions,
    ): EntitlementCreateEntitlementsResponse =
        // post /active/v1/omni-ai/entitlements
        withRawResponse().createEntitlements(params, requestOptions).parse()

    override fun deleteEntitlement(
        params: EntitlementDeleteEntitlementParams,
        requestOptions: RequestOptions,
    ): EntitlementDeleteEntitlementResponse =
        // delete /active/v1/omni-ai/entitlements/{entitlement_id}
        withRawResponse().deleteEntitlement(params, requestOptions).parse()

    override fun listEntitlements(
        params: EntitlementListEntitlementsParams,
        requestOptions: RequestOptions,
    ): EntitlementListEntitlementsResponse =
        // get /active/v1/omni-ai/entitlements
        withRawResponse().listEntitlements(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntitlementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementService.WithRawResponse =
            EntitlementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createEntitlementsHandler: Handler<EntitlementCreateEntitlementsResponse> =
            jsonHandler<EntitlementCreateEntitlementsResponse>(clientOptions.jsonMapper)

        override fun createEntitlements(
            params: EntitlementCreateEntitlementsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementCreateEntitlementsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "omni-ai", "entitlements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEntitlementsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteEntitlementHandler: Handler<EntitlementDeleteEntitlementResponse> =
            jsonHandler<EntitlementDeleteEntitlementResponse>(clientOptions.jsonMapper)

        override fun deleteEntitlement(
            params: EntitlementDeleteEntitlementParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementDeleteEntitlementResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entitlementId", params.entitlementId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "omni-ai",
                        "entitlements",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteEntitlementHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEntitlementsHandler: Handler<EntitlementListEntitlementsResponse> =
            jsonHandler<EntitlementListEntitlementsResponse>(clientOptions.jsonMapper)

        override fun listEntitlements(
            params: EntitlementListEntitlementsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementListEntitlementsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "omni-ai", "entitlements")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
