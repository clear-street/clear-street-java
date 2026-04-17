// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris

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
import com.clear_street.api.models.active.v1.iris.runs.RunCancelRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunCancelRunDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.runs.RunGetRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunGetRunDeprecatedResponse
import com.clear_street.api.models.active.v1.iris.runs.RunStartRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunStartRunDeprecatedResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
class RunServiceImpl internal constructor(private val clientOptions: ClientOptions) : RunService {

    private val withRawResponse: RunService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService =
        RunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun cancelRunDeprecated(
        params: RunCancelRunDeprecatedParams,
        requestOptions: RequestOptions,
    ): RunCancelRunDeprecatedResponse =
        // delete /active/v1/iris/runs/{run_id}
        withRawResponse().cancelRunDeprecated(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun getRunDeprecated(
        params: RunGetRunDeprecatedParams,
        requestOptions: RequestOptions,
    ): RunGetRunDeprecatedResponse =
        // get /active/v1/iris/runs/{run_id}
        withRawResponse().getRunDeprecated(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun startRunDeprecated(
        params: RunStartRunDeprecatedParams,
        requestOptions: RequestOptions,
    ): RunStartRunDeprecatedResponse =
        // post /active/v1/iris/runs
        withRawResponse().startRunDeprecated(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunService.WithRawResponse =
            RunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelRunDeprecatedHandler: Handler<RunCancelRunDeprecatedResponse> =
            jsonHandler<RunCancelRunDeprecatedResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun cancelRunDeprecated(
            params: RunCancelRunDeprecatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunCancelRunDeprecatedResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "iris", "runs", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelRunDeprecatedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getRunDeprecatedHandler: Handler<RunGetRunDeprecatedResponse> =
            jsonHandler<RunGetRunDeprecatedResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getRunDeprecated(
            params: RunGetRunDeprecatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunGetRunDeprecatedResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "iris", "runs", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRunDeprecatedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val startRunDeprecatedHandler: Handler<RunStartRunDeprecatedResponse> =
            jsonHandler<RunStartRunDeprecatedResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun startRunDeprecated(
            params: RunStartRunDeprecatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunStartRunDeprecatedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "iris", "runs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { startRunDeprecatedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
