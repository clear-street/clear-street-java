// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.accounts.positions

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionCancelPositionInstructionParams
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionCancelPositionInstructionResponse
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionGetPositionInstructionsParams
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionGetPositionInstructionsResponse
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionSubmitPositionInstructionsParams
import com.clear_street.api.models.v1.accounts.positions.instructions.InstructionSubmitPositionInstructionsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
interface InstructionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstructionServiceAsync

    /**
     * Cancel an outstanding exercise / DNE / CEA instruction by its server- assigned `id`. Returns
     * the updated instruction with status `CANCEL_REQUESTED`; the terminal `CANCELLED` /
     * `CANCEL_FAILED` state arrives asynchronously via subsequent GETs.
     */
    fun cancelPositionInstruction(
        instructionId: String,
        params: InstructionCancelPositionInstructionParams,
    ): CompletableFuture<InstructionCancelPositionInstructionResponse> =
        cancelPositionInstruction(instructionId, params, RequestOptions.none())

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        instructionId: String,
        params: InstructionCancelPositionInstructionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstructionCancelPositionInstructionResponse> =
        cancelPositionInstruction(
            params.toBuilder().instructionId(instructionId).build(),
            requestOptions,
        )

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        params: InstructionCancelPositionInstructionParams
    ): CompletableFuture<InstructionCancelPositionInstructionResponse> =
        cancelPositionInstruction(params, RequestOptions.none())

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        params: InstructionCancelPositionInstructionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstructionCancelPositionInstructionResponse>

    /**
     * Returns the current lifecycle state of exercise / DNE / CEA instructions for the account.
     * Optionally filter by a specific instrument.
     */
    fun getPositionInstructions(
        accountId: Long
    ): CompletableFuture<InstructionGetPositionInstructionsResponse> =
        getPositionInstructions(accountId, InstructionGetPositionInstructionsParams.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        params: InstructionGetPositionInstructionsParams =
            InstructionGetPositionInstructionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstructionGetPositionInstructionsResponse> =
        getPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        params: InstructionGetPositionInstructionsParams =
            InstructionGetPositionInstructionsParams.none(),
    ): CompletableFuture<InstructionGetPositionInstructionsResponse> =
        getPositionInstructions(accountId, params, RequestOptions.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        params: InstructionGetPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstructionGetPositionInstructionsResponse>

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        params: InstructionGetPositionInstructionsParams
    ): CompletableFuture<InstructionGetPositionInstructionsResponse> =
        getPositionInstructions(params, RequestOptions.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstructionGetPositionInstructionsResponse> =
        getPositionInstructions(
            accountId,
            InstructionGetPositionInstructionsParams.none(),
            requestOptions,
        )

    /**
     * Submit one or more option lifecycle instructions against the account. Each row is routed to
     * `oems-csc` independently; per-row rejections are surfaced on the corresponding response entry
     * without failing the batch.
     */
    fun submitPositionInstructions(
        accountId: Long,
        params: InstructionSubmitPositionInstructionsParams,
    ): CompletableFuture<InstructionSubmitPositionInstructionsResponse> =
        submitPositionInstructions(accountId, params, RequestOptions.none())

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        accountId: Long,
        params: InstructionSubmitPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstructionSubmitPositionInstructionsResponse> =
        submitPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        params: InstructionSubmitPositionInstructionsParams
    ): CompletableFuture<InstructionSubmitPositionInstructionsResponse> =
        submitPositionInstructions(params, RequestOptions.none())

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        params: InstructionSubmitPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstructionSubmitPositionInstructionsResponse>

    /**
     * A view of [InstructionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstructionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /v1/accounts/{account_id}/positions/instructions/{instruction_id}`, but is otherwise the
         * same as [InstructionServiceAsync.cancelPositionInstruction].
         */
        fun cancelPositionInstruction(
            instructionId: String,
            params: InstructionCancelPositionInstructionParams,
        ): CompletableFuture<HttpResponseFor<InstructionCancelPositionInstructionResponse>> =
            cancelPositionInstruction(instructionId, params, RequestOptions.none())

        /** @see cancelPositionInstruction */
        fun cancelPositionInstruction(
            instructionId: String,
            params: InstructionCancelPositionInstructionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstructionCancelPositionInstructionResponse>> =
            cancelPositionInstruction(
                params.toBuilder().instructionId(instructionId).build(),
                requestOptions,
            )

        /** @see cancelPositionInstruction */
        fun cancelPositionInstruction(
            params: InstructionCancelPositionInstructionParams
        ): CompletableFuture<HttpResponseFor<InstructionCancelPositionInstructionResponse>> =
            cancelPositionInstruction(params, RequestOptions.none())

        /** @see cancelPositionInstruction */
        fun cancelPositionInstruction(
            params: InstructionCancelPositionInstructionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstructionCancelPositionInstructionResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/positions/instructions`,
         * but is otherwise the same as [InstructionServiceAsync.getPositionInstructions].
         */
        fun getPositionInstructions(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<InstructionGetPositionInstructionsResponse>> =
            getPositionInstructions(accountId, InstructionGetPositionInstructionsParams.none())

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            accountId: Long,
            params: InstructionGetPositionInstructionsParams =
                InstructionGetPositionInstructionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstructionGetPositionInstructionsResponse>> =
            getPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            accountId: Long,
            params: InstructionGetPositionInstructionsParams =
                InstructionGetPositionInstructionsParams.none(),
        ): CompletableFuture<HttpResponseFor<InstructionGetPositionInstructionsResponse>> =
            getPositionInstructions(accountId, params, RequestOptions.none())

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            params: InstructionGetPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstructionGetPositionInstructionsResponse>>

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            params: InstructionGetPositionInstructionsParams
        ): CompletableFuture<HttpResponseFor<InstructionGetPositionInstructionsResponse>> =
            getPositionInstructions(params, RequestOptions.none())

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstructionGetPositionInstructionsResponse>> =
            getPositionInstructions(
                accountId,
                InstructionGetPositionInstructionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/accounts/{account_id}/positions/instructions`,
         * but is otherwise the same as [InstructionServiceAsync.submitPositionInstructions].
         */
        fun submitPositionInstructions(
            accountId: Long,
            params: InstructionSubmitPositionInstructionsParams,
        ): CompletableFuture<HttpResponseFor<InstructionSubmitPositionInstructionsResponse>> =
            submitPositionInstructions(accountId, params, RequestOptions.none())

        /** @see submitPositionInstructions */
        fun submitPositionInstructions(
            accountId: Long,
            params: InstructionSubmitPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstructionSubmitPositionInstructionsResponse>> =
            submitPositionInstructions(
                params.toBuilder().accountId(accountId).build(),
                requestOptions,
            )

        /** @see submitPositionInstructions */
        fun submitPositionInstructions(
            params: InstructionSubmitPositionInstructionsParams
        ): CompletableFuture<HttpResponseFor<InstructionSubmitPositionInstructionsResponse>> =
            submitPositionInstructions(params, RequestOptions.none())

        /** @see submitPositionInstructions */
        fun submitPositionInstructions(
            params: InstructionSubmitPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstructionSubmitPositionInstructionsResponse>>
    }
}
