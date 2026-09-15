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
 * Session-level pricing and OHLV metrics for a market data snapshot. Always present on the snapshot
 * row; every field here is independently nullable except `ohlv_applicable`.
 */
class SnapshotSession
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ohlvApplicable: JsonField<Boolean>,
    private val change: JsonField<String>,
    private val changePercent: JsonField<String>,
    private val cumulativeVolume: JsonField<Long>,
    private val high: JsonField<String>,
    private val low: JsonField<String>,
    private val ohlvDate: JsonField<LocalDate>,
    private val open: JsonField<String>,
    private val previousClose: JsonField<String>,
    private val previousCloseUnadjusted: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ohlv_applicable")
        @ExcludeMissing
        ohlvApplicable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("change") @ExcludeMissing change: JsonField<String> = JsonMissing.of(),
        @JsonProperty("change_percent")
        @ExcludeMissing
        changePercent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cumulative_volume")
        @ExcludeMissing
        cumulativeVolume: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("high") @ExcludeMissing high: JsonField<String> = JsonMissing.of(),
        @JsonProperty("low") @ExcludeMissing low: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ohlv_date")
        @ExcludeMissing
        ohlvDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("open") @ExcludeMissing open: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_close")
        @ExcludeMissing
        previousClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_close_unadjusted")
        @ExcludeMissing
        previousCloseUnadjusted: JsonField<String> = JsonMissing.of(),
    ) : this(
        ohlvApplicable,
        change,
        changePercent,
        cumulativeVolume,
        high,
        low,
        ohlvDate,
        open,
        previousClose,
        previousCloseUnadjusted,
        mutableMapOf(),
    )

    /**
     * `false` only for instrument types with no OHLV by definition (e.g. an index instrument, whose
     * price is a computed level rather than a traded security) --
     * `open`/`high`/`low`/`ohlv_date`/`cumulative_volume` are then always absent. `true` otherwise,
     * even when those fields simply haven't loaded yet. Always serialized.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ohlvApplicable(): Boolean = ohlvApplicable.getRequired("ohlv_applicable")

    /**
     * Absolute change from previous close to the most recent last-sale-eligible trade. Absent when
     * either side of the computation is unavailable. When a null/undefined value is observed, it
     * indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun change(): Optional<String> = change.getOptional("change")

    /**
     * Percent change from previous close to the most recent last-sale-eligible trade. Absent under
     * the same conditions as `change`. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun changePercent(): Optional<String> = changePercent.getOptional("change_percent")

    /**
     * Cumulative traded volume for the current session, in shares for equities or contracts for
     * options. Always reflects the current session, even when `ohlv_date` trails it. Absent when
     * `ohlv_applicable` is `false`, or when no trade is available. When a null/undefined value is
     * observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cumulativeVolume(): Optional<Long> = cumulativeVolume.getOptional("cumulative_volume")

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
     * Session date the open/high/low values represent, US/Eastern. May trail the current session
     * until the upstream feed rolls. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ohlvDate(): Optional<LocalDate> = ohlvDate.getOptional("ohlv_date")

    /**
     * Session opening price, from the day's OHLC bar. Absent when `ohlv_applicable` is `false`, or
     * when the bar has not loaded yet. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun open(): Optional<String> = open.getOptional("open")

    /**
     * Previous session close price. Corporate-action-adjusted (stock dividends, cash dividends, and
     * forward/reverse splits) when an adjustment exists for the close date; the raw close
     * otherwise. An adjustment can carry the price beyond 2 decimal places. Absent when no previous
     * close is on record (e.g. an instrument's first session). When a null/undefined value is
     * observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousClose(): Optional<String> = previousClose.getOptional("previous_close")

    /**
     * Unadjusted (raw) previous session close. Present only when a corporate-action adjustment
     * exists for the previous close date; when no adjustment exists, `previous_close` is the raw
     * close and this field is omitted. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousCloseUnadjusted(): Optional<String> =
        previousCloseUnadjusted.getOptional("previous_close_unadjusted")

    /**
     * Returns the raw JSON value of [ohlvApplicable].
     *
     * Unlike [ohlvApplicable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ohlv_applicable")
    @ExcludeMissing
    fun _ohlvApplicable(): JsonField<Boolean> = ohlvApplicable

    /**
     * Returns the raw JSON value of [change].
     *
     * Unlike [change], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change") @ExcludeMissing fun _change(): JsonField<String> = change

    /**
     * Returns the raw JSON value of [changePercent].
     *
     * Unlike [changePercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change_percent")
    @ExcludeMissing
    fun _changePercent(): JsonField<String> = changePercent

    /**
     * Returns the raw JSON value of [cumulativeVolume].
     *
     * Unlike [cumulativeVolume], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cumulative_volume")
    @ExcludeMissing
    fun _cumulativeVolume(): JsonField<Long> = cumulativeVolume

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
     * Returns the raw JSON value of [ohlvDate].
     *
     * Unlike [ohlvDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ohlv_date") @ExcludeMissing fun _ohlvDate(): JsonField<LocalDate> = ohlvDate

    /**
     * Returns the raw JSON value of [open].
     *
     * Unlike [open], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open") @ExcludeMissing fun _open(): JsonField<String> = open

    /**
     * Returns the raw JSON value of [previousClose].
     *
     * Unlike [previousClose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_close")
    @ExcludeMissing
    fun _previousClose(): JsonField<String> = previousClose

    /**
     * Returns the raw JSON value of [previousCloseUnadjusted].
     *
     * Unlike [previousCloseUnadjusted], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("previous_close_unadjusted")
    @ExcludeMissing
    fun _previousCloseUnadjusted(): JsonField<String> = previousCloseUnadjusted

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
         * Returns a mutable builder for constructing an instance of [SnapshotSession].
         *
         * The following fields are required:
         * ```java
         * .ohlvApplicable()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapshotSession]. */
    class Builder internal constructor() {

        private var ohlvApplicable: JsonField<Boolean>? = null
        private var change: JsonField<String> = JsonMissing.of()
        private var changePercent: JsonField<String> = JsonMissing.of()
        private var cumulativeVolume: JsonField<Long> = JsonMissing.of()
        private var high: JsonField<String> = JsonMissing.of()
        private var low: JsonField<String> = JsonMissing.of()
        private var ohlvDate: JsonField<LocalDate> = JsonMissing.of()
        private var open: JsonField<String> = JsonMissing.of()
        private var previousClose: JsonField<String> = JsonMissing.of()
        private var previousCloseUnadjusted: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(snapshotSession: SnapshotSession) = apply {
            ohlvApplicable = snapshotSession.ohlvApplicable
            change = snapshotSession.change
            changePercent = snapshotSession.changePercent
            cumulativeVolume = snapshotSession.cumulativeVolume
            high = snapshotSession.high
            low = snapshotSession.low
            ohlvDate = snapshotSession.ohlvDate
            open = snapshotSession.open
            previousClose = snapshotSession.previousClose
            previousCloseUnadjusted = snapshotSession.previousCloseUnadjusted
            additionalProperties = snapshotSession.additionalProperties.toMutableMap()
        }

        /**
         * `false` only for instrument types with no OHLV by definition (e.g. an index instrument,
         * whose price is a computed level rather than a traded security) --
         * `open`/`high`/`low`/`ohlv_date`/`cumulative_volume` are then always absent. `true`
         * otherwise, even when those fields simply haven't loaded yet. Always serialized.
         */
        fun ohlvApplicable(ohlvApplicable: Boolean) = ohlvApplicable(JsonField.of(ohlvApplicable))

        /**
         * Sets [Builder.ohlvApplicable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ohlvApplicable] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ohlvApplicable(ohlvApplicable: JsonField<Boolean>) = apply {
            this.ohlvApplicable = ohlvApplicable
        }

        /**
         * Absolute change from previous close to the most recent last-sale-eligible trade. Absent
         * when either side of the computation is unavailable. When a null/undefined value is
         * observed, it indicates that there is no available data.
         */
        fun change(change: String?) = change(JsonField.ofNullable(change))

        /** Alias for calling [Builder.change] with `change.orElse(null)`. */
        fun change(change: Optional<String>) = change(change.getOrNull())

        /**
         * Sets [Builder.change] to an arbitrary JSON value.
         *
         * You should usually call [Builder.change] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun change(change: JsonField<String>) = apply { this.change = change }

        /**
         * Percent change from previous close to the most recent last-sale-eligible trade. Absent
         * under the same conditions as `change`. When a null/undefined value is observed, it
         * indicates that there is no available data.
         */
        fun changePercent(changePercent: String?) =
            changePercent(JsonField.ofNullable(changePercent))

        /** Alias for calling [Builder.changePercent] with `changePercent.orElse(null)`. */
        fun changePercent(changePercent: Optional<String>) =
            changePercent(changePercent.getOrNull())

        /**
         * Sets [Builder.changePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changePercent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun changePercent(changePercent: JsonField<String>) = apply {
            this.changePercent = changePercent
        }

        /**
         * Cumulative traded volume for the current session, in shares for equities or contracts for
         * options. Always reflects the current session, even when `ohlv_date` trails it. Absent
         * when `ohlv_applicable` is `false`, or when no trade is available. When a null/undefined
         * value is observed, it indicates that there is no available data.
         */
        fun cumulativeVolume(cumulativeVolume: Long?) =
            cumulativeVolume(JsonField.ofNullable(cumulativeVolume))

        /**
         * Alias for [Builder.cumulativeVolume].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cumulativeVolume(cumulativeVolume: Long) = cumulativeVolume(cumulativeVolume as Long?)

        /** Alias for calling [Builder.cumulativeVolume] with `cumulativeVolume.orElse(null)`. */
        fun cumulativeVolume(cumulativeVolume: Optional<Long>) =
            cumulativeVolume(cumulativeVolume.getOrNull())

        /**
         * Sets [Builder.cumulativeVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cumulativeVolume] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cumulativeVolume(cumulativeVolume: JsonField<Long>) = apply {
            this.cumulativeVolume = cumulativeVolume
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
         * Session date the open/high/low values represent, US/Eastern. May trail the current
         * session until the upstream feed rolls. When a null/undefined value is observed, it
         * indicates that there is no available data.
         */
        fun ohlvDate(ohlvDate: LocalDate?) = ohlvDate(JsonField.ofNullable(ohlvDate))

        /** Alias for calling [Builder.ohlvDate] with `ohlvDate.orElse(null)`. */
        fun ohlvDate(ohlvDate: Optional<LocalDate>) = ohlvDate(ohlvDate.getOrNull())

        /**
         * Sets [Builder.ohlvDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ohlvDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ohlvDate(ohlvDate: JsonField<LocalDate>) = apply { this.ohlvDate = ohlvDate }

        /**
         * Session opening price, from the day's OHLC bar. Absent when `ohlv_applicable` is `false`,
         * or when the bar has not loaded yet. When a null/undefined value is observed, it indicates
         * that there is no available data.
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
         * Previous session close price. Corporate-action-adjusted (stock dividends, cash dividends,
         * and forward/reverse splits) when an adjustment exists for the close date; the raw close
         * otherwise. An adjustment can carry the price beyond 2 decimal places. Absent when no
         * previous close is on record (e.g. an instrument's first session). When a null/undefined
         * value is observed, it indicates that there is no available data.
         */
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

        /**
         * Unadjusted (raw) previous session close. Present only when a corporate-action adjustment
         * exists for the previous close date; when no adjustment exists, `previous_close` is the
         * raw close and this field is omitted. When a null/undefined value is observed, it
         * indicates that there is no available data.
         */
        fun previousCloseUnadjusted(previousCloseUnadjusted: String?) =
            previousCloseUnadjusted(JsonField.ofNullable(previousCloseUnadjusted))

        /**
         * Alias for calling [Builder.previousCloseUnadjusted] with
         * `previousCloseUnadjusted.orElse(null)`.
         */
        fun previousCloseUnadjusted(previousCloseUnadjusted: Optional<String>) =
            previousCloseUnadjusted(previousCloseUnadjusted.getOrNull())

        /**
         * Sets [Builder.previousCloseUnadjusted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousCloseUnadjusted] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun previousCloseUnadjusted(previousCloseUnadjusted: JsonField<String>) = apply {
            this.previousCloseUnadjusted = previousCloseUnadjusted
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
         * Returns an immutable instance of [SnapshotSession].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ohlvApplicable()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SnapshotSession =
            SnapshotSession(
                checkRequired("ohlvApplicable", ohlvApplicable),
                change,
                changePercent,
                cumulativeVolume,
                high,
                low,
                ohlvDate,
                open,
                previousClose,
                previousCloseUnadjusted,
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
    fun validate(): SnapshotSession = apply {
        if (validated) {
            return@apply
        }

        ohlvApplicable()
        change()
        changePercent()
        cumulativeVolume()
        high()
        low()
        ohlvDate()
        open()
        previousClose()
        previousCloseUnadjusted()
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
        (if (ohlvApplicable.asKnown().isPresent) 1 else 0) +
            (if (change.asKnown().isPresent) 1 else 0) +
            (if (changePercent.asKnown().isPresent) 1 else 0) +
            (if (cumulativeVolume.asKnown().isPresent) 1 else 0) +
            (if (high.asKnown().isPresent) 1 else 0) +
            (if (low.asKnown().isPresent) 1 else 0) +
            (if (ohlvDate.asKnown().isPresent) 1 else 0) +
            (if (open.asKnown().isPresent) 1 else 0) +
            (if (previousClose.asKnown().isPresent) 1 else 0) +
            (if (previousCloseUnadjusted.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotSession &&
            ohlvApplicable == other.ohlvApplicable &&
            change == other.change &&
            changePercent == other.changePercent &&
            cumulativeVolume == other.cumulativeVolume &&
            high == other.high &&
            low == other.low &&
            ohlvDate == other.ohlvDate &&
            open == other.open &&
            previousClose == other.previousClose &&
            previousCloseUnadjusted == other.previousCloseUnadjusted &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            ohlvApplicable,
            change,
            changePercent,
            cumulativeVolume,
            high,
            low,
            ohlvDate,
            open,
            previousClose,
            previousCloseUnadjusted,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SnapshotSession{ohlvApplicable=$ohlvApplicable, change=$change, changePercent=$changePercent, cumulativeVolume=$cumulativeVolume, high=$high, low=$low, ohlvDate=$ohlvDate, open=$open, previousClose=$previousClose, previousCloseUnadjusted=$previousCloseUnadjusted, additionalProperties=$additionalProperties}"
}
