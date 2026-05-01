// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a tradable financial instrument, including supplemental information */
class Instrument
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
    private val securityId: JsonField<String>,
    private val securityIdSource: JsonField<SecurityIdSource>,
    private val securityIds: JsonField<List<InstrumentSecurityId>>,
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
    private val availableToBorrow: JsonField<Long>,
    private val averageVolume: JsonField<Long>,
    private val beta: JsonField<String>,
    private val borrowFee: JsonField<String>,
    private val description: JsonField<String>,
    private val dividendYield: JsonField<String>,
    private val earningsPerShare: JsonField<String>,
    private val fiftyTwoWeekHigh: JsonField<String>,
    private val fiftyTwoWeekLow: JsonField<String>,
    private val industry: JsonField<String>,
    private val listDate: JsonField<LocalDate>,
    private val logoUrl: JsonField<String>,
    private val longConcentrationLimit: JsonField<String>,
    private val marketCap: JsonField<String>,
    private val optionsExpiryDates: JsonField<List<LocalDate>>,
    private val priceToEarnings: JsonField<String>,
    private val quote: JsonField<InstrumentQuote>,
    private val sector: JsonField<String>,
    private val shortConcentrationLimit: JsonField<String>,
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
        @JsonProperty("security_id")
        @ExcludeMissing
        securityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id_source")
        @ExcludeMissing
        securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of(),
        @JsonProperty("security_ids")
        @ExcludeMissing
        securityIds: JsonField<List<InstrumentSecurityId>> = JsonMissing.of(),
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
        @JsonProperty("available_to_borrow")
        @ExcludeMissing
        availableToBorrow: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("average_volume")
        @ExcludeMissing
        averageVolume: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("beta") @ExcludeMissing beta: JsonField<String> = JsonMissing.of(),
        @JsonProperty("borrow_fee") @ExcludeMissing borrowFee: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dividend_yield")
        @ExcludeMissing
        dividendYield: JsonField<String> = JsonMissing.of(),
        @JsonProperty("earnings_per_share")
        @ExcludeMissing
        earningsPerShare: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fifty_two_week_high")
        @ExcludeMissing
        fiftyTwoWeekHigh: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fifty_two_week_low")
        @ExcludeMissing
        fiftyTwoWeekLow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("industry") @ExcludeMissing industry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("list_date")
        @ExcludeMissing
        listDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("logo_url") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("long_concentration_limit")
        @ExcludeMissing
        longConcentrationLimit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("market_cap") @ExcludeMissing marketCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options_expiry_dates")
        @ExcludeMissing
        optionsExpiryDates: JsonField<List<LocalDate>> = JsonMissing.of(),
        @JsonProperty("price_to_earnings")
        @ExcludeMissing
        priceToEarnings: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quote") @ExcludeMissing quote: JsonField<InstrumentQuote> = JsonMissing.of(),
        @JsonProperty("sector") @ExcludeMissing sector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_concentration_limit")
        @ExcludeMissing
        shortConcentrationLimit: JsonField<String> = JsonMissing.of(),
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
        securityId,
        securityIdSource,
        securityIds,
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
        availableToBorrow,
        averageVolume,
        beta,
        borrowFee,
        description,
        dividendYield,
        earningsPerShare,
        fiftyTwoWeekHigh,
        fiftyTwoWeekLow,
        industry,
        listDate,
        logoUrl,
        longConcentrationLimit,
        marketCap,
        optionsExpiryDates,
        priceToEarnings,
        quote,
        sector,
        shortConcentrationLimit,
        mutableMapOf(),
    )

    fun toInstrumentCore(): InstrumentCore =
        InstrumentCore.builder()
            .id(id)
            .countryOfIssue(countryOfIssue)
            .currency(currency)
            .easyToBorrow(easyToBorrow)
            .isLiquidationOnly(isLiquidationOnly)
            .isMarginable(isMarginable)
            .isRestricted(isRestricted)
            .isShortProhibited(isShortProhibited)
            .isThresholdSecurity(isThresholdSecurity)
            .isTradable(isTradable)
            .securityId(securityId)
            .securityIdSource(securityIdSource)
            .securityIds(securityIds)
            .symbol(symbol)
            .venue(venue)
            .adv(adv)
            .expiry(expiry)
            .instrumentType(instrumentType)
            .longMarginRate(longMarginRate)
            .name(name)
            .notionalAdv(notionalAdv)
            .previousClose(previousClose)
            .shortMarginRate(shortMarginRate)
            .strikePrice(strikePrice)
            .build()

    /**
     * Unique instrument identifier
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
     * Deprecated. Use `security_ids`.
     *
     * A primary security identifier for this instrument.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun securityId(): String = securityId.getRequired("security_id")

    /**
     * Deprecated. Use `security_ids`.
     *
     * The source for `security_id`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityIdSource(): SecurityIdSource = securityIdSource.getRequired("security_id_source")

    /**
     * All known security identifiers for this instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityIds(): List<InstrumentSecurityId> = securityIds.getRequired("security_ids")

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
     * The number of shares currently available to borrow
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableToBorrow(): Optional<Long> = availableToBorrow.getOptional("available_to_borrow")

    /**
     * The average daily trading volume over the past 30 days
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun averageVolume(): Optional<Long> = averageVolume.getOptional("average_volume")

    /**
     * The beta value, measuring the instrument's volatility relative to the overall market
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beta(): Optional<String> = beta.getOptional("beta")

    /**
     * The fee associated with borrowing the instrument, expressed as a decimal
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borrowFee(): Optional<String> = borrowFee.getOptional("borrow_fee")

    /**
     * A detailed description of the instrument or company
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The trailing twelve months (TTM) dividend yield
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dividendYield(): Optional<String> = dividendYield.getOptional("dividend_yield")

    /**
     * The trailing twelve months (TTM) earnings per share
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earningsPerShare(): Optional<String> = earningsPerShare.getOptional("earnings_per_share")

    /**
     * The highest price over the last 52 weeks
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fiftyTwoWeekHigh(): Optional<String> = fiftyTwoWeekHigh.getOptional("fifty_two_week_high")

    /**
     * The lowest price over the last 52 weeks
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fiftyTwoWeekLow(): Optional<String> = fiftyTwoWeekLow.getOptional("fifty_two_week_low")

    /**
     * The specific industry of the instrument's issuer
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun industry(): Optional<String> = industry.getOptional("industry")

    /**
     * The date the instrument was first listed
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listDate(): Optional<LocalDate> = listDate.getOptional("list_date")

    /**
     * URL to a representative logo image for the instrument or issuer
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoUrl(): Optional<String> = logoUrl.getOptional("logo_url")

    /**
     * A cap on how much of your equity you can put into a single symbol on the long side
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun longConcentrationLimit(): Optional<String> =
        longConcentrationLimit.getOptional("long_concentration_limit")

    /**
     * The total market capitalization
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marketCap(): Optional<String> = marketCap.getOptional("market_cap")

    /**
     * Available options expiration dates for this instrument. Present only when
     * `include_options_expiry_dates=true` in the request.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optionsExpiryDates(): Optional<List<LocalDate>> =
        optionsExpiryDates.getOptional("options_expiry_dates")

    /**
     * The price-to-earnings (P/E) ratio for the trailing twelve months (TTM)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceToEarnings(): Optional<String> = priceToEarnings.getOptional("price_to_earnings")

    /**
     * Real-time market quote data for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quote(): Optional<InstrumentQuote> = quote.getOptional("quote")

    /**
     * The business sector of the instrument's issuer
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sector(): Optional<String> = sector.getOptional("sector")

    /**
     * A cap on how much of your equity you can allocate to a single symbol on the short side
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shortConcentrationLimit(): Optional<String> =
        shortConcentrationLimit.getOptional("short_concentration_limit")

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
     * Returns the raw JSON value of [securityId].
     *
     * Unlike [securityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("security_id")
    @ExcludeMissing
    fun _securityId(): JsonField<String> = securityId

    /**
     * Returns the raw JSON value of [securityIdSource].
     *
     * Unlike [securityIdSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("security_id_source")
    @ExcludeMissing
    fun _securityIdSource(): JsonField<SecurityIdSource> = securityIdSource

    /**
     * Returns the raw JSON value of [securityIds].
     *
     * Unlike [securityIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("security_ids")
    @ExcludeMissing
    fun _securityIds(): JsonField<List<InstrumentSecurityId>> = securityIds

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

    /**
     * Returns the raw JSON value of [availableToBorrow].
     *
     * Unlike [availableToBorrow], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_to_borrow")
    @ExcludeMissing
    fun _availableToBorrow(): JsonField<Long> = availableToBorrow

    /**
     * Returns the raw JSON value of [averageVolume].
     *
     * Unlike [averageVolume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("average_volume")
    @ExcludeMissing
    fun _averageVolume(): JsonField<Long> = averageVolume

    /**
     * Returns the raw JSON value of [beta].
     *
     * Unlike [beta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beta") @ExcludeMissing fun _beta(): JsonField<String> = beta

    /**
     * Returns the raw JSON value of [borrowFee].
     *
     * Unlike [borrowFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("borrow_fee") @ExcludeMissing fun _borrowFee(): JsonField<String> = borrowFee

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [dividendYield].
     *
     * Unlike [dividendYield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dividend_yield")
    @ExcludeMissing
    fun _dividendYield(): JsonField<String> = dividendYield

    /**
     * Returns the raw JSON value of [earningsPerShare].
     *
     * Unlike [earningsPerShare], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("earnings_per_share")
    @ExcludeMissing
    fun _earningsPerShare(): JsonField<String> = earningsPerShare

    /**
     * Returns the raw JSON value of [fiftyTwoWeekHigh].
     *
     * Unlike [fiftyTwoWeekHigh], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fifty_two_week_high")
    @ExcludeMissing
    fun _fiftyTwoWeekHigh(): JsonField<String> = fiftyTwoWeekHigh

    /**
     * Returns the raw JSON value of [fiftyTwoWeekLow].
     *
     * Unlike [fiftyTwoWeekLow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fifty_two_week_low")
    @ExcludeMissing
    fun _fiftyTwoWeekLow(): JsonField<String> = fiftyTwoWeekLow

    /**
     * Returns the raw JSON value of [industry].
     *
     * Unlike [industry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("industry") @ExcludeMissing fun _industry(): JsonField<String> = industry

    /**
     * Returns the raw JSON value of [listDate].
     *
     * Unlike [listDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("list_date") @ExcludeMissing fun _listDate(): JsonField<LocalDate> = listDate

    /**
     * Returns the raw JSON value of [logoUrl].
     *
     * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logo_url") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

    /**
     * Returns the raw JSON value of [longConcentrationLimit].
     *
     * Unlike [longConcentrationLimit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("long_concentration_limit")
    @ExcludeMissing
    fun _longConcentrationLimit(): JsonField<String> = longConcentrationLimit

    /**
     * Returns the raw JSON value of [marketCap].
     *
     * Unlike [marketCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market_cap") @ExcludeMissing fun _marketCap(): JsonField<String> = marketCap

    /**
     * Returns the raw JSON value of [optionsExpiryDates].
     *
     * Unlike [optionsExpiryDates], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("options_expiry_dates")
    @ExcludeMissing
    fun _optionsExpiryDates(): JsonField<List<LocalDate>> = optionsExpiryDates

    /**
     * Returns the raw JSON value of [priceToEarnings].
     *
     * Unlike [priceToEarnings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_to_earnings")
    @ExcludeMissing
    fun _priceToEarnings(): JsonField<String> = priceToEarnings

    /**
     * Returns the raw JSON value of [quote].
     *
     * Unlike [quote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quote") @ExcludeMissing fun _quote(): JsonField<InstrumentQuote> = quote

    /**
     * Returns the raw JSON value of [sector].
     *
     * Unlike [sector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sector") @ExcludeMissing fun _sector(): JsonField<String> = sector

    /**
     * Returns the raw JSON value of [shortConcentrationLimit].
     *
     * Unlike [shortConcentrationLimit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("short_concentration_limit")
    @ExcludeMissing
    fun _shortConcentrationLimit(): JsonField<String> = shortConcentrationLimit

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
         * Returns a mutable builder for constructing an instance of [Instrument].
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
         * .securityId()
         * .securityIdSource()
         * .securityIds()
         * .symbol()
         * .venue()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Instrument]. */
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
        private var securityId: JsonField<String>? = null
        private var securityIdSource: JsonField<SecurityIdSource>? = null
        private var securityIds: JsonField<MutableList<InstrumentSecurityId>>? = null
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
        private var availableToBorrow: JsonField<Long> = JsonMissing.of()
        private var averageVolume: JsonField<Long> = JsonMissing.of()
        private var beta: JsonField<String> = JsonMissing.of()
        private var borrowFee: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dividendYield: JsonField<String> = JsonMissing.of()
        private var earningsPerShare: JsonField<String> = JsonMissing.of()
        private var fiftyTwoWeekHigh: JsonField<String> = JsonMissing.of()
        private var fiftyTwoWeekLow: JsonField<String> = JsonMissing.of()
        private var industry: JsonField<String> = JsonMissing.of()
        private var listDate: JsonField<LocalDate> = JsonMissing.of()
        private var logoUrl: JsonField<String> = JsonMissing.of()
        private var longConcentrationLimit: JsonField<String> = JsonMissing.of()
        private var marketCap: JsonField<String> = JsonMissing.of()
        private var optionsExpiryDates: JsonField<MutableList<LocalDate>>? = null
        private var priceToEarnings: JsonField<String> = JsonMissing.of()
        private var quote: JsonField<InstrumentQuote> = JsonMissing.of()
        private var sector: JsonField<String> = JsonMissing.of()
        private var shortConcentrationLimit: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrument: Instrument) = apply {
            id = instrument.id
            countryOfIssue = instrument.countryOfIssue
            currency = instrument.currency
            easyToBorrow = instrument.easyToBorrow
            isLiquidationOnly = instrument.isLiquidationOnly
            isMarginable = instrument.isMarginable
            isRestricted = instrument.isRestricted
            isShortProhibited = instrument.isShortProhibited
            isThresholdSecurity = instrument.isThresholdSecurity
            isTradable = instrument.isTradable
            securityId = instrument.securityId
            securityIdSource = instrument.securityIdSource
            securityIds = instrument.securityIds.map { it.toMutableList() }
            symbol = instrument.symbol
            venue = instrument.venue
            adv = instrument.adv
            expiry = instrument.expiry
            instrumentType = instrument.instrumentType
            longMarginRate = instrument.longMarginRate
            name = instrument.name
            notionalAdv = instrument.notionalAdv
            previousClose = instrument.previousClose
            shortMarginRate = instrument.shortMarginRate
            strikePrice = instrument.strikePrice
            availableToBorrow = instrument.availableToBorrow
            averageVolume = instrument.averageVolume
            beta = instrument.beta
            borrowFee = instrument.borrowFee
            description = instrument.description
            dividendYield = instrument.dividendYield
            earningsPerShare = instrument.earningsPerShare
            fiftyTwoWeekHigh = instrument.fiftyTwoWeekHigh
            fiftyTwoWeekLow = instrument.fiftyTwoWeekLow
            industry = instrument.industry
            listDate = instrument.listDate
            logoUrl = instrument.logoUrl
            longConcentrationLimit = instrument.longConcentrationLimit
            marketCap = instrument.marketCap
            optionsExpiryDates = instrument.optionsExpiryDates.map { it.toMutableList() }
            priceToEarnings = instrument.priceToEarnings
            quote = instrument.quote
            sector = instrument.sector
            shortConcentrationLimit = instrument.shortConcentrationLimit
            additionalProperties = instrument.additionalProperties.toMutableMap()
        }

        /** Unique instrument identifier */
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

        /**
         * Deprecated. Use `security_ids`.
         *
         * A primary security identifier for this instrument.
         */
        @Deprecated("deprecated")
        fun securityId(securityId: String) = securityId(JsonField.of(securityId))

        /**
         * Sets [Builder.securityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun securityId(securityId: JsonField<String>) = apply { this.securityId = securityId }

        /**
         * Deprecated. Use `security_ids`.
         *
         * The source for `security_id`.
         */
        fun securityIdSource(securityIdSource: SecurityIdSource) =
            securityIdSource(JsonField.of(securityIdSource))

        /**
         * Sets [Builder.securityIdSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityIdSource] with a well-typed [SecurityIdSource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun securityIdSource(securityIdSource: JsonField<SecurityIdSource>) = apply {
            this.securityIdSource = securityIdSource
        }

        /** All known security identifiers for this instrument */
        fun securityIds(securityIds: List<InstrumentSecurityId>) =
            securityIds(JsonField.of(securityIds))

        /**
         * Sets [Builder.securityIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityIds] with a well-typed
         * `List<InstrumentSecurityId>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun securityIds(securityIds: JsonField<List<InstrumentSecurityId>>) = apply {
            this.securityIds = securityIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [InstrumentSecurityId] to [securityIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecurityId(securityId: InstrumentSecurityId) = apply {
            securityIds =
                (securityIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("securityIds", it).add(securityId)
                }
        }

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

        /** The number of shares currently available to borrow */
        fun availableToBorrow(availableToBorrow: Long?) =
            availableToBorrow(JsonField.ofNullable(availableToBorrow))

        /**
         * Alias for [Builder.availableToBorrow].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun availableToBorrow(availableToBorrow: Long) =
            availableToBorrow(availableToBorrow as Long?)

        /** Alias for calling [Builder.availableToBorrow] with `availableToBorrow.orElse(null)`. */
        fun availableToBorrow(availableToBorrow: Optional<Long>) =
            availableToBorrow(availableToBorrow.getOrNull())

        /**
         * Sets [Builder.availableToBorrow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableToBorrow] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun availableToBorrow(availableToBorrow: JsonField<Long>) = apply {
            this.availableToBorrow = availableToBorrow
        }

        /** The average daily trading volume over the past 30 days */
        fun averageVolume(averageVolume: Long?) = averageVolume(JsonField.ofNullable(averageVolume))

        /**
         * Alias for [Builder.averageVolume].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun averageVolume(averageVolume: Long) = averageVolume(averageVolume as Long?)

        /** Alias for calling [Builder.averageVolume] with `averageVolume.orElse(null)`. */
        fun averageVolume(averageVolume: Optional<Long>) = averageVolume(averageVolume.getOrNull())

        /**
         * Sets [Builder.averageVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.averageVolume] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun averageVolume(averageVolume: JsonField<Long>) = apply {
            this.averageVolume = averageVolume
        }

        /** The beta value, measuring the instrument's volatility relative to the overall market */
        fun beta(beta: String?) = beta(JsonField.ofNullable(beta))

        /** Alias for calling [Builder.beta] with `beta.orElse(null)`. */
        fun beta(beta: Optional<String>) = beta(beta.getOrNull())

        /**
         * Sets [Builder.beta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beta] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun beta(beta: JsonField<String>) = apply { this.beta = beta }

        /** The fee associated with borrowing the instrument, expressed as a decimal */
        fun borrowFee(borrowFee: String?) = borrowFee(JsonField.ofNullable(borrowFee))

        /** Alias for calling [Builder.borrowFee] with `borrowFee.orElse(null)`. */
        fun borrowFee(borrowFee: Optional<String>) = borrowFee(borrowFee.getOrNull())

        /**
         * Sets [Builder.borrowFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borrowFee] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun borrowFee(borrowFee: JsonField<String>) = apply { this.borrowFee = borrowFee }

        /** A detailed description of the instrument or company */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The trailing twelve months (TTM) dividend yield */
        fun dividendYield(dividendYield: String?) =
            dividendYield(JsonField.ofNullable(dividendYield))

        /** Alias for calling [Builder.dividendYield] with `dividendYield.orElse(null)`. */
        fun dividendYield(dividendYield: Optional<String>) =
            dividendYield(dividendYield.getOrNull())

        /**
         * Sets [Builder.dividendYield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividendYield] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dividendYield(dividendYield: JsonField<String>) = apply {
            this.dividendYield = dividendYield
        }

        /** The trailing twelve months (TTM) earnings per share */
        fun earningsPerShare(earningsPerShare: String?) =
            earningsPerShare(JsonField.ofNullable(earningsPerShare))

        /** Alias for calling [Builder.earningsPerShare] with `earningsPerShare.orElse(null)`. */
        fun earningsPerShare(earningsPerShare: Optional<String>) =
            earningsPerShare(earningsPerShare.getOrNull())

        /**
         * Sets [Builder.earningsPerShare] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earningsPerShare] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun earningsPerShare(earningsPerShare: JsonField<String>) = apply {
            this.earningsPerShare = earningsPerShare
        }

        /** The highest price over the last 52 weeks */
        fun fiftyTwoWeekHigh(fiftyTwoWeekHigh: String?) =
            fiftyTwoWeekHigh(JsonField.ofNullable(fiftyTwoWeekHigh))

        /** Alias for calling [Builder.fiftyTwoWeekHigh] with `fiftyTwoWeekHigh.orElse(null)`. */
        fun fiftyTwoWeekHigh(fiftyTwoWeekHigh: Optional<String>) =
            fiftyTwoWeekHigh(fiftyTwoWeekHigh.getOrNull())

        /**
         * Sets [Builder.fiftyTwoWeekHigh] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fiftyTwoWeekHigh] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fiftyTwoWeekHigh(fiftyTwoWeekHigh: JsonField<String>) = apply {
            this.fiftyTwoWeekHigh = fiftyTwoWeekHigh
        }

        /** The lowest price over the last 52 weeks */
        fun fiftyTwoWeekLow(fiftyTwoWeekLow: String?) =
            fiftyTwoWeekLow(JsonField.ofNullable(fiftyTwoWeekLow))

        /** Alias for calling [Builder.fiftyTwoWeekLow] with `fiftyTwoWeekLow.orElse(null)`. */
        fun fiftyTwoWeekLow(fiftyTwoWeekLow: Optional<String>) =
            fiftyTwoWeekLow(fiftyTwoWeekLow.getOrNull())

        /**
         * Sets [Builder.fiftyTwoWeekLow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fiftyTwoWeekLow] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fiftyTwoWeekLow(fiftyTwoWeekLow: JsonField<String>) = apply {
            this.fiftyTwoWeekLow = fiftyTwoWeekLow
        }

        /** The specific industry of the instrument's issuer */
        fun industry(industry: String?) = industry(JsonField.ofNullable(industry))

        /** Alias for calling [Builder.industry] with `industry.orElse(null)`. */
        fun industry(industry: Optional<String>) = industry(industry.getOrNull())

        /**
         * Sets [Builder.industry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.industry] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun industry(industry: JsonField<String>) = apply { this.industry = industry }

        /** The date the instrument was first listed */
        fun listDate(listDate: LocalDate?) = listDate(JsonField.ofNullable(listDate))

        /** Alias for calling [Builder.listDate] with `listDate.orElse(null)`. */
        fun listDate(listDate: Optional<LocalDate>) = listDate(listDate.getOrNull())

        /**
         * Sets [Builder.listDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun listDate(listDate: JsonField<LocalDate>) = apply { this.listDate = listDate }

        /** URL to a representative logo image for the instrument or issuer */
        fun logoUrl(logoUrl: String?) = logoUrl(JsonField.ofNullable(logoUrl))

        /** Alias for calling [Builder.logoUrl] with `logoUrl.orElse(null)`. */
        fun logoUrl(logoUrl: Optional<String>) = logoUrl(logoUrl.getOrNull())

        /**
         * Sets [Builder.logoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

        /** A cap on how much of your equity you can put into a single symbol on the long side */
        fun longConcentrationLimit(longConcentrationLimit: String?) =
            longConcentrationLimit(JsonField.ofNullable(longConcentrationLimit))

        /**
         * Alias for calling [Builder.longConcentrationLimit] with
         * `longConcentrationLimit.orElse(null)`.
         */
        fun longConcentrationLimit(longConcentrationLimit: Optional<String>) =
            longConcentrationLimit(longConcentrationLimit.getOrNull())

        /**
         * Sets [Builder.longConcentrationLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longConcentrationLimit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun longConcentrationLimit(longConcentrationLimit: JsonField<String>) = apply {
            this.longConcentrationLimit = longConcentrationLimit
        }

        /** The total market capitalization */
        fun marketCap(marketCap: String?) = marketCap(JsonField.ofNullable(marketCap))

        /** Alias for calling [Builder.marketCap] with `marketCap.orElse(null)`. */
        fun marketCap(marketCap: Optional<String>) = marketCap(marketCap.getOrNull())

        /**
         * Sets [Builder.marketCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketCap] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun marketCap(marketCap: JsonField<String>) = apply { this.marketCap = marketCap }

        /**
         * Available options expiration dates for this instrument. Present only when
         * `include_options_expiry_dates=true` in the request.
         */
        fun optionsExpiryDates(optionsExpiryDates: List<LocalDate>?) =
            optionsExpiryDates(JsonField.ofNullable(optionsExpiryDates))

        /**
         * Alias for calling [Builder.optionsExpiryDates] with `optionsExpiryDates.orElse(null)`.
         */
        fun optionsExpiryDates(optionsExpiryDates: Optional<List<LocalDate>>) =
            optionsExpiryDates(optionsExpiryDates.getOrNull())

        /**
         * Sets [Builder.optionsExpiryDates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionsExpiryDates] with a well-typed `List<LocalDate>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun optionsExpiryDates(optionsExpiryDates: JsonField<List<LocalDate>>) = apply {
            this.optionsExpiryDates = optionsExpiryDates.map { it.toMutableList() }
        }

        /**
         * Adds a single [LocalDate] to [optionsExpiryDates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOptionsExpiryDate(optionsExpiryDate: LocalDate) = apply {
            optionsExpiryDates =
                (optionsExpiryDates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("optionsExpiryDates", it).add(optionsExpiryDate)
                }
        }

        /** The price-to-earnings (P/E) ratio for the trailing twelve months (TTM) */
        fun priceToEarnings(priceToEarnings: String?) =
            priceToEarnings(JsonField.ofNullable(priceToEarnings))

        /** Alias for calling [Builder.priceToEarnings] with `priceToEarnings.orElse(null)`. */
        fun priceToEarnings(priceToEarnings: Optional<String>) =
            priceToEarnings(priceToEarnings.getOrNull())

        /**
         * Sets [Builder.priceToEarnings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceToEarnings] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priceToEarnings(priceToEarnings: JsonField<String>) = apply {
            this.priceToEarnings = priceToEarnings
        }

        /** Real-time market quote data for the instrument */
        fun quote(quote: InstrumentQuote?) = quote(JsonField.ofNullable(quote))

        /** Alias for calling [Builder.quote] with `quote.orElse(null)`. */
        fun quote(quote: Optional<InstrumentQuote>) = quote(quote.getOrNull())

        /**
         * Sets [Builder.quote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quote] with a well-typed [InstrumentQuote] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun quote(quote: JsonField<InstrumentQuote>) = apply { this.quote = quote }

        /** The business sector of the instrument's issuer */
        fun sector(sector: String?) = sector(JsonField.ofNullable(sector))

        /** Alias for calling [Builder.sector] with `sector.orElse(null)`. */
        fun sector(sector: Optional<String>) = sector(sector.getOrNull())

        /**
         * Sets [Builder.sector] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sector] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sector(sector: JsonField<String>) = apply { this.sector = sector }

        /**
         * A cap on how much of your equity you can allocate to a single symbol on the short side
         */
        fun shortConcentrationLimit(shortConcentrationLimit: String?) =
            shortConcentrationLimit(JsonField.ofNullable(shortConcentrationLimit))

        /**
         * Alias for calling [Builder.shortConcentrationLimit] with
         * `shortConcentrationLimit.orElse(null)`.
         */
        fun shortConcentrationLimit(shortConcentrationLimit: Optional<String>) =
            shortConcentrationLimit(shortConcentrationLimit.getOrNull())

        /**
         * Sets [Builder.shortConcentrationLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortConcentrationLimit] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shortConcentrationLimit(shortConcentrationLimit: JsonField<String>) = apply {
            this.shortConcentrationLimit = shortConcentrationLimit
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
         * Returns an immutable instance of [Instrument].
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
         * .securityId()
         * .securityIdSource()
         * .securityIds()
         * .symbol()
         * .venue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Instrument =
            Instrument(
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
                checkRequired("securityId", securityId),
                checkRequired("securityIdSource", securityIdSource),
                checkRequired("securityIds", securityIds).map { it.toImmutable() },
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
                availableToBorrow,
                averageVolume,
                beta,
                borrowFee,
                description,
                dividendYield,
                earningsPerShare,
                fiftyTwoWeekHigh,
                fiftyTwoWeekLow,
                industry,
                listDate,
                logoUrl,
                longConcentrationLimit,
                marketCap,
                (optionsExpiryDates ?: JsonMissing.of()).map { it.toImmutable() },
                priceToEarnings,
                quote,
                sector,
                shortConcentrationLimit,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Instrument = apply {
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
        securityId()
        securityIdSource().validate()
        securityIds().forEach { it.validate() }
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
        availableToBorrow()
        averageVolume()
        beta()
        borrowFee()
        description()
        dividendYield()
        earningsPerShare()
        fiftyTwoWeekHigh()
        fiftyTwoWeekLow()
        industry()
        listDate()
        logoUrl()
        longConcentrationLimit()
        marketCap()
        optionsExpiryDates()
        priceToEarnings()
        quote().ifPresent { it.validate() }
        sector()
        shortConcentrationLimit()
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
            (if (securityId.asKnown().isPresent) 1 else 0) +
            (securityIdSource.asKnown().getOrNull()?.validity() ?: 0) +
            (securityIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
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
            (if (strikePrice.asKnown().isPresent) 1 else 0) +
            (if (availableToBorrow.asKnown().isPresent) 1 else 0) +
            (if (averageVolume.asKnown().isPresent) 1 else 0) +
            (if (beta.asKnown().isPresent) 1 else 0) +
            (if (borrowFee.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dividendYield.asKnown().isPresent) 1 else 0) +
            (if (earningsPerShare.asKnown().isPresent) 1 else 0) +
            (if (fiftyTwoWeekHigh.asKnown().isPresent) 1 else 0) +
            (if (fiftyTwoWeekLow.asKnown().isPresent) 1 else 0) +
            (if (industry.asKnown().isPresent) 1 else 0) +
            (if (listDate.asKnown().isPresent) 1 else 0) +
            (if (logoUrl.asKnown().isPresent) 1 else 0) +
            (if (longConcentrationLimit.asKnown().isPresent) 1 else 0) +
            (if (marketCap.asKnown().isPresent) 1 else 0) +
            (optionsExpiryDates.asKnown().getOrNull()?.size ?: 0) +
            (if (priceToEarnings.asKnown().isPresent) 1 else 0) +
            (quote.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sector.asKnown().isPresent) 1 else 0) +
            (if (shortConcentrationLimit.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Instrument &&
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
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            securityIds == other.securityIds &&
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
            availableToBorrow == other.availableToBorrow &&
            averageVolume == other.averageVolume &&
            beta == other.beta &&
            borrowFee == other.borrowFee &&
            description == other.description &&
            dividendYield == other.dividendYield &&
            earningsPerShare == other.earningsPerShare &&
            fiftyTwoWeekHigh == other.fiftyTwoWeekHigh &&
            fiftyTwoWeekLow == other.fiftyTwoWeekLow &&
            industry == other.industry &&
            listDate == other.listDate &&
            logoUrl == other.logoUrl &&
            longConcentrationLimit == other.longConcentrationLimit &&
            marketCap == other.marketCap &&
            optionsExpiryDates == other.optionsExpiryDates &&
            priceToEarnings == other.priceToEarnings &&
            quote == other.quote &&
            sector == other.sector &&
            shortConcentrationLimit == other.shortConcentrationLimit &&
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
            securityId,
            securityIdSource,
            securityIds,
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
            availableToBorrow,
            averageVolume,
            beta,
            borrowFee,
            description,
            dividendYield,
            earningsPerShare,
            fiftyTwoWeekHigh,
            fiftyTwoWeekLow,
            industry,
            listDate,
            logoUrl,
            longConcentrationLimit,
            marketCap,
            optionsExpiryDates,
            priceToEarnings,
            quote,
            sector,
            shortConcentrationLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Instrument{id=$id, countryOfIssue=$countryOfIssue, currency=$currency, easyToBorrow=$easyToBorrow, isLiquidationOnly=$isLiquidationOnly, isMarginable=$isMarginable, isRestricted=$isRestricted, isShortProhibited=$isShortProhibited, isThresholdSecurity=$isThresholdSecurity, isTradable=$isTradable, securityId=$securityId, securityIdSource=$securityIdSource, securityIds=$securityIds, symbol=$symbol, venue=$venue, adv=$adv, expiry=$expiry, instrumentType=$instrumentType, longMarginRate=$longMarginRate, name=$name, notionalAdv=$notionalAdv, previousClose=$previousClose, shortMarginRate=$shortMarginRate, strikePrice=$strikePrice, availableToBorrow=$availableToBorrow, averageVolume=$averageVolume, beta=$beta, borrowFee=$borrowFee, description=$description, dividendYield=$dividendYield, earningsPerShare=$earningsPerShare, fiftyTwoWeekHigh=$fiftyTwoWeekHigh, fiftyTwoWeekLow=$fiftyTwoWeekLow, industry=$industry, listDate=$listDate, logoUrl=$logoUrl, longConcentrationLimit=$longConcentrationLimit, marketCap=$marketCap, optionsExpiryDates=$optionsExpiryDates, priceToEarnings=$priceToEarnings, quote=$quote, sector=$sector, shortConcentrationLimit=$shortConcentrationLimit, additionalProperties=$additionalProperties}"
}
