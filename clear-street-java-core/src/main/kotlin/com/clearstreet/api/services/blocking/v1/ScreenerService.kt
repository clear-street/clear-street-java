// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerDeleteScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerByIdParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerByIdResponse
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenersParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenersResponse
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Search instruments and manage saved screeners. */
interface ScreenerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerService

    /**
     * Create a saved screener configuration.
     *
     * Persists a screener configuration for the authenticated user.
     */
    fun createScreener(): ScreenerCreateScreenerResponse =
        createScreener(ScreenerCreateScreenerParams.none())

    /** @see createScreener */
    fun createScreener(
        params: ScreenerCreateScreenerParams = ScreenerCreateScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScreenerCreateScreenerResponse

    /** @see createScreener */
    fun createScreener(
        params: ScreenerCreateScreenerParams = ScreenerCreateScreenerParams.none()
    ): ScreenerCreateScreenerResponse = createScreener(params, RequestOptions.none())

    /** @see createScreener */
    fun createScreener(requestOptions: RequestOptions): ScreenerCreateScreenerResponse =
        createScreener(ScreenerCreateScreenerParams.none(), requestOptions)

    /**
     * Delete a saved screener configuration.
     *
     * Deletes the screener configuration for the authenticated user.
     */
    fun deleteScreener(screenerId: String) =
        deleteScreener(screenerId, ScreenerDeleteScreenerParams.none())

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        params: ScreenerDeleteScreenerParams = ScreenerDeleteScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        params: ScreenerDeleteScreenerParams = ScreenerDeleteScreenerParams.none(),
    ) = deleteScreener(screenerId, params, RequestOptions.none())

    /** @see deleteScreener */
    fun deleteScreener(
        params: ScreenerDeleteScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteScreener */
    fun deleteScreener(params: ScreenerDeleteScreenerParams) =
        deleteScreener(params, RequestOptions.none())

    /** @see deleteScreener */
    fun deleteScreener(screenerId: String, requestOptions: RequestOptions) =
        deleteScreener(screenerId, ScreenerDeleteScreenerParams.none(), requestOptions)

    /**
     * Get a saved screener configuration by ID.
     *
     * Returns a single screener configuration for the authenticated user.
     */
    fun getScreenerById(screenerId: String): ScreenerGetScreenerByIdResponse =
        getScreenerById(screenerId, ScreenerGetScreenerByIdParams.none())

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        params: ScreenerGetScreenerByIdParams = ScreenerGetScreenerByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScreenerGetScreenerByIdResponse =
        getScreenerById(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        params: ScreenerGetScreenerByIdParams = ScreenerGetScreenerByIdParams.none(),
    ): ScreenerGetScreenerByIdResponse = getScreenerById(screenerId, params, RequestOptions.none())

    /** @see getScreenerById */
    fun getScreenerById(
        params: ScreenerGetScreenerByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScreenerGetScreenerByIdResponse

    /** @see getScreenerById */
    fun getScreenerById(params: ScreenerGetScreenerByIdParams): ScreenerGetScreenerByIdResponse =
        getScreenerById(params, RequestOptions.none())

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        requestOptions: RequestOptions,
    ): ScreenerGetScreenerByIdResponse =
        getScreenerById(screenerId, ScreenerGetScreenerByIdParams.none(), requestOptions)

    /**
     * List saved screener configurations.
     *
     * Returns all screener configurations for the authenticated user.
     */
    fun getScreeners(): ScreenerGetScreenersResponse =
        getScreeners(ScreenerGetScreenersParams.none())

    /** @see getScreeners */
    fun getScreeners(
        params: ScreenerGetScreenersParams = ScreenerGetScreenersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScreenerGetScreenersResponse

    /** @see getScreeners */
    fun getScreeners(
        params: ScreenerGetScreenersParams = ScreenerGetScreenersParams.none()
    ): ScreenerGetScreenersResponse = getScreeners(params, RequestOptions.none())

    /** @see getScreeners */
    fun getScreeners(requestOptions: RequestOptions): ScreenerGetScreenersResponse =
        getScreeners(ScreenerGetScreenersParams.none(), requestOptions)

    /**
     * Update a saved screener configuration.
     *
     * Replaces the screener configuration for the authenticated user. If `name` is null, the
     * existing name is preserved.
     */
    fun replaceScreener(screenerId: String): ScreenerReplaceScreenerResponse =
        replaceScreener(screenerId, ScreenerReplaceScreenerParams.none())

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        params: ScreenerReplaceScreenerParams = ScreenerReplaceScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScreenerReplaceScreenerResponse =
        replaceScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        params: ScreenerReplaceScreenerParams = ScreenerReplaceScreenerParams.none(),
    ): ScreenerReplaceScreenerResponse = replaceScreener(screenerId, params, RequestOptions.none())

    /** @see replaceScreener */
    fun replaceScreener(
        params: ScreenerReplaceScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScreenerReplaceScreenerResponse

    /** @see replaceScreener */
    fun replaceScreener(params: ScreenerReplaceScreenerParams): ScreenerReplaceScreenerResponse =
        replaceScreener(params, RequestOptions.none())

    /** @see replaceScreener */
    fun replaceScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): ScreenerReplaceScreenerResponse =
        replaceScreener(screenerId, ScreenerReplaceScreenerParams.none(), requestOptions)

    /**
     * Search instruments using structured filters.
     *
     * Returns a columnar response where each row is an array of column objects. Each column
     * contains a human-readable name, a field reference, an optional type hint (e.g. `CURR_USD`,
     * `PERCENT`), and the value.
     *
     * Use `columns` to select which columns appear in each row. When omitted, the default field set
     * is returned.
     */
    fun searchScreener(): ScreenerSearchScreenerResponse =
        searchScreener(ScreenerSearchScreenerParams.none())

    /** @see searchScreener */
    fun searchScreener(
        params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScreenerSearchScreenerResponse

    /** @see searchScreener */
    fun searchScreener(
        params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none()
    ): ScreenerSearchScreenerResponse = searchScreener(params, RequestOptions.none())

    /** @see searchScreener */
    fun searchScreener(requestOptions: RequestOptions): ScreenerSearchScreenerResponse =
        searchScreener(ScreenerSearchScreenerParams.none(), requestOptions)

    /** A view of [ScreenerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/saved-screeners`, but is otherwise the same as
         * [ScreenerService.createScreener].
         */
        @MustBeClosed
        fun createScreener(): HttpResponseFor<ScreenerCreateScreenerResponse> =
            createScreener(ScreenerCreateScreenerParams.none())

        /** @see createScreener */
        @MustBeClosed
        fun createScreener(
            params: ScreenerCreateScreenerParams = ScreenerCreateScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScreenerCreateScreenerResponse>

        /** @see createScreener */
        @MustBeClosed
        fun createScreener(
            params: ScreenerCreateScreenerParams = ScreenerCreateScreenerParams.none()
        ): HttpResponseFor<ScreenerCreateScreenerResponse> =
            createScreener(params, RequestOptions.none())

        /** @see createScreener */
        @MustBeClosed
        fun createScreener(
            requestOptions: RequestOptions
        ): HttpResponseFor<ScreenerCreateScreenerResponse> =
            createScreener(ScreenerCreateScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [ScreenerService.deleteScreener].
         */
        @MustBeClosed
        fun deleteScreener(screenerId: String): HttpResponse =
            deleteScreener(screenerId, ScreenerDeleteScreenerParams.none())

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(
            screenerId: String,
            params: ScreenerDeleteScreenerParams = ScreenerDeleteScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(
            screenerId: String,
            params: ScreenerDeleteScreenerParams = ScreenerDeleteScreenerParams.none(),
        ): HttpResponse = deleteScreener(screenerId, params, RequestOptions.none())

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(
            params: ScreenerDeleteScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(params: ScreenerDeleteScreenerParams): HttpResponse =
            deleteScreener(params, RequestOptions.none())

        /** @see deleteScreener */
        @MustBeClosed
        fun deleteScreener(screenerId: String, requestOptions: RequestOptions): HttpResponse =
            deleteScreener(screenerId, ScreenerDeleteScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/saved-screeners/{screener_id}`, but is otherwise
         * the same as [ScreenerService.getScreenerById].
         */
        @MustBeClosed
        fun getScreenerById(screenerId: String): HttpResponseFor<ScreenerGetScreenerByIdResponse> =
            getScreenerById(screenerId, ScreenerGetScreenerByIdParams.none())

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            screenerId: String,
            params: ScreenerGetScreenerByIdParams = ScreenerGetScreenerByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScreenerGetScreenerByIdResponse> =
            getScreenerById(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            screenerId: String,
            params: ScreenerGetScreenerByIdParams = ScreenerGetScreenerByIdParams.none(),
        ): HttpResponseFor<ScreenerGetScreenerByIdResponse> =
            getScreenerById(screenerId, params, RequestOptions.none())

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            params: ScreenerGetScreenerByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScreenerGetScreenerByIdResponse>

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            params: ScreenerGetScreenerByIdParams
        ): HttpResponseFor<ScreenerGetScreenerByIdResponse> =
            getScreenerById(params, RequestOptions.none())

        /** @see getScreenerById */
        @MustBeClosed
        fun getScreenerById(
            screenerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScreenerGetScreenerByIdResponse> =
            getScreenerById(screenerId, ScreenerGetScreenerByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/saved-screeners`, but is otherwise the same as
         * [ScreenerService.getScreeners].
         */
        @MustBeClosed
        fun getScreeners(): HttpResponseFor<ScreenerGetScreenersResponse> =
            getScreeners(ScreenerGetScreenersParams.none())

        /** @see getScreeners */
        @MustBeClosed
        fun getScreeners(
            params: ScreenerGetScreenersParams = ScreenerGetScreenersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScreenerGetScreenersResponse>

        /** @see getScreeners */
        @MustBeClosed
        fun getScreeners(
            params: ScreenerGetScreenersParams = ScreenerGetScreenersParams.none()
        ): HttpResponseFor<ScreenerGetScreenersResponse> =
            getScreeners(params, RequestOptions.none())

        /** @see getScreeners */
        @MustBeClosed
        fun getScreeners(
            requestOptions: RequestOptions
        ): HttpResponseFor<ScreenerGetScreenersResponse> =
            getScreeners(ScreenerGetScreenersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/saved-screeners/{screener_id}`, but is otherwise
         * the same as [ScreenerService.replaceScreener].
         */
        @MustBeClosed
        fun replaceScreener(screenerId: String): HttpResponseFor<ScreenerReplaceScreenerResponse> =
            replaceScreener(screenerId, ScreenerReplaceScreenerParams.none())

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            screenerId: String,
            params: ScreenerReplaceScreenerParams = ScreenerReplaceScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScreenerReplaceScreenerResponse> =
            replaceScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            screenerId: String,
            params: ScreenerReplaceScreenerParams = ScreenerReplaceScreenerParams.none(),
        ): HttpResponseFor<ScreenerReplaceScreenerResponse> =
            replaceScreener(screenerId, params, RequestOptions.none())

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            params: ScreenerReplaceScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScreenerReplaceScreenerResponse>

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            params: ScreenerReplaceScreenerParams
        ): HttpResponseFor<ScreenerReplaceScreenerResponse> =
            replaceScreener(params, RequestOptions.none())

        /** @see replaceScreener */
        @MustBeClosed
        fun replaceScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScreenerReplaceScreenerResponse> =
            replaceScreener(screenerId, ScreenerReplaceScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/screener`, but is otherwise the same as
         * [ScreenerService.searchScreener].
         */
        @MustBeClosed
        fun searchScreener(): HttpResponseFor<ScreenerSearchScreenerResponse> =
            searchScreener(ScreenerSearchScreenerParams.none())

        /** @see searchScreener */
        @MustBeClosed
        fun searchScreener(
            params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScreenerSearchScreenerResponse>

        /** @see searchScreener */
        @MustBeClosed
        fun searchScreener(
            params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none()
        ): HttpResponseFor<ScreenerSearchScreenerResponse> =
            searchScreener(params, RequestOptions.none())

        /** @see searchScreener */
        @MustBeClosed
        fun searchScreener(
            requestOptions: RequestOptions
        ): HttpResponseFor<ScreenerSearchScreenerResponse> =
            searchScreener(ScreenerSearchScreenerParams.none(), requestOptions)
    }
}
