// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

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

/** Prediction market series with at least one market that can currently be listed. */
class PredictionSeriesList
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val series: JsonField<List<PredictionSeries>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("series")
        @ExcludeMissing
        series: JsonField<List<PredictionSeries>> = JsonMissing.of()
    ) : this(series, mutableMapOf())

    /**
     * Series ordered by code.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<PredictionSeries> = series.getRequired("series")

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series")
    @ExcludeMissing
    fun _series(): JsonField<List<PredictionSeries>> = series

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
         * Returns a mutable builder for constructing an instance of [PredictionSeriesList].
         *
         * The following fields are required:
         * ```java
         * .series()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PredictionSeriesList]. */
    class Builder internal constructor() {

        private var series: JsonField<MutableList<PredictionSeries>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(predictionSeriesList: PredictionSeriesList) = apply {
            series = predictionSeriesList.series.map { it.toMutableList() }
            additionalProperties = predictionSeriesList.additionalProperties.toMutableMap()
        }

        /** Series ordered by code. */
        fun series(series: List<PredictionSeries>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed `List<PredictionSeries>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun series(series: JsonField<List<PredictionSeries>>) = apply {
            this.series = series.map { it.toMutableList() }
        }

        /**
         * Adds a single [PredictionSeries] to [Builder.series].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeries(series: PredictionSeries) = apply {
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
         * Returns an immutable instance of [PredictionSeriesList].
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
        fun build(): PredictionSeriesList =
            PredictionSeriesList(
                checkRequired("series", series).map { it.toImmutable() },
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
    fun validate(): PredictionSeriesList = apply {
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

        return other is PredictionSeriesList &&
            series == other.series &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(series, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PredictionSeriesList{series=$series, additionalProperties=$additionalProperties}"
}
