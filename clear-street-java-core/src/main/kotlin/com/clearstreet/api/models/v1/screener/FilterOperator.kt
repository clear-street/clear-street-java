// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Filter operators supported by the screener.
 *
 * Abbreviated and lowercase forms are accepted as serde aliases for backward compatibility with
 * earlier API revisions; the canonical wire form is the SCREAMING_SNAKE_CASE rendering.
 */
class FilterOperator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val LESS_THAN = of("LESS_THAN")

        @JvmField val LESS_OR_EQUAL = of("LESS_OR_EQUAL")

        @JvmField val GREATER_THAN = of("GREATER_THAN")

        @JvmField val GREATER_OR_EQUAL = of("GREATER_OR_EQUAL")

        @JvmField val EQUAL = of("EQUAL")

        @JvmField val BETWEEN = of("BETWEEN")

        @JvmField val NOT_BETWEEN = of("NOT_BETWEEN")

        @JvmField val ONE_OF = of("ONE_OF")

        @JvmField val REGEX = of("REGEX")

        @JvmField val BEGINS_WITH = of("BEGINS_WITH")

        @JvmField val ENDS_WITH = of("ENDS_WITH")

        @JvmField val CONTAINS = of("CONTAINS")

        @JvmField val IS_NULL = of("IS_NULL")

        @JvmField val IS_NOT_NULL = of("IS_NOT_NULL")

        @JvmStatic fun of(value: String) = FilterOperator(JsonField.of(value))
    }

    /** An enum containing [FilterOperator]'s known values. */
    enum class Known {
        LESS_THAN,
        LESS_OR_EQUAL,
        GREATER_THAN,
        GREATER_OR_EQUAL,
        EQUAL,
        BETWEEN,
        NOT_BETWEEN,
        ONE_OF,
        REGEX,
        BEGINS_WITH,
        ENDS_WITH,
        CONTAINS,
        IS_NULL,
        IS_NOT_NULL,
    }

    /**
     * An enum containing [FilterOperator]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [FilterOperator] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        LESS_THAN,
        LESS_OR_EQUAL,
        GREATER_THAN,
        GREATER_OR_EQUAL,
        EQUAL,
        BETWEEN,
        NOT_BETWEEN,
        ONE_OF,
        REGEX,
        BEGINS_WITH,
        ENDS_WITH,
        CONTAINS,
        IS_NULL,
        IS_NOT_NULL,
        /**
         * An enum member indicating that [FilterOperator] was instantiated with an unknown value.
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
            LESS_THAN -> Value.LESS_THAN
            LESS_OR_EQUAL -> Value.LESS_OR_EQUAL
            GREATER_THAN -> Value.GREATER_THAN
            GREATER_OR_EQUAL -> Value.GREATER_OR_EQUAL
            EQUAL -> Value.EQUAL
            BETWEEN -> Value.BETWEEN
            NOT_BETWEEN -> Value.NOT_BETWEEN
            ONE_OF -> Value.ONE_OF
            REGEX -> Value.REGEX
            BEGINS_WITH -> Value.BEGINS_WITH
            ENDS_WITH -> Value.ENDS_WITH
            CONTAINS -> Value.CONTAINS
            IS_NULL -> Value.IS_NULL
            IS_NOT_NULL -> Value.IS_NOT_NULL
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
            LESS_THAN -> Known.LESS_THAN
            LESS_OR_EQUAL -> Known.LESS_OR_EQUAL
            GREATER_THAN -> Known.GREATER_THAN
            GREATER_OR_EQUAL -> Known.GREATER_OR_EQUAL
            EQUAL -> Known.EQUAL
            BETWEEN -> Known.BETWEEN
            NOT_BETWEEN -> Known.NOT_BETWEEN
            ONE_OF -> Known.ONE_OF
            REGEX -> Known.REGEX
            BEGINS_WITH -> Known.BEGINS_WITH
            ENDS_WITH -> Known.ENDS_WITH
            CONTAINS -> Known.CONTAINS
            IS_NULL -> Known.IS_NULL
            IS_NOT_NULL -> Known.IS_NOT_NULL
            else -> throw ClearStreetInvalidDataException("Unknown FilterOperator: $value")
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
    fun validate(): FilterOperator = apply {
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

        return other is FilterOperator && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
