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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Daily aggregate (OHLV) summary for a single instrument.
 *
 * Returned by `GET /market-data/daily-summary`. Every field except `instrument_id` and
 * `not_applicable` is `Option`:
 * - Unresolvable `instrument_id` → all other fields `None` (including `symbol`).
 * - Resolvable `instrument_id` with no realtime cache entry → `symbol` populated,
 *   OHLV/`trade_date`/`open_interest` `None`.
 * - `trade_date` reflects the session the OHLV represents (today during trading hours, the last
 *   trading date during weekends/holidays).
 * - `open_interest` is populated for options only; `None` for equities and indices.
 * - `not_applicable` is a non-optional `bool`, always serialized: `true` for instrument types with
 *   no daily summary by definition (e.g. an index, whose OHLV/`trade_date` are `None`), `false`
 *   otherwise.
 */
class DailySummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instrumentId: JsonField<String>,
    private val high: JsonField<String>,
    private val low: JsonField<String>,
    private val notApplicable: JsonField<Boolean>,
    private val open: JsonField<String>,
    private val openInterest: JsonField<Long>,
    private val symbol: JsonField<String>,
    private val tradeDate: JsonField<LocalDate>,
    private val volume: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("high") @ExcludeMissing high: JsonField<String> = JsonMissing.of(),
        @JsonProperty("low") @ExcludeMissing low: JsonField<String> = JsonMissing.of(),
        @JsonProperty("not_applicable")
        @ExcludeMissing
        notApplicable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("open") @ExcludeMissing open: JsonField<String> = JsonMissing.of(),
        @JsonProperty("open_interest")
        @ExcludeMissing
        openInterest: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trade_date")
        @ExcludeMissing
        tradeDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("volume") @ExcludeMissing volume: JsonField<Long> = JsonMissing.of(),
    ) : this(
        instrumentId,
        high,
        low,
        notApplicable,
        open,
        openInterest,
        symbol,
        tradeDate,
        volume,
        mutableMapOf(),
    )

    /**
     * Unique instrument identifier. Always populated; echoes the request ID.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Session high. When a null/undefined value is observed, it indicates that there is no
     * available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun high(): Optional<String> = high.getOptional("high")

    /**
     * Session low. When a null/undefined value is observed, it indicates that there is no available
     * data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun low(): Optional<String> = low.getOptional("low")

    /**
     * `true` when the instrument type has no daily summary by definition (e.g. an index).
     * Distinguishes an intentional N/A from OHLV that is merely not loaded yet. `false` for
     * instruments that can have a summary.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notApplicable(): Optional<Boolean> = notApplicable.getOptional("not_applicable")

    /**
     * Opening price for the session. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun open(): Optional<String> = open.getOptional("open")

    /**
     * Open interest (outstanding contracts). Populated for options only; `None` for equities and
     * indices. When a null/undefined value is observed, it indicates that there is no available
     * data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openInterest(): Optional<Long> = openInterest.getOptional("open_interest")

    /**
     * Display symbol for the security. `None` for unresolvable IDs. When a null/undefined value is
     * observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): Optional<String> = symbol.getOptional("symbol")

    /**
     * Session date the OHLV represents, US/Eastern. When a null/undefined value is observed, it
     * indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tradeDate(): Optional<LocalDate> = tradeDate.getOptional("trade_date")

    /**
     * Session cumulative trading volume. When a null/undefined value is observed, it indicates that
     * there is no available data.
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
     * Returns the raw JSON value of [notApplicable].
     *
     * Unlike [notApplicable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("not_applicable")
    @ExcludeMissing
    fun _notApplicable(): JsonField<Boolean> = notApplicable

    /**
     * Returns the raw JSON value of [open].
     *
     * Unlike [open], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open") @ExcludeMissing fun _open(): JsonField<String> = open

    /**
     * Returns the raw JSON value of [openInterest].
     *
     * Unlike [openInterest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open_interest")
    @ExcludeMissing
    fun _openInterest(): JsonField<Long> = openInterest

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [tradeDate].
     *
     * Unlike [tradeDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trade_date") @ExcludeMissing fun _tradeDate(): JsonField<LocalDate> = tradeDate

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
        private var high: JsonField<String> = JsonMissing.of()
        private var low: JsonField<String> = JsonMissing.of()
        private var notApplicable: JsonField<Boolean> = JsonMissing.of()
        private var open: JsonField<String> = JsonMissing.of()
        private var openInterest: JsonField<Long> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var tradeDate: JsonField<LocalDate> = JsonMissing.of()
        private var volume: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dailySummary: DailySummary) = apply {
            instrumentId = dailySummary.instrumentId
            high = dailySummary.high
            low = dailySummary.low
            notApplicable = dailySummary.notApplicable
            open = dailySummary.open
            openInterest = dailySummary.openInterest
            symbol = dailySummary.symbol
            tradeDate = dailySummary.tradeDate
            volume = dailySummary.volume
            additionalProperties = dailySummary.additionalProperties.toMutableMap()
        }

        /** Unique instrument identifier. Always populated; echoes the request ID. */
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

        /**
         * Session high. When a null/undefined value is observed, it indicates that there is no
         * available data.
         */
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

        /**
         * Session low. When a null/undefined value is observed, it indicates that there is no
         * available data.
         */
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

        /**
         * `true` when the instrument type has no daily summary by definition (e.g. an index).
         * Distinguishes an intentional N/A from OHLV that is merely not loaded yet. `false` for
         * instruments that can have a summary.
         */
        fun notApplicable(notApplicable: Boolean) = notApplicable(JsonField.of(notApplicable))

        /**
         * Sets [Builder.notApplicable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notApplicable] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notApplicable(notApplicable: JsonField<Boolean>) = apply {
            this.notApplicable = notApplicable
        }

        /**
         * Opening price for the session. When a null/undefined value is observed, it indicates that
         * there is no available data.
         */
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

        /**
         * Open interest (outstanding contracts). Populated for options only; `None` for equities
         * and indices. When a null/undefined value is observed, it indicates that there is no
         * available data.
         */
        fun openInterest(openInterest: Long?) = openInterest(JsonField.ofNullable(openInterest))

        /**
         * Alias for [Builder.openInterest].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun openInterest(openInterest: Long) = openInterest(openInterest as Long?)

        /** Alias for calling [Builder.openInterest] with `openInterest.orElse(null)`. */
        fun openInterest(openInterest: Optional<Long>) = openInterest(openInterest.getOrNull())

        /**
         * Sets [Builder.openInterest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openInterest] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun openInterest(openInterest: JsonField<Long>) = apply { this.openInterest = openInterest }

        /**
         * Display symbol for the security. `None` for unresolvable IDs. When a null/undefined value
         * is observed, it indicates that there is no available data.
         */
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

        /**
         * Session date the OHLV represents, US/Eastern. When a null/undefined value is observed, it
         * indicates that there is no available data.
         */
        fun tradeDate(tradeDate: LocalDate?) = tradeDate(JsonField.ofNullable(tradeDate))

        /** Alias for calling [Builder.tradeDate] with `tradeDate.orElse(null)`. */
        fun tradeDate(tradeDate: Optional<LocalDate>) = tradeDate(tradeDate.getOrNull())

        /**
         * Sets [Builder.tradeDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tradeDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tradeDate(tradeDate: JsonField<LocalDate>) = apply { this.tradeDate = tradeDate }

        /**
         * Session cumulative trading volume. When a null/undefined value is observed, it indicates
         * that there is no available data.
         */
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
                high,
                low,
                notApplicable,
                open,
                openInterest,
                symbol,
                tradeDate,
                volume,
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
    fun validate(): DailySummary = apply {
        if (validated) {
            return@apply
        }

        instrumentId()
        high()
        low()
        notApplicable()
        open()
        openInterest()
        symbol()
        tradeDate()
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
            (if (high.asKnown().isPresent) 1 else 0) +
            (if (low.asKnown().isPresent) 1 else 0) +
            (if (notApplicable.asKnown().isPresent) 1 else 0) +
            (if (open.asKnown().isPresent) 1 else 0) +
            (if (openInterest.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (tradeDate.asKnown().isPresent) 1 else 0) +
            (if (volume.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DailySummary &&
            instrumentId == other.instrumentId &&
            high == other.high &&
            low == other.low &&
            notApplicable == other.notApplicable &&
            open == other.open &&
            openInterest == other.openInterest &&
            symbol == other.symbol &&
            tradeDate == other.tradeDate &&
            volume == other.volume &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            instrumentId,
            high,
            low,
            notApplicable,
            open,
            openInterest,
            symbol,
            tradeDate,
            volume,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DailySummary{instrumentId=$instrumentId, high=$high, low=$low, notApplicable=$notApplicable, open=$open, openInterest=$openInterest, symbol=$symbol, tradeDate=$tradeDate, volume=$volume, additionalProperties=$additionalProperties}"
}
