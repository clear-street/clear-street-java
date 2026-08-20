// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Struct-of-arrays: all four fields are the same length, index `i` is one field. */
class FieldColumns
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<List<String>>,
    private val displayName: JsonField<List<String>>,
    private val kind: JsonField<List<Int>>,
    private val name: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<List<String>> = JsonMissing.of(),
    ) : this(description, displayName, kind, name, mutableMapOf())

    /**
     * A human-readable description of the field.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): List<String> = description.getRequired("description")

    /**
     * The display name of the column when no `period` / `lookback` is set.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): List<String> = displayName.getRequired("display_name")

    /**
     * Index into `Catalog::kinds`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): List<Int> = kind.getRequired("kind")

    /**
     * The base field name, as accepted in a request's `left.name` / `right[].variable` field
     * reference.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): List<String> = name.getRequired("name")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description(): JsonField<List<String>> = description

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<List<String>> = displayName

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<List<Int>> = kind

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<List<String>> = name

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
         * Returns a mutable builder for constructing an instance of [FieldColumns].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .displayName()
         * .kind()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldColumns]. */
    class Builder internal constructor() {

        private var description: JsonField<MutableList<String>>? = null
        private var displayName: JsonField<MutableList<String>>? = null
        private var kind: JsonField<MutableList<Int>>? = null
        private var name: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fieldColumns: FieldColumns) = apply {
            description = fieldColumns.description.map { it.toMutableList() }
            displayName = fieldColumns.displayName.map { it.toMutableList() }
            kind = fieldColumns.kind.map { it.toMutableList() }
            name = fieldColumns.name.map { it.toMutableList() }
            additionalProperties = fieldColumns.additionalProperties.toMutableMap()
        }

        /** A human-readable description of the field. */
        fun description(description: List<String>) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun description(description: JsonField<List<String>>) = apply {
            this.description = description.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.description].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDescription(description: String) = apply {
            this.description =
                (this.description ?: JsonField.of(mutableListOf())).also {
                    checkKnown("description", it).add(description)
                }
        }

        /** The display name of the column when no `period` / `lookback` is set. */
        fun displayName(displayName: List<String>) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun displayName(displayName: JsonField<List<String>>) = apply {
            this.displayName = displayName.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.displayName].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDisplayName(displayName: String) = apply {
            this.displayName =
                (this.displayName ?: JsonField.of(mutableListOf())).also {
                    checkKnown("displayName", it).add(displayName)
                }
        }

        /** Index into `Catalog::kinds`. */
        fun kind(kind: List<Int>) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed `List<Int>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<List<Int>>) = apply { this.kind = kind.map { it.toMutableList() } }

        /**
         * Adds a single [Int] to [Builder.kind].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKind(kind: Int) = apply {
            this.kind =
                (this.kind ?: JsonField.of(mutableListOf())).also {
                    checkKnown("kind", it).add(kind)
                }
        }

        /**
         * The base field name, as accepted in a request's `left.name` / `right[].variable` field
         * reference.
         */
        fun name(name: List<String>) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun name(name: JsonField<List<String>>) = apply {
            this.name = name.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.name].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addName(name: String) = apply {
            this.name =
                (this.name ?: JsonField.of(mutableListOf())).also {
                    checkKnown("name", it).add(name)
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
         * Returns an immutable instance of [FieldColumns].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .displayName()
         * .kind()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FieldColumns =
            FieldColumns(
                checkRequired("description", description).map { it.toImmutable() },
                checkRequired("displayName", displayName).map { it.toImmutable() },
                checkRequired("kind", kind).map { it.toImmutable() },
                checkRequired("name", name).map { it.toImmutable() },
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
    fun validate(): FieldColumns = apply {
        if (validated) {
            return@apply
        }

        description()
        displayName()
        kind()
        name()
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
        (description.asKnown().getOrNull()?.size ?: 0) +
            (displayName.asKnown().getOrNull()?.size ?: 0) +
            (kind.asKnown().getOrNull()?.size ?: 0) +
            (name.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FieldColumns &&
            description == other.description &&
            displayName == other.displayName &&
            kind == other.kind &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, displayName, kind, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FieldColumns{description=$description, displayName=$displayName, kind=$kind, name=$name, additionalProperties=$additionalProperties}"
}
