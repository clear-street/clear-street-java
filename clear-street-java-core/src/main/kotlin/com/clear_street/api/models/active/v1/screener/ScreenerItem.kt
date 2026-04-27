// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.screener

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.AnalystRating
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An instrument returned by the screener */
class ScreenerItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instrumentId: JsonField<String>,
    private val price: JsonField<String>,
    private val securityId: JsonField<String>,
    private val securityIdSource: JsonField<SecurityIdSource>,
    private val symbol: JsonField<String>,
    private val totalRatings: JsonField<Int>,
    private val consensusPriceTarget: JsonField<String>,
    private val consensusRating: JsonField<AnalystRating>,
    private val countryOfIssue: JsonField<String>,
    private val debtToEquityTtm: JsonField<String>,
    private val description: JsonField<String>,
    private val dividendYieldTtm: JsonField<String>,
    private val earningsPerShareTtm: JsonField<String>,
    private val exchange: JsonField<String>,
    private val fiftyTwoWeekHigh: JsonField<String>,
    private val fiftyTwoWeekLow: JsonField<String>,
    private val gapFrom52wHighPct: JsonField<String>,
    private val gapFrom52wLowPct: JsonField<String>,
    private val industry: JsonField<String>,
    private val instrumentType: JsonField<String>,
    private val listDate: JsonField<LocalDate>,
    private val marketCap: JsonField<String>,
    private val monthAvgVolume: JsonField<String>,
    private val name: JsonField<String>,
    private val oneMonthAgoClose: JsonField<String>,
    private val oneMonthAgoOpen: JsonField<String>,
    private val oneMonthChangePct: JsonField<String>,
    private val oneWeekAgoClose: JsonField<String>,
    private val oneWeekAgoOpen: JsonField<String>,
    private val oneWeekChangePct: JsonField<String>,
    private val oneYearAgoClose: JsonField<String>,
    private val oneYearAgoOpen: JsonField<String>,
    private val oneYearChangePct: JsonField<String>,
    private val percentChange: JsonField<String>,
    private val prevDayClose: JsonField<String>,
    private val priceToEarningsTtm: JsonField<String>,
    private val sector: JsonField<String>,
    private val sixMonthChangePct: JsonField<String>,
    private val sixMonthsAgoClose: JsonField<String>,
    private val sixMonthsAgoOpen: JsonField<String>,
    private val threeMonthChangePct: JsonField<String>,
    private val threeMonthsAgoClose: JsonField<String>,
    private val threeMonthsAgoOpen: JsonField<String>,
    private val volume: JsonField<String>,
    private val weekAvgVolume: JsonField<String>,
    private val yearToDateOpen: JsonField<String>,
    private val ytdChangePct: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id")
        @ExcludeMissing
        securityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id_source")
        @ExcludeMissing
        securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_ratings")
        @ExcludeMissing
        totalRatings: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("consensus_price_target")
        @ExcludeMissing
        consensusPriceTarget: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consensus_rating")
        @ExcludeMissing
        consensusRating: JsonField<AnalystRating> = JsonMissing.of(),
        @JsonProperty("country_of_issue")
        @ExcludeMissing
        countryOfIssue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debt_to_equity_ttm")
        @ExcludeMissing
        debtToEquityTtm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dividend_yield_ttm")
        @ExcludeMissing
        dividendYieldTtm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("earnings_per_share_ttm")
        @ExcludeMissing
        earningsPerShareTtm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exchange") @ExcludeMissing exchange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fifty_two_week_high")
        @ExcludeMissing
        fiftyTwoWeekHigh: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fifty_two_week_low")
        @ExcludeMissing
        fiftyTwoWeekLow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gap_from_52w_high_pct")
        @ExcludeMissing
        gapFrom52wHighPct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gap_from_52w_low_pct")
        @ExcludeMissing
        gapFrom52wLowPct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("industry") @ExcludeMissing industry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_type")
        @ExcludeMissing
        instrumentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("list_date")
        @ExcludeMissing
        listDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("market_cap") @ExcludeMissing marketCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("month_avg_volume")
        @ExcludeMissing
        monthAvgVolume: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_month_ago_close")
        @ExcludeMissing
        oneMonthAgoClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_month_ago_open")
        @ExcludeMissing
        oneMonthAgoOpen: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_month_change_pct")
        @ExcludeMissing
        oneMonthChangePct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_week_ago_close")
        @ExcludeMissing
        oneWeekAgoClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_week_ago_open")
        @ExcludeMissing
        oneWeekAgoOpen: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_week_change_pct")
        @ExcludeMissing
        oneWeekChangePct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_year_ago_close")
        @ExcludeMissing
        oneYearAgoClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_year_ago_open")
        @ExcludeMissing
        oneYearAgoOpen: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_year_change_pct")
        @ExcludeMissing
        oneYearChangePct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("percent_change")
        @ExcludeMissing
        percentChange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prev_day_close")
        @ExcludeMissing
        prevDayClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price_to_earnings_ttm")
        @ExcludeMissing
        priceToEarningsTtm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sector") @ExcludeMissing sector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("six_month_change_pct")
        @ExcludeMissing
        sixMonthChangePct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("six_months_ago_close")
        @ExcludeMissing
        sixMonthsAgoClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("six_months_ago_open")
        @ExcludeMissing
        sixMonthsAgoOpen: JsonField<String> = JsonMissing.of(),
        @JsonProperty("three_month_change_pct")
        @ExcludeMissing
        threeMonthChangePct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("three_months_ago_close")
        @ExcludeMissing
        threeMonthsAgoClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("three_months_ago_open")
        @ExcludeMissing
        threeMonthsAgoOpen: JsonField<String> = JsonMissing.of(),
        @JsonProperty("volume") @ExcludeMissing volume: JsonField<String> = JsonMissing.of(),
        @JsonProperty("week_avg_volume")
        @ExcludeMissing
        weekAvgVolume: JsonField<String> = JsonMissing.of(),
        @JsonProperty("year_to_date_open")
        @ExcludeMissing
        yearToDateOpen: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ytd_change_pct")
        @ExcludeMissing
        ytdChangePct: JsonField<String> = JsonMissing.of(),
    ) : this(
        instrumentId,
        price,
        securityId,
        securityIdSource,
        symbol,
        totalRatings,
        consensusPriceTarget,
        consensusRating,
        countryOfIssue,
        debtToEquityTtm,
        description,
        dividendYieldTtm,
        earningsPerShareTtm,
        exchange,
        fiftyTwoWeekHigh,
        fiftyTwoWeekLow,
        gapFrom52wHighPct,
        gapFrom52wLowPct,
        industry,
        instrumentType,
        listDate,
        marketCap,
        monthAvgVolume,
        name,
        oneMonthAgoClose,
        oneMonthAgoOpen,
        oneMonthChangePct,
        oneWeekAgoClose,
        oneWeekAgoOpen,
        oneWeekChangePct,
        oneYearAgoClose,
        oneYearAgoOpen,
        oneYearChangePct,
        percentChange,
        prevDayClose,
        priceToEarningsTtm,
        sector,
        sixMonthChangePct,
        sixMonthsAgoClose,
        sixMonthsAgoOpen,
        threeMonthChangePct,
        threeMonthsAgoClose,
        threeMonthsAgoOpen,
        volume,
        weekAvgVolume,
        yearToDateOpen,
        ytdChangePct,
        mutableMapOf(),
    )

    /**
     * The OEMS instrument ID (`instrument.instruments.id`). Always present regardless of
     * `field_filter`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * The latest price for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): String = price.getRequired("price")

    /**
     * The identifier for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityId(): String = securityId.getRequired("security_id")

    /**
     * The source of the security identifier
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityIdSource(): SecurityIdSource = securityIdSource.getRequired("security_id_source")

    /**
     * The trading symbol for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * The total count of analyst ratings
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalRatings(): Int = totalRatings.getRequired("total_ratings")

    /**
     * The consensus analyst price target
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun consensusPriceTarget(): Optional<String> =
        consensusPriceTarget.getOptional("consensus_price_target")

    /**
     * The consensus analyst rating
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun consensusRating(): Optional<AnalystRating> = consensusRating.getOptional("consensus_rating")

    /**
     * The ISO country code of the instrument's issue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryOfIssue(): Optional<String> = countryOfIssue.getOptional("country_of_issue")

    /**
     * The TTM debt-to-equity ratio
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtToEquityTtm(): Optional<String> = debtToEquityTtm.getOptional("debt_to_equity_ttm")

    /**
     * A detailed description of the instrument or company
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The TTM dividend yield percent
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dividendYieldTtm(): Optional<String> = dividendYieldTtm.getOptional("dividend_yield_ttm")

    /**
     * The TTM earnings per share
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earningsPerShareTtm(): Optional<String> =
        earningsPerShareTtm.getOptional("earnings_per_share_ttm")

    /**
     * The MIC code of the primary listing exchange
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exchange(): Optional<String> = exchange.getOptional("exchange")

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
     * Percent gap from 52-week high to previous day close (negative = below high)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gapFrom52wHighPct(): Optional<String> =
        gapFrom52wHighPct.getOptional("gap_from_52w_high_pct")

    /**
     * Percent gap from 52-week low to previous day close (positive = above low)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gapFrom52wLowPct(): Optional<String> = gapFrom52wLowPct.getOptional("gap_from_52w_low_pct")

    /**
     * The specific industry of the instrument's issuer
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun industry(): Optional<String> = industry.getOptional("industry")

    /**
     * The type of instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentType(): Optional<String> = instrumentType.getOptional("instrument_type")

    /**
     * The date the instrument was first listed
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun listDate(): Optional<LocalDate> = listDate.getOptional("list_date")

    /**
     * The total market capitalization
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marketCap(): Optional<String> = marketCap.getOptional("market_cap")

    /**
     * The average trading volume over the past month
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthAvgVolume(): Optional<String> = monthAvgVolume.getOptional("month_avg_volume")

    /**
     * The full name of the instrument or its issuer
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The closing price approximately one month ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneMonthAgoClose(): Optional<String> = oneMonthAgoClose.getOptional("one_month_ago_close")

    /**
     * The opening price approximately one month ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneMonthAgoOpen(): Optional<String> = oneMonthAgoOpen.getOptional("one_month_ago_open")

    /**
     * Percent change from one month ago close to previous day close
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneMonthChangePct(): Optional<String> =
        oneMonthChangePct.getOptional("one_month_change_pct")

    /**
     * The closing price approximately one week ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneWeekAgoClose(): Optional<String> = oneWeekAgoClose.getOptional("one_week_ago_close")

    /**
     * The opening price approximately one week ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneWeekAgoOpen(): Optional<String> = oneWeekAgoOpen.getOptional("one_week_ago_open")

    /**
     * Percent change from one week ago close to previous day close
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneWeekChangePct(): Optional<String> = oneWeekChangePct.getOptional("one_week_change_pct")

    /**
     * The closing price approximately one year ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneYearAgoClose(): Optional<String> = oneYearAgoClose.getOptional("one_year_ago_close")

    /**
     * The opening price approximately one year ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneYearAgoOpen(): Optional<String> = oneYearAgoOpen.getOptional("one_year_ago_open")

    /**
     * Percent change from one year ago close to previous day close
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun oneYearChangePct(): Optional<String> = oneYearChangePct.getOptional("one_year_change_pct")

    /**
     * The percent change from previous close to current price
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun percentChange(): Optional<String> = percentChange.getOptional("percent_change")

    /**
     * The previous day's closing price
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prevDayClose(): Optional<String> = prevDayClose.getOptional("prev_day_close")

    /**
     * The TTM price-to-earnings ratio
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceToEarningsTtm(): Optional<String> =
        priceToEarningsTtm.getOptional("price_to_earnings_ttm")

    /**
     * The business sector of the instrument's issuer
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sector(): Optional<String> = sector.getOptional("sector")

    /**
     * Percent change from six months ago close to previous day close
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sixMonthChangePct(): Optional<String> =
        sixMonthChangePct.getOptional("six_month_change_pct")

    /**
     * The closing price approximately six months ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sixMonthsAgoClose(): Optional<String> =
        sixMonthsAgoClose.getOptional("six_months_ago_close")

    /**
     * The opening price approximately six months ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sixMonthsAgoOpen(): Optional<String> = sixMonthsAgoOpen.getOptional("six_months_ago_open")

    /**
     * Percent change from three months ago close to previous day close
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeMonthChangePct(): Optional<String> =
        threeMonthChangePct.getOptional("three_month_change_pct")

    /**
     * The closing price approximately three months ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeMonthsAgoClose(): Optional<String> =
        threeMonthsAgoClose.getOptional("three_months_ago_close")

    /**
     * The opening price approximately three months ago
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeMonthsAgoOpen(): Optional<String> =
        threeMonthsAgoOpen.getOptional("three_months_ago_open")

    /**
     * The latest trading volume for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun volume(): Optional<String> = volume.getOptional("volume")

    /**
     * The average trading volume over the past week
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weekAvgVolume(): Optional<String> = weekAvgVolume.getOptional("week_avg_volume")

    /**
     * The opening price on the first trading day of the current year
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun yearToDateOpen(): Optional<String> = yearToDateOpen.getOptional("year_to_date_open")

    /**
     * Percent change from year-to-date open to previous day close
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ytdChangePct(): Optional<String> = ytdChangePct.getOptional("ytd_change_pct")

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<String> = price

    /**
     * Returns the raw JSON value of [securityId].
     *
     * Unlike [securityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("security_id") @ExcludeMissing fun _securityId(): JsonField<String> = securityId

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
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [totalRatings].
     *
     * Unlike [totalRatings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_ratings")
    @ExcludeMissing
    fun _totalRatings(): JsonField<Int> = totalRatings

    /**
     * Returns the raw JSON value of [consensusPriceTarget].
     *
     * Unlike [consensusPriceTarget], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("consensus_price_target")
    @ExcludeMissing
    fun _consensusPriceTarget(): JsonField<String> = consensusPriceTarget

    /**
     * Returns the raw JSON value of [consensusRating].
     *
     * Unlike [consensusRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("consensus_rating")
    @ExcludeMissing
    fun _consensusRating(): JsonField<AnalystRating> = consensusRating

    /**
     * Returns the raw JSON value of [countryOfIssue].
     *
     * Unlike [countryOfIssue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_of_issue")
    @ExcludeMissing
    fun _countryOfIssue(): JsonField<String> = countryOfIssue

    /**
     * Returns the raw JSON value of [debtToEquityTtm].
     *
     * Unlike [debtToEquityTtm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debt_to_equity_ttm")
    @ExcludeMissing
    fun _debtToEquityTtm(): JsonField<String> = debtToEquityTtm

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [dividendYieldTtm].
     *
     * Unlike [dividendYieldTtm], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dividend_yield_ttm")
    @ExcludeMissing
    fun _dividendYieldTtm(): JsonField<String> = dividendYieldTtm

    /**
     * Returns the raw JSON value of [earningsPerShareTtm].
     *
     * Unlike [earningsPerShareTtm], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("earnings_per_share_ttm")
    @ExcludeMissing
    fun _earningsPerShareTtm(): JsonField<String> = earningsPerShareTtm

    /**
     * Returns the raw JSON value of [exchange].
     *
     * Unlike [exchange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exchange") @ExcludeMissing fun _exchange(): JsonField<String> = exchange

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
     * Returns the raw JSON value of [gapFrom52wHighPct].
     *
     * Unlike [gapFrom52wHighPct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("gap_from_52w_high_pct")
    @ExcludeMissing
    fun _gapFrom52wHighPct(): JsonField<String> = gapFrom52wHighPct

    /**
     * Returns the raw JSON value of [gapFrom52wLowPct].
     *
     * Unlike [gapFrom52wLowPct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("gap_from_52w_low_pct")
    @ExcludeMissing
    fun _gapFrom52wLowPct(): JsonField<String> = gapFrom52wLowPct

    /**
     * Returns the raw JSON value of [industry].
     *
     * Unlike [industry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("industry") @ExcludeMissing fun _industry(): JsonField<String> = industry

    /**
     * Returns the raw JSON value of [instrumentType].
     *
     * Unlike [instrumentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_type")
    @ExcludeMissing
    fun _instrumentType(): JsonField<String> = instrumentType

    /**
     * Returns the raw JSON value of [listDate].
     *
     * Unlike [listDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("list_date") @ExcludeMissing fun _listDate(): JsonField<LocalDate> = listDate

    /**
     * Returns the raw JSON value of [marketCap].
     *
     * Unlike [marketCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market_cap") @ExcludeMissing fun _marketCap(): JsonField<String> = marketCap

    /**
     * Returns the raw JSON value of [monthAvgVolume].
     *
     * Unlike [monthAvgVolume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("month_avg_volume")
    @ExcludeMissing
    fun _monthAvgVolume(): JsonField<String> = monthAvgVolume

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [oneMonthAgoClose].
     *
     * Unlike [oneMonthAgoClose], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("one_month_ago_close")
    @ExcludeMissing
    fun _oneMonthAgoClose(): JsonField<String> = oneMonthAgoClose

    /**
     * Returns the raw JSON value of [oneMonthAgoOpen].
     *
     * Unlike [oneMonthAgoOpen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("one_month_ago_open")
    @ExcludeMissing
    fun _oneMonthAgoOpen(): JsonField<String> = oneMonthAgoOpen

    /**
     * Returns the raw JSON value of [oneMonthChangePct].
     *
     * Unlike [oneMonthChangePct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("one_month_change_pct")
    @ExcludeMissing
    fun _oneMonthChangePct(): JsonField<String> = oneMonthChangePct

    /**
     * Returns the raw JSON value of [oneWeekAgoClose].
     *
     * Unlike [oneWeekAgoClose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("one_week_ago_close")
    @ExcludeMissing
    fun _oneWeekAgoClose(): JsonField<String> = oneWeekAgoClose

    /**
     * Returns the raw JSON value of [oneWeekAgoOpen].
     *
     * Unlike [oneWeekAgoOpen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("one_week_ago_open")
    @ExcludeMissing
    fun _oneWeekAgoOpen(): JsonField<String> = oneWeekAgoOpen

    /**
     * Returns the raw JSON value of [oneWeekChangePct].
     *
     * Unlike [oneWeekChangePct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("one_week_change_pct")
    @ExcludeMissing
    fun _oneWeekChangePct(): JsonField<String> = oneWeekChangePct

    /**
     * Returns the raw JSON value of [oneYearAgoClose].
     *
     * Unlike [oneYearAgoClose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("one_year_ago_close")
    @ExcludeMissing
    fun _oneYearAgoClose(): JsonField<String> = oneYearAgoClose

    /**
     * Returns the raw JSON value of [oneYearAgoOpen].
     *
     * Unlike [oneYearAgoOpen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("one_year_ago_open")
    @ExcludeMissing
    fun _oneYearAgoOpen(): JsonField<String> = oneYearAgoOpen

    /**
     * Returns the raw JSON value of [oneYearChangePct].
     *
     * Unlike [oneYearChangePct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("one_year_change_pct")
    @ExcludeMissing
    fun _oneYearChangePct(): JsonField<String> = oneYearChangePct

    /**
     * Returns the raw JSON value of [percentChange].
     *
     * Unlike [percentChange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percent_change")
    @ExcludeMissing
    fun _percentChange(): JsonField<String> = percentChange

    /**
     * Returns the raw JSON value of [prevDayClose].
     *
     * Unlike [prevDayClose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prev_day_close")
    @ExcludeMissing
    fun _prevDayClose(): JsonField<String> = prevDayClose

    /**
     * Returns the raw JSON value of [priceToEarningsTtm].
     *
     * Unlike [priceToEarningsTtm], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("price_to_earnings_ttm")
    @ExcludeMissing
    fun _priceToEarningsTtm(): JsonField<String> = priceToEarningsTtm

    /**
     * Returns the raw JSON value of [sector].
     *
     * Unlike [sector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sector") @ExcludeMissing fun _sector(): JsonField<String> = sector

    /**
     * Returns the raw JSON value of [sixMonthChangePct].
     *
     * Unlike [sixMonthChangePct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("six_month_change_pct")
    @ExcludeMissing
    fun _sixMonthChangePct(): JsonField<String> = sixMonthChangePct

    /**
     * Returns the raw JSON value of [sixMonthsAgoClose].
     *
     * Unlike [sixMonthsAgoClose], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("six_months_ago_close")
    @ExcludeMissing
    fun _sixMonthsAgoClose(): JsonField<String> = sixMonthsAgoClose

    /**
     * Returns the raw JSON value of [sixMonthsAgoOpen].
     *
     * Unlike [sixMonthsAgoOpen], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("six_months_ago_open")
    @ExcludeMissing
    fun _sixMonthsAgoOpen(): JsonField<String> = sixMonthsAgoOpen

    /**
     * Returns the raw JSON value of [threeMonthChangePct].
     *
     * Unlike [threeMonthChangePct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("three_month_change_pct")
    @ExcludeMissing
    fun _threeMonthChangePct(): JsonField<String> = threeMonthChangePct

    /**
     * Returns the raw JSON value of [threeMonthsAgoClose].
     *
     * Unlike [threeMonthsAgoClose], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("three_months_ago_close")
    @ExcludeMissing
    fun _threeMonthsAgoClose(): JsonField<String> = threeMonthsAgoClose

    /**
     * Returns the raw JSON value of [threeMonthsAgoOpen].
     *
     * Unlike [threeMonthsAgoOpen], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("three_months_ago_open")
    @ExcludeMissing
    fun _threeMonthsAgoOpen(): JsonField<String> = threeMonthsAgoOpen

    /**
     * Returns the raw JSON value of [volume].
     *
     * Unlike [volume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("volume") @ExcludeMissing fun _volume(): JsonField<String> = volume

    /**
     * Returns the raw JSON value of [weekAvgVolume].
     *
     * Unlike [weekAvgVolume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("week_avg_volume")
    @ExcludeMissing
    fun _weekAvgVolume(): JsonField<String> = weekAvgVolume

    /**
     * Returns the raw JSON value of [yearToDateOpen].
     *
     * Unlike [yearToDateOpen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("year_to_date_open")
    @ExcludeMissing
    fun _yearToDateOpen(): JsonField<String> = yearToDateOpen

    /**
     * Returns the raw JSON value of [ytdChangePct].
     *
     * Unlike [ytdChangePct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ytd_change_pct")
    @ExcludeMissing
    fun _ytdChangePct(): JsonField<String> = ytdChangePct

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
         * Returns a mutable builder for constructing an instance of [ScreenerItem].
         *
         * The following fields are required:
         * ```java
         * .instrumentId()
         * .price()
         * .securityId()
         * .securityIdSource()
         * .symbol()
         * .totalRatings()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScreenerItem]. */
    class Builder internal constructor() {

        private var instrumentId: JsonField<String>? = null
        private var price: JsonField<String>? = null
        private var securityId: JsonField<String>? = null
        private var securityIdSource: JsonField<SecurityIdSource>? = null
        private var symbol: JsonField<String>? = null
        private var totalRatings: JsonField<Int>? = null
        private var consensusPriceTarget: JsonField<String> = JsonMissing.of()
        private var consensusRating: JsonField<AnalystRating> = JsonMissing.of()
        private var countryOfIssue: JsonField<String> = JsonMissing.of()
        private var debtToEquityTtm: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dividendYieldTtm: JsonField<String> = JsonMissing.of()
        private var earningsPerShareTtm: JsonField<String> = JsonMissing.of()
        private var exchange: JsonField<String> = JsonMissing.of()
        private var fiftyTwoWeekHigh: JsonField<String> = JsonMissing.of()
        private var fiftyTwoWeekLow: JsonField<String> = JsonMissing.of()
        private var gapFrom52wHighPct: JsonField<String> = JsonMissing.of()
        private var gapFrom52wLowPct: JsonField<String> = JsonMissing.of()
        private var industry: JsonField<String> = JsonMissing.of()
        private var instrumentType: JsonField<String> = JsonMissing.of()
        private var listDate: JsonField<LocalDate> = JsonMissing.of()
        private var marketCap: JsonField<String> = JsonMissing.of()
        private var monthAvgVolume: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var oneMonthAgoClose: JsonField<String> = JsonMissing.of()
        private var oneMonthAgoOpen: JsonField<String> = JsonMissing.of()
        private var oneMonthChangePct: JsonField<String> = JsonMissing.of()
        private var oneWeekAgoClose: JsonField<String> = JsonMissing.of()
        private var oneWeekAgoOpen: JsonField<String> = JsonMissing.of()
        private var oneWeekChangePct: JsonField<String> = JsonMissing.of()
        private var oneYearAgoClose: JsonField<String> = JsonMissing.of()
        private var oneYearAgoOpen: JsonField<String> = JsonMissing.of()
        private var oneYearChangePct: JsonField<String> = JsonMissing.of()
        private var percentChange: JsonField<String> = JsonMissing.of()
        private var prevDayClose: JsonField<String> = JsonMissing.of()
        private var priceToEarningsTtm: JsonField<String> = JsonMissing.of()
        private var sector: JsonField<String> = JsonMissing.of()
        private var sixMonthChangePct: JsonField<String> = JsonMissing.of()
        private var sixMonthsAgoClose: JsonField<String> = JsonMissing.of()
        private var sixMonthsAgoOpen: JsonField<String> = JsonMissing.of()
        private var threeMonthChangePct: JsonField<String> = JsonMissing.of()
        private var threeMonthsAgoClose: JsonField<String> = JsonMissing.of()
        private var threeMonthsAgoOpen: JsonField<String> = JsonMissing.of()
        private var volume: JsonField<String> = JsonMissing.of()
        private var weekAvgVolume: JsonField<String> = JsonMissing.of()
        private var yearToDateOpen: JsonField<String> = JsonMissing.of()
        private var ytdChangePct: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(screenerItem: ScreenerItem) = apply {
            instrumentId = screenerItem.instrumentId
            price = screenerItem.price
            securityId = screenerItem.securityId
            securityIdSource = screenerItem.securityIdSource
            symbol = screenerItem.symbol
            totalRatings = screenerItem.totalRatings
            consensusPriceTarget = screenerItem.consensusPriceTarget
            consensusRating = screenerItem.consensusRating
            countryOfIssue = screenerItem.countryOfIssue
            debtToEquityTtm = screenerItem.debtToEquityTtm
            description = screenerItem.description
            dividendYieldTtm = screenerItem.dividendYieldTtm
            earningsPerShareTtm = screenerItem.earningsPerShareTtm
            exchange = screenerItem.exchange
            fiftyTwoWeekHigh = screenerItem.fiftyTwoWeekHigh
            fiftyTwoWeekLow = screenerItem.fiftyTwoWeekLow
            gapFrom52wHighPct = screenerItem.gapFrom52wHighPct
            gapFrom52wLowPct = screenerItem.gapFrom52wLowPct
            industry = screenerItem.industry
            instrumentType = screenerItem.instrumentType
            listDate = screenerItem.listDate
            marketCap = screenerItem.marketCap
            monthAvgVolume = screenerItem.monthAvgVolume
            name = screenerItem.name
            oneMonthAgoClose = screenerItem.oneMonthAgoClose
            oneMonthAgoOpen = screenerItem.oneMonthAgoOpen
            oneMonthChangePct = screenerItem.oneMonthChangePct
            oneWeekAgoClose = screenerItem.oneWeekAgoClose
            oneWeekAgoOpen = screenerItem.oneWeekAgoOpen
            oneWeekChangePct = screenerItem.oneWeekChangePct
            oneYearAgoClose = screenerItem.oneYearAgoClose
            oneYearAgoOpen = screenerItem.oneYearAgoOpen
            oneYearChangePct = screenerItem.oneYearChangePct
            percentChange = screenerItem.percentChange
            prevDayClose = screenerItem.prevDayClose
            priceToEarningsTtm = screenerItem.priceToEarningsTtm
            sector = screenerItem.sector
            sixMonthChangePct = screenerItem.sixMonthChangePct
            sixMonthsAgoClose = screenerItem.sixMonthsAgoClose
            sixMonthsAgoOpen = screenerItem.sixMonthsAgoOpen
            threeMonthChangePct = screenerItem.threeMonthChangePct
            threeMonthsAgoClose = screenerItem.threeMonthsAgoClose
            threeMonthsAgoOpen = screenerItem.threeMonthsAgoOpen
            volume = screenerItem.volume
            weekAvgVolume = screenerItem.weekAvgVolume
            yearToDateOpen = screenerItem.yearToDateOpen
            ytdChangePct = screenerItem.ytdChangePct
            additionalProperties = screenerItem.additionalProperties.toMutableMap()
        }

        /**
         * The OEMS instrument ID (`instrument.instruments.id`). Always present regardless of
         * `field_filter`.
         */
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

        /** The latest price for the instrument */
        fun price(price: String) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<String>) = apply { this.price = price }

        /** The identifier for the instrument */
        fun securityId(securityId: String) = securityId(JsonField.of(securityId))

        /**
         * Sets [Builder.securityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun securityId(securityId: JsonField<String>) = apply { this.securityId = securityId }

        /** The source of the security identifier */
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

        /** The trading symbol for the instrument */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** The total count of analyst ratings */
        fun totalRatings(totalRatings: Int) = totalRatings(JsonField.of(totalRatings))

        /**
         * Sets [Builder.totalRatings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRatings] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalRatings(totalRatings: JsonField<Int>) = apply { this.totalRatings = totalRatings }

        /** The consensus analyst price target */
        fun consensusPriceTarget(consensusPriceTarget: String?) =
            consensusPriceTarget(JsonField.ofNullable(consensusPriceTarget))

        /**
         * Alias for calling [Builder.consensusPriceTarget] with
         * `consensusPriceTarget.orElse(null)`.
         */
        fun consensusPriceTarget(consensusPriceTarget: Optional<String>) =
            consensusPriceTarget(consensusPriceTarget.getOrNull())

        /**
         * Sets [Builder.consensusPriceTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consensusPriceTarget] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun consensusPriceTarget(consensusPriceTarget: JsonField<String>) = apply {
            this.consensusPriceTarget = consensusPriceTarget
        }

        /** The consensus analyst rating */
        fun consensusRating(consensusRating: AnalystRating?) =
            consensusRating(JsonField.ofNullable(consensusRating))

        /** Alias for calling [Builder.consensusRating] with `consensusRating.orElse(null)`. */
        fun consensusRating(consensusRating: Optional<AnalystRating>) =
            consensusRating(consensusRating.getOrNull())

        /**
         * Sets [Builder.consensusRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consensusRating] with a well-typed [AnalystRating] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun consensusRating(consensusRating: JsonField<AnalystRating>) = apply {
            this.consensusRating = consensusRating
        }

        /** The ISO country code of the instrument's issue */
        fun countryOfIssue(countryOfIssue: String?) =
            countryOfIssue(JsonField.ofNullable(countryOfIssue))

        /** Alias for calling [Builder.countryOfIssue] with `countryOfIssue.orElse(null)`. */
        fun countryOfIssue(countryOfIssue: Optional<String>) =
            countryOfIssue(countryOfIssue.getOrNull())

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

        /** The TTM debt-to-equity ratio */
        fun debtToEquityTtm(debtToEquityTtm: String?) =
            debtToEquityTtm(JsonField.ofNullable(debtToEquityTtm))

        /** Alias for calling [Builder.debtToEquityTtm] with `debtToEquityTtm.orElse(null)`. */
        fun debtToEquityTtm(debtToEquityTtm: Optional<String>) =
            debtToEquityTtm(debtToEquityTtm.getOrNull())

        /**
         * Sets [Builder.debtToEquityTtm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtToEquityTtm] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtToEquityTtm(debtToEquityTtm: JsonField<String>) = apply {
            this.debtToEquityTtm = debtToEquityTtm
        }

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

        /** The TTM dividend yield percent */
        fun dividendYieldTtm(dividendYieldTtm: String?) =
            dividendYieldTtm(JsonField.ofNullable(dividendYieldTtm))

        /** Alias for calling [Builder.dividendYieldTtm] with `dividendYieldTtm.orElse(null)`. */
        fun dividendYieldTtm(dividendYieldTtm: Optional<String>) =
            dividendYieldTtm(dividendYieldTtm.getOrNull())

        /**
         * Sets [Builder.dividendYieldTtm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividendYieldTtm] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dividendYieldTtm(dividendYieldTtm: JsonField<String>) = apply {
            this.dividendYieldTtm = dividendYieldTtm
        }

        /** The TTM earnings per share */
        fun earningsPerShareTtm(earningsPerShareTtm: String?) =
            earningsPerShareTtm(JsonField.ofNullable(earningsPerShareTtm))

        /**
         * Alias for calling [Builder.earningsPerShareTtm] with `earningsPerShareTtm.orElse(null)`.
         */
        fun earningsPerShareTtm(earningsPerShareTtm: Optional<String>) =
            earningsPerShareTtm(earningsPerShareTtm.getOrNull())

        /**
         * Sets [Builder.earningsPerShareTtm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earningsPerShareTtm] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun earningsPerShareTtm(earningsPerShareTtm: JsonField<String>) = apply {
            this.earningsPerShareTtm = earningsPerShareTtm
        }

        /** The MIC code of the primary listing exchange */
        fun exchange(exchange: String?) = exchange(JsonField.ofNullable(exchange))

        /** Alias for calling [Builder.exchange] with `exchange.orElse(null)`. */
        fun exchange(exchange: Optional<String>) = exchange(exchange.getOrNull())

        /**
         * Sets [Builder.exchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exchange] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exchange(exchange: JsonField<String>) = apply { this.exchange = exchange }

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

        /** Percent gap from 52-week high to previous day close (negative = below high) */
        fun gapFrom52wHighPct(gapFrom52wHighPct: String?) =
            gapFrom52wHighPct(JsonField.ofNullable(gapFrom52wHighPct))

        /** Alias for calling [Builder.gapFrom52wHighPct] with `gapFrom52wHighPct.orElse(null)`. */
        fun gapFrom52wHighPct(gapFrom52wHighPct: Optional<String>) =
            gapFrom52wHighPct(gapFrom52wHighPct.getOrNull())

        /**
         * Sets [Builder.gapFrom52wHighPct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gapFrom52wHighPct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gapFrom52wHighPct(gapFrom52wHighPct: JsonField<String>) = apply {
            this.gapFrom52wHighPct = gapFrom52wHighPct
        }

        /** Percent gap from 52-week low to previous day close (positive = above low) */
        fun gapFrom52wLowPct(gapFrom52wLowPct: String?) =
            gapFrom52wLowPct(JsonField.ofNullable(gapFrom52wLowPct))

        /** Alias for calling [Builder.gapFrom52wLowPct] with `gapFrom52wLowPct.orElse(null)`. */
        fun gapFrom52wLowPct(gapFrom52wLowPct: Optional<String>) =
            gapFrom52wLowPct(gapFrom52wLowPct.getOrNull())

        /**
         * Sets [Builder.gapFrom52wLowPct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gapFrom52wLowPct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gapFrom52wLowPct(gapFrom52wLowPct: JsonField<String>) = apply {
            this.gapFrom52wLowPct = gapFrom52wLowPct
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

        /** The type of instrument */
        fun instrumentType(instrumentType: String?) =
            instrumentType(JsonField.ofNullable(instrumentType))

        /** Alias for calling [Builder.instrumentType] with `instrumentType.orElse(null)`. */
        fun instrumentType(instrumentType: Optional<String>) =
            instrumentType(instrumentType.getOrNull())

        /**
         * Sets [Builder.instrumentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instrumentType(instrumentType: JsonField<String>) = apply {
            this.instrumentType = instrumentType
        }

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

        /** The average trading volume over the past month */
        fun monthAvgVolume(monthAvgVolume: String?) =
            monthAvgVolume(JsonField.ofNullable(monthAvgVolume))

        /** Alias for calling [Builder.monthAvgVolume] with `monthAvgVolume.orElse(null)`. */
        fun monthAvgVolume(monthAvgVolume: Optional<String>) =
            monthAvgVolume(monthAvgVolume.getOrNull())

        /**
         * Sets [Builder.monthAvgVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthAvgVolume] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun monthAvgVolume(monthAvgVolume: JsonField<String>) = apply {
            this.monthAvgVolume = monthAvgVolume
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

        /** The closing price approximately one month ago */
        fun oneMonthAgoClose(oneMonthAgoClose: String?) =
            oneMonthAgoClose(JsonField.ofNullable(oneMonthAgoClose))

        /** Alias for calling [Builder.oneMonthAgoClose] with `oneMonthAgoClose.orElse(null)`. */
        fun oneMonthAgoClose(oneMonthAgoClose: Optional<String>) =
            oneMonthAgoClose(oneMonthAgoClose.getOrNull())

        /**
         * Sets [Builder.oneMonthAgoClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneMonthAgoClose] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneMonthAgoClose(oneMonthAgoClose: JsonField<String>) = apply {
            this.oneMonthAgoClose = oneMonthAgoClose
        }

        /** The opening price approximately one month ago */
        fun oneMonthAgoOpen(oneMonthAgoOpen: String?) =
            oneMonthAgoOpen(JsonField.ofNullable(oneMonthAgoOpen))

        /** Alias for calling [Builder.oneMonthAgoOpen] with `oneMonthAgoOpen.orElse(null)`. */
        fun oneMonthAgoOpen(oneMonthAgoOpen: Optional<String>) =
            oneMonthAgoOpen(oneMonthAgoOpen.getOrNull())

        /**
         * Sets [Builder.oneMonthAgoOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneMonthAgoOpen] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneMonthAgoOpen(oneMonthAgoOpen: JsonField<String>) = apply {
            this.oneMonthAgoOpen = oneMonthAgoOpen
        }

        /** Percent change from one month ago close to previous day close */
        fun oneMonthChangePct(oneMonthChangePct: String?) =
            oneMonthChangePct(JsonField.ofNullable(oneMonthChangePct))

        /** Alias for calling [Builder.oneMonthChangePct] with `oneMonthChangePct.orElse(null)`. */
        fun oneMonthChangePct(oneMonthChangePct: Optional<String>) =
            oneMonthChangePct(oneMonthChangePct.getOrNull())

        /**
         * Sets [Builder.oneMonthChangePct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneMonthChangePct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneMonthChangePct(oneMonthChangePct: JsonField<String>) = apply {
            this.oneMonthChangePct = oneMonthChangePct
        }

        /** The closing price approximately one week ago */
        fun oneWeekAgoClose(oneWeekAgoClose: String?) =
            oneWeekAgoClose(JsonField.ofNullable(oneWeekAgoClose))

        /** Alias for calling [Builder.oneWeekAgoClose] with `oneWeekAgoClose.orElse(null)`. */
        fun oneWeekAgoClose(oneWeekAgoClose: Optional<String>) =
            oneWeekAgoClose(oneWeekAgoClose.getOrNull())

        /**
         * Sets [Builder.oneWeekAgoClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneWeekAgoClose] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneWeekAgoClose(oneWeekAgoClose: JsonField<String>) = apply {
            this.oneWeekAgoClose = oneWeekAgoClose
        }

        /** The opening price approximately one week ago */
        fun oneWeekAgoOpen(oneWeekAgoOpen: String?) =
            oneWeekAgoOpen(JsonField.ofNullable(oneWeekAgoOpen))

        /** Alias for calling [Builder.oneWeekAgoOpen] with `oneWeekAgoOpen.orElse(null)`. */
        fun oneWeekAgoOpen(oneWeekAgoOpen: Optional<String>) =
            oneWeekAgoOpen(oneWeekAgoOpen.getOrNull())

        /**
         * Sets [Builder.oneWeekAgoOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneWeekAgoOpen] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneWeekAgoOpen(oneWeekAgoOpen: JsonField<String>) = apply {
            this.oneWeekAgoOpen = oneWeekAgoOpen
        }

        /** Percent change from one week ago close to previous day close */
        fun oneWeekChangePct(oneWeekChangePct: String?) =
            oneWeekChangePct(JsonField.ofNullable(oneWeekChangePct))

        /** Alias for calling [Builder.oneWeekChangePct] with `oneWeekChangePct.orElse(null)`. */
        fun oneWeekChangePct(oneWeekChangePct: Optional<String>) =
            oneWeekChangePct(oneWeekChangePct.getOrNull())

        /**
         * Sets [Builder.oneWeekChangePct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneWeekChangePct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneWeekChangePct(oneWeekChangePct: JsonField<String>) = apply {
            this.oneWeekChangePct = oneWeekChangePct
        }

        /** The closing price approximately one year ago */
        fun oneYearAgoClose(oneYearAgoClose: String?) =
            oneYearAgoClose(JsonField.ofNullable(oneYearAgoClose))

        /** Alias for calling [Builder.oneYearAgoClose] with `oneYearAgoClose.orElse(null)`. */
        fun oneYearAgoClose(oneYearAgoClose: Optional<String>) =
            oneYearAgoClose(oneYearAgoClose.getOrNull())

        /**
         * Sets [Builder.oneYearAgoClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneYearAgoClose] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneYearAgoClose(oneYearAgoClose: JsonField<String>) = apply {
            this.oneYearAgoClose = oneYearAgoClose
        }

        /** The opening price approximately one year ago */
        fun oneYearAgoOpen(oneYearAgoOpen: String?) =
            oneYearAgoOpen(JsonField.ofNullable(oneYearAgoOpen))

        /** Alias for calling [Builder.oneYearAgoOpen] with `oneYearAgoOpen.orElse(null)`. */
        fun oneYearAgoOpen(oneYearAgoOpen: Optional<String>) =
            oneYearAgoOpen(oneYearAgoOpen.getOrNull())

        /**
         * Sets [Builder.oneYearAgoOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneYearAgoOpen] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneYearAgoOpen(oneYearAgoOpen: JsonField<String>) = apply {
            this.oneYearAgoOpen = oneYearAgoOpen
        }

        /** Percent change from one year ago close to previous day close */
        fun oneYearChangePct(oneYearChangePct: String?) =
            oneYearChangePct(JsonField.ofNullable(oneYearChangePct))

        /** Alias for calling [Builder.oneYearChangePct] with `oneYearChangePct.orElse(null)`. */
        fun oneYearChangePct(oneYearChangePct: Optional<String>) =
            oneYearChangePct(oneYearChangePct.getOrNull())

        /**
         * Sets [Builder.oneYearChangePct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneYearChangePct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oneYearChangePct(oneYearChangePct: JsonField<String>) = apply {
            this.oneYearChangePct = oneYearChangePct
        }

        /** The percent change from previous close to current price */
        fun percentChange(percentChange: String?) =
            percentChange(JsonField.ofNullable(percentChange))

        /** Alias for calling [Builder.percentChange] with `percentChange.orElse(null)`. */
        fun percentChange(percentChange: Optional<String>) =
            percentChange(percentChange.getOrNull())

        /**
         * Sets [Builder.percentChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentChange] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun percentChange(percentChange: JsonField<String>) = apply {
            this.percentChange = percentChange
        }

        /** The previous day's closing price */
        fun prevDayClose(prevDayClose: String?) = prevDayClose(JsonField.ofNullable(prevDayClose))

        /** Alias for calling [Builder.prevDayClose] with `prevDayClose.orElse(null)`. */
        fun prevDayClose(prevDayClose: Optional<String>) = prevDayClose(prevDayClose.getOrNull())

        /**
         * Sets [Builder.prevDayClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prevDayClose] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prevDayClose(prevDayClose: JsonField<String>) = apply {
            this.prevDayClose = prevDayClose
        }

        /** The TTM price-to-earnings ratio */
        fun priceToEarningsTtm(priceToEarningsTtm: String?) =
            priceToEarningsTtm(JsonField.ofNullable(priceToEarningsTtm))

        /**
         * Alias for calling [Builder.priceToEarningsTtm] with `priceToEarningsTtm.orElse(null)`.
         */
        fun priceToEarningsTtm(priceToEarningsTtm: Optional<String>) =
            priceToEarningsTtm(priceToEarningsTtm.getOrNull())

        /**
         * Sets [Builder.priceToEarningsTtm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceToEarningsTtm] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priceToEarningsTtm(priceToEarningsTtm: JsonField<String>) = apply {
            this.priceToEarningsTtm = priceToEarningsTtm
        }

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

        /** Percent change from six months ago close to previous day close */
        fun sixMonthChangePct(sixMonthChangePct: String?) =
            sixMonthChangePct(JsonField.ofNullable(sixMonthChangePct))

        /** Alias for calling [Builder.sixMonthChangePct] with `sixMonthChangePct.orElse(null)`. */
        fun sixMonthChangePct(sixMonthChangePct: Optional<String>) =
            sixMonthChangePct(sixMonthChangePct.getOrNull())

        /**
         * Sets [Builder.sixMonthChangePct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sixMonthChangePct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sixMonthChangePct(sixMonthChangePct: JsonField<String>) = apply {
            this.sixMonthChangePct = sixMonthChangePct
        }

        /** The closing price approximately six months ago */
        fun sixMonthsAgoClose(sixMonthsAgoClose: String?) =
            sixMonthsAgoClose(JsonField.ofNullable(sixMonthsAgoClose))

        /** Alias for calling [Builder.sixMonthsAgoClose] with `sixMonthsAgoClose.orElse(null)`. */
        fun sixMonthsAgoClose(sixMonthsAgoClose: Optional<String>) =
            sixMonthsAgoClose(sixMonthsAgoClose.getOrNull())

        /**
         * Sets [Builder.sixMonthsAgoClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sixMonthsAgoClose] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sixMonthsAgoClose(sixMonthsAgoClose: JsonField<String>) = apply {
            this.sixMonthsAgoClose = sixMonthsAgoClose
        }

        /** The opening price approximately six months ago */
        fun sixMonthsAgoOpen(sixMonthsAgoOpen: String?) =
            sixMonthsAgoOpen(JsonField.ofNullable(sixMonthsAgoOpen))

        /** Alias for calling [Builder.sixMonthsAgoOpen] with `sixMonthsAgoOpen.orElse(null)`. */
        fun sixMonthsAgoOpen(sixMonthsAgoOpen: Optional<String>) =
            sixMonthsAgoOpen(sixMonthsAgoOpen.getOrNull())

        /**
         * Sets [Builder.sixMonthsAgoOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sixMonthsAgoOpen] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sixMonthsAgoOpen(sixMonthsAgoOpen: JsonField<String>) = apply {
            this.sixMonthsAgoOpen = sixMonthsAgoOpen
        }

        /** Percent change from three months ago close to previous day close */
        fun threeMonthChangePct(threeMonthChangePct: String?) =
            threeMonthChangePct(JsonField.ofNullable(threeMonthChangePct))

        /**
         * Alias for calling [Builder.threeMonthChangePct] with `threeMonthChangePct.orElse(null)`.
         */
        fun threeMonthChangePct(threeMonthChangePct: Optional<String>) =
            threeMonthChangePct(threeMonthChangePct.getOrNull())

        /**
         * Sets [Builder.threeMonthChangePct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeMonthChangePct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun threeMonthChangePct(threeMonthChangePct: JsonField<String>) = apply {
            this.threeMonthChangePct = threeMonthChangePct
        }

        /** The closing price approximately three months ago */
        fun threeMonthsAgoClose(threeMonthsAgoClose: String?) =
            threeMonthsAgoClose(JsonField.ofNullable(threeMonthsAgoClose))

        /**
         * Alias for calling [Builder.threeMonthsAgoClose] with `threeMonthsAgoClose.orElse(null)`.
         */
        fun threeMonthsAgoClose(threeMonthsAgoClose: Optional<String>) =
            threeMonthsAgoClose(threeMonthsAgoClose.getOrNull())

        /**
         * Sets [Builder.threeMonthsAgoClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeMonthsAgoClose] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun threeMonthsAgoClose(threeMonthsAgoClose: JsonField<String>) = apply {
            this.threeMonthsAgoClose = threeMonthsAgoClose
        }

        /** The opening price approximately three months ago */
        fun threeMonthsAgoOpen(threeMonthsAgoOpen: String?) =
            threeMonthsAgoOpen(JsonField.ofNullable(threeMonthsAgoOpen))

        /**
         * Alias for calling [Builder.threeMonthsAgoOpen] with `threeMonthsAgoOpen.orElse(null)`.
         */
        fun threeMonthsAgoOpen(threeMonthsAgoOpen: Optional<String>) =
            threeMonthsAgoOpen(threeMonthsAgoOpen.getOrNull())

        /**
         * Sets [Builder.threeMonthsAgoOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeMonthsAgoOpen] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun threeMonthsAgoOpen(threeMonthsAgoOpen: JsonField<String>) = apply {
            this.threeMonthsAgoOpen = threeMonthsAgoOpen
        }

        /** The latest trading volume for the instrument */
        fun volume(volume: String?) = volume(JsonField.ofNullable(volume))

        /** Alias for calling [Builder.volume] with `volume.orElse(null)`. */
        fun volume(volume: Optional<String>) = volume(volume.getOrNull())

        /**
         * Sets [Builder.volume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.volume] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun volume(volume: JsonField<String>) = apply { this.volume = volume }

        /** The average trading volume over the past week */
        fun weekAvgVolume(weekAvgVolume: String?) =
            weekAvgVolume(JsonField.ofNullable(weekAvgVolume))

        /** Alias for calling [Builder.weekAvgVolume] with `weekAvgVolume.orElse(null)`. */
        fun weekAvgVolume(weekAvgVolume: Optional<String>) =
            weekAvgVolume(weekAvgVolume.getOrNull())

        /**
         * Sets [Builder.weekAvgVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weekAvgVolume] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun weekAvgVolume(weekAvgVolume: JsonField<String>) = apply {
            this.weekAvgVolume = weekAvgVolume
        }

        /** The opening price on the first trading day of the current year */
        fun yearToDateOpen(yearToDateOpen: String?) =
            yearToDateOpen(JsonField.ofNullable(yearToDateOpen))

        /** Alias for calling [Builder.yearToDateOpen] with `yearToDateOpen.orElse(null)`. */
        fun yearToDateOpen(yearToDateOpen: Optional<String>) =
            yearToDateOpen(yearToDateOpen.getOrNull())

        /**
         * Sets [Builder.yearToDateOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yearToDateOpen] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun yearToDateOpen(yearToDateOpen: JsonField<String>) = apply {
            this.yearToDateOpen = yearToDateOpen
        }

        /** Percent change from year-to-date open to previous day close */
        fun ytdChangePct(ytdChangePct: String?) = ytdChangePct(JsonField.ofNullable(ytdChangePct))

        /** Alias for calling [Builder.ytdChangePct] with `ytdChangePct.orElse(null)`. */
        fun ytdChangePct(ytdChangePct: Optional<String>) = ytdChangePct(ytdChangePct.getOrNull())

        /**
         * Sets [Builder.ytdChangePct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ytdChangePct] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ytdChangePct(ytdChangePct: JsonField<String>) = apply {
            this.ytdChangePct = ytdChangePct
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
         * Returns an immutable instance of [ScreenerItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instrumentId()
         * .price()
         * .securityId()
         * .securityIdSource()
         * .symbol()
         * .totalRatings()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScreenerItem =
            ScreenerItem(
                checkRequired("instrumentId", instrumentId),
                checkRequired("price", price),
                checkRequired("securityId", securityId),
                checkRequired("securityIdSource", securityIdSource),
                checkRequired("symbol", symbol),
                checkRequired("totalRatings", totalRatings),
                consensusPriceTarget,
                consensusRating,
                countryOfIssue,
                debtToEquityTtm,
                description,
                dividendYieldTtm,
                earningsPerShareTtm,
                exchange,
                fiftyTwoWeekHigh,
                fiftyTwoWeekLow,
                gapFrom52wHighPct,
                gapFrom52wLowPct,
                industry,
                instrumentType,
                listDate,
                marketCap,
                monthAvgVolume,
                name,
                oneMonthAgoClose,
                oneMonthAgoOpen,
                oneMonthChangePct,
                oneWeekAgoClose,
                oneWeekAgoOpen,
                oneWeekChangePct,
                oneYearAgoClose,
                oneYearAgoOpen,
                oneYearChangePct,
                percentChange,
                prevDayClose,
                priceToEarningsTtm,
                sector,
                sixMonthChangePct,
                sixMonthsAgoClose,
                sixMonthsAgoOpen,
                threeMonthChangePct,
                threeMonthsAgoClose,
                threeMonthsAgoOpen,
                volume,
                weekAvgVolume,
                yearToDateOpen,
                ytdChangePct,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScreenerItem = apply {
        if (validated) {
            return@apply
        }

        instrumentId()
        price()
        securityId()
        securityIdSource().validate()
        symbol()
        totalRatings()
        consensusPriceTarget()
        consensusRating().ifPresent { it.validate() }
        countryOfIssue()
        debtToEquityTtm()
        description()
        dividendYieldTtm()
        earningsPerShareTtm()
        exchange()
        fiftyTwoWeekHigh()
        fiftyTwoWeekLow()
        gapFrom52wHighPct()
        gapFrom52wLowPct()
        industry()
        instrumentType()
        listDate()
        marketCap()
        monthAvgVolume()
        name()
        oneMonthAgoClose()
        oneMonthAgoOpen()
        oneMonthChangePct()
        oneWeekAgoClose()
        oneWeekAgoOpen()
        oneWeekChangePct()
        oneYearAgoClose()
        oneYearAgoOpen()
        oneYearChangePct()
        percentChange()
        prevDayClose()
        priceToEarningsTtm()
        sector()
        sixMonthChangePct()
        sixMonthsAgoClose()
        sixMonthsAgoOpen()
        threeMonthChangePct()
        threeMonthsAgoClose()
        threeMonthsAgoOpen()
        volume()
        weekAvgVolume()
        yearToDateOpen()
        ytdChangePct()
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
            (if (price.asKnown().isPresent) 1 else 0) +
            (if (securityId.asKnown().isPresent) 1 else 0) +
            (securityIdSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (totalRatings.asKnown().isPresent) 1 else 0) +
            (if (consensusPriceTarget.asKnown().isPresent) 1 else 0) +
            (consensusRating.asKnown().getOrNull()?.validity() ?: 0) +
            (if (countryOfIssue.asKnown().isPresent) 1 else 0) +
            (if (debtToEquityTtm.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dividendYieldTtm.asKnown().isPresent) 1 else 0) +
            (if (earningsPerShareTtm.asKnown().isPresent) 1 else 0) +
            (if (exchange.asKnown().isPresent) 1 else 0) +
            (if (fiftyTwoWeekHigh.asKnown().isPresent) 1 else 0) +
            (if (fiftyTwoWeekLow.asKnown().isPresent) 1 else 0) +
            (if (gapFrom52wHighPct.asKnown().isPresent) 1 else 0) +
            (if (gapFrom52wLowPct.asKnown().isPresent) 1 else 0) +
            (if (industry.asKnown().isPresent) 1 else 0) +
            (if (instrumentType.asKnown().isPresent) 1 else 0) +
            (if (listDate.asKnown().isPresent) 1 else 0) +
            (if (marketCap.asKnown().isPresent) 1 else 0) +
            (if (monthAvgVolume.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (oneMonthAgoClose.asKnown().isPresent) 1 else 0) +
            (if (oneMonthAgoOpen.asKnown().isPresent) 1 else 0) +
            (if (oneMonthChangePct.asKnown().isPresent) 1 else 0) +
            (if (oneWeekAgoClose.asKnown().isPresent) 1 else 0) +
            (if (oneWeekAgoOpen.asKnown().isPresent) 1 else 0) +
            (if (oneWeekChangePct.asKnown().isPresent) 1 else 0) +
            (if (oneYearAgoClose.asKnown().isPresent) 1 else 0) +
            (if (oneYearAgoOpen.asKnown().isPresent) 1 else 0) +
            (if (oneYearChangePct.asKnown().isPresent) 1 else 0) +
            (if (percentChange.asKnown().isPresent) 1 else 0) +
            (if (prevDayClose.asKnown().isPresent) 1 else 0) +
            (if (priceToEarningsTtm.asKnown().isPresent) 1 else 0) +
            (if (sector.asKnown().isPresent) 1 else 0) +
            (if (sixMonthChangePct.asKnown().isPresent) 1 else 0) +
            (if (sixMonthsAgoClose.asKnown().isPresent) 1 else 0) +
            (if (sixMonthsAgoOpen.asKnown().isPresent) 1 else 0) +
            (if (threeMonthChangePct.asKnown().isPresent) 1 else 0) +
            (if (threeMonthsAgoClose.asKnown().isPresent) 1 else 0) +
            (if (threeMonthsAgoOpen.asKnown().isPresent) 1 else 0) +
            (if (volume.asKnown().isPresent) 1 else 0) +
            (if (weekAvgVolume.asKnown().isPresent) 1 else 0) +
            (if (yearToDateOpen.asKnown().isPresent) 1 else 0) +
            (if (ytdChangePct.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScreenerItem &&
            instrumentId == other.instrumentId &&
            price == other.price &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            symbol == other.symbol &&
            totalRatings == other.totalRatings &&
            consensusPriceTarget == other.consensusPriceTarget &&
            consensusRating == other.consensusRating &&
            countryOfIssue == other.countryOfIssue &&
            debtToEquityTtm == other.debtToEquityTtm &&
            description == other.description &&
            dividendYieldTtm == other.dividendYieldTtm &&
            earningsPerShareTtm == other.earningsPerShareTtm &&
            exchange == other.exchange &&
            fiftyTwoWeekHigh == other.fiftyTwoWeekHigh &&
            fiftyTwoWeekLow == other.fiftyTwoWeekLow &&
            gapFrom52wHighPct == other.gapFrom52wHighPct &&
            gapFrom52wLowPct == other.gapFrom52wLowPct &&
            industry == other.industry &&
            instrumentType == other.instrumentType &&
            listDate == other.listDate &&
            marketCap == other.marketCap &&
            monthAvgVolume == other.monthAvgVolume &&
            name == other.name &&
            oneMonthAgoClose == other.oneMonthAgoClose &&
            oneMonthAgoOpen == other.oneMonthAgoOpen &&
            oneMonthChangePct == other.oneMonthChangePct &&
            oneWeekAgoClose == other.oneWeekAgoClose &&
            oneWeekAgoOpen == other.oneWeekAgoOpen &&
            oneWeekChangePct == other.oneWeekChangePct &&
            oneYearAgoClose == other.oneYearAgoClose &&
            oneYearAgoOpen == other.oneYearAgoOpen &&
            oneYearChangePct == other.oneYearChangePct &&
            percentChange == other.percentChange &&
            prevDayClose == other.prevDayClose &&
            priceToEarningsTtm == other.priceToEarningsTtm &&
            sector == other.sector &&
            sixMonthChangePct == other.sixMonthChangePct &&
            sixMonthsAgoClose == other.sixMonthsAgoClose &&
            sixMonthsAgoOpen == other.sixMonthsAgoOpen &&
            threeMonthChangePct == other.threeMonthChangePct &&
            threeMonthsAgoClose == other.threeMonthsAgoClose &&
            threeMonthsAgoOpen == other.threeMonthsAgoOpen &&
            volume == other.volume &&
            weekAvgVolume == other.weekAvgVolume &&
            yearToDateOpen == other.yearToDateOpen &&
            ytdChangePct == other.ytdChangePct &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            instrumentId,
            price,
            securityId,
            securityIdSource,
            symbol,
            totalRatings,
            consensusPriceTarget,
            consensusRating,
            countryOfIssue,
            debtToEquityTtm,
            description,
            dividendYieldTtm,
            earningsPerShareTtm,
            exchange,
            fiftyTwoWeekHigh,
            fiftyTwoWeekLow,
            gapFrom52wHighPct,
            gapFrom52wLowPct,
            industry,
            instrumentType,
            listDate,
            marketCap,
            monthAvgVolume,
            name,
            oneMonthAgoClose,
            oneMonthAgoOpen,
            oneMonthChangePct,
            oneWeekAgoClose,
            oneWeekAgoOpen,
            oneWeekChangePct,
            oneYearAgoClose,
            oneYearAgoOpen,
            oneYearChangePct,
            percentChange,
            prevDayClose,
            priceToEarningsTtm,
            sector,
            sixMonthChangePct,
            sixMonthsAgoClose,
            sixMonthsAgoOpen,
            threeMonthChangePct,
            threeMonthsAgoClose,
            threeMonthsAgoOpen,
            volume,
            weekAvgVolume,
            yearToDateOpen,
            ytdChangePct,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScreenerItem{instrumentId=$instrumentId, price=$price, securityId=$securityId, securityIdSource=$securityIdSource, symbol=$symbol, totalRatings=$totalRatings, consensusPriceTarget=$consensusPriceTarget, consensusRating=$consensusRating, countryOfIssue=$countryOfIssue, debtToEquityTtm=$debtToEquityTtm, description=$description, dividendYieldTtm=$dividendYieldTtm, earningsPerShareTtm=$earningsPerShareTtm, exchange=$exchange, fiftyTwoWeekHigh=$fiftyTwoWeekHigh, fiftyTwoWeekLow=$fiftyTwoWeekLow, gapFrom52wHighPct=$gapFrom52wHighPct, gapFrom52wLowPct=$gapFrom52wLowPct, industry=$industry, instrumentType=$instrumentType, listDate=$listDate, marketCap=$marketCap, monthAvgVolume=$monthAvgVolume, name=$name, oneMonthAgoClose=$oneMonthAgoClose, oneMonthAgoOpen=$oneMonthAgoOpen, oneMonthChangePct=$oneMonthChangePct, oneWeekAgoClose=$oneWeekAgoClose, oneWeekAgoOpen=$oneWeekAgoOpen, oneWeekChangePct=$oneWeekChangePct, oneYearAgoClose=$oneYearAgoClose, oneYearAgoOpen=$oneYearAgoOpen, oneYearChangePct=$oneYearChangePct, percentChange=$percentChange, prevDayClose=$prevDayClose, priceToEarningsTtm=$priceToEarningsTtm, sector=$sector, sixMonthChangePct=$sixMonthChangePct, sixMonthsAgoClose=$sixMonthsAgoClose, sixMonthsAgoOpen=$sixMonthsAgoOpen, threeMonthChangePct=$threeMonthChangePct, threeMonthsAgoClose=$threeMonthsAgoClose, threeMonthsAgoOpen=$threeMonthsAgoOpen, volume=$volume, weekAvgVolume=$weekAvgVolume, yearToDateOpen=$yearToDateOpen, ytdChangePct=$ytdChangePct, additionalProperties=$additionalProperties}"
}
