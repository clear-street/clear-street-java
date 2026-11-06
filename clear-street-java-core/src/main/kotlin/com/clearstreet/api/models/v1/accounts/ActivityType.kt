// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Type of an activity. */
class ActivityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val MONEY_MOVEMENT = of("money_movement")

        @JvmField val INTEREST = of("interest")

        @JvmField val FEE = of("fee")

        @JvmField val DIVIDEND = of("dividend")

        @JvmField val OPTION_EVENT = of("option_event")

        @JvmField val TRANSFER = of("transfer")

        @JvmField val CORPORATE_ACTION = of("corporate_action")

        @JvmField val TAX_WITHHOLDING = of("tax_withholding")

        @JvmField val ADJUSTMENT = of("adjustment")

        @JvmField val OTHER = of("other")

        @JvmStatic fun of(value: String) = ActivityType(JsonField.of(value))
    }

    /** An enum containing [ActivityType]'s known values. */
    enum class Known {
        MONEY_MOVEMENT,
        INTEREST,
        FEE,
        DIVIDEND,
        OPTION_EVENT,
        TRANSFER,
        CORPORATE_ACTION,
        TAX_WITHHOLDING,
        ADJUSTMENT,
        OTHER,
    }

    /**
     * An enum containing [ActivityType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ActivityType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        MONEY_MOVEMENT,
        INTEREST,
        FEE,
        DIVIDEND,
        OPTION_EVENT,
        TRANSFER,
        CORPORATE_ACTION,
        TAX_WITHHOLDING,
        ADJUSTMENT,
        OTHER,
        /** An enum member indicating that [ActivityType] was instantiated with an unknown value. */
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
            MONEY_MOVEMENT -> Value.MONEY_MOVEMENT
            INTEREST -> Value.INTEREST
            FEE -> Value.FEE
            DIVIDEND -> Value.DIVIDEND
            OPTION_EVENT -> Value.OPTION_EVENT
            TRANSFER -> Value.TRANSFER
            CORPORATE_ACTION -> Value.CORPORATE_ACTION
            TAX_WITHHOLDING -> Value.TAX_WITHHOLDING
            ADJUSTMENT -> Value.ADJUSTMENT
            OTHER -> Value.OTHER
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
            MONEY_MOVEMENT -> Known.MONEY_MOVEMENT
            INTEREST -> Known.INTEREST
            FEE -> Known.FEE
            DIVIDEND -> Known.DIVIDEND
            OPTION_EVENT -> Known.OPTION_EVENT
            TRANSFER -> Known.TRANSFER
            CORPORATE_ACTION -> Known.CORPORATE_ACTION
            TAX_WITHHOLDING -> Known.TAX_WITHHOLDING
            ADJUSTMENT -> Known.ADJUSTMENT
            OTHER -> Known.OTHER
            else -> throw ClearStreetInvalidDataException("Unknown ActivityType: $value")
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
    fun validate(): ActivityType = apply {
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

        return other is ActivityType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
