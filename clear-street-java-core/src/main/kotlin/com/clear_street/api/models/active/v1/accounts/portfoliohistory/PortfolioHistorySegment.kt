// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.portfoliohistory

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
    private val endingEquity: JsonField<String>,
    private val realizedPnl: JsonField<String>,
    private val startingEquity: JsonField<String>,
    private val unrealizedPnl: JsonField<String>,
    private val boughtNotional: JsonField<String>,
    private val boughtQuantity: JsonField<String>,
    private val dayPnl: JsonField<String>,
    private val netPnl: JsonField<String>,
    private val positionPnl: JsonField<String>,
    private val soldNotional: JsonField<String>,
    private val soldQuantity: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("ending_equity")
        @ExcludeMissing
        endingEquity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("realized_pnl")
        @ExcludeMissing
        realizedPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_equity")
        @ExcludeMissing
        startingEquity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unrealized_pnl")
        @ExcludeMissing
        unrealizedPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bought_notional")
        @ExcludeMissing
        boughtNotional: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bought_quantity")
        @ExcludeMissing
        boughtQuantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("day_pnl") @ExcludeMissing dayPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_pnl") @ExcludeMissing netPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("position_pnl")
        @ExcludeMissing
        positionPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sold_notional")
        @ExcludeMissing
        soldNotional: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sold_quantity")
        @ExcludeMissing
        soldQuantity: JsonField<String> = JsonMissing.of(),
    ) : this(
        date,
        endingEquity,
        realizedPnl,
        startingEquity,
        unrealizedPnl,
        boughtNotional,
        boughtQuantity,
        dayPnl,
        netPnl,
        positionPnl,
        soldNotional,
        soldQuantity,
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
    fun endingEquity(): String = endingEquity.getRequired("ending_equity")

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
    fun startingEquity(): String = startingEquity.getRequired("starting_equity")

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
     * Quantity bought MTM
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun boughtQuantity(): Optional<String> = boughtQuantity.getOptional("bought_quantity")

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
     * Sum of the profit and loss from the previous trading day.
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
     * Quantity sold MTM
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun soldQuantity(): Optional<String> = soldQuantity.getOptional("sold_quantity")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [endingEquity].
     *
     * Unlike [endingEquity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_equity")
    @ExcludeMissing
    fun _endingEquity(): JsonField<String> = endingEquity

    /**
     * Returns the raw JSON value of [realizedPnl].
     *
     * Unlike [realizedPnl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("realized_pnl")
    @ExcludeMissing
    fun _realizedPnl(): JsonField<String> = realizedPnl

    /**
     * Returns the raw JSON value of [startingEquity].
     *
     * Unlike [startingEquity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_equity")
    @ExcludeMissing
    fun _startingEquity(): JsonField<String> = startingEquity

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
     * Returns the raw JSON value of [boughtQuantity].
     *
     * Unlike [boughtQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bought_quantity")
    @ExcludeMissing
    fun _boughtQuantity(): JsonField<String> = boughtQuantity

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

    /**
     * Returns the raw JSON value of [soldQuantity].
     *
     * Unlike [soldQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sold_quantity")
    @ExcludeMissing
    fun _soldQuantity(): JsonField<String> = soldQuantity

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
         * .endingEquity()
         * .realizedPnl()
         * .startingEquity()
         * .unrealizedPnl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortfolioHistorySegment]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var endingEquity: JsonField<String>? = null
        private var realizedPnl: JsonField<String>? = null
        private var startingEquity: JsonField<String>? = null
        private var unrealizedPnl: JsonField<String>? = null
        private var boughtNotional: JsonField<String> = JsonMissing.of()
        private var boughtQuantity: JsonField<String> = JsonMissing.of()
        private var dayPnl: JsonField<String> = JsonMissing.of()
        private var netPnl: JsonField<String> = JsonMissing.of()
        private var positionPnl: JsonField<String> = JsonMissing.of()
        private var soldNotional: JsonField<String> = JsonMissing.of()
        private var soldQuantity: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portfolioHistorySegment: PortfolioHistorySegment) = apply {
            date = portfolioHistorySegment.date
            endingEquity = portfolioHistorySegment.endingEquity
            realizedPnl = portfolioHistorySegment.realizedPnl
            startingEquity = portfolioHistorySegment.startingEquity
            unrealizedPnl = portfolioHistorySegment.unrealizedPnl
            boughtNotional = portfolioHistorySegment.boughtNotional
            boughtQuantity = portfolioHistorySegment.boughtQuantity
            dayPnl = portfolioHistorySegment.dayPnl
            netPnl = portfolioHistorySegment.netPnl
            positionPnl = portfolioHistorySegment.positionPnl
            soldNotional = portfolioHistorySegment.soldNotional
            soldQuantity = portfolioHistorySegment.soldQuantity
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
        fun endingEquity(endingEquity: String) = endingEquity(JsonField.of(endingEquity))

        /**
         * Sets [Builder.endingEquity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingEquity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endingEquity(endingEquity: JsonField<String>) = apply {
            this.endingEquity = endingEquity
        }

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
        fun startingEquity(startingEquity: String) = startingEquity(JsonField.of(startingEquity))

        /**
         * Sets [Builder.startingEquity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingEquity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingEquity(startingEquity: JsonField<String>) = apply {
            this.startingEquity = startingEquity
        }

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

        /** Quantity bought MTM */
        fun boughtQuantity(boughtQuantity: String?) =
            boughtQuantity(JsonField.ofNullable(boughtQuantity))

        /** Alias for calling [Builder.boughtQuantity] with `boughtQuantity.orElse(null)`. */
        fun boughtQuantity(boughtQuantity: Optional<String>) =
            boughtQuantity(boughtQuantity.getOrNull())

        /**
         * Sets [Builder.boughtQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boughtQuantity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun boughtQuantity(boughtQuantity: JsonField<String>) = apply {
            this.boughtQuantity = boughtQuantity
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

        /** Sum of the profit and loss from the previous trading day. */
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

        /** Quantity sold MTM */
        fun soldQuantity(soldQuantity: String?) = soldQuantity(JsonField.ofNullable(soldQuantity))

        /** Alias for calling [Builder.soldQuantity] with `soldQuantity.orElse(null)`. */
        fun soldQuantity(soldQuantity: Optional<String>) = soldQuantity(soldQuantity.getOrNull())

        /**
         * Sets [Builder.soldQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.soldQuantity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun soldQuantity(soldQuantity: JsonField<String>) = apply {
            this.soldQuantity = soldQuantity
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
         * .endingEquity()
         * .realizedPnl()
         * .startingEquity()
         * .unrealizedPnl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortfolioHistorySegment =
            PortfolioHistorySegment(
                checkRequired("date", date),
                checkRequired("endingEquity", endingEquity),
                checkRequired("realizedPnl", realizedPnl),
                checkRequired("startingEquity", startingEquity),
                checkRequired("unrealizedPnl", unrealizedPnl),
                boughtNotional,
                boughtQuantity,
                dayPnl,
                netPnl,
                positionPnl,
                soldNotional,
                soldQuantity,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortfolioHistorySegment = apply {
        if (validated) {
            return@apply
        }

        date()
        endingEquity()
        realizedPnl()
        startingEquity()
        unrealizedPnl()
        boughtNotional()
        boughtQuantity()
        dayPnl()
        netPnl()
        positionPnl()
        soldNotional()
        soldQuantity()
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
            (if (endingEquity.asKnown().isPresent) 1 else 0) +
            (if (realizedPnl.asKnown().isPresent) 1 else 0) +
            (if (startingEquity.asKnown().isPresent) 1 else 0) +
            (if (unrealizedPnl.asKnown().isPresent) 1 else 0) +
            (if (boughtNotional.asKnown().isPresent) 1 else 0) +
            (if (boughtQuantity.asKnown().isPresent) 1 else 0) +
            (if (dayPnl.asKnown().isPresent) 1 else 0) +
            (if (netPnl.asKnown().isPresent) 1 else 0) +
            (if (positionPnl.asKnown().isPresent) 1 else 0) +
            (if (soldNotional.asKnown().isPresent) 1 else 0) +
            (if (soldQuantity.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortfolioHistorySegment &&
            date == other.date &&
            endingEquity == other.endingEquity &&
            realizedPnl == other.realizedPnl &&
            startingEquity == other.startingEquity &&
            unrealizedPnl == other.unrealizedPnl &&
            boughtNotional == other.boughtNotional &&
            boughtQuantity == other.boughtQuantity &&
            dayPnl == other.dayPnl &&
            netPnl == other.netPnl &&
            positionPnl == other.positionPnl &&
            soldNotional == other.soldNotional &&
            soldQuantity == other.soldQuantity &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            date,
            endingEquity,
            realizedPnl,
            startingEquity,
            unrealizedPnl,
            boughtNotional,
            boughtQuantity,
            dayPnl,
            netPnl,
            positionPnl,
            soldNotional,
            soldQuantity,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortfolioHistorySegment{date=$date, endingEquity=$endingEquity, realizedPnl=$realizedPnl, startingEquity=$startingEquity, unrealizedPnl=$unrealizedPnl, boughtNotional=$boughtNotional, boughtQuantity=$boughtQuantity, dayPnl=$dayPnl, netPnl=$netPnl, positionPnl=$positionPnl, soldNotional=$soldNotional, soldQuantity=$soldQuantity, additionalProperties=$additionalProperties}"
}
