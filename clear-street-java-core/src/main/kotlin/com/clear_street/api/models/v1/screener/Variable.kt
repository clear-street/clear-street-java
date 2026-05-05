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

/** A variable reference (field or built-in like `today`). */
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
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lookback")
        @ExcludeMissing
        lookback: JsonField<FieldLookback> = JsonMissing.of(),
        @JsonProperty("modifier") @ExcludeMissing modifier: JsonField<Modifier> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<FieldPeriod> = JsonMissing.of(),
    ) : this(name, lookback, modifier, period, mutableMapOf())

    /**
     * The variable name.
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
     * Optional arithmetic modifier.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifier(): Optional<Modifier> = modifier.getOptional("modifier")

    /**
     * Optional reporting period.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun period(): Optional<FieldPeriod> = period.getOptional("period")

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
     * Returns the raw JSON value of [modifier].
     *
     * Unlike [modifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modifier") @ExcludeMissing fun _modifier(): JsonField<Modifier> = modifier

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<FieldPeriod> = period

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

        /** Optional arithmetic modifier. */
        fun modifier(modifier: Modifier?) = modifier(JsonField.ofNullable(modifier))

        /** Alias for calling [Builder.modifier] with `modifier.orElse(null)`. */
        fun modifier(modifier: Optional<Modifier>) = modifier(modifier.getOrNull())

        /**
         * Sets [Builder.modifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifier] with a well-typed [Modifier] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modifier(modifier: JsonField<Modifier>) = apply { this.modifier = modifier }

        /** Optional reporting period. */
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ClearStreetInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (name.asKnown().isPresent) 1 else 0) +
            (lookback.asKnown().getOrNull()?.validity() ?: 0) +
            (modifier.asKnown().getOrNull()?.validity() ?: 0) +
            (period.asKnown().getOrNull()?.validity() ?: 0)

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
