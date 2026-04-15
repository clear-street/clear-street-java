// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.balances

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** An account's margin type */
class MarginType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val OTHER = of("OTHER")

        @JvmField val NONE = of("NONE")

        @JvmField val PORTFOLIO_MARGIN = of("PORTFOLIO_MARGIN")

        @JvmField val RISK_BASED_HAIRCUT_BROKER_DEALER = of("RISK_BASED_HAIRCUT_BROKER_DEALER")

        @JvmField val REG_T = of("REG_T")

        @JvmField val RISK_BASED_HAIRCUT_MARKET_MAKER = of("RISK_BASED_HAIRCUT_MARKET_MAKER")

        @JvmField val CIRO = of("CIRO")

        @JvmField val FUTURES_NLV = of("FUTURES_NLV")

        @JvmField val FUTURES_TOT_EQ = of("FUTURES_TOT_EQ")

        @JvmStatic fun of(value: String) = MarginType(JsonField.of(value))
    }

    /** An enum containing [MarginType]'s known values. */
    enum class Known {
        OTHER,
        NONE,
        PORTFOLIO_MARGIN,
        RISK_BASED_HAIRCUT_BROKER_DEALER,
        REG_T,
        RISK_BASED_HAIRCUT_MARKET_MAKER,
        CIRO,
        FUTURES_NLV,
        FUTURES_TOT_EQ,
    }

    /**
     * An enum containing [MarginType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [MarginType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        OTHER,
        NONE,
        PORTFOLIO_MARGIN,
        RISK_BASED_HAIRCUT_BROKER_DEALER,
        REG_T,
        RISK_BASED_HAIRCUT_MARKET_MAKER,
        CIRO,
        FUTURES_NLV,
        FUTURES_TOT_EQ,
        /** An enum member indicating that [MarginType] was instantiated with an unknown value. */
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
            OTHER -> Value.OTHER
            NONE -> Value.NONE
            PORTFOLIO_MARGIN -> Value.PORTFOLIO_MARGIN
            RISK_BASED_HAIRCUT_BROKER_DEALER -> Value.RISK_BASED_HAIRCUT_BROKER_DEALER
            REG_T -> Value.REG_T
            RISK_BASED_HAIRCUT_MARKET_MAKER -> Value.RISK_BASED_HAIRCUT_MARKET_MAKER
            CIRO -> Value.CIRO
            FUTURES_NLV -> Value.FUTURES_NLV
            FUTURES_TOT_EQ -> Value.FUTURES_TOT_EQ
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
            OTHER -> Known.OTHER
            NONE -> Known.NONE
            PORTFOLIO_MARGIN -> Known.PORTFOLIO_MARGIN
            RISK_BASED_HAIRCUT_BROKER_DEALER -> Known.RISK_BASED_HAIRCUT_BROKER_DEALER
            REG_T -> Known.REG_T
            RISK_BASED_HAIRCUT_MARKET_MAKER -> Known.RISK_BASED_HAIRCUT_MARKET_MAKER
            CIRO -> Known.CIRO
            FUTURES_NLV -> Known.FUTURES_NLV
            FUTURES_TOT_EQ -> Known.FUTURES_TOT_EQ
            else -> throw ClearStreetInvalidDataException("Unknown MarginType: $value")
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

    fun validate(): MarginType = apply {
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

        return other is MarginType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
