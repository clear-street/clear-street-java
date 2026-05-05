// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.screener

import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.Params
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
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
 * Use `field_filter` to select which columns appear in each row. When omitted, the default field
 * set is returned.
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
    fun fieldFilter(): Optional<List<FieldRef>> = body.fieldFilter()

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
     * Field to sort results by.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortBy(): Optional<FieldRef> = body.sortBy()

    /**
     * Whether string sorts should be case-sensitive (default: false).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortCaseSensitive(): Optional<Boolean> = body.sortCaseSensitive()

    /**
     * Sort direction (defaults to DESC).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortDirection(): Optional<SortDirection> = body.sortDirection()

    /**
     * Multi-field sort specifications. When present, takes precedence over sort_by/sort_direction.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sorts(): Optional<List<Sort>> = body.sorts()

    /**
     * Returns the raw JSON value of [fieldFilter].
     *
     * Unlike [fieldFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fieldFilter(): JsonField<List<FieldRef>> = body._fieldFilter()

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
     * Returns the raw JSON value of [sortBy].
     *
     * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sortBy(): JsonField<FieldRef> = body._sortBy()

    /**
     * Returns the raw JSON value of [sortCaseSensitive].
     *
     * Unlike [sortCaseSensitive], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sortCaseSensitive(): JsonField<Boolean> = body._sortCaseSensitive()

    /**
     * Returns the raw JSON value of [sortDirection].
     *
     * Unlike [sortDirection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sortDirection(): JsonField<SortDirection> = body._sortDirection()

    /**
     * Returns the raw JSON value of [sorts].
     *
     * Unlike [sorts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sorts(): JsonField<List<Sort>> = body._sorts()

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
         * - [fieldFilter]
         * - [filters]
         * - [pageSize]
         * - [pageToken]
         * - [sortBy]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Subset of fields to include in the response. */
        fun fieldFilter(fieldFilter: List<FieldRef>?) = apply { body.fieldFilter(fieldFilter) }

        /** Alias for calling [Builder.fieldFilter] with `fieldFilter.orElse(null)`. */
        fun fieldFilter(fieldFilter: Optional<List<FieldRef>>) =
            fieldFilter(fieldFilter.getOrNull())

        /**
         * Sets [Builder.fieldFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldFilter] with a well-typed `List<FieldRef>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fieldFilter(fieldFilter: JsonField<List<FieldRef>>) = apply {
            body.fieldFilter(fieldFilter)
        }

        /**
         * Adds a single [FieldRef] to [Builder.fieldFilter].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFieldFilter(fieldFilter: FieldRef) = apply { body.addFieldFilter(fieldFilter) }

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

        /** Field to sort results by. */
        fun sortBy(sortBy: FieldRef?) = apply { body.sortBy(sortBy) }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<FieldRef>) = sortBy(sortBy.getOrNull())

        /**
         * Sets [Builder.sortBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortBy] with a well-typed [FieldRef] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sortBy(sortBy: JsonField<FieldRef>) = apply { body.sortBy(sortBy) }

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

        /** Sort direction (defaults to DESC). */
        fun sortDirection(sortDirection: SortDirection) = apply {
            body.sortDirection(sortDirection)
        }

        /**
         * Sets [Builder.sortDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortDirection] with a well-typed [SortDirection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sortDirection(sortDirection: JsonField<SortDirection>) = apply {
            body.sortDirection(sortDirection)
        }

        /**
         * Multi-field sort specifications. When present, takes precedence over
         * sort_by/sort_direction.
         */
        fun sorts(sorts: List<Sort>?) = apply { body.sorts(sorts) }

        /** Alias for calling [Builder.sorts] with `sorts.orElse(null)`. */
        fun sorts(sorts: Optional<List<Sort>>) = sorts(sorts.getOrNull())

        /**
         * Sets [Builder.sorts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sorts] with a well-typed `List<Sort>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sorts(sorts: JsonField<List<Sort>>) = apply { body.sorts(sorts) }

        /**
         * Adds a single [Sort] to [sorts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: Sort) = apply { body.addSort(sort) }

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
        private val fieldFilter: JsonField<List<FieldRef>>,
        private val filters: JsonField<List<SearchFilter>>,
        private val pageSize: JsonField<Long>,
        private val pageToken: JsonField<String>,
        private val sortBy: JsonField<FieldRef>,
        private val sortCaseSensitive: JsonField<Boolean>,
        private val sortDirection: JsonField<SortDirection>,
        private val sorts: JsonField<List<Sort>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field_filter")
            @ExcludeMissing
            fieldFilter: JsonField<List<FieldRef>> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<SearchFilter>> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_token")
            @ExcludeMissing
            pageToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sort_by") @ExcludeMissing sortBy: JsonField<FieldRef> = JsonMissing.of(),
            @JsonProperty("sort_case_sensitive")
            @ExcludeMissing
            sortCaseSensitive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sort_direction")
            @ExcludeMissing
            sortDirection: JsonField<SortDirection> = JsonMissing.of(),
            @JsonProperty("sorts") @ExcludeMissing sorts: JsonField<List<Sort>> = JsonMissing.of(),
        ) : this(
            fieldFilter,
            filters,
            pageSize,
            pageToken,
            sortBy,
            sortCaseSensitive,
            sortDirection,
            sorts,
            mutableMapOf(),
        )

        /**
         * Subset of fields to include in the response.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fieldFilter(): Optional<List<FieldRef>> = fieldFilter.getOptional("field_filter")

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
         * Field to sort results by.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sortBy(): Optional<FieldRef> = sortBy.getOptional("sort_by")

        /**
         * Whether string sorts should be case-sensitive (default: false).
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sortCaseSensitive(): Optional<Boolean> =
            sortCaseSensitive.getOptional("sort_case_sensitive")

        /**
         * Sort direction (defaults to DESC).
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sortDirection(): Optional<SortDirection> = sortDirection.getOptional("sort_direction")

        /**
         * Multi-field sort specifications. When present, takes precedence over
         * sort_by/sort_direction.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sorts(): Optional<List<Sort>> = sorts.getOptional("sorts")

        /**
         * Returns the raw JSON value of [fieldFilter].
         *
         * Unlike [fieldFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field_filter")
        @ExcludeMissing
        fun _fieldFilter(): JsonField<List<FieldRef>> = fieldFilter

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
         * Returns the raw JSON value of [sortBy].
         *
         * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sort_by") @ExcludeMissing fun _sortBy(): JsonField<FieldRef> = sortBy

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
         * Returns the raw JSON value of [sortDirection].
         *
         * Unlike [sortDirection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sort_direction")
        @ExcludeMissing
        fun _sortDirection(): JsonField<SortDirection> = sortDirection

        /**
         * Returns the raw JSON value of [sorts].
         *
         * Unlike [sorts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sorts") @ExcludeMissing fun _sorts(): JsonField<List<Sort>> = sorts

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

            private var fieldFilter: JsonField<MutableList<FieldRef>>? = null
            private var filters: JsonField<MutableList<SearchFilter>>? = null
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var pageToken: JsonField<String> = JsonMissing.of()
            private var sortBy: JsonField<FieldRef> = JsonMissing.of()
            private var sortCaseSensitive: JsonField<Boolean> = JsonMissing.of()
            private var sortDirection: JsonField<SortDirection> = JsonMissing.of()
            private var sorts: JsonField<MutableList<Sort>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                fieldFilter = body.fieldFilter.map { it.toMutableList() }
                filters = body.filters.map { it.toMutableList() }
                pageSize = body.pageSize
                pageToken = body.pageToken
                sortBy = body.sortBy
                sortCaseSensitive = body.sortCaseSensitive
                sortDirection = body.sortDirection
                sorts = body.sorts.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Subset of fields to include in the response. */
            fun fieldFilter(fieldFilter: List<FieldRef>?) =
                fieldFilter(JsonField.ofNullable(fieldFilter))

            /** Alias for calling [Builder.fieldFilter] with `fieldFilter.orElse(null)`. */
            fun fieldFilter(fieldFilter: Optional<List<FieldRef>>) =
                fieldFilter(fieldFilter.getOrNull())

            /**
             * Sets [Builder.fieldFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldFilter] with a well-typed `List<FieldRef>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fieldFilter(fieldFilter: JsonField<List<FieldRef>>) = apply {
                this.fieldFilter = fieldFilter.map { it.toMutableList() }
            }

            /**
             * Adds a single [FieldRef] to [Builder.fieldFilter].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFieldFilter(fieldFilter: FieldRef) = apply {
                this.fieldFilter =
                    (this.fieldFilter ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fieldFilter", it).add(fieldFilter)
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

            /** Field to sort results by. */
            fun sortBy(sortBy: FieldRef?) = sortBy(JsonField.ofNullable(sortBy))

            /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
            fun sortBy(sortBy: Optional<FieldRef>) = sortBy(sortBy.getOrNull())

            /**
             * Sets [Builder.sortBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortBy] with a well-typed [FieldRef] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortBy(sortBy: JsonField<FieldRef>) = apply { this.sortBy = sortBy }

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

            /** Sort direction (defaults to DESC). */
            fun sortDirection(sortDirection: SortDirection) =
                sortDirection(JsonField.of(sortDirection))

            /**
             * Sets [Builder.sortDirection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortDirection] with a well-typed [SortDirection]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sortDirection(sortDirection: JsonField<SortDirection>) = apply {
                this.sortDirection = sortDirection
            }

            /**
             * Multi-field sort specifications. When present, takes precedence over
             * sort_by/sort_direction.
             */
            fun sorts(sorts: List<Sort>?) = sorts(JsonField.ofNullable(sorts))

            /** Alias for calling [Builder.sorts] with `sorts.orElse(null)`. */
            fun sorts(sorts: Optional<List<Sort>>) = sorts(sorts.getOrNull())

            /**
             * Sets [Builder.sorts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sorts] with a well-typed `List<Sort>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sorts(sorts: JsonField<List<Sort>>) = apply {
                this.sorts = sorts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Sort] to [sorts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSort(sort: Sort) = apply {
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
                    (fieldFilter ?: JsonMissing.of()).map { it.toImmutable() },
                    (filters ?: JsonMissing.of()).map { it.toImmutable() },
                    pageSize,
                    pageToken,
                    sortBy,
                    sortCaseSensitive,
                    sortDirection,
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

            fieldFilter().ifPresent { it.forEach { it.validate() } }
            filters().ifPresent { it.forEach { it.validate() } }
            pageSize()
            pageToken()
            sortBy().ifPresent { it.validate() }
            sortCaseSensitive()
            sortDirection().ifPresent { it.validate() }
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
            (fieldFilter.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (pageToken.asKnown().isPresent) 1 else 0) +
                (sortBy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sortCaseSensitive.asKnown().isPresent) 1 else 0) +
                (sortDirection.asKnown().getOrNull()?.validity() ?: 0) +
                (sorts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                fieldFilter == other.fieldFilter &&
                filters == other.filters &&
                pageSize == other.pageSize &&
                pageToken == other.pageToken &&
                sortBy == other.sortBy &&
                sortCaseSensitive == other.sortCaseSensitive &&
                sortDirection == other.sortDirection &&
                sorts == other.sorts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fieldFilter,
                filters,
                pageSize,
                pageToken,
                sortBy,
                sortCaseSensitive,
                sortDirection,
                sorts,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fieldFilter=$fieldFilter, filters=$filters, pageSize=$pageSize, pageToken=$pageToken, sortBy=$sortBy, sortCaseSensitive=$sortCaseSensitive, sortDirection=$sortDirection, sorts=$sorts, additionalProperties=$additionalProperties}"
    }

    /** Sort direction (defaults to DESC). */
    class SortDirection @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ASC = of("ASC")

            @JvmField val DESC = of("DESC")

            @JvmStatic fun of(value: String) = SortDirection(JsonField.of(value))
        }

        /** An enum containing [SortDirection]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortDirection]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortDirection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortDirection] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ASC -> Value.ASC
                DESC -> Value.DESC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw ClearStreetInvalidDataException("Unknown SortDirection: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ClearStreetInvalidDataException("Value is not a String")
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
        fun validate(): SortDirection = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SortDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A sort specification pairing a field with a direction. */
    class Sort
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val field: JsonField<FieldRef>,
        private val direction: JsonField<Direction>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field") @ExcludeMissing field: JsonField<FieldRef> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
        ) : this(field, direction, mutableMapOf())

        /**
         * The field to sort by.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun field(): FieldRef = field.getRequired("field")

        /**
         * Sort direction (defaults to DESC).
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun direction(): Optional<Direction> = direction.getOptional("direction")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<FieldRef> = field

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

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

            /**
             * Returns a mutable builder for constructing an instance of [Sort].
             *
             * The following fields are required:
             * ```java
             * .field()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sort]. */
        class Builder internal constructor() {

            private var field: JsonField<FieldRef>? = null
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sort: Sort) = apply {
                field = sort.field
                direction = sort.direction
                additionalProperties = sort.additionalProperties.toMutableMap()
            }

            /** The field to sort by. */
            fun field(field: FieldRef) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [FieldRef] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun field(field: JsonField<FieldRef>) = apply { this.field = field }

            /** Sort direction (defaults to DESC). */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

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
             * Returns an immutable instance of [Sort].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .field()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Sort =
                Sort(checkRequired("field", field), direction, additionalProperties.toMutableMap())
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
        fun validate(): Sort = apply {
            if (validated) {
                return@apply
            }

            field().validate()
            direction().ifPresent { it.validate() }
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
            (field.asKnown().getOrNull()?.validity() ?: 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0)

        /** Sort direction (defaults to DESC). */
        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ASC = of("ASC")

                @JvmField val DESC = of("DESC")

                @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
            }

            /** An enum containing [Direction]'s known values. */
            enum class Known {
                ASC,
                DESC,
            }

            /**
             * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Direction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ASC,
                DESC,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ClearStreetInvalidDataException("Unknown Direction: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ClearStreetInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Direction = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Direction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sort &&
                field == other.field &&
                direction == other.direction &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(field, direction, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sort{field=$field, direction=$direction, additionalProperties=$additionalProperties}"
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
