// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.marketdata.dailysummary

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

/**
 * Daily aggregate (OHLV) summary for a single instrument.
 *
 * Returned by `GET /market-data/daily-summary`. Every field except `instrument_id` is `Option`:
 * - Unresolvable `instrument_id` → all other fields `None` (including `symbol`).
 * - Resolvable `instrument_id` with no realtime cache entry → `symbol` populated,
 *   OHLV/price/`quote_date` `None`.
 * - `quote_date` reflects the session the OHLV represents (today during trading hours, the last
 *   trading date during weekends/holidays).
 */
class DailySummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instrumentId: JsonField<String>,
    private val currentPrice: JsonField<String>,
    private val high: JsonField<String>,
    private val low: JsonField<String>,
    private val open: JsonField<String>,
    private val quoteDate: JsonField<LocalDate>,
    private val symbol: JsonField<String>,
    private val volume: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("current_price")
        @ExcludeMissing
        currentPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("high") @ExcludeMissing high: JsonField<String> = JsonMissing.of(),
        @JsonProperty("low") @ExcludeMissing low: JsonField<String> = JsonMissing.of(),
        @JsonProperty("open") @ExcludeMissing open: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quote_date")
        @ExcludeMissing
        quoteDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("volume") @ExcludeMissing volume: JsonField<Long> = JsonMissing.of(),
    ) : this(instrumentId, currentPrice, high, low, open, quoteDate, symbol, volume, mutableMapOf())

    /**
     * OEMS instrument identifier. Always populated; echoes the request ID.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Current market price.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentPrice(): Optional<String> = currentPrice.getOptional("current_price")

    /**
     * Session high.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun high(): Optional<String> = high.getOptional("high")

    /**
     * Session low.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun low(): Optional<String> = low.getOptional("low")

    /**
     * Opening price for the session.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun open(): Optional<String> = open.getOptional("open")

    /**
     * Session date the OHLV represents, US/Eastern.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quoteDate(): Optional<LocalDate> = quoteDate.getOptional("quote_date")

    /**
     * Display symbol for the security. `None` for unresolvable IDs.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): Optional<String> = symbol.getOptional("symbol")

    /**
     * Session cumulative trading volume.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun volume(): Optional<Long> = volume.getOptional("volume")

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [currentPrice].
     *
     * Unlike [currentPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_price")
    @ExcludeMissing
    fun _currentPrice(): JsonField<String> = currentPrice

    /**
     * Returns the raw JSON value of [high].
     *
     * Unlike [high], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("high") @ExcludeMissing fun _high(): JsonField<String> = high

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
     * Returns the raw JSON value of [quoteDate].
     *
     * Unlike [quoteDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quote_date") @ExcludeMissing fun _quoteDate(): JsonField<LocalDate> = quoteDate

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

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
         * Returns a mutable builder for constructing an instance of [DailySummary].
         *
         * The following fields are required:
         * ```java
         * .instrumentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DailySummary]. */
    class Builder internal constructor() {

        private var instrumentId: JsonField<String>? = null
        private var currentPrice: JsonField<String> = JsonMissing.of()
        private var high: JsonField<String> = JsonMissing.of()
        private var low: JsonField<String> = JsonMissing.of()
        private var open: JsonField<String> = JsonMissing.of()
        private var quoteDate: JsonField<LocalDate> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var volume: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dailySummary: DailySummary) = apply {
            instrumentId = dailySummary.instrumentId
            currentPrice = dailySummary.currentPrice
            high = dailySummary.high
            low = dailySummary.low
            open = dailySummary.open
            quoteDate = dailySummary.quoteDate
            symbol = dailySummary.symbol
            volume = dailySummary.volume
            additionalProperties = dailySummary.additionalProperties.toMutableMap()
        }

        /** OEMS instrument identifier. Always populated; echoes the request ID. */
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

        /** Current market price. */
        fun currentPrice(currentPrice: String?) = currentPrice(JsonField.ofNullable(currentPrice))

        /** Alias for calling [Builder.currentPrice] with `currentPrice.orElse(null)`. */
        fun currentPrice(currentPrice: Optional<String>) = currentPrice(currentPrice.getOrNull())

        /**
         * Sets [Builder.currentPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentPrice(currentPrice: JsonField<String>) = apply {
            this.currentPrice = currentPrice
        }

        /** Session high. */
        fun high(high: String?) = high(JsonField.ofNullable(high))

        /** Alias for calling [Builder.high] with `high.orElse(null)`. */
        fun high(high: Optional<String>) = high(high.getOrNull())

        /**
         * Sets [Builder.high] to an arbitrary JSON value.
         *
         * You should usually call [Builder.high] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun high(high: JsonField<String>) = apply { this.high = high }

        /** Session low. */
        fun low(low: String?) = low(JsonField.ofNullable(low))

        /** Alias for calling [Builder.low] with `low.orElse(null)`. */
        fun low(low: Optional<String>) = low(low.getOrNull())

        /**
         * Sets [Builder.low] to an arbitrary JSON value.
         *
         * You should usually call [Builder.low] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun low(low: JsonField<String>) = apply { this.low = low }

        /** Opening price for the session. */
        fun open(open: String?) = open(JsonField.ofNullable(open))

        /** Alias for calling [Builder.open] with `open.orElse(null)`. */
        fun open(open: Optional<String>) = open(open.getOrNull())

        /**
         * Sets [Builder.open] to an arbitrary JSON value.
         *
         * You should usually call [Builder.open] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun open(open: JsonField<String>) = apply { this.open = open }

        /** Session date the OHLV represents, US/Eastern. */
        fun quoteDate(quoteDate: LocalDate?) = quoteDate(JsonField.ofNullable(quoteDate))

        /** Alias for calling [Builder.quoteDate] with `quoteDate.orElse(null)`. */
        fun quoteDate(quoteDate: Optional<LocalDate>) = quoteDate(quoteDate.getOrNull())

        /**
         * Sets [Builder.quoteDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quoteDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun quoteDate(quoteDate: JsonField<LocalDate>) = apply { this.quoteDate = quoteDate }

        /** Display symbol for the security. `None` for unresolvable IDs. */
        fun symbol(symbol: String?) = symbol(JsonField.ofNullable(symbol))

        /** Alias for calling [Builder.symbol] with `symbol.orElse(null)`. */
        fun symbol(symbol: Optional<String>) = symbol(symbol.getOrNull())

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** Session cumulative trading volume. */
        fun volume(volume: Long?) = volume(JsonField.ofNullable(volume))

        /**
         * Alias for [Builder.volume].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun volume(volume: Long) = volume(volume as Long?)

        /** Alias for calling [Builder.volume] with `volume.orElse(null)`. */
        fun volume(volume: Optional<Long>) = volume(volume.getOrNull())

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
         * Returns an immutable instance of [DailySummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instrumentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DailySummary =
            DailySummary(
                checkRequired("instrumentId", instrumentId),
                currentPrice,
                high,
                low,
                open,
                quoteDate,
                symbol,
                volume,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DailySummary = apply {
        if (validated) {
            return@apply
        }

        instrumentId()
        currentPrice()
        high()
        low()
        open()
        quoteDate()
        symbol()
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
        (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (currentPrice.asKnown().isPresent) 1 else 0) +
            (if (high.asKnown().isPresent) 1 else 0) +
            (if (low.asKnown().isPresent) 1 else 0) +
            (if (open.asKnown().isPresent) 1 else 0) +
            (if (quoteDate.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (volume.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DailySummary &&
            instrumentId == other.instrumentId &&
            currentPrice == other.currentPrice &&
            high == other.high &&
            low == other.low &&
            open == other.open &&
            quoteDate == other.quoteDate &&
            symbol == other.symbol &&
            volume == other.volume &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            instrumentId,
            currentPrice,
            high,
            low,
            open,
            quoteDate,
            symbol,
            volume,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DailySummary{instrumentId=$instrumentId, currentPrice=$currentPrice, high=$high, low=$low, open=$open, quoteDate=$quoteDate, symbol=$symbol, volume=$volume, additionalProperties=$additionalProperties}"
}
