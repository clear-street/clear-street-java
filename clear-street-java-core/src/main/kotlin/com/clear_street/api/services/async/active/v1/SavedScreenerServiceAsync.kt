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
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenersParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenersResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Search and manage saved screeners. */
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
    fun getScreeners(): CompletableFuture<SavedScreenerGetScreenersResponse> =
        getScreeners(SavedScreenerGetScreenersParams.none())

    /** @see getScreeners */
    fun getScreeners(
        params: SavedScreenerGetScreenersParams = SavedScreenerGetScreenersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerGetScreenersResponse>

    /** @see getScreeners */
    fun getScreeners(
        params: SavedScreenerGetScreenersParams = SavedScreenerGetScreenersParams.none()
    ): CompletableFuture<SavedScreenerGetScreenersResponse> =
        getScreeners(params, RequestOptions.none())

    /** @see getScreeners */
    fun getScreeners(
        requestOptions: RequestOptions
    ): CompletableFuture<SavedScreenerGetScreenersResponse> =
        getScreeners(SavedScreenerGetScreenersParams.none(), requestOptions)

    /**
     * Update a saved screener configuration.
     *
     * Replaces the screener configuration for the authenticated user. If `name` is null, the
     * existing name is preserved.
     */
    fun replaceScreener(
        screenerId: String
    ): CompletableFuture<SavedScreenerReplaceScreenerResponse> =
        replaceScreener(screenerId, SavedScreenerReplaceScreenerParams.none())

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        params: SavedScreenerReplaceScreenerParams = SavedScreenerReplaceScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerReplaceScreenerResponse> =
        replaceScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        params: SavedScreenerReplaceScreenerParams = SavedScreenerReplaceScreenerParams.none(),
    ): CompletableFuture<SavedScreenerReplaceScreenerResponse> =
        replaceScreener(screenerId, params, RequestOptions.none())

    /** @see replaceScreener */
    fun replaceScreener(
        params: SavedScreenerReplaceScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SavedScreenerReplaceScreenerResponse>

    /** @see replaceScreener */
    fun replaceScreener(
        params: SavedScreenerReplaceScreenerParams
    ): CompletableFuture<SavedScreenerReplaceScreenerResponse> =
        replaceScreener(params, RequestOptions.none())

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SavedScreenerReplaceScreenerResponse> =
        replaceScreener(screenerId, SavedScreenerReplaceScreenerParams.none(), requestOptions)

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
         * same as [SavedScreenerServiceAsync.getScreeners].
         */
        fun getScreeners(): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenersResponse>> =
            getScreeners(SavedScreenerGetScreenersParams.none())

        /** @see getScreeners */
        fun getScreeners(
            params: SavedScreenerGetScreenersParams = SavedScreenerGetScreenersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenersResponse>>

        /** @see getScreeners */
        fun getScreeners(
            params: SavedScreenerGetScreenersParams = SavedScreenerGetScreenersParams.none()
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenersResponse>> =
            getScreeners(params, RequestOptions.none())

        /** @see getScreeners */
        fun getScreeners(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenersResponse>> =
            getScreeners(SavedScreenerGetScreenersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /active/v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [SavedScreenerServiceAsync.replaceScreener].
         */
        fun replaceScreener(
            screenerId: String
        ): CompletableFuture<HttpResponseFor<SavedScreenerReplaceScreenerResponse>> =
            replaceScreener(screenerId, SavedScreenerReplaceScreenerParams.none())

        /** @see replaceScreener */
        fun replaceScreener(
            screenerId: String,
            params: SavedScreenerReplaceScreenerParams = SavedScreenerReplaceScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerReplaceScreenerResponse>> =
            replaceScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see replaceScreener */
        fun replaceScreener(
            screenerId: String,
            params: SavedScreenerReplaceScreenerParams = SavedScreenerReplaceScreenerParams.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerReplaceScreenerResponse>> =
            replaceScreener(screenerId, params, RequestOptions.none())

        /** @see replaceScreener */
        fun replaceScreener(
            params: SavedScreenerReplaceScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SavedScreenerReplaceScreenerResponse>>

        /** @see replaceScreener */
        fun replaceScreener(
            params: SavedScreenerReplaceScreenerParams
        ): CompletableFuture<HttpResponseFor<SavedScreenerReplaceScreenerResponse>> =
            replaceScreener(params, RequestOptions.none())

        /** @see replaceScreener */
        fun replaceScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SavedScreenerReplaceScreenerResponse>> =
            replaceScreener(screenerId, SavedScreenerReplaceScreenerParams.none(), requestOptions)
    }
}
