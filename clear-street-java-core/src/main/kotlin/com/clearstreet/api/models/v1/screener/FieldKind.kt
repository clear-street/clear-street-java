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

/**
 * One deduplicated `(category, format, value_type, combinations, default combination)` tuple;
 * `fields.kind[i]` indexes into `Catalog::kinds`.
 */
class FieldKind
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val category: JsonField<String>,
    private val combinations: JsonField<List<Combination>>,
    private val defaultCombination: JsonField<Combination>,
    private val format: JsonField<String>,
    private val valueType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("combinations")
        @ExcludeMissing
        combinations: JsonField<List<Combination>> = JsonMissing.of(),
        @JsonProperty("default_combination")
        @ExcludeMissing
        defaultCombination: JsonField<Combination> = JsonMissing.of(),
        @JsonProperty("format") @ExcludeMissing format: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value_type") @ExcludeMissing valueType: JsonField<String> = JsonMissing.of(),
    ) : this(category, combinations, defaultCombination, format, valueType, mutableMapOf())

    /**
     * The field's category, a member of `enums.category`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): String = category.getRequired("category")

    /**
     * Ordered, in declaration order. The empty combination is the current or most recent value.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun combinations(): List<Combination> = combinations.getRequired("combinations")

    /**
     * The combination a bare field reference resolves to: the field's current or most recent value
     * when the kind offers it, otherwise the kind's default `period` / `lookback`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultCombination(): Combination = defaultCombination.getRequired("default_combination")

    /**
     * The field's format, a member of `enums.format`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun format(): String = format.getRequired("format")

    /**
     * The field's value type, a member of `enums.value_type`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun valueType(): String = valueType.getRequired("value_type")

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [combinations].
     *
     * Unlike [combinations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("combinations")
    @ExcludeMissing
    fun _combinations(): JsonField<List<Combination>> = combinations

    /**
     * Returns the raw JSON value of [defaultCombination].
     *
     * Unlike [defaultCombination], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_combination")
    @ExcludeMissing
    fun _defaultCombination(): JsonField<Combination> = defaultCombination

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

    /**
     * Returns the raw JSON value of [valueType].
     *
     * Unlike [valueType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value_type") @ExcludeMissing fun _valueType(): JsonField<String> = valueType

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
         * Returns a mutable builder for constructing an instance of [FieldKind].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .combinations()
         * .defaultCombination()
         * .format()
         * .valueType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldKind]. */
    class Builder internal constructor() {

        private var category: JsonField<String>? = null
        private var combinations: JsonField<MutableList<Combination>>? = null
        private var defaultCombination: JsonField<Combination>? = null
        private var format: JsonField<String>? = null
        private var valueType: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fieldKind: FieldKind) = apply {
            category = fieldKind.category
            combinations = fieldKind.combinations.map { it.toMutableList() }
            defaultCombination = fieldKind.defaultCombination
            format = fieldKind.format
            valueType = fieldKind.valueType
            additionalProperties = fieldKind.additionalProperties.toMutableMap()
        }

        /** The field's category, a member of `enums.category`. */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        /**
         * Ordered, in declaration order. The empty combination is the current or most recent value.
         */
        fun combinations(combinations: List<Combination>) = combinations(JsonField.of(combinations))

        /**
         * Sets [Builder.combinations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.combinations] with a well-typed `List<Combination>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun combinations(combinations: JsonField<List<Combination>>) = apply {
            this.combinations = combinations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Combination] to [combinations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCombination(combination: Combination) = apply {
            combinations =
                (combinations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("combinations", it).add(combination)
                }
        }

        /**
         * The combination a bare field reference resolves to: the field's current or most recent
         * value when the kind offers it, otherwise the kind's default `period` / `lookback`.
         */
        fun defaultCombination(defaultCombination: Combination) =
            defaultCombination(JsonField.of(defaultCombination))

        /**
         * Sets [Builder.defaultCombination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultCombination] with a well-typed [Combination]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultCombination(defaultCombination: JsonField<Combination>) = apply {
            this.defaultCombination = defaultCombination
        }

        /** The field's format, a member of `enums.format`. */
        fun format(format: String) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<String>) = apply { this.format = format }

        /** The field's value type, a member of `enums.value_type`. */
        fun valueType(valueType: String) = valueType(JsonField.of(valueType))

        /**
         * Sets [Builder.valueType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun valueType(valueType: JsonField<String>) = apply { this.valueType = valueType }

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
         * Returns an immutable instance of [FieldKind].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .combinations()
         * .defaultCombination()
         * .format()
         * .valueType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FieldKind =
            FieldKind(
                checkRequired("category", category),
                checkRequired("combinations", combinations).map { it.toImmutable() },
                checkRequired("defaultCombination", defaultCombination),
                checkRequired("format", format),
                checkRequired("valueType", valueType),
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
    fun validate(): FieldKind = apply {
        if (validated) {
            return@apply
        }

        category()
        combinations().forEach { it.validate() }
        defaultCombination().validate()
        format()
        valueType()
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
        (if (category.asKnown().isPresent) 1 else 0) +
            (combinations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (defaultCombination.asKnown().getOrNull()?.validity() ?: 0) +
            (if (format.asKnown().isPresent) 1 else 0) +
            (if (valueType.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FieldKind &&
            category == other.category &&
            combinations == other.combinations &&
            defaultCombination == other.defaultCombination &&
            format == other.format &&
            valueType == other.valueType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            category,
            combinations,
            defaultCombination,
            format,
            valueType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FieldKind{category=$category, combinations=$combinations, defaultCombination=$defaultCombination, format=$format, valueType=$valueType, additionalProperties=$additionalProperties}"
}
