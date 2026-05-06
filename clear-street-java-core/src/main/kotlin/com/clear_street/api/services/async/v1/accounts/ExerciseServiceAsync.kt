// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.accounts.exercises.ExerciseCancelExerciseParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseCancelExerciseResponse
import com.clear_street.api.models.v1.accounts.exercises.ExerciseGetExercisesParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseGetExercisesResponse
import com.clear_street.api.models.v1.accounts.exercises.ExerciseSubmitExercisesParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseSubmitExercisesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
interface ExerciseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExerciseServiceAsync

    /**
     * Cancel an outstanding exercise / DNE / CEA instruction by its server- assigned `id`. Returns
     * the updated instruction with status `CANCEL_REQUESTED`; the terminal `CANCELLED` /
     * `CANCEL_FAILED` state arrives asynchronously via subsequent GETs.
     */
    fun cancelExercise(
        exerciseId: String,
        params: ExerciseCancelExerciseParams,
    ): CompletableFuture<ExerciseCancelExerciseResponse> =
        cancelExercise(exerciseId, params, RequestOptions.none())

    /** @see cancelExercise */
    fun cancelExercise(
        exerciseId: String,
        params: ExerciseCancelExerciseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExerciseCancelExerciseResponse> =
        cancelExercise(params.toBuilder().exerciseId(exerciseId).build(), requestOptions)

    /** @see cancelExercise */
    fun cancelExercise(
        params: ExerciseCancelExerciseParams
    ): CompletableFuture<ExerciseCancelExerciseResponse> =
        cancelExercise(params, RequestOptions.none())

    /** @see cancelExercise */
    fun cancelExercise(
        params: ExerciseCancelExerciseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExerciseCancelExerciseResponse>

    /**
     * Returns the current lifecycle state of exercise / DNE / CEA instructions for the account.
     * Optionally filter by a specific instrument.
     */
    fun getExercises(accountId: Long): CompletableFuture<ExerciseGetExercisesResponse> =
        getExercises(accountId, ExerciseGetExercisesParams.none())

    /** @see getExercises */
    fun getExercises(
        accountId: Long,
        params: ExerciseGetExercisesParams = ExerciseGetExercisesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExerciseGetExercisesResponse> =
        getExercises(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getExercises */
    fun getExercises(
        accountId: Long,
        params: ExerciseGetExercisesParams = ExerciseGetExercisesParams.none(),
    ): CompletableFuture<ExerciseGetExercisesResponse> =
        getExercises(accountId, params, RequestOptions.none())

    /** @see getExercises */
    fun getExercises(
        params: ExerciseGetExercisesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExerciseGetExercisesResponse>

    /** @see getExercises */
    fun getExercises(
        params: ExerciseGetExercisesParams
    ): CompletableFuture<ExerciseGetExercisesResponse> = getExercises(params, RequestOptions.none())

    /** @see getExercises */
    fun getExercises(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExerciseGetExercisesResponse> =
        getExercises(accountId, ExerciseGetExercisesParams.none(), requestOptions)

    /**
     * Submit one or more option lifecycle instructions against the account. Each row is routed to
     * `oems-csc` independently; per-row rejections are surfaced on the corresponding response entry
     * without failing the batch.
     */
    fun submitExercises(
        accountId: Long,
        params: ExerciseSubmitExercisesParams,
    ): CompletableFuture<ExerciseSubmitExercisesResponse> =
        submitExercises(accountId, params, RequestOptions.none())

    /** @see submitExercises */
    fun submitExercises(
        accountId: Long,
        params: ExerciseSubmitExercisesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExerciseSubmitExercisesResponse> =
        submitExercises(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see submitExercises */
    fun submitExercises(
        params: ExerciseSubmitExercisesParams
    ): CompletableFuture<ExerciseSubmitExercisesResponse> =
        submitExercises(params, RequestOptions.none())

    /** @see submitExercises */
    fun submitExercises(
        params: ExerciseSubmitExercisesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExerciseSubmitExercisesResponse>

    /**
     * A view of [ExerciseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExerciseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /v1/accounts/{account_id}/exercises/{exercise_id}`, but is otherwise the same as
         * [ExerciseServiceAsync.cancelExercise].
         */
        fun cancelExercise(
            exerciseId: String,
            params: ExerciseCancelExerciseParams,
        ): CompletableFuture<HttpResponseFor<ExerciseCancelExerciseResponse>> =
            cancelExercise(exerciseId, params, RequestOptions.none())

        /** @see cancelExercise */
        fun cancelExercise(
            exerciseId: String,
            params: ExerciseCancelExerciseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExerciseCancelExerciseResponse>> =
            cancelExercise(params.toBuilder().exerciseId(exerciseId).build(), requestOptions)

        /** @see cancelExercise */
        fun cancelExercise(
            params: ExerciseCancelExerciseParams
        ): CompletableFuture<HttpResponseFor<ExerciseCancelExerciseResponse>> =
            cancelExercise(params, RequestOptions.none())

        /** @see cancelExercise */
        fun cancelExercise(
            params: ExerciseCancelExerciseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExerciseCancelExerciseResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/exercises`, but is
         * otherwise the same as [ExerciseServiceAsync.getExercises].
         */
        fun getExercises(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<ExerciseGetExercisesResponse>> =
            getExercises(accountId, ExerciseGetExercisesParams.none())

        /** @see getExercises */
        fun getExercises(
            accountId: Long,
            params: ExerciseGetExercisesParams = ExerciseGetExercisesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExerciseGetExercisesResponse>> =
            getExercises(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getExercises */
        fun getExercises(
            accountId: Long,
            params: ExerciseGetExercisesParams = ExerciseGetExercisesParams.none(),
        ): CompletableFuture<HttpResponseFor<ExerciseGetExercisesResponse>> =
            getExercises(accountId, params, RequestOptions.none())

        /** @see getExercises */
        fun getExercises(
            params: ExerciseGetExercisesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExerciseGetExercisesResponse>>

        /** @see getExercises */
        fun getExercises(
            params: ExerciseGetExercisesParams
        ): CompletableFuture<HttpResponseFor<ExerciseGetExercisesResponse>> =
            getExercises(params, RequestOptions.none())

        /** @see getExercises */
        fun getExercises(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExerciseGetExercisesResponse>> =
            getExercises(accountId, ExerciseGetExercisesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/accounts/{account_id}/exercises`, but is
         * otherwise the same as [ExerciseServiceAsync.submitExercises].
         */
        fun submitExercises(
            accountId: Long,
            params: ExerciseSubmitExercisesParams,
        ): CompletableFuture<HttpResponseFor<ExerciseSubmitExercisesResponse>> =
            submitExercises(accountId, params, RequestOptions.none())

        /** @see submitExercises */
        fun submitExercises(
            accountId: Long,
            params: ExerciseSubmitExercisesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExerciseSubmitExercisesResponse>> =
            submitExercises(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see submitExercises */
        fun submitExercises(
            params: ExerciseSubmitExercisesParams
        ): CompletableFuture<HttpResponseFor<ExerciseSubmitExercisesResponse>> =
            submitExercises(params, RequestOptions.none())

        /** @see submitExercises */
        fun submitExercises(
            params: ExerciseSubmitExercisesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExerciseSubmitExercisesResponse>>
    }
}
