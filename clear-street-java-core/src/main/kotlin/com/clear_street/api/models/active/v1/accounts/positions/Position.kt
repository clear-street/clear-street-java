// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.positions

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
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

/** Represents a holding of a particular instrument in an account */
class Position
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<Long>,
    private val availableQuantity: JsonField<String>,
    private val instrumentType: JsonField<SecurityType>,
    private val marketValue: JsonField<String>,
    private val positionType: JsonField<PositionType>,
    private val quantity: JsonField<String>,
    private val securityId: JsonField<String>,
    private val securityIdSource: JsonField<SecurityIdSource>,
    private val symbol: JsonField<String>,
    private val avgPrice: JsonField<String>,
    private val closingPrice: JsonField<String>,
    private val closingPriceDate: JsonField<LocalDate>,
    private val costBasis: JsonField<String>,
    private val dailyUnrealizedPnl: JsonField<String>,
    private val dailyUnrealizedPnlPct: JsonField<String>,
    private val marketPrice: JsonField<String>,
    private val underlierInstrumentId: JsonField<String>,
    private val unrealizedPnl: JsonField<String>,
    private val unrealizedPnlPct: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("available_quantity")
        @ExcludeMissing
        availableQuantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_type")
        @ExcludeMissing
        instrumentType: JsonField<SecurityType> = JsonMissing.of(),
        @JsonProperty("market_value")
        @ExcludeMissing
        marketValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("position_type")
        @ExcludeMissing
        positionType: JsonField<PositionType> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id")
        @ExcludeMissing
        securityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id_source")
        @ExcludeMissing
        securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avg_price") @ExcludeMissing avgPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("closing_price")
        @ExcludeMissing
        closingPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("closing_price_date")
        @ExcludeMissing
        closingPriceDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("cost_basis") @ExcludeMissing costBasis: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily_unrealized_pnl")
        @ExcludeMissing
        dailyUnrealizedPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily_unrealized_pnl_pct")
        @ExcludeMissing
        dailyUnrealizedPnlPct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("market_price")
        @ExcludeMissing
        marketPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("underlier_instrument_id")
        @ExcludeMissing
        underlierInstrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unrealized_pnl")
        @ExcludeMissing
        unrealizedPnl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unrealized_pnl_pct")
        @ExcludeMissing
        unrealizedPnlPct: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountId,
        availableQuantity,
        instrumentType,
        marketValue,
        positionType,
        quantity,
        securityId,
        securityIdSource,
        symbol,
        avgPrice,
        closingPrice,
        closingPriceDate,
        costBasis,
        dailyUnrealizedPnl,
        dailyUnrealizedPnlPct,
        marketPrice,
        underlierInstrumentId,
        unrealizedPnl,
        unrealizedPnlPct,
        mutableMapOf(),
    )

    /**
     * The account this position belongs to
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): Long = accountId.getRequired("account_id")

    /**
     * The quantity of a position that is free to be operated on.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableQuantity(): String = availableQuantity.getRequired("available_quantity")

    /**
     * Type of security
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentType(): SecurityType = instrumentType.getRequired("instrument_type")

    /**
     * The current market value of the position
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun marketValue(): String = marketValue.getRequired("market_value")

    /**
     * The type of position
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun positionType(): PositionType = positionType.getRequired("position_type")

    /**
     * The number of shares or contracts. Can be positive (long) or negative (short)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): String = quantity.getRequired("quantity")

    /**
     * An identifier for the instrument which, when paired with `security_id_source`, identifies one
     * or more financial instruments.
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
     * The average price paid per share or contract for this position
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avgPrice(): Optional<String> = avgPrice.getOptional("avg_price")

    /**
     * The closing price used to value the position for the last trading day
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closingPrice(): Optional<String> = closingPrice.getOptional("closing_price")

    /**
     * The market date associated with `closing_price`
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closingPriceDate(): Optional<LocalDate> = closingPriceDate.getOptional("closing_price_date")

    /**
     * The total cost basis for this position
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun costBasis(): Optional<String> = costBasis.getOptional("cost_basis")

    /**
     * The unrealized profit or loss for this position relative to the previous close
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailyUnrealizedPnl(): Optional<String> =
        dailyUnrealizedPnl.getOptional("daily_unrealized_pnl")

    /**
     * The unrealized profit/loss for the position for the current day, expressed as a percentage of
     * the baseline value (range: 0-100).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailyUnrealizedPnlPct(): Optional<String> =
        dailyUnrealizedPnlPct.getOptional("daily_unrealized_pnl_pct")

    /**
     * The current market price of the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marketPrice(): Optional<String> = marketPrice.getOptional("market_price")

    /**
     * OEMS instrument identifier of the underlying instrument, if resolvable
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun underlierInstrumentId(): Optional<String> =
        underlierInstrumentId.getOptional("underlier_instrument_id")

    /**
     * The total unrealized profit or loss for this position based on current market value
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unrealizedPnl(): Optional<String> = unrealizedPnl.getOptional("unrealized_pnl")

    /**
     * The unrealized profit/loss for the position, expressed as a percentage of the position's cost
     * basis (range: 0-100).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unrealizedPnlPct(): Optional<String> = unrealizedPnlPct.getOptional("unrealized_pnl_pct")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

    /**
     * Returns the raw JSON value of [availableQuantity].
     *
     * Unlike [availableQuantity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_quantity")
    @ExcludeMissing
    fun _availableQuantity(): JsonField<String> = availableQuantity

    /**
     * Returns the raw JSON value of [instrumentType].
     *
     * Unlike [instrumentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_type")
    @ExcludeMissing
    fun _instrumentType(): JsonField<SecurityType> = instrumentType

    /**
     * Returns the raw JSON value of [marketValue].
     *
     * Unlike [marketValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market_value")
    @ExcludeMissing
    fun _marketValue(): JsonField<String> = marketValue

    /**
     * Returns the raw JSON value of [positionType].
     *
     * Unlike [positionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position_type")
    @ExcludeMissing
    fun _positionType(): JsonField<PositionType> = positionType

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

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
     * Returns the raw JSON value of [avgPrice].
     *
     * Unlike [avgPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avg_price") @ExcludeMissing fun _avgPrice(): JsonField<String> = avgPrice

    /**
     * Returns the raw JSON value of [closingPrice].
     *
     * Unlike [closingPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closing_price")
    @ExcludeMissing
    fun _closingPrice(): JsonField<String> = closingPrice

    /**
     * Returns the raw JSON value of [closingPriceDate].
     *
     * Unlike [closingPriceDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("closing_price_date")
    @ExcludeMissing
    fun _closingPriceDate(): JsonField<LocalDate> = closingPriceDate

    /**
     * Returns the raw JSON value of [costBasis].
     *
     * Unlike [costBasis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_basis") @ExcludeMissing fun _costBasis(): JsonField<String> = costBasis

    /**
     * Returns the raw JSON value of [dailyUnrealizedPnl].
     *
     * Unlike [dailyUnrealizedPnl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("daily_unrealized_pnl")
    @ExcludeMissing
    fun _dailyUnrealizedPnl(): JsonField<String> = dailyUnrealizedPnl

    /**
     * Returns the raw JSON value of [dailyUnrealizedPnlPct].
     *
     * Unlike [dailyUnrealizedPnlPct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("daily_unrealized_pnl_pct")
    @ExcludeMissing
    fun _dailyUnrealizedPnlPct(): JsonField<String> = dailyUnrealizedPnlPct

    /**
     * Returns the raw JSON value of [marketPrice].
     *
     * Unlike [marketPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market_price")
    @ExcludeMissing
    fun _marketPrice(): JsonField<String> = marketPrice

    /**
     * Returns the raw JSON value of [underlierInstrumentId].
     *
     * Unlike [underlierInstrumentId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("underlier_instrument_id")
    @ExcludeMissing
    fun _underlierInstrumentId(): JsonField<String> = underlierInstrumentId

    /**
     * Returns the raw JSON value of [unrealizedPnl].
     *
     * Unlike [unrealizedPnl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unrealized_pnl")
    @ExcludeMissing
    fun _unrealizedPnl(): JsonField<String> = unrealizedPnl

    /**
     * Returns the raw JSON value of [unrealizedPnlPct].
     *
     * Unlike [unrealizedPnlPct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unrealized_pnl_pct")
    @ExcludeMissing
    fun _unrealizedPnlPct(): JsonField<String> = unrealizedPnlPct

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
         * Returns a mutable builder for constructing an instance of [Position].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .availableQuantity()
         * .instrumentType()
         * .marketValue()
         * .positionType()
         * .quantity()
         * .securityId()
         * .securityIdSource()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Position]. */
    class Builder internal constructor() {

        private var accountId: JsonField<Long>? = null
        private var availableQuantity: JsonField<String>? = null
        private var instrumentType: JsonField<SecurityType>? = null
        private var marketValue: JsonField<String>? = null
        private var positionType: JsonField<PositionType>? = null
        private var quantity: JsonField<String>? = null
        private var securityId: JsonField<String>? = null
        private var securityIdSource: JsonField<SecurityIdSource>? = null
        private var symbol: JsonField<String>? = null
        private var avgPrice: JsonField<String> = JsonMissing.of()
        private var closingPrice: JsonField<String> = JsonMissing.of()
        private var closingPriceDate: JsonField<LocalDate> = JsonMissing.of()
        private var costBasis: JsonField<String> = JsonMissing.of()
        private var dailyUnrealizedPnl: JsonField<String> = JsonMissing.of()
        private var dailyUnrealizedPnlPct: JsonField<String> = JsonMissing.of()
        private var marketPrice: JsonField<String> = JsonMissing.of()
        private var underlierInstrumentId: JsonField<String> = JsonMissing.of()
        private var unrealizedPnl: JsonField<String> = JsonMissing.of()
        private var unrealizedPnlPct: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(position: Position) = apply {
            accountId = position.accountId
            availableQuantity = position.availableQuantity
            instrumentType = position.instrumentType
            marketValue = position.marketValue
            positionType = position.positionType
            quantity = position.quantity
            securityId = position.securityId
            securityIdSource = position.securityIdSource
            symbol = position.symbol
            avgPrice = position.avgPrice
            closingPrice = position.closingPrice
            closingPriceDate = position.closingPriceDate
            costBasis = position.costBasis
            dailyUnrealizedPnl = position.dailyUnrealizedPnl
            dailyUnrealizedPnlPct = position.dailyUnrealizedPnlPct
            marketPrice = position.marketPrice
            underlierInstrumentId = position.underlierInstrumentId
            unrealizedPnl = position.unrealizedPnl
            unrealizedPnlPct = position.unrealizedPnlPct
            additionalProperties = position.additionalProperties.toMutableMap()
        }

        /** The account this position belongs to */
        fun accountId(accountId: Long) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        /** The quantity of a position that is free to be operated on. */
        fun availableQuantity(availableQuantity: String) =
            availableQuantity(JsonField.of(availableQuantity))

        /**
         * Sets [Builder.availableQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableQuantity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun availableQuantity(availableQuantity: JsonField<String>) = apply {
            this.availableQuantity = availableQuantity
        }

        /** Type of security */
        fun instrumentType(instrumentType: SecurityType) =
            instrumentType(JsonField.of(instrumentType))

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

        /** The current market value of the position */
        fun marketValue(marketValue: String) = marketValue(JsonField.of(marketValue))

        /**
         * Sets [Builder.marketValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun marketValue(marketValue: JsonField<String>) = apply { this.marketValue = marketValue }

        /** The type of position */
        fun positionType(positionType: PositionType) = positionType(JsonField.of(positionType))

        /**
         * Sets [Builder.positionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.positionType] with a well-typed [PositionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun positionType(positionType: JsonField<PositionType>) = apply {
            this.positionType = positionType
        }

        /** The number of shares or contracts. Can be positive (long) or negative (short) */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /**
         * An identifier for the instrument which, when paired with `security_id_source`, identifies
         * one or more financial instruments.
         */
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

        /** The average price paid per share or contract for this position */
        fun avgPrice(avgPrice: String?) = avgPrice(JsonField.ofNullable(avgPrice))

        /** Alias for calling [Builder.avgPrice] with `avgPrice.orElse(null)`. */
        fun avgPrice(avgPrice: Optional<String>) = avgPrice(avgPrice.getOrNull())

        /**
         * Sets [Builder.avgPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgPrice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avgPrice(avgPrice: JsonField<String>) = apply { this.avgPrice = avgPrice }

        /** The closing price used to value the position for the last trading day */
        fun closingPrice(closingPrice: String?) = closingPrice(JsonField.ofNullable(closingPrice))

        /** Alias for calling [Builder.closingPrice] with `closingPrice.orElse(null)`. */
        fun closingPrice(closingPrice: Optional<String>) = closingPrice(closingPrice.getOrNull())

        /**
         * Sets [Builder.closingPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closingPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun closingPrice(closingPrice: JsonField<String>) = apply {
            this.closingPrice = closingPrice
        }

        /** The market date associated with `closing_price` */
        fun closingPriceDate(closingPriceDate: LocalDate?) =
            closingPriceDate(JsonField.ofNullable(closingPriceDate))

        /** Alias for calling [Builder.closingPriceDate] with `closingPriceDate.orElse(null)`. */
        fun closingPriceDate(closingPriceDate: Optional<LocalDate>) =
            closingPriceDate(closingPriceDate.getOrNull())

        /**
         * Sets [Builder.closingPriceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closingPriceDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closingPriceDate(closingPriceDate: JsonField<LocalDate>) = apply {
            this.closingPriceDate = closingPriceDate
        }

        /** The total cost basis for this position */
        fun costBasis(costBasis: String?) = costBasis(JsonField.ofNullable(costBasis))

        /** Alias for calling [Builder.costBasis] with `costBasis.orElse(null)`. */
        fun costBasis(costBasis: Optional<String>) = costBasis(costBasis.getOrNull())

        /**
         * Sets [Builder.costBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costBasis] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun costBasis(costBasis: JsonField<String>) = apply { this.costBasis = costBasis }

        /** The unrealized profit or loss for this position relative to the previous close */
        fun dailyUnrealizedPnl(dailyUnrealizedPnl: String?) =
            dailyUnrealizedPnl(JsonField.ofNullable(dailyUnrealizedPnl))

        /**
         * Alias for calling [Builder.dailyUnrealizedPnl] with `dailyUnrealizedPnl.orElse(null)`.
         */
        fun dailyUnrealizedPnl(dailyUnrealizedPnl: Optional<String>) =
            dailyUnrealizedPnl(dailyUnrealizedPnl.getOrNull())

        /**
         * Sets [Builder.dailyUnrealizedPnl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyUnrealizedPnl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyUnrealizedPnl(dailyUnrealizedPnl: JsonField<String>) = apply {
            this.dailyUnrealizedPnl = dailyUnrealizedPnl
        }

        /**
         * The unrealized profit/loss for the position for the current day, expressed as a
         * percentage of the baseline value (range: 0-100).
         */
        fun dailyUnrealizedPnlPct(dailyUnrealizedPnlPct: String?) =
            dailyUnrealizedPnlPct(JsonField.ofNullable(dailyUnrealizedPnlPct))

        /**
         * Alias for calling [Builder.dailyUnrealizedPnlPct] with
         * `dailyUnrealizedPnlPct.orElse(null)`.
         */
        fun dailyUnrealizedPnlPct(dailyUnrealizedPnlPct: Optional<String>) =
            dailyUnrealizedPnlPct(dailyUnrealizedPnlPct.getOrNull())

        /**
         * Sets [Builder.dailyUnrealizedPnlPct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyUnrealizedPnlPct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyUnrealizedPnlPct(dailyUnrealizedPnlPct: JsonField<String>) = apply {
            this.dailyUnrealizedPnlPct = dailyUnrealizedPnlPct
        }

        /** The current market price of the instrument */
        fun marketPrice(marketPrice: String?) = marketPrice(JsonField.ofNullable(marketPrice))

        /** Alias for calling [Builder.marketPrice] with `marketPrice.orElse(null)`. */
        fun marketPrice(marketPrice: Optional<String>) = marketPrice(marketPrice.getOrNull())

        /**
         * Sets [Builder.marketPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun marketPrice(marketPrice: JsonField<String>) = apply { this.marketPrice = marketPrice }

        /** OEMS instrument identifier of the underlying instrument, if resolvable */
        fun underlierInstrumentId(underlierInstrumentId: String?) =
            underlierInstrumentId(JsonField.ofNullable(underlierInstrumentId))

        /**
         * Alias for calling [Builder.underlierInstrumentId] with
         * `underlierInstrumentId.orElse(null)`.
         */
        fun underlierInstrumentId(underlierInstrumentId: Optional<String>) =
            underlierInstrumentId(underlierInstrumentId.getOrNull())

        /**
         * Sets [Builder.underlierInstrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.underlierInstrumentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun underlierInstrumentId(underlierInstrumentId: JsonField<String>) = apply {
            this.underlierInstrumentId = underlierInstrumentId
        }

        /** The total unrealized profit or loss for this position based on current market value */
        fun unrealizedPnl(unrealizedPnl: String?) =
            unrealizedPnl(JsonField.ofNullable(unrealizedPnl))

        /** Alias for calling [Builder.unrealizedPnl] with `unrealizedPnl.orElse(null)`. */
        fun unrealizedPnl(unrealizedPnl: Optional<String>) =
            unrealizedPnl(unrealizedPnl.getOrNull())

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

        /**
         * The unrealized profit/loss for the position, expressed as a percentage of the position's
         * cost basis (range: 0-100).
         */
        fun unrealizedPnlPct(unrealizedPnlPct: String?) =
            unrealizedPnlPct(JsonField.ofNullable(unrealizedPnlPct))

        /** Alias for calling [Builder.unrealizedPnlPct] with `unrealizedPnlPct.orElse(null)`. */
        fun unrealizedPnlPct(unrealizedPnlPct: Optional<String>) =
            unrealizedPnlPct(unrealizedPnlPct.getOrNull())

        /**
         * Sets [Builder.unrealizedPnlPct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unrealizedPnlPct] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unrealizedPnlPct(unrealizedPnlPct: JsonField<String>) = apply {
            this.unrealizedPnlPct = unrealizedPnlPct
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
         * Returns an immutable instance of [Position].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .availableQuantity()
         * .instrumentType()
         * .marketValue()
         * .positionType()
         * .quantity()
         * .securityId()
         * .securityIdSource()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Position =
            Position(
                checkRequired("accountId", accountId),
                checkRequired("availableQuantity", availableQuantity),
                checkRequired("instrumentType", instrumentType),
                checkRequired("marketValue", marketValue),
                checkRequired("positionType", positionType),
                checkRequired("quantity", quantity),
                checkRequired("securityId", securityId),
                checkRequired("securityIdSource", securityIdSource),
                checkRequired("symbol", symbol),
                avgPrice,
                closingPrice,
                closingPriceDate,
                costBasis,
                dailyUnrealizedPnl,
                dailyUnrealizedPnlPct,
                marketPrice,
                underlierInstrumentId,
                unrealizedPnl,
                unrealizedPnlPct,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Position = apply {
        if (validated) {
            return@apply
        }

        accountId()
        availableQuantity()
        instrumentType().validate()
        marketValue()
        positionType().validate()
        quantity()
        securityId()
        securityIdSource().validate()
        symbol()
        avgPrice()
        closingPrice()
        closingPriceDate()
        costBasis()
        dailyUnrealizedPnl()
        dailyUnrealizedPnlPct()
        marketPrice()
        underlierInstrumentId()
        unrealizedPnl()
        unrealizedPnlPct()
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
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (availableQuantity.asKnown().isPresent) 1 else 0) +
            (instrumentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (marketValue.asKnown().isPresent) 1 else 0) +
            (positionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (securityId.asKnown().isPresent) 1 else 0) +
            (securityIdSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (avgPrice.asKnown().isPresent) 1 else 0) +
            (if (closingPrice.asKnown().isPresent) 1 else 0) +
            (if (closingPriceDate.asKnown().isPresent) 1 else 0) +
            (if (costBasis.asKnown().isPresent) 1 else 0) +
            (if (dailyUnrealizedPnl.asKnown().isPresent) 1 else 0) +
            (if (dailyUnrealizedPnlPct.asKnown().isPresent) 1 else 0) +
            (if (marketPrice.asKnown().isPresent) 1 else 0) +
            (if (underlierInstrumentId.asKnown().isPresent) 1 else 0) +
            (if (unrealizedPnl.asKnown().isPresent) 1 else 0) +
            (if (unrealizedPnlPct.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Position &&
            accountId == other.accountId &&
            availableQuantity == other.availableQuantity &&
            instrumentType == other.instrumentType &&
            marketValue == other.marketValue &&
            positionType == other.positionType &&
            quantity == other.quantity &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            symbol == other.symbol &&
            avgPrice == other.avgPrice &&
            closingPrice == other.closingPrice &&
            closingPriceDate == other.closingPriceDate &&
            costBasis == other.costBasis &&
            dailyUnrealizedPnl == other.dailyUnrealizedPnl &&
            dailyUnrealizedPnlPct == other.dailyUnrealizedPnlPct &&
            marketPrice == other.marketPrice &&
            underlierInstrumentId == other.underlierInstrumentId &&
            unrealizedPnl == other.unrealizedPnl &&
            unrealizedPnlPct == other.unrealizedPnlPct &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountId,
            availableQuantity,
            instrumentType,
            marketValue,
            positionType,
            quantity,
            securityId,
            securityIdSource,
            symbol,
            avgPrice,
            closingPrice,
            closingPriceDate,
            costBasis,
            dailyUnrealizedPnl,
            dailyUnrealizedPnlPct,
            marketPrice,
            underlierInstrumentId,
            unrealizedPnl,
            unrealizedPnlPct,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Position{accountId=$accountId, availableQuantity=$availableQuantity, instrumentType=$instrumentType, marketValue=$marketValue, positionType=$positionType, quantity=$quantity, securityId=$securityId, securityIdSource=$securityIdSource, symbol=$symbol, avgPrice=$avgPrice, closingPrice=$closingPrice, closingPriceDate=$closingPriceDate, costBasis=$costBasis, dailyUnrealizedPnl=$dailyUnrealizedPnl, dailyUnrealizedPnlPct=$dailyUnrealizedPnlPct, marketPrice=$marketPrice, underlierInstrumentId=$underlierInstrumentId, unrealizedPnl=$unrealizedPnl, unrealizedPnlPct=$unrealizedPnlPct, additionalProperties=$additionalProperties}"
}
