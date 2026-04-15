// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

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

/** Real-time market quote data for a specific instrument */
class InstrumentQuote
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val high: JsonField<String>,
    private val lastPrice: JsonField<String>,
    private val low: JsonField<String>,
    private val open: JsonField<String>,
    private val volume: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("high") @ExcludeMissing high: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_price") @ExcludeMissing lastPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("low") @ExcludeMissing low: JsonField<String> = JsonMissing.of(),
        @JsonProperty("open") @ExcludeMissing open: JsonField<String> = JsonMissing.of(),
        @JsonProperty("volume") @ExcludeMissing volume: JsonField<Long> = JsonMissing.of(),
    ) : this(high, lastPrice, low, open, volume, mutableMapOf())

    /**
     * The highest trade price during the current trading day
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun high(): String = high.getRequired("high")

    /**
     * The most recent trade price
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastPrice(): String = lastPrice.getRequired("last_price")

    /**
     * The lowest trade price during the current trading day
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun low(): String = low.getRequired("low")

    /**
     * The opening price for the current trading day
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun open(): String = open.getRequired("open")

    /**
     * The total number of shares traded during the current trading day
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun volume(): Long = volume.getRequired("volume")

    /**
     * Returns the raw JSON value of [high].
     *
     * Unlike [high], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("high") @ExcludeMissing fun _high(): JsonField<String> = high

    /**
     * Returns the raw JSON value of [lastPrice].
     *
     * Unlike [lastPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_price") @ExcludeMissing fun _lastPrice(): JsonField<String> = lastPrice

    /**
     * Returns the raw JSON value of [low].
     *
     * Unlike [low], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("low") @ExcludeMissing fun _low(): JsonField<String> = low

    /**
     * Returns the raw JSON value of [open].
     *
     * Unlike [open], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open") @ExcludeMissing fun _open(): JsonField<String> = open

    /**
     * Returns the raw JSON value of [volume].
     *
     * Unlike [volume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("volume") @ExcludeMissing fun _volume(): JsonField<Long> = volume

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
         * Returns a mutable builder for constructing an instance of [InstrumentQuote].
         *
         * The following fields are required:
         * ```java
         * .high()
         * .lastPrice()
         * .low()
         * .open()
         * .volume()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentQuote]. */
    class Builder internal constructor() {

        private var high: JsonField<String>? = null
        private var lastPrice: JsonField<String>? = null
        private var low: JsonField<String>? = null
        private var open: JsonField<String>? = null
        private var volume: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentQuote: InstrumentQuote) = apply {
            high = instrumentQuote.high
            lastPrice = instrumentQuote.lastPrice
            low = instrumentQuote.low
            open = instrumentQuote.open
            volume = instrumentQuote.volume
            additionalProperties = instrumentQuote.additionalProperties.toMutableMap()
        }

        /** The highest trade price during the current trading day */
        fun high(high: String) = high(JsonField.of(high))

        /**
         * Sets [Builder.high] to an arbitrary JSON value.
         *
         * You should usually call [Builder.high] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun high(high: JsonField<String>) = apply { this.high = high }

        /** The most recent trade price */
        fun lastPrice(lastPrice: String) = lastPrice(JsonField.of(lastPrice))

        /**
         * Sets [Builder.lastPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastPrice(lastPrice: JsonField<String>) = apply { this.lastPrice = lastPrice }

        /** The lowest trade price during the current trading day */
        fun low(low: String) = low(JsonField.of(low))

        /**
         * Sets [Builder.low] to an arbitrary JSON value.
         *
         * You should usually call [Builder.low] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun low(low: JsonField<String>) = apply { this.low = low }

        /** The opening price for the current trading day */
        fun open(open: String) = open(JsonField.of(open))

        /**
         * Sets [Builder.open] to an arbitrary JSON value.
         *
         * You should usually call [Builder.open] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun open(open: JsonField<String>) = apply { this.open = open }

        /** The total number of shares traded during the current trading day */
        fun volume(volume: Long) = volume(JsonField.of(volume))

        /**
         * Sets [Builder.volume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.volume] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun volume(volume: JsonField<Long>) = apply { this.volume = volume }

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
         * Returns an immutable instance of [InstrumentQuote].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .high()
         * .lastPrice()
         * .low()
         * .open()
         * .volume()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentQuote =
            InstrumentQuote(
                checkRequired("high", high),
                checkRequired("lastPrice", lastPrice),
                checkRequired("low", low),
                checkRequired("open", open),
                checkRequired("volume", volume),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstrumentQuote = apply {
        if (validated) {
            return@apply
        }

        high()
        lastPrice()
        low()
        open()
        volume()
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
        (if (high.asKnown().isPresent) 1 else 0) +
            (if (lastPrice.asKnown().isPresent) 1 else 0) +
            (if (low.asKnown().isPresent) 1 else 0) +
            (if (open.asKnown().isPresent) 1 else 0) +
            (if (volume.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentQuote &&
            high == other.high &&
            lastPrice == other.lastPrice &&
            low == other.low &&
            open == other.open &&
            volume == other.volume &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(high, lastPrice, low, open, volume, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentQuote{high=$high, lastPrice=$lastPrice, low=$low, open=$open, volume=$volume, additionalProperties=$additionalProperties}"
}
