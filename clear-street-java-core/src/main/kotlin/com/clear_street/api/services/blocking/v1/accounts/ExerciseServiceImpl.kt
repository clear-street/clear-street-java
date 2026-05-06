// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.accounts

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
import com.clear_street.api.models.v1.accounts.exercises.ExerciseCancelExerciseParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseCancelExerciseResponse
import com.clear_street.api.models.v1.accounts.exercises.ExerciseGetExercisesParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseGetExercisesResponse
import com.clear_street.api.models.v1.accounts.exercises.ExerciseSubmitExercisesParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseSubmitExercisesResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
class ExerciseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExerciseService {

    private val withRawResponse: ExerciseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExerciseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExerciseService =
        ExerciseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cancelExercise(
        params: ExerciseCancelExerciseParams,
        requestOptions: RequestOptions,
    ): ExerciseCancelExerciseResponse =
        // delete /v1/accounts/{account_id}/exercises/{exercise_id}
        withRawResponse().cancelExercise(params, requestOptions).parse()

    override fun getExercises(
        params: ExerciseGetExercisesParams,
        requestOptions: RequestOptions,
    ): ExerciseGetExercisesResponse =
        // get /v1/accounts/{account_id}/exercises
        withRawResponse().getExercises(params, requestOptions).parse()

    override fun submitExercises(
        params: ExerciseSubmitExercisesParams,
        requestOptions: RequestOptions,
    ): ExerciseSubmitExercisesResponse =
        // post /v1/accounts/{account_id}/exercises
        withRawResponse().submitExercises(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExerciseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExerciseService.WithRawResponse =
            ExerciseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cancelExerciseHandler: Handler<ExerciseCancelExerciseResponse> =
            jsonHandler<ExerciseCancelExerciseResponse>(clientOptions.jsonMapper)

        override fun cancelExercise(
            params: ExerciseCancelExerciseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExerciseCancelExerciseResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelExerciseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getExercisesHandler: Handler<ExerciseGetExercisesResponse> =
            jsonHandler<ExerciseGetExercisesResponse>(clientOptions.jsonMapper)

        override fun getExercises(
            params: ExerciseGetExercisesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExerciseGetExercisesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "exercises")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getExercisesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val submitExercisesHandler: Handler<ExerciseSubmitExercisesResponse> =
            jsonHandler<ExerciseSubmitExercisesResponse>(clientOptions.jsonMapper)

        override fun submitExercises(
            params: ExerciseSubmitExercisesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExerciseSubmitExercisesResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
