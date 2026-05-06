// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.positions.instructions

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Public Active API lifecycle status for a position instruction.
 *
 * Maps 1:1 to the `oems-csc` wire enum while keeping the REST schema stable: api-gw owns
 * serialization, OpenAPI generation, and the `Unknown` fallback for missing or unrecognized gRPC
 * values.
 */
class PositionInstructionStatus
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val SENT = of("SENT")

        @JvmField val ACCEPTED = of("ACCEPTED")

        @JvmField val REJECTED = of("REJECTED")

        @JvmField val ENGINE_REJECTED = of("ENGINE_REJECTED")

        @JvmField val CANCEL_REQUESTED = of("CANCEL_REQUESTED")

        @JvmField val CANCELLED = of("CANCELLED")

        @JvmField val CANCEL_FAILED = of("CANCEL_FAILED")

        @JvmField val UNKNOWN = of("UNKNOWN")

        @JvmStatic fun of(value: String) = PositionInstructionStatus(JsonField.of(value))
    }

    /** An enum containing [PositionInstructionStatus]'s known values. */
    enum class Known {
        SENT,
        ACCEPTED,
        REJECTED,
        ENGINE_REJECTED,
        CANCEL_REQUESTED,
        CANCELLED,
        CANCEL_FAILED,
        UNKNOWN,
    }

    /**
     * An enum containing [PositionInstructionStatus]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [PositionInstructionStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SENT,
        ACCEPTED,
        REJECTED,
        ENGINE_REJECTED,
        CANCEL_REQUESTED,
        CANCELLED,
        CANCEL_FAILED,
        UNKNOWN,
        /**
         * An enum member indicating that [PositionInstructionStatus] was instantiated with an
         * unknown value.
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
            SENT -> Value.SENT
            ACCEPTED -> Value.ACCEPTED
            REJECTED -> Value.REJECTED
            ENGINE_REJECTED -> Value.ENGINE_REJECTED
            CANCEL_REQUESTED -> Value.CANCEL_REQUESTED
            CANCELLED -> Value.CANCELLED
            CANCEL_FAILED -> Value.CANCEL_FAILED
            UNKNOWN -> Value.UNKNOWN
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
            SENT -> Known.SENT
            ACCEPTED -> Known.ACCEPTED
            REJECTED -> Known.REJECTED
            ENGINE_REJECTED -> Known.ENGINE_REJECTED
            CANCEL_REQUESTED -> Known.CANCEL_REQUESTED
            CANCELLED -> Known.CANCELLED
            CANCEL_FAILED -> Known.CANCEL_FAILED
            UNKNOWN -> Known.UNKNOWN
            else ->
                throw ClearStreetInvalidDataException("Unknown PositionInstructionStatus: $value")
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
    fun validate(): PositionInstructionStatus = apply {
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

        return other is PositionInstructionStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
