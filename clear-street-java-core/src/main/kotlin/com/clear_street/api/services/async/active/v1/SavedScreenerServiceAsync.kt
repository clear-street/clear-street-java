// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface SavedScreenerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SavedScreenerServiceAsync

    /**
     * Create a saved screener configuration.
     *
     * Persists a screener configuration for the authenticated user.
     */
    fun createScreener(): CompletableFuture<SavedScreenerCreateScreenerResponse> =
        createScreener(SavedScreenerCreateScreenerParams.none())

    /** @see createScreener */
    fun createScreener(
        params: SavedScreenerCreateScreenerParams = SavedScreenerCreateScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerCreateScreenerResponse>

    /** @see createScreener */
    fun createScreener(
        params: SavedScreenerCreateScreenerParams = SavedScreenerCreateScreenerParams.none()
    ): CompletableFuture<SavedScreenerCreateScreenerResponse> =
        createScreener(params, RequestOptions.none())

    /** @see createScreener */
    fun createScreener(
        requestOptions: RequestOptions
    ): CompletableFuture<SavedScreenerCreateScreenerResponse> =
        createScreener(SavedScreenerCreateScreenerParams.none(), requestOptions)

    /**
     * Delete a saved screener configuration.
     *
     * Deletes the screener configuration for the authenticated user.
     */
    fun deleteScreener(screenerId: String): CompletableFuture<Void?> =
        deleteScreener(screenerId, SavedScreenerDeleteScreenerParams.none())

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        params: SavedScreenerDeleteScreenerParams = SavedScreenerDeleteScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        params: SavedScreenerDeleteScreenerParams = SavedScreenerDeleteScreenerParams.none(),
    ): CompletableFuture<Void?> = deleteScreener(screenerId, params, RequestOptions.none())

    /** @see deleteScreener */
    fun deleteScreener(
        params: SavedScreenerDeleteScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteScreener */
    fun deleteScreener(params: SavedScreenerDeleteScreenerParams): CompletableFuture<Void?> =
        deleteScreener(params, RequestOptions.none())

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteScreener(screenerId, SavedScreenerDeleteScreenerParams.none(), requestOptions)

    /**
     * Get a saved screener configuration by ID.
     *
     * Returns a single screener configuration for the authenticated user.
     */
    fun getScreenerById(
        screenerId: String
    ): CompletableFuture<SavedScreenerGetScreenerByIdResponse> =
        getScreenerById(screenerId, SavedScreenerGetScreenerByIdParams.none())

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        params: SavedScreenerGetScreenerByIdParams = SavedScreenerGetScreenerByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerGetScreenerByIdResponse> =
        getScreenerById(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        params: SavedScreenerGetScreenerByIdParams = SavedScreenerGetScreenerByIdParams.none(),
    ): CompletableFuture<SavedScreenerGetScreenerByIdResponse> =
        getScreenerById(screenerId, params, RequestOptions.none())

    /** @see getScreenerById */
    fun getScreenerById(
        params: SavedScreenerGetScreenerByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerGetScreenerByIdResponse>

    /** @see getScreenerById */
    fun getScreenerById(
        params: SavedScreenerGetScreenerByIdParams
    ): CompletableFuture<SavedScreenerGetScreenerByIdResponse> =
        getScreenerById(params, RequestOptions.none())

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SavedScreenerGetScreenerByIdResponse> =
        getScreenerById(screenerId, SavedScreenerGetScreenerByIdParams.none(), requestOptions)

    /**
     * List saved screener configurations.
     *
     * Returns all screener configurations for the authenticated user.
     */
    fun listScreeners(): CompletableFuture<SavedScreenerListScreenersResponse> =
        listScreeners(SavedScreenerListScreenersParams.none())

    /** @see listScreeners */
    fun listScreeners(
        params: SavedScreenerListScreenersParams = SavedScreenerListScreenersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerListScreenersResponse>

    /** @see listScreeners */
    fun listScreeners(
        params: SavedScreenerListScreenersParams = SavedScreenerListScreenersParams.none()
    ): CompletableFuture<SavedScreenerListScreenersResponse> =
        listScreeners(params, RequestOptions.none())

    /** @see listScreeners */
    fun listScreeners(
        requestOptions: RequestOptions
    ): CompletableFuture<SavedScreenerListScreenersResponse> =
        listScreeners(SavedScreenerListScreenersParams.none(), requestOptions)

    /**
     * Update a saved screener configuration.
     *
     * Replaces the screener configuration for the authenticated user. If `name` is null, the
     * existing name is preserved.
     */
    fun updateScreener(screenerId: String): CompletableFuture<SavedScreenerUpdateScreenerResponse> =
        updateScreener(screenerId, SavedScreenerUpdateScreenerParams.none())

    /** @see updateScreener */
    fun updateScreener(
        screenerId: String,
        params: SavedScreenerUpdateScreenerParams = SavedScreenerUpdateScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerUpdateScreenerResponse> =
        updateScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see updateScreener */
    fun updateScreener(
        screenerId: String,
        params: SavedScreenerUpdateScreenerParams = SavedScreenerUpdateScreenerParams.none(),
    ): CompletableFuture<SavedScreenerUpdateScreenerResponse> =
        updateScreener(screenerId, params, RequestOptions.none())

    /** @see updateScreener */
    fun updateScreener(
        params: SavedScreenerUpdateScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerUpdateScreenerResponse>

    /** @see updateScreener */
    fun updateScreener(
        params: SavedScreenerUpdateScreenerParams
    ): CompletableFuture<SavedScreenerUpdateScreenerResponse> =
        updateScreener(params, RequestOptions.none())

    /** @see updateScreener */
    fun updateScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SavedScreenerUpdateScreenerResponse> =
        updateScreener(screenerId, SavedScreenerUpdateScreenerParams.none(), requestOptions)

    /**
     * A view of [SavedScreenerServiceAsync] that provides access to raw HTTP responses for each
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
        ): SavedScreenerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/saved-screeners`, but is otherwise the
         * same as [SavedScreenerServiceAsync.createScreener].
         */
        fun createScreener():
            CompletableFuture<HttpResponseFor<SavedScreenerCreateScreenerResponse>> =
            createScreener(SavedScreenerCreateScreenerParams.none())

        /** @see createScreener */
        fun createScreener(
            params: SavedScreenerCreateScreenerParams = SavedScreenerCreateScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerCreateScreenerResponse>>

        /** @see createScreener */
        fun createScreener(
            params: SavedScreenerCreateScreenerParams = SavedScreenerCreateScreenerParams.none()
        ): CompletableFuture<HttpResponseFor<SavedScreenerCreateScreenerResponse>> =
            createScreener(params, RequestOptions.none())

        /** @see createScreener */
        fun createScreener(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SavedScreenerCreateScreenerResponse>> =
            createScreener(SavedScreenerCreateScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /active/v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [SavedScreenerServiceAsync.deleteScreener].
         */
        fun deleteScreener(screenerId: String): CompletableFuture<HttpResponse> =
            deleteScreener(screenerId, SavedScreenerDeleteScreenerParams.none())

        /** @see deleteScreener */
        fun deleteScreener(
            screenerId: String,
            params: SavedScreenerDeleteScreenerParams = SavedScreenerDeleteScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see deleteScreener */
        fun deleteScreener(
            screenerId: String,
            params: SavedScreenerDeleteScreenerParams = SavedScreenerDeleteScreenerParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteScreener(screenerId, params, RequestOptions.none())

        /** @see deleteScreener */
        fun deleteScreener(
            params: SavedScreenerDeleteScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteScreener */
        fun deleteScreener(
            params: SavedScreenerDeleteScreenerParams
        ): CompletableFuture<HttpResponse> = deleteScreener(params, RequestOptions.none())

        /** @see deleteScreener */
        fun deleteScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteScreener(screenerId, SavedScreenerDeleteScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [SavedScreenerServiceAsync.getScreenerById].
         */
        fun getScreenerById(
            screenerId: String
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenerByIdResponse>> =
            getScreenerById(screenerId, SavedScreenerGetScreenerByIdParams.none())

        /** @see getScreenerById */
        fun getScreenerById(
            screenerId: String,
            params: SavedScreenerGetScreenerByIdParams = SavedScreenerGetScreenerByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenerByIdResponse>> =
            getScreenerById(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see getScreenerById */
        fun getScreenerById(
            screenerId: String,
            params: SavedScreenerGetScreenerByIdParams = SavedScreenerGetScreenerByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenerByIdResponse>> =
            getScreenerById(screenerId, params, RequestOptions.none())

        /** @see getScreenerById */
        fun getScreenerById(
            params: SavedScreenerGetScreenerByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenerByIdResponse>>

        /** @see getScreenerById */
        fun getScreenerById(
            params: SavedScreenerGetScreenerByIdParams
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenerByIdResponse>> =
            getScreenerById(params, RequestOptions.none())

        /** @see getScreenerById */
        fun getScreenerById(
            screenerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenerByIdResponse>> =
            getScreenerById(screenerId, SavedScreenerGetScreenerByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/saved-screeners`, but is otherwise the
         * same as [SavedScreenerServiceAsync.listScreeners].
         */
        fun listScreeners():
            CompletableFuture<HttpResponseFor<SavedScreenerListScreenersResponse>> =
            listScreeners(SavedScreenerListScreenersParams.none())

        /** @see listScreeners */
        fun listScreeners(
            params: SavedScreenerListScreenersParams = SavedScreenerListScreenersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerListScreenersResponse>>

        /** @see listScreeners */
        fun listScreeners(
            params: SavedScreenerListScreenersParams = SavedScreenerListScreenersParams.none()
        ): CompletableFuture<HttpResponseFor<SavedScreenerListScreenersResponse>> =
            listScreeners(params, RequestOptions.none())

        /** @see listScreeners */
        fun listScreeners(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SavedScreenerListScreenersResponse>> =
            listScreeners(SavedScreenerListScreenersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /active/v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [SavedScreenerServiceAsync.updateScreener].
         */
        fun updateScreener(
            screenerId: String
        ): CompletableFuture<HttpResponseFor<SavedScreenerUpdateScreenerResponse>> =
            updateScreener(screenerId, SavedScreenerUpdateScreenerParams.none())

        /** @see updateScreener */
        fun updateScreener(
            screenerId: String,
            params: SavedScreenerUpdateScreenerParams = SavedScreenerUpdateScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerUpdateScreenerResponse>> =
            updateScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see updateScreener */
        fun updateScreener(
            screenerId: String,
            params: SavedScreenerUpdateScreenerParams = SavedScreenerUpdateScreenerParams.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerUpdateScreenerResponse>> =
            updateScreener(screenerId, params, RequestOptions.none())

        /** @see updateScreener */
        fun updateScreener(
            params: SavedScreenerUpdateScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerUpdateScreenerResponse>>

        /** @see updateScreener */
        fun updateScreener(
            params: SavedScreenerUpdateScreenerParams
        ): CompletableFuture<HttpResponseFor<SavedScreenerUpdateScreenerResponse>> =
            updateScreener(params, RequestOptions.none())

        /** @see updateScreener */
        fun updateScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SavedScreenerUpdateScreenerResponse>> =
            updateScreener(screenerId, SavedScreenerUpdateScreenerParams.none(), requestOptions)
    }
}
