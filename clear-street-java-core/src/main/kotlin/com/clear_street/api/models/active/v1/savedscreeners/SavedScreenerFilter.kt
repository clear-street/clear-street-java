// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** A single filter criterion for a screener */
class SavedScreenerFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fieldName: JsonField<String>,
    private val operation: JsonField<String>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("field_name") @ExcludeMissing fieldName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operation") @ExcludeMissing operation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(fieldName, operation, value, mutableMapOf())

    /**
     * The field name to filter on
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldName(): String = fieldName.getRequired("field_name")

    /**
     * The filter operation (lt, lte, gt, gte, eq, rgx, bw, ew)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operation(): String = operation.getRequired("operation")

    /**
     * The filter value
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * Returns the raw JSON value of [fieldName].
     *
     * Unlike [fieldName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("field_name") @ExcludeMissing fun _fieldName(): JsonField<String> = fieldName

    /**
     * Returns the raw JSON value of [operation].
     *
     * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<String> = operation

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [SavedScreenerFilter].
         *
         * The following fields are required:
         * ```java
         * .fieldName()
         * .operation()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SavedScreenerFilter]. */
    class Builder internal constructor() {

        private var fieldName: JsonField<String>? = null
        private var operation: JsonField<String>? = null
        private var value: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(savedScreenerFilter: SavedScreenerFilter) = apply {
            fieldName = savedScreenerFilter.fieldName
            operation = savedScreenerFilter.operation
            value = savedScreenerFilter.value
            additionalProperties = savedScreenerFilter.additionalProperties.toMutableMap()
        }

        /** The field name to filter on */
        fun fieldName(fieldName: String) = fieldName(JsonField.of(fieldName))

        /**
         * Sets [Builder.fieldName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldName(fieldName: JsonField<String>) = apply { this.fieldName = fieldName }

        /** The filter operation (lt, lte, gt, gte, eq, rgx, bw, ew) */
        fun operation(operation: String) = operation(JsonField.of(operation))

        /**
         * Sets [Builder.operation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operation(operation: JsonField<String>) = apply { this.operation = operation }

        /** The filter value */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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
         * Returns an immutable instance of [SavedScreenerFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fieldName()
         * .operation()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SavedScreenerFilter =
            SavedScreenerFilter(
                checkRequired("fieldName", fieldName),
                checkRequired("operation", operation),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SavedScreenerFilter = apply {
        if (validated) {
            return@apply
        }

        fieldName()
        operation()
        value()
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
        (if (fieldName.asKnown().isPresent) 1 else 0) +
            (if (operation.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SavedScreenerFilter &&
            fieldName == other.fieldName &&
            operation == other.operation &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fieldName, operation, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SavedScreenerFilter{fieldName=$fieldName, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
}
