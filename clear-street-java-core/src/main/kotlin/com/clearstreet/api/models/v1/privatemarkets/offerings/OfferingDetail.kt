// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
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

/** One offering with everything needed to render its detail payload. */
class OfferingDetail
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
    private val disclosures: JsonField<String>,
    private val documents: JsonField<List<OfferingDocumentResource>>,
    private val highlights: JsonField<List<OfferingHighlight>>,
    private val investmentThesis: JsonField<String>,
    private val keyRisks: JsonField<List<OfferingKeyRisk>>,
    private val participants: JsonField<List<OfferingParticipantResource>>,
    private val structureDescription: JsonField<String>,
    private val whyNow: JsonField<String>,
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
        @JsonProperty("disclosures")
        @ExcludeMissing
        disclosures: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<OfferingDocumentResource>> = JsonMissing.of(),
        @JsonProperty("highlights")
        @ExcludeMissing
        highlights: JsonField<List<OfferingHighlight>> = JsonMissing.of(),
        @JsonProperty("investment_thesis")
        @ExcludeMissing
        investmentThesis: JsonField<String> = JsonMissing.of(),
        @JsonProperty("key_risks")
        @ExcludeMissing
        keyRisks: JsonField<List<OfferingKeyRisk>> = JsonMissing.of(),
        @JsonProperty("participants")
        @ExcludeMissing
        participants: JsonField<List<OfferingParticipantResource>> = JsonMissing.of(),
        @JsonProperty("structure_description")
        @ExcludeMissing
        structureDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("why_now") @ExcludeMissing whyNow: JsonField<String> = JsonMissing.of(),
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
        disclosures,
        documents,
        highlights,
        investmentThesis,
        keyRisks,
        participants,
        structureDescription,
        whyNow,
        mutableMapOf(),
    )

    fun toOfferingCard(): OfferingCard =
        OfferingCard.builder()
            .id(id)
            .class_(class_)
            .company(company)
            .currency(currency)
            .headline(headline)
            .summary(summary)
            .indicativePriceHigh(indicativePriceHigh)
            .indicativePriceLow(indicativePriceLow)
            .indicativeValuationBasis(indicativeValuationBasis)
            .indicativeValuationHigh(indicativeValuationHigh)
            .indicativeValuationLow(indicativeValuationLow)
            .ioiDeadline(ioiDeadline)
            .minimumIoiAmount(minimumIoiAmount)
            .spv(spv)
            .build()

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
     * Important disclosures.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disclosures(): Optional<String> = disclosures.getOptional("disclosures")

    /**
     * Campaign documents in display order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<OfferingDocumentResource>> = documents.getOptional("documents")

    /**
     * Ordered resolved highlights.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun highlights(): Optional<List<OfferingHighlight>> = highlights.getOptional("highlights")

    /**
     * Campaign-specific investment framing.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun investmentThesis(): Optional<String> = investmentThesis.getOptional("investment_thesis")

    /**
     * Ordered key risks.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyRisks(): Optional<List<OfferingKeyRisk>> = keyRisks.getOptional("key_risks")

    /**
     * Campaign participants in display order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun participants(): Optional<List<OfferingParticipantResource>> =
        participants.getOptional("participants")

    /**
     * Vehicle/structure framing shown before typed SPV terms exist.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun structureDescription(): Optional<String> =
        structureDescription.getOptional("structure_description")

    /**
     * Why-now framing.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whyNow(): Optional<String> = whyNow.getOptional("why_now")

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

    /**
     * Returns the raw JSON value of [disclosures].
     *
     * Unlike [disclosures], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disclosures") @ExcludeMissing fun _disclosures(): JsonField<String> = disclosures

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<OfferingDocumentResource>> = documents

    /**
     * Returns the raw JSON value of [highlights].
     *
     * Unlike [highlights], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("highlights")
    @ExcludeMissing
    fun _highlights(): JsonField<List<OfferingHighlight>> = highlights

    /**
     * Returns the raw JSON value of [investmentThesis].
     *
     * Unlike [investmentThesis], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("investment_thesis")
    @ExcludeMissing
    fun _investmentThesis(): JsonField<String> = investmentThesis

    /**
     * Returns the raw JSON value of [keyRisks].
     *
     * Unlike [keyRisks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key_risks")
    @ExcludeMissing
    fun _keyRisks(): JsonField<List<OfferingKeyRisk>> = keyRisks

    /**
     * Returns the raw JSON value of [participants].
     *
     * Unlike [participants], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("participants")
    @ExcludeMissing
    fun _participants(): JsonField<List<OfferingParticipantResource>> = participants

    /**
     * Returns the raw JSON value of [structureDescription].
     *
     * Unlike [structureDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("structure_description")
    @ExcludeMissing
    fun _structureDescription(): JsonField<String> = structureDescription

    /**
     * Returns the raw JSON value of [whyNow].
     *
     * Unlike [whyNow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("why_now") @ExcludeMissing fun _whyNow(): JsonField<String> = whyNow

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
         * Returns a mutable builder for constructing an instance of [OfferingDetail].
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

    /** A builder for [OfferingDetail]. */
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
        private var disclosures: JsonField<String> = JsonMissing.of()
        private var documents: JsonField<MutableList<OfferingDocumentResource>>? = null
        private var highlights: JsonField<MutableList<OfferingHighlight>>? = null
        private var investmentThesis: JsonField<String> = JsonMissing.of()
        private var keyRisks: JsonField<MutableList<OfferingKeyRisk>>? = null
        private var participants: JsonField<MutableList<OfferingParticipantResource>>? = null
        private var structureDescription: JsonField<String> = JsonMissing.of()
        private var whyNow: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(offeringDetail: OfferingDetail) = apply {
            id = offeringDetail.id
            class_ = offeringDetail.class_
            company = offeringDetail.company
            currency = offeringDetail.currency
            headline = offeringDetail.headline
            summary = offeringDetail.summary
            indicativePriceHigh = offeringDetail.indicativePriceHigh
            indicativePriceLow = offeringDetail.indicativePriceLow
            indicativeValuationBasis = offeringDetail.indicativeValuationBasis
            indicativeValuationHigh = offeringDetail.indicativeValuationHigh
            indicativeValuationLow = offeringDetail.indicativeValuationLow
            ioiDeadline = offeringDetail.ioiDeadline
            minimumIoiAmount = offeringDetail.minimumIoiAmount
            spv = offeringDetail.spv
            disclosures = offeringDetail.disclosures
            documents = offeringDetail.documents.map { it.toMutableList() }
            highlights = offeringDetail.highlights.map { it.toMutableList() }
            investmentThesis = offeringDetail.investmentThesis
            keyRisks = offeringDetail.keyRisks.map { it.toMutableList() }
            participants = offeringDetail.participants.map { it.toMutableList() }
            structureDescription = offeringDetail.structureDescription
            whyNow = offeringDetail.whyNow
            additionalProperties = offeringDetail.additionalProperties.toMutableMap()
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

        /** Important disclosures. */
        fun disclosures(disclosures: String?) = disclosures(JsonField.ofNullable(disclosures))

        /** Alias for calling [Builder.disclosures] with `disclosures.orElse(null)`. */
        fun disclosures(disclosures: Optional<String>) = disclosures(disclosures.getOrNull())

        /**
         * Sets [Builder.disclosures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disclosures] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disclosures(disclosures: JsonField<String>) = apply { this.disclosures = disclosures }

        /** Campaign documents in display order. */
        fun documents(documents: List<OfferingDocumentResource>) =
            documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed
         * `List<OfferingDocumentResource>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun documents(documents: JsonField<List<OfferingDocumentResource>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [OfferingDocumentResource] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: OfferingDocumentResource) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        /** Ordered resolved highlights. */
        fun highlights(highlights: List<OfferingHighlight>) = highlights(JsonField.of(highlights))

        /**
         * Sets [Builder.highlights] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highlights] with a well-typed `List<OfferingHighlight>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun highlights(highlights: JsonField<List<OfferingHighlight>>) = apply {
            this.highlights = highlights.map { it.toMutableList() }
        }

        /**
         * Adds a single [OfferingHighlight] to [highlights].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHighlight(highlight: OfferingHighlight) = apply {
            highlights =
                (highlights ?: JsonField.of(mutableListOf())).also {
                    checkKnown("highlights", it).add(highlight)
                }
        }

        /** Campaign-specific investment framing. */
        fun investmentThesis(investmentThesis: String?) =
            investmentThesis(JsonField.ofNullable(investmentThesis))

        /** Alias for calling [Builder.investmentThesis] with `investmentThesis.orElse(null)`. */
        fun investmentThesis(investmentThesis: Optional<String>) =
            investmentThesis(investmentThesis.getOrNull())

        /**
         * Sets [Builder.investmentThesis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.investmentThesis] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun investmentThesis(investmentThesis: JsonField<String>) = apply {
            this.investmentThesis = investmentThesis
        }

        /** Ordered key risks. */
        fun keyRisks(keyRisks: List<OfferingKeyRisk>) = keyRisks(JsonField.of(keyRisks))

        /**
         * Sets [Builder.keyRisks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyRisks] with a well-typed `List<OfferingKeyRisk>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun keyRisks(keyRisks: JsonField<List<OfferingKeyRisk>>) = apply {
            this.keyRisks = keyRisks.map { it.toMutableList() }
        }

        /**
         * Adds a single [OfferingKeyRisk] to [keyRisks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKeyRisk(keyRisk: OfferingKeyRisk) = apply {
            keyRisks =
                (keyRisks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("keyRisks", it).add(keyRisk)
                }
        }

        /** Campaign participants in display order. */
        fun participants(participants: List<OfferingParticipantResource>) =
            participants(JsonField.of(participants))

        /**
         * Sets [Builder.participants] to an arbitrary JSON value.
         *
         * You should usually call [Builder.participants] with a well-typed
         * `List<OfferingParticipantResource>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun participants(participants: JsonField<List<OfferingParticipantResource>>) = apply {
            this.participants = participants.map { it.toMutableList() }
        }

        /**
         * Adds a single [OfferingParticipantResource] to [participants].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParticipant(participant: OfferingParticipantResource) = apply {
            participants =
                (participants ?: JsonField.of(mutableListOf())).also {
                    checkKnown("participants", it).add(participant)
                }
        }

        /** Vehicle/structure framing shown before typed SPV terms exist. */
        fun structureDescription(structureDescription: String?) =
            structureDescription(JsonField.ofNullable(structureDescription))

        /**
         * Alias for calling [Builder.structureDescription] with
         * `structureDescription.orElse(null)`.
         */
        fun structureDescription(structureDescription: Optional<String>) =
            structureDescription(structureDescription.getOrNull())

        /**
         * Sets [Builder.structureDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.structureDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun structureDescription(structureDescription: JsonField<String>) = apply {
            this.structureDescription = structureDescription
        }

        /** Why-now framing. */
        fun whyNow(whyNow: String?) = whyNow(JsonField.ofNullable(whyNow))

        /** Alias for calling [Builder.whyNow] with `whyNow.orElse(null)`. */
        fun whyNow(whyNow: Optional<String>) = whyNow(whyNow.getOrNull())

        /**
         * Sets [Builder.whyNow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whyNow] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun whyNow(whyNow: JsonField<String>) = apply { this.whyNow = whyNow }

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
         * Returns an immutable instance of [OfferingDetail].
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
        fun build(): OfferingDetail =
            OfferingDetail(
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
                disclosures,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                (highlights ?: JsonMissing.of()).map { it.toImmutable() },
                investmentThesis,
                (keyRisks ?: JsonMissing.of()).map { it.toImmutable() },
                (participants ?: JsonMissing.of()).map { it.toImmutable() },
                structureDescription,
                whyNow,
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
    fun validate(): OfferingDetail = apply {
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
        disclosures()
        documents().ifPresent { it.forEach { it.validate() } }
        highlights().ifPresent { it.forEach { it.validate() } }
        investmentThesis()
        keyRisks().ifPresent { it.forEach { it.validate() } }
        participants().ifPresent { it.forEach { it.validate() } }
        structureDescription()
        whyNow()
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
            (spv.asKnown().getOrNull()?.validity() ?: 0) +
            (if (disclosures.asKnown().isPresent) 1 else 0) +
            (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (highlights.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (investmentThesis.asKnown().isPresent) 1 else 0) +
            (keyRisks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (participants.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (structureDescription.asKnown().isPresent) 1 else 0) +
            (if (whyNow.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OfferingDetail &&
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
            disclosures == other.disclosures &&
            documents == other.documents &&
            highlights == other.highlights &&
            investmentThesis == other.investmentThesis &&
            keyRisks == other.keyRisks &&
            participants == other.participants &&
            structureDescription == other.structureDescription &&
            whyNow == other.whyNow &&
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
            disclosures,
            documents,
            highlights,
            investmentThesis,
            keyRisks,
            participants,
            structureDescription,
            whyNow,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OfferingDetail{id=$id, class_=$class_, company=$company, currency=$currency, headline=$headline, summary=$summary, indicativePriceHigh=$indicativePriceHigh, indicativePriceLow=$indicativePriceLow, indicativeValuationBasis=$indicativeValuationBasis, indicativeValuationHigh=$indicativeValuationHigh, indicativeValuationLow=$indicativeValuationLow, ioiDeadline=$ioiDeadline, minimumIoiAmount=$minimumIoiAmount, spv=$spv, disclosures=$disclosures, documents=$documents, highlights=$highlights, investmentThesis=$investmentThesis, keyRisks=$keyRisks, participants=$participants, structureDescription=$structureDescription, whyNow=$whyNow, additionalProperties=$additionalProperties}"
}
