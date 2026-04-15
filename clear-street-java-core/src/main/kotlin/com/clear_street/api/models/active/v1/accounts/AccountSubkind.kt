// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Account sub-kind classification providing more granular categorization */
class AccountSubkind @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val AFFILIATE = of("AFFILIATE")

        @JvmField val ALLOCATION = of("ALLOCATION")

        @JvmField val ARRANGING = of("ARRANGING")

        @JvmField val BANK = of("BANK")

        @JvmField val BLOCK_TRADING = of("BLOCK_TRADING")

        @JvmField val CARRY_BROKER = of("CARRY_BROKER")

        @JvmField val CASH = of("CASH")

        @JvmField val CLIENT = of("CLIENT")

        @JvmField val COLLATERAL = of("COLLATERAL")

        @JvmField val COURTESY_MASTER = of("COURTESY_MASTER")

        @JvmField val CROSS = of("CROSS")

        @JvmField val DEPOSIT = of("DEPOSIT")

        @JvmField val DVP = of("DVP")

        @JvmField val ERROR = of("ERROR")

        @JvmField val EXECUTION = of("EXECUTION")

        @JvmField val FACILITATION = of("FACILITATION")

        @JvmField val FUNDING_SOURCE = of("FUNDING_SOURCE")

        @JvmField val HEDGE = of("HEDGE")

        @JvmField val MARGIN = of("MARGIN")

        @JvmField val MUTUAL_FUND = of("MUTUAL_FUND")

        @JvmField val OPERATING = of("OPERATING")

        @JvmField val OTHER = of("OTHER")

        @JvmField val RELATED_MASTER = of("RELATED_MASTER")

        @JvmField val REPO = of("REPO")

        @JvmField val SECURITIES_LENDING = of("SECURITIES_LENDING")

        @JvmField val SHADOW_AWAY = of("SHADOW_AWAY")

        @JvmField val TRADING = of("TRADING")

        @JvmField val TRIPARTY_COLLATERAL_AWAY = of("TRIPARTY_COLLATERAL_AWAY")

        @JvmField val UNKNOWN = of("UNKNOWN")

        @JvmStatic fun of(value: String) = AccountSubkind(JsonField.of(value))
    }

    /** An enum containing [AccountSubkind]'s known values. */
    enum class Known {
        AFFILIATE,
        ALLOCATION,
        ARRANGING,
        BANK,
        BLOCK_TRADING,
        CARRY_BROKER,
        CASH,
        CLIENT,
        COLLATERAL,
        COURTESY_MASTER,
        CROSS,
        DEPOSIT,
        DVP,
        ERROR,
        EXECUTION,
        FACILITATION,
        FUNDING_SOURCE,
        HEDGE,
        MARGIN,
        MUTUAL_FUND,
        OPERATING,
        OTHER,
        RELATED_MASTER,
        REPO,
        SECURITIES_LENDING,
        SHADOW_AWAY,
        TRADING,
        TRIPARTY_COLLATERAL_AWAY,
        UNKNOWN,
    }

    /**
     * An enum containing [AccountSubkind]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [AccountSubkind] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AFFILIATE,
        ALLOCATION,
        ARRANGING,
        BANK,
        BLOCK_TRADING,
        CARRY_BROKER,
        CASH,
        CLIENT,
        COLLATERAL,
        COURTESY_MASTER,
        CROSS,
        DEPOSIT,
        DVP,
        ERROR,
        EXECUTION,
        FACILITATION,
        FUNDING_SOURCE,
        HEDGE,
        MARGIN,
        MUTUAL_FUND,
        OPERATING,
        OTHER,
        RELATED_MASTER,
        REPO,
        SECURITIES_LENDING,
        SHADOW_AWAY,
        TRADING,
        TRIPARTY_COLLATERAL_AWAY,
        UNKNOWN,
        /**
         * An enum member indicating that [AccountSubkind] was instantiated with an unknown value.
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
            AFFILIATE -> Value.AFFILIATE
            ALLOCATION -> Value.ALLOCATION
            ARRANGING -> Value.ARRANGING
            BANK -> Value.BANK
            BLOCK_TRADING -> Value.BLOCK_TRADING
            CARRY_BROKER -> Value.CARRY_BROKER
            CASH -> Value.CASH
            CLIENT -> Value.CLIENT
            COLLATERAL -> Value.COLLATERAL
            COURTESY_MASTER -> Value.COURTESY_MASTER
            CROSS -> Value.CROSS
            DEPOSIT -> Value.DEPOSIT
            DVP -> Value.DVP
            ERROR -> Value.ERROR
            EXECUTION -> Value.EXECUTION
            FACILITATION -> Value.FACILITATION
            FUNDING_SOURCE -> Value.FUNDING_SOURCE
            HEDGE -> Value.HEDGE
            MARGIN -> Value.MARGIN
            MUTUAL_FUND -> Value.MUTUAL_FUND
            OPERATING -> Value.OPERATING
            OTHER -> Value.OTHER
            RELATED_MASTER -> Value.RELATED_MASTER
            REPO -> Value.REPO
            SECURITIES_LENDING -> Value.SECURITIES_LENDING
            SHADOW_AWAY -> Value.SHADOW_AWAY
            TRADING -> Value.TRADING
            TRIPARTY_COLLATERAL_AWAY -> Value.TRIPARTY_COLLATERAL_AWAY
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
            AFFILIATE -> Known.AFFILIATE
            ALLOCATION -> Known.ALLOCATION
            ARRANGING -> Known.ARRANGING
            BANK -> Known.BANK
            BLOCK_TRADING -> Known.BLOCK_TRADING
            CARRY_BROKER -> Known.CARRY_BROKER
            CASH -> Known.CASH
            CLIENT -> Known.CLIENT
            COLLATERAL -> Known.COLLATERAL
            COURTESY_MASTER -> Known.COURTESY_MASTER
            CROSS -> Known.CROSS
            DEPOSIT -> Known.DEPOSIT
            DVP -> Known.DVP
            ERROR -> Known.ERROR
            EXECUTION -> Known.EXECUTION
            FACILITATION -> Known.FACILITATION
            FUNDING_SOURCE -> Known.FUNDING_SOURCE
            HEDGE -> Known.HEDGE
            MARGIN -> Known.MARGIN
            MUTUAL_FUND -> Known.MUTUAL_FUND
            OPERATING -> Known.OPERATING
            OTHER -> Known.OTHER
            RELATED_MASTER -> Known.RELATED_MASTER
            REPO -> Known.REPO
            SECURITIES_LENDING -> Known.SECURITIES_LENDING
            SHADOW_AWAY -> Known.SHADOW_AWAY
            TRADING -> Known.TRADING
            TRIPARTY_COLLATERAL_AWAY -> Known.TRIPARTY_COLLATERAL_AWAY
            UNKNOWN -> Known.UNKNOWN
            else -> throw ClearStreetInvalidDataException("Unknown AccountSubkind: $value")
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

    fun validate(): AccountSubkind = apply {
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

        return other is AccountSubkind && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
