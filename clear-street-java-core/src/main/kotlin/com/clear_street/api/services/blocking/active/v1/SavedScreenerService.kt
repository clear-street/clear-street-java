// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerDeleteScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenerByIdParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenerByIdResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenersParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenersResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface SavedScreenerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SavedScreenerService

    /**
     * Create a saved screener configuration.
     *
     * Persists a screener configuration for the authenticated user.
     */
    fun createScreener(): SavedScreenerCreateScreenerResponse =
        createScreener(SavedScreenerCreateScreenerParams.none())

    /** @see createScreener */
    fun createScreener(
        params: SavedScreenerCreateScreenerParams = SavedScreenerCreateScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerCreateScreenerResponse

    /** @see createScreener */
    fun createScreener(
        params: SavedScreenerCreateScreenerParams = SavedScreenerCreateScreenerParams.none()
    ): SavedScreenerCreateScreenerResponse = createScreener(params, RequestOptions.none())

    /** @see createScreener */
    fun createScreener(requestOptions: RequestOptions): SavedScreenerCreateScreenerResponse =
        createScreener(SavedScreenerCreateScreenerParams.none(), requestOptions)

    /**
     * Delete a saved screener configuration.
     *
     * Deletes the screener configuration for the authenticated user.
     */
    fun deleteScreener(screenerId: String) =
        deleteScreener(screenerId, SavedScreenerDeleteScreenerParams.none())

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        params: SavedScreenerDeleteScreenerParams = SavedScreenerDeleteScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        params: SavedScreenerDeleteScreenerParams = SavedScreenerDeleteScreenerParams.none(),
    ) = deleteScreener(screenerId, params, RequestOptions.none())

    /** @see deleteScreener */
    fun deleteScreener(
        params: SavedScreenerDeleteScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteScreener */
    fun deleteScreener(params: SavedScreenerDeleteScreenerParams) =
        deleteScreener(params, RequestOptions.none())

    /** @see deleteScreener */
    fun deleteScreener(screenerId: String, requestOptions: RequestOptions) =
        deleteScreener(screenerId, SavedScreenerDeleteScreenerParams.none(), requestOptions)

    /**
     * Get a saved screener configuration by ID.
     *
     * Returns a single screener configuration for the authenticated user.
     */
    fun getScreenerById(screenerId: String): SavedScreenerGetScreenerByIdResponse =
        getScreenerById(screenerId, SavedScreenerGetScreenerByIdParams.none())

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        params: SavedScreenerGetScreenerByIdParams = SavedScreenerGetScreenerByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerGetScreenerByIdResponse =
        getScreenerById(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        params: SavedScreenerGetScreenerByIdParams = SavedScreenerGetScreenerByIdParams.none(),
    ): SavedScreenerGetScreenerByIdResponse =
        getScreenerById(screenerId, params, RequestOptions.none())

    /** @see getScreenerById */
    fun getScreenerById(
        params: SavedScreenerGetScreenerByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerGetScreenerByIdResponse

    /** @see getScreenerById */
    fun getScreenerById(
        params: SavedScreenerGetScreenerByIdParams
    ): SavedScreenerGetScreenerByIdResponse = getScreenerById(params, RequestOptions.none())

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        requestOptions: RequestOptions,
    ): SavedScreenerGetScreenerByIdResponse =
        getScreenerById(screenerId, SavedScreenerGetScreenerByIdParams.none(), requestOptions)

    /**
     * List saved screener configurations.
     *
     * Returns all screener configurations for the authenticated user.
     */
    fun getScreeners(): SavedScreenerGetScreenersResponse =
        getScreeners(SavedScreenerGetScreenersParams.none())

    /** @see getScreeners */
    fun getScreeners(
        params: SavedScreenerGetScreenersParams = SavedScreenerGetScreenersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerGetScreenersResponse

    /** @see getScreeners */
    fun getScreeners(
        params: SavedScreenerGetScreenersParams = SavedScreenerGetScreenersParams.none()
    ): SavedScreenerGetScreenersResponse = getScreeners(params, RequestOptions.none())

    /** @see getScreeners */
    fun getScreeners(requestOptions: RequestOptions): SavedScreenerGetScreenersResponse =
        getScreeners(SavedScreenerGetScreenersParams.none(), requestOptions)

    /**
     * Update a saved screener configuration.
     *
     * Replaces the screener configuration for the authenticated user. If `name` is null, the
     * existing name is preserved.
     */
    fun replaceScreener(screenerId: String): SavedScreenerReplaceScreenerResponse =
        replaceScreener(screenerId, SavedScreenerReplaceScreenerParams.none())

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        params: SavedScreenerReplaceScreenerParams = SavedScreenerReplaceScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerReplaceScreenerResponse =
        replaceScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        params: SavedScreenerReplaceScreenerParams = SavedScreenerReplaceScreenerParams.none(),
    ): SavedScreenerReplaceScreenerResponse =
        replaceScreener(screenerId, params, RequestOptions.none())

    /** @see replaceScreener */
    fun replaceScreener(
        params: SavedScreenerReplaceScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerReplaceScreenerResponse

    /** @see replaceScreener */
    fun replaceScreener(
        params: SavedScreenerReplaceScreenerParams
    ): SavedScreenerReplaceScreenerResponse = replaceScreener(params, RequestOptions.none())

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): SavedScreenerReplaceScreenerResponse =
        replaceScreener(screenerId, SavedScreenerReplaceScreenerParams.none(), requestOptions)

    /**
     * A view of [SavedScreenerService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SavedScreenerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/saved-screeners`, but is otherwise the
         * same as [SavedScreenerService.createScreener].
         */
        @MustBeClosed
        fun createScreener(): HttpResponseFor<SavedScreenerCreateScreenerResponse> =
            createScreener(SavedScreenerCreateScreenerParams.none())

        /** @see createScreener */
        @MustBeClosed
        fun createScreener(
            params: SavedScreenerCreateScreenerParams = SavedScreenerCreateScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerCreateScreenerResponse>

        /** @see createScreener */
        @MustBeClosed
        fun createScreener(
            params: SavedScreenerCreateScreenerParams = SavedScreenerCreateScreenerParams.none()
        ): HttpResponseFor<SavedScreenerCreateScreenerResponse> =
            createScreener(params, RequestOptions.none())

        /** @see createScreener */
        @MustBeClosed
        fun createScreener(
            requestOptions: RequestOptions
        ): HttpResponseFor<SavedScreenerCreateScreenerResponse> =
            createScreener(SavedScreenerCreateScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /active/v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [SavedScreenerService.deleteScreener].
         */
        @MustBeClosed
        fun deleteScreener(screenerId: String): HttpResponse =
            deleteScreener(screenerId, SavedScreenerDeleteScreenerParams.none())

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(
            screenerId: String,
            params: SavedScreenerDeleteScreenerParams = SavedScreenerDeleteScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(
            screenerId: String,
            params: SavedScreenerDeleteScreenerParams = SavedScreenerDeleteScreenerParams.none(),
        ): HttpResponse = deleteScreener(screenerId, params, RequestOptions.none())

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(
            params: SavedScreenerDeleteScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(params: SavedScreenerDeleteScreenerParams): HttpResponse =
            deleteScreener(params, RequestOptions.none())

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(screenerId: String, requestOptions: RequestOptions): HttpResponse =
            deleteScreener(screenerId, SavedScreenerDeleteScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [SavedScreenerService.getScreenerById].
         */
        @MustBeClosed
        fun getScreenerById(
            screenerId: String
        ): HttpResponseFor<SavedScreenerGetScreenerByIdResponse> =
            getScreenerById(screenerId, SavedScreenerGetScreenerByIdParams.none())

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            screenerId: String,
            params: SavedScreenerGetScreenerByIdParams = SavedScreenerGetScreenerByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerGetScreenerByIdResponse> =
            getScreenerById(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            screenerId: String,
            params: SavedScreenerGetScreenerByIdParams = SavedScreenerGetScreenerByIdParams.none(),
        ): HttpResponseFor<SavedScreenerGetScreenerByIdResponse> =
            getScreenerById(screenerId, params, RequestOptions.none())

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            params: SavedScreenerGetScreenerByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerGetScreenerByIdResponse>

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            params: SavedScreenerGetScreenerByIdParams
        ): HttpResponseFor<SavedScreenerGetScreenerByIdResponse> =
            getScreenerById(params, RequestOptions.none())

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            screenerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SavedScreenerGetScreenerByIdResponse> =
            getScreenerById(screenerId, SavedScreenerGetScreenerByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/saved-screeners`, but is otherwise the
         * same as [SavedScreenerService.getScreeners].
         */
        @MustBeClosed
        fun getScreeners(): HttpResponseFor<SavedScreenerGetScreenersResponse> =
            getScreeners(SavedScreenerGetScreenersParams.none())

        /** @see getScreeners */
        @MustBeClosed
        fun getScreeners(
            params: SavedScreenerGetScreenersParams = SavedScreenerGetScreenersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerGetScreenersResponse>

        /** @see getScreeners */
        @MustBeClosed
        fun getScreeners(
            params: SavedScreenerGetScreenersParams = SavedScreenerGetScreenersParams.none()
        ): HttpResponseFor<SavedScreenerGetScreenersResponse> =
            getScreeners(params, RequestOptions.none())

        /** @see getScreeners */
        @MustBeClosed
        fun getScreeners(
            requestOptions: RequestOptions
        ): HttpResponseFor<SavedScreenerGetScreenersResponse> =
            getScreeners(SavedScreenerGetScreenersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /active/v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [SavedScreenerService.replaceScreener].
         */
        @MustBeClosed
        fun replaceScreener(
            screenerId: String
        ): HttpResponseFor<SavedScreenerReplaceScreenerResponse> =
            replaceScreener(screenerId, SavedScreenerReplaceScreenerParams.none())

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            screenerId: String,
            params: SavedScreenerReplaceScreenerParams = SavedScreenerReplaceScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerReplaceScreenerResponse> =
            replaceScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            screenerId: String,
            params: SavedScreenerReplaceScreenerParams = SavedScreenerReplaceScreenerParams.none(),
        ): HttpResponseFor<SavedScreenerReplaceScreenerResponse> =
            replaceScreener(screenerId, params, RequestOptions.none())

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            params: SavedScreenerReplaceScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerReplaceScreenerResponse>

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            params: SavedScreenerReplaceScreenerParams
        ): HttpResponseFor<SavedScreenerReplaceScreenerResponse> =
            replaceScreener(params, RequestOptions.none())

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SavedScreenerReplaceScreenerResponse> =
            replaceScreener(screenerId, SavedScreenerReplaceScreenerParams.none(), requestOptions)
    }
}
