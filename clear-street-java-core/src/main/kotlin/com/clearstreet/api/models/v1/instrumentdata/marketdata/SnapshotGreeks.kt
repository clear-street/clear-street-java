// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

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

/**
 * Theoretical price and Greeks for an options snapshot. All values are **per share** as published
 * by RENG; no contract multiplier is applied.
 */
class SnapshotGreeks
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val delta: JsonField<String>,
    private val gamma: JsonField<String>,
    private val iv: JsonField<String>,
    private val rho: JsonField<String>,
    private val theoPrice: JsonField<String>,
    private val theta: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val vega: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("delta") @ExcludeMissing delta: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gamma") @ExcludeMissing gamma: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iv") @ExcludeMissing iv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rho") @ExcludeMissing rho: JsonField<String> = JsonMissing.of(),
        @JsonProperty("theo_price") @ExcludeMissing theoPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("theta") @ExcludeMissing theta: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vega") @ExcludeMissing vega: JsonField<String> = JsonMissing.of(),
    ) : this(delta, gamma, iv, rho, theoPrice, theta, timestamp, vega, mutableMapOf())

    /**
     * Delta: ∂V/∂S, range \[-1, 1\].
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun delta(): String = delta.getRequired("delta")

    /**
     * Gamma: ∂²V/∂S².
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun gamma(): String = gamma.getRequired("gamma")

    /**
     * Implied volatility, annualized (`0.20` == 20%).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun iv(): String = iv.getRequired("iv")

    /**
     * Rho per 1.0 rate point.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rho(): String = rho.getRequired("rho")

    /**
     * Theoretical option price in USD per share.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun theoPrice(): String = theoPrice.getRequired("theo_price")

    /**
     * Theta per trading day.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun theta(): String = theta.getRequired("theta")

    /**
     * Event timestamp published by RENG.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * Vega per 1.0 vol point.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vega(): String = vega.getRequired("vega")

    /**
     * Returns the raw JSON value of [delta].
     *
     * Unlike [delta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<String> = delta

    /**
     * Returns the raw JSON value of [gamma].
     *
     * Unlike [gamma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gamma") @ExcludeMissing fun _gamma(): JsonField<String> = gamma

    /**
     * Returns the raw JSON value of [iv].
     *
     * Unlike [iv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iv") @ExcludeMissing fun _iv(): JsonField<String> = iv

    /**
     * Returns the raw JSON value of [rho].
     *
     * Unlike [rho], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rho") @ExcludeMissing fun _rho(): JsonField<String> = rho

    /**
     * Returns the raw JSON value of [theoPrice].
     *
     * Unlike [theoPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("theo_price") @ExcludeMissing fun _theoPrice(): JsonField<String> = theoPrice

    /**
     * Returns the raw JSON value of [theta].
     *
     * Unlike [theta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("theta") @ExcludeMissing fun _theta(): JsonField<String> = theta

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [vega].
     *
     * Unlike [vega], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vega") @ExcludeMissing fun _vega(): JsonField<String> = vega

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
         * Returns a mutable builder for constructing an instance of [SnapshotGreeks].
         *
         * The following fields are required:
         * ```java
         * .delta()
         * .gamma()
         * .iv()
         * .rho()
         * .theoPrice()
         * .theta()
         * .timestamp()
         * .vega()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapshotGreeks]. */
    class Builder internal constructor() {

        private var delta: JsonField<String>? = null
        private var gamma: JsonField<String>? = null
        private var iv: JsonField<String>? = null
        private var rho: JsonField<String>? = null
        private var theoPrice: JsonField<String>? = null
        private var theta: JsonField<String>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var vega: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(snapshotGreeks: SnapshotGreeks) = apply {
            delta = snapshotGreeks.delta
            gamma = snapshotGreeks.gamma
            iv = snapshotGreeks.iv
            rho = snapshotGreeks.rho
            theoPrice = snapshotGreeks.theoPrice
            theta = snapshotGreeks.theta
            timestamp = snapshotGreeks.timestamp
            vega = snapshotGreeks.vega
            additionalProperties = snapshotGreeks.additionalProperties.toMutableMap()
        }

        /** Delta: ∂V/∂S, range \[-1, 1\]. */
        fun delta(delta: String) = delta(JsonField.of(delta))

        /**
         * Sets [Builder.delta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delta] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun delta(delta: JsonField<String>) = apply { this.delta = delta }

        /** Gamma: ∂²V/∂S². */
        fun gamma(gamma: String) = gamma(JsonField.of(gamma))

        /**
         * Sets [Builder.gamma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gamma] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gamma(gamma: JsonField<String>) = apply { this.gamma = gamma }

        /** Implied volatility, annualized (`0.20` == 20%). */
        fun iv(iv: String) = iv(JsonField.of(iv))

        /**
         * Sets [Builder.iv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iv] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iv(iv: JsonField<String>) = apply { this.iv = iv }

        /** Rho per 1.0 rate point. */
        fun rho(rho: String) = rho(JsonField.of(rho))

        /**
         * Sets [Builder.rho] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rho] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rho(rho: JsonField<String>) = apply { this.rho = rho }

        /** Theoretical option price in USD per share. */
        fun theoPrice(theoPrice: String) = theoPrice(JsonField.of(theoPrice))

        /**
         * Sets [Builder.theoPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theoPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun theoPrice(theoPrice: JsonField<String>) = apply { this.theoPrice = theoPrice }

        /** Theta per trading day. */
        fun theta(theta: String) = theta(JsonField.of(theta))

        /**
         * Sets [Builder.theta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theta] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun theta(theta: JsonField<String>) = apply { this.theta = theta }

        /** Event timestamp published by RENG. */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** Vega per 1.0 vol point. */
        fun vega(vega: String) = vega(JsonField.of(vega))

        /**
         * Sets [Builder.vega] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vega] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vega(vega: JsonField<String>) = apply { this.vega = vega }

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
         * Returns an immutable instance of [SnapshotGreeks].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .delta()
         * .gamma()
         * .iv()
         * .rho()
         * .theoPrice()
         * .theta()
         * .timestamp()
         * .vega()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SnapshotGreeks =
            SnapshotGreeks(
                checkRequired("delta", delta),
                checkRequired("gamma", gamma),
                checkRequired("iv", iv),
                checkRequired("rho", rho),
                checkRequired("theoPrice", theoPrice),
                checkRequired("theta", theta),
                checkRequired("timestamp", timestamp),
                checkRequired("vega", vega),
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
    fun validate(): SnapshotGreeks = apply {
        if (validated) {
            return@apply
        }

        delta()
        gamma()
        iv()
        rho()
        theoPrice()
        theta()
        timestamp()
        vega()
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
        (if (delta.asKnown().isPresent) 1 else 0) +
            (if (gamma.asKnown().isPresent) 1 else 0) +
            (if (iv.asKnown().isPresent) 1 else 0) +
            (if (rho.asKnown().isPresent) 1 else 0) +
            (if (theoPrice.asKnown().isPresent) 1 else 0) +
            (if (theta.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (vega.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotGreeks &&
            delta == other.delta &&
            gamma == other.gamma &&
            iv == other.iv &&
            rho == other.rho &&
            theoPrice == other.theoPrice &&
            theta == other.theta &&
            timestamp == other.timestamp &&
            vega == other.vega &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(delta, gamma, iv, rho, theoPrice, theta, timestamp, vega, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SnapshotGreeks{delta=$delta, gamma=$gamma, iv=$iv, rho=$rho, theoPrice=$theoPrice, theta=$theta, timestamp=$timestamp, vega=$vega, additionalProperties=$additionalProperties}"
}
