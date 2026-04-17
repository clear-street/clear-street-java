// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Capability allowlist for structured actions.
 *
 * Clients declare which capabilities they support when starting a run. Omni AI will only emit
 * structured actions that match the declared capabilities.
 */
class Capability @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val NAVIGATE = of("NAVIGATE")

        @JvmField val OPEN_CHAT_WINDOW = of("OPEN_CHAT_WINDOW")

        @JvmField val PREFILL_ORDER = of("PREFILL_ORDER")

        @JvmField val OPEN_CHART = of("OPEN_CHART")

        @JvmField val OPEN_SCREENER = of("OPEN_SCREENER")

        @JvmStatic fun of(value: String) = Capability(JsonField.of(value))
    }

    /** An enum containing [Capability]'s known values. */
    enum class Known {
        NAVIGATE,
        OPEN_CHAT_WINDOW,
        PREFILL_ORDER,
        OPEN_CHART,
        OPEN_SCREENER,
    }

    /**
     * An enum containing [Capability]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Capability] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        NAVIGATE,
        OPEN_CHAT_WINDOW,
        PREFILL_ORDER,
        OPEN_CHART,
        OPEN_SCREENER,
        /** An enum member indicating that [Capability] was instantiated with an unknown value. */
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
            NAVIGATE -> Value.NAVIGATE
            OPEN_CHAT_WINDOW -> Value.OPEN_CHAT_WINDOW
            PREFILL_ORDER -> Value.PREFILL_ORDER
            OPEN_CHART -> Value.OPEN_CHART
            OPEN_SCREENER -> Value.OPEN_SCREENER
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
            NAVIGATE -> Known.NAVIGATE
            OPEN_CHAT_WINDOW -> Known.OPEN_CHAT_WINDOW
            PREFILL_ORDER -> Known.PREFILL_ORDER
            OPEN_CHART -> Known.OPEN_CHART
            OPEN_SCREENER -> Known.OPEN_SCREENER
            else -> throw ClearStreetInvalidDataException("Unknown Capability: $value")
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

    fun validate(): Capability = apply {
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

        return other is Capability && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
