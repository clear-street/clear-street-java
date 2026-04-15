// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.omniai

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
import com.clear_street.api.models.active.v1.omniai.runs.RunCancelRunParams
import com.clear_street.api.models.active.v1.omniai.runs.RunCancelRunResponse
import com.clear_street.api.models.active.v1.omniai.runs.RunGetRunParams
import com.clear_street.api.models.active.v1.omniai.runs.RunGetRunResponse
import com.clear_street.api.models.active.v1.omniai.runs.RunStartRunParams
import com.clear_street.api.models.active.v1.omniai.runs.RunStartRunResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** AI assistant for conversational trading interactions. */
class RunServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RunServiceAsync {

    private val withRawResponse: RunServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync =
        RunServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelRun(
        params: RunCancelRunParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunCancelRunResponse> =
        // delete /active/v1/omni-ai/runs/{run_id}
        withRawResponse().cancelRun(params, requestOptions).thenApply { it.parse() }

    override fun getRun(
        params: RunGetRunParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunGetRunResponse> =
        // get /active/v1/omni-ai/runs/{run_id}
        withRawResponse().getRun(params, requestOptions).thenApply { it.parse() }

    override fun startRun(
        params: RunStartRunParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunStartRunResponse> =
        // post /active/v1/omni-ai/runs
        withRawResponse().startRun(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunServiceAsync.WithRawResponse =
            RunServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelRunHandler: Handler<RunCancelRunResponse> =
            jsonHandler<RunCancelRunResponse>(clientOptions.jsonMapper)

        override fun cancelRun(
            params: RunCancelRunParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunCancelRunResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "omni-ai", "runs", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelRunHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getRunHandler: Handler<RunGetRunResponse> =
            jsonHandler<RunGetRunResponse>(clientOptions.jsonMapper)

        override fun getRun(
            params: RunGetRunParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunGetRunResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "omni-ai", "runs", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRunHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startRunHandler: Handler<RunStartRunResponse> =
            jsonHandler<RunStartRunResponse>(clientOptions.jsonMapper)

        override fun startRun(
            params: RunStartRunParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunStartRunResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "omni-ai", "runs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startRunHandler.handle(it) }
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
