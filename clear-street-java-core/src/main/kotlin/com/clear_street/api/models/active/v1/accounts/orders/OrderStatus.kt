// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Order status */
class OrderStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val PENDING_NEW = of("PENDING_NEW")

        @JvmField val NEW = of("NEW")

        @JvmField val PARTIALLY_FILLED = of("PARTIALLY_FILLED")

        @JvmField val FILLED = of("FILLED")

        @JvmField val CANCELED = of("CANCELED")

        @JvmField val REJECTED = of("REJECTED")

        @JvmField val EXPIRED = of("EXPIRED")

        @JvmField val PENDING_CANCEL = of("PENDING_CANCEL")

        @JvmField val PENDING_REPLACE = of("PENDING_REPLACE")

        @JvmField val REPLACED = of("REPLACED")

        @JvmField val DONE_FOR_DAY = of("DONE_FOR_DAY")

        @JvmField val STOPPED = of("STOPPED")

        @JvmField val SUSPENDED = of("SUSPENDED")

        @JvmField val CALCULATED = of("CALCULATED")

        @JvmField val OTHER = of("OTHER")

        @JvmStatic fun of(value: String) = OrderStatus(JsonField.of(value))
    }

    /** An enum containing [OrderStatus]'s known values. */
    enum class Known {
        PENDING_NEW,
        NEW,
        PARTIALLY_FILLED,
        FILLED,
        CANCELED,
        REJECTED,
        EXPIRED,
        PENDING_CANCEL,
        PENDING_REPLACE,
        REPLACED,
        DONE_FOR_DAY,
        STOPPED,
        SUSPENDED,
        CALCULATED,
        OTHER,
    }

    /**
     * An enum containing [OrderStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [OrderStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PENDING_NEW,
        NEW,
        PARTIALLY_FILLED,
        FILLED,
        CANCELED,
        REJECTED,
        EXPIRED,
        PENDING_CANCEL,
        PENDING_REPLACE,
        REPLACED,
        DONE_FOR_DAY,
        STOPPED,
        SUSPENDED,
        CALCULATED,
        OTHER,
        /** An enum member indicating that [OrderStatus] was instantiated with an unknown value. */
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
            PENDING_NEW -> Value.PENDING_NEW
            NEW -> Value.NEW
            PARTIALLY_FILLED -> Value.PARTIALLY_FILLED
            FILLED -> Value.FILLED
            CANCELED -> Value.CANCELED
            REJECTED -> Value.REJECTED
            EXPIRED -> Value.EXPIRED
            PENDING_CANCEL -> Value.PENDING_CANCEL
            PENDING_REPLACE -> Value.PENDING_REPLACE
            REPLACED -> Value.REPLACED
            DONE_FOR_DAY -> Value.DONE_FOR_DAY
            STOPPED -> Value.STOPPED
            SUSPENDED -> Value.SUSPENDED
            CALCULATED -> Value.CALCULATED
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
            PENDING_NEW -> Known.PENDING_NEW
            NEW -> Known.NEW
            PARTIALLY_FILLED -> Known.PARTIALLY_FILLED
            FILLED -> Known.FILLED
            CANCELED -> Known.CANCELED
            REJECTED -> Known.REJECTED
            EXPIRED -> Known.EXPIRED
            PENDING_CANCEL -> Known.PENDING_CANCEL
            PENDING_REPLACE -> Known.PENDING_REPLACE
            REPLACED -> Known.REPLACED
            DONE_FOR_DAY -> Known.DONE_FOR_DAY
            STOPPED -> Known.STOPPED
            SUSPENDED -> Known.SUSPENDED
            CALCULATED -> Known.CALCULATED
            OTHER -> Known.OTHER
            else -> throw ClearStreetInvalidDataException("Unknown OrderStatus: $value")
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

    fun validate(): OrderStatus = apply {
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

        return other is OrderStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
