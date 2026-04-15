// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Time in force */
class TimeInForce @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val DAY = of("DAY")

        @JvmField val GOOD_TILL_CANCEL = of("GOOD_TILL_CANCEL")

        @JvmField val IMMEDIATE_OR_CANCEL = of("IMMEDIATE_OR_CANCEL")

        @JvmField val FILL_OR_KILL = of("FILL_OR_KILL")

        @JvmField val GOOD_TILL_DATE = of("GOOD_TILL_DATE")

        @JvmField val AT_THE_OPENING = of("AT_THE_OPENING")

        @JvmField val AT_THE_CLOSE = of("AT_THE_CLOSE")

        @JvmField val GOOD_TILL_CROSSING = of("GOOD_TILL_CROSSING")

        @JvmField val GOOD_THROUGH_CROSSING = of("GOOD_THROUGH_CROSSING")

        @JvmField val AT_CROSSING = of("AT_CROSSING")

        @JvmField val OTHER = of("OTHER")

        @JvmStatic fun of(value: String) = TimeInForce(JsonField.of(value))
    }

    /** An enum containing [TimeInForce]'s known values. */
    enum class Known {
        DAY,
        GOOD_TILL_CANCEL,
        IMMEDIATE_OR_CANCEL,
        FILL_OR_KILL,
        GOOD_TILL_DATE,
        AT_THE_OPENING,
        AT_THE_CLOSE,
        GOOD_TILL_CROSSING,
        GOOD_THROUGH_CROSSING,
        AT_CROSSING,
        OTHER,
    }

    /**
     * An enum containing [TimeInForce]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [TimeInForce] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DAY,
        GOOD_TILL_CANCEL,
        IMMEDIATE_OR_CANCEL,
        FILL_OR_KILL,
        GOOD_TILL_DATE,
        AT_THE_OPENING,
        AT_THE_CLOSE,
        GOOD_TILL_CROSSING,
        GOOD_THROUGH_CROSSING,
        AT_CROSSING,
        OTHER,
        /** An enum member indicating that [TimeInForce] was instantiated with an unknown value. */
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
            DAY -> Value.DAY
            GOOD_TILL_CANCEL -> Value.GOOD_TILL_CANCEL
            IMMEDIATE_OR_CANCEL -> Value.IMMEDIATE_OR_CANCEL
            FILL_OR_KILL -> Value.FILL_OR_KILL
            GOOD_TILL_DATE -> Value.GOOD_TILL_DATE
            AT_THE_OPENING -> Value.AT_THE_OPENING
            AT_THE_CLOSE -> Value.AT_THE_CLOSE
            GOOD_TILL_CROSSING -> Value.GOOD_TILL_CROSSING
            GOOD_THROUGH_CROSSING -> Value.GOOD_THROUGH_CROSSING
            AT_CROSSING -> Value.AT_CROSSING
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
            DAY -> Known.DAY
            GOOD_TILL_CANCEL -> Known.GOOD_TILL_CANCEL
            IMMEDIATE_OR_CANCEL -> Known.IMMEDIATE_OR_CANCEL
            FILL_OR_KILL -> Known.FILL_OR_KILL
            GOOD_TILL_DATE -> Known.GOOD_TILL_DATE
            AT_THE_OPENING -> Known.AT_THE_OPENING
            AT_THE_CLOSE -> Known.AT_THE_CLOSE
            GOOD_TILL_CROSSING -> Known.GOOD_TILL_CROSSING
            GOOD_THROUGH_CROSSING -> Known.GOOD_THROUGH_CROSSING
            AT_CROSSING -> Known.AT_CROSSING
            OTHER -> Known.OTHER
            else -> throw ClearStreetInvalidDataException("Unknown TimeInForce: $value")
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

    fun validate(): TimeInForce = apply {
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

        return other is TimeInForce && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
