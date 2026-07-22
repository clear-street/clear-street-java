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
 * Update a saved screener configuration.
 *
 * Replaces the screener configuration for the authenticated user. If `name` is null, the existing
 * name is preserved.
 */
class ScreenerReplaceScreenerParams
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
    fun columns(): Optional<List<FieldRef>> = body.columns()

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
     * Multi-field sort specifications
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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

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

        @JvmStatic fun none(): ScreenerReplaceScreenerParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ScreenerReplaceScreenerParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScreenerReplaceScreenerParams]. */
    class Builder internal constructor() {

        private var screenerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(screenerReplaceScreenerParams: ScreenerReplaceScreenerParams) = apply {
            screenerId = screenerReplaceScreenerParams.screenerId
            body = screenerReplaceScreenerParams.body.toBuilder()
            additionalHeaders = screenerReplaceScreenerParams.additionalHeaders.toBuilder()
            additionalQueryParams = screenerReplaceScreenerParams.additionalQueryParams.toBuilder()
        }

        fun screenerId(screenerId: String?) = apply { this.screenerId = screenerId }

        /** Alias for calling [Builder.screenerId] with `screenerId.orElse(null)`. */
        fun screenerId(screenerId: Optional<String>) = screenerId(screenerId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [columns]
         * - [filters]
         * - [name]
         * - [sorts]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Structured field references to include when running this screener */
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

        /** Multi-field sort specifications */
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
         * Returns an immutable instance of [ScreenerReplaceScreenerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScreenerReplaceScreenerParams =
            ScreenerReplaceScreenerParams(
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
        private val columns: JsonField<List<FieldRef>>,
        private val filters: JsonField<List<SearchFilter>>,
        private val name: JsonField<String>,
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
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sorts")
            @ExcludeMissing
            sorts: JsonField<List<SortSpec>> = JsonMissing.of(),
        ) : this(columns, filters, name, sorts, mutableMapOf())

        /**
         * Structured field references to include when running this screener
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun columns(): Optional<List<FieldRef>> = columns.getOptional("columns")

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
         * Multi-field sort specifications
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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
            private var name: JsonField<String> = JsonMissing.of()
            private var sorts: JsonField<MutableList<SortSpec>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                columns = body.columns.map { it.toMutableList() }
                filters = body.filters.map { it.toMutableList() }
                name = body.name
                sorts = body.sorts.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Structured field references to include when running this screener */
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

            /** Multi-field sort specifications */
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
                    name,
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
            name()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (sorts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                columns == other.columns &&
                filters == other.filters &&
                name == other.name &&
                sorts == other.sorts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(columns, filters, name, sorts, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{columns=$columns, filters=$filters, name=$name, sorts=$sorts, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScreenerReplaceScreenerParams &&
            screenerId == other.screenerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(screenerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ScreenerReplaceScreenerParams{screenerId=$screenerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
