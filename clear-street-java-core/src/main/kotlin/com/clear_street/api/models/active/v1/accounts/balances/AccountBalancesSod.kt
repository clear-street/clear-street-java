// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.balances

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

class AccountBalancesSod
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buyingPower: JsonField<String>,
    private val equity: JsonField<String>,
    private val longMarketValue: JsonField<String>,
    private val shortMarketValue: JsonField<String>,
    private val asof: JsonField<LocalDate>,
    private val dayTradeBuyingPower: JsonField<String>,
    private val maintenanceMarginExcess: JsonField<String>,
    private val maintenanceMarginRequirement: JsonField<String>,
    private val tradeCash: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("buying_power")
        @ExcludeMissing
        buyingPower: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equity") @ExcludeMissing equity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("long_market_value")
        @ExcludeMissing
        longMarketValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_market_value")
        @ExcludeMissing
        shortMarketValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("asof") @ExcludeMissing asof: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("day_trade_buying_power")
        @ExcludeMissing
        dayTradeBuyingPower: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_excess")
        @ExcludeMissing
        maintenanceMarginExcess: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_requirement")
        @ExcludeMissing
        maintenanceMarginRequirement: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trade_cash") @ExcludeMissing tradeCash: JsonField<String> = JsonMissing.of(),
    ) : this(
        buyingPower,
        equity,
        longMarketValue,
        shortMarketValue,
        asof,
        dayTradeBuyingPower,
        maintenanceMarginExcess,
        maintenanceMarginRequirement,
        tradeCash,
        mutableMapOf(),
    )

    /**
     * Start-of-day buying power.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buyingPower(): String = buyingPower.getRequired("buying_power")

    /**
     * Start-of-day equity.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun equity(): String = equity.getRequired("equity")

    /**
     * Start-of-day long market value.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun longMarketValue(): String = longMarketValue.getRequired("long_market_value")

    /**
     * Start-of-day short market value.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shortMarketValue(): String = shortMarketValue.getRequired("short_market_value")

    /**
     * Timestamp for the start-of-day values.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun asof(): Optional<LocalDate> = asof.getOptional("asof")

    /**
     * Start-of-day day-trade buying power.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayTradeBuyingPower(): Optional<String> =
        dayTradeBuyingPower.getOptional("day_trade_buying_power")

    /**
     * Start-of-day maintenance margin excess.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maintenanceMarginExcess(): Optional<String> =
        maintenanceMarginExcess.getOptional("maintenance_margin_excess")

    /**
     * Start-of-day maintenance margin requirement.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maintenanceMarginRequirement(): Optional<String> =
        maintenanceMarginRequirement.getOptional("maintenance_margin_requirement")

    /**
     * Start-of-day trade cash.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tradeCash(): Optional<String> = tradeCash.getOptional("trade_cash")

    /**
     * Returns the raw JSON value of [buyingPower].
     *
     * Unlike [buyingPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buying_power")
    @ExcludeMissing
    fun _buyingPower(): JsonField<String> = buyingPower

    /**
     * Returns the raw JSON value of [equity].
     *
     * Unlike [equity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("equity") @ExcludeMissing fun _equity(): JsonField<String> = equity

    /**
     * Returns the raw JSON value of [longMarketValue].
     *
     * Unlike [longMarketValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("long_market_value")
    @ExcludeMissing
    fun _longMarketValue(): JsonField<String> = longMarketValue

    /**
     * Returns the raw JSON value of [shortMarketValue].
     *
     * Unlike [shortMarketValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("short_market_value")
    @ExcludeMissing
    fun _shortMarketValue(): JsonField<String> = shortMarketValue

    /**
     * Returns the raw JSON value of [asof].
     *
     * Unlike [asof], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asof") @ExcludeMissing fun _asof(): JsonField<LocalDate> = asof

    /**
     * Returns the raw JSON value of [dayTradeBuyingPower].
     *
     * Unlike [dayTradeBuyingPower], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("day_trade_buying_power")
    @ExcludeMissing
    fun _dayTradeBuyingPower(): JsonField<String> = dayTradeBuyingPower

    /**
     * Returns the raw JSON value of [maintenanceMarginExcess].
     *
     * Unlike [maintenanceMarginExcess], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maintenance_margin_excess")
    @ExcludeMissing
    fun _maintenanceMarginExcess(): JsonField<String> = maintenanceMarginExcess

    /**
     * Returns the raw JSON value of [maintenanceMarginRequirement].
     *
     * Unlike [maintenanceMarginRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maintenance_margin_requirement")
    @ExcludeMissing
    fun _maintenanceMarginRequirement(): JsonField<String> = maintenanceMarginRequirement

    /**
     * Returns the raw JSON value of [tradeCash].
     *
     * Unlike [tradeCash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trade_cash") @ExcludeMissing fun _tradeCash(): JsonField<String> = tradeCash

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
         * Returns a mutable builder for constructing an instance of [AccountBalancesSod].
         *
         * The following fields are required:
         * ```java
         * .buyingPower()
         * .equity()
         * .longMarketValue()
         * .shortMarketValue()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountBalancesSod]. */
    class Builder internal constructor() {

        private var buyingPower: JsonField<String>? = null
        private var equity: JsonField<String>? = null
        private var longMarketValue: JsonField<String>? = null
        private var shortMarketValue: JsonField<String>? = null
        private var asof: JsonField<LocalDate> = JsonMissing.of()
        private var dayTradeBuyingPower: JsonField<String> = JsonMissing.of()
        private var maintenanceMarginExcess: JsonField<String> = JsonMissing.of()
        private var maintenanceMarginRequirement: JsonField<String> = JsonMissing.of()
        private var tradeCash: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountBalancesSod: AccountBalancesSod) = apply {
            buyingPower = accountBalancesSod.buyingPower
            equity = accountBalancesSod.equity
            longMarketValue = accountBalancesSod.longMarketValue
            shortMarketValue = accountBalancesSod.shortMarketValue
            asof = accountBalancesSod.asof
            dayTradeBuyingPower = accountBalancesSod.dayTradeBuyingPower
            maintenanceMarginExcess = accountBalancesSod.maintenanceMarginExcess
            maintenanceMarginRequirement = accountBalancesSod.maintenanceMarginRequirement
            tradeCash = accountBalancesSod.tradeCash
            additionalProperties = accountBalancesSod.additionalProperties.toMutableMap()
        }

        /** Start-of-day buying power. */
        fun buyingPower(buyingPower: String) = buyingPower(JsonField.of(buyingPower))

        /**
         * Sets [Builder.buyingPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyingPower] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buyingPower(buyingPower: JsonField<String>) = apply { this.buyingPower = buyingPower }

        /** Start-of-day equity. */
        fun equity(equity: String) = equity(JsonField.of(equity))

        /**
         * Sets [Builder.equity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun equity(equity: JsonField<String>) = apply { this.equity = equity }

        /** Start-of-day long market value. */
        fun longMarketValue(longMarketValue: String) =
            longMarketValue(JsonField.of(longMarketValue))

        /**
         * Sets [Builder.longMarketValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longMarketValue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun longMarketValue(longMarketValue: JsonField<String>) = apply {
            this.longMarketValue = longMarketValue
        }

        /** Start-of-day short market value. */
        fun shortMarketValue(shortMarketValue: String) =
            shortMarketValue(JsonField.of(shortMarketValue))

        /**
         * Sets [Builder.shortMarketValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortMarketValue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shortMarketValue(shortMarketValue: JsonField<String>) = apply {
            this.shortMarketValue = shortMarketValue
        }

        /** Timestamp for the start-of-day values. */
        fun asof(asof: LocalDate?) = asof(JsonField.ofNullable(asof))

        /** Alias for calling [Builder.asof] with `asof.orElse(null)`. */
        fun asof(asof: Optional<LocalDate>) = asof(asof.getOrNull())

        /**
         * Sets [Builder.asof] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asof] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asof(asof: JsonField<LocalDate>) = apply { this.asof = asof }

        /** Start-of-day day-trade buying power. */
        fun dayTradeBuyingPower(dayTradeBuyingPower: String?) =
            dayTradeBuyingPower(JsonField.ofNullable(dayTradeBuyingPower))

        /**
         * Alias for calling [Builder.dayTradeBuyingPower] with `dayTradeBuyingPower.orElse(null)`.
         */
        fun dayTradeBuyingPower(dayTradeBuyingPower: Optional<String>) =
            dayTradeBuyingPower(dayTradeBuyingPower.getOrNull())

        /**
         * Sets [Builder.dayTradeBuyingPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayTradeBuyingPower] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dayTradeBuyingPower(dayTradeBuyingPower: JsonField<String>) = apply {
            this.dayTradeBuyingPower = dayTradeBuyingPower
        }

        /** Start-of-day maintenance margin excess. */
        fun maintenanceMarginExcess(maintenanceMarginExcess: String?) =
            maintenanceMarginExcess(JsonField.ofNullable(maintenanceMarginExcess))

        /**
         * Alias for calling [Builder.maintenanceMarginExcess] with
         * `maintenanceMarginExcess.orElse(null)`.
         */
        fun maintenanceMarginExcess(maintenanceMarginExcess: Optional<String>) =
            maintenanceMarginExcess(maintenanceMarginExcess.getOrNull())

        /**
         * Sets [Builder.maintenanceMarginExcess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maintenanceMarginExcess] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maintenanceMarginExcess(maintenanceMarginExcess: JsonField<String>) = apply {
            this.maintenanceMarginExcess = maintenanceMarginExcess
        }

        /** Start-of-day maintenance margin requirement. */
        fun maintenanceMarginRequirement(maintenanceMarginRequirement: String?) =
            maintenanceMarginRequirement(JsonField.ofNullable(maintenanceMarginRequirement))

        /**
         * Alias for calling [Builder.maintenanceMarginRequirement] with
         * `maintenanceMarginRequirement.orElse(null)`.
         */
        fun maintenanceMarginRequirement(maintenanceMarginRequirement: Optional<String>) =
            maintenanceMarginRequirement(maintenanceMarginRequirement.getOrNull())

        /**
         * Sets [Builder.maintenanceMarginRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maintenanceMarginRequirement] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maintenanceMarginRequirement(maintenanceMarginRequirement: JsonField<String>) = apply {
            this.maintenanceMarginRequirement = maintenanceMarginRequirement
        }

        /** Start-of-day trade cash. */
        fun tradeCash(tradeCash: String?) = tradeCash(JsonField.ofNullable(tradeCash))

        /** Alias for calling [Builder.tradeCash] with `tradeCash.orElse(null)`. */
        fun tradeCash(tradeCash: Optional<String>) = tradeCash(tradeCash.getOrNull())

        /**
         * Sets [Builder.tradeCash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tradeCash] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tradeCash(tradeCash: JsonField<String>) = apply { this.tradeCash = tradeCash }

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
         * Returns an immutable instance of [AccountBalancesSod].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .buyingPower()
         * .equity()
         * .longMarketValue()
         * .shortMarketValue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountBalancesSod =
            AccountBalancesSod(
                checkRequired("buyingPower", buyingPower),
                checkRequired("equity", equity),
                checkRequired("longMarketValue", longMarketValue),
                checkRequired("shortMarketValue", shortMarketValue),
                asof,
                dayTradeBuyingPower,
                maintenanceMarginExcess,
                maintenanceMarginRequirement,
                tradeCash,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountBalancesSod = apply {
        if (validated) {
            return@apply
        }

        buyingPower()
        equity()
        longMarketValue()
        shortMarketValue()
        asof()
        dayTradeBuyingPower()
        maintenanceMarginExcess()
        maintenanceMarginRequirement()
        tradeCash()
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
        (if (buyingPower.asKnown().isPresent) 1 else 0) +
            (if (equity.asKnown().isPresent) 1 else 0) +
            (if (longMarketValue.asKnown().isPresent) 1 else 0) +
            (if (shortMarketValue.asKnown().isPresent) 1 else 0) +
            (if (asof.asKnown().isPresent) 1 else 0) +
            (if (dayTradeBuyingPower.asKnown().isPresent) 1 else 0) +
            (if (maintenanceMarginExcess.asKnown().isPresent) 1 else 0) +
            (if (maintenanceMarginRequirement.asKnown().isPresent) 1 else 0) +
            (if (tradeCash.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountBalancesSod &&
            buyingPower == other.buyingPower &&
            equity == other.equity &&
            longMarketValue == other.longMarketValue &&
            shortMarketValue == other.shortMarketValue &&
            asof == other.asof &&
            dayTradeBuyingPower == other.dayTradeBuyingPower &&
            maintenanceMarginExcess == other.maintenanceMarginExcess &&
            maintenanceMarginRequirement == other.maintenanceMarginRequirement &&
            tradeCash == other.tradeCash &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            buyingPower,
            equity,
            longMarketValue,
            shortMarketValue,
            asof,
            dayTradeBuyingPower,
            maintenanceMarginExcess,
            maintenanceMarginRequirement,
            tradeCash,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountBalancesSod{buyingPower=$buyingPower, equity=$equity, longMarketValue=$longMarketValue, shortMarketValue=$shortMarketValue, asof=$asof, dayTradeBuyingPower=$dayTradeBuyingPower, maintenanceMarginExcess=$maintenanceMarginExcess, maintenanceMarginRequirement=$maintenanceMarginRequirement, tradeCash=$tradeCash, additionalProperties=$additionalProperties}"
}
