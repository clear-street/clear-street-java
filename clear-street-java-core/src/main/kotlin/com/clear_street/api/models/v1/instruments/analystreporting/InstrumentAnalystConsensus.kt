// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.analystreporting

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.instruments.AnalystRating
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Aggregated analyst consensus metrics */
class InstrumentAnalystConsensus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val distribution: JsonField<AnalystDistribution>,
    private val priceTarget: JsonField<PriceTarget>,
    private val rating: JsonField<AnalystRating>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("distribution")
        @ExcludeMissing
        distribution: JsonField<AnalystDistribution> = JsonMissing.of(),
        @JsonProperty("price_target")
        @ExcludeMissing
        priceTarget: JsonField<PriceTarget> = JsonMissing.of(),
        @JsonProperty("rating") @ExcludeMissing rating: JsonField<AnalystRating> = JsonMissing.of(),
    ) : this(date, distribution, priceTarget, rating, mutableMapOf())

    /**
     * The date the consensus snapshot was generated
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * Count of individual analyst recommendations by category
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun distribution(): Optional<AnalystDistribution> = distribution.getOptional("distribution")

    /**
     * Aggregated analyst price target statistics
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceTarget(): Optional<PriceTarget> = priceTarget.getOptional("price_target")

    /**
     * Consensus analyst rating
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rating(): Optional<AnalystRating> = rating.getOptional("rating")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [distribution].
     *
     * Unlike [distribution], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("distribution")
    @ExcludeMissing
    fun _distribution(): JsonField<AnalystDistribution> = distribution

    /**
     * Returns the raw JSON value of [priceTarget].
     *
     * Unlike [priceTarget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_target")
    @ExcludeMissing
    fun _priceTarget(): JsonField<PriceTarget> = priceTarget

    /**
     * Returns the raw JSON value of [rating].
     *
     * Unlike [rating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rating") @ExcludeMissing fun _rating(): JsonField<AnalystRating> = rating

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
         * Returns a mutable builder for constructing an instance of [InstrumentAnalystConsensus].
         *
         * The following fields are required:
         * ```java
         * .date()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentAnalystConsensus]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var distribution: JsonField<AnalystDistribution> = JsonMissing.of()
        private var priceTarget: JsonField<PriceTarget> = JsonMissing.of()
        private var rating: JsonField<AnalystRating> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentAnalystConsensus: InstrumentAnalystConsensus) = apply {
            date = instrumentAnalystConsensus.date
            distribution = instrumentAnalystConsensus.distribution
            priceTarget = instrumentAnalystConsensus.priceTarget
            rating = instrumentAnalystConsensus.rating
            additionalProperties = instrumentAnalystConsensus.additionalProperties.toMutableMap()
        }

        /** The date the consensus snapshot was generated */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** Count of individual analyst recommendations by category */
        fun distribution(distribution: AnalystDistribution?) =
            distribution(JsonField.ofNullable(distribution))

        /** Alias for calling [Builder.distribution] with `distribution.orElse(null)`. */
        fun distribution(distribution: Optional<AnalystDistribution>) =
            distribution(distribution.getOrNull())

        /**
         * Sets [Builder.distribution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distribution] with a well-typed [AnalystDistribution]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun distribution(distribution: JsonField<AnalystDistribution>) = apply {
            this.distribution = distribution
        }

        /** Aggregated analyst price target statistics */
        fun priceTarget(priceTarget: PriceTarget?) = priceTarget(JsonField.ofNullable(priceTarget))

        /** Alias for calling [Builder.priceTarget] with `priceTarget.orElse(null)`. */
        fun priceTarget(priceTarget: Optional<PriceTarget>) = priceTarget(priceTarget.getOrNull())

        /**
         * Sets [Builder.priceTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceTarget] with a well-typed [PriceTarget] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priceTarget(priceTarget: JsonField<PriceTarget>) = apply {
            this.priceTarget = priceTarget
        }

        /** Consensus analyst rating */
        fun rating(rating: AnalystRating?) = rating(JsonField.ofNullable(rating))

        /** Alias for calling [Builder.rating] with `rating.orElse(null)`. */
        fun rating(rating: Optional<AnalystRating>) = rating(rating.getOrNull())

        /**
         * Sets [Builder.rating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rating] with a well-typed [AnalystRating] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rating(rating: JsonField<AnalystRating>) = apply { this.rating = rating }

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
         * Returns an immutable instance of [InstrumentAnalystConsensus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .date()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentAnalystConsensus =
            InstrumentAnalystConsensus(
                checkRequired("date", date),
                distribution,
                priceTarget,
                rating,
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
    fun validate(): InstrumentAnalystConsensus = apply {
        if (validated) {
            return@apply
        }

        date()
        distribution().ifPresent { it.validate() }
        priceTarget().ifPresent { it.validate() }
        rating().ifPresent { it.validate() }
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
        (if (date.asKnown().isPresent) 1 else 0) +
            (distribution.asKnown().getOrNull()?.validity() ?: 0) +
            (priceTarget.asKnown().getOrNull()?.validity() ?: 0) +
            (rating.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentAnalystConsensus &&
            date == other.date &&
            distribution == other.distribution &&
            priceTarget == other.priceTarget &&
            rating == other.rating &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(date, distribution, priceTarget, rating, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentAnalystConsensus{date=$date, distribution=$distribution, priceTarget=$priceTarget, rating=$rating, additionalProperties=$additionalProperties}"
}
