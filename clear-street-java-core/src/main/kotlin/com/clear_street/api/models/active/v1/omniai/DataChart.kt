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

class DataChart
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val series: JsonField<List<ChartSeries>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("series")
        @ExcludeMissing
        series: JsonField<List<ChartSeries>> = JsonMissing.of()
    ) : this(series, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<ChartSeries> = series.getRequired("series")

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<ChartSeries>> = series

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
         * Returns a mutable builder for constructing an instance of [DataChart].
         *
         * The following fields are required:
         * ```java
         * .series()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataChart]. */
    class Builder internal constructor() {

        private var series: JsonField<MutableList<ChartSeries>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataChart: DataChart) = apply {
            series = dataChart.series.map { it.toMutableList() }
            additionalProperties = dataChart.additionalProperties.toMutableMap()
        }

        fun series(series: List<ChartSeries>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed `List<ChartSeries>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun series(series: JsonField<List<ChartSeries>>) = apply {
            this.series = series.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChartSeries] to [Builder.series].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeries(series: ChartSeries) = apply {
            this.series =
                (this.series ?: JsonField.of(mutableListOf())).also {
                    checkKnown("series", it).add(series)
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
         * Returns an immutable instance of [DataChart].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .series()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataChart =
            DataChart(
                checkRequired("series", series).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataChart = apply {
        if (validated) {
            return@apply
        }

        series().forEach { it.validate() }
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
        (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataChart &&
            series == other.series &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(series, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataChart{series=$series, additionalProperties=$additionalProperties}"
}
