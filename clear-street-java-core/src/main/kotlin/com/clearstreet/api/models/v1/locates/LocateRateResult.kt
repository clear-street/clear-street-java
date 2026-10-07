// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.ApiError
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A requested instrument with either its cached borrow rate or an error. */
class LocateRateResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instrument: JsonField<String>,
    private val error: JsonField<ApiError>,
    private val rate: JsonField<LocateRate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instrument")
        @ExcludeMissing
        instrument: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<ApiError> = JsonMissing.of(),
        @JsonProperty("rate") @ExcludeMissing rate: JsonField<LocateRate> = JsonMissing.of(),
    ) : this(instrument, error, rate, mutableMapOf())

    /**
     * The instrument id (UUID) or symbol, echoed exactly as requested, so each result maps back to
     * its request.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrument(): String = instrument.getRequired("instrument")

    /**
     * Why no rate is present — a `404` when the instrument is unknown or has no cached rate.
     * Omitted when `rate` is present.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<ApiError> = error.getOptional("error")

    /**
     * The cached borrow rate. Present when a rate was found; omitted when `error` is present.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rate(): Optional<LocateRate> = rate.getOptional("rate")

    /**
     * Returns the raw JSON value of [instrument].
     *
     * Unlike [instrument], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument") @ExcludeMissing fun _instrument(): JsonField<String> = instrument

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<ApiError> = error

    /**
     * Returns the raw JSON value of [rate].
     *
     * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<LocateRate> = rate

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
         * Returns a mutable builder for constructing an instance of [LocateRateResult].
         *
         * The following fields are required:
         * ```java
         * .instrument()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LocateRateResult]. */
    class Builder internal constructor() {

        private var instrument: JsonField<String>? = null
        private var error: JsonField<ApiError> = JsonMissing.of()
        private var rate: JsonField<LocateRate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(locateRateResult: LocateRateResult) = apply {
            instrument = locateRateResult.instrument
            error = locateRateResult.error
            rate = locateRateResult.rate
            additionalProperties = locateRateResult.additionalProperties.toMutableMap()
        }

        /**
         * The instrument id (UUID) or symbol, echoed exactly as requested, so each result maps back
         * to its request.
         */
        fun instrument(instrument: String) = instrument(JsonField.of(instrument))

        /**
         * Sets [Builder.instrument] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrument] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instrument(instrument: JsonField<String>) = apply { this.instrument = instrument }

        /**
         * Why no rate is present — a `404` when the instrument is unknown or has no cached rate.
         * Omitted when `rate` is present.
         */
        fun error(error: ApiError?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<ApiError>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [ApiError] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<ApiError>) = apply { this.error = error }

        /**
         * The cached borrow rate. Present when a rate was found; omitted when `error` is present.
         */
        fun rate(rate: LocateRate?) = rate(JsonField.ofNullable(rate))

        /** Alias for calling [Builder.rate] with `rate.orElse(null)`. */
        fun rate(rate: Optional<LocateRate>) = rate(rate.getOrNull())

        /**
         * Sets [Builder.rate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rate] with a well-typed [LocateRate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rate(rate: JsonField<LocateRate>) = apply { this.rate = rate }

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
         * Returns an immutable instance of [LocateRateResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instrument()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LocateRateResult =
            LocateRateResult(
                checkRequired("instrument", instrument),
                error,
                rate,
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
    fun validate(): LocateRateResult = apply {
        if (validated) {
            return@apply
        }

        instrument()
        error().ifPresent { it.validate() }
        rate().ifPresent { it.validate() }
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
        (if (instrument.asKnown().isPresent) 1 else 0) +
            (error.asKnown().getOrNull()?.validity() ?: 0) +
            (rate.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LocateRateResult &&
            instrument == other.instrument &&
            error == other.error &&
            rate == other.rate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(instrument, error, rate, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LocateRateResult{instrument=$instrument, error=$error, rate=$rate, additionalProperties=$additionalProperties}"
}
