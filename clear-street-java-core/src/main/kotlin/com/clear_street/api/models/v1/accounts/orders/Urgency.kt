// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Urgency level for algorithmic execution */
class Urgency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val SUPER_PASSIVE = of("SUPER_PASSIVE")

        @JvmField val PASSIVE = of("PASSIVE")

        @JvmField val MODERATE = of("MODERATE")

        @JvmField val AGGRESSIVE = of("AGGRESSIVE")

        @JvmField val SUPER_AGGRESSIVE = of("SUPER_AGGRESSIVE")

        @JvmStatic fun of(value: String) = Urgency(JsonField.of(value))
    }

    /** An enum containing [Urgency]'s known values. */
    enum class Known {
        SUPER_PASSIVE,
        PASSIVE,
        MODERATE,
        AGGRESSIVE,
        SUPER_AGGRESSIVE,
    }

    /**
     * An enum containing [Urgency]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Urgency] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SUPER_PASSIVE,
        PASSIVE,
        MODERATE,
        AGGRESSIVE,
        SUPER_AGGRESSIVE,
        /** An enum member indicating that [Urgency] was instantiated with an unknown value. */
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
            SUPER_PASSIVE -> Value.SUPER_PASSIVE
            PASSIVE -> Value.PASSIVE
            MODERATE -> Value.MODERATE
            AGGRESSIVE -> Value.AGGRESSIVE
            SUPER_AGGRESSIVE -> Value.SUPER_AGGRESSIVE
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
            SUPER_PASSIVE -> Known.SUPER_PASSIVE
            PASSIVE -> Known.PASSIVE
            MODERATE -> Known.MODERATE
            AGGRESSIVE -> Known.AGGRESSIVE
            SUPER_AGGRESSIVE -> Known.SUPER_AGGRESSIVE
            else -> throw ClearStreetInvalidDataException("Unknown Urgency: $value")
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

    fun validate(): Urgency = apply {
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

        return other is Urgency && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
