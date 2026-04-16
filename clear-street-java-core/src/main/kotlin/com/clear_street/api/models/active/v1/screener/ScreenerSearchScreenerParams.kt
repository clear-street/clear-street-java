// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.screener

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.Params
import com.clear_street.api.core.allMaxBy
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.getOrThrow
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
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
    fun filters(): Optional<List<Filter>> = body.filters()

    /**
     * Maximum number of results per page.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * Opaque token for cursor-based pagination.
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
    fun _filters(): JsonField<List<Filter>> = body._filters()

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
        fun filters(filters: List<Filter>?) = apply { body.filters(filters) }

        /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
        fun filters(filters: Optional<List<Filter>>) = filters(filters.getOrNull())

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<Filter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filters(filters: JsonField<List<Filter>>) = apply { body.filters(filters) }

        /**
         * Adds a single [Filter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: Filter) = apply { body.addFilter(filter) }

        /** Maximum number of results per page. */
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

        /** Opaque token for cursor-based pagination. */
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
        private val filters: JsonField<List<Filter>>,
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
            filters: JsonField<List<Filter>> = JsonMissing.of(),
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
        fun filters(): Optional<List<Filter>> = filters.getOptional("filters")

        /**
         * Maximum number of results per page.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * Opaque token for cursor-based pagination.
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
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

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
            private var filters: JsonField<MutableList<Filter>>? = null
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
            fun filters(filters: List<Filter>?) = filters(JsonField.ofNullable(filters))

            /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
            fun filters(filters: Optional<List<Filter>>) = filters(filters.getOrNull())

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<List<Filter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Filter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: Filter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

            /** Maximum number of results per page. */
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

            /** Opaque token for cursor-based pagination. */
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

    /** A single filter condition. */
    class Filter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val left: JsonField<FieldRef>,
        private val op: JsonField<Op>,
        private val right: JsonField<List<Right>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("left") @ExcludeMissing left: JsonField<FieldRef> = JsonMissing.of(),
            @JsonProperty("op") @ExcludeMissing op: JsonField<Op> = JsonMissing.of(),
            @JsonProperty("right") @ExcludeMissing right: JsonField<List<Right>> = JsonMissing.of(),
        ) : this(left, op, right, mutableMapOf())

        /**
         * The field to filter on.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun left(): FieldRef = left.getRequired("left")

        /**
         * The operator and optional arguments.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun op(): Op = op.getRequired("op")

        /**
         * The value(s) to compare against.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun right(): List<Right> = right.getRequired("right")

        /**
         * Returns the raw JSON value of [left].
         *
         * Unlike [left], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("left") @ExcludeMissing fun _left(): JsonField<FieldRef> = left

        /**
         * Returns the raw JSON value of [op].
         *
         * Unlike [op], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("op") @ExcludeMissing fun _op(): JsonField<Op> = op

        /**
         * Returns the raw JSON value of [right].
         *
         * Unlike [right], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("right") @ExcludeMissing fun _right(): JsonField<List<Right>> = right

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
             * Returns a mutable builder for constructing an instance of [Filter].
             *
             * The following fields are required:
             * ```java
             * .left()
             * .op()
             * .right()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var left: JsonField<FieldRef>? = null
            private var op: JsonField<Op>? = null
            private var right: JsonField<MutableList<Right>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                left = filter.left
                op = filter.op
                right = filter.right.map { it.toMutableList() }
                additionalProperties = filter.additionalProperties.toMutableMap()
            }

            /** The field to filter on. */
            fun left(left: FieldRef) = left(JsonField.of(left))

            /**
             * Sets [Builder.left] to an arbitrary JSON value.
             *
             * You should usually call [Builder.left] with a well-typed [FieldRef] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun left(left: JsonField<FieldRef>) = apply { this.left = left }

            /** The operator and optional arguments. */
            fun op(op: Op) = op(JsonField.of(op))

            /**
             * Sets [Builder.op] to an arbitrary JSON value.
             *
             * You should usually call [Builder.op] with a well-typed [Op] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun op(op: JsonField<Op>) = apply { this.op = op }

            /** The value(s) to compare against. */
            fun right(right: List<Right>) = right(JsonField.of(right))

            /**
             * Sets [Builder.right] to an arbitrary JSON value.
             *
             * You should usually call [Builder.right] with a well-typed `List<Right>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun right(right: JsonField<List<Right>>) = apply {
                this.right = right.map { it.toMutableList() }
            }

            /**
             * Adds a single [Right] to [Builder.right].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRight(right: Right) = apply {
                this.right =
                    (this.right ?: JsonField.of(mutableListOf())).also {
                        checkKnown("right", it).add(right)
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
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .left()
             * .op()
             * .right()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Filter =
                Filter(
                    checkRequired("left", left),
                    checkRequired("op", op),
                    checkRequired("right", right).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Filter = apply {
            if (validated) {
                return@apply
            }

            left().validate()
            op().validate()
            right().forEach { it.validate() }
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
            (left.asKnown().getOrNull()?.validity() ?: 0) +
                (op.asKnown().getOrNull()?.validity() ?: 0) +
                (right.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** The operator and optional arguments. */
        class Op
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<Name>,
            private val args: JsonField<List<Arg>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
                @JsonProperty("args") @ExcludeMissing args: JsonField<List<Arg>> = JsonMissing.of(),
            ) : this(name, args, mutableMapOf())

            /**
             * The operator to apply.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): Name = name.getRequired("name")

            /**
             * Optional arguments that modify operator behavior.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun args(): Optional<List<Arg>> = args.getOptional("args")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

            /**
             * Returns the raw JSON value of [args].
             *
             * Unlike [args], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<List<Arg>> = args

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
                 * Returns a mutable builder for constructing an instance of [Op].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Op]. */
            class Builder internal constructor() {

                private var name: JsonField<Name>? = null
                private var args: JsonField<MutableList<Arg>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(op: Op) = apply {
                    name = op.name
                    args = op.args.map { it.toMutableList() }
                    additionalProperties = op.additionalProperties.toMutableMap()
                }

                /** The operator to apply. */
                fun name(name: Name) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [Name] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<Name>) = apply { this.name = name }

                /** Optional arguments that modify operator behavior. */
                fun args(args: List<Arg>) = args(JsonField.of(args))

                /**
                 * Sets [Builder.args] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.args] with a well-typed `List<Arg>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun args(args: JsonField<List<Arg>>) = apply {
                    this.args = args.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Arg] to [args].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addArg(arg: Arg) = apply {
                    args =
                        (args ?: JsonField.of(mutableListOf())).also {
                            checkKnown("args", it).add(arg)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Op].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Op =
                    Op(
                        checkRequired("name", name),
                        (args ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Op = apply {
                if (validated) {
                    return@apply
                }

                name().validate()
                args().ifPresent { it.forEach { it.validate() } }
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
                (name.asKnown().getOrNull()?.validity() ?: 0) +
                    (args.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** The operator to apply. */
            class Name @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LT = of("LT")

                    @JvmField val LTE = of("LTE")

                    @JvmField val GT = of("GT")

                    @JvmField val GTE = of("GTE")

                    @JvmField val EQ = of("EQ")

                    @JvmField val BETWEEN = of("BETWEEN")

                    @JvmField val NOT_BETWEEN = of("NOT_BETWEEN")

                    @JvmField val ONE_OF = of("ONE_OF")

                    @JvmField val REGEX = of("REGEX")

                    @JvmField val BEGINS_WITH = of("BEGINS_WITH")

                    @JvmField val ENDS_WITH = of("ENDS_WITH")

                    @JvmField val CONTAINS = of("CONTAINS")

                    @JvmField val IS_NULL = of("IS_NULL")

                    @JvmField val IS_NOT_NULL = of("IS_NOT_NULL")

                    @JvmStatic fun of(value: String) = Name(JsonField.of(value))
                }

                /** An enum containing [Name]'s known values. */
                enum class Known {
                    LT,
                    LTE,
                    GT,
                    GTE,
                    EQ,
                    BETWEEN,
                    NOT_BETWEEN,
                    ONE_OF,
                    REGEX,
                    BEGINS_WITH,
                    ENDS_WITH,
                    CONTAINS,
                    IS_NULL,
                    IS_NOT_NULL,
                }

                /**
                 * An enum containing [Name]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Name] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LT,
                    LTE,
                    GT,
                    GTE,
                    EQ,
                    BETWEEN,
                    NOT_BETWEEN,
                    ONE_OF,
                    REGEX,
                    BEGINS_WITH,
                    ENDS_WITH,
                    CONTAINS,
                    IS_NULL,
                    IS_NOT_NULL,
                    /**
                     * An enum member indicating that [Name] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LT -> Value.LT
                        LTE -> Value.LTE
                        GT -> Value.GT
                        GTE -> Value.GTE
                        EQ -> Value.EQ
                        BETWEEN -> Value.BETWEEN
                        NOT_BETWEEN -> Value.NOT_BETWEEN
                        ONE_OF -> Value.ONE_OF
                        REGEX -> Value.REGEX
                        BEGINS_WITH -> Value.BEGINS_WITH
                        ENDS_WITH -> Value.ENDS_WITH
                        CONTAINS -> Value.CONTAINS
                        IS_NULL -> Value.IS_NULL
                        IS_NOT_NULL -> Value.IS_NOT_NULL
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
                        LT -> Known.LT
                        LTE -> Known.LTE
                        GT -> Known.GT
                        GTE -> Known.GTE
                        EQ -> Known.EQ
                        BETWEEN -> Known.BETWEEN
                        NOT_BETWEEN -> Known.NOT_BETWEEN
                        ONE_OF -> Known.ONE_OF
                        REGEX -> Known.REGEX
                        BEGINS_WITH -> Known.BEGINS_WITH
                        ENDS_WITH -> Known.ENDS_WITH
                        CONTAINS -> Known.CONTAINS
                        IS_NULL -> Known.IS_NULL
                        IS_NOT_NULL -> Known.IS_NOT_NULL
                        else -> throw ClearStreetInvalidDataException("Unknown Name: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ClearStreetInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        ClearStreetInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Name = apply {
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

                    return other is Name && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Argument that modifies operator behavior. */
            class Arg @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LEFT_INCLUSIVE = of("LEFT_INCLUSIVE")

                    @JvmField val RIGHT_INCLUSIVE = of("RIGHT_INCLUSIVE")

                    @JvmField val LEFT_EXCLUSIVE = of("LEFT_EXCLUSIVE")

                    @JvmField val RIGHT_EXCLUSIVE = of("RIGHT_EXCLUSIVE")

                    @JvmField val CASE_INSENSITIVE = of("CASE_INSENSITIVE")

                    @JvmStatic fun of(value: String) = Arg(JsonField.of(value))
                }

                /** An enum containing [Arg]'s known values. */
                enum class Known {
                    LEFT_INCLUSIVE,
                    RIGHT_INCLUSIVE,
                    LEFT_EXCLUSIVE,
                    RIGHT_EXCLUSIVE,
                    CASE_INSENSITIVE,
                }

                /**
                 * An enum containing [Arg]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Arg] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LEFT_INCLUSIVE,
                    RIGHT_INCLUSIVE,
                    LEFT_EXCLUSIVE,
                    RIGHT_EXCLUSIVE,
                    CASE_INSENSITIVE,
                    /**
                     * An enum member indicating that [Arg] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LEFT_INCLUSIVE -> Value.LEFT_INCLUSIVE
                        RIGHT_INCLUSIVE -> Value.RIGHT_INCLUSIVE
                        LEFT_EXCLUSIVE -> Value.LEFT_EXCLUSIVE
                        RIGHT_EXCLUSIVE -> Value.RIGHT_EXCLUSIVE
                        CASE_INSENSITIVE -> Value.CASE_INSENSITIVE
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
                        LEFT_INCLUSIVE -> Known.LEFT_INCLUSIVE
                        RIGHT_INCLUSIVE -> Known.RIGHT_INCLUSIVE
                        LEFT_EXCLUSIVE -> Known.LEFT_EXCLUSIVE
                        RIGHT_EXCLUSIVE -> Known.RIGHT_EXCLUSIVE
                        CASE_INSENSITIVE -> Known.CASE_INSENSITIVE
                        else -> throw ClearStreetInvalidDataException("Unknown Arg: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ClearStreetInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        ClearStreetInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Arg = apply {
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

                    return other is Arg && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Op &&
                    name == other.name &&
                    args == other.args &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, args, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Op{name=$name, args=$args, additionalProperties=$additionalProperties}"
        }

        /** A filter value: either a literal or a variable reference. */
        class Right
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val value: JsonField<Value>,
            private val variable: JsonField<Variable>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
                @JsonProperty("variable")
                @ExcludeMissing
                variable: JsonField<Variable> = JsonMissing.of(),
            ) : this(value, variable, mutableMapOf())

            /**
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun value(): Optional<Value> = value.getOptional("value")

            /**
             * A variable reference.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun variable(): Optional<Variable> = variable.getOptional("variable")

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

            /**
             * Returns the raw JSON value of [variable].
             *
             * Unlike [variable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("variable")
            @ExcludeMissing
            fun _variable(): JsonField<Variable> = variable

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

                /** Returns a mutable builder for constructing an instance of [Right]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Right]. */
            class Builder internal constructor() {

                private var value: JsonField<Value> = JsonMissing.of()
                private var variable: JsonField<Variable> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(right: Right) = apply {
                    value = right.value
                    variable = right.variable
                    additionalProperties = right.additionalProperties.toMutableMap()
                }

                fun value(value: Value?) = value(JsonField.ofNullable(value))

                /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                fun value(value: Optional<Value>) = value(value.getOrNull())

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Value] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Value>) = apply { this.value = value }

                /** Alias for calling [value] with `Value.ofNumber(number)`. */
                fun value(number: Double) = value(Value.ofNumber(number))

                /** Alias for calling [value] with `Value.ofString(string)`. */
                fun value(string: String) = value(Value.ofString(string))

                /** A variable reference. */
                fun variable(variable: Variable?) = variable(JsonField.ofNullable(variable))

                /** Alias for calling [Builder.variable] with `variable.orElse(null)`. */
                fun variable(variable: Optional<Variable>) = variable(variable.getOrNull())

                /**
                 * Sets [Builder.variable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.variable] with a well-typed [Variable] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun variable(variable: JsonField<Variable>) = apply { this.variable = variable }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Right].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Right = Right(value, variable, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Right = apply {
                if (validated) {
                    return@apply
                }

                value().ifPresent { it.validate() }
                variable().ifPresent { it.validate() }
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
                (value.asKnown().getOrNull()?.validity() ?: 0) +
                    (variable.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val number: Double? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isNumber(): Boolean = number != null

                fun isString(): Boolean = string != null

                fun asNumber(): Double = number.getOrThrow("number")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        number != null -> visitor.visitNumber(number)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitNumber(number: Double) {}

                            override fun visitString(string: String) {}
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitNumber(number: Double) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Value && number == other.number && string == other.string
                }

                override fun hashCode(): Int = Objects.hash(number, string)

                override fun toString(): String =
                    when {
                        number != null -> "Value{number=$number}"
                        string != null -> "Value{string=$string}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    @JvmStatic fun ofNumber(number: Double) = Value(number = number)

                    @JvmStatic fun ofString(string: String) = Value(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitNumber(number: Double): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws ClearStreetInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw ClearStreetInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Value(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        Value(number = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.number != null -> generator.writeObject(value.number)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            /** A variable reference. */
            class Variable
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val lookback: JsonField<FieldLookback>,
                private val modifier: JsonField<Modifier>,
                private val period: JsonField<FieldPeriod>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("lookback")
                    @ExcludeMissing
                    lookback: JsonField<FieldLookback> = JsonMissing.of(),
                    @JsonProperty("modifier")
                    @ExcludeMissing
                    modifier: JsonField<Modifier> = JsonMissing.of(),
                    @JsonProperty("period")
                    @ExcludeMissing
                    period: JsonField<FieldPeriod> = JsonMissing.of(),
                ) : this(name, lookback, modifier, period, mutableMapOf())

                /**
                 * The variable name.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Optional historical lookback window.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun lookback(): Optional<FieldLookback> = lookback.getOptional("lookback")

                /**
                 * Optional arithmetic modifier.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun modifier(): Optional<Modifier> = modifier.getOptional("modifier")

                /**
                 * Optional reporting period.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun period(): Optional<FieldPeriod> = period.getOptional("period")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [lookback].
                 *
                 * Unlike [lookback], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("lookback")
                @ExcludeMissing
                fun _lookback(): JsonField<FieldLookback> = lookback

                /**
                 * Returns the raw JSON value of [modifier].
                 *
                 * Unlike [modifier], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("modifier")
                @ExcludeMissing
                fun _modifier(): JsonField<Modifier> = modifier

                /**
                 * Returns the raw JSON value of [period].
                 *
                 * Unlike [period], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("period")
                @ExcludeMissing
                fun _period(): JsonField<FieldPeriod> = period

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
                     * Returns a mutable builder for constructing an instance of [Variable].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Variable]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var lookback: JsonField<FieldLookback> = JsonMissing.of()
                    private var modifier: JsonField<Modifier> = JsonMissing.of()
                    private var period: JsonField<FieldPeriod> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(variable: Variable) = apply {
                        name = variable.name
                        lookback = variable.lookback
                        modifier = variable.modifier
                        period = variable.period
                        additionalProperties = variable.additionalProperties.toMutableMap()
                    }

                    /** The variable name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Optional historical lookback window. */
                    fun lookback(lookback: FieldLookback?) =
                        lookback(JsonField.ofNullable(lookback))

                    /** Alias for calling [Builder.lookback] with `lookback.orElse(null)`. */
                    fun lookback(lookback: Optional<FieldLookback>) = lookback(lookback.getOrNull())

                    /**
                     * Sets [Builder.lookback] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lookback] with a well-typed [FieldLookback]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun lookback(lookback: JsonField<FieldLookback>) = apply {
                        this.lookback = lookback
                    }

                    /** Optional arithmetic modifier. */
                    fun modifier(modifier: Modifier?) = modifier(JsonField.ofNullable(modifier))

                    /** Alias for calling [Builder.modifier] with `modifier.orElse(null)`. */
                    fun modifier(modifier: Optional<Modifier>) = modifier(modifier.getOrNull())

                    /**
                     * Sets [Builder.modifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.modifier] with a well-typed [Modifier] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun modifier(modifier: JsonField<Modifier>) = apply { this.modifier = modifier }

                    /** Optional reporting period. */
                    fun period(period: FieldPeriod?) = period(JsonField.ofNullable(period))

                    /** Alias for calling [Builder.period] with `period.orElse(null)`. */
                    fun period(period: Optional<FieldPeriod>) = period(period.getOrNull())

                    /**
                     * Sets [Builder.period] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.period] with a well-typed [FieldPeriod]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun period(period: JsonField<FieldPeriod>) = apply { this.period = period }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Variable].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Variable =
                        Variable(
                            checkRequired("name", name),
                            lookback,
                            modifier,
                            period,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Variable = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    lookback().ifPresent { it.validate() }
                    modifier().ifPresent { it.validate() }
                    period().ifPresent { it.validate() }
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (lookback.asKnown().getOrNull()?.validity() ?: 0) +
                        (modifier.asKnown().getOrNull()?.validity() ?: 0) +
                        (period.asKnown().getOrNull()?.validity() ?: 0)

                /** Optional arithmetic modifier. */
                class Modifier
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val args: JsonField<List<Arg>>,
                    private val name: JsonField<Name>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("args")
                        @ExcludeMissing
                        args: JsonField<List<Arg>> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<Name> = JsonMissing.of(),
                    ) : this(args, name, mutableMapOf())

                    /**
                     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun args(): List<Arg> = args.getRequired("args")

                    /**
                     * The modifier operation.
                     *
                     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): Name = name.getRequired("name")

                    /**
                     * Returns the raw JSON value of [args].
                     *
                     * Unlike [args], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<List<Arg>> = args

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

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
                         * Returns a mutable builder for constructing an instance of [Modifier].
                         *
                         * The following fields are required:
                         * ```java
                         * .args()
                         * .name()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Modifier]. */
                    class Builder internal constructor() {

                        private var args: JsonField<MutableList<Arg>>? = null
                        private var name: JsonField<Name>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(modifier: Modifier) = apply {
                            args = modifier.args.map { it.toMutableList() }
                            name = modifier.name
                            additionalProperties = modifier.additionalProperties.toMutableMap()
                        }

                        fun args(args: List<Arg>) = args(JsonField.of(args))

                        /**
                         * Sets [Builder.args] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.args] with a well-typed `List<Arg>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun args(args: JsonField<List<Arg>>) = apply {
                            this.args = args.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Arg] to [args].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addArg(arg: Arg) = apply {
                            args =
                                (args ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("args", it).add(arg)
                                }
                        }

                        /** Alias for calling [addArg] with `Arg.ofNumber(number)`. */
                        fun addArg(number: Double) = addArg(Arg.ofNumber(number))

                        /** Alias for calling [addArg] with `Arg.ofString(string)`. */
                        fun addArg(string: String) = addArg(Arg.ofString(string))

                        /** The modifier operation. */
                        fun name(name: Name) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [Name] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<Name>) = apply { this.name = name }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Modifier].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .args()
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Modifier =
                            Modifier(
                                checkRequired("args", args).map { it.toImmutable() },
                                checkRequired("name", name),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Modifier = apply {
                        if (validated) {
                            return@apply
                        }

                        args().forEach { it.validate() }
                        name().validate()
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
                        (args.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (name.asKnown().getOrNull()?.validity() ?: 0)

                    @JsonDeserialize(using = Arg.Deserializer::class)
                    @JsonSerialize(using = Arg.Serializer::class)
                    class Arg
                    private constructor(
                        private val number: Double? = null,
                        private val string: String? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun number(): Optional<Double> = Optional.ofNullable(number)

                        fun string(): Optional<String> = Optional.ofNullable(string)

                        fun isNumber(): Boolean = number != null

                        fun isString(): Boolean = string != null

                        fun asNumber(): Double = number.getOrThrow("number")

                        fun asString(): String = string.getOrThrow("string")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                number != null -> visitor.visitNumber(number)
                                string != null -> visitor.visitString(string)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): Arg = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitNumber(number: Double) {}

                                    override fun visitString(string: String) {}
                                }
                            )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitNumber(number: Double) = 1

                                    override fun visitString(string: String) = 1

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Arg && number == other.number && string == other.string
                        }

                        override fun hashCode(): Int = Objects.hash(number, string)

                        override fun toString(): String =
                            when {
                                number != null -> "Arg{number=$number}"
                                string != null -> "Arg{string=$string}"
                                _json != null -> "Arg{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Arg")
                            }

                        companion object {

                            @JvmStatic fun ofNumber(number: Double) = Arg(number = number)

                            @JvmStatic fun ofString(string: String) = Arg(string = string)
                        }

                        /**
                         * An interface that defines how to map each variant of [Arg] to a value of
                         * type [T].
                         */
                        interface Visitor<out T> {

                            fun visitNumber(number: Double): T

                            fun visitString(string: String): T

                            /**
                             * Maps an unknown variant of [Arg] to a value of type [T].
                             *
                             * An instance of [Arg] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws ClearStreetInvalidDataException in the default
                             *   implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw ClearStreetInvalidDataException("Unknown Arg: $json")
                            }
                        }

                        internal class Deserializer : BaseDeserializer<Arg>(Arg::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Arg {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                                Arg(string = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                                Arg(number = it, _json = json)
                                            },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from boolean).
                                    0 -> Arg(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer : BaseSerializer<Arg>(Arg::class) {

                            override fun serialize(
                                value: Arg,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.number != null -> generator.writeObject(value.number)
                                    value.string != null -> generator.writeObject(value.string)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Arg")
                                }
                            }
                        }
                    }

                    /** The modifier operation. */
                    class Name
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val ADD = of("ADD")

                            @JvmField val SUB = of("SUB")

                            @JvmStatic fun of(value: String) = Name(JsonField.of(value))
                        }

                        /** An enum containing [Name]'s known values. */
                        enum class Known {
                            ADD,
                            SUB,
                        }

                        /**
                         * An enum containing [Name]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Name] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            ADD,
                            SUB,
                            /**
                             * An enum member indicating that [Name] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                ADD -> Value.ADD
                                SUB -> Value.SUB
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws ClearStreetInvalidDataException if this class instance's value is
                         *   a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                ADD -> Known.ADD
                                SUB -> Known.SUB
                                else ->
                                    throw ClearStreetInvalidDataException("Unknown Name: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws ClearStreetInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                ClearStreetInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Name = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Name && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Modifier &&
                            args == other.args &&
                            name == other.name &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(args, name, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Modifier{args=$args, name=$name, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Variable &&
                        name == other.name &&
                        lookback == other.lookback &&
                        modifier == other.modifier &&
                        period == other.period &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, lookback, modifier, period, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Variable{name=$name, lookback=$lookback, modifier=$modifier, period=$period, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Right &&
                    value == other.value &&
                    variable == other.variable &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(value, variable, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Right{value=$value, variable=$variable, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                left == other.left &&
                op == other.op &&
                right == other.right &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(left, op, right, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{left=$left, op=$op, right=$right, additionalProperties=$additionalProperties}"
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
