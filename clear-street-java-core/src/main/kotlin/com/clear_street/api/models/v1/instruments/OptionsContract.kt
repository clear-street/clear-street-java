// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

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

/** An options contract with options-specific metadata */
class OptionsContract
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val contractType: JsonField<ContractType>,
    private val currency: JsonField<String>,
    private val exchange: JsonField<String>,
    private val exerciseStyle: JsonField<ExerciseStyle>,
    private val expiry: JsonField<LocalDate>,
    private val isLiquidationOnly: JsonField<Boolean>,
    private val isMarginable: JsonField<Boolean>,
    private val isRestricted: JsonField<Boolean>,
    private val listingType: JsonField<ListingType>,
    private val multiplier: JsonField<String>,
    private val strikePrice: JsonField<String>,
    private val symbol: JsonField<String>,
    private val openInterest: JsonField<Long>,
    private val underlyingInstrumentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contract_type")
        @ExcludeMissing
        contractType: JsonField<ContractType> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exchange") @ExcludeMissing exchange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exercise_style")
        @ExcludeMissing
        exerciseStyle: JsonField<ExerciseStyle> = JsonMissing.of(),
        @JsonProperty("expiry") @ExcludeMissing expiry: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("is_liquidation_only")
        @ExcludeMissing
        isLiquidationOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_marginable")
        @ExcludeMissing
        isMarginable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_restricted")
        @ExcludeMissing
        isRestricted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("listing_type")
        @ExcludeMissing
        listingType: JsonField<ListingType> = JsonMissing.of(),
        @JsonProperty("multiplier")
        @ExcludeMissing
        multiplier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("strike_price")
        @ExcludeMissing
        strikePrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("open_interest")
        @ExcludeMissing
        openInterest: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("underlying_instrument_id")
        @ExcludeMissing
        underlyingInstrumentId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        contractType,
        currency,
        exchange,
        exerciseStyle,
        expiry,
        isLiquidationOnly,
        isMarginable,
        isRestricted,
        listingType,
        multiplier,
        strikePrice,
        symbol,
        openInterest,
        underlyingInstrumentId,
        mutableMapOf(),
    )

    /**
     * OEMS instrument identifier
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Whether this is a CALL or PUT
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractType(): ContractType = contractType.getRequired("contract_type")

    /**
     * ISO currency code
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * MIC code of the primary listing venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exchange(): String = exchange.getRequired("exchange")

    /**
     * Exercise style
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exerciseStyle(): ExerciseStyle = exerciseStyle.getRequired("exercise_style")

    /**
     * Expiration date
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiry(): LocalDate = expiry.getRequired("expiry")

    /**
     * Whether the contract is liquidation-only
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isLiquidationOnly(): Boolean = isLiquidationOnly.getRequired("is_liquidation_only")

    /**
     * Whether the contract is marginable
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isMarginable(): Boolean = isMarginable.getRequired("is_marginable")

    /**
     * Whether the contract is restricted from trading
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRestricted(): Boolean = isRestricted.getRequired("is_restricted")

    /**
     * Listing type
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listingType(): ListingType = listingType.getRequired("listing_type")

    /**
     * Contract multiplier (100 for standard options)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun multiplier(): String = multiplier.getRequired("multiplier")

    /**
     * Strike price
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun strikePrice(): String = strikePrice.getRequired("strike_price")

    /**
     * OSI symbol (e.g. "AAPL 251219C00150000")
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Open interest (number of outstanding contracts), if available
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openInterest(): Optional<Long> = openInterest.getOptional("open_interest")

    /**
     * OEMS instrument ID of the underlying instrument, if resolvable
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun underlyingInstrumentId(): Optional<String> =
        underlyingInstrumentId.getOptional("underlying_instrument_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [contractType].
     *
     * Unlike [contractType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contract_type")
    @ExcludeMissing
    fun _contractType(): JsonField<ContractType> = contractType

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [exchange].
     *
     * Unlike [exchange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exchange") @ExcludeMissing fun _exchange(): JsonField<String> = exchange

    /**
     * Returns the raw JSON value of [exerciseStyle].
     *
     * Unlike [exerciseStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exercise_style")
    @ExcludeMissing
    fun _exerciseStyle(): JsonField<ExerciseStyle> = exerciseStyle

    /**
     * Returns the raw JSON value of [expiry].
     *
     * Unlike [expiry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiry") @ExcludeMissing fun _expiry(): JsonField<LocalDate> = expiry

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
     * Returns the raw JSON value of [listingType].
     *
     * Unlike [listingType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listing_type")
    @ExcludeMissing
    fun _listingType(): JsonField<ListingType> = listingType

    /**
     * Returns the raw JSON value of [multiplier].
     *
     * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier(): JsonField<String> = multiplier

    /**
     * Returns the raw JSON value of [strikePrice].
     *
     * Unlike [strikePrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strike_price")
    @ExcludeMissing
    fun _strikePrice(): JsonField<String> = strikePrice

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [openInterest].
     *
     * Unlike [openInterest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open_interest")
    @ExcludeMissing
    fun _openInterest(): JsonField<Long> = openInterest

    /**
     * Returns the raw JSON value of [underlyingInstrumentId].
     *
     * Unlike [underlyingInstrumentId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("underlying_instrument_id")
    @ExcludeMissing
    fun _underlyingInstrumentId(): JsonField<String> = underlyingInstrumentId

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
         * Returns a mutable builder for constructing an instance of [OptionsContract].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .contractType()
         * .currency()
         * .exchange()
         * .exerciseStyle()
         * .expiry()
         * .isLiquidationOnly()
         * .isMarginable()
         * .isRestricted()
         * .listingType()
         * .multiplier()
         * .strikePrice()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptionsContract]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var contractType: JsonField<ContractType>? = null
        private var currency: JsonField<String>? = null
        private var exchange: JsonField<String>? = null
        private var exerciseStyle: JsonField<ExerciseStyle>? = null
        private var expiry: JsonField<LocalDate>? = null
        private var isLiquidationOnly: JsonField<Boolean>? = null
        private var isMarginable: JsonField<Boolean>? = null
        private var isRestricted: JsonField<Boolean>? = null
        private var listingType: JsonField<ListingType>? = null
        private var multiplier: JsonField<String>? = null
        private var strikePrice: JsonField<String>? = null
        private var symbol: JsonField<String>? = null
        private var openInterest: JsonField<Long> = JsonMissing.of()
        private var underlyingInstrumentId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(optionsContract: OptionsContract) = apply {
            id = optionsContract.id
            contractType = optionsContract.contractType
            currency = optionsContract.currency
            exchange = optionsContract.exchange
            exerciseStyle = optionsContract.exerciseStyle
            expiry = optionsContract.expiry
            isLiquidationOnly = optionsContract.isLiquidationOnly
            isMarginable = optionsContract.isMarginable
            isRestricted = optionsContract.isRestricted
            listingType = optionsContract.listingType
            multiplier = optionsContract.multiplier
            strikePrice = optionsContract.strikePrice
            symbol = optionsContract.symbol
            openInterest = optionsContract.openInterest
            underlyingInstrumentId = optionsContract.underlyingInstrumentId
            additionalProperties = optionsContract.additionalProperties.toMutableMap()
        }

        /** OEMS instrument identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Whether this is a CALL or PUT */
        fun contractType(contractType: ContractType) = contractType(JsonField.of(contractType))

        /**
         * Sets [Builder.contractType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractType] with a well-typed [ContractType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contractType(contractType: JsonField<ContractType>) = apply {
            this.contractType = contractType
        }

        /** ISO currency code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** MIC code of the primary listing venue */
        fun exchange(exchange: String) = exchange(JsonField.of(exchange))

        /**
         * Sets [Builder.exchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exchange] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exchange(exchange: JsonField<String>) = apply { this.exchange = exchange }

        /** Exercise style */
        fun exerciseStyle(exerciseStyle: ExerciseStyle) = exerciseStyle(JsonField.of(exerciseStyle))

        /**
         * Sets [Builder.exerciseStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exerciseStyle] with a well-typed [ExerciseStyle] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exerciseStyle(exerciseStyle: JsonField<ExerciseStyle>) = apply {
            this.exerciseStyle = exerciseStyle
        }

        /** Expiration date */
        fun expiry(expiry: LocalDate) = expiry(JsonField.of(expiry))

        /**
         * Sets [Builder.expiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiry] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiry(expiry: JsonField<LocalDate>) = apply { this.expiry = expiry }

        /** Whether the contract is liquidation-only */
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

        /** Whether the contract is marginable */
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

        /** Whether the contract is restricted from trading */
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

        /** Listing type */
        fun listingType(listingType: ListingType) = listingType(JsonField.of(listingType))

        /**
         * Sets [Builder.listingType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listingType] with a well-typed [ListingType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun listingType(listingType: JsonField<ListingType>) = apply {
            this.listingType = listingType
        }

        /** Contract multiplier (100 for standard options) */
        fun multiplier(multiplier: String) = multiplier(JsonField.of(multiplier))

        /**
         * Sets [Builder.multiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multiplier(multiplier: JsonField<String>) = apply { this.multiplier = multiplier }

        /** Strike price */
        fun strikePrice(strikePrice: String) = strikePrice(JsonField.of(strikePrice))

        /**
         * Sets [Builder.strikePrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strikePrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun strikePrice(strikePrice: JsonField<String>) = apply { this.strikePrice = strikePrice }

        /** OSI symbol (e.g. "AAPL 251219C00150000") */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** Open interest (number of outstanding contracts), if available */
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

        /** OEMS instrument ID of the underlying instrument, if resolvable */
        fun underlyingInstrumentId(underlyingInstrumentId: String?) =
            underlyingInstrumentId(JsonField.ofNullable(underlyingInstrumentId))

        /**
         * Alias for calling [Builder.underlyingInstrumentId] with
         * `underlyingInstrumentId.orElse(null)`.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: Optional<String>) =
            underlyingInstrumentId(underlyingInstrumentId.getOrNull())

        /**
         * Sets [Builder.underlyingInstrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.underlyingInstrumentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: JsonField<String>) = apply {
            this.underlyingInstrumentId = underlyingInstrumentId
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
         * Returns an immutable instance of [OptionsContract].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .contractType()
         * .currency()
         * .exchange()
         * .exerciseStyle()
         * .expiry()
         * .isLiquidationOnly()
         * .isMarginable()
         * .isRestricted()
         * .listingType()
         * .multiplier()
         * .strikePrice()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptionsContract =
            OptionsContract(
                checkRequired("id", id),
                checkRequired("contractType", contractType),
                checkRequired("currency", currency),
                checkRequired("exchange", exchange),
                checkRequired("exerciseStyle", exerciseStyle),
                checkRequired("expiry", expiry),
                checkRequired("isLiquidationOnly", isLiquidationOnly),
                checkRequired("isMarginable", isMarginable),
                checkRequired("isRestricted", isRestricted),
                checkRequired("listingType", listingType),
                checkRequired("multiplier", multiplier),
                checkRequired("strikePrice", strikePrice),
                checkRequired("symbol", symbol),
                openInterest,
                underlyingInstrumentId,
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
    fun validate(): OptionsContract = apply {
        if (validated) {
            return@apply
        }

        id()
        contractType().validate()
        currency()
        exchange()
        exerciseStyle().validate()
        expiry()
        isLiquidationOnly()
        isMarginable()
        isRestricted()
        listingType().validate()
        multiplier()
        strikePrice()
        symbol()
        openInterest()
        underlyingInstrumentId()
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
            (contractType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (exchange.asKnown().isPresent) 1 else 0) +
            (exerciseStyle.asKnown().getOrNull()?.validity() ?: 0) +
            (if (expiry.asKnown().isPresent) 1 else 0) +
            (if (isLiquidationOnly.asKnown().isPresent) 1 else 0) +
            (if (isMarginable.asKnown().isPresent) 1 else 0) +
            (if (isRestricted.asKnown().isPresent) 1 else 0) +
            (listingType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (multiplier.asKnown().isPresent) 1 else 0) +
            (if (strikePrice.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (openInterest.asKnown().isPresent) 1 else 0) +
            (if (underlyingInstrumentId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OptionsContract &&
            id == other.id &&
            contractType == other.contractType &&
            currency == other.currency &&
            exchange == other.exchange &&
            exerciseStyle == other.exerciseStyle &&
            expiry == other.expiry &&
            isLiquidationOnly == other.isLiquidationOnly &&
            isMarginable == other.isMarginable &&
            isRestricted == other.isRestricted &&
            listingType == other.listingType &&
            multiplier == other.multiplier &&
            strikePrice == other.strikePrice &&
            symbol == other.symbol &&
            openInterest == other.openInterest &&
            underlyingInstrumentId == other.underlyingInstrumentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            contractType,
            currency,
            exchange,
            exerciseStyle,
            expiry,
            isLiquidationOnly,
            isMarginable,
            isRestricted,
            listingType,
            multiplier,
            strikePrice,
            symbol,
            openInterest,
            underlyingInstrumentId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OptionsContract{id=$id, contractType=$contractType, currency=$currency, exchange=$exchange, exerciseStyle=$exerciseStyle, expiry=$expiry, isLiquidationOnly=$isLiquidationOnly, isMarginable=$isMarginable, isRestricted=$isRestricted, listingType=$listingType, multiplier=$multiplier, strikePrice=$strikePrice, symbol=$symbol, openInterest=$openInterest, underlyingInstrumentId=$underlyingInstrumentId, additionalProperties=$additionalProperties}"
}
