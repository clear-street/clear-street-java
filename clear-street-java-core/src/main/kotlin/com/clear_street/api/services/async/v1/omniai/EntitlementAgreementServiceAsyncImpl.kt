// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.omniai

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.handlers.jsonHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.v1.omniai.entitlementagreements.EntitlementAgreementListEntitlementAgreementsParams
import com.clear_street.api.models.v1.omniai.entitlementagreements.EntitlementAgreementListEntitlementAgreementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Thread-centric AI assistant for conversational trading. Create threads to start conversations,
 * poll response objects for in-progress output, and read finalized messages from thread history.
 * Thread/message/response endpoints require an explicit account_id. Entitlement endpoints are
 * caller-scoped and use trading_account_ids.
 */
class EntitlementAgreementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : EntitlementAgreementServiceAsync {

    private val withRawResponse: EntitlementAgreementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntitlementAgreementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): EntitlementAgreementServiceAsync =
        EntitlementAgreementServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun listEntitlementAgreements(
        params: EntitlementAgreementListEntitlementAgreementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementAgreementListEntitlementAgreementsResponse> =
        // get /v1/omni-ai/entitlement-agreements
        withRawResponse().listEntitlementAgreements(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntitlementAgreementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementAgreementServiceAsync.WithRawResponse =
            EntitlementAgreementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listEntitlementAgreementsHandler:
            Handler<EntitlementAgreementListEntitlementAgreementsResponse> =
            jsonHandler<EntitlementAgreementListEntitlementAgreementsResponse>(
                clientOptions.jsonMapper
            )

        override fun listEntitlementAgreements(
            params: EntitlementAgreementListEntitlementAgreementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<EntitlementAgreementListEntitlementAgreementsResponse>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "omni-ai", "entitlement-agreements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEntitlementAgreementsHandler.handle(it) }
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
