// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.SecurityType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InstrumentCore
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val countryOfIssue: JsonField<String>,
    private val currency: JsonField<String>,
    private val easyToBorrow: JsonField<Boolean>,
    private val isLiquidationOnly: JsonField<Boolean>,
    private val isMarginable: JsonField<Boolean>,
    private val isRestricted: JsonField<Boolean>,
    private val isShortProhibited: JsonField<Boolean>,
    private val isThresholdSecurity: JsonField<Boolean>,
    private val isTradable: JsonField<Boolean>,
    private val symbol: JsonField<String>,
    private val venue: JsonField<String>,
    private val adv: JsonField<String>,
    private val expiry: JsonField<LocalDate>,
    private val instrumentType: JsonField<SecurityType>,
    private val longMarginRate: JsonField<String>,
    private val name: JsonField<String>,
    private val notionalAdv: JsonField<String>,
    private val previousClose: JsonField<String>,
    private val shortMarginRate: JsonField<String>,
    private val strikePrice: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_of_issue")
        @ExcludeMissing
        countryOfIssue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("easy_to_borrow")
        @ExcludeMissing
        easyToBorrow: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_liquidation_only")
        @ExcludeMissing
        isLiquidationOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_marginable")
        @ExcludeMissing
        isMarginable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_restricted")
        @ExcludeMissing
        isRestricted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_short_prohibited")
        @ExcludeMissing
        isShortProhibited: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_threshold_security")
        @ExcludeMissing
        isThresholdSecurity: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_tradable")
        @ExcludeMissing
        isTradable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("venue") @ExcludeMissing venue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adv") @ExcludeMissing adv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiry") @ExcludeMissing expiry: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("instrument_type")
        @ExcludeMissing
        instrumentType: JsonField<SecurityType> = JsonMissing.of(),
        @JsonProperty("long_margin_rate")
        @ExcludeMissing
        longMarginRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notional_adv")
        @ExcludeMissing
        notionalAdv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_close")
        @ExcludeMissing
        previousClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_margin_rate")
        @ExcludeMissing
        shortMarginRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("strike_price")
        @ExcludeMissing
        strikePrice: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        countryOfIssue,
        currency,
        easyToBorrow,
        isLiquidationOnly,
        isMarginable,
        isRestricted,
        isShortProhibited,
        isThresholdSecurity,
        isTradable,
        symbol,
        venue,
        adv,
        expiry,
        instrumentType,
        longMarginRate,
        name,
        notionalAdv,
        previousClose,
        shortMarginRate,
        strikePrice,
        mutableMapOf(),
    )

    /**
     * Unique OEMS instrument identifier (UUID)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The ISO country code of the instrument's issue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryOfIssue(): String = countryOfIssue.getRequired("country_of_issue")

    /**
     * The ISO currency code in which the instrument is traded
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Indicates if the instrument is classified as Easy-To-Borrow
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun easyToBorrow(): Boolean = easyToBorrow.getRequired("easy_to_borrow")

    /**
     * Indicates if the instrument is liquidation only and cannot be bought
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isLiquidationOnly(): Boolean = isLiquidationOnly.getRequired("is_liquidation_only")

    /**
     * Indicates if the instrument is marginable
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isMarginable(): Boolean = isMarginable.getRequired("is_marginable")

    /**
     * Indicates if the instrument is restricted from trading
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRestricted(): Boolean = isRestricted.getRequired("is_restricted")

    /**
     * Indicates if short selling is prohibited for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isShortProhibited(): Boolean = isShortProhibited.getRequired("is_short_prohibited")

    /**
     * Indicates if the instrument is on the Regulation SHO Threshold Security List
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isThresholdSecurity(): Boolean = isThresholdSecurity.getRequired("is_threshold_security")

    /**
     * Indicates if the instrument is tradable
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isTradable(): Boolean = isTradable.getRequired("is_tradable")

    /**
     * The trading symbol for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * The MIC code of the primary listing venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun venue(): String = venue.getRequired("venue")

    /**
     * Average daily share volume from the security definition.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun adv(): Optional<String> = adv.getOptional("adv")

    /**
     * The expiration date for options instruments
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiry(): Optional<LocalDate> = expiry.getOptional("expiry")

    /**
     * The type of security (e.g., Common Stock, ETF)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentType(): Optional<SecurityType> = instrumentType.getOptional("instrument_type")

    /**
     * The percent of a long position's value you must post as margin
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun longMarginRate(): Optional<String> = longMarginRate.getOptional("long_margin_rate")

    /**
     * The full name of the instrument or its issuer
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Notional ADV (`adv × previous_close`). The primary liquidity signal used by
     * `/instruments/search` ranking. Computed at response time so it stays consistent with whatever
     * `adv` and `previous_close` show.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notionalAdv(): Optional<String> = notionalAdv.getOptional("notional_adv")

    /**
     * Last close price from the security definition.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousClose(): Optional<String> = previousClose.getOptional("previous_close")

    /**
     * The percent of a short position's value you must post as margin
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shortMarginRate(): Optional<String> = shortMarginRate.getOptional("short_margin_rate")

    /**
     * The strike price for options instruments
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun strikePrice(): Optional<String> = strikePrice.getOptional("strike_price")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [countryOfIssue].
     *
     * Unlike [countryOfIssue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_of_issue")
    @ExcludeMissing
    fun _countryOfIssue(): JsonField<String> = countryOfIssue

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [easyToBorrow].
     *
     * Unlike [easyToBorrow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("easy_to_borrow")
    @ExcludeMissing
    fun _easyToBorrow(): JsonField<Boolean> = easyToBorrow

    /**
     * Returns the raw JSON value of [isLiquidationOnly].
     *
     * Unlike [isLiquidationOnly], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_liquidation_only")
    @ExcludeMissing
    fun _isLiquidationOnly(): JsonField<Boolean> = isLiquidationOnly

    /**
     * Returns the raw JSON value of [isMarginable].
     *
     * Unlike [isMarginable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_marginable")
    @ExcludeMissing
    fun _isMarginable(): JsonField<Boolean> = isMarginable

    /**
     * Returns the raw JSON value of [isRestricted].
     *
     * Unlike [isRestricted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_restricted")
    @ExcludeMissing
    fun _isRestricted(): JsonField<Boolean> = isRestricted

    /**
     * Returns the raw JSON value of [isShortProhibited].
     *
     * Unlike [isShortProhibited], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_short_prohibited")
    @ExcludeMissing
    fun _isShortProhibited(): JsonField<Boolean> = isShortProhibited

    /**
     * Returns the raw JSON value of [isThresholdSecurity].
     *
     * Unlike [isThresholdSecurity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_threshold_security")
    @ExcludeMissing
    fun _isThresholdSecurity(): JsonField<Boolean> = isThresholdSecurity

    /**
     * Returns the raw JSON value of [isTradable].
     *
     * Unlike [isTradable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_tradable") @ExcludeMissing fun _isTradable(): JsonField<Boolean> = isTradable

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [venue].
     *
     * Unlike [venue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("venue") @ExcludeMissing fun _venue(): JsonField<String> = venue

    /**
     * Returns the raw JSON value of [adv].
     *
     * Unlike [adv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adv") @ExcludeMissing fun _adv(): JsonField<String> = adv

    /**
     * Returns the raw JSON value of [expiry].
     *
     * Unlike [expiry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiry") @ExcludeMissing fun _expiry(): JsonField<LocalDate> = expiry

    /**
     * Returns the raw JSON value of [instrumentType].
     *
     * Unlike [instrumentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_type")
    @ExcludeMissing
    fun _instrumentType(): JsonField<SecurityType> = instrumentType

    /**
     * Returns the raw JSON value of [longMarginRate].
     *
     * Unlike [longMarginRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("long_margin_rate")
    @ExcludeMissing
    fun _longMarginRate(): JsonField<String> = longMarginRate

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [notionalAdv].
     *
     * Unlike [notionalAdv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notional_adv")
    @ExcludeMissing
    fun _notionalAdv(): JsonField<String> = notionalAdv

    /**
     * Returns the raw JSON value of [previousClose].
     *
     * Unlike [previousClose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_close")
    @ExcludeMissing
    fun _previousClose(): JsonField<String> = previousClose

    /**
     * Returns the raw JSON value of [shortMarginRate].
     *
     * Unlike [shortMarginRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_margin_rate")
    @ExcludeMissing
    fun _shortMarginRate(): JsonField<String> = shortMarginRate

    /**
     * Returns the raw JSON value of [strikePrice].
     *
     * Unlike [strikePrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strike_price")
    @ExcludeMissing
    fun _strikePrice(): JsonField<String> = strikePrice

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
         * Returns a mutable builder for constructing an instance of [InstrumentCore].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .countryOfIssue()
         * .currency()
         * .easyToBorrow()
         * .isLiquidationOnly()
         * .isMarginable()
         * .isRestricted()
         * .isShortProhibited()
         * .isThresholdSecurity()
         * .isTradable()
         * .symbol()
         * .venue()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentCore]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var countryOfIssue: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var easyToBorrow: JsonField<Boolean>? = null
        private var isLiquidationOnly: JsonField<Boolean>? = null
        private var isMarginable: JsonField<Boolean>? = null
        private var isRestricted: JsonField<Boolean>? = null
        private var isShortProhibited: JsonField<Boolean>? = null
        private var isThresholdSecurity: JsonField<Boolean>? = null
        private var isTradable: JsonField<Boolean>? = null
        private var symbol: JsonField<String>? = null
        private var venue: JsonField<String>? = null
        private var adv: JsonField<String> = JsonMissing.of()
        private var expiry: JsonField<LocalDate> = JsonMissing.of()
        private var instrumentType: JsonField<SecurityType> = JsonMissing.of()
        private var longMarginRate: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var notionalAdv: JsonField<String> = JsonMissing.of()
        private var previousClose: JsonField<String> = JsonMissing.of()
        private var shortMarginRate: JsonField<String> = JsonMissing.of()
        private var strikePrice: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentCore: InstrumentCore) = apply {
            id = instrumentCore.id
            countryOfIssue = instrumentCore.countryOfIssue
            currency = instrumentCore.currency
            easyToBorrow = instrumentCore.easyToBorrow
            isLiquidationOnly = instrumentCore.isLiquidationOnly
            isMarginable = instrumentCore.isMarginable
            isRestricted = instrumentCore.isRestricted
            isShortProhibited = instrumentCore.isShortProhibited
            isThresholdSecurity = instrumentCore.isThresholdSecurity
            isTradable = instrumentCore.isTradable
            symbol = instrumentCore.symbol
            venue = instrumentCore.venue
            adv = instrumentCore.adv
            expiry = instrumentCore.expiry
            instrumentType = instrumentCore.instrumentType
            longMarginRate = instrumentCore.longMarginRate
            name = instrumentCore.name
            notionalAdv = instrumentCore.notionalAdv
            previousClose = instrumentCore.previousClose
            shortMarginRate = instrumentCore.shortMarginRate
            strikePrice = instrumentCore.strikePrice
            additionalProperties = instrumentCore.additionalProperties.toMutableMap()
        }

        /** Unique OEMS instrument identifier (UUID) */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The ISO country code of the instrument's issue */
        fun countryOfIssue(countryOfIssue: String) = countryOfIssue(JsonField.of(countryOfIssue))

        /**
         * Sets [Builder.countryOfIssue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryOfIssue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryOfIssue(countryOfIssue: JsonField<String>) = apply {
            this.countryOfIssue = countryOfIssue
        }

        /** The ISO currency code in which the instrument is traded */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Indicates if the instrument is classified as Easy-To-Borrow */
        fun easyToBorrow(easyToBorrow: Boolean) = easyToBorrow(JsonField.of(easyToBorrow))

        /**
         * Sets [Builder.easyToBorrow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.easyToBorrow] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun easyToBorrow(easyToBorrow: JsonField<Boolean>) = apply {
            this.easyToBorrow = easyToBorrow
        }

        /** Indicates if the instrument is liquidation only and cannot be bought */
        fun isLiquidationOnly(isLiquidationOnly: Boolean) =
            isLiquidationOnly(JsonField.of(isLiquidationOnly))

        /**
         * Sets [Builder.isLiquidationOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isLiquidationOnly] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isLiquidationOnly(isLiquidationOnly: JsonField<Boolean>) = apply {
            this.isLiquidationOnly = isLiquidationOnly
        }

        /** Indicates if the instrument is marginable */
        fun isMarginable(isMarginable: Boolean) = isMarginable(JsonField.of(isMarginable))

        /**
         * Sets [Builder.isMarginable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isMarginable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isMarginable(isMarginable: JsonField<Boolean>) = apply {
            this.isMarginable = isMarginable
        }

        /** Indicates if the instrument is restricted from trading */
        fun isRestricted(isRestricted: Boolean) = isRestricted(JsonField.of(isRestricted))

        /**
         * Sets [Builder.isRestricted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRestricted] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRestricted(isRestricted: JsonField<Boolean>) = apply {
            this.isRestricted = isRestricted
        }

        /** Indicates if short selling is prohibited for the instrument */
        fun isShortProhibited(isShortProhibited: Boolean) =
            isShortProhibited(JsonField.of(isShortProhibited))

        /**
         * Sets [Builder.isShortProhibited] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isShortProhibited] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isShortProhibited(isShortProhibited: JsonField<Boolean>) = apply {
            this.isShortProhibited = isShortProhibited
        }

        /** Indicates if the instrument is on the Regulation SHO Threshold Security List */
        fun isThresholdSecurity(isThresholdSecurity: Boolean) =
            isThresholdSecurity(JsonField.of(isThresholdSecurity))

        /**
         * Sets [Builder.isThresholdSecurity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isThresholdSecurity] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isThresholdSecurity(isThresholdSecurity: JsonField<Boolean>) = apply {
            this.isThresholdSecurity = isThresholdSecurity
        }

        /** Indicates if the instrument is tradable */
        fun isTradable(isTradable: Boolean) = isTradable(JsonField.of(isTradable))

        /**
         * Sets [Builder.isTradable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTradable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isTradable(isTradable: JsonField<Boolean>) = apply { this.isTradable = isTradable }

        /** The trading symbol for the instrument */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** The MIC code of the primary listing venue */
        fun venue(venue: String) = venue(JsonField.of(venue))

        /**
         * Sets [Builder.venue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.venue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun venue(venue: JsonField<String>) = apply { this.venue = venue }

        /** Average daily share volume from the security definition. */
        fun adv(adv: String?) = adv(JsonField.ofNullable(adv))

        /** Alias for calling [Builder.adv] with `adv.orElse(null)`. */
        fun adv(adv: Optional<String>) = adv(adv.getOrNull())

        /**
         * Sets [Builder.adv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adv] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun adv(adv: JsonField<String>) = apply { this.adv = adv }

        /** The expiration date for options instruments */
        fun expiry(expiry: LocalDate?) = expiry(JsonField.ofNullable(expiry))

        /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
        fun expiry(expiry: Optional<LocalDate>) = expiry(expiry.getOrNull())

        /**
         * Sets [Builder.expiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiry] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiry(expiry: JsonField<LocalDate>) = apply { this.expiry = expiry }

        /** The type of security (e.g., Common Stock, ETF) */
        fun instrumentType(instrumentType: SecurityType?) =
            instrumentType(JsonField.ofNullable(instrumentType))

        /** Alias for calling [Builder.instrumentType] with `instrumentType.orElse(null)`. */
        fun instrumentType(instrumentType: Optional<SecurityType>) =
            instrumentType(instrumentType.getOrNull())

        /**
         * Sets [Builder.instrumentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentType] with a well-typed [SecurityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instrumentType(instrumentType: JsonField<SecurityType>) = apply {
            this.instrumentType = instrumentType
        }

        /** The percent of a long position's value you must post as margin */
        fun longMarginRate(longMarginRate: String?) =
            longMarginRate(JsonField.ofNullable(longMarginRate))

        /** Alias for calling [Builder.longMarginRate] with `longMarginRate.orElse(null)`. */
        fun longMarginRate(longMarginRate: Optional<String>) =
            longMarginRate(longMarginRate.getOrNull())

        /**
         * Sets [Builder.longMarginRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longMarginRate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun longMarginRate(longMarginRate: JsonField<String>) = apply {
            this.longMarginRate = longMarginRate
        }

        /** The full name of the instrument or its issuer */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Notional ADV (`adv × previous_close`). The primary liquidity signal used by
         * `/instruments/search` ranking. Computed at response time so it stays consistent with
         * whatever `adv` and `previous_close` show.
         */
        fun notionalAdv(notionalAdv: String?) = notionalAdv(JsonField.ofNullable(notionalAdv))

        /** Alias for calling [Builder.notionalAdv] with `notionalAdv.orElse(null)`. */
        fun notionalAdv(notionalAdv: Optional<String>) = notionalAdv(notionalAdv.getOrNull())

        /**
         * Sets [Builder.notionalAdv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notionalAdv] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun notionalAdv(notionalAdv: JsonField<String>) = apply { this.notionalAdv = notionalAdv }

        /** Last close price from the security definition. */
        fun previousClose(previousClose: String?) =
            previousClose(JsonField.ofNullable(previousClose))

        /** Alias for calling [Builder.previousClose] with `previousClose.orElse(null)`. */
        fun previousClose(previousClose: Optional<String>) =
            previousClose(previousClose.getOrNull())

        /**
         * Sets [Builder.previousClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousClose] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previousClose(previousClose: JsonField<String>) = apply {
            this.previousClose = previousClose
        }

        /** The percent of a short position's value you must post as margin */
        fun shortMarginRate(shortMarginRate: String?) =
            shortMarginRate(JsonField.ofNullable(shortMarginRate))

        /** Alias for calling [Builder.shortMarginRate] with `shortMarginRate.orElse(null)`. */
        fun shortMarginRate(shortMarginRate: Optional<String>) =
            shortMarginRate(shortMarginRate.getOrNull())

        /**
         * Sets [Builder.shortMarginRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortMarginRate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shortMarginRate(shortMarginRate: JsonField<String>) = apply {
            this.shortMarginRate = shortMarginRate
        }

        /** The strike price for options instruments */
        fun strikePrice(strikePrice: String?) = strikePrice(JsonField.ofNullable(strikePrice))

        /** Alias for calling [Builder.strikePrice] with `strikePrice.orElse(null)`. */
        fun strikePrice(strikePrice: Optional<String>) = strikePrice(strikePrice.getOrNull())

        /**
         * Sets [Builder.strikePrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strikePrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun strikePrice(strikePrice: JsonField<String>) = apply { this.strikePrice = strikePrice }

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
         * Returns an immutable instance of [InstrumentCore].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .countryOfIssue()
         * .currency()
         * .easyToBorrow()
         * .isLiquidationOnly()
         * .isMarginable()
         * .isRestricted()
         * .isShortProhibited()
         * .isThresholdSecurity()
         * .isTradable()
         * .symbol()
         * .venue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentCore =
            InstrumentCore(
                checkRequired("id", id),
                checkRequired("countryOfIssue", countryOfIssue),
                checkRequired("currency", currency),
                checkRequired("easyToBorrow", easyToBorrow),
                checkRequired("isLiquidationOnly", isLiquidationOnly),
                checkRequired("isMarginable", isMarginable),
                checkRequired("isRestricted", isRestricted),
                checkRequired("isShortProhibited", isShortProhibited),
                checkRequired("isThresholdSecurity", isThresholdSecurity),
                checkRequired("isTradable", isTradable),
                checkRequired("symbol", symbol),
                checkRequired("venue", venue),
                adv,
                expiry,
                instrumentType,
                longMarginRate,
                name,
                notionalAdv,
                previousClose,
                shortMarginRate,
                strikePrice,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstrumentCore = apply {
        if (validated) {
            return@apply
        }

        id()
        countryOfIssue()
        currency()
        easyToBorrow()
        isLiquidationOnly()
        isMarginable()
        isRestricted()
        isShortProhibited()
        isThresholdSecurity()
        isTradable()
        symbol()
        venue()
        adv()
        expiry()
        instrumentType().ifPresent { it.validate() }
        longMarginRate()
        name()
        notionalAdv()
        previousClose()
        shortMarginRate()
        strikePrice()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (countryOfIssue.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (easyToBorrow.asKnown().isPresent) 1 else 0) +
            (if (isLiquidationOnly.asKnown().isPresent) 1 else 0) +
            (if (isMarginable.asKnown().isPresent) 1 else 0) +
            (if (isRestricted.asKnown().isPresent) 1 else 0) +
            (if (isShortProhibited.asKnown().isPresent) 1 else 0) +
            (if (isThresholdSecurity.asKnown().isPresent) 1 else 0) +
            (if (isTradable.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (venue.asKnown().isPresent) 1 else 0) +
            (if (adv.asKnown().isPresent) 1 else 0) +
            (if (expiry.asKnown().isPresent) 1 else 0) +
            (instrumentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (longMarginRate.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (notionalAdv.asKnown().isPresent) 1 else 0) +
            (if (previousClose.asKnown().isPresent) 1 else 0) +
            (if (shortMarginRate.asKnown().isPresent) 1 else 0) +
            (if (strikePrice.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentCore &&
            id == other.id &&
            countryOfIssue == other.countryOfIssue &&
            currency == other.currency &&
            easyToBorrow == other.easyToBorrow &&
            isLiquidationOnly == other.isLiquidationOnly &&
            isMarginable == other.isMarginable &&
            isRestricted == other.isRestricted &&
            isShortProhibited == other.isShortProhibited &&
            isThresholdSecurity == other.isThresholdSecurity &&
            isTradable == other.isTradable &&
            symbol == other.symbol &&
            venue == other.venue &&
            adv == other.adv &&
            expiry == other.expiry &&
            instrumentType == other.instrumentType &&
            longMarginRate == other.longMarginRate &&
            name == other.name &&
            notionalAdv == other.notionalAdv &&
            previousClose == other.previousClose &&
            shortMarginRate == other.shortMarginRate &&
            strikePrice == other.strikePrice &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            countryOfIssue,
            currency,
            easyToBorrow,
            isLiquidationOnly,
            isMarginable,
            isRestricted,
            isShortProhibited,
            isThresholdSecurity,
            isTradable,
            symbol,
            venue,
            adv,
            expiry,
            instrumentType,
            longMarginRate,
            name,
            notionalAdv,
            previousClose,
            shortMarginRate,
            strikePrice,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentCore{id=$id, countryOfIssue=$countryOfIssue, currency=$currency, easyToBorrow=$easyToBorrow, isLiquidationOnly=$isLiquidationOnly, isMarginable=$isMarginable, isRestricted=$isRestricted, isShortProhibited=$isShortProhibited, isThresholdSecurity=$isThresholdSecurity, isTradable=$isTradable, symbol=$symbol, venue=$venue, adv=$adv, expiry=$expiry, instrumentType=$instrumentType, longMarginRate=$longMarginRate, name=$name, notionalAdv=$notionalAdv, previousClose=$previousClose, shortMarginRate=$shortMarginRate, strikePrice=$strikePrice, additionalProperties=$additionalProperties}"
}
