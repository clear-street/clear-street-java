// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.analystreporting

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

/** Analyst recommendation distribution */
class AnalystDistribution
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buy: JsonField<Long>,
    private val hold: JsonField<Long>,
    private val sell: JsonField<Long>,
    private val strongBuy: JsonField<Long>,
    private val strongSell: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("buy") @ExcludeMissing buy: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hold") @ExcludeMissing hold: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sell") @ExcludeMissing sell: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("strong_buy") @ExcludeMissing strongBuy: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("strong_sell") @ExcludeMissing strongSell: JsonField<Long> = JsonMissing.of(),
    ) : this(buy, hold, sell, strongBuy, strongSell, mutableMapOf())

    /**
     * Number of buy recommendations
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buy(): Long = buy.getRequired("buy")

    /**
     * Number of hold recommendations
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hold(): Long = hold.getRequired("hold")

    /**
     * Number of sell recommendations
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sell(): Long = sell.getRequired("sell")

    /**
     * Number of strong buy recommendations
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun strongBuy(): Long = strongBuy.getRequired("strong_buy")

    /**
     * Number of strong sell recommendations
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun strongSell(): Long = strongSell.getRequired("strong_sell")

    /**
     * Returns the raw JSON value of [buy].
     *
     * Unlike [buy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buy") @ExcludeMissing fun _buy(): JsonField<Long> = buy

    /**
     * Returns the raw JSON value of [hold].
     *
     * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hold") @ExcludeMissing fun _hold(): JsonField<Long> = hold

    /**
     * Returns the raw JSON value of [sell].
     *
     * Unlike [sell], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sell") @ExcludeMissing fun _sell(): JsonField<Long> = sell

    /**
     * Returns the raw JSON value of [strongBuy].
     *
     * Unlike [strongBuy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strong_buy") @ExcludeMissing fun _strongBuy(): JsonField<Long> = strongBuy

    /**
     * Returns the raw JSON value of [strongSell].
     *
     * Unlike [strongSell], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strong_sell") @ExcludeMissing fun _strongSell(): JsonField<Long> = strongSell

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
         * Returns a mutable builder for constructing an instance of [AnalystDistribution].
         *
         * The following fields are required:
         * ```java
         * .buy()
         * .hold()
         * .sell()
         * .strongBuy()
         * .strongSell()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalystDistribution]. */
    class Builder internal constructor() {

        private var buy: JsonField<Long>? = null
        private var hold: JsonField<Long>? = null
        private var sell: JsonField<Long>? = null
        private var strongBuy: JsonField<Long>? = null
        private var strongSell: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analystDistribution: AnalystDistribution) = apply {
            buy = analystDistribution.buy
            hold = analystDistribution.hold
            sell = analystDistribution.sell
            strongBuy = analystDistribution.strongBuy
            strongSell = analystDistribution.strongSell
            additionalProperties = analystDistribution.additionalProperties.toMutableMap()
        }

        /** Number of buy recommendations */
        fun buy(buy: Long) = buy(JsonField.of(buy))

        /**
         * Sets [Builder.buy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buy] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun buy(buy: JsonField<Long>) = apply { this.buy = buy }

        /** Number of hold recommendations */
        fun hold(hold: Long) = hold(JsonField.of(hold))

        /**
         * Sets [Builder.hold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hold] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hold(hold: JsonField<Long>) = apply { this.hold = hold }

        /** Number of sell recommendations */
        fun sell(sell: Long) = sell(JsonField.of(sell))

        /**
         * Sets [Builder.sell] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sell] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sell(sell: JsonField<Long>) = apply { this.sell = sell }

        /** Number of strong buy recommendations */
        fun strongBuy(strongBuy: Long) = strongBuy(JsonField.of(strongBuy))

        /**
         * Sets [Builder.strongBuy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strongBuy] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun strongBuy(strongBuy: JsonField<Long>) = apply { this.strongBuy = strongBuy }

        /** Number of strong sell recommendations */
        fun strongSell(strongSell: Long) = strongSell(JsonField.of(strongSell))

        /**
         * Sets [Builder.strongSell] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strongSell] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun strongSell(strongSell: JsonField<Long>) = apply { this.strongSell = strongSell }

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
         * Returns an immutable instance of [AnalystDistribution].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .buy()
         * .hold()
         * .sell()
         * .strongBuy()
         * .strongSell()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalystDistribution =
            AnalystDistribution(
                checkRequired("buy", buy),
                checkRequired("hold", hold),
                checkRequired("sell", sell),
                checkRequired("strongBuy", strongBuy),
                checkRequired("strongSell", strongSell),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnalystDistribution = apply {
        if (validated) {
            return@apply
        }

        buy()
        hold()
        sell()
        strongBuy()
        strongSell()
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
        (if (buy.asKnown().isPresent) 1 else 0) +
            (if (hold.asKnown().isPresent) 1 else 0) +
            (if (sell.asKnown().isPresent) 1 else 0) +
            (if (strongBuy.asKnown().isPresent) 1 else 0) +
            (if (strongSell.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalystDistribution &&
            buy == other.buy &&
            hold == other.hold &&
            sell == other.sell &&
            strongBuy == other.strongBuy &&
            strongSell == other.strongSell &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(buy, hold, sell, strongBuy, strongSell, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalystDistribution{buy=$buy, hold=$hold, sell=$sell, strongBuy=$strongBuy, strongSell=$strongSell, additionalProperties=$additionalProperties}"
}
