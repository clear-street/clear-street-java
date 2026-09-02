// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A curated highlight, resolved against the company profile's metric series. */
class OfferingHighlight
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val label: JsonField<String>,
    private val metricKey: JsonField<String>,
    private val unit: JsonField<MetricUnit>,
    private val observedAt: JsonField<OffsetDateTime>,
    private val value: JsonField<String>,
    private val valueType: JsonField<MetricValueType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metric_key") @ExcludeMissing metricKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<MetricUnit> = JsonMissing.of(),
        @JsonProperty("observed_at")
        @ExcludeMissing
        observedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value_type")
        @ExcludeMissing
        valueType: JsonField<MetricValueType> = JsonMissing.of(),
    ) : this(label, metricKey, unit, observedAt, value, valueType, mutableMapOf())

    /**
     * Display label (the highlight's override, else the series' own label).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Canonical metric key selected by the highlight (e.g. `REVENUE_GROWTH`).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metricKey(): String = metricKey.getRequired("metric_key")

    /**
     * Value unit.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unit(): MetricUnit = unit.getRequired("unit")

    /**
     * Observation time of the latest value.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun observedAt(): Optional<OffsetDateTime> = observedAt.getOptional("observed_at")

    /**
     * Latest observed value, when the series carries any points.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<String> = value.getOptional("value")

    /**
     * Whether the latest value is historical or estimated.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valueType(): Optional<MetricValueType> = valueType.getOptional("value_type")

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [metricKey].
     *
     * Unlike [metricKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metric_key") @ExcludeMissing fun _metricKey(): JsonField<String> = metricKey

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<MetricUnit> = unit

    /**
     * Returns the raw JSON value of [observedAt].
     *
     * Unlike [observedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("observed_at")
    @ExcludeMissing
    fun _observedAt(): JsonField<OffsetDateTime> = observedAt

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [valueType].
     *
     * Unlike [valueType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value_type")
    @ExcludeMissing
    fun _valueType(): JsonField<MetricValueType> = valueType

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
         * Returns a mutable builder for constructing an instance of [OfferingHighlight].
         *
         * The following fields are required:
         * ```java
         * .label()
         * .metricKey()
         * .unit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OfferingHighlight]. */
    class Builder internal constructor() {

        private var label: JsonField<String>? = null
        private var metricKey: JsonField<String>? = null
        private var unit: JsonField<MetricUnit>? = null
        private var observedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var value: JsonField<String> = JsonMissing.of()
        private var valueType: JsonField<MetricValueType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(offeringHighlight: OfferingHighlight) = apply {
            label = offeringHighlight.label
            metricKey = offeringHighlight.metricKey
            unit = offeringHighlight.unit
            observedAt = offeringHighlight.observedAt
            value = offeringHighlight.value
            valueType = offeringHighlight.valueType
            additionalProperties = offeringHighlight.additionalProperties.toMutableMap()
        }

        /** Display label (the highlight's override, else the series' own label). */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Canonical metric key selected by the highlight (e.g. `REVENUE_GROWTH`). */
        fun metricKey(metricKey: String) = metricKey(JsonField.of(metricKey))

        /**
         * Sets [Builder.metricKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metricKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metricKey(metricKey: JsonField<String>) = apply { this.metricKey = metricKey }

        /** Value unit. */
        fun unit(unit: MetricUnit) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [MetricUnit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<MetricUnit>) = apply { this.unit = unit }

        /** Observation time of the latest value. */
        fun observedAt(observedAt: OffsetDateTime?) = observedAt(JsonField.ofNullable(observedAt))

        /** Alias for calling [Builder.observedAt] with `observedAt.orElse(null)`. */
        fun observedAt(observedAt: Optional<OffsetDateTime>) = observedAt(observedAt.getOrNull())

        /**
         * Sets [Builder.observedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observedAt(observedAt: JsonField<OffsetDateTime>) = apply {
            this.observedAt = observedAt
        }

        /** Latest observed value, when the series carries any points. */
        fun value(value: String?) = value(JsonField.ofNullable(value))

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<String>) = value(value.getOrNull())

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        /** Whether the latest value is historical or estimated. */
        fun valueType(valueType: MetricValueType?) = valueType(JsonField.ofNullable(valueType))

        /** Alias for calling [Builder.valueType] with `valueType.orElse(null)`. */
        fun valueType(valueType: Optional<MetricValueType>) = valueType(valueType.getOrNull())

        /**
         * Sets [Builder.valueType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueType] with a well-typed [MetricValueType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun valueType(valueType: JsonField<MetricValueType>) = apply { this.valueType = valueType }

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
         * Returns an immutable instance of [OfferingHighlight].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .label()
         * .metricKey()
         * .unit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OfferingHighlight =
            OfferingHighlight(
                checkRequired("label", label),
                checkRequired("metricKey", metricKey),
                checkRequired("unit", unit),
                observedAt,
                value,
                valueType,
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
    fun validate(): OfferingHighlight = apply {
        if (validated) {
            return@apply
        }

        label()
        metricKey()
        unit().validate()
        observedAt()
        value()
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
        (if (label.asKnown().isPresent) 1 else 0) +
            (if (metricKey.asKnown().isPresent) 1 else 0) +
            (unit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (observedAt.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (valueType.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OfferingHighlight &&
            label == other.label &&
            metricKey == other.metricKey &&
            unit == other.unit &&
            observedAt == other.observedAt &&
            value == other.value &&
            valueType == other.valueType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(label, metricKey, unit, observedAt, value, valueType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OfferingHighlight{label=$label, metricKey=$metricKey, unit=$unit, observedAt=$observedAt, value=$value, valueType=$valueType, additionalProperties=$additionalProperties}"
}
