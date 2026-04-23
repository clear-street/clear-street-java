// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

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
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateCreateLocateRequestResponse
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateGetLocateRequestsResponse
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestParams
import com.clear_street.api.models.active.v1.accounts.locates.LocateUpdateLocateRequestResponse
import com.clear_street.api.services.blocking.active.v1.accounts.locates.InventoryService
import com.clear_street.api.services.blocking.active.v1.accounts.locates.InventoryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage locate requests for short selling. */
class LocateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LocateService {

    private val withRawResponse: LocateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val inventory: InventoryService by lazy { InventoryServiceImpl(clientOptions) }

    override fun withRawResponse(): LocateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateService =
        LocateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage locate requests for short selling. */
    override fun inventory(): InventoryService = inventory

    override fun createLocateRequest(
        params: LocateCreateLocateRequestParams,
        requestOptions: RequestOptions,
    ): LocateCreateLocateRequestResponse =
        // post /active/v1/accounts/{account_id}/locates
        withRawResponse().createLocateRequest(params, requestOptions).parse()

    override fun getLocateRequests(
        params: LocateGetLocateRequestsParams,
        requestOptions: RequestOptions,
    ): LocateGetLocateRequestsResponse =
        // get /active/v1/accounts/{account_id}/locates
        withRawResponse().getLocateRequests(params, requestOptions).parse()

    override fun updateLocateRequest(
        params: LocateUpdateLocateRequestParams,
        requestOptions: RequestOptions,
    ): LocateUpdateLocateRequestResponse =
        // patch /active/v1/accounts/{account_id}/locates
        withRawResponse().updateLocateRequest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val inventory: InventoryService.WithRawResponse by lazy {
            InventoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocateService.WithRawResponse =
            LocateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage locate requests for short selling. */
        override fun inventory(): InventoryService.WithRawResponse = inventory

        private val createLocateRequestHandler: Handler<LocateCreateLocateRequestResponse> =
            jsonHandler<LocateCreateLocateRequestResponse>(clientOptions.jsonMapper)

        override fun createLocateRequest(
            params: LocateCreateLocateRequestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateCreateLocateRequestResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "locates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createLocateRequestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLocateRequestsHandler: Handler<LocateGetLocateRequestsResponse> =
            jsonHandler<LocateGetLocateRequestsResponse>(clientOptions.jsonMapper)

        override fun getLocateRequests(
            params: LocateGetLocateRequestsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateGetLocateRequestsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "locates")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLocateRequestsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateLocateRequestHandler: Handler<LocateUpdateLocateRequestResponse> =
            jsonHandler<LocateUpdateLocateRequestResponse>(clientOptions.jsonMapper)

        override fun updateLocateRequest(
            params: LocateUpdateLocateRequestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocateUpdateLocateRequestResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "locates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateLocateRequestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
