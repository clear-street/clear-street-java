// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Canonical company metric key. */
class MetricKey @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ANNUALIZED_REVENUE = of("ANNUALIZED_REVENUE")

        @JvmField val REVENUE_GROWTH = of("REVENUE_GROWTH")

        @JvmField val VALUATION = of("VALUATION")

        @JvmField val ISSUE_PRICE = of("ISSUE_PRICE")

        @JvmField val PRICE_PER_SHARE = of("PRICE_PER_SHARE")

        @JvmField val AMOUNT_RAISED = of("AMOUNT_RAISED")

        @JvmField val ORDER_VOLUME = of("ORDER_VOLUME")

        @JvmField val PIPELINE_VALUE = of("PIPELINE_VALUE")

        @JvmField val GROSS_MARGIN = of("GROSS_MARGIN")

        @JvmField val EBIT_MARGIN = of("EBIT_MARGIN")

        @JvmField val FCF_CONVERSION = of("FCF_CONVERSION")

        @JvmField val CONTRACTED_REVENUE_PERCENT = of("CONTRACTED_REVENUE_PERCENT")

        @JvmField val NET_REVENUE_RETENTION = of("NET_REVENUE_RETENTION")

        @JvmField val CUSTOMER_COUNT = of("CUSTOMER_COUNT")

        @JvmField val MARKET_POSITION = of("MARKET_POSITION")

        @JvmStatic fun of(value: String) = MetricKey(JsonField.of(value))
    }

    /** An enum containing [MetricKey]'s known values. */
    enum class Known {
        ANNUALIZED_REVENUE,
        REVENUE_GROWTH,
        VALUATION,
        ISSUE_PRICE,
        PRICE_PER_SHARE,
        AMOUNT_RAISED,
        ORDER_VOLUME,
        PIPELINE_VALUE,
        GROSS_MARGIN,
        EBIT_MARGIN,
        FCF_CONVERSION,
        CONTRACTED_REVENUE_PERCENT,
        NET_REVENUE_RETENTION,
        CUSTOMER_COUNT,
        MARKET_POSITION,
    }

    /**
     * An enum containing [MetricKey]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [MetricKey] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ANNUALIZED_REVENUE,
        REVENUE_GROWTH,
        VALUATION,
        ISSUE_PRICE,
        PRICE_PER_SHARE,
        AMOUNT_RAISED,
        ORDER_VOLUME,
        PIPELINE_VALUE,
        GROSS_MARGIN,
        EBIT_MARGIN,
        FCF_CONVERSION,
        CONTRACTED_REVENUE_PERCENT,
        NET_REVENUE_RETENTION,
        CUSTOMER_COUNT,
        MARKET_POSITION,
        /** An enum member indicating that [MetricKey] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            ANNUALIZED_REVENUE -> Value.ANNUALIZED_REVENUE
            REVENUE_GROWTH -> Value.REVENUE_GROWTH
            VALUATION -> Value.VALUATION
            ISSUE_PRICE -> Value.ISSUE_PRICE
            PRICE_PER_SHARE -> Value.PRICE_PER_SHARE
            AMOUNT_RAISED -> Value.AMOUNT_RAISED
            ORDER_VOLUME -> Value.ORDER_VOLUME
            PIPELINE_VALUE -> Value.PIPELINE_VALUE
            GROSS_MARGIN -> Value.GROSS_MARGIN
            EBIT_MARGIN -> Value.EBIT_MARGIN
            FCF_CONVERSION -> Value.FCF_CONVERSION
            CONTRACTED_REVENUE_PERCENT -> Value.CONTRACTED_REVENUE_PERCENT
            NET_REVENUE_RETENTION -> Value.NET_REVENUE_RETENTION
            CUSTOMER_COUNT -> Value.CUSTOMER_COUNT
            MARKET_POSITION -> Value.MARKET_POSITION
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws ClearStreetInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            ANNUALIZED_REVENUE -> Known.ANNUALIZED_REVENUE
            REVENUE_GROWTH -> Known.REVENUE_GROWTH
            VALUATION -> Known.VALUATION
            ISSUE_PRICE -> Known.ISSUE_PRICE
            PRICE_PER_SHARE -> Known.PRICE_PER_SHARE
            AMOUNT_RAISED -> Known.AMOUNT_RAISED
            ORDER_VOLUME -> Known.ORDER_VOLUME
            PIPELINE_VALUE -> Known.PIPELINE_VALUE
            GROSS_MARGIN -> Known.GROSS_MARGIN
            EBIT_MARGIN -> Known.EBIT_MARGIN
            FCF_CONVERSION -> Known.FCF_CONVERSION
            CONTRACTED_REVENUE_PERCENT -> Known.CONTRACTED_REVENUE_PERCENT
            NET_REVENUE_RETENTION -> Known.NET_REVENUE_RETENTION
            CUSTOMER_COUNT -> Known.CUSTOMER_COUNT
            MARKET_POSITION -> Known.MARKET_POSITION
            else -> throw ClearStreetInvalidDataException("Unknown MetricKey: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws ClearStreetInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { ClearStreetInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ClearStreetInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): MetricKey = apply {
        if (validated) {
            return@apply
        }

        known()
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
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetricKey && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
