// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.positions.PositionCancelPositionInstructionParams
import com.clear_street.api.models.v1.positions.PositionCancelPositionInstructionResponse
import com.clear_street.api.models.v1.positions.PositionClosePositionParams
import com.clear_street.api.models.v1.positions.PositionClosePositionResponse
import com.clear_street.api.models.v1.positions.PositionClosePositionsParams
import com.clear_street.api.models.v1.positions.PositionClosePositionsResponse
import com.clear_street.api.models.v1.positions.PositionGetPositionInstructionsParams
import com.clear_street.api.models.v1.positions.PositionGetPositionInstructionsResponse
import com.clear_street.api.models.v1.positions.PositionGetPositionsParams
import com.clear_street.api.models.v1.positions.PositionGetPositionsResponse
import com.clear_street.api.models.v1.positions.PositionSubmitPositionInstructionsParams
import com.clear_street.api.models.v1.positions.PositionSubmitPositionInstructionsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** View positions and manage position instructions. */
interface PositionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionServiceAsync

    /**
     * Cancel an outstanding exercise / DNE / CEA instruction by its server- assigned `id`. Returns
     * the updated instruction with status `CANCEL_REQUESTED`; the terminal `CANCELLED` /
     * `CANCEL_FAILED` state arrives asynchronously via subsequent GETs.
     */
    fun cancelPositionInstruction(
        instructionId: String,
        params: PositionCancelPositionInstructionParams,
    ): CompletableFuture<PositionCancelPositionInstructionResponse> =
        cancelPositionInstruction(instructionId, params, RequestOptions.none())

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        instructionId: String,
        params: PositionCancelPositionInstructionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionCancelPositionInstructionResponse> =
        cancelPositionInstruction(
            params.toBuilder().instructionId(instructionId).build(),
            requestOptions,
        )

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        params: PositionCancelPositionInstructionParams
    ): CompletableFuture<PositionCancelPositionInstructionResponse> =
        cancelPositionInstruction(params, RequestOptions.none())

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        params: PositionCancelPositionInstructionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionCancelPositionInstructionResponse>

    /**
     * Delete a position within an account for an instrument.
     *
     * Retrieves orders generated to close the position.
     */
    fun closePosition(
        instrumentId: String,
        params: PositionClosePositionParams,
    ): CompletableFuture<PositionClosePositionResponse> =
        closePosition(instrumentId, params, RequestOptions.none())

    /** @see closePosition */
    fun closePosition(
        instrumentId: String,
        params: PositionClosePositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionClosePositionResponse> =
        closePosition(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

    /** @see closePosition */
    fun closePosition(
        params: PositionClosePositionParams
    ): CompletableFuture<PositionClosePositionResponse> =
        closePosition(params, RequestOptions.none())

    /** @see closePosition */
    fun closePosition(
        params: PositionClosePositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionClosePositionResponse>

    /**
     * Delete all positions within an account.
     *
     * Closes all positions for the specified trading account.
     */
    fun closePositions(accountId: Long): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(accountId, PositionClosePositionsParams.none())

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
    ): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(accountId, params, RequestOptions.none())

    /** @see closePositions */
    fun closePositions(
        params: PositionClosePositionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionClosePositionsResponse>

    /** @see closePositions */
    fun closePositions(
        params: PositionClosePositionsParams
    ): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(params, RequestOptions.none())

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionClosePositionsResponse> =
        closePositions(accountId, PositionClosePositionsParams.none(), requestOptions)

    /**
     * Returns the current lifecycle state of exercise / DNE / CEA instructions for the account.
     * Optionally filter by a specific instrument.
     */
    fun getPositionInstructions(
        accountId: Long
    ): CompletableFuture<PositionGetPositionInstructionsResponse> =
        getPositionInstructions(accountId, PositionGetPositionInstructionsParams.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        params: PositionGetPositionInstructionsParams =
            PositionGetPositionInstructionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionGetPositionInstructionsResponse> =
        getPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        params: PositionGetPositionInstructionsParams = PositionGetPositionInstructionsParams.none(),
    ): CompletableFuture<PositionGetPositionInstructionsResponse> =
        getPositionInstructions(accountId, params, RequestOptions.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        params: PositionGetPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionGetPositionInstructionsResponse>

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        params: PositionGetPositionInstructionsParams
    ): CompletableFuture<PositionGetPositionInstructionsResponse> =
        getPositionInstructions(params, RequestOptions.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionGetPositionInstructionsResponse> =
        getPositionInstructions(
            accountId,
            PositionGetPositionInstructionsParams.none(),
            requestOptions,
        )

    /** Retrieves all positions for the specified trading account. */
    fun getPositions(accountId: Long): CompletableFuture<PositionGetPositionsResponse> =
        getPositions(accountId, PositionGetPositionsParams.none())

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionGetPositionsResponse> =
        getPositions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
    ): CompletableFuture<PositionGetPositionsResponse> =
        getPositions(accountId, params, RequestOptions.none())

    /** @see getPositions */
    fun getPositions(
        params: PositionGetPositionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionGetPositionsResponse>

    /** @see getPositions */
    fun getPositions(
        params: PositionGetPositionsParams
    ): CompletableFuture<PositionGetPositionsResponse> = getPositions(params, RequestOptions.none())

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PositionGetPositionsResponse> =
        getPositions(accountId, PositionGetPositionsParams.none(), requestOptions)

    /**
     * Submit one or more option lifecycle instructions against the account. Each row is routed to
     * `oems-csc` independently; per-row rejections are surfaced on the corresponding response entry
     * without failing the batch.
     */
    fun submitPositionInstructions(
        accountId: Long,
        params: PositionSubmitPositionInstructionsParams,
    ): CompletableFuture<PositionSubmitPositionInstructionsResponse> =
        submitPositionInstructions(accountId, params, RequestOptions.none())

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        accountId: Long,
        params: PositionSubmitPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionSubmitPositionInstructionsResponse> =
        submitPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        params: PositionSubmitPositionInstructionsParams
    ): CompletableFuture<PositionSubmitPositionInstructionsResponse> =
        submitPositionInstructions(params, RequestOptions.none())

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        params: PositionSubmitPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PositionSubmitPositionInstructionsResponse>

    /**
     * A view of [PositionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PositionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /v1/accounts/{account_id}/positions/instructions/{instruction_id}`, but is otherwise the
         * same as [PositionServiceAsync.cancelPositionInstruction].
         */
        fun cancelPositionInstruction(
            instructionId: String,
            params: PositionCancelPositionInstructionParams,
        ): CompletableFuture<HttpResponseFor<PositionCancelPositionInstructionResponse>> =
            cancelPositionInstruction(instructionId, params, RequestOptions.none())

        /** @see cancelPositionInstruction */
        fun cancelPositionInstruction(
            instructionId: String,
            params: PositionCancelPositionInstructionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionCancelPositionInstructionResponse>> =
            cancelPositionInstruction(
                params.toBuilder().instructionId(instructionId).build(),
                requestOptions,
            )

        /** @see cancelPositionInstruction */
        fun cancelPositionInstruction(
            params: PositionCancelPositionInstructionParams
        ): CompletableFuture<HttpResponseFor<PositionCancelPositionInstructionResponse>> =
            cancelPositionInstruction(params, RequestOptions.none())

        /** @see cancelPositionInstruction */
        fun cancelPositionInstruction(
            params: PositionCancelPositionInstructionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionCancelPositionInstructionResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/accounts/{account_id}/positions/{instrument_id}`, but is otherwise the same as
         * [PositionServiceAsync.closePosition].
         */
        fun closePosition(
            instrumentId: String,
            params: PositionClosePositionParams,
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>> =
            closePosition(instrumentId, params, RequestOptions.none())

        /** @see closePosition */
        fun closePosition(
            instrumentId: String,
            params: PositionClosePositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>> =
            closePosition(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

        /** @see closePosition */
        fun closePosition(
            params: PositionClosePositionParams
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>> =
            closePosition(params, RequestOptions.none())

        /** @see closePosition */
        fun closePosition(
            params: PositionClosePositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{account_id}/positions`, but is
         * otherwise the same as [PositionServiceAsync.closePositions].
         */
        fun closePositions(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(accountId, PositionClosePositionsParams.none())

        /** @see closePositions */
        fun closePositions(
            accountId: Long,
            params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see closePositions */
        fun closePositions(
            accountId: Long,
            params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(accountId, params, RequestOptions.none())

        /** @see closePositions */
        fun closePositions(
            params: PositionClosePositionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>>

        /** @see closePositions */
        fun closePositions(
            params: PositionClosePositionsParams
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(params, RequestOptions.none())

        /** @see closePositions */
        fun closePositions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionClosePositionsResponse>> =
            closePositions(accountId, PositionClosePositionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/positions/instructions`,
         * but is otherwise the same as [PositionServiceAsync.getPositionInstructions].
         */
        fun getPositionInstructions(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<PositionGetPositionInstructionsResponse>> =
            getPositionInstructions(accountId, PositionGetPositionInstructionsParams.none())

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            accountId: Long,
            params: PositionGetPositionInstructionsParams =
                PositionGetPositionInstructionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionInstructionsResponse>> =
            getPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            accountId: Long,
            params: PositionGetPositionInstructionsParams =
                PositionGetPositionInstructionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionInstructionsResponse>> =
            getPositionInstructions(accountId, params, RequestOptions.none())

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            params: PositionGetPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionInstructionsResponse>>

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            params: PositionGetPositionInstructionsParams
        ): CompletableFuture<HttpResponseFor<PositionGetPositionInstructionsResponse>> =
            getPositionInstructions(params, RequestOptions.none())

        /** @see getPositionInstructions */
        fun getPositionInstructions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionGetPositionInstructionsResponse>> =
            getPositionInstructions(
                accountId,
                PositionGetPositionInstructionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/positions`, but is
         * otherwise the same as [PositionServiceAsync.getPositions].
         */
        fun getPositions(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(accountId, PositionGetPositionsParams.none())

        /** @see getPositions */
        fun getPositions(
            accountId: Long,
            params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPositions */
        fun getPositions(
            accountId: Long,
            params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(accountId, params, RequestOptions.none())

        /** @see getPositions */
        fun getPositions(
            params: PositionGetPositionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>>

        /** @see getPositions */
        fun getPositions(
            params: PositionGetPositionsParams
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(params, RequestOptions.none())

        /** @see getPositions */
        fun getPositions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PositionGetPositionsResponse>> =
            getPositions(accountId, PositionGetPositionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/accounts/{account_id}/positions/instructions`,
         * but is otherwise the same as [PositionServiceAsync.submitPositionInstructions].
         */
        fun submitPositionInstructions(
            accountId: Long,
            params: PositionSubmitPositionInstructionsParams,
        ): CompletableFuture<HttpResponseFor<PositionSubmitPositionInstructionsResponse>> =
            submitPositionInstructions(accountId, params, RequestOptions.none())

        /** @see submitPositionInstructions */
        fun submitPositionInstructions(
            accountId: Long,
            params: PositionSubmitPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionSubmitPositionInstructionsResponse>> =
            submitPositionInstructions(
                params.toBuilder().accountId(accountId).build(),
                requestOptions,
            )

        /** @see submitPositionInstructions */
        fun submitPositionInstructions(
            params: PositionSubmitPositionInstructionsParams
        ): CompletableFuture<HttpResponseFor<PositionSubmitPositionInstructionsResponse>> =
            submitPositionInstructions(params, RequestOptions.none())

        /** @see submitPositionInstructions */
        fun submitPositionInstructions(
            params: PositionSubmitPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PositionSubmitPositionInstructionsResponse>>
    }
}
