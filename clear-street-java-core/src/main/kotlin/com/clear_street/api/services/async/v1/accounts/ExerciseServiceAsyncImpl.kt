// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.accounts

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
import com.clear_street.api.models.v1.accounts.exercises.ExerciseCancelExerciseParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseCancelExerciseResponse
import com.clear_street.api.models.v1.accounts.exercises.ExerciseGetExercisesParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseGetExercisesResponse
import com.clear_street.api.models.v1.accounts.exercises.ExerciseSubmitExercisesParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseSubmitExercisesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
class ExerciseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExerciseServiceAsync {

    private val withRawResponse: ExerciseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExerciseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExerciseServiceAsync =
        ExerciseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelExercise(
        params: ExerciseCancelExerciseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExerciseCancelExerciseResponse> =
        // delete /v1/accounts/{account_id}/exercises/{exercise_id}
        withRawResponse().cancelExercise(params, requestOptions).thenApply { it.parse() }

    override fun getExercises(
        params: ExerciseGetExercisesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExerciseGetExercisesResponse> =
        // get /v1/accounts/{account_id}/exercises
        withRawResponse().getExercises(params, requestOptions).thenApply { it.parse() }

    override fun submitExercises(
        params: ExerciseSubmitExercisesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExerciseSubmitExercisesResponse> =
        // post /v1/accounts/{account_id}/exercises
        withRawResponse().submitExercises(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExerciseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExerciseServiceAsync.WithRawResponse =
            ExerciseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelExerciseHandler: Handler<ExerciseCancelExerciseResponse> =
            jsonHandler<ExerciseCancelExerciseResponse>(clientOptions.jsonMapper)

        override fun cancelExercise(
            params: ExerciseCancelExerciseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExerciseCancelExerciseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exerciseId", params.exerciseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "exercises",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelExerciseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getExercisesHandler: Handler<ExerciseGetExercisesResponse> =
            jsonHandler<ExerciseGetExercisesResponse>(clientOptions.jsonMapper)

        override fun getExercises(
            params: ExerciseGetExercisesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExerciseGetExercisesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "exercises")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getExercisesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitExercisesHandler: Handler<ExerciseSubmitExercisesResponse> =
            jsonHandler<ExerciseSubmitExercisesResponse>(clientOptions.jsonMapper)

        override fun submitExercises(
            params: ExerciseSubmitExercisesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExerciseSubmitExercisesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "exercises")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitExercisesHandler.handle(it) }
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
