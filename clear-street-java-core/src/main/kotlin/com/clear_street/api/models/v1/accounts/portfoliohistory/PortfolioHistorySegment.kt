// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.portfoliohistory

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

class PortfolioHistorySegment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val eodEquity: JsonField<String>,
    private val realizedPnl: JsonField<String>,
    private val sodEquity: JsonField<String>,
    private val unrealizedPnl: JsonField<String>,
    private val boughtNotional: JsonField<String>,
    private val dayPnl: JsonField<String>,
    private val netPnl: JsonField<String>,
    private val positionPnl: JsonField<String>,
    private val soldNotional: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("eod_equity") @ExcludeMissing eodEquity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("realized_pnl")
        @ExcludeMissing
        realizedPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sod_equity") @ExcludeMissing sodEquity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unrealized_pnl")
        @ExcludeMissing
        unrealizedPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bought_notional")
        @ExcludeMissing
        boughtNotional: JsonField<String> = JsonMissing.of(),
        @JsonProperty("day_pnl") @ExcludeMissing dayPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_pnl") @ExcludeMissing netPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("position_pnl")
        @ExcludeMissing
        positionPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sold_notional")
        @ExcludeMissing
        soldNotional: JsonField<String> = JsonMissing.of(),
    ) : this(
        date,
        eodEquity,
        realizedPnl,
        sodEquity,
        unrealizedPnl,
        boughtNotional,
        dayPnl,
        netPnl,
        positionPnl,
        soldNotional,
        mutableMapOf(),
    )

    /**
     * The date for this segment
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * The equity at the end of the trading day.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eodEquity(): String = eodEquity.getRequired("eod_equity")

    /**
     * Sum of the profit and loss realized from position closing trading activity.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun realizedPnl(): String = realizedPnl.getRequired("realized_pnl")

    /**
     * The equity at the start of the trading day.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sodEquity(): String = sodEquity.getRequired("sod_equity")

    /**
     * Sum of the profit and loss from market changes.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unrealizedPnl(): String = unrealizedPnl.getRequired("unrealized_pnl")

    /**
     * Amount bought MTM
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun boughtNotional(): Optional<String> = boughtNotional.getOptional("bought_notional")

    /**
     * Sum of the profit and loss from intraday trading activities for the trading day.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayPnl(): Optional<String> = dayPnl.getOptional("day_pnl")

    /**
     * P&L after netting all realized and unrealized P&L, adjustments, dividends, change in
     * accruals, income and expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPnl(): Optional<String> = netPnl.getOptional("net_pnl")

    /**
     * P&L attributable to start-of-day (carried) positions from market movement during this trading
     * day.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun positionPnl(): Optional<String> = positionPnl.getOptional("position_pnl")

    /**
     * Amount sold MTM
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun soldNotional(): Optional<String> = soldNotional.getOptional("sold_notional")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [eodEquity].
     *
     * Unlike [eodEquity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eod_equity") @ExcludeMissing fun _eodEquity(): JsonField<String> = eodEquity

    /**
     * Returns the raw JSON value of [realizedPnl].
     *
     * Unlike [realizedPnl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("realized_pnl")
    @ExcludeMissing
    fun _realizedPnl(): JsonField<String> = realizedPnl

    /**
     * Returns the raw JSON value of [sodEquity].
     *
     * Unlike [sodEquity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sod_equity") @ExcludeMissing fun _sodEquity(): JsonField<String> = sodEquity

    /**
     * Returns the raw JSON value of [unrealizedPnl].
     *
     * Unlike [unrealizedPnl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unrealized_pnl")
    @ExcludeMissing
    fun _unrealizedPnl(): JsonField<String> = unrealizedPnl

    /**
     * Returns the raw JSON value of [boughtNotional].
     *
     * Unlike [boughtNotional], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bought_notional")
    @ExcludeMissing
    fun _boughtNotional(): JsonField<String> = boughtNotional

    /**
     * Returns the raw JSON value of [dayPnl].
     *
     * Unlike [dayPnl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("day_pnl") @ExcludeMissing fun _dayPnl(): JsonField<String> = dayPnl

    /**
     * Returns the raw JSON value of [netPnl].
     *
     * Unlike [netPnl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_pnl") @ExcludeMissing fun _netPnl(): JsonField<String> = netPnl

    /**
     * Returns the raw JSON value of [positionPnl].
     *
     * Unlike [positionPnl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position_pnl")
    @ExcludeMissing
    fun _positionPnl(): JsonField<String> = positionPnl

    /**
     * Returns the raw JSON value of [soldNotional].
     *
     * Unlike [soldNotional], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sold_notional")
    @ExcludeMissing
    fun _soldNotional(): JsonField<String> = soldNotional

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
         * Returns a mutable builder for constructing an instance of [PortfolioHistorySegment].
         *
         * The following fields are required:
         * ```java
         * .date()
         * .eodEquity()
         * .realizedPnl()
         * .sodEquity()
         * .unrealizedPnl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortfolioHistorySegment]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var eodEquity: JsonField<String>? = null
        private var realizedPnl: JsonField<String>? = null
        private var sodEquity: JsonField<String>? = null
        private var unrealizedPnl: JsonField<String>? = null
        private var boughtNotional: JsonField<String> = JsonMissing.of()
        private var dayPnl: JsonField<String> = JsonMissing.of()
        private var netPnl: JsonField<String> = JsonMissing.of()
        private var positionPnl: JsonField<String> = JsonMissing.of()
        private var soldNotional: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portfolioHistorySegment: PortfolioHistorySegment) = apply {
            date = portfolioHistorySegment.date
            eodEquity = portfolioHistorySegment.eodEquity
            realizedPnl = portfolioHistorySegment.realizedPnl
            sodEquity = portfolioHistorySegment.sodEquity
            unrealizedPnl = portfolioHistorySegment.unrealizedPnl
            boughtNotional = portfolioHistorySegment.boughtNotional
            dayPnl = portfolioHistorySegment.dayPnl
            netPnl = portfolioHistorySegment.netPnl
            positionPnl = portfolioHistorySegment.positionPnl
            soldNotional = portfolioHistorySegment.soldNotional
            additionalProperties = portfolioHistorySegment.additionalProperties.toMutableMap()
        }

        /** The date for this segment */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The equity at the end of the trading day. */
        fun eodEquity(eodEquity: String) = eodEquity(JsonField.of(eodEquity))

        /**
         * Sets [Builder.eodEquity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eodEquity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eodEquity(eodEquity: JsonField<String>) = apply { this.eodEquity = eodEquity }

        /** Sum of the profit and loss realized from position closing trading activity. */
        fun realizedPnl(realizedPnl: String) = realizedPnl(JsonField.of(realizedPnl))

        /**
         * Sets [Builder.realizedPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.realizedPnl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun realizedPnl(realizedPnl: JsonField<String>) = apply { this.realizedPnl = realizedPnl }

        /** The equity at the start of the trading day. */
        fun sodEquity(sodEquity: String) = sodEquity(JsonField.of(sodEquity))

        /**
         * Sets [Builder.sodEquity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sodEquity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sodEquity(sodEquity: JsonField<String>) = apply { this.sodEquity = sodEquity }

        /** Sum of the profit and loss from market changes. */
        fun unrealizedPnl(unrealizedPnl: String) = unrealizedPnl(JsonField.of(unrealizedPnl))

        /**
         * Sets [Builder.unrealizedPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unrealizedPnl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unrealizedPnl(unrealizedPnl: JsonField<String>) = apply {
            this.unrealizedPnl = unrealizedPnl
        }

        /** Amount bought MTM */
        fun boughtNotional(boughtNotional: String?) =
            boughtNotional(JsonField.ofNullable(boughtNotional))

        /** Alias for calling [Builder.boughtNotional] with `boughtNotional.orElse(null)`. */
        fun boughtNotional(boughtNotional: Optional<String>) =
            boughtNotional(boughtNotional.getOrNull())

        /**
         * Sets [Builder.boughtNotional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boughtNotional] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun boughtNotional(boughtNotional: JsonField<String>) = apply {
            this.boughtNotional = boughtNotional
        }

        /** Sum of the profit and loss from intraday trading activities for the trading day. */
        fun dayPnl(dayPnl: String?) = dayPnl(JsonField.ofNullable(dayPnl))

        /** Alias for calling [Builder.dayPnl] with `dayPnl.orElse(null)`. */
        fun dayPnl(dayPnl: Optional<String>) = dayPnl(dayPnl.getOrNull())

        /**
         * Sets [Builder.dayPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayPnl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dayPnl(dayPnl: JsonField<String>) = apply { this.dayPnl = dayPnl }

        /**
         * P&L after netting all realized and unrealized P&L, adjustments, dividends, change in
         * accruals, income and expenses
         */
        fun netPnl(netPnl: String?) = netPnl(JsonField.ofNullable(netPnl))

        /** Alias for calling [Builder.netPnl] with `netPnl.orElse(null)`. */
        fun netPnl(netPnl: Optional<String>) = netPnl(netPnl.getOrNull())

        /**
         * Sets [Builder.netPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPnl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netPnl(netPnl: JsonField<String>) = apply { this.netPnl = netPnl }

        /**
         * P&L attributable to start-of-day (carried) positions from market movement during this
         * trading day.
         */
        fun positionPnl(positionPnl: String?) = positionPnl(JsonField.ofNullable(positionPnl))

        /** Alias for calling [Builder.positionPnl] with `positionPnl.orElse(null)`. */
        fun positionPnl(positionPnl: Optional<String>) = positionPnl(positionPnl.getOrNull())

        /**
         * Sets [Builder.positionPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.positionPnl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun positionPnl(positionPnl: JsonField<String>) = apply { this.positionPnl = positionPnl }

        /** Amount sold MTM */
        fun soldNotional(soldNotional: String?) = soldNotional(JsonField.ofNullable(soldNotional))

        /** Alias for calling [Builder.soldNotional] with `soldNotional.orElse(null)`. */
        fun soldNotional(soldNotional: Optional<String>) = soldNotional(soldNotional.getOrNull())

        /**
         * Sets [Builder.soldNotional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.soldNotional] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun soldNotional(soldNotional: JsonField<String>) = apply {
            this.soldNotional = soldNotional
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
         * Returns an immutable instance of [PortfolioHistorySegment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .date()
         * .eodEquity()
         * .realizedPnl()
         * .sodEquity()
         * .unrealizedPnl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortfolioHistorySegment =
            PortfolioHistorySegment(
                checkRequired("date", date),
                checkRequired("eodEquity", eodEquity),
                checkRequired("realizedPnl", realizedPnl),
                checkRequired("sodEquity", sodEquity),
                checkRequired("unrealizedPnl", unrealizedPnl),
                boughtNotional,
                dayPnl,
                netPnl,
                positionPnl,
                soldNotional,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortfolioHistorySegment = apply {
        if (validated) {
            return@apply
        }

        date()
        eodEquity()
        realizedPnl()
        sodEquity()
        unrealizedPnl()
        boughtNotional()
        dayPnl()
        netPnl()
        positionPnl()
        soldNotional()
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
        (if (date.asKnown().isPresent) 1 else 0) +
            (if (eodEquity.asKnown().isPresent) 1 else 0) +
            (if (realizedPnl.asKnown().isPresent) 1 else 0) +
            (if (sodEquity.asKnown().isPresent) 1 else 0) +
            (if (unrealizedPnl.asKnown().isPresent) 1 else 0) +
            (if (boughtNotional.asKnown().isPresent) 1 else 0) +
            (if (dayPnl.asKnown().isPresent) 1 else 0) +
            (if (netPnl.asKnown().isPresent) 1 else 0) +
            (if (positionPnl.asKnown().isPresent) 1 else 0) +
            (if (soldNotional.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortfolioHistorySegment &&
            date == other.date &&
            eodEquity == other.eodEquity &&
            realizedPnl == other.realizedPnl &&
            sodEquity == other.sodEquity &&
            unrealizedPnl == other.unrealizedPnl &&
            boughtNotional == other.boughtNotional &&
            dayPnl == other.dayPnl &&
            netPnl == other.netPnl &&
            positionPnl == other.positionPnl &&
            soldNotional == other.soldNotional &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            date,
            eodEquity,
            realizedPnl,
            sodEquity,
            unrealizedPnl,
            boughtNotional,
            dayPnl,
            netPnl,
            positionPnl,
            soldNotional,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortfolioHistorySegment{date=$date, eodEquity=$eodEquity, realizedPnl=$realizedPnl, sodEquity=$sodEquity, unrealizedPnl=$unrealizedPnl, boughtNotional=$boughtNotional, dayPnl=$dayPnl, netPnl=$netPnl, positionPnl=$positionPnl, soldNotional=$soldNotional, additionalProperties=$additionalProperties}"
}
