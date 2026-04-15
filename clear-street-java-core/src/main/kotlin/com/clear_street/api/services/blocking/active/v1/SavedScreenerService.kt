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
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerListScreenersParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerListScreenersResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerUpdateScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerUpdateScreenerResponse
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

    /** Persists a screener configuration for the authenticated user. */
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

    /** Deletes the screener configuration for the authenticated user. */
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

    /** Returns a single screener configuration for the authenticated user. */
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

    /** Returns all screener configurations for the authenticated user. */
    fun listScreeners(): SavedScreenerListScreenersResponse =
        listScreeners(SavedScreenerListScreenersParams.none())

    /** @see listScreeners */
    fun listScreeners(
        params: SavedScreenerListScreenersParams = SavedScreenerListScreenersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerListScreenersResponse

    /** @see listScreeners */
    fun listScreeners(
        params: SavedScreenerListScreenersParams = SavedScreenerListScreenersParams.none()
    ): SavedScreenerListScreenersResponse = listScreeners(params, RequestOptions.none())

    /** @see listScreeners */
    fun listScreeners(requestOptions: RequestOptions): SavedScreenerListScreenersResponse =
        listScreeners(SavedScreenerListScreenersParams.none(), requestOptions)

    /**
     * Replaces the screener configuration for the authenticated user. If `name` is null, the
     * existing name is preserved.
     */
    fun updateScreener(screenerId: String): SavedScreenerUpdateScreenerResponse =
        updateScreener(screenerId, SavedScreenerUpdateScreenerParams.none())

    /** @see updateScreener */
    fun updateScreener(
        screenerId: String,
        params: SavedScreenerUpdateScreenerParams = SavedScreenerUpdateScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerUpdateScreenerResponse =
        updateScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see updateScreener */
    fun updateScreener(
        screenerId: String,
        params: SavedScreenerUpdateScreenerParams = SavedScreenerUpdateScreenerParams.none(),
    ): SavedScreenerUpdateScreenerResponse =
        updateScreener(screenerId, params, RequestOptions.none())

    /** @see updateScreener */
    fun updateScreener(
        params: SavedScreenerUpdateScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SavedScreenerUpdateScreenerResponse

    /** @see updateScreener */
    fun updateScreener(
        params: SavedScreenerUpdateScreenerParams
    ): SavedScreenerUpdateScreenerResponse = updateScreener(params, RequestOptions.none())

    /** @see updateScreener */
    fun updateScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): SavedScreenerUpdateScreenerResponse =
        updateScreener(screenerId, SavedScreenerUpdateScreenerParams.none(), requestOptions)

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
         * same as [SavedScreenerService.listScreeners].
         */
        @MustBeClosed
        fun listScreeners(): HttpResponseFor<SavedScreenerListScreenersResponse> =
            listScreeners(SavedScreenerListScreenersParams.none())

        /** @see listScreeners */
        @MustBeClosed
        fun listScreeners(
            params: SavedScreenerListScreenersParams = SavedScreenerListScreenersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerListScreenersResponse>

        /** @see listScreeners */
        @MustBeClosed
        fun listScreeners(
            params: SavedScreenerListScreenersParams = SavedScreenerListScreenersParams.none()
        ): HttpResponseFor<SavedScreenerListScreenersResponse> =
            listScreeners(params, RequestOptions.none())

        /** @see listScreeners */
        @MustBeClosed
        fun listScreeners(
            requestOptions: RequestOptions
        ): HttpResponseFor<SavedScreenerListScreenersResponse> =
            listScreeners(SavedScreenerListScreenersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /active/v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [SavedScreenerService.updateScreener].
         */
        @MustBeClosed
        fun updateScreener(
            screenerId: String
        ): HttpResponseFor<SavedScreenerUpdateScreenerResponse> =
            updateScreener(screenerId, SavedScreenerUpdateScreenerParams.none())

        /** @see updateScreener */
        @MustBeClosed
        fun updateScreener(
            screenerId: String,
            params: SavedScreenerUpdateScreenerParams = SavedScreenerUpdateScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerUpdateScreenerResponse> =
            updateScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see updateScreener */
        @MustBeClosed
        fun updateScreener(
            screenerId: String,
            params: SavedScreenerUpdateScreenerParams = SavedScreenerUpdateScreenerParams.none(),
        ): HttpResponseFor<SavedScreenerUpdateScreenerResponse> =
            updateScreener(screenerId, params, RequestOptions.none())

        /** @see updateScreener */
        @MustBeClosed
        fun updateScreener(
            params: SavedScreenerUpdateScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SavedScreenerUpdateScreenerResponse>

        /** @see updateScreener */
        @MustBeClosed
        fun updateScreener(
            params: SavedScreenerUpdateScreenerParams
        ): HttpResponseFor<SavedScreenerUpdateScreenerResponse> =
            updateScreener(params, RequestOptions.none())

        /** @see updateScreener */
        @MustBeClosed
        fun updateScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SavedScreenerUpdateScreenerResponse> =
            updateScreener(screenerId, SavedScreenerUpdateScreenerParams.none(), requestOptions)
    }
}
