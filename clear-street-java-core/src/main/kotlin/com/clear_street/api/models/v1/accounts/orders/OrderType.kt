// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Order type */
class OrderType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val MARKET = of("MARKET")

        @JvmField val LIMIT = of("LIMIT")

        @JvmField val STOP = of("STOP")

        @JvmField val STOP_LIMIT = of("STOP_LIMIT")

        @JvmField val TRAILING_STOP = of("TRAILING_STOP")

        @JvmField val TRAILING_STOP_LIMIT = of("TRAILING_STOP_LIMIT")

        @JvmField val OTHER = of("OTHER")

        @JvmStatic fun of(value: String) = OrderType(JsonField.of(value))
    }

    /** An enum containing [OrderType]'s known values. */
    enum class Known {
        MARKET,
        LIMIT,
        STOP,
        STOP_LIMIT,
        TRAILING_STOP,
        TRAILING_STOP_LIMIT,
        OTHER,
    }

    /**
     * An enum containing [OrderType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [OrderType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        MARKET,
        LIMIT,
        STOP,
        STOP_LIMIT,
        TRAILING_STOP,
        TRAILING_STOP_LIMIT,
        OTHER,
        /** An enum member indicating that [OrderType] was instantiated with an unknown value. */
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
            MARKET -> Value.MARKET
            LIMIT -> Value.LIMIT
            STOP -> Value.STOP
            STOP_LIMIT -> Value.STOP_LIMIT
            TRAILING_STOP -> Value.TRAILING_STOP
            TRAILING_STOP_LIMIT -> Value.TRAILING_STOP_LIMIT
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
            MARKET -> Known.MARKET
            LIMIT -> Known.LIMIT
            STOP -> Known.STOP
            STOP_LIMIT -> Known.STOP_LIMIT
            TRAILING_STOP -> Known.TRAILING_STOP
            TRAILING_STOP_LIMIT -> Known.TRAILING_STOP_LIMIT
            OTHER -> Known.OTHER
            else -> throw ClearStreetInvalidDataException("Unknown OrderType: $value")
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

    fun validate(): OrderType = apply {
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

        return other is OrderType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
