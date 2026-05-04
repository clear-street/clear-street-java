// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Security type */
class SecurityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val COMMON_STOCK = of("COMMON_STOCK")

        @JvmField val PREFERRED_STOCK = of("PREFERRED_STOCK")

        @JvmField val CORPORATE_BOND = of("CORPORATE_BOND")

        @JvmField val OPTION = of("OPTION")

        @JvmField val FUTURE = of("FUTURE")

        @JvmField val WARRANT = of("WARRANT")

        @JvmField val CASH = of("CASH")

        @JvmField val OTHER = of("OTHER")

        @JvmStatic fun of(value: String) = SecurityType(JsonField.of(value))
    }

    /** An enum containing [SecurityType]'s known values. */
    enum class Known {
        COMMON_STOCK,
        PREFERRED_STOCK,
        CORPORATE_BOND,
        OPTION,
        FUTURE,
        WARRANT,
        CASH,
        OTHER,
    }

    /**
     * An enum containing [SecurityType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [SecurityType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        COMMON_STOCK,
        PREFERRED_STOCK,
        CORPORATE_BOND,
        OPTION,
        FUTURE,
        WARRANT,
        CASH,
        OTHER,
        /** An enum member indicating that [SecurityType] was instantiated with an unknown value. */
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
            COMMON_STOCK -> Value.COMMON_STOCK
            PREFERRED_STOCK -> Value.PREFERRED_STOCK
            CORPORATE_BOND -> Value.CORPORATE_BOND
            OPTION -> Value.OPTION
            FUTURE -> Value.FUTURE
            WARRANT -> Value.WARRANT
            CASH -> Value.CASH
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
            COMMON_STOCK -> Known.COMMON_STOCK
            PREFERRED_STOCK -> Known.PREFERRED_STOCK
            CORPORATE_BOND -> Known.CORPORATE_BOND
            OPTION -> Known.OPTION
            FUTURE -> Known.FUTURE
            WARRANT -> Known.WARRANT
            CASH -> Known.CASH
            OTHER -> Known.OTHER
            else -> throw ClearStreetInvalidDataException("Unknown SecurityType: $value")
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

    fun validate(): SecurityType = apply {
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

        return other is SecurityType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
