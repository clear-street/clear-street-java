// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents instrument earnings data */
class InstrumentEarnings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val epsActual: JsonField<String>,
    private val epsEstimate: JsonField<String>,
    private val epsSurprisePercent: JsonField<String>,
    private val revenueActual: JsonField<String>,
    private val revenueEstimate: JsonField<String>,
    private val revenueSurprisePercent: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("eps_actual") @ExcludeMissing epsActual: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eps_estimate")
        @ExcludeMissing
        epsEstimate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eps_surprise_percent")
        @ExcludeMissing
        epsSurprisePercent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue_actual")
        @ExcludeMissing
        revenueActual: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue_estimate")
        @ExcludeMissing
        revenueEstimate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue_surprise_percent")
        @ExcludeMissing
        revenueSurprisePercent: JsonField<String> = JsonMissing.of(),
    ) : this(
        date,
        epsActual,
        epsEstimate,
        epsSurprisePercent,
        revenueActual,
        revenueEstimate,
        revenueSurprisePercent,
        mutableMapOf(),
    )

    /**
     * The date when the earnings report was published
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * The actual earnings per share (EPS) for the period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun epsActual(): Optional<String> = epsActual.getOptional("eps_actual")

    /**
     * The estimated earnings per share (EPS) for the period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun epsEstimate(): Optional<String> = epsEstimate.getOptional("eps_estimate")

    /**
     * The percentage difference between actual and estimated EPS
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun epsSurprisePercent(): Optional<String> =
        epsSurprisePercent.getOptional("eps_surprise_percent")

    /**
     * The actual total revenue for the period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenueActual(): Optional<String> = revenueActual.getOptional("revenue_actual")

    /**
     * The estimated total revenue for the period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenueEstimate(): Optional<String> = revenueEstimate.getOptional("revenue_estimate")

    /**
     * The percentage difference between actual and estimated revenue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenueSurprisePercent(): Optional<String> =
        revenueSurprisePercent.getOptional("revenue_surprise_percent")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [epsActual].
     *
     * Unlike [epsActual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eps_actual") @ExcludeMissing fun _epsActual(): JsonField<String> = epsActual

    /**
     * Returns the raw JSON value of [epsEstimate].
     *
     * Unlike [epsEstimate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eps_estimate")
    @ExcludeMissing
    fun _epsEstimate(): JsonField<String> = epsEstimate

    /**
     * Returns the raw JSON value of [epsSurprisePercent].
     *
     * Unlike [epsSurprisePercent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eps_surprise_percent")
    @ExcludeMissing
    fun _epsSurprisePercent(): JsonField<String> = epsSurprisePercent

    /**
     * Returns the raw JSON value of [revenueActual].
     *
     * Unlike [revenueActual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revenue_actual")
    @ExcludeMissing
    fun _revenueActual(): JsonField<String> = revenueActual

    /**
     * Returns the raw JSON value of [revenueEstimate].
     *
     * Unlike [revenueEstimate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revenue_estimate")
    @ExcludeMissing
    fun _revenueEstimate(): JsonField<String> = revenueEstimate

    /**
     * Returns the raw JSON value of [revenueSurprisePercent].
     *
     * Unlike [revenueSurprisePercent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("revenue_surprise_percent")
    @ExcludeMissing
    fun _revenueSurprisePercent(): JsonField<String> = revenueSurprisePercent

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
         * Returns a mutable builder for constructing an instance of [InstrumentEarnings].
         *
         * The following fields are required:
         * ```java
         * .date()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentEarnings]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var epsActual: JsonField<String> = JsonMissing.of()
        private var epsEstimate: JsonField<String> = JsonMissing.of()
        private var epsSurprisePercent: JsonField<String> = JsonMissing.of()
        private var revenueActual: JsonField<String> = JsonMissing.of()
        private var revenueEstimate: JsonField<String> = JsonMissing.of()
        private var revenueSurprisePercent: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentEarnings: InstrumentEarnings) = apply {
            date = instrumentEarnings.date
            epsActual = instrumentEarnings.epsActual
            epsEstimate = instrumentEarnings.epsEstimate
            epsSurprisePercent = instrumentEarnings.epsSurprisePercent
            revenueActual = instrumentEarnings.revenueActual
            revenueEstimate = instrumentEarnings.revenueEstimate
            revenueSurprisePercent = instrumentEarnings.revenueSurprisePercent
            additionalProperties = instrumentEarnings.additionalProperties.toMutableMap()
        }

        /** The date when the earnings report was published */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The actual earnings per share (EPS) for the period */
        fun epsActual(epsActual: String?) = epsActual(JsonField.ofNullable(epsActual))

        /** Alias for calling [Builder.epsActual] with `epsActual.orElse(null)`. */
        fun epsActual(epsActual: Optional<String>) = epsActual(epsActual.getOrNull())

        /**
         * Sets [Builder.epsActual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.epsActual] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun epsActual(epsActual: JsonField<String>) = apply { this.epsActual = epsActual }

        /** The estimated earnings per share (EPS) for the period */
        fun epsEstimate(epsEstimate: String?) = epsEstimate(JsonField.ofNullable(epsEstimate))

        /** Alias for calling [Builder.epsEstimate] with `epsEstimate.orElse(null)`. */
        fun epsEstimate(epsEstimate: Optional<String>) = epsEstimate(epsEstimate.getOrNull())

        /**
         * Sets [Builder.epsEstimate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.epsEstimate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun epsEstimate(epsEstimate: JsonField<String>) = apply { this.epsEstimate = epsEstimate }

        /** The percentage difference between actual and estimated EPS */
        fun epsSurprisePercent(epsSurprisePercent: String?) =
            epsSurprisePercent(JsonField.ofNullable(epsSurprisePercent))

        /**
         * Alias for calling [Builder.epsSurprisePercent] with `epsSurprisePercent.orElse(null)`.
         */
        fun epsSurprisePercent(epsSurprisePercent: Optional<String>) =
            epsSurprisePercent(epsSurprisePercent.getOrNull())

        /**
         * Sets [Builder.epsSurprisePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.epsSurprisePercent] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun epsSurprisePercent(epsSurprisePercent: JsonField<String>) = apply {
            this.epsSurprisePercent = epsSurprisePercent
        }

        /** The actual total revenue for the period */
        fun revenueActual(revenueActual: String?) =
            revenueActual(JsonField.ofNullable(revenueActual))

        /** Alias for calling [Builder.revenueActual] with `revenueActual.orElse(null)`. */
        fun revenueActual(revenueActual: Optional<String>) =
            revenueActual(revenueActual.getOrNull())

        /**
         * Sets [Builder.revenueActual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueActual] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revenueActual(revenueActual: JsonField<String>) = apply {
            this.revenueActual = revenueActual
        }

        /** The estimated total revenue for the period */
        fun revenueEstimate(revenueEstimate: String?) =
            revenueEstimate(JsonField.ofNullable(revenueEstimate))

        /** Alias for calling [Builder.revenueEstimate] with `revenueEstimate.orElse(null)`. */
        fun revenueEstimate(revenueEstimate: Optional<String>) =
            revenueEstimate(revenueEstimate.getOrNull())

        /**
         * Sets [Builder.revenueEstimate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueEstimate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun revenueEstimate(revenueEstimate: JsonField<String>) = apply {
            this.revenueEstimate = revenueEstimate
        }

        /** The percentage difference between actual and estimated revenue */
        fun revenueSurprisePercent(revenueSurprisePercent: String?) =
            revenueSurprisePercent(JsonField.ofNullable(revenueSurprisePercent))

        /**
         * Alias for calling [Builder.revenueSurprisePercent] with
         * `revenueSurprisePercent.orElse(null)`.
         */
        fun revenueSurprisePercent(revenueSurprisePercent: Optional<String>) =
            revenueSurprisePercent(revenueSurprisePercent.getOrNull())

        /**
         * Sets [Builder.revenueSurprisePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueSurprisePercent] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun revenueSurprisePercent(revenueSurprisePercent: JsonField<String>) = apply {
            this.revenueSurprisePercent = revenueSurprisePercent
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
         * Returns an immutable instance of [InstrumentEarnings].
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
        fun build(): InstrumentEarnings =
            InstrumentEarnings(
                checkRequired("date", date),
                epsActual,
                epsEstimate,
                epsSurprisePercent,
                revenueActual,
                revenueEstimate,
                revenueSurprisePercent,
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
    fun validate(): InstrumentEarnings = apply {
        if (validated) {
            return@apply
        }

        date()
        epsActual()
        epsEstimate()
        epsSurprisePercent()
        revenueActual()
        revenueEstimate()
        revenueSurprisePercent()
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
            (if (epsActual.asKnown().isPresent) 1 else 0) +
            (if (epsEstimate.asKnown().isPresent) 1 else 0) +
            (if (epsSurprisePercent.asKnown().isPresent) 1 else 0) +
            (if (revenueActual.asKnown().isPresent) 1 else 0) +
            (if (revenueEstimate.asKnown().isPresent) 1 else 0) +
            (if (revenueSurprisePercent.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentEarnings &&
            date == other.date &&
            epsActual == other.epsActual &&
            epsEstimate == other.epsEstimate &&
            epsSurprisePercent == other.epsSurprisePercent &&
            revenueActual == other.revenueActual &&
            revenueEstimate == other.revenueEstimate &&
            revenueSurprisePercent == other.revenueSurprisePercent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            date,
            epsActual,
            epsEstimate,
            epsSurprisePercent,
            revenueActual,
            revenueEstimate,
            revenueSurprisePercent,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentEarnings{date=$date, epsActual=$epsActual, epsEstimate=$epsEstimate, epsSurprisePercent=$epsSurprisePercent, revenueActual=$revenueActual, revenueEstimate=$revenueEstimate, revenueSurprisePercent=$revenueSurprisePercent, additionalProperties=$additionalProperties}"
}
