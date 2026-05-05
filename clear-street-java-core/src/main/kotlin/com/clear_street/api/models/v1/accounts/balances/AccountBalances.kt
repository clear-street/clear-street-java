// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.balances

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents the balance details for a trading account */
class AccountBalances
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<Long>,
    private val buyingPower: JsonField<String>,
    private val currency: JsonField<String>,
    private val dailyRealizedPnl: JsonField<String>,
    private val dailyTotalPnl: JsonField<String>,
    private val dailyUnrealizedPnl: JsonField<String>,
    private val equity: JsonField<String>,
    private val longMarketValue: JsonField<String>,
    private val marginType: JsonField<MarginType>,
    private val openOrderAdjustment: JsonField<String>,
    private val settledCash: JsonField<String>,
    private val sod: JsonField<AccountBalancesSod>,
    private val tradeCash: JsonField<String>,
    private val unsettledCredits: JsonField<String>,
    private val unsettledDebits: JsonField<String>,
    private val withdrawableCash: JsonField<String>,
    private val marginDetails: JsonField<MarginDetails>,
    private val multiplier: JsonField<String>,
    private val shortMarketValue: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("buying_power")
        @ExcludeMissing
        buyingPower: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily_realized_pnl")
        @ExcludeMissing
        dailyRealizedPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily_total_pnl")
        @ExcludeMissing
        dailyTotalPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily_unrealized_pnl")
        @ExcludeMissing
        dailyUnrealizedPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equity") @ExcludeMissing equity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("long_market_value")
        @ExcludeMissing
        longMarketValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("margin_type")
        @ExcludeMissing
        marginType: JsonField<MarginType> = JsonMissing.of(),
        @JsonProperty("open_order_adjustment")
        @ExcludeMissing
        openOrderAdjustment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settled_cash")
        @ExcludeMissing
        settledCash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sod") @ExcludeMissing sod: JsonField<AccountBalancesSod> = JsonMissing.of(),
        @JsonProperty("trade_cash") @ExcludeMissing tradeCash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unsettled_credits")
        @ExcludeMissing
        unsettledCredits: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unsettled_debits")
        @ExcludeMissing
        unsettledDebits: JsonField<String> = JsonMissing.of(),
        @JsonProperty("withdrawable_cash")
        @ExcludeMissing
        withdrawableCash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("margin_details")
        @ExcludeMissing
        marginDetails: JsonField<MarginDetails> = JsonMissing.of(),
        @JsonProperty("multiplier")
        @ExcludeMissing
        multiplier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_market_value")
        @ExcludeMissing
        shortMarketValue: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountId,
        buyingPower,
        currency,
        dailyRealizedPnl,
        dailyTotalPnl,
        dailyUnrealizedPnl,
        equity,
        longMarketValue,
        marginType,
        openOrderAdjustment,
        settledCash,
        sod,
        tradeCash,
        unsettledCredits,
        unsettledDebits,
        withdrawableCash,
        marginDetails,
        multiplier,
        shortMarketValue,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): Long = accountId.getRequired("account_id")

    /**
     * The total buying power available in the account.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buyingPower(): String = buyingPower.getRequired("buying_power")

    /**
     * Currency identifier for all monetary values.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Realized profit or loss since start of day.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dailyRealizedPnl(): String = dailyRealizedPnl.getRequired("daily_realized_pnl")

    /**
     * Total profit or loss since start of day.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dailyTotalPnl(): String = dailyTotalPnl.getRequired("daily_total_pnl")

    /**
     * Total unrealized profit or loss across all positions relative to prior close.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dailyUnrealizedPnl(): String = dailyUnrealizedPnl.getRequired("daily_unrealized_pnl")

    /**
     * The total equity in the account.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun equity(): String = equity.getRequired("equity")

    /**
     * The total market value of all long positions.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun longMarketValue(): String = longMarketValue.getRequired("long_market_value")

    /**
     * The applicable margin model for the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun marginType(): MarginType = marginType.getRequired("margin_type")

    /**
     * Signed buying-power correction from open orders.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun openOrderAdjustment(): String = openOrderAdjustment.getRequired("open_order_adjustment")

    /**
     * The amount of cash that is settled and available for withdrawal or trading.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settledCash(): String = settledCash.getRequired("settled_cash")

    /**
     * Start-of-day snapshot balances.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sod(): AccountBalancesSod = sod.getRequired("sod")

    /**
     * Trade-date effective cash.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tradeCash(): String = tradeCash.getRequired("trade_cash")

    /**
     * Trade-date unsettled cash credits.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unsettledCredits(): String = unsettledCredits.getRequired("unsettled_credits")

    /**
     * Trade-date unsettled cash debits.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unsettledDebits(): String = unsettledDebits.getRequired("unsettled_debits")

    /**
     * The amount of cash currently available to withdraw.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun withdrawableCash(): String = withdrawableCash.getRequired("withdrawable_cash")

    /**
     * Margin-account-only details.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marginDetails(): Optional<MarginDetails> = marginDetails.getOptional("margin_details")

    /**
     * Applied multiplier for margin calculations.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multiplier(): Optional<String> = multiplier.getOptional("multiplier")

    /**
     * The total market value of all short positions.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shortMarketValue(): Optional<String> = shortMarketValue.getOptional("short_market_value")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

    /**
     * Returns the raw JSON value of [buyingPower].
     *
     * Unlike [buyingPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buying_power")
    @ExcludeMissing
    fun _buyingPower(): JsonField<String> = buyingPower

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [dailyRealizedPnl].
     *
     * Unlike [dailyRealizedPnl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("daily_realized_pnl")
    @ExcludeMissing
    fun _dailyRealizedPnl(): JsonField<String> = dailyRealizedPnl

    /**
     * Returns the raw JSON value of [dailyTotalPnl].
     *
     * Unlike [dailyTotalPnl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daily_total_pnl")
    @ExcludeMissing
    fun _dailyTotalPnl(): JsonField<String> = dailyTotalPnl

    /**
     * Returns the raw JSON value of [dailyUnrealizedPnl].
     *
     * Unlike [dailyUnrealizedPnl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("daily_unrealized_pnl")
    @ExcludeMissing
    fun _dailyUnrealizedPnl(): JsonField<String> = dailyUnrealizedPnl

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
     * Returns the raw JSON value of [marginType].
     *
     * Unlike [marginType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("margin_type")
    @ExcludeMissing
    fun _marginType(): JsonField<MarginType> = marginType

    /**
     * Returns the raw JSON value of [openOrderAdjustment].
     *
     * Unlike [openOrderAdjustment], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("open_order_adjustment")
    @ExcludeMissing
    fun _openOrderAdjustment(): JsonField<String> = openOrderAdjustment

    /**
     * Returns the raw JSON value of [settledCash].
     *
     * Unlike [settledCash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settled_cash")
    @ExcludeMissing
    fun _settledCash(): JsonField<String> = settledCash

    /**
     * Returns the raw JSON value of [sod].
     *
     * Unlike [sod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sod") @ExcludeMissing fun _sod(): JsonField<AccountBalancesSod> = sod

    /**
     * Returns the raw JSON value of [tradeCash].
     *
     * Unlike [tradeCash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trade_cash") @ExcludeMissing fun _tradeCash(): JsonField<String> = tradeCash

    /**
     * Returns the raw JSON value of [unsettledCredits].
     *
     * Unlike [unsettledCredits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unsettled_credits")
    @ExcludeMissing
    fun _unsettledCredits(): JsonField<String> = unsettledCredits

    /**
     * Returns the raw JSON value of [unsettledDebits].
     *
     * Unlike [unsettledDebits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unsettled_debits")
    @ExcludeMissing
    fun _unsettledDebits(): JsonField<String> = unsettledDebits

    /**
     * Returns the raw JSON value of [withdrawableCash].
     *
     * Unlike [withdrawableCash], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("withdrawable_cash")
    @ExcludeMissing
    fun _withdrawableCash(): JsonField<String> = withdrawableCash

    /**
     * Returns the raw JSON value of [marginDetails].
     *
     * Unlike [marginDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("margin_details")
    @ExcludeMissing
    fun _marginDetails(): JsonField<MarginDetails> = marginDetails

    /**
     * Returns the raw JSON value of [multiplier].
     *
     * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier(): JsonField<String> = multiplier

    /**
     * Returns the raw JSON value of [shortMarketValue].
     *
     * Unlike [shortMarketValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("short_market_value")
    @ExcludeMissing
    fun _shortMarketValue(): JsonField<String> = shortMarketValue

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
         * Returns a mutable builder for constructing an instance of [AccountBalances].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .buyingPower()
         * .currency()
         * .dailyRealizedPnl()
         * .dailyTotalPnl()
         * .dailyUnrealizedPnl()
         * .equity()
         * .longMarketValue()
         * .marginType()
         * .openOrderAdjustment()
         * .settledCash()
         * .sod()
         * .tradeCash()
         * .unsettledCredits()
         * .unsettledDebits()
         * .withdrawableCash()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountBalances]. */
    class Builder internal constructor() {

        private var accountId: JsonField<Long>? = null
        private var buyingPower: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var dailyRealizedPnl: JsonField<String>? = null
        private var dailyTotalPnl: JsonField<String>? = null
        private var dailyUnrealizedPnl: JsonField<String>? = null
        private var equity: JsonField<String>? = null
        private var longMarketValue: JsonField<String>? = null
        private var marginType: JsonField<MarginType>? = null
        private var openOrderAdjustment: JsonField<String>? = null
        private var settledCash: JsonField<String>? = null
        private var sod: JsonField<AccountBalancesSod>? = null
        private var tradeCash: JsonField<String>? = null
        private var unsettledCredits: JsonField<String>? = null
        private var unsettledDebits: JsonField<String>? = null
        private var withdrawableCash: JsonField<String>? = null
        private var marginDetails: JsonField<MarginDetails> = JsonMissing.of()
        private var multiplier: JsonField<String> = JsonMissing.of()
        private var shortMarketValue: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountBalances: AccountBalances) = apply {
            accountId = accountBalances.accountId
            buyingPower = accountBalances.buyingPower
            currency = accountBalances.currency
            dailyRealizedPnl = accountBalances.dailyRealizedPnl
            dailyTotalPnl = accountBalances.dailyTotalPnl
            dailyUnrealizedPnl = accountBalances.dailyUnrealizedPnl
            equity = accountBalances.equity
            longMarketValue = accountBalances.longMarketValue
            marginType = accountBalances.marginType
            openOrderAdjustment = accountBalances.openOrderAdjustment
            settledCash = accountBalances.settledCash
            sod = accountBalances.sod
            tradeCash = accountBalances.tradeCash
            unsettledCredits = accountBalances.unsettledCredits
            unsettledDebits = accountBalances.unsettledDebits
            withdrawableCash = accountBalances.withdrawableCash
            marginDetails = accountBalances.marginDetails
            multiplier = accountBalances.multiplier
            shortMarketValue = accountBalances.shortMarketValue
            additionalProperties = accountBalances.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the account */
        fun accountId(accountId: Long) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        /** The total buying power available in the account. */
        fun buyingPower(buyingPower: String) = buyingPower(JsonField.of(buyingPower))

        /**
         * Sets [Builder.buyingPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyingPower] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buyingPower(buyingPower: JsonField<String>) = apply { this.buyingPower = buyingPower }

        /** Currency identifier for all monetary values. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Realized profit or loss since start of day. */
        fun dailyRealizedPnl(dailyRealizedPnl: String) =
            dailyRealizedPnl(JsonField.of(dailyRealizedPnl))

        /**
         * Sets [Builder.dailyRealizedPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyRealizedPnl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyRealizedPnl(dailyRealizedPnl: JsonField<String>) = apply {
            this.dailyRealizedPnl = dailyRealizedPnl
        }

        /** Total profit or loss since start of day. */
        fun dailyTotalPnl(dailyTotalPnl: String) = dailyTotalPnl(JsonField.of(dailyTotalPnl))

        /**
         * Sets [Builder.dailyTotalPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyTotalPnl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dailyTotalPnl(dailyTotalPnl: JsonField<String>) = apply {
            this.dailyTotalPnl = dailyTotalPnl
        }

        /** Total unrealized profit or loss across all positions relative to prior close. */
        fun dailyUnrealizedPnl(dailyUnrealizedPnl: String) =
            dailyUnrealizedPnl(JsonField.of(dailyUnrealizedPnl))

        /**
         * Sets [Builder.dailyUnrealizedPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyUnrealizedPnl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyUnrealizedPnl(dailyUnrealizedPnl: JsonField<String>) = apply {
            this.dailyUnrealizedPnl = dailyUnrealizedPnl
        }

        /** The total equity in the account. */
        fun equity(equity: String) = equity(JsonField.of(equity))

        /**
         * Sets [Builder.equity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun equity(equity: JsonField<String>) = apply { this.equity = equity }

        /** The total market value of all long positions. */
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

        /** The applicable margin model for the account */
        fun marginType(marginType: MarginType) = marginType(JsonField.of(marginType))

        /**
         * Sets [Builder.marginType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marginType] with a well-typed [MarginType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun marginType(marginType: JsonField<MarginType>) = apply { this.marginType = marginType }

        /** Signed buying-power correction from open orders. */
        fun openOrderAdjustment(openOrderAdjustment: String) =
            openOrderAdjustment(JsonField.of(openOrderAdjustment))

        /**
         * Sets [Builder.openOrderAdjustment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openOrderAdjustment] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openOrderAdjustment(openOrderAdjustment: JsonField<String>) = apply {
            this.openOrderAdjustment = openOrderAdjustment
        }

        /** The amount of cash that is settled and available for withdrawal or trading. */
        fun settledCash(settledCash: String) = settledCash(JsonField.of(settledCash))

        /**
         * Sets [Builder.settledCash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledCash] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settledCash(settledCash: JsonField<String>) = apply { this.settledCash = settledCash }

        /** Start-of-day snapshot balances. */
        fun sod(sod: AccountBalancesSod) = sod(JsonField.of(sod))

        /**
         * Sets [Builder.sod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sod] with a well-typed [AccountBalancesSod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sod(sod: JsonField<AccountBalancesSod>) = apply { this.sod = sod }

        /** Trade-date effective cash. */
        fun tradeCash(tradeCash: String) = tradeCash(JsonField.of(tradeCash))

        /**
         * Sets [Builder.tradeCash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tradeCash] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tradeCash(tradeCash: JsonField<String>) = apply { this.tradeCash = tradeCash }

        /** Trade-date unsettled cash credits. */
        fun unsettledCredits(unsettledCredits: String) =
            unsettledCredits(JsonField.of(unsettledCredits))

        /**
         * Sets [Builder.unsettledCredits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unsettledCredits] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unsettledCredits(unsettledCredits: JsonField<String>) = apply {
            this.unsettledCredits = unsettledCredits
        }

        /** Trade-date unsettled cash debits. */
        fun unsettledDebits(unsettledDebits: String) =
            unsettledDebits(JsonField.of(unsettledDebits))

        /**
         * Sets [Builder.unsettledDebits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unsettledDebits] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unsettledDebits(unsettledDebits: JsonField<String>) = apply {
            this.unsettledDebits = unsettledDebits
        }

        /** The amount of cash currently available to withdraw. */
        fun withdrawableCash(withdrawableCash: String) =
            withdrawableCash(JsonField.of(withdrawableCash))

        /**
         * Sets [Builder.withdrawableCash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.withdrawableCash] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun withdrawableCash(withdrawableCash: JsonField<String>) = apply {
            this.withdrawableCash = withdrawableCash
        }

        /** Margin-account-only details. */
        fun marginDetails(marginDetails: MarginDetails?) =
            marginDetails(JsonField.ofNullable(marginDetails))

        /** Alias for calling [Builder.marginDetails] with `marginDetails.orElse(null)`. */
        fun marginDetails(marginDetails: Optional<MarginDetails>) =
            marginDetails(marginDetails.getOrNull())

        /**
         * Sets [Builder.marginDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marginDetails] with a well-typed [MarginDetails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun marginDetails(marginDetails: JsonField<MarginDetails>) = apply {
            this.marginDetails = marginDetails
        }

        /** Applied multiplier for margin calculations. */
        fun multiplier(multiplier: String?) = multiplier(JsonField.ofNullable(multiplier))

        /** Alias for calling [Builder.multiplier] with `multiplier.orElse(null)`. */
        fun multiplier(multiplier: Optional<String>) = multiplier(multiplier.getOrNull())

        /**
         * Sets [Builder.multiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multiplier(multiplier: JsonField<String>) = apply { this.multiplier = multiplier }

        /** The total market value of all short positions. */
        fun shortMarketValue(shortMarketValue: String?) =
            shortMarketValue(JsonField.ofNullable(shortMarketValue))

        /** Alias for calling [Builder.shortMarketValue] with `shortMarketValue.orElse(null)`. */
        fun shortMarketValue(shortMarketValue: Optional<String>) =
            shortMarketValue(shortMarketValue.getOrNull())

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
         * Returns an immutable instance of [AccountBalances].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .buyingPower()
         * .currency()
         * .dailyRealizedPnl()
         * .dailyTotalPnl()
         * .dailyUnrealizedPnl()
         * .equity()
         * .longMarketValue()
         * .marginType()
         * .openOrderAdjustment()
         * .settledCash()
         * .sod()
         * .tradeCash()
         * .unsettledCredits()
         * .unsettledDebits()
         * .withdrawableCash()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountBalances =
            AccountBalances(
                checkRequired("accountId", accountId),
                checkRequired("buyingPower", buyingPower),
                checkRequired("currency", currency),
                checkRequired("dailyRealizedPnl", dailyRealizedPnl),
                checkRequired("dailyTotalPnl", dailyTotalPnl),
                checkRequired("dailyUnrealizedPnl", dailyUnrealizedPnl),
                checkRequired("equity", equity),
                checkRequired("longMarketValue", longMarketValue),
                checkRequired("marginType", marginType),
                checkRequired("openOrderAdjustment", openOrderAdjustment),
                checkRequired("settledCash", settledCash),
                checkRequired("sod", sod),
                checkRequired("tradeCash", tradeCash),
                checkRequired("unsettledCredits", unsettledCredits),
                checkRequired("unsettledDebits", unsettledDebits),
                checkRequired("withdrawableCash", withdrawableCash),
                marginDetails,
                multiplier,
                shortMarketValue,
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
    fun validate(): AccountBalances = apply {
        if (validated) {
            return@apply
        }

        accountId()
        buyingPower()
        currency()
        dailyRealizedPnl()
        dailyTotalPnl()
        dailyUnrealizedPnl()
        equity()
        longMarketValue()
        marginType().validate()
        openOrderAdjustment()
        settledCash()
        sod().validate()
        tradeCash()
        unsettledCredits()
        unsettledDebits()
        withdrawableCash()
        marginDetails().ifPresent { it.validate() }
        multiplier()
        shortMarketValue()
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
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (buyingPower.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (dailyRealizedPnl.asKnown().isPresent) 1 else 0) +
            (if (dailyTotalPnl.asKnown().isPresent) 1 else 0) +
            (if (dailyUnrealizedPnl.asKnown().isPresent) 1 else 0) +
            (if (equity.asKnown().isPresent) 1 else 0) +
            (if (longMarketValue.asKnown().isPresent) 1 else 0) +
            (marginType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (openOrderAdjustment.asKnown().isPresent) 1 else 0) +
            (if (settledCash.asKnown().isPresent) 1 else 0) +
            (sod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tradeCash.asKnown().isPresent) 1 else 0) +
            (if (unsettledCredits.asKnown().isPresent) 1 else 0) +
            (if (unsettledDebits.asKnown().isPresent) 1 else 0) +
            (if (withdrawableCash.asKnown().isPresent) 1 else 0) +
            (marginDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (multiplier.asKnown().isPresent) 1 else 0) +
            (if (shortMarketValue.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountBalances &&
            accountId == other.accountId &&
            buyingPower == other.buyingPower &&
            currency == other.currency &&
            dailyRealizedPnl == other.dailyRealizedPnl &&
            dailyTotalPnl == other.dailyTotalPnl &&
            dailyUnrealizedPnl == other.dailyUnrealizedPnl &&
            equity == other.equity &&
            longMarketValue == other.longMarketValue &&
            marginType == other.marginType &&
            openOrderAdjustment == other.openOrderAdjustment &&
            settledCash == other.settledCash &&
            sod == other.sod &&
            tradeCash == other.tradeCash &&
            unsettledCredits == other.unsettledCredits &&
            unsettledDebits == other.unsettledDebits &&
            withdrawableCash == other.withdrawableCash &&
            marginDetails == other.marginDetails &&
            multiplier == other.multiplier &&
            shortMarketValue == other.shortMarketValue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountId,
            buyingPower,
            currency,
            dailyRealizedPnl,
            dailyTotalPnl,
            dailyUnrealizedPnl,
            equity,
            longMarketValue,
            marginType,
            openOrderAdjustment,
            settledCash,
            sod,
            tradeCash,
            unsettledCredits,
            unsettledDebits,
            withdrawableCash,
            marginDetails,
            multiplier,
            shortMarketValue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountBalances{accountId=$accountId, buyingPower=$buyingPower, currency=$currency, dailyRealizedPnl=$dailyRealizedPnl, dailyTotalPnl=$dailyTotalPnl, dailyUnrealizedPnl=$dailyUnrealizedPnl, equity=$equity, longMarketValue=$longMarketValue, marginType=$marginType, openOrderAdjustment=$openOrderAdjustment, settledCash=$settledCash, sod=$sod, tradeCash=$tradeCash, unsettledCredits=$unsettledCredits, unsettledDebits=$unsettledDebits, withdrawableCash=$withdrawableCash, marginDetails=$marginDetails, multiplier=$multiplier, shortMarketValue=$shortMarketValue, additionalProperties=$additionalProperties}"
}
