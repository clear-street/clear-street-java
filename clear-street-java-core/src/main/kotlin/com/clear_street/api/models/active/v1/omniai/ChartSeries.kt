// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ChartSeries
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val points: JsonField<List<ChartPoint>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("points")
        @ExcludeMissing
        points: JsonField<List<ChartPoint>> = JsonMissing.of(),
    ) : this(name, points, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun points(): List<ChartPoint> = points.getRequired("points")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [points].
     *
     * Unlike [points], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("points") @ExcludeMissing fun _points(): JsonField<List<ChartPoint>> = points

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
         * Returns a mutable builder for constructing an instance of [ChartSeries].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .points()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChartSeries]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var points: JsonField<MutableList<ChartPoint>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chartSeries: ChartSeries) = apply {
            name = chartSeries.name
            points = chartSeries.points.map { it.toMutableList() }
            additionalProperties = chartSeries.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun points(points: List<ChartPoint>) = points(JsonField.of(points))

        /**
         * Sets [Builder.points] to an arbitrary JSON value.
         *
         * You should usually call [Builder.points] with a well-typed `List<ChartPoint>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun points(points: JsonField<List<ChartPoint>>) = apply {
            this.points = points.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChartPoint] to [points].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPoint(point: ChartPoint) = apply {
            points =
                (points ?: JsonField.of(mutableListOf())).also {
                    checkKnown("points", it).add(point)
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
         * Returns an immutable instance of [ChartSeries].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .points()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChartSeries =
            ChartSeries(
                checkRequired("name", name),
                checkRequired("points", points).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChartSeries = apply {
        if (validated) {
            return@apply
        }

        name()
        points().forEach { it.validate() }
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
            (points.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChartSeries &&
            name == other.name &&
            points == other.points &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(name, points, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChartSeries{name=$name, points=$points, additionalProperties=$additionalProperties}"
}
