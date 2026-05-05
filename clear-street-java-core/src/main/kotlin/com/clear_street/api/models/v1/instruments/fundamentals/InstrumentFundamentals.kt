// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.fundamentals

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
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

/** Supplemental fundamentals and company profile data for an instrument. */
class InstrumentFundamentals
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val averageVolume: JsonField<Long>,
    private val beta: JsonField<String>,
    private val description: JsonField<String>,
    private val dividendYield: JsonField<String>,
    private val earningsPerShare: JsonField<String>,
    private val fiftyTwoWeekHigh: JsonField<String>,
    private val fiftyTwoWeekLow: JsonField<String>,
    private val industry: JsonField<String>,
    private val listDate: JsonField<LocalDate>,
    private val logoUrl: JsonField<String>,
    private val marketCap: JsonField<String>,
    private val previousClose: JsonField<String>,
    private val priceToEarnings: JsonField<String>,
    private val sector: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("average_volume")
        @ExcludeMissing
        averageVolume: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("beta") @ExcludeMissing beta: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("market_cap") @ExcludeMissing marketCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_close")
        @ExcludeMissing
        previousClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price_to_earnings")
        @ExcludeMissing
        priceToEarnings: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sector") @ExcludeMissing sector: JsonField<String> = JsonMissing.of(),
    ) : this(
        averageVolume,
        beta,
        description,
        dividendYield,
        earningsPerShare,
        fiftyTwoWeekHigh,
        fiftyTwoWeekLow,
        industry,
        listDate,
        logoUrl,
        marketCap,
        previousClose,
        priceToEarnings,
        sector,
        mutableMapOf(),
    )

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
     * The total market capitalization
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marketCap(): Optional<String> = marketCap.getOptional("market_cap")

    /**
     * The closing price from the previous trading day
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousClose(): Optional<String> = previousClose.getOptional("previous_close")

    /**
     * The price-to-earnings (P/E) ratio for the trailing twelve months (TTM)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceToEarnings(): Optional<String> = priceToEarnings.getOptional("price_to_earnings")

    /**
     * The business sector of the instrument's issuer
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sector(): Optional<String> = sector.getOptional("sector")

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
     * Returns the raw JSON value of [marketCap].
     *
     * Unlike [marketCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market_cap") @ExcludeMissing fun _marketCap(): JsonField<String> = marketCap

    /**
     * Returns the raw JSON value of [previousClose].
     *
     * Unlike [previousClose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_close")
    @ExcludeMissing
    fun _previousClose(): JsonField<String> = previousClose

    /**
     * Returns the raw JSON value of [priceToEarnings].
     *
     * Unlike [priceToEarnings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_to_earnings")
    @ExcludeMissing
    fun _priceToEarnings(): JsonField<String> = priceToEarnings

    /**
     * Returns the raw JSON value of [sector].
     *
     * Unlike [sector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sector") @ExcludeMissing fun _sector(): JsonField<String> = sector

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

        /** Returns a mutable builder for constructing an instance of [InstrumentFundamentals]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentFundamentals]. */
    class Builder internal constructor() {

        private var averageVolume: JsonField<Long> = JsonMissing.of()
        private var beta: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dividendYield: JsonField<String> = JsonMissing.of()
        private var earningsPerShare: JsonField<String> = JsonMissing.of()
        private var fiftyTwoWeekHigh: JsonField<String> = JsonMissing.of()
        private var fiftyTwoWeekLow: JsonField<String> = JsonMissing.of()
        private var industry: JsonField<String> = JsonMissing.of()
        private var listDate: JsonField<LocalDate> = JsonMissing.of()
        private var logoUrl: JsonField<String> = JsonMissing.of()
        private var marketCap: JsonField<String> = JsonMissing.of()
        private var previousClose: JsonField<String> = JsonMissing.of()
        private var priceToEarnings: JsonField<String> = JsonMissing.of()
        private var sector: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentFundamentals: InstrumentFundamentals) = apply {
            averageVolume = instrumentFundamentals.averageVolume
            beta = instrumentFundamentals.beta
            description = instrumentFundamentals.description
            dividendYield = instrumentFundamentals.dividendYield
            earningsPerShare = instrumentFundamentals.earningsPerShare
            fiftyTwoWeekHigh = instrumentFundamentals.fiftyTwoWeekHigh
            fiftyTwoWeekLow = instrumentFundamentals.fiftyTwoWeekLow
            industry = instrumentFundamentals.industry
            listDate = instrumentFundamentals.listDate
            logoUrl = instrumentFundamentals.logoUrl
            marketCap = instrumentFundamentals.marketCap
            previousClose = instrumentFundamentals.previousClose
            priceToEarnings = instrumentFundamentals.priceToEarnings
            sector = instrumentFundamentals.sector
            additionalProperties = instrumentFundamentals.additionalProperties.toMutableMap()
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

        /** The closing price from the previous trading day */
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
         * Returns an immutable instance of [InstrumentFundamentals].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentFundamentals =
            InstrumentFundamentals(
                averageVolume,
                beta,
                description,
                dividendYield,
                earningsPerShare,
                fiftyTwoWeekHigh,
                fiftyTwoWeekLow,
                industry,
                listDate,
                logoUrl,
                marketCap,
                previousClose,
                priceToEarnings,
                sector,
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
    fun validate(): InstrumentFundamentals = apply {
        if (validated) {
            return@apply
        }

        averageVolume()
        beta()
        description()
        dividendYield()
        earningsPerShare()
        fiftyTwoWeekHigh()
        fiftyTwoWeekLow()
        industry()
        listDate()
        logoUrl()
        marketCap()
        previousClose()
        priceToEarnings()
        sector()
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
        (if (averageVolume.asKnown().isPresent) 1 else 0) +
            (if (beta.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dividendYield.asKnown().isPresent) 1 else 0) +
            (if (earningsPerShare.asKnown().isPresent) 1 else 0) +
            (if (fiftyTwoWeekHigh.asKnown().isPresent) 1 else 0) +
            (if (fiftyTwoWeekLow.asKnown().isPresent) 1 else 0) +
            (if (industry.asKnown().isPresent) 1 else 0) +
            (if (listDate.asKnown().isPresent) 1 else 0) +
            (if (logoUrl.asKnown().isPresent) 1 else 0) +
            (if (marketCap.asKnown().isPresent) 1 else 0) +
            (if (previousClose.asKnown().isPresent) 1 else 0) +
            (if (priceToEarnings.asKnown().isPresent) 1 else 0) +
            (if (sector.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentFundamentals &&
            averageVolume == other.averageVolume &&
            beta == other.beta &&
            description == other.description &&
            dividendYield == other.dividendYield &&
            earningsPerShare == other.earningsPerShare &&
            fiftyTwoWeekHigh == other.fiftyTwoWeekHigh &&
            fiftyTwoWeekLow == other.fiftyTwoWeekLow &&
            industry == other.industry &&
            listDate == other.listDate &&
            logoUrl == other.logoUrl &&
            marketCap == other.marketCap &&
            previousClose == other.previousClose &&
            priceToEarnings == other.priceToEarnings &&
            sector == other.sector &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            averageVolume,
            beta,
            description,
            dividendYield,
            earningsPerShare,
            fiftyTwoWeekHigh,
            fiftyTwoWeekLow,
            industry,
            listDate,
            logoUrl,
            marketCap,
            previousClose,
            priceToEarnings,
            sector,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentFundamentals{averageVolume=$averageVolume, beta=$beta, description=$description, dividendYield=$dividendYield, earningsPerShare=$earningsPerShare, fiftyTwoWeekHigh=$fiftyTwoWeekHigh, fiftyTwoWeekLow=$fiftyTwoWeekLow, industry=$industry, listDate=$listDate, logoUrl=$logoUrl, marketCap=$marketCap, previousClose=$previousClose, priceToEarnings=$priceToEarnings, sector=$sector, additionalProperties=$additionalProperties}"
}
