// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Company document kind. */
class CompanyDocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val COMPANY_PROFILE = of("COMPANY_PROFILE")

        @JvmField val MARKET_RESEARCH = of("MARKET_RESEARCH")

        @JvmField val INTERVIEW = of("INTERVIEW")

        @JvmField val DEAL_SHEET = of("DEAL_SHEET")

        @JvmField val PRESS_RELEASE = of("PRESS_RELEASE")

        @JvmField val NEWS = of("NEWS")

        @JvmField val OTHER = of("OTHER")

        @JvmStatic fun of(value: String) = CompanyDocumentType(JsonField.of(value))
    }

    /** An enum containing [CompanyDocumentType]'s known values. */
    enum class Known {
        COMPANY_PROFILE,
        MARKET_RESEARCH,
        INTERVIEW,
        DEAL_SHEET,
        PRESS_RELEASE,
        NEWS,
        OTHER,
    }

    /**
     * An enum containing [CompanyDocumentType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CompanyDocumentType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        COMPANY_PROFILE,
        MARKET_RESEARCH,
        INTERVIEW,
        DEAL_SHEET,
        PRESS_RELEASE,
        NEWS,
        OTHER,
        /**
         * An enum member indicating that [CompanyDocumentType] was instantiated with an unknown
         * value.
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
            COMPANY_PROFILE -> Value.COMPANY_PROFILE
            MARKET_RESEARCH -> Value.MARKET_RESEARCH
            INTERVIEW -> Value.INTERVIEW
            DEAL_SHEET -> Value.DEAL_SHEET
            PRESS_RELEASE -> Value.PRESS_RELEASE
            NEWS -> Value.NEWS
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
            COMPANY_PROFILE -> Known.COMPANY_PROFILE
            MARKET_RESEARCH -> Known.MARKET_RESEARCH
            INTERVIEW -> Known.INTERVIEW
            DEAL_SHEET -> Known.DEAL_SHEET
            PRESS_RELEASE -> Known.PRESS_RELEASE
            NEWS -> Known.NEWS
            OTHER -> Known.OTHER
            else -> throw ClearStreetInvalidDataException("Unknown CompanyDocumentType: $value")
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
    fun validate(): CompanyDocumentType = apply {
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

        return other is CompanyDocumentType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
