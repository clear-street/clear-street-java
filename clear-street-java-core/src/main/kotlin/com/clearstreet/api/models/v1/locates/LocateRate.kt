// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

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

/** A locate borrow rate for an instrument. */
class LocateRate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instrumentId: JsonField<String>,
    private val rate: JsonField<String>,
    private val asOf: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("as_of") @ExcludeMissing asOf: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(instrumentId, rate, asOf, mutableMapOf())

    /**
     * Instrument id the rate applies to.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Borrow rate, expressed as a decimal (e.g. 0.037012 for 3.7012%).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rate(): String = rate.getRequired("rate")

    /**
     * When the rate was requested from the locates venue.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun asOf(): Optional<OffsetDateTime> = asOf.getOptional("as_of")

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [rate].
     *
     * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

    /**
     * Returns the raw JSON value of [asOf].
     *
     * Unlike [asOf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("as_of") @ExcludeMissing fun _asOf(): JsonField<OffsetDateTime> = asOf

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
         * Returns a mutable builder for constructing an instance of [LocateRate].
         *
         * The following fields are required:
         * ```java
         * .instrumentId()
         * .rate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LocateRate]. */
    class Builder internal constructor() {

        private var instrumentId: JsonField<String>? = null
        private var rate: JsonField<String>? = null
        private var asOf: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(locateRate: LocateRate) = apply {
            instrumentId = locateRate.instrumentId
            rate = locateRate.rate
            asOf = locateRate.asOf
            additionalProperties = locateRate.additionalProperties.toMutableMap()
        }

        /** Instrument id the rate applies to. */
        fun instrumentId(instrumentId: String) = instrumentId(JsonField.of(instrumentId))

        /**
         * Sets [Builder.instrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instrumentId(instrumentId: JsonField<String>) = apply {
            this.instrumentId = instrumentId
        }

        /** Borrow rate, expressed as a decimal (e.g. 0.037012 for 3.7012%). */
        fun rate(rate: String) = rate(JsonField.of(rate))

        /**
         * Sets [Builder.rate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rate(rate: JsonField<String>) = apply { this.rate = rate }

        /** When the rate was requested from the locates venue. */
        fun asOf(asOf: OffsetDateTime?) = asOf(JsonField.ofNullable(asOf))

        /** Alias for calling [Builder.asOf] with `asOf.orElse(null)`. */
        fun asOf(asOf: Optional<OffsetDateTime>) = asOf(asOf.getOrNull())

        /**
         * Sets [Builder.asOf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOf] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asOf(asOf: JsonField<OffsetDateTime>) = apply { this.asOf = asOf }

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
         * Returns an immutable instance of [LocateRate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instrumentId()
         * .rate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LocateRate =
            LocateRate(
                checkRequired("instrumentId", instrumentId),
                checkRequired("rate", rate),
                asOf,
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
    fun validate(): LocateRate = apply {
        if (validated) {
            return@apply
        }

        instrumentId()
        rate()
        asOf()
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
        (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (rate.asKnown().isPresent) 1 else 0) +
            (if (asOf.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LocateRate &&
            instrumentId == other.instrumentId &&
            rate == other.rate &&
            asOf == other.asOf &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(instrumentId, rate, asOf, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LocateRate{instrumentId=$instrumentId, rate=$rate, asOf=$asOf, additionalProperties=$additionalProperties}"
}
