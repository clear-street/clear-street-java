// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.balances

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
import java.util.Collections
import java.util.Objects

class MarginTopContributor
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dayTradeBuyingPowerUsage: JsonField<String>,
    private val initialMarginRequirement: JsonField<String>,
    private val maintenanceMarginRequirement: JsonField<String>,
    private val marketValue: JsonField<String>,
    private val underlyingInstrumentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("day_trade_buying_power_usage")
        @ExcludeMissing
        dayTradeBuyingPowerUsage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initial_margin_requirement")
        @ExcludeMissing
        initialMarginRequirement: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_requirement")
        @ExcludeMissing
        maintenanceMarginRequirement: JsonField<String> = JsonMissing.of(),
        @JsonProperty("market_value")
        @ExcludeMissing
        marketValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("underlying_instrument_id")
        @ExcludeMissing
        underlyingInstrumentId: JsonField<String> = JsonMissing.of(),
    ) : this(
        dayTradeBuyingPowerUsage,
        initialMarginRequirement,
        maintenanceMarginRequirement,
        marketValue,
        underlyingInstrumentId,
        mutableMapOf(),
    )

    /**
     * Day-trade buying power consumed by fills against this underlying on the current trade date.
     * Populated only for pattern day trader accounts.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dayTradeBuyingPowerUsage(): String =
        dayTradeBuyingPowerUsage.getRequired("day_trade_buying_power_usage")

    /**
     * Initial margin requirement attributable to this underlying.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initialMarginRequirement(): String =
        initialMarginRequirement.getRequired("initial_margin_requirement")

    /**
     * Maintenance margin requirement attributable to this underlying.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maintenanceMarginRequirement(): String =
        maintenanceMarginRequirement.getRequired("maintenance_margin_requirement")

    /**
     * Net market value attributable to this underlying.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun marketValue(): String = marketValue.getRequired("market_value")

    /**
     * UUID of the underlying security contributing to margin requirement.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun underlyingInstrumentId(): String =
        underlyingInstrumentId.getRequired("underlying_instrument_id")

    /**
     * Returns the raw JSON value of [dayTradeBuyingPowerUsage].
     *
     * Unlike [dayTradeBuyingPowerUsage], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("day_trade_buying_power_usage")
    @ExcludeMissing
    fun _dayTradeBuyingPowerUsage(): JsonField<String> = dayTradeBuyingPowerUsage

    /**
     * Returns the raw JSON value of [initialMarginRequirement].
     *
     * Unlike [initialMarginRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("initial_margin_requirement")
    @ExcludeMissing
    fun _initialMarginRequirement(): JsonField<String> = initialMarginRequirement

    /**
     * Returns the raw JSON value of [maintenanceMarginRequirement].
     *
     * Unlike [maintenanceMarginRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maintenance_margin_requirement")
    @ExcludeMissing
    fun _maintenanceMarginRequirement(): JsonField<String> = maintenanceMarginRequirement

    /**
     * Returns the raw JSON value of [marketValue].
     *
     * Unlike [marketValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market_value")
    @ExcludeMissing
    fun _marketValue(): JsonField<String> = marketValue

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
         * Returns a mutable builder for constructing an instance of [MarginTopContributor].
         *
         * The following fields are required:
         * ```java
         * .dayTradeBuyingPowerUsage()
         * .initialMarginRequirement()
         * .maintenanceMarginRequirement()
         * .marketValue()
         * .underlyingInstrumentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarginTopContributor]. */
    class Builder internal constructor() {

        private var dayTradeBuyingPowerUsage: JsonField<String>? = null
        private var initialMarginRequirement: JsonField<String>? = null
        private var maintenanceMarginRequirement: JsonField<String>? = null
        private var marketValue: JsonField<String>? = null
        private var underlyingInstrumentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marginTopContributor: MarginTopContributor) = apply {
            dayTradeBuyingPowerUsage = marginTopContributor.dayTradeBuyingPowerUsage
            initialMarginRequirement = marginTopContributor.initialMarginRequirement
            maintenanceMarginRequirement = marginTopContributor.maintenanceMarginRequirement
            marketValue = marginTopContributor.marketValue
            underlyingInstrumentId = marginTopContributor.underlyingInstrumentId
            additionalProperties = marginTopContributor.additionalProperties.toMutableMap()
        }

        /**
         * Day-trade buying power consumed by fills against this underlying on the current trade
         * date. Populated only for pattern day trader accounts.
         */
        fun dayTradeBuyingPowerUsage(dayTradeBuyingPowerUsage: String) =
            dayTradeBuyingPowerUsage(JsonField.of(dayTradeBuyingPowerUsage))

        /**
         * Sets [Builder.dayTradeBuyingPowerUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayTradeBuyingPowerUsage] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dayTradeBuyingPowerUsage(dayTradeBuyingPowerUsage: JsonField<String>) = apply {
            this.dayTradeBuyingPowerUsage = dayTradeBuyingPowerUsage
        }

        /** Initial margin requirement attributable to this underlying. */
        fun initialMarginRequirement(initialMarginRequirement: String) =
            initialMarginRequirement(JsonField.of(initialMarginRequirement))

        /**
         * Sets [Builder.initialMarginRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialMarginRequirement] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun initialMarginRequirement(initialMarginRequirement: JsonField<String>) = apply {
            this.initialMarginRequirement = initialMarginRequirement
        }

        /** Maintenance margin requirement attributable to this underlying. */
        fun maintenanceMarginRequirement(maintenanceMarginRequirement: String) =
            maintenanceMarginRequirement(JsonField.of(maintenanceMarginRequirement))

        /**
         * Sets [Builder.maintenanceMarginRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maintenanceMarginRequirement] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maintenanceMarginRequirement(maintenanceMarginRequirement: JsonField<String>) = apply {
            this.maintenanceMarginRequirement = maintenanceMarginRequirement
        }

        /** Net market value attributable to this underlying. */
        fun marketValue(marketValue: String) = marketValue(JsonField.of(marketValue))

        /**
         * Sets [Builder.marketValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun marketValue(marketValue: JsonField<String>) = apply { this.marketValue = marketValue }

        /** UUID of the underlying security contributing to margin requirement. */
        fun underlyingInstrumentId(underlyingInstrumentId: String) =
            underlyingInstrumentId(JsonField.of(underlyingInstrumentId))

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
         * Returns an immutable instance of [MarginTopContributor].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dayTradeBuyingPowerUsage()
         * .initialMarginRequirement()
         * .maintenanceMarginRequirement()
         * .marketValue()
         * .underlyingInstrumentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarginTopContributor =
            MarginTopContributor(
                checkRequired("dayTradeBuyingPowerUsage", dayTradeBuyingPowerUsage),
                checkRequired("initialMarginRequirement", initialMarginRequirement),
                checkRequired("maintenanceMarginRequirement", maintenanceMarginRequirement),
                checkRequired("marketValue", marketValue),
                checkRequired("underlyingInstrumentId", underlyingInstrumentId),
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
    fun validate(): MarginTopContributor = apply {
        if (validated) {
            return@apply
        }

        dayTradeBuyingPowerUsage()
        initialMarginRequirement()
        maintenanceMarginRequirement()
        marketValue()
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
        (if (dayTradeBuyingPowerUsage.asKnown().isPresent) 1 else 0) +
            (if (initialMarginRequirement.asKnown().isPresent) 1 else 0) +
            (if (maintenanceMarginRequirement.asKnown().isPresent) 1 else 0) +
            (if (marketValue.asKnown().isPresent) 1 else 0) +
            (if (underlyingInstrumentId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarginTopContributor &&
            dayTradeBuyingPowerUsage == other.dayTradeBuyingPowerUsage &&
            initialMarginRequirement == other.initialMarginRequirement &&
            maintenanceMarginRequirement == other.maintenanceMarginRequirement &&
            marketValue == other.marketValue &&
            underlyingInstrumentId == other.underlyingInstrumentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dayTradeBuyingPowerUsage,
            initialMarginRequirement,
            maintenanceMarginRequirement,
            marketValue,
            underlyingInstrumentId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarginTopContributor{dayTradeBuyingPowerUsage=$dayTradeBuyingPowerUsage, initialMarginRequirement=$initialMarginRequirement, maintenanceMarginRequirement=$maintenanceMarginRequirement, marketValue=$marketValue, underlyingInstrumentId=$underlyingInstrumentId, additionalProperties=$additionalProperties}"
}
