// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.markethours

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Comprehensive market hours information for a specific market and date */
class MarketHoursDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currentTime: JsonField<OffsetDateTime>,
    private val date: JsonField<LocalDate>,
    private val market: JsonField<MarketType>,
    private val marketName: JsonField<String>,
    private val nextSessions: JsonField<TradingSessions>,
    private val status: JsonField<MarketStatus>,
    private val timezone: JsonField<String>,
    private val todaySessions: JsonField<TradingSessions>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("current_time")
        @ExcludeMissing
        currentTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("market") @ExcludeMissing market: JsonField<MarketType> = JsonMissing.of(),
        @JsonProperty("market_name")
        @ExcludeMissing
        marketName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_sessions")
        @ExcludeMissing
        nextSessions: JsonField<TradingSessions> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<MarketStatus> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("today_sessions")
        @ExcludeMissing
        todaySessions: JsonField<TradingSessions> = JsonMissing.of(),
    ) : this(
        currentTime,
        date,
        market,
        marketName,
        nextSessions,
        status,
        timezone,
        todaySessions,
        mutableMapOf(),
    )

    /**
     * Current time in market timezone with offset
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentTime(): OffsetDateTime = currentTime.getRequired("current_time")

    /**
     * The date for which market hours are provided
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * Market type identifier
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun market(): MarketType = market.getRequired("market")

    /**
     * Human-readable market name
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun marketName(): String = marketName.getRequired("market_name")

    /**
     * Next trading day's session schedules (without time_until fields)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nextSessions(): TradingSessions = nextSessions.getRequired("next_sessions")

    /**
     * Market status information
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): MarketStatus = status.getRequired("status")

    /**
     * IANA timezone identifier for the market
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timezone(): String = timezone.getRequired("timezone")

    /**
     * Trading session schedules for the requested date with time_until fields
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun todaySessions(): TradingSessions = todaySessions.getRequired("today_sessions")

    /**
     * Returns the raw JSON value of [currentTime].
     *
     * Unlike [currentTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_time")
    @ExcludeMissing
    fun _currentTime(): JsonField<OffsetDateTime> = currentTime

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [market].
     *
     * Unlike [market], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market") @ExcludeMissing fun _market(): JsonField<MarketType> = market

    /**
     * Returns the raw JSON value of [marketName].
     *
     * Unlike [marketName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market_name") @ExcludeMissing fun _marketName(): JsonField<String> = marketName

    /**
     * Returns the raw JSON value of [nextSessions].
     *
     * Unlike [nextSessions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_sessions")
    @ExcludeMissing
    fun _nextSessions(): JsonField<TradingSessions> = nextSessions

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<MarketStatus> = status

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    /**
     * Returns the raw JSON value of [todaySessions].
     *
     * Unlike [todaySessions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("today_sessions")
    @ExcludeMissing
    fun _todaySessions(): JsonField<TradingSessions> = todaySessions

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
         * Returns a mutable builder for constructing an instance of [MarketHoursDetail].
         *
         * The following fields are required:
         * ```java
         * .currentTime()
         * .date()
         * .market()
         * .marketName()
         * .nextSessions()
         * .status()
         * .timezone()
         * .todaySessions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketHoursDetail]. */
    class Builder internal constructor() {

        private var currentTime: JsonField<OffsetDateTime>? = null
        private var date: JsonField<LocalDate>? = null
        private var market: JsonField<MarketType>? = null
        private var marketName: JsonField<String>? = null
        private var nextSessions: JsonField<TradingSessions>? = null
        private var status: JsonField<MarketStatus>? = null
        private var timezone: JsonField<String>? = null
        private var todaySessions: JsonField<TradingSessions>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketHoursDetail: MarketHoursDetail) = apply {
            currentTime = marketHoursDetail.currentTime
            date = marketHoursDetail.date
            market = marketHoursDetail.market
            marketName = marketHoursDetail.marketName
            nextSessions = marketHoursDetail.nextSessions
            status = marketHoursDetail.status
            timezone = marketHoursDetail.timezone
            todaySessions = marketHoursDetail.todaySessions
            additionalProperties = marketHoursDetail.additionalProperties.toMutableMap()
        }

        /** Current time in market timezone with offset */
        fun currentTime(currentTime: OffsetDateTime) = currentTime(JsonField.of(currentTime))

        /**
         * Sets [Builder.currentTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentTime(currentTime: JsonField<OffsetDateTime>) = apply {
            this.currentTime = currentTime
        }

        /** The date for which market hours are provided */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** Market type identifier */
        fun market(market: MarketType) = market(JsonField.of(market))

        /**
         * Sets [Builder.market] to an arbitrary JSON value.
         *
         * You should usually call [Builder.market] with a well-typed [MarketType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun market(market: JsonField<MarketType>) = apply { this.market = market }

        /** Human-readable market name */
        fun marketName(marketName: String) = marketName(JsonField.of(marketName))

        /**
         * Sets [Builder.marketName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun marketName(marketName: JsonField<String>) = apply { this.marketName = marketName }

        /** Next trading day's session schedules (without time_until fields) */
        fun nextSessions(nextSessions: TradingSessions) = nextSessions(JsonField.of(nextSessions))

        /**
         * Sets [Builder.nextSessions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextSessions] with a well-typed [TradingSessions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextSessions(nextSessions: JsonField<TradingSessions>) = apply {
            this.nextSessions = nextSessions
        }

        /** Market status information */
        fun status(status: MarketStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [MarketStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<MarketStatus>) = apply { this.status = status }

        /** IANA timezone identifier for the market */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        /** Trading session schedules for the requested date with time_until fields */
        fun todaySessions(todaySessions: TradingSessions) =
            todaySessions(JsonField.of(todaySessions))

        /**
         * Sets [Builder.todaySessions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.todaySessions] with a well-typed [TradingSessions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun todaySessions(todaySessions: JsonField<TradingSessions>) = apply {
            this.todaySessions = todaySessions
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
         * Returns an immutable instance of [MarketHoursDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .currentTime()
         * .date()
         * .market()
         * .marketName()
         * .nextSessions()
         * .status()
         * .timezone()
         * .todaySessions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketHoursDetail =
            MarketHoursDetail(
                checkRequired("currentTime", currentTime),
                checkRequired("date", date),
                checkRequired("market", market),
                checkRequired("marketName", marketName),
                checkRequired("nextSessions", nextSessions),
                checkRequired("status", status),
                checkRequired("timezone", timezone),
                checkRequired("todaySessions", todaySessions),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketHoursDetail = apply {
        if (validated) {
            return@apply
        }

        currentTime()
        date()
        market().validate()
        marketName()
        nextSessions().validate()
        status().validate()
        timezone()
        todaySessions().validate()
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
        (if (currentTime.asKnown().isPresent) 1 else 0) +
            (if (date.asKnown().isPresent) 1 else 0) +
            (market.asKnown().getOrNull()?.validity() ?: 0) +
            (if (marketName.asKnown().isPresent) 1 else 0) +
            (nextSessions.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0) +
            (todaySessions.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketHoursDetail &&
            currentTime == other.currentTime &&
            date == other.date &&
            market == other.market &&
            marketName == other.marketName &&
            nextSessions == other.nextSessions &&
            status == other.status &&
            timezone == other.timezone &&
            todaySessions == other.todaySessions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            currentTime,
            date,
            market,
            marketName,
            nextSessions,
            status,
            timezone,
            todaySessions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketHoursDetail{currentTime=$currentTime, date=$date, market=$market, marketName=$marketName, nextSessions=$nextSessions, status=$status, timezone=$timezone, todaySessions=$todaySessions, additionalProperties=$additionalProperties}"
}
