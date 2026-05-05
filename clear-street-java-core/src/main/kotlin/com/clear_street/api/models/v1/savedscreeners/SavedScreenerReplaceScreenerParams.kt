// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.savedscreeners

import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.Params
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.screener.FieldRef
import com.clear_street.api.models.v1.screener.SearchFilter
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a saved screener configuration.
 *
 * Replaces the screener configuration for the authenticated user. If `name` is null, the existing
 * name is preserved.
 */
class SavedScreenerReplaceScreenerParams
private constructor(
    private val screenerId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun screenerId(): Optional<String> = Optional.ofNullable(screenerId)

    /**
     * Structured field references to include when running this screener
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldFilter(): Optional<List<FieldRef>> = body.fieldFilter()

    /**
     * Structured search filter criteria
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<List<SearchFilter>> = body.filters()

    /**
     * The name for this screener configuration
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Structured field reference to sort results by
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortBy(): Optional<FieldRef> = body.sortBy()

    /**
     * Sort direction for results
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortDirection(): Optional<SortDirection> = body.sortDirection()

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [sortBy].
     *
     * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sortBy(): JsonField<FieldRef> = body._sortBy()

    /**
     * Returns the raw JSON value of [sortDirection].
     *
     * Unlike [sortDirection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sortDirection(): JsonField<SortDirection> = body._sortDirection()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SavedScreenerReplaceScreenerParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SavedScreenerReplaceScreenerParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SavedScreenerReplaceScreenerParams]. */
    class Builder internal constructor() {

        private var screenerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(savedScreenerReplaceScreenerParams: SavedScreenerReplaceScreenerParams) =
            apply {
                screenerId = savedScreenerReplaceScreenerParams.screenerId
                body = savedScreenerReplaceScreenerParams.body.toBuilder()
                additionalHeaders = savedScreenerReplaceScreenerParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    savedScreenerReplaceScreenerParams.additionalQueryParams.toBuilder()
            }

        fun screenerId(screenerId: String?) = apply { this.screenerId = screenerId }

        /** Alias for calling [Builder.screenerId] with `screenerId.orElse(null)`. */
        fun screenerId(screenerId: Optional<String>) = screenerId(screenerId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [fieldFilter]
         * - [filters]
         * - [name]
         * - [sortBy]
         * - [sortDirection]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Structured field references to include when running this screener */
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

        /** Structured search filter criteria */
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

        /** The name for this screener configuration */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Structured field reference to sort results by */
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

        /** Sort direction for results */
        fun sortDirection(sortDirection: SortDirection?) = apply {
            body.sortDirection(sortDirection)
        }

        /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
        fun sortDirection(sortDirection: Optional<SortDirection>) =
            sortDirection(sortDirection.getOrNull())

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
         * Returns an immutable instance of [SavedScreenerReplaceScreenerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SavedScreenerReplaceScreenerParams =
            SavedScreenerReplaceScreenerParams(
                screenerId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> screenerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for creating or updating a saved screener configuration */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fieldFilter: JsonField<List<FieldRef>>,
        private val filters: JsonField<List<SearchFilter>>,
        private val name: JsonField<String>,
        private val sortBy: JsonField<FieldRef>,
        private val sortDirection: JsonField<SortDirection>,
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
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sort_by") @ExcludeMissing sortBy: JsonField<FieldRef> = JsonMissing.of(),
            @JsonProperty("sort_direction")
            @ExcludeMissing
            sortDirection: JsonField<SortDirection> = JsonMissing.of(),
        ) : this(fieldFilter, filters, name, sortBy, sortDirection, mutableMapOf())

        /**
         * Structured field references to include when running this screener
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fieldFilter(): Optional<List<FieldRef>> = fieldFilter.getOptional("field_filter")

        /**
         * Structured search filter criteria
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filters(): Optional<List<SearchFilter>> = filters.getOptional("filters")

        /**
         * The name for this screener configuration
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Structured field reference to sort results by
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sortBy(): Optional<FieldRef> = sortBy.getOptional("sort_by")

        /**
         * Sort direction for results
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sortDirection(): Optional<SortDirection> = sortDirection.getOptional("sort_direction")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [sortBy].
         *
         * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sort_by") @ExcludeMissing fun _sortBy(): JsonField<FieldRef> = sortBy

        /**
         * Returns the raw JSON value of [sortDirection].
         *
         * Unlike [sortDirection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sort_direction")
        @ExcludeMissing
        fun _sortDirection(): JsonField<SortDirection> = sortDirection

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
            private var name: JsonField<String> = JsonMissing.of()
            private var sortBy: JsonField<FieldRef> = JsonMissing.of()
            private var sortDirection: JsonField<SortDirection> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                fieldFilter = body.fieldFilter.map { it.toMutableList() }
                filters = body.filters.map { it.toMutableList() }
                name = body.name
                sortBy = body.sortBy
                sortDirection = body.sortDirection
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Structured field references to include when running this screener */
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

            /** Structured search filter criteria */
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

            /** The name for this screener configuration */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Structured field reference to sort results by */
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

            /** Sort direction for results */
            fun sortDirection(sortDirection: SortDirection?) =
                sortDirection(JsonField.ofNullable(sortDirection))

            /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
            fun sortDirection(sortDirection: Optional<SortDirection>) =
                sortDirection(sortDirection.getOrNull())

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
                    name,
                    sortBy,
                    sortDirection,
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
            name()
            sortBy().ifPresent { it.validate() }
            sortDirection().ifPresent { it.validate() }
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (sortBy.asKnown().getOrNull()?.validity() ?: 0) +
                (sortDirection.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                fieldFilter == other.fieldFilter &&
                filters == other.filters &&
                name == other.name &&
                sortBy == other.sortBy &&
                sortDirection == other.sortDirection &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fieldFilter, filters, name, sortBy, sortDirection, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fieldFilter=$fieldFilter, filters=$filters, name=$name, sortBy=$sortBy, sortDirection=$sortDirection, additionalProperties=$additionalProperties}"
    }

    /** Sort direction for results */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SavedScreenerReplaceScreenerParams &&
            screenerId == other.screenerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(screenerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SavedScreenerReplaceScreenerParams{screenerId=$screenerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
