// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** View positions and manage position instructions. */
interface PositionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionService

    /**
     * Cancel an outstanding position instruction by its server-assigned `id`. Returns the updated
     * instruction with status `CANCEL_REQUESTED`. The terminal `CANCELLED` or `CANCEL_FAILED` state
     * arrives asynchronously and is observable via subsequent GETs.
     */
    fun cancelPositionInstruction(
        instructionId: String,
        params: PositionCancelPositionInstructionParams,
    ): PositionCancelPositionInstructionResponse =
        cancelPositionInstruction(instructionId, params, RequestOptions.none())

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        instructionId: String,
        params: PositionCancelPositionInstructionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionCancelPositionInstructionResponse =
        cancelPositionInstruction(
            params.toBuilder().instructionId(instructionId).build(),
            requestOptions,
        )

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        params: PositionCancelPositionInstructionParams
    ): PositionCancelPositionInstructionResponse =
        cancelPositionInstruction(params, RequestOptions.none())

    /** @see cancelPositionInstruction */
    fun cancelPositionInstruction(
        params: PositionCancelPositionInstructionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionCancelPositionInstructionResponse

    /**
     * Delete a position within an account for an instrument.
     *
     * Retrieves orders generated to close the position.
     */
    fun closePosition(
        instrumentId: String,
        params: PositionClosePositionParams,
    ): PositionClosePositionResponse = closePosition(instrumentId, params, RequestOptions.none())

    /** @see closePosition */
    fun closePosition(
        instrumentId: String,
        params: PositionClosePositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionClosePositionResponse =
        closePosition(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

    /** @see closePosition */
    fun closePosition(params: PositionClosePositionParams): PositionClosePositionResponse =
        closePosition(params, RequestOptions.none())

    /** @see closePosition */
    fun closePosition(
        params: PositionClosePositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionClosePositionResponse

    /**
     * Delete all positions within an account.
     *
     * Closes all positions for the specified trading account.
     */
    fun closePositions(accountId: Long): PositionClosePositionsResponse =
        closePositions(accountId, PositionClosePositionsParams.none())

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionClosePositionsResponse =
        closePositions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
    ): PositionClosePositionsResponse = closePositions(accountId, params, RequestOptions.none())

    /** @see closePositions */
    fun closePositions(
        params: PositionClosePositionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionClosePositionsResponse

    /** @see closePositions */
    fun closePositions(params: PositionClosePositionsParams): PositionClosePositionsResponse =
        closePositions(params, RequestOptions.none())

    /** @see closePositions */
    fun closePositions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): PositionClosePositionsResponse =
        closePositions(accountId, PositionClosePositionsParams.none(), requestOptions)

    /**
     * Returns the current lifecycle state of the account's position instructions. Optionally filter
     * by a specific contract.
     */
    fun getPositionInstructions(accountId: Long): PositionGetPositionInstructionsResponse =
        getPositionInstructions(accountId, PositionGetPositionInstructionsParams.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        params: PositionGetPositionInstructionsParams =
            PositionGetPositionInstructionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionGetPositionInstructionsResponse =
        getPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        params: PositionGetPositionInstructionsParams = PositionGetPositionInstructionsParams.none(),
    ): PositionGetPositionInstructionsResponse =
        getPositionInstructions(accountId, params, RequestOptions.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        params: PositionGetPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionGetPositionInstructionsResponse

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        params: PositionGetPositionInstructionsParams
    ): PositionGetPositionInstructionsResponse =
        getPositionInstructions(params, RequestOptions.none())

    /** @see getPositionInstructions */
    fun getPositionInstructions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): PositionGetPositionInstructionsResponse =
        getPositionInstructions(
            accountId,
            PositionGetPositionInstructionsParams.none(),
            requestOptions,
        )

    /** Retrieves all positions for the specified trading account. */
    fun getPositions(accountId: Long): PositionGetPositionsResponse =
        getPositions(accountId, PositionGetPositionsParams.none())

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionGetPositionsResponse =
        getPositions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
    ): PositionGetPositionsResponse = getPositions(accountId, params, RequestOptions.none())

    /** @see getPositions */
    fun getPositions(
        params: PositionGetPositionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionGetPositionsResponse

    /** @see getPositions */
    fun getPositions(params: PositionGetPositionsParams): PositionGetPositionsResponse =
        getPositions(params, RequestOptions.none())

    /** @see getPositions */
    fun getPositions(
        accountId: Long,
        requestOptions: RequestOptions,
    ): PositionGetPositionsResponse =
        getPositions(accountId, PositionGetPositionsParams.none(), requestOptions)

    /**
     * Submit one or more position instructions (Exercise, Do-Not-Exercise, Contrary Exercise
     * Advice) against the account. Each row is processed independently; a rejected row is returned
     * with an error on the corresponding response entry without failing the batch.
     */
    fun submitPositionInstructions(
        accountId: Long,
        params: PositionSubmitPositionInstructionsParams,
    ): PositionSubmitPositionInstructionsResponse =
        submitPositionInstructions(accountId, params, RequestOptions.none())

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        accountId: Long,
        params: PositionSubmitPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionSubmitPositionInstructionsResponse =
        submitPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        params: PositionSubmitPositionInstructionsParams
    ): PositionSubmitPositionInstructionsResponse =
        submitPositionInstructions(params, RequestOptions.none())

    /** @see submitPositionInstructions */
    fun submitPositionInstructions(
        params: PositionSubmitPositionInstructionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PositionSubmitPositionInstructionsResponse

    /** A view of [PositionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /v1/accounts/{account_id}/positions/instructions/{instruction_id}`, but is otherwise the
         * same as [PositionService.cancelPositionInstruction].
         */
        @MustBeClosed
        fun cancelPositionInstruction(
            instructionId: String,
            params: PositionCancelPositionInstructionParams,
        ): HttpResponseFor<PositionCancelPositionInstructionResponse> =
            cancelPositionInstruction(instructionId, params, RequestOptions.none())

        /** @see cancelPositionInstruction */
        @MustBeClosed
        fun cancelPositionInstruction(
            instructionId: String,
            params: PositionCancelPositionInstructionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionCancelPositionInstructionResponse> =
            cancelPositionInstruction(
                params.toBuilder().instructionId(instructionId).build(),
                requestOptions,
            )

        /** @see cancelPositionInstruction */
        @MustBeClosed
        fun cancelPositionInstruction(
            params: PositionCancelPositionInstructionParams
        ): HttpResponseFor<PositionCancelPositionInstructionResponse> =
            cancelPositionInstruction(params, RequestOptions.none())

        /** @see cancelPositionInstruction */
        @MustBeClosed
        fun cancelPositionInstruction(
            params: PositionCancelPositionInstructionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionCancelPositionInstructionResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/accounts/{account_id}/positions/{instrument_id}`, but is otherwise the same as
         * [PositionService.closePosition].
         */
        @MustBeClosed
        fun closePosition(
            instrumentId: String,
            params: PositionClosePositionParams,
        ): HttpResponseFor<PositionClosePositionResponse> =
            closePosition(instrumentId, params, RequestOptions.none())

        /** @see closePosition */
        @MustBeClosed
        fun closePosition(
            instrumentId: String,
            params: PositionClosePositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionClosePositionResponse> =
            closePosition(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

        /** @see closePosition */
        @MustBeClosed
        fun closePosition(
            params: PositionClosePositionParams
        ): HttpResponseFor<PositionClosePositionResponse> =
            closePosition(params, RequestOptions.none())

        /** @see closePosition */
        @MustBeClosed
        fun closePosition(
            params: PositionClosePositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionClosePositionResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{account_id}/positions`, but is
         * otherwise the same as [PositionService.closePositions].
         */
        @MustBeClosed
        fun closePositions(accountId: Long): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(accountId, PositionClosePositionsParams.none())

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            accountId: Long,
            params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            accountId: Long,
            params: PositionClosePositionsParams = PositionClosePositionsParams.none(),
        ): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(accountId, params, RequestOptions.none())

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            params: PositionClosePositionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionClosePositionsResponse>

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            params: PositionClosePositionsParams
        ): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(params, RequestOptions.none())

        /** @see closePositions */
        @MustBeClosed
        fun closePositions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionClosePositionsResponse> =
            closePositions(accountId, PositionClosePositionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/positions/instructions`,
         * but is otherwise the same as [PositionService.getPositionInstructions].
         */
        @MustBeClosed
        fun getPositionInstructions(
            accountId: Long
        ): HttpResponseFor<PositionGetPositionInstructionsResponse> =
            getPositionInstructions(accountId, PositionGetPositionInstructionsParams.none())

        /** @see getPositionInstructions */
        @MustBeClosed
        fun getPositionInstructions(
            accountId: Long,
            params: PositionGetPositionInstructionsParams =
                PositionGetPositionInstructionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionGetPositionInstructionsResponse> =
            getPositionInstructions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPositionInstructions */
        @MustBeClosed
        fun getPositionInstructions(
            accountId: Long,
            params: PositionGetPositionInstructionsParams =
                PositionGetPositionInstructionsParams.none(),
        ): HttpResponseFor<PositionGetPositionInstructionsResponse> =
            getPositionInstructions(accountId, params, RequestOptions.none())

        /** @see getPositionInstructions */
        @MustBeClosed
        fun getPositionInstructions(
            params: PositionGetPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionGetPositionInstructionsResponse>

        /** @see getPositionInstructions */
        @MustBeClosed
        fun getPositionInstructions(
            params: PositionGetPositionInstructionsParams
        ): HttpResponseFor<PositionGetPositionInstructionsResponse> =
            getPositionInstructions(params, RequestOptions.none())

        /** @see getPositionInstructions */
        @MustBeClosed
        fun getPositionInstructions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionGetPositionInstructionsResponse> =
            getPositionInstructions(
                accountId,
                PositionGetPositionInstructionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/positions`, but is
         * otherwise the same as [PositionService.getPositions].
         */
        @MustBeClosed
        fun getPositions(accountId: Long): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(accountId, PositionGetPositionsParams.none())

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            accountId: Long,
            params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            accountId: Long,
            params: PositionGetPositionsParams = PositionGetPositionsParams.none(),
        ): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(accountId, params, RequestOptions.none())

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            params: PositionGetPositionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionGetPositionsResponse>

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            params: PositionGetPositionsParams
        ): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(params, RequestOptions.none())

        /** @see getPositions */
        @MustBeClosed
        fun getPositions(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PositionGetPositionsResponse> =
            getPositions(accountId, PositionGetPositionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/accounts/{account_id}/positions/instructions`,
         * but is otherwise the same as [PositionService.submitPositionInstructions].
         */
        @MustBeClosed
        fun submitPositionInstructions(
            accountId: Long,
            params: PositionSubmitPositionInstructionsParams,
        ): HttpResponseFor<PositionSubmitPositionInstructionsResponse> =
            submitPositionInstructions(accountId, params, RequestOptions.none())

        /** @see submitPositionInstructions */
        @MustBeClosed
        fun submitPositionInstructions(
            accountId: Long,
            params: PositionSubmitPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionSubmitPositionInstructionsResponse> =
            submitPositionInstructions(
                params.toBuilder().accountId(accountId).build(),
                requestOptions,
            )

        /** @see submitPositionInstructions */
        @MustBeClosed
        fun submitPositionInstructions(
            params: PositionSubmitPositionInstructionsParams
        ): HttpResponseFor<PositionSubmitPositionInstructionsResponse> =
            submitPositionInstructions(params, RequestOptions.none())

        /** @see submitPositionInstructions */
        @MustBeClosed
        fun submitPositionInstructions(
            params: PositionSubmitPositionInstructionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PositionSubmitPositionInstructionsResponse>
    }
}
