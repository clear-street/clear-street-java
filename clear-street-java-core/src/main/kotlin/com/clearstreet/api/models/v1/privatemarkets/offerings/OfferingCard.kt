// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * One offering as it appears in a list: its derived class, indicative terms, a company identity
 * summary, and any attached SPV.
 */
class OfferingCard
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val class_: JsonField<OfferingClass>,
    private val company: JsonField<OfferingCompany>,
    private val currency: JsonField<Currency>,
    private val headline: JsonField<String>,
    private val summary: JsonField<String>,
    private val indicativePriceHigh: JsonField<String>,
    private val indicativePriceLow: JsonField<String>,
    private val indicativeValuationBasis: JsonField<ValuationBasis>,
    private val indicativeValuationHigh: JsonField<String>,
    private val indicativeValuationLow: JsonField<String>,
    private val ioiDeadline: JsonField<OffsetDateTime>,
    private val minimumIoiAmount: JsonField<String>,
    private val spv: JsonField<OfferingSpv>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class") @ExcludeMissing class_: JsonField<OfferingClass> = JsonMissing.of(),
        @JsonProperty("company")
        @ExcludeMissing
        company: JsonField<OfferingCompany> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("headline") @ExcludeMissing headline: JsonField<String> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("indicative_price_high")
        @ExcludeMissing
        indicativePriceHigh: JsonField<String> = JsonMissing.of(),
        @JsonProperty("indicative_price_low")
        @ExcludeMissing
        indicativePriceLow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("indicative_valuation_basis")
        @ExcludeMissing
        indicativeValuationBasis: JsonField<ValuationBasis> = JsonMissing.of(),
        @JsonProperty("indicative_valuation_high")
        @ExcludeMissing
        indicativeValuationHigh: JsonField<String> = JsonMissing.of(),
        @JsonProperty("indicative_valuation_low")
        @ExcludeMissing
        indicativeValuationLow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ioi_deadline")
        @ExcludeMissing
        ioiDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("minimum_ioi_amount")
        @ExcludeMissing
        minimumIoiAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spv") @ExcludeMissing spv: JsonField<OfferingSpv> = JsonMissing.of(),
    ) : this(
        id,
        class_,
        company,
        currency,
        headline,
        summary,
        indicativePriceHigh,
        indicativePriceLow,
        indicativeValuationBasis,
        indicativeValuationHigh,
        indicativeValuationLow,
        ioiDeadline,
        minimumIoiAmount,
        spv,
        mutableMapOf(),
    )

    /**
     * Stable public identifier; IOIs and history hang off it.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Derived classification.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun class_(): OfferingClass = class_.getRequired("class")

    /**
     * Owning company identity.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun company(): OfferingCompany = company.getRequired("company")

    /**
     * Terms currency.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Card/detail headline.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun headline(): String = headline.getRequired("headline")

    /**
     * Top opportunity paragraph.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun summary(): String = summary.getRequired("summary")

    /**
     * Indicative price-per-share range, high endpoint.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indicativePriceHigh(): Optional<String> =
        indicativePriceHigh.getOptional("indicative_price_high")

    /**
     * Indicative price-per-share range, low endpoint.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indicativePriceLow(): Optional<String> =
        indicativePriceLow.getOptional("indicative_price_low")

    /**
     * Meaning of the indicative valuation range.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indicativeValuationBasis(): Optional<ValuationBasis> =
        indicativeValuationBasis.getOptional("indicative_valuation_basis")

    /**
     * Indicative valuation range, high endpoint.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indicativeValuationHigh(): Optional<String> =
        indicativeValuationHigh.getOptional("indicative_valuation_high")

    /**
     * Indicative valuation range, low endpoint.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indicativeValuationLow(): Optional<String> =
        indicativeValuationLow.getOptional("indicative_valuation_low")

    /**
     * Deadline for indications of interest.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ioiDeadline(): Optional<OffsetDateTime> = ioiDeadline.getOptional("ioi_deadline")

    /**
     * Minimum indication-of-interest amount.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumIoiAmount(): Optional<String> = minimumIoiAmount.getOptional("minimum_ioi_amount")

    /**
     * Attached SPV identity and lifecycle, once one exists.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spv(): Optional<OfferingSpv> = spv.getOptional("spv")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [class_].
     *
     * Unlike [class_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class") @ExcludeMissing fun _class_(): JsonField<OfferingClass> = class_

    /**
     * Returns the raw JSON value of [company].
     *
     * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<OfferingCompany> = company

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [headline].
     *
     * Unlike [headline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headline") @ExcludeMissing fun _headline(): JsonField<String> = headline

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

    /**
     * Returns the raw JSON value of [indicativePriceHigh].
     *
     * Unlike [indicativePriceHigh], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("indicative_price_high")
    @ExcludeMissing
    fun _indicativePriceHigh(): JsonField<String> = indicativePriceHigh

    /**
     * Returns the raw JSON value of [indicativePriceLow].
     *
     * Unlike [indicativePriceLow], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("indicative_price_low")
    @ExcludeMissing
    fun _indicativePriceLow(): JsonField<String> = indicativePriceLow

    /**
     * Returns the raw JSON value of [indicativeValuationBasis].
     *
     * Unlike [indicativeValuationBasis], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("indicative_valuation_basis")
    @ExcludeMissing
    fun _indicativeValuationBasis(): JsonField<ValuationBasis> = indicativeValuationBasis

    /**
     * Returns the raw JSON value of [indicativeValuationHigh].
     *
     * Unlike [indicativeValuationHigh], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("indicative_valuation_high")
    @ExcludeMissing
    fun _indicativeValuationHigh(): JsonField<String> = indicativeValuationHigh

    /**
     * Returns the raw JSON value of [indicativeValuationLow].
     *
     * Unlike [indicativeValuationLow], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("indicative_valuation_low")
    @ExcludeMissing
    fun _indicativeValuationLow(): JsonField<String> = indicativeValuationLow

    /**
     * Returns the raw JSON value of [ioiDeadline].
     *
     * Unlike [ioiDeadline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ioi_deadline")
    @ExcludeMissing
    fun _ioiDeadline(): JsonField<OffsetDateTime> = ioiDeadline

    /**
     * Returns the raw JSON value of [minimumIoiAmount].
     *
     * Unlike [minimumIoiAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minimum_ioi_amount")
    @ExcludeMissing
    fun _minimumIoiAmount(): JsonField<String> = minimumIoiAmount

    /**
     * Returns the raw JSON value of [spv].
     *
     * Unlike [spv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spv") @ExcludeMissing fun _spv(): JsonField<OfferingSpv> = spv

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OfferingCard].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .class_()
         * .company()
         * .currency()
         * .headline()
         * .summary()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OfferingCard]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var class_: JsonField<OfferingClass>? = null
        private var company: JsonField<OfferingCompany>? = null
        private var currency: JsonField<Currency>? = null
        private var headline: JsonField<String>? = null
        private var summary: JsonField<String>? = null
        private var indicativePriceHigh: JsonField<String> = JsonMissing.of()
        private var indicativePriceLow: JsonField<String> = JsonMissing.of()
        private var indicativeValuationBasis: JsonField<ValuationBasis> = JsonMissing.of()
        private var indicativeValuationHigh: JsonField<String> = JsonMissing.of()
        private var indicativeValuationLow: JsonField<String> = JsonMissing.of()
        private var ioiDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
        private var minimumIoiAmount: JsonField<String> = JsonMissing.of()
        private var spv: JsonField<OfferingSpv> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(offeringCard: OfferingCard) = apply {
            id = offeringCard.id
            class_ = offeringCard.class_
            company = offeringCard.company
            currency = offeringCard.currency
            headline = offeringCard.headline
            summary = offeringCard.summary
            indicativePriceHigh = offeringCard.indicativePriceHigh
            indicativePriceLow = offeringCard.indicativePriceLow
            indicativeValuationBasis = offeringCard.indicativeValuationBasis
            indicativeValuationHigh = offeringCard.indicativeValuationHigh
            indicativeValuationLow = offeringCard.indicativeValuationLow
            ioiDeadline = offeringCard.ioiDeadline
            minimumIoiAmount = offeringCard.minimumIoiAmount
            spv = offeringCard.spv
            additionalProperties = offeringCard.additionalProperties.toMutableMap()
        }

        /** Stable public identifier; IOIs and history hang off it. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Derived classification. */
        fun class_(class_: OfferingClass) = class_(JsonField.of(class_))

        /**
         * Sets [Builder.class_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.class_] with a well-typed [OfferingClass] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun class_(class_: JsonField<OfferingClass>) = apply { this.class_ = class_ }

        /** Owning company identity. */
        fun company(company: OfferingCompany) = company(JsonField.of(company))

        /**
         * Sets [Builder.company] to an arbitrary JSON value.
         *
         * You should usually call [Builder.company] with a well-typed [OfferingCompany] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun company(company: JsonField<OfferingCompany>) = apply { this.company = company }

        /** Terms currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Card/detail headline. */
        fun headline(headline: String) = headline(JsonField.of(headline))

        /**
         * Sets [Builder.headline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headline] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headline(headline: JsonField<String>) = apply { this.headline = headline }

        /** Top opportunity paragraph. */
        fun summary(summary: String) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

        /** Indicative price-per-share range, high endpoint. */
        fun indicativePriceHigh(indicativePriceHigh: String?) =
            indicativePriceHigh(JsonField.ofNullable(indicativePriceHigh))

        /**
         * Alias for calling [Builder.indicativePriceHigh] with `indicativePriceHigh.orElse(null)`.
         */
        fun indicativePriceHigh(indicativePriceHigh: Optional<String>) =
            indicativePriceHigh(indicativePriceHigh.getOrNull())

        /**
         * Sets [Builder.indicativePriceHigh] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indicativePriceHigh] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indicativePriceHigh(indicativePriceHigh: JsonField<String>) = apply {
            this.indicativePriceHigh = indicativePriceHigh
        }

        /** Indicative price-per-share range, low endpoint. */
        fun indicativePriceLow(indicativePriceLow: String?) =
            indicativePriceLow(JsonField.ofNullable(indicativePriceLow))

        /**
         * Alias for calling [Builder.indicativePriceLow] with `indicativePriceLow.orElse(null)`.
         */
        fun indicativePriceLow(indicativePriceLow: Optional<String>) =
            indicativePriceLow(indicativePriceLow.getOrNull())

        /**
         * Sets [Builder.indicativePriceLow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indicativePriceLow] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indicativePriceLow(indicativePriceLow: JsonField<String>) = apply {
            this.indicativePriceLow = indicativePriceLow
        }

        /** Meaning of the indicative valuation range. */
        fun indicativeValuationBasis(indicativeValuationBasis: ValuationBasis?) =
            indicativeValuationBasis(JsonField.ofNullable(indicativeValuationBasis))

        /**
         * Alias for calling [Builder.indicativeValuationBasis] with
         * `indicativeValuationBasis.orElse(null)`.
         */
        fun indicativeValuationBasis(indicativeValuationBasis: Optional<ValuationBasis>) =
            indicativeValuationBasis(indicativeValuationBasis.getOrNull())

        /**
         * Sets [Builder.indicativeValuationBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indicativeValuationBasis] with a well-typed
         * [ValuationBasis] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun indicativeValuationBasis(indicativeValuationBasis: JsonField<ValuationBasis>) = apply {
            this.indicativeValuationBasis = indicativeValuationBasis
        }

        /** Indicative valuation range, high endpoint. */
        fun indicativeValuationHigh(indicativeValuationHigh: String?) =
            indicativeValuationHigh(JsonField.ofNullable(indicativeValuationHigh))

        /**
         * Alias for calling [Builder.indicativeValuationHigh] with
         * `indicativeValuationHigh.orElse(null)`.
         */
        fun indicativeValuationHigh(indicativeValuationHigh: Optional<String>) =
            indicativeValuationHigh(indicativeValuationHigh.getOrNull())

        /**
         * Sets [Builder.indicativeValuationHigh] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indicativeValuationHigh] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun indicativeValuationHigh(indicativeValuationHigh: JsonField<String>) = apply {
            this.indicativeValuationHigh = indicativeValuationHigh
        }

        /** Indicative valuation range, low endpoint. */
        fun indicativeValuationLow(indicativeValuationLow: String?) =
            indicativeValuationLow(JsonField.ofNullable(indicativeValuationLow))

        /**
         * Alias for calling [Builder.indicativeValuationLow] with
         * `indicativeValuationLow.orElse(null)`.
         */
        fun indicativeValuationLow(indicativeValuationLow: Optional<String>) =
            indicativeValuationLow(indicativeValuationLow.getOrNull())

        /**
         * Sets [Builder.indicativeValuationLow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indicativeValuationLow] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indicativeValuationLow(indicativeValuationLow: JsonField<String>) = apply {
            this.indicativeValuationLow = indicativeValuationLow
        }

        /** Deadline for indications of interest. */
        fun ioiDeadline(ioiDeadline: OffsetDateTime?) =
            ioiDeadline(JsonField.ofNullable(ioiDeadline))

        /** Alias for calling [Builder.ioiDeadline] with `ioiDeadline.orElse(null)`. */
        fun ioiDeadline(ioiDeadline: Optional<OffsetDateTime>) =
            ioiDeadline(ioiDeadline.getOrNull())

        /**
         * Sets [Builder.ioiDeadline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ioiDeadline] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ioiDeadline(ioiDeadline: JsonField<OffsetDateTime>) = apply {
            this.ioiDeadline = ioiDeadline
        }

        /** Minimum indication-of-interest amount. */
        fun minimumIoiAmount(minimumIoiAmount: String?) =
            minimumIoiAmount(JsonField.ofNullable(minimumIoiAmount))

        /** Alias for calling [Builder.minimumIoiAmount] with `minimumIoiAmount.orElse(null)`. */
        fun minimumIoiAmount(minimumIoiAmount: Optional<String>) =
            minimumIoiAmount(minimumIoiAmount.getOrNull())

        /**
         * Sets [Builder.minimumIoiAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumIoiAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minimumIoiAmount(minimumIoiAmount: JsonField<String>) = apply {
            this.minimumIoiAmount = minimumIoiAmount
        }

        /** Attached SPV identity and lifecycle, once one exists. */
        fun spv(spv: OfferingSpv?) = spv(JsonField.ofNullable(spv))

        /** Alias for calling [Builder.spv] with `spv.orElse(null)`. */
        fun spv(spv: Optional<OfferingSpv>) = spv(spv.getOrNull())

        /**
         * Sets [Builder.spv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spv] with a well-typed [OfferingSpv] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spv(spv: JsonField<OfferingSpv>) = apply { this.spv = spv }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [OfferingCard].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .class_()
         * .company()
         * .currency()
         * .headline()
         * .summary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OfferingCard =
            OfferingCard(
                checkRequired("id", id),
                checkRequired("class_", class_),
                checkRequired("company", company),
                checkRequired("currency", currency),
                checkRequired("headline", headline),
                checkRequired("summary", summary),
                indicativePriceHigh,
                indicativePriceLow,
                indicativeValuationBasis,
                indicativeValuationHigh,
                indicativeValuationLow,
                ioiDeadline,
                minimumIoiAmount,
                spv,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ClearStreetInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): OfferingCard = apply {
        if (validated) {
            return@apply
        }

        id()
        class_().validate()
        company().validate()
        currency().validate()
        headline()
        summary()
        indicativePriceHigh()
        indicativePriceLow()
        indicativeValuationBasis().ifPresent { it.validate() }
        indicativeValuationHigh()
        indicativeValuationLow()
        ioiDeadline()
        minimumIoiAmount()
        spv().ifPresent { it.validate() }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (class_.asKnown().getOrNull()?.validity() ?: 0) +
            (company.asKnown().getOrNull()?.validity() ?: 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (headline.asKnown().isPresent) 1 else 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (if (indicativePriceHigh.asKnown().isPresent) 1 else 0) +
            (if (indicativePriceLow.asKnown().isPresent) 1 else 0) +
            (indicativeValuationBasis.asKnown().getOrNull()?.validity() ?: 0) +
            (if (indicativeValuationHigh.asKnown().isPresent) 1 else 0) +
            (if (indicativeValuationLow.asKnown().isPresent) 1 else 0) +
            (if (ioiDeadline.asKnown().isPresent) 1 else 0) +
            (if (minimumIoiAmount.asKnown().isPresent) 1 else 0) +
            (spv.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OfferingCard &&
            id == other.id &&
            class_ == other.class_ &&
            company == other.company &&
            currency == other.currency &&
            headline == other.headline &&
            summary == other.summary &&
            indicativePriceHigh == other.indicativePriceHigh &&
            indicativePriceLow == other.indicativePriceLow &&
            indicativeValuationBasis == other.indicativeValuationBasis &&
            indicativeValuationHigh == other.indicativeValuationHigh &&
            indicativeValuationLow == other.indicativeValuationLow &&
            ioiDeadline == other.ioiDeadline &&
            minimumIoiAmount == other.minimumIoiAmount &&
            spv == other.spv &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            class_,
            company,
            currency,
            headline,
            summary,
            indicativePriceHigh,
            indicativePriceLow,
            indicativeValuationBasis,
            indicativeValuationHigh,
            indicativeValuationLow,
            ioiDeadline,
            minimumIoiAmount,
            spv,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OfferingCard{id=$id, class_=$class_, company=$company, currency=$currency, headline=$headline, summary=$summary, indicativePriceHigh=$indicativePriceHigh, indicativePriceLow=$indicativePriceLow, indicativeValuationBasis=$indicativeValuationBasis, indicativeValuationHigh=$indicativeValuationHigh, indicativeValuationLow=$indicativeValuationLow, ioiDeadline=$ioiDeadline, minimumIoiAmount=$minimumIoiAmount, spv=$spv, additionalProperties=$additionalProperties}"
}
