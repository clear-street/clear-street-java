// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.screener

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Historical lookback window for price/change fields. */
class FieldLookback @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ONE_WEEK = of("ONE_WEEK")

        @JvmField val ONE_MONTH = of("ONE_MONTH")

        @JvmField val THREE_MONTHS = of("THREE_MONTHS")

        @JvmField val SIX_MONTHS = of("SIX_MONTHS")

        @JvmField val YTD = of("YTD")

        @JvmField val ONE_YEAR = of("ONE_YEAR")

        @JvmStatic fun of(value: String) = FieldLookback(JsonField.of(value))
    }

    /** An enum containing [FieldLookback]'s known values. */
    enum class Known {
        ONE_WEEK,
        ONE_MONTH,
        THREE_MONTHS,
        SIX_MONTHS,
        YTD,
        ONE_YEAR,
    }

    /**
     * An enum containing [FieldLookback]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [FieldLookback] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ONE_WEEK,
        ONE_MONTH,
        THREE_MONTHS,
        SIX_MONTHS,
        YTD,
        ONE_YEAR,
        /**
         * An enum member indicating that [FieldLookback] was instantiated with an unknown value.
         */
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
            ONE_WEEK -> Value.ONE_WEEK
            ONE_MONTH -> Value.ONE_MONTH
            THREE_MONTHS -> Value.THREE_MONTHS
            SIX_MONTHS -> Value.SIX_MONTHS
            YTD -> Value.YTD
            ONE_YEAR -> Value.ONE_YEAR
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
            ONE_WEEK -> Known.ONE_WEEK
            ONE_MONTH -> Known.ONE_MONTH
            THREE_MONTHS -> Known.THREE_MONTHS
            SIX_MONTHS -> Known.SIX_MONTHS
            YTD -> Known.YTD
            ONE_YEAR -> Known.ONE_YEAR
            else -> throw ClearStreetInvalidDataException("Unknown FieldLookback: $value")
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

    fun validate(): FieldLookback = apply {
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

        return other is FieldLookback && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
