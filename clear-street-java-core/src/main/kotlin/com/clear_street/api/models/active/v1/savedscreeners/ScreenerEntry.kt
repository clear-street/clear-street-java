// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A saved screener configuration entry */
class ScreenerEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val filters: JsonField<List<SavedScreenerFilter>>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val fieldFilter: JsonField<List<String>>,
    private val sortBy: JsonField<String>,
    private val sortDirection: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<SavedScreenerFilter>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("field_filter")
        @ExcludeMissing
        fieldFilter: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sort_by") @ExcludeMissing sortBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sort_direction")
        @ExcludeMissing
        sortDirection: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        filters,
        name,
        updatedAt,
        fieldFilter,
        sortBy,
        sortDirection,
        mutableMapOf(),
    )

    /**
     * Unique identifier for this screener
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * When this screener was created
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Filter criteria for this screener
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<SavedScreenerFilter> = filters.getRequired("filters")

    /**
     * The name of this screener configuration
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * When this screener was last updated
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * List of field names to include when running this screener
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldFilter(): Optional<List<String>> = fieldFilter.getOptional("field_filter")

    /**
     * Field name to sort results by
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortBy(): Optional<String> = sortBy.getOptional("sort_by")

    /**
     * Sort direction for results
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortDirection(): Optional<String> = sortDirection.getOptional("sort_direction")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<List<SavedScreenerFilter>> = filters

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [fieldFilter].
     *
     * Unlike [fieldFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field_filter")
    @ExcludeMissing
    fun _fieldFilter(): JsonField<List<String>> = fieldFilter

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
         * Returns a mutable builder for constructing an instance of [ScreenerEntry].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .filters()
         * .name()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScreenerEntry]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var filters: JsonField<MutableList<SavedScreenerFilter>>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var fieldFilter: JsonField<MutableList<String>>? = null
        private var sortBy: JsonField<String> = JsonMissing.of()
        private var sortDirection: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(screenerEntry: ScreenerEntry) = apply {
            id = screenerEntry.id
            createdAt = screenerEntry.createdAt
            filters = screenerEntry.filters.map { it.toMutableList() }
            name = screenerEntry.name
            updatedAt = screenerEntry.updatedAt
            fieldFilter = screenerEntry.fieldFilter.map { it.toMutableList() }
            sortBy = screenerEntry.sortBy
            sortDirection = screenerEntry.sortDirection
            additionalProperties = screenerEntry.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this screener */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** When this screener was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Filter criteria for this screener */
        fun filters(filters: List<SavedScreenerFilter>) = filters(JsonField.of(filters))

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<SavedScreenerFilter>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filters(filters: JsonField<List<SavedScreenerFilter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [SavedScreenerFilter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: SavedScreenerFilter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
                }
        }

        /** The name of this screener configuration */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** When this screener was last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** List of field names to include when running this screener */
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

        /** Field name to sort results by */
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

        /** Sort direction for results */
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
         * Returns an immutable instance of [ScreenerEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .filters()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScreenerEntry =
            ScreenerEntry(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("filters", filters).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                (fieldFilter ?: JsonMissing.of()).map { it.toImmutable() },
                sortBy,
                sortDirection,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScreenerEntry = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        filters().forEach { it.validate() }
        name()
        updatedAt()
        fieldFilter()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (fieldFilter.asKnown().getOrNull()?.size ?: 0) +
            (if (sortBy.asKnown().isPresent) 1 else 0) +
            (if (sortDirection.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScreenerEntry &&
            id == other.id &&
            createdAt == other.createdAt &&
            filters == other.filters &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            fieldFilter == other.fieldFilter &&
            sortBy == other.sortBy &&
            sortDirection == other.sortDirection &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            filters,
            name,
            updatedAt,
            fieldFilter,
            sortBy,
            sortDirection,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScreenerEntry{id=$id, createdAt=$createdAt, filters=$filters, name=$name, updatedAt=$updatedAt, fieldFilter=$fieldFilter, sortBy=$sortBy, sortDirection=$sortDirection, additionalProperties=$additionalProperties}"
}
