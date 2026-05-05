// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.screener.ScreenerFilter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Action to open a stock screener with filters. */
class OpenScreenerAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filters: JsonField<List<ScreenerFilter>>,
    private val fieldFilter: JsonField<List<String>>,
    private val pageSize: JsonField<Int>,
    private val sortBy: JsonField<String>,
    private val sortDirection: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<ScreenerFilter>> = JsonMissing.of(),
        @JsonProperty("field_filter")
        @ExcludeMissing
        fieldFilter: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sort_by") @ExcludeMissing sortBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sort_direction")
        @ExcludeMissing
        sortDirection: JsonField<String> = JsonMissing.of(),
    ) : this(filters, fieldFilter, pageSize, sortBy, sortDirection, mutableMapOf())

    /**
     * Filter criteria for the screener
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<ScreenerFilter> = filters.getRequired("filters")

    /**
     * Optional field/column selection for screener results.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldFilter(): Optional<List<String>> = fieldFilter.getOptional("field_filter")

    /**
     * Optional page size.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Int> = pageSize.getOptional("page_size")

    /**
     * Optional sort field for screener rows.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortBy(): Optional<String> = sortBy.getOptional("sort_by")

    /**
     * Optional sort direction (`ASC` or `DESC`).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortDirection(): Optional<String> = sortDirection.getOptional("sort_direction")

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<List<ScreenerFilter>> = filters

    /**
     * Returns the raw JSON value of [fieldFilter].
     *
     * Unlike [fieldFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field_filter")
    @ExcludeMissing
    fun _fieldFilter(): JsonField<List<String>> = fieldFilter

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Int> = pageSize

    /**
     * Returns the raw JSON value of [sortBy].
     *
     * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sort_by") @ExcludeMissing fun _sortBy(): JsonField<String> = sortBy

    /**
     * Returns the raw JSON value of [sortDirection].
     *
     * Unlike [sortDirection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sort_direction")
    @ExcludeMissing
    fun _sortDirection(): JsonField<String> = sortDirection

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
         * Returns a mutable builder for constructing an instance of [OpenScreenerAction].
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OpenScreenerAction]. */
    class Builder internal constructor() {

        private var filters: JsonField<MutableList<ScreenerFilter>>? = null
        private var fieldFilter: JsonField<MutableList<String>>? = null
        private var pageSize: JsonField<Int> = JsonMissing.of()
        private var sortBy: JsonField<String> = JsonMissing.of()
        private var sortDirection: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(openScreenerAction: OpenScreenerAction) = apply {
            filters = openScreenerAction.filters.map { it.toMutableList() }
            fieldFilter = openScreenerAction.fieldFilter.map { it.toMutableList() }
            pageSize = openScreenerAction.pageSize
            sortBy = openScreenerAction.sortBy
            sortDirection = openScreenerAction.sortDirection
            additionalProperties = openScreenerAction.additionalProperties.toMutableMap()
        }

        /** Filter criteria for the screener */
        fun filters(filters: List<ScreenerFilter>) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<ScreenerFilter>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filters(filters: JsonField<List<ScreenerFilter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [ScreenerFilter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: ScreenerFilter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        /** Optional field/column selection for screener results. */
        fun fieldFilter(fieldFilter: List<String>?) = fieldFilter(JsonField.ofNullable(fieldFilter))

        /** Alias for calling [Builder.fieldFilter] with `fieldFilter.orElse(null)`. */
        fun fieldFilter(fieldFilter: Optional<List<String>>) = fieldFilter(fieldFilter.getOrNull())

        /**
         * Sets [Builder.fieldFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldFilter] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fieldFilter(fieldFilter: JsonField<List<String>>) = apply {
            this.fieldFilter = fieldFilter.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.fieldFilter].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFieldFilter(fieldFilter: String) = apply {
            this.fieldFilter =
                (this.fieldFilter ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fieldFilter", it).add(fieldFilter)
                }
        }

        /** Optional page size. */
        fun pageSize(pageSize: Int?) = pageSize(JsonField.ofNullable(pageSize))

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Int>) = apply { this.pageSize = pageSize }

        /** Optional sort field for screener rows. */
        fun sortBy(sortBy: String?) = sortBy(JsonField.ofNullable(sortBy))

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<String>) = sortBy(sortBy.getOrNull())

        /**
         * Sets [Builder.sortBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortBy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sortBy(sortBy: JsonField<String>) = apply { this.sortBy = sortBy }

        /** Optional sort direction (`ASC` or `DESC`). */
        fun sortDirection(sortDirection: String?) =
            sortDirection(JsonField.ofNullable(sortDirection))

        /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
        fun sortDirection(sortDirection: Optional<String>) =
            sortDirection(sortDirection.getOrNull())

        /**
         * Sets [Builder.sortDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortDirection] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sortDirection(sortDirection: JsonField<String>) = apply {
            this.sortDirection = sortDirection
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
         * Returns an immutable instance of [OpenScreenerAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filters()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OpenScreenerAction =
            OpenScreenerAction(
                checkRequired("filters", filters).map { it.toImmutable() },
                (fieldFilter ?: JsonMissing.of()).map { it.toImmutable() },
                pageSize,
                sortBy,
                sortDirection,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ClearStreetInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): OpenScreenerAction = apply {
        if (validated) {
            return@apply
        }

        filters().forEach { it.validate() }
        fieldFilter()
        pageSize()
        sortBy()
        sortDirection()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (fieldFilter.asKnown().getOrNull()?.size ?: 0) +
            (if (pageSize.asKnown().isPresent) 1 else 0) +
            (if (sortBy.asKnown().isPresent) 1 else 0) +
            (if (sortDirection.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpenScreenerAction &&
            filters == other.filters &&
            fieldFilter == other.fieldFilter &&
            pageSize == other.pageSize &&
            sortBy == other.sortBy &&
            sortDirection == other.sortDirection &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(filters, fieldFilter, pageSize, sortBy, sortDirection, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OpenScreenerAction{filters=$filters, fieldFilter=$fieldFilter, pageSize=$pageSize, sortBy=$sortBy, sortDirection=$sortDirection, additionalProperties=$additionalProperties}"
}
