// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerDeleteScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerByIdParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerByIdResponse
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerCatalogParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerCatalogResponse
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenersParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenersResponse
import com.clearstreet.api.models.v1.screener.ScreenerPatchScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerPatchScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Search instruments and manage saved screeners. */
interface ScreenerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerServiceAsync

    /**
     * Create a saved screener configuration.
     *
     * Persists a screener configuration for the authenticated user.
     */
    fun createScreener(): CompletableFuture<ScreenerCreateScreenerResponse> =
        createScreener(ScreenerCreateScreenerParams.none())

    /** @see createScreener */
    fun createScreener(
        params: ScreenerCreateScreenerParams = ScreenerCreateScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerCreateScreenerResponse>

    /** @see createScreener */
    fun createScreener(
        params: ScreenerCreateScreenerParams = ScreenerCreateScreenerParams.none()
    ): CompletableFuture<ScreenerCreateScreenerResponse> =
        createScreener(params, RequestOptions.none())

    /** @see createScreener */
    fun createScreener(
        requestOptions: RequestOptions
    ): CompletableFuture<ScreenerCreateScreenerResponse> =
        createScreener(ScreenerCreateScreenerParams.none(), requestOptions)

    /**
     * Delete a saved screener configuration.
     *
     * Deletes the screener configuration for the authenticated user.
     */
    fun deleteScreener(screenerId: String): CompletableFuture<Void?> =
        deleteScreener(screenerId, ScreenerDeleteScreenerParams.none())

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        params: ScreenerDeleteScreenerParams = ScreenerDeleteScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        params: ScreenerDeleteScreenerParams = ScreenerDeleteScreenerParams.none(),
    ): CompletableFuture<Void?> = deleteScreener(screenerId, params, RequestOptions.none())

    /** @see deleteScreener */
    fun deleteScreener(
        params: ScreenerDeleteScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteScreener */
    fun deleteScreener(params: ScreenerDeleteScreenerParams): CompletableFuture<Void?> =
        deleteScreener(params, RequestOptions.none())

    /** @see deleteScreener */
    fun deleteScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteScreener(screenerId, ScreenerDeleteScreenerParams.none(), requestOptions)

    /**
     * Get a saved screener configuration by ID.
     *
     * Returns a single screener configuration for the authenticated user.
     */
    fun getScreenerById(screenerId: String): CompletableFuture<ScreenerGetScreenerByIdResponse> =
        getScreenerById(screenerId, ScreenerGetScreenerByIdParams.none())

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        params: ScreenerGetScreenerByIdParams = ScreenerGetScreenerByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerGetScreenerByIdResponse> =
        getScreenerById(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        params: ScreenerGetScreenerByIdParams = ScreenerGetScreenerByIdParams.none(),
    ): CompletableFuture<ScreenerGetScreenerByIdResponse> =
        getScreenerById(screenerId, params, RequestOptions.none())

    /** @see getScreenerById */
    fun getScreenerById(
        params: ScreenerGetScreenerByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerGetScreenerByIdResponse>

    /** @see getScreenerById */
    fun getScreenerById(
        params: ScreenerGetScreenerByIdParams
    ): CompletableFuture<ScreenerGetScreenerByIdResponse> =
        getScreenerById(params, RequestOptions.none())

    /** @see getScreenerById */
    fun getScreenerById(
        screenerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerGetScreenerByIdResponse> =
        getScreenerById(screenerId, ScreenerGetScreenerByIdParams.none(), requestOptions)

    /**
     * Returns the complete screener field catalog: the field `kinds`, the per-field data, the enum
     * universes, the request-side `rules`, the built-in variables and modifiers, and the `POST
     * /screener` default response fields.
     *
     * `POST /screener` field references are validated against this catalog; its `rules` object
     * documents how to compose a valid request.
     */
    fun getScreenerCatalog(): CompletableFuture<ScreenerGetScreenerCatalogResponse> =
        getScreenerCatalog(ScreenerGetScreenerCatalogParams.none())

    /** @see getScreenerCatalog */
    fun getScreenerCatalog(
        params: ScreenerGetScreenerCatalogParams = ScreenerGetScreenerCatalogParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerGetScreenerCatalogResponse>

    /** @see getScreenerCatalog */
    fun getScreenerCatalog(
        params: ScreenerGetScreenerCatalogParams = ScreenerGetScreenerCatalogParams.none()
    ): CompletableFuture<ScreenerGetScreenerCatalogResponse> =
        getScreenerCatalog(params, RequestOptions.none())

    /** @see getScreenerCatalog */
    fun getScreenerCatalog(
        requestOptions: RequestOptions
    ): CompletableFuture<ScreenerGetScreenerCatalogResponse> =
        getScreenerCatalog(ScreenerGetScreenerCatalogParams.none(), requestOptions)

    /**
     * List saved screener configurations.
     *
     * Returns all screener configurations for the authenticated user.
     */
    fun getScreeners(): CompletableFuture<ScreenerGetScreenersResponse> =
        getScreeners(ScreenerGetScreenersParams.none())

    /** @see getScreeners */
    fun getScreeners(
        params: ScreenerGetScreenersParams = ScreenerGetScreenersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerGetScreenersResponse>

    /** @see getScreeners */
    fun getScreeners(
        params: ScreenerGetScreenersParams = ScreenerGetScreenersParams.none()
    ): CompletableFuture<ScreenerGetScreenersResponse> = getScreeners(params, RequestOptions.none())

    /** @see getScreeners */
    fun getScreeners(
        requestOptions: RequestOptions
    ): CompletableFuture<ScreenerGetScreenersResponse> =
        getScreeners(ScreenerGetScreenersParams.none(), requestOptions)

    /**
     * Partially update a saved screener configuration.
     *
     * Every field is optional. Omitting a field, or sending it as `null`, leaves the stored value
     * unchanged. Sending a field's empty value clears it: `columns: []` clears the stored columns,
     * `sorts: []` clears the stored sort, and `filters: []` clears the stored filters. `name: ""`
     * is rejected -- a screener's name cannot be cleared. `shared: false` sets it to `false`; it is
     * a value, not a clear.
     *
     * Unknown fields are rejected with a 422.
     */
    fun patchScreener(screenerId: String): CompletableFuture<ScreenerPatchScreenerResponse> =
        patchScreener(screenerId, ScreenerPatchScreenerParams.none())

    /** @see patchScreener */
    fun patchScreener(
        screenerId: String,
        params: ScreenerPatchScreenerParams = ScreenerPatchScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerPatchScreenerResponse> =
        patchScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see patchScreener */
    fun patchScreener(
        screenerId: String,
        params: ScreenerPatchScreenerParams = ScreenerPatchScreenerParams.none(),
    ): CompletableFuture<ScreenerPatchScreenerResponse> =
        patchScreener(screenerId, params, RequestOptions.none())

    /** @see patchScreener */
    fun patchScreener(
        params: ScreenerPatchScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerPatchScreenerResponse>

    /** @see patchScreener */
    fun patchScreener(
        params: ScreenerPatchScreenerParams
    ): CompletableFuture<ScreenerPatchScreenerResponse> =
        patchScreener(params, RequestOptions.none())

    /** @see patchScreener */
    fun patchScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerPatchScreenerResponse> =
        patchScreener(screenerId, ScreenerPatchScreenerParams.none(), requestOptions)

    /**
     * Update a saved screener configuration.
     *
     * Replaces the screener configuration for the authenticated user. If `name` is null, the
     * existing name is preserved.
     *
     * Deprecated -- use `PATCH /saved-screeners/{screener_id}`; PUT replaces omitted `columns`,
     * `filters` and `sorts` with empty values.
     */
    @Deprecated("deprecated")
    fun replaceScreener(screenerId: String): CompletableFuture<ScreenerReplaceScreenerResponse> =
        replaceScreener(screenerId, ScreenerReplaceScreenerParams.none())

    /** @see replaceScreener */
    @Deprecated("deprecated")
    fun replaceScreener(
        screenerId: String,
        params: ScreenerReplaceScreenerParams = ScreenerReplaceScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerReplaceScreenerResponse> =
        replaceScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

    /** @see replaceScreener */
    @Deprecated("deprecated")
    fun replaceScreener(
        screenerId: String,
        params: ScreenerReplaceScreenerParams = ScreenerReplaceScreenerParams.none(),
    ): CompletableFuture<ScreenerReplaceScreenerResponse> =
        replaceScreener(screenerId, params, RequestOptions.none())

    /** @see replaceScreener */
    @Deprecated("deprecated")
    fun replaceScreener(
        params: ScreenerReplaceScreenerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerReplaceScreenerResponse>

    /** @see replaceScreener */
    @Deprecated("deprecated")
    fun replaceScreener(
        params: ScreenerReplaceScreenerParams
    ): CompletableFuture<ScreenerReplaceScreenerResponse> =
        replaceScreener(params, RequestOptions.none())

    /** @see replaceScreener */
    @Deprecated("deprecated")
    fun replaceScreener(
        screenerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerReplaceScreenerResponse> =
        replaceScreener(screenerId, ScreenerReplaceScreenerParams.none(), requestOptions)

    /**
     * Search instruments using structured filters.
     *
     * Compose a request with `filters`, plus optional `sorts`, `columns`, and
     * `page_size`/`page_token` for pagination. Each filter pairs a field reference (`left`) with an
     * operator (`op`, e.g. `GREATER_OR_EQUAL`, `BETWEEN`) and comparison values (`right`), which
     * can be literals or date variables such as `today` with a modifier. Field names, periods, and
     * lookbacks come from the screener field catalog. `sorts` order results; `columns` selects
     * which fields appear in each row (the default field set when omitted).
     *
     * The response is a paginated, columnar list of matching instruments. Each row is an array of
     * column objects, each with a display `name`, the `field` reference, an optional value `type`
     * hint (e.g. `CURR_USD`, `PERCENT`), and the `value`. An `instrument_id` column is always
     * prepended. Metadata carries `total_items`, `total_pages`, and `next_page_token` for paging.
     *
     * Due to the volatility of screener responses we recommend reconciling page results since
     * results can shuffle between calls.
     */
    fun searchScreener(): CompletableFuture<ScreenerSearchScreenerResponse> =
        searchScreener(ScreenerSearchScreenerParams.none())

    /** @see searchScreener */
    fun searchScreener(
        params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerSearchScreenerResponse>

    /** @see searchScreener */
    fun searchScreener(
        params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none()
    ): CompletableFuture<ScreenerSearchScreenerResponse> =
        searchScreener(params, RequestOptions.none())

    /** @see searchScreener */
    fun searchScreener(
        requestOptions: RequestOptions
    ): CompletableFuture<ScreenerSearchScreenerResponse> =
        searchScreener(ScreenerSearchScreenerParams.none(), requestOptions)

    /**
     * A view of [ScreenerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScreenerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/saved-screeners`, but is otherwise the same as
         * [ScreenerServiceAsync.createScreener].
         */
        fun createScreener(): CompletableFuture<HttpResponseFor<ScreenerCreateScreenerResponse>> =
            createScreener(ScreenerCreateScreenerParams.none())

        /** @see createScreener */
        fun createScreener(
            params: ScreenerCreateScreenerParams = ScreenerCreateScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerCreateScreenerResponse>>

        /** @see createScreener */
        fun createScreener(
            params: ScreenerCreateScreenerParams = ScreenerCreateScreenerParams.none()
        ): CompletableFuture<HttpResponseFor<ScreenerCreateScreenerResponse>> =
            createScreener(params, RequestOptions.none())

        /** @see createScreener */
        fun createScreener(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScreenerCreateScreenerResponse>> =
            createScreener(ScreenerCreateScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [ScreenerServiceAsync.deleteScreener].
         */
        fun deleteScreener(screenerId: String): CompletableFuture<HttpResponse> =
            deleteScreener(screenerId, ScreenerDeleteScreenerParams.none())

        /** @see deleteScreener */
        fun deleteScreener(
            screenerId: String,
            params: ScreenerDeleteScreenerParams = ScreenerDeleteScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see deleteScreener */
        fun deleteScreener(
            screenerId: String,
            params: ScreenerDeleteScreenerParams = ScreenerDeleteScreenerParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteScreener(screenerId, params, RequestOptions.none())

        /** @see deleteScreener */
        fun deleteScreener(
            params: ScreenerDeleteScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteScreener */
        fun deleteScreener(params: ScreenerDeleteScreenerParams): CompletableFuture<HttpResponse> =
            deleteScreener(params, RequestOptions.none())

        /** @see deleteScreener */
        fun deleteScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteScreener(screenerId, ScreenerDeleteScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/saved-screeners/{screener_id}`, but is otherwise
         * the same as [ScreenerServiceAsync.getScreenerById].
         */
        fun getScreenerById(
            screenerId: String
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerByIdResponse>> =
            getScreenerById(screenerId, ScreenerGetScreenerByIdParams.none())

        /** @see getScreenerById */
        fun getScreenerById(
            screenerId: String,
            params: ScreenerGetScreenerByIdParams = ScreenerGetScreenerByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerByIdResponse>> =
            getScreenerById(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see getScreenerById */
        fun getScreenerById(
            screenerId: String,
            params: ScreenerGetScreenerByIdParams = ScreenerGetScreenerByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerByIdResponse>> =
            getScreenerById(screenerId, params, RequestOptions.none())

        /** @see getScreenerById */
        fun getScreenerById(
            params: ScreenerGetScreenerByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerByIdResponse>>

        /** @see getScreenerById */
        fun getScreenerById(
            params: ScreenerGetScreenerByIdParams
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerByIdResponse>> =
            getScreenerById(params, RequestOptions.none())

        /** @see getScreenerById */
        fun getScreenerById(
            screenerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerByIdResponse>> =
            getScreenerById(screenerId, ScreenerGetScreenerByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/screener/catalog`, but is otherwise the same as
         * [ScreenerServiceAsync.getScreenerCatalog].
         */
        fun getScreenerCatalog():
            CompletableFuture<HttpResponseFor<ScreenerGetScreenerCatalogResponse>> =
            getScreenerCatalog(ScreenerGetScreenerCatalogParams.none())

        /** @see getScreenerCatalog */
        fun getScreenerCatalog(
            params: ScreenerGetScreenerCatalogParams = ScreenerGetScreenerCatalogParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerCatalogResponse>>

        /** @see getScreenerCatalog */
        fun getScreenerCatalog(
            params: ScreenerGetScreenerCatalogParams = ScreenerGetScreenerCatalogParams.none()
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerCatalogResponse>> =
            getScreenerCatalog(params, RequestOptions.none())

        /** @see getScreenerCatalog */
        fun getScreenerCatalog(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerCatalogResponse>> =
            getScreenerCatalog(ScreenerGetScreenerCatalogParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/saved-screeners`, but is otherwise the same as
         * [ScreenerServiceAsync.getScreeners].
         */
        fun getScreeners(): CompletableFuture<HttpResponseFor<ScreenerGetScreenersResponse>> =
            getScreeners(ScreenerGetScreenersParams.none())

        /** @see getScreeners */
        fun getScreeners(
            params: ScreenerGetScreenersParams = ScreenerGetScreenersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenersResponse>>

        /** @see getScreeners */
        fun getScreeners(
            params: ScreenerGetScreenersParams = ScreenerGetScreenersParams.none()
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenersResponse>> =
            getScreeners(params, RequestOptions.none())

        /** @see getScreeners */
        fun getScreeners(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenersResponse>> =
            getScreeners(ScreenerGetScreenersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/saved-screeners/{screener_id}`, but is
         * otherwise the same as [ScreenerServiceAsync.patchScreener].
         */
        fun patchScreener(
            screenerId: String
        ): CompletableFuture<HttpResponseFor<ScreenerPatchScreenerResponse>> =
            patchScreener(screenerId, ScreenerPatchScreenerParams.none())

        /** @see patchScreener */
        fun patchScreener(
            screenerId: String,
            params: ScreenerPatchScreenerParams = ScreenerPatchScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerPatchScreenerResponse>> =
            patchScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see patchScreener */
        fun patchScreener(
            screenerId: String,
            params: ScreenerPatchScreenerParams = ScreenerPatchScreenerParams.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerPatchScreenerResponse>> =
            patchScreener(screenerId, params, RequestOptions.none())

        /** @see patchScreener */
        fun patchScreener(
            params: ScreenerPatchScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerPatchScreenerResponse>>

        /** @see patchScreener */
        fun patchScreener(
            params: ScreenerPatchScreenerParams
        ): CompletableFuture<HttpResponseFor<ScreenerPatchScreenerResponse>> =
            patchScreener(params, RequestOptions.none())

        /** @see patchScreener */
        fun patchScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerPatchScreenerResponse>> =
            patchScreener(screenerId, ScreenerPatchScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/saved-screeners/{screener_id}`, but is otherwise
         * the same as [ScreenerServiceAsync.replaceScreener].
         */
        @Deprecated("deprecated")
        fun replaceScreener(
            screenerId: String
        ): CompletableFuture<HttpResponseFor<ScreenerReplaceScreenerResponse>> =
            replaceScreener(screenerId, ScreenerReplaceScreenerParams.none())

        /** @see replaceScreener */
        @Deprecated("deprecated")
        fun replaceScreener(
            screenerId: String,
            params: ScreenerReplaceScreenerParams = ScreenerReplaceScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerReplaceScreenerResponse>> =
            replaceScreener(params.toBuilder().screenerId(screenerId).build(), requestOptions)

        /** @see replaceScreener */
        @Deprecated("deprecated")
        fun replaceScreener(
            screenerId: String,
            params: ScreenerReplaceScreenerParams = ScreenerReplaceScreenerParams.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerReplaceScreenerResponse>> =
            replaceScreener(screenerId, params, RequestOptions.none())

        /** @see replaceScreener */
        @Deprecated("deprecated")
        fun replaceScreener(
            params: ScreenerReplaceScreenerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerReplaceScreenerResponse>>

        /** @see replaceScreener */
        @Deprecated("deprecated")
        fun replaceScreener(
            params: ScreenerReplaceScreenerParams
        ): CompletableFuture<HttpResponseFor<ScreenerReplaceScreenerResponse>> =
            replaceScreener(params, RequestOptions.none())

        /** @see replaceScreener */
        @Deprecated("deprecated")
        fun replaceScreener(
            screenerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerReplaceScreenerResponse>> =
            replaceScreener(screenerId, ScreenerReplaceScreenerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/screener`, but is otherwise the same as
         * [ScreenerServiceAsync.searchScreener].
         */
        fun searchScreener(): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>> =
            searchScreener(ScreenerSearchScreenerParams.none())

        /** @see searchScreener */
        fun searchScreener(
            params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>>

        /** @see searchScreener */
        fun searchScreener(
            params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none()
        ): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>> =
            searchScreener(params, RequestOptions.none())

        /** @see searchScreener */
        fun searchScreener(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>> =
            searchScreener(ScreenerSearchScreenerParams.none(), requestOptions)
    }
}
