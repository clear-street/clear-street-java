// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Security identifier source */
class SecurityIdSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val CMS = of("CMS")

        @JvmField val CLST = of("CLST")

        @JvmField val OPRA = of("OPRA")

        @JvmField val FIGI = of("FIGI")

        @JvmField val CUSIP = of("CUSIP")

        @JvmField val CURRENCY = of("CURRENCY")

        @JvmField val FMP = of("FMP")

        @JvmField val OEMS = of("OEMS")

        @JvmField val SEDOL = of("SEDOL")

        @JvmField val QUIK = of("QUIK")

        @JvmField val ISIN = of("ISIN")

        @JvmField val RIC = of("RIC")

        @JvmField val COUNTRY = of("COUNTRY")

        @JvmField val EXCHANGE = of("EXCHANGE")

        @JvmField val CTA = of("CTA")

        @JvmField val BLOOMBERG = of("BLOOMBERG")

        @JvmField val WERTPAPIER = of("WERTPAPIER")

        @JvmField val DUTCH = of("DUTCH")

        @JvmField val VALOREN = of("VALOREN")

        @JvmField val SICOVAM = of("SICOVAM")

        @JvmField val BELGIAN = of("BELGIAN")

        @JvmField val COMMON = of("COMMON")

        @JvmField val CLEARING_HOUSE = of("CLEARING_HOUSE")

        @JvmField val ISDA_FPML_SPECIFICATION = of("ISDA_FPML_SPECIFICATION")

        @JvmField val ISDA_FPML_URL = of("ISDA_FPML_URL")

        @JvmField val LETTER_OF_CREDIT = of("LETTER_OF_CREDIT")

        @JvmField val MARKETPLACE_ASSIGNED_IDENTIFIER = of("MARKETPLACE_ASSIGNED_IDENTIFIER")

        @JvmField val MARKIT_RED_ENTITY_CLIP = of("MARKIT_RED_ENTITY_CLIP")

        @JvmField val MARKIT_RED_PAIR_CLIP = of("MARKIT_RED_PAIR_CLIP")

        @JvmField val CFTC = of("CFTC")

        @JvmField val ISDA_COMMODITY_REFERENCE_PRICE = of("ISDA_COMMODITY_REFERENCE_PRICE")

        @JvmField val LEGAL_ENTITY_IDENTIFIER = of("LEGAL_ENTITY_IDENTIFIER")

        @JvmField val SYNTHETIC = of("SYNTHETIC")

        @JvmField val FIDESSA_INSTRUMENT_MNEMONIC = of("FIDESSA_INSTRUMENT_MNEMONIC")

        @JvmField val INDEX_NAME = of("INDEX_NAME")

        @JvmField val UNIFORM_SYMBOL = of("UNIFORM_SYMBOL")

        @JvmField val DIGITAL_TOKEN_IDENTIFIER = of("DIGITAL_TOKEN_IDENTIFIER")

        @JvmField val MASSIVE = of("MASSIVE")

        @JvmField val OTHER = of("OTHER")

        @JvmStatic fun of(value: String) = SecurityIdSource(JsonField.of(value))
    }

    /** An enum containing [SecurityIdSource]'s known values. */
    enum class Known {
        CMS,
        CLST,
        OPRA,
        FIGI,
        CUSIP,
        CURRENCY,
        FMP,
        OEMS,
        SEDOL,
        QUIK,
        ISIN,
        RIC,
        COUNTRY,
        EXCHANGE,
        CTA,
        BLOOMBERG,
        WERTPAPIER,
        DUTCH,
        VALOREN,
        SICOVAM,
        BELGIAN,
        COMMON,
        CLEARING_HOUSE,
        ISDA_FPML_SPECIFICATION,
        ISDA_FPML_URL,
        LETTER_OF_CREDIT,
        MARKETPLACE_ASSIGNED_IDENTIFIER,
        MARKIT_RED_ENTITY_CLIP,
        MARKIT_RED_PAIR_CLIP,
        CFTC,
        ISDA_COMMODITY_REFERENCE_PRICE,
        LEGAL_ENTITY_IDENTIFIER,
        SYNTHETIC,
        FIDESSA_INSTRUMENT_MNEMONIC,
        INDEX_NAME,
        UNIFORM_SYMBOL,
        DIGITAL_TOKEN_IDENTIFIER,
        MASSIVE,
        OTHER,
    }

    /**
     * An enum containing [SecurityIdSource]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [SecurityIdSource] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        CMS,
        CLST,
        OPRA,
        FIGI,
        CUSIP,
        CURRENCY,
        FMP,
        OEMS,
        SEDOL,
        QUIK,
        ISIN,
        RIC,
        COUNTRY,
        EXCHANGE,
        CTA,
        BLOOMBERG,
        WERTPAPIER,
        DUTCH,
        VALOREN,
        SICOVAM,
        BELGIAN,
        COMMON,
        CLEARING_HOUSE,
        ISDA_FPML_SPECIFICATION,
        ISDA_FPML_URL,
        LETTER_OF_CREDIT,
        MARKETPLACE_ASSIGNED_IDENTIFIER,
        MARKIT_RED_ENTITY_CLIP,
        MARKIT_RED_PAIR_CLIP,
        CFTC,
        ISDA_COMMODITY_REFERENCE_PRICE,
        LEGAL_ENTITY_IDENTIFIER,
        SYNTHETIC,
        FIDESSA_INSTRUMENT_MNEMONIC,
        INDEX_NAME,
        UNIFORM_SYMBOL,
        DIGITAL_TOKEN_IDENTIFIER,
        MASSIVE,
        OTHER,
        /**
         * An enum member indicating that [SecurityIdSource] was instantiated with an unknown value.
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
            CMS -> Value.CMS
            CLST -> Value.CLST
            OPRA -> Value.OPRA
            FIGI -> Value.FIGI
            CUSIP -> Value.CUSIP
            CURRENCY -> Value.CURRENCY
            FMP -> Value.FMP
            OEMS -> Value.OEMS
            SEDOL -> Value.SEDOL
            QUIK -> Value.QUIK
            ISIN -> Value.ISIN
            RIC -> Value.RIC
            COUNTRY -> Value.COUNTRY
            EXCHANGE -> Value.EXCHANGE
            CTA -> Value.CTA
            BLOOMBERG -> Value.BLOOMBERG
            WERTPAPIER -> Value.WERTPAPIER
            DUTCH -> Value.DUTCH
            VALOREN -> Value.VALOREN
            SICOVAM -> Value.SICOVAM
            BELGIAN -> Value.BELGIAN
            COMMON -> Value.COMMON
            CLEARING_HOUSE -> Value.CLEARING_HOUSE
            ISDA_FPML_SPECIFICATION -> Value.ISDA_FPML_SPECIFICATION
            ISDA_FPML_URL -> Value.ISDA_FPML_URL
            LETTER_OF_CREDIT -> Value.LETTER_OF_CREDIT
            MARKETPLACE_ASSIGNED_IDENTIFIER -> Value.MARKETPLACE_ASSIGNED_IDENTIFIER
            MARKIT_RED_ENTITY_CLIP -> Value.MARKIT_RED_ENTITY_CLIP
            MARKIT_RED_PAIR_CLIP -> Value.MARKIT_RED_PAIR_CLIP
            CFTC -> Value.CFTC
            ISDA_COMMODITY_REFERENCE_PRICE -> Value.ISDA_COMMODITY_REFERENCE_PRICE
            LEGAL_ENTITY_IDENTIFIER -> Value.LEGAL_ENTITY_IDENTIFIER
            SYNTHETIC -> Value.SYNTHETIC
            FIDESSA_INSTRUMENT_MNEMONIC -> Value.FIDESSA_INSTRUMENT_MNEMONIC
            INDEX_NAME -> Value.INDEX_NAME
            UNIFORM_SYMBOL -> Value.UNIFORM_SYMBOL
            DIGITAL_TOKEN_IDENTIFIER -> Value.DIGITAL_TOKEN_IDENTIFIER
            MASSIVE -> Value.MASSIVE
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
            CMS -> Known.CMS
            CLST -> Known.CLST
            OPRA -> Known.OPRA
            FIGI -> Known.FIGI
            CUSIP -> Known.CUSIP
            CURRENCY -> Known.CURRENCY
            FMP -> Known.FMP
            OEMS -> Known.OEMS
            SEDOL -> Known.SEDOL
            QUIK -> Known.QUIK
            ISIN -> Known.ISIN
            RIC -> Known.RIC
            COUNTRY -> Known.COUNTRY
            EXCHANGE -> Known.EXCHANGE
            CTA -> Known.CTA
            BLOOMBERG -> Known.BLOOMBERG
            WERTPAPIER -> Known.WERTPAPIER
            DUTCH -> Known.DUTCH
            VALOREN -> Known.VALOREN
            SICOVAM -> Known.SICOVAM
            BELGIAN -> Known.BELGIAN
            COMMON -> Known.COMMON
            CLEARING_HOUSE -> Known.CLEARING_HOUSE
            ISDA_FPML_SPECIFICATION -> Known.ISDA_FPML_SPECIFICATION
            ISDA_FPML_URL -> Known.ISDA_FPML_URL
            LETTER_OF_CREDIT -> Known.LETTER_OF_CREDIT
            MARKETPLACE_ASSIGNED_IDENTIFIER -> Known.MARKETPLACE_ASSIGNED_IDENTIFIER
            MARKIT_RED_ENTITY_CLIP -> Known.MARKIT_RED_ENTITY_CLIP
            MARKIT_RED_PAIR_CLIP -> Known.MARKIT_RED_PAIR_CLIP
            CFTC -> Known.CFTC
            ISDA_COMMODITY_REFERENCE_PRICE -> Known.ISDA_COMMODITY_REFERENCE_PRICE
            LEGAL_ENTITY_IDENTIFIER -> Known.LEGAL_ENTITY_IDENTIFIER
            SYNTHETIC -> Known.SYNTHETIC
            FIDESSA_INSTRUMENT_MNEMONIC -> Known.FIDESSA_INSTRUMENT_MNEMONIC
            INDEX_NAME -> Known.INDEX_NAME
            UNIFORM_SYMBOL -> Known.UNIFORM_SYMBOL
            DIGITAL_TOKEN_IDENTIFIER -> Known.DIGITAL_TOKEN_IDENTIFIER
            MASSIVE -> Known.MASSIVE
            OTHER -> Known.OTHER
            else -> throw ClearStreetInvalidDataException("Unknown SecurityIdSource: $value")
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

    fun validate(): SecurityIdSource = apply {
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

        return other is SecurityIdSource && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
