// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.screener

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A reference to a screener field. */
class FieldRef
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val lookback: JsonField<FieldLookback>,
    private val period: JsonField<FieldPeriod>,
    private val valueType: JsonField<FieldType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lookback")
        @ExcludeMissing
        lookback: JsonField<FieldLookback> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<FieldPeriod> = JsonMissing.of(),
        @JsonProperty("value_type")
        @ExcludeMissing
        valueType: JsonField<FieldType> = JsonMissing.of(),
    ) : this(name, lookback, period, valueType, mutableMapOf())

    /**
     * The field name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Optional historical lookback window.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lookback(): Optional<FieldLookback> = lookback.getOptional("lookback")

    /**
     * Optional reporting period (e.g. quarter or TTM).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun period(): Optional<FieldPeriod> = period.getOptional("period")

    /**
     * The data type of the field value. Present only in responses.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valueType(): Optional<FieldType> = valueType.getOptional("value_type")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [lookback].
     *
     * Unlike [lookback], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lookback") @ExcludeMissing fun _lookback(): JsonField<FieldLookback> = lookback

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<FieldPeriod> = period

    /**
     * Returns the raw JSON value of [valueType].
     *
     * Unlike [valueType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value_type") @ExcludeMissing fun _valueType(): JsonField<FieldType> = valueType

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
         * Returns a mutable builder for constructing an instance of [FieldRef].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldRef]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var lookback: JsonField<FieldLookback> = JsonMissing.of()
        private var period: JsonField<FieldPeriod> = JsonMissing.of()
        private var valueType: JsonField<FieldType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fieldRef: FieldRef) = apply {
            name = fieldRef.name
            lookback = fieldRef.lookback
            period = fieldRef.period
            valueType = fieldRef.valueType
            additionalProperties = fieldRef.additionalProperties.toMutableMap()
        }

        /** The field name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Optional historical lookback window. */
        fun lookback(lookback: FieldLookback?) = lookback(JsonField.ofNullable(lookback))

        /** Alias for calling [Builder.lookback] with `lookback.orElse(null)`. */
        fun lookback(lookback: Optional<FieldLookback>) = lookback(lookback.getOrNull())

        /**
         * Sets [Builder.lookback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookback] with a well-typed [FieldLookback] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lookback(lookback: JsonField<FieldLookback>) = apply { this.lookback = lookback }

        /** Optional reporting period (e.g. quarter or TTM). */
        fun period(period: FieldPeriod?) = period(JsonField.ofNullable(period))

        /** Alias for calling [Builder.period] with `period.orElse(null)`. */
        fun period(period: Optional<FieldPeriod>) = period(period.getOrNull())

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [FieldPeriod] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun period(period: JsonField<FieldPeriod>) = apply { this.period = period }

        /** The data type of the field value. Present only in responses. */
        fun valueType(valueType: FieldType?) = valueType(JsonField.ofNullable(valueType))

        /** Alias for calling [Builder.valueType] with `valueType.orElse(null)`. */
        fun valueType(valueType: Optional<FieldType>) = valueType(valueType.getOrNull())

        /**
         * Sets [Builder.valueType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueType] with a well-typed [FieldType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun valueType(valueType: JsonField<FieldType>) = apply { this.valueType = valueType }

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
         * Returns an immutable instance of [FieldRef].
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
        fun build(): FieldRef =
            FieldRef(
                checkRequired("name", name),
                lookback,
                period,
                valueType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FieldRef = apply {
        if (validated) {
            return@apply
        }

        name()
        lookback().ifPresent { it.validate() }
        period().ifPresent { it.validate() }
        valueType().ifPresent { it.validate() }
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (lookback.asKnown().getOrNull()?.validity() ?: 0) +
            (period.asKnown().getOrNull()?.validity() ?: 0) +
            (valueType.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FieldRef &&
            name == other.name &&
            lookback == other.lookback &&
            period == other.period &&
            valueType == other.valueType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, lookback, period, valueType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FieldRef{name=$name, lookback=$lookback, period=$period, valueType=$valueType, additionalProperties=$additionalProperties}"
}
