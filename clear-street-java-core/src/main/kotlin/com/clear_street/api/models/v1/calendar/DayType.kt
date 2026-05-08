// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.calendar

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Day type for market hours - indicates the type of trading day */
class DayType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val TRADING_DAY = of("TRADING_DAY")

        @JvmField val EARLY_CLOSE = of("EARLY_CLOSE")

        @JvmField val HOLIDAY = of("HOLIDAY")

        @JvmField val WEEKEND = of("WEEKEND")

        @JvmStatic fun of(value: String) = DayType(JsonField.of(value))
    }

    /** An enum containing [DayType]'s known values. */
    enum class Known {
        TRADING_DAY,
        EARLY_CLOSE,
        HOLIDAY,
        WEEKEND,
    }

    /**
     * An enum containing [DayType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [DayType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        TRADING_DAY,
        EARLY_CLOSE,
        HOLIDAY,
        WEEKEND,
        /** An enum member indicating that [DayType] was instantiated with an unknown value. */
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
            TRADING_DAY -> Value.TRADING_DAY
            EARLY_CLOSE -> Value.EARLY_CLOSE
            HOLIDAY -> Value.HOLIDAY
            WEEKEND -> Value.WEEKEND
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
            TRADING_DAY -> Known.TRADING_DAY
            EARLY_CLOSE -> Known.EARLY_CLOSE
            HOLIDAY -> Known.HOLIDAY
            WEEKEND -> Known.WEEKEND
            else -> throw ClearStreetInvalidDataException("Unknown DayType: $value")
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
    fun validate(): DayType = apply {
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

        return other is DayType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
