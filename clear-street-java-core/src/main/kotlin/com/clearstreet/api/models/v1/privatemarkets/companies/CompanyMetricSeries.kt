// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricUnit
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A historical or estimated company metric series. */
class CompanyMetricSeries
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val frequency: JsonField<MetricFrequency>,
    private val label: JsonField<String>,
    private val metricKey: JsonField<MetricKey>,
    private val source: JsonField<String>,
    private val unit: JsonField<MetricUnit>,
    private val externalId: JsonField<String>,
    private val points: JsonField<List<CompanyMetricPoint>>,
    private val sourceUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<MetricFrequency> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metric_key")
        @ExcludeMissing
        metricKey: JsonField<MetricKey> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<MetricUnit> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("points")
        @ExcludeMissing
        points: JsonField<List<CompanyMetricPoint>> = JsonMissing.of(),
        @JsonProperty("source_url") @ExcludeMissing sourceUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        frequency,
        label,
        metricKey,
        source,
        unit,
        externalId,
        points,
        sourceUrl,
        mutableMapOf(),
    )

    /**
     * Observation cadence.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frequency(): MetricFrequency = frequency.getRequired("frequency")

    /**
     * Display label.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Canonical metric key.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metricKey(): MetricKey = metricKey.getRequired("metric_key")

    /**
     * Publisher/provider name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Value unit.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unit(): MetricUnit = unit.getRequired("unit")

    /**
     * Optional source identifier retained for reconciliation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("external_id")

    /**
     * Ordered observations.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun points(): Optional<List<CompanyMetricPoint>> = points.getOptional("points")

    /**
     * Source URL, when available.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceUrl(): Optional<String> = sourceUrl.getOptional("source_url")

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency")
    @ExcludeMissing
    fun _frequency(): JsonField<MetricFrequency> = frequency

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
    @JsonProperty("metric_key") @ExcludeMissing fun _metricKey(): JsonField<MetricKey> = metricKey

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<MetricUnit> = unit

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [points].
     *
     * Unlike [points], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("points")
    @ExcludeMissing
    fun _points(): JsonField<List<CompanyMetricPoint>> = points

    /**
     * Returns the raw JSON value of [sourceUrl].
     *
     * Unlike [sourceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_url") @ExcludeMissing fun _sourceUrl(): JsonField<String> = sourceUrl

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
         * Returns a mutable builder for constructing an instance of [CompanyMetricSeries].
         *
         * The following fields are required:
         * ```java
         * .frequency()
         * .label()
         * .metricKey()
         * .source()
         * .unit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyMetricSeries]. */
    class Builder internal constructor() {

        private var frequency: JsonField<MetricFrequency>? = null
        private var label: JsonField<String>? = null
        private var metricKey: JsonField<MetricKey>? = null
        private var source: JsonField<String>? = null
        private var unit: JsonField<MetricUnit>? = null
        private var externalId: JsonField<String> = JsonMissing.of()
        private var points: JsonField<MutableList<CompanyMetricPoint>>? = null
        private var sourceUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyMetricSeries: CompanyMetricSeries) = apply {
            frequency = companyMetricSeries.frequency
            label = companyMetricSeries.label
            metricKey = companyMetricSeries.metricKey
            source = companyMetricSeries.source
            unit = companyMetricSeries.unit
            externalId = companyMetricSeries.externalId
            points = companyMetricSeries.points.map { it.toMutableList() }
            sourceUrl = companyMetricSeries.sourceUrl
            additionalProperties = companyMetricSeries.additionalProperties.toMutableMap()
        }

        /** Observation cadence. */
        fun frequency(frequency: MetricFrequency) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [MetricFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequency(frequency: JsonField<MetricFrequency>) = apply { this.frequency = frequency }

        /** Display label. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Canonical metric key. */
        fun metricKey(metricKey: MetricKey) = metricKey(JsonField.of(metricKey))

        /**
         * Sets [Builder.metricKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metricKey] with a well-typed [MetricKey] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metricKey(metricKey: JsonField<MetricKey>) = apply { this.metricKey = metricKey }

        /** Publisher/provider name. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Value unit. */
        fun unit(unit: MetricUnit) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [MetricUnit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<MetricUnit>) = apply { this.unit = unit }

        /** Optional source identifier retained for reconciliation. */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
        fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** Ordered observations. */
        fun points(points: List<CompanyMetricPoint>) = points(JsonField.of(points))

        /**
         * Sets [Builder.points] to an arbitrary JSON value.
         *
         * You should usually call [Builder.points] with a well-typed `List<CompanyMetricPoint>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun points(points: JsonField<List<CompanyMetricPoint>>) = apply {
            this.points = points.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyMetricPoint] to [points].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPoint(point: CompanyMetricPoint) = apply {
            points =
                (points ?: JsonField.of(mutableListOf())).also {
                    checkKnown("points", it).add(point)
                }
        }

        /** Source URL, when available. */
        fun sourceUrl(sourceUrl: String?) = sourceUrl(JsonField.ofNullable(sourceUrl))

        /** Alias for calling [Builder.sourceUrl] with `sourceUrl.orElse(null)`. */
        fun sourceUrl(sourceUrl: Optional<String>) = sourceUrl(sourceUrl.getOrNull())

        /**
         * Sets [Builder.sourceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceUrl(sourceUrl: JsonField<String>) = apply { this.sourceUrl = sourceUrl }

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
         * Returns an immutable instance of [CompanyMetricSeries].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .frequency()
         * .label()
         * .metricKey()
         * .source()
         * .unit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyMetricSeries =
            CompanyMetricSeries(
                checkRequired("frequency", frequency),
                checkRequired("label", label),
                checkRequired("metricKey", metricKey),
                checkRequired("source", source),
                checkRequired("unit", unit),
                externalId,
                (points ?: JsonMissing.of()).map { it.toImmutable() },
                sourceUrl,
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
    fun validate(): CompanyMetricSeries = apply {
        if (validated) {
            return@apply
        }

        frequency().validate()
        label()
        metricKey().validate()
        source()
        unit().validate()
        externalId()
        points().ifPresent { it.forEach { it.validate() } }
        sourceUrl()
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
        (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (metricKey.asKnown().getOrNull()?.validity() ?: 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (unit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (points.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sourceUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyMetricSeries &&
            frequency == other.frequency &&
            label == other.label &&
            metricKey == other.metricKey &&
            source == other.source &&
            unit == other.unit &&
            externalId == other.externalId &&
            points == other.points &&
            sourceUrl == other.sourceUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            frequency,
            label,
            metricKey,
            source,
            unit,
            externalId,
            points,
            sourceUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyMetricSeries{frequency=$frequency, label=$label, metricKey=$metricKey, source=$source, unit=$unit, externalId=$externalId, points=$points, sourceUrl=$sourceUrl, additionalProperties=$additionalProperties}"
}
