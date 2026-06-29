// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.Params
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Search instruments using structured filters.
 *
 * Returns a columnar response where each row is an array of column objects. Each column contains a
 * human-readable name, a field reference, an optional type hint (e.g. `CURR_USD`, `PERCENT`), and
 * the value.
 *
 * Use `columns` to select which columns appear in each row. When omitted, the default field set is
 * returned.
 */
class ScreenerSearchScreenerParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Subset of fields to include in the response.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columns(): Optional<List<FieldRef>> = body.columns()

    /**
     * Filter conditions to apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<List<SearchFilter>> = body.filters()

    /**
     * The number of items to return per page (only used when page_token is not provided)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * Token for retrieving the next page of results. Contains encoded pagination state (limit +
     * offset). When provided, page_size is ignored.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageToken(): Optional<String> = body.pageToken()

    /**
     * Whether string sorts should be case-sensitive (default: false).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortCaseSensitive(): Optional<Boolean> = body.sortCaseSensitive()

    /**
     * Multi-field sort specifications.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sorts(): Optional<List<SortSpec>> = body.sorts()

    /**
     * Returns the raw JSON value of [columns].
     *
     * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _columns(): JsonField<List<FieldRef>> = body._columns()

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filters(): JsonField<List<SearchFilter>> = body._filters()

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageSize(): JsonField<Long> = body._pageSize()

    /**
     * Returns the raw JSON value of [pageToken].
     *
     * Unlike [pageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageToken(): JsonField<String> = body._pageToken()

    /**
     * Returns the raw JSON value of [sortCaseSensitive].
     *
     * Unlike [sortCaseSensitive], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sortCaseSensitive(): JsonField<Boolean> = body._sortCaseSensitive()

    /**
     * Returns the raw JSON value of [sorts].
     *
     * Unlike [sorts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sorts(): JsonField<List<SortSpec>> = body._sorts()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ScreenerSearchScreenerParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ScreenerSearchScreenerParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScreenerSearchScreenerParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(screenerSearchScreenerParams: ScreenerSearchScreenerParams) = apply {
            body = screenerSearchScreenerParams.body.toBuilder()
            additionalHeaders = screenerSearchScreenerParams.additionalHeaders.toBuilder()
            additionalQueryParams = screenerSearchScreenerParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [columns]
         * - [filters]
         * - [pageSize]
         * - [pageToken]
         * - [sortCaseSensitive]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Subset of fields to include in the response. */
        fun columns(columns: List<FieldRef>?) = apply { body.columns(columns) }

        /** Alias for calling [Builder.columns] with `columns.orElse(null)`. */
        fun columns(columns: Optional<List<FieldRef>>) = columns(columns.getOrNull())

        /**
         * Sets [Builder.columns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columns] with a well-typed `List<FieldRef>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun columns(columns: JsonField<List<FieldRef>>) = apply { body.columns(columns) }

        /**
         * Adds a single [FieldRef] to [columns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumn(column: FieldRef) = apply { body.addColumn(column) }

        /** Filter conditions to apply. */
        fun filters(filters: List<SearchFilter>?) = apply { body.filters(filters) }

        /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
        fun filters(filters: Optional<List<SearchFilter>>) = filters(filters.getOrNull())

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<SearchFilter>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filters(filters: JsonField<List<SearchFilter>>) = apply { body.filters(filters) }

        /**
         * Adds a single [SearchFilter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: SearchFilter) = apply { body.addFilter(filter) }

        /** The number of items to return per page (only used when page_token is not provided) */
        fun pageSize(pageSize: Long?) = apply { body.pageSize(pageSize) }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

        /**
         * Token for retrieving the next page of results. Contains encoded pagination state (limit +
         * offset). When provided, page_size is ignored.
         */
        fun pageToken(pageToken: String?) = apply { body.pageToken(pageToken) }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /**
         * Sets [Builder.pageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pageToken(pageToken: JsonField<String>) = apply { body.pageToken(pageToken) }

        /** Whether string sorts should be case-sensitive (default: false). */
        fun sortCaseSensitive(sortCaseSensitive: Boolean?) = apply {
            body.sortCaseSensitive(sortCaseSensitive)
        }

        /**
         * Alias for [Builder.sortCaseSensitive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sortCaseSensitive(sortCaseSensitive: Boolean) =
            sortCaseSensitive(sortCaseSensitive as Boolean?)

        /** Alias for calling [Builder.sortCaseSensitive] with `sortCaseSensitive.orElse(null)`. */
        fun sortCaseSensitive(sortCaseSensitive: Optional<Boolean>) =
            sortCaseSensitive(sortCaseSensitive.getOrNull())

        /**
         * Sets [Builder.sortCaseSensitive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortCaseSensitive] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sortCaseSensitive(sortCaseSensitive: JsonField<Boolean>) = apply {
            body.sortCaseSensitive(sortCaseSensitive)
        }

        /** Multi-field sort specifications. */
        fun sorts(sorts: List<SortSpec>?) = apply { body.sorts(sorts) }

        /** Alias for calling [Builder.sorts] with `sorts.orElse(null)`. */
        fun sorts(sorts: Optional<List<SortSpec>>) = sorts(sorts.getOrNull())

        /**
         * Sets [Builder.sorts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sorts] with a well-typed `List<SortSpec>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sorts(sorts: JsonField<List<SortSpec>>) = apply { body.sorts(sorts) }

        /**
         * Adds a single [SortSpec] to [sorts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: SortSpec) = apply { body.addSort(sort) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ScreenerSearchScreenerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScreenerSearchScreenerParams =
            ScreenerSearchScreenerParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for POST /screener. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val columns: JsonField<List<FieldRef>>,
        private val filters: JsonField<List<SearchFilter>>,
        private val pageSize: JsonField<Long>,
        private val pageToken: JsonField<String>,
        private val sortCaseSensitive: JsonField<Boolean>,
        private val sorts: JsonField<List<SortSpec>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("columns")
            @ExcludeMissing
            columns: JsonField<List<FieldRef>> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<SearchFilter>> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_token")
            @ExcludeMissing
            pageToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sort_case_sensitive")
            @ExcludeMissing
            sortCaseSensitive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sorts")
            @ExcludeMissing
            sorts: JsonField<List<SortSpec>> = JsonMissing.of(),
        ) : this(columns, filters, pageSize, pageToken, sortCaseSensitive, sorts, mutableMapOf())

        /**
         * Subset of fields to include in the response.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun columns(): Optional<List<FieldRef>> = columns.getOptional("columns")

        /**
         * Filter conditions to apply.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filters(): Optional<List<SearchFilter>> = filters.getOptional("filters")

        /**
         * The number of items to return per page (only used when page_token is not provided)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * Token for retrieving the next page of results. Contains encoded pagination state (limit +
         * offset). When provided, page_size is ignored.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageToken(): Optional<String> = pageToken.getOptional("page_token")

        /**
         * Whether string sorts should be case-sensitive (default: false).
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sortCaseSensitive(): Optional<Boolean> =
            sortCaseSensitive.getOptional("sort_case_sensitive")

        /**
         * Multi-field sort specifications.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sorts(): Optional<List<SortSpec>> = sorts.getOptional("sorts")

        /**
         * Returns the raw JSON value of [columns].
         *
         * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("columns") @ExcludeMissing fun _columns(): JsonField<List<FieldRef>> = columns

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun _filters(): JsonField<List<SearchFilter>> = filters

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [pageToken].
         *
         * Unlike [pageToken], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_token") @ExcludeMissing fun _pageToken(): JsonField<String> = pageToken

        /**
         * Returns the raw JSON value of [sortCaseSensitive].
         *
         * Unlike [sortCaseSensitive], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sort_case_sensitive")
        @ExcludeMissing
        fun _sortCaseSensitive(): JsonField<Boolean> = sortCaseSensitive

        /**
         * Returns the raw JSON value of [sorts].
         *
         * Unlike [sorts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sorts") @ExcludeMissing fun _sorts(): JsonField<List<SortSpec>> = sorts

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var columns: JsonField<MutableList<FieldRef>>? = null
            private var filters: JsonField<MutableList<SearchFilter>>? = null
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var pageToken: JsonField<String> = JsonMissing.of()
            private var sortCaseSensitive: JsonField<Boolean> = JsonMissing.of()
            private var sorts: JsonField<MutableList<SortSpec>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                columns = body.columns.map { it.toMutableList() }
                filters = body.filters.map { it.toMutableList() }
                pageSize = body.pageSize
                pageToken = body.pageToken
                sortCaseSensitive = body.sortCaseSensitive
                sorts = body.sorts.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Subset of fields to include in the response. */
            fun columns(columns: List<FieldRef>?) = columns(JsonField.ofNullable(columns))

            /** Alias for calling [Builder.columns] with `columns.orElse(null)`. */
            fun columns(columns: Optional<List<FieldRef>>) = columns(columns.getOrNull())

            /**
             * Sets [Builder.columns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.columns] with a well-typed `List<FieldRef>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun columns(columns: JsonField<List<FieldRef>>) = apply {
                this.columns = columns.map { it.toMutableList() }
            }

            /**
             * Adds a single [FieldRef] to [columns].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addColumn(column: FieldRef) = apply {
                columns =
                    (columns ?: JsonField.of(mutableListOf())).also {
                        checkKnown("columns", it).add(column)
                    }
            }

            /** Filter conditions to apply. */
            fun filters(filters: List<SearchFilter>?) = filters(JsonField.ofNullable(filters))

            /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
            fun filters(filters: Optional<List<SearchFilter>>) = filters(filters.getOrNull())

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<SearchFilter>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun filters(filters: JsonField<List<SearchFilter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [SearchFilter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: SearchFilter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

            /**
             * The number of items to return per page (only used when page_token is not provided)
             */
            fun pageSize(pageSize: Long?) = pageSize(JsonField.ofNullable(pageSize))

            /**
             * Alias for [Builder.pageSize].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

            /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
            fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            /**
             * Token for retrieving the next page of results. Contains encoded pagination state
             * (limit + offset). When provided, page_size is ignored.
             */
            fun pageToken(pageToken: String?) = pageToken(JsonField.ofNullable(pageToken))

            /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
            fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

            /**
             * Sets [Builder.pageToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageToken] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageToken(pageToken: JsonField<String>) = apply { this.pageToken = pageToken }

            /** Whether string sorts should be case-sensitive (default: false). */
            fun sortCaseSensitive(sortCaseSensitive: Boolean?) =
                sortCaseSensitive(JsonField.ofNullable(sortCaseSensitive))

            /**
             * Alias for [Builder.sortCaseSensitive].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sortCaseSensitive(sortCaseSensitive: Boolean) =
                sortCaseSensitive(sortCaseSensitive as Boolean?)

            /**
             * Alias for calling [Builder.sortCaseSensitive] with `sortCaseSensitive.orElse(null)`.
             */
            fun sortCaseSensitive(sortCaseSensitive: Optional<Boolean>) =
                sortCaseSensitive(sortCaseSensitive.getOrNull())

            /**
             * Sets [Builder.sortCaseSensitive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortCaseSensitive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortCaseSensitive(sortCaseSensitive: JsonField<Boolean>) = apply {
                this.sortCaseSensitive = sortCaseSensitive
            }

            /** Multi-field sort specifications. */
            fun sorts(sorts: List<SortSpec>?) = sorts(JsonField.ofNullable(sorts))

            /** Alias for calling [Builder.sorts] with `sorts.orElse(null)`. */
            fun sorts(sorts: Optional<List<SortSpec>>) = sorts(sorts.getOrNull())

            /**
             * Sets [Builder.sorts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sorts] with a well-typed `List<SortSpec>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sorts(sorts: JsonField<List<SortSpec>>) = apply {
                this.sorts = sorts.map { it.toMutableList() }
            }

            /**
             * Adds a single [SortSpec] to [sorts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSort(sort: SortSpec) = apply {
                sorts =
                    (sorts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sorts", it).add(sort)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (columns ?: JsonMissing.of()).map { it.toImmutable() },
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    pageSize,
                    pageToken,
                    sortCaseSensitive,
                    (sorts ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            columns().ifPresent { it.forEach { it.validate() } }
            filters().ifPresent { it.forEach { it.validate() } }
            pageSize()
            pageToken()
            sortCaseSensitive()
            sorts().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ClearStreetInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (columns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (pageToken.asKnown().isPresent) 1 else 0) +
                (if (sortCaseSensitive.asKnown().isPresent) 1 else 0) +
                (sorts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                columns == other.columns &&
                filters == other.filters &&
                pageSize == other.pageSize &&
                pageToken == other.pageToken &&
                sortCaseSensitive == other.sortCaseSensitive &&
                sorts == other.sorts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                columns,
                filters,
                pageSize,
                pageToken,
                sortCaseSensitive,
                sorts,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{columns=$columns, filters=$filters, pageSize=$pageSize, pageToken=$pageToken, sortCaseSensitive=$sortCaseSensitive, sorts=$sorts, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScreenerSearchScreenerParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ScreenerSearchScreenerParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
