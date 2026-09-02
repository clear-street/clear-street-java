// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.spvs

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.clearstreet.api.models.v1.privatemarkets.offerings.SpvStatus
import com.clearstreet.api.models.v1.privatemarkets.offerings.ValuationBasis
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An OPEN SPV's identity, exact economics, and typed fee schedule. */
class SpvDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val companyId: JsonField<String>,
    private val currency: JsonField<Currency>,
    private val name: JsonField<String>,
    private val status: JsonField<SpvStatus>,
    private val allInPricePerShare: JsonField<String>,
    private val custodianName: JsonField<String>,
    private val feePerShare: JsonField<String>,
    private val feeTerms: JsonField<List<SpvFeeTermResource>>,
    private val fundedPercent: JsonField<String>,
    private val fundingDeadline: JsonField<OffsetDateTime>,
    private val managerName: JsonField<String>,
    private val minimumInvestmentAmount: JsonField<String>,
    private val openedAt: JsonField<OffsetDateTime>,
    private val pricePerShare: JsonField<String>,
    private val remainingAllocationAmount: JsonField<String>,
    private val remainingShareAllocation: JsonField<String>,
    private val shareClass: JsonField<String>,
    private val structureDescription: JsonField<String>,
    private val totalAllocationAmount: JsonField<String>,
    private val totalShareAllocation: JsonField<String>,
    private val valuation: JsonField<String>,
    private val valuationBasis: JsonField<ValuationBasis>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_id") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<SpvStatus> = JsonMissing.of(),
        @JsonProperty("all_in_price_per_share")
        @ExcludeMissing
        allInPricePerShare: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custodian_name")
        @ExcludeMissing
        custodianName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fee_per_share")
        @ExcludeMissing
        feePerShare: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fee_terms")
        @ExcludeMissing
        feeTerms: JsonField<List<SpvFeeTermResource>> = JsonMissing.of(),
        @JsonProperty("funded_percent")
        @ExcludeMissing
        fundedPercent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("funding_deadline")
        @ExcludeMissing
        fundingDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("manager_name")
        @ExcludeMissing
        managerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum_investment_amount")
        @ExcludeMissing
        minimumInvestmentAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opened_at")
        @ExcludeMissing
        openedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("price_per_share")
        @ExcludeMissing
        pricePerShare: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remaining_allocation_amount")
        @ExcludeMissing
        remainingAllocationAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remaining_share_allocation")
        @ExcludeMissing
        remainingShareAllocation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("share_class")
        @ExcludeMissing
        shareClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("structure_description")
        @ExcludeMissing
        structureDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_allocation_amount")
        @ExcludeMissing
        totalAllocationAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_share_allocation")
        @ExcludeMissing
        totalShareAllocation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valuation") @ExcludeMissing valuation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valuation_basis")
        @ExcludeMissing
        valuationBasis: JsonField<ValuationBasis> = JsonMissing.of(),
    ) : this(
        id,
        companyId,
        currency,
        name,
        status,
        allInPricePerShare,
        custodianName,
        feePerShare,
        feeTerms,
        fundedPercent,
        fundingDeadline,
        managerName,
        minimumInvestmentAmount,
        openedAt,
        pricePerShare,
        remainingAllocationAmount,
        remainingShareAllocation,
        shareClass,
        structureDescription,
        totalAllocationAmount,
        totalShareAllocation,
        valuation,
        valuationBasis,
        mutableMapOf(),
    )

    /**
     * Stable SPV identifier.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Company whose shares the vehicle holds.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun companyId(): String = companyId.getRequired("company_id")

    /**
     * Terms currency.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Legal/display name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Lifecycle state.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): SpvStatus = status.getRequired("status")

    /**
     * Price per share including fees.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allInPricePerShare(): Optional<String> =
        allInPricePerShare.getOptional("all_in_price_per_share")

    /**
     * Custodian.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun custodianName(): Optional<String> = custodianName.getOptional("custodian_name")

    /**
     * Per-share fee.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feePerShare(): Optional<String> = feePerShare.getOptional("fee_per_share")

    /**
     * Typed fee schedule.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feeTerms(): Optional<List<SpvFeeTermResource>> = feeTerms.getOptional("fee_terms")

    /**
     * Percentage of dollar allocation funded, derived from the allocation pair.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fundedPercent(): Optional<String> = fundedPercent.getOptional("funded_percent")

    /**
     * Funding deadline.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fundingDeadline(): Optional<OffsetDateTime> =
        fundingDeadline.getOptional("funding_deadline")

    /**
     * SPV manager.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managerName(): Optional<String> = managerName.getOptional("manager_name")

    /**
     * Minimum investment amount.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumInvestmentAmount(): Optional<String> =
        minimumInvestmentAmount.getOptional("minimum_investment_amount")

    /**
     * Time the vehicle opened.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openedAt(): Optional<OffsetDateTime> = openedAt.getOptional("opened_at")

    /**
     * Price per share excluding fees.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricePerShare(): Optional<String> = pricePerShare.getOptional("price_per_share")

    /**
     * Remaining dollar allocation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remainingAllocationAmount(): Optional<String> =
        remainingAllocationAmount.getOptional("remaining_allocation_amount")

    /**
     * Remaining share allocation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remainingShareAllocation(): Optional<String> =
        remainingShareAllocation.getOptional("remaining_share_allocation")

    /**
     * Underlying share class, when specified.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shareClass(): Optional<String> = shareClass.getOptional("share_class")

    /**
     * Plain-text vehicle structure.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun structureDescription(): Optional<String> =
        structureDescription.getOptional("structure_description")

    /**
     * Total dollar allocation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalAllocationAmount(): Optional<String> =
        totalAllocationAmount.getOptional("total_allocation_amount")

    /**
     * Total share allocation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalShareAllocation(): Optional<String> =
        totalShareAllocation.getOptional("total_share_allocation")

    /**
     * Exact company valuation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valuation(): Optional<String> = valuation.getOptional("valuation")

    /**
     * Meaning of `valuation`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valuationBasis(): Optional<ValuationBasis> = valuationBasis.getOptional("valuation_basis")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<SpvStatus> = status

    /**
     * Returns the raw JSON value of [allInPricePerShare].
     *
     * Unlike [allInPricePerShare], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("all_in_price_per_share")
    @ExcludeMissing
    fun _allInPricePerShare(): JsonField<String> = allInPricePerShare

    /**
     * Returns the raw JSON value of [custodianName].
     *
     * Unlike [custodianName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custodian_name")
    @ExcludeMissing
    fun _custodianName(): JsonField<String> = custodianName

    /**
     * Returns the raw JSON value of [feePerShare].
     *
     * Unlike [feePerShare], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee_per_share")
    @ExcludeMissing
    fun _feePerShare(): JsonField<String> = feePerShare

    /**
     * Returns the raw JSON value of [feeTerms].
     *
     * Unlike [feeTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee_terms")
    @ExcludeMissing
    fun _feeTerms(): JsonField<List<SpvFeeTermResource>> = feeTerms

    /**
     * Returns the raw JSON value of [fundedPercent].
     *
     * Unlike [fundedPercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("funded_percent")
    @ExcludeMissing
    fun _fundedPercent(): JsonField<String> = fundedPercent

    /**
     * Returns the raw JSON value of [fundingDeadline].
     *
     * Unlike [fundingDeadline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("funding_deadline")
    @ExcludeMissing
    fun _fundingDeadline(): JsonField<OffsetDateTime> = fundingDeadline

    /**
     * Returns the raw JSON value of [managerName].
     *
     * Unlike [managerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manager_name")
    @ExcludeMissing
    fun _managerName(): JsonField<String> = managerName

    /**
     * Returns the raw JSON value of [minimumInvestmentAmount].
     *
     * Unlike [minimumInvestmentAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("minimum_investment_amount")
    @ExcludeMissing
    fun _minimumInvestmentAmount(): JsonField<String> = minimumInvestmentAmount

    /**
     * Returns the raw JSON value of [openedAt].
     *
     * Unlike [openedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opened_at") @ExcludeMissing fun _openedAt(): JsonField<OffsetDateTime> = openedAt

    /**
     * Returns the raw JSON value of [pricePerShare].
     *
     * Unlike [pricePerShare], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_per_share")
    @ExcludeMissing
    fun _pricePerShare(): JsonField<String> = pricePerShare

    /**
     * Returns the raw JSON value of [remainingAllocationAmount].
     *
     * Unlike [remainingAllocationAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("remaining_allocation_amount")
    @ExcludeMissing
    fun _remainingAllocationAmount(): JsonField<String> = remainingAllocationAmount

    /**
     * Returns the raw JSON value of [remainingShareAllocation].
     *
     * Unlike [remainingShareAllocation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("remaining_share_allocation")
    @ExcludeMissing
    fun _remainingShareAllocation(): JsonField<String> = remainingShareAllocation

    /**
     * Returns the raw JSON value of [shareClass].
     *
     * Unlike [shareClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("share_class") @ExcludeMissing fun _shareClass(): JsonField<String> = shareClass

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
     * Returns the raw JSON value of [totalAllocationAmount].
     *
     * Unlike [totalAllocationAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_allocation_amount")
    @ExcludeMissing
    fun _totalAllocationAmount(): JsonField<String> = totalAllocationAmount

    /**
     * Returns the raw JSON value of [totalShareAllocation].
     *
     * Unlike [totalShareAllocation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_share_allocation")
    @ExcludeMissing
    fun _totalShareAllocation(): JsonField<String> = totalShareAllocation

    /**
     * Returns the raw JSON value of [valuation].
     *
     * Unlike [valuation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valuation") @ExcludeMissing fun _valuation(): JsonField<String> = valuation

    /**
     * Returns the raw JSON value of [valuationBasis].
     *
     * Unlike [valuationBasis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valuation_basis")
    @ExcludeMissing
    fun _valuationBasis(): JsonField<ValuationBasis> = valuationBasis

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
         * Returns a mutable builder for constructing an instance of [SpvDetail].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .companyId()
         * .currency()
         * .name()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpvDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var companyId: JsonField<String>? = null
        private var currency: JsonField<Currency>? = null
        private var name: JsonField<String>? = null
        private var status: JsonField<SpvStatus>? = null
        private var allInPricePerShare: JsonField<String> = JsonMissing.of()
        private var custodianName: JsonField<String> = JsonMissing.of()
        private var feePerShare: JsonField<String> = JsonMissing.of()
        private var feeTerms: JsonField<MutableList<SpvFeeTermResource>>? = null
        private var fundedPercent: JsonField<String> = JsonMissing.of()
        private var fundingDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
        private var managerName: JsonField<String> = JsonMissing.of()
        private var minimumInvestmentAmount: JsonField<String> = JsonMissing.of()
        private var openedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var pricePerShare: JsonField<String> = JsonMissing.of()
        private var remainingAllocationAmount: JsonField<String> = JsonMissing.of()
        private var remainingShareAllocation: JsonField<String> = JsonMissing.of()
        private var shareClass: JsonField<String> = JsonMissing.of()
        private var structureDescription: JsonField<String> = JsonMissing.of()
        private var totalAllocationAmount: JsonField<String> = JsonMissing.of()
        private var totalShareAllocation: JsonField<String> = JsonMissing.of()
        private var valuation: JsonField<String> = JsonMissing.of()
        private var valuationBasis: JsonField<ValuationBasis> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spvDetail: SpvDetail) = apply {
            id = spvDetail.id
            companyId = spvDetail.companyId
            currency = spvDetail.currency
            name = spvDetail.name
            status = spvDetail.status
            allInPricePerShare = spvDetail.allInPricePerShare
            custodianName = spvDetail.custodianName
            feePerShare = spvDetail.feePerShare
            feeTerms = spvDetail.feeTerms.map { it.toMutableList() }
            fundedPercent = spvDetail.fundedPercent
            fundingDeadline = spvDetail.fundingDeadline
            managerName = spvDetail.managerName
            minimumInvestmentAmount = spvDetail.minimumInvestmentAmount
            openedAt = spvDetail.openedAt
            pricePerShare = spvDetail.pricePerShare
            remainingAllocationAmount = spvDetail.remainingAllocationAmount
            remainingShareAllocation = spvDetail.remainingShareAllocation
            shareClass = spvDetail.shareClass
            structureDescription = spvDetail.structureDescription
            totalAllocationAmount = spvDetail.totalAllocationAmount
            totalShareAllocation = spvDetail.totalShareAllocation
            valuation = spvDetail.valuation
            valuationBasis = spvDetail.valuationBasis
            additionalProperties = spvDetail.additionalProperties.toMutableMap()
        }

        /** Stable SPV identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Company whose shares the vehicle holds. */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

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

        /** Legal/display name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Lifecycle state. */
        fun status(status: SpvStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [SpvStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<SpvStatus>) = apply { this.status = status }

        /** Price per share including fees. */
        fun allInPricePerShare(allInPricePerShare: String?) =
            allInPricePerShare(JsonField.ofNullable(allInPricePerShare))

        /**
         * Alias for calling [Builder.allInPricePerShare] with `allInPricePerShare.orElse(null)`.
         */
        fun allInPricePerShare(allInPricePerShare: Optional<String>) =
            allInPricePerShare(allInPricePerShare.getOrNull())

        /**
         * Sets [Builder.allInPricePerShare] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allInPricePerShare] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allInPricePerShare(allInPricePerShare: JsonField<String>) = apply {
            this.allInPricePerShare = allInPricePerShare
        }

        /** Custodian. */
        fun custodianName(custodianName: String?) =
            custodianName(JsonField.ofNullable(custodianName))

        /** Alias for calling [Builder.custodianName] with `custodianName.orElse(null)`. */
        fun custodianName(custodianName: Optional<String>) =
            custodianName(custodianName.getOrNull())

        /**
         * Sets [Builder.custodianName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.custodianName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun custodianName(custodianName: JsonField<String>) = apply {
            this.custodianName = custodianName
        }

        /** Per-share fee. */
        fun feePerShare(feePerShare: String?) = feePerShare(JsonField.ofNullable(feePerShare))

        /** Alias for calling [Builder.feePerShare] with `feePerShare.orElse(null)`. */
        fun feePerShare(feePerShare: Optional<String>) = feePerShare(feePerShare.getOrNull())

        /**
         * Sets [Builder.feePerShare] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feePerShare] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feePerShare(feePerShare: JsonField<String>) = apply { this.feePerShare = feePerShare }

        /** Typed fee schedule. */
        fun feeTerms(feeTerms: List<SpvFeeTermResource>) = feeTerms(JsonField.of(feeTerms))

        /**
         * Sets [Builder.feeTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeTerms] with a well-typed `List<SpvFeeTermResource>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun feeTerms(feeTerms: JsonField<List<SpvFeeTermResource>>) = apply {
            this.feeTerms = feeTerms.map { it.toMutableList() }
        }

        /**
         * Adds a single [SpvFeeTermResource] to [feeTerms].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeeTerm(feeTerm: SpvFeeTermResource) = apply {
            feeTerms =
                (feeTerms ?: JsonField.of(mutableListOf())).also {
                    checkKnown("feeTerms", it).add(feeTerm)
                }
        }

        /** Percentage of dollar allocation funded, derived from the allocation pair. */
        fun fundedPercent(fundedPercent: String?) =
            fundedPercent(JsonField.ofNullable(fundedPercent))

        /** Alias for calling [Builder.fundedPercent] with `fundedPercent.orElse(null)`. */
        fun fundedPercent(fundedPercent: Optional<String>) =
            fundedPercent(fundedPercent.getOrNull())

        /**
         * Sets [Builder.fundedPercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundedPercent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fundedPercent(fundedPercent: JsonField<String>) = apply {
            this.fundedPercent = fundedPercent
        }

        /** Funding deadline. */
        fun fundingDeadline(fundingDeadline: OffsetDateTime?) =
            fundingDeadline(JsonField.ofNullable(fundingDeadline))

        /** Alias for calling [Builder.fundingDeadline] with `fundingDeadline.orElse(null)`. */
        fun fundingDeadline(fundingDeadline: Optional<OffsetDateTime>) =
            fundingDeadline(fundingDeadline.getOrNull())

        /**
         * Sets [Builder.fundingDeadline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundingDeadline] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fundingDeadline(fundingDeadline: JsonField<OffsetDateTime>) = apply {
            this.fundingDeadline = fundingDeadline
        }

        /** SPV manager. */
        fun managerName(managerName: String?) = managerName(JsonField.ofNullable(managerName))

        /** Alias for calling [Builder.managerName] with `managerName.orElse(null)`. */
        fun managerName(managerName: Optional<String>) = managerName(managerName.getOrNull())

        /**
         * Sets [Builder.managerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun managerName(managerName: JsonField<String>) = apply { this.managerName = managerName }

        /** Minimum investment amount. */
        fun minimumInvestmentAmount(minimumInvestmentAmount: String?) =
            minimumInvestmentAmount(JsonField.ofNullable(minimumInvestmentAmount))

        /**
         * Alias for calling [Builder.minimumInvestmentAmount] with
         * `minimumInvestmentAmount.orElse(null)`.
         */
        fun minimumInvestmentAmount(minimumInvestmentAmount: Optional<String>) =
            minimumInvestmentAmount(minimumInvestmentAmount.getOrNull())

        /**
         * Sets [Builder.minimumInvestmentAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumInvestmentAmount] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun minimumInvestmentAmount(minimumInvestmentAmount: JsonField<String>) = apply {
            this.minimumInvestmentAmount = minimumInvestmentAmount
        }

        /** Time the vehicle opened. */
        fun openedAt(openedAt: OffsetDateTime?) = openedAt(JsonField.ofNullable(openedAt))

        /** Alias for calling [Builder.openedAt] with `openedAt.orElse(null)`. */
        fun openedAt(openedAt: Optional<OffsetDateTime>) = openedAt(openedAt.getOrNull())

        /**
         * Sets [Builder.openedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openedAt(openedAt: JsonField<OffsetDateTime>) = apply { this.openedAt = openedAt }

        /** Price per share excluding fees. */
        fun pricePerShare(pricePerShare: String?) =
            pricePerShare(JsonField.ofNullable(pricePerShare))

        /** Alias for calling [Builder.pricePerShare] with `pricePerShare.orElse(null)`. */
        fun pricePerShare(pricePerShare: Optional<String>) =
            pricePerShare(pricePerShare.getOrNull())

        /**
         * Sets [Builder.pricePerShare] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricePerShare] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pricePerShare(pricePerShare: JsonField<String>) = apply {
            this.pricePerShare = pricePerShare
        }

        /** Remaining dollar allocation. */
        fun remainingAllocationAmount(remainingAllocationAmount: String?) =
            remainingAllocationAmount(JsonField.ofNullable(remainingAllocationAmount))

        /**
         * Alias for calling [Builder.remainingAllocationAmount] with
         * `remainingAllocationAmount.orElse(null)`.
         */
        fun remainingAllocationAmount(remainingAllocationAmount: Optional<String>) =
            remainingAllocationAmount(remainingAllocationAmount.getOrNull())

        /**
         * Sets [Builder.remainingAllocationAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingAllocationAmount] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun remainingAllocationAmount(remainingAllocationAmount: JsonField<String>) = apply {
            this.remainingAllocationAmount = remainingAllocationAmount
        }

        /** Remaining share allocation. */
        fun remainingShareAllocation(remainingShareAllocation: String?) =
            remainingShareAllocation(JsonField.ofNullable(remainingShareAllocation))

        /**
         * Alias for calling [Builder.remainingShareAllocation] with
         * `remainingShareAllocation.orElse(null)`.
         */
        fun remainingShareAllocation(remainingShareAllocation: Optional<String>) =
            remainingShareAllocation(remainingShareAllocation.getOrNull())

        /**
         * Sets [Builder.remainingShareAllocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingShareAllocation] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun remainingShareAllocation(remainingShareAllocation: JsonField<String>) = apply {
            this.remainingShareAllocation = remainingShareAllocation
        }

        /** Underlying share class, when specified. */
        fun shareClass(shareClass: String?) = shareClass(JsonField.ofNullable(shareClass))

        /** Alias for calling [Builder.shareClass] with `shareClass.orElse(null)`. */
        fun shareClass(shareClass: Optional<String>) = shareClass(shareClass.getOrNull())

        /**
         * Sets [Builder.shareClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareClass] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shareClass(shareClass: JsonField<String>) = apply { this.shareClass = shareClass }

        /** Plain-text vehicle structure. */
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

        /** Total dollar allocation. */
        fun totalAllocationAmount(totalAllocationAmount: String?) =
            totalAllocationAmount(JsonField.ofNullable(totalAllocationAmount))

        /**
         * Alias for calling [Builder.totalAllocationAmount] with
         * `totalAllocationAmount.orElse(null)`.
         */
        fun totalAllocationAmount(totalAllocationAmount: Optional<String>) =
            totalAllocationAmount(totalAllocationAmount.getOrNull())

        /**
         * Sets [Builder.totalAllocationAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalAllocationAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalAllocationAmount(totalAllocationAmount: JsonField<String>) = apply {
            this.totalAllocationAmount = totalAllocationAmount
        }

        /** Total share allocation. */
        fun totalShareAllocation(totalShareAllocation: String?) =
            totalShareAllocation(JsonField.ofNullable(totalShareAllocation))

        /**
         * Alias for calling [Builder.totalShareAllocation] with
         * `totalShareAllocation.orElse(null)`.
         */
        fun totalShareAllocation(totalShareAllocation: Optional<String>) =
            totalShareAllocation(totalShareAllocation.getOrNull())

        /**
         * Sets [Builder.totalShareAllocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalShareAllocation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalShareAllocation(totalShareAllocation: JsonField<String>) = apply {
            this.totalShareAllocation = totalShareAllocation
        }

        /** Exact company valuation. */
        fun valuation(valuation: String?) = valuation(JsonField.ofNullable(valuation))

        /** Alias for calling [Builder.valuation] with `valuation.orElse(null)`. */
        fun valuation(valuation: Optional<String>) = valuation(valuation.getOrNull())

        /**
         * Sets [Builder.valuation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valuation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun valuation(valuation: JsonField<String>) = apply { this.valuation = valuation }

        /** Meaning of `valuation`. */
        fun valuationBasis(valuationBasis: ValuationBasis?) =
            valuationBasis(JsonField.ofNullable(valuationBasis))

        /** Alias for calling [Builder.valuationBasis] with `valuationBasis.orElse(null)`. */
        fun valuationBasis(valuationBasis: Optional<ValuationBasis>) =
            valuationBasis(valuationBasis.getOrNull())

        /**
         * Sets [Builder.valuationBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valuationBasis] with a well-typed [ValuationBasis] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun valuationBasis(valuationBasis: JsonField<ValuationBasis>) = apply {
            this.valuationBasis = valuationBasis
        }

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
         * Returns an immutable instance of [SpvDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .companyId()
         * .currency()
         * .name()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpvDetail =
            SpvDetail(
                checkRequired("id", id),
                checkRequired("companyId", companyId),
                checkRequired("currency", currency),
                checkRequired("name", name),
                checkRequired("status", status),
                allInPricePerShare,
                custodianName,
                feePerShare,
                (feeTerms ?: JsonMissing.of()).map { it.toImmutable() },
                fundedPercent,
                fundingDeadline,
                managerName,
                minimumInvestmentAmount,
                openedAt,
                pricePerShare,
                remainingAllocationAmount,
                remainingShareAllocation,
                shareClass,
                structureDescription,
                totalAllocationAmount,
                totalShareAllocation,
                valuation,
                valuationBasis,
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
    fun validate(): SpvDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        companyId()
        currency().validate()
        name()
        status().validate()
        allInPricePerShare()
        custodianName()
        feePerShare()
        feeTerms().ifPresent { it.forEach { it.validate() } }
        fundedPercent()
        fundingDeadline()
        managerName()
        minimumInvestmentAmount()
        openedAt()
        pricePerShare()
        remainingAllocationAmount()
        remainingShareAllocation()
        shareClass()
        structureDescription()
        totalAllocationAmount()
        totalShareAllocation()
        valuation()
        valuationBasis().ifPresent { it.validate() }
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
            (if (companyId.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (allInPricePerShare.asKnown().isPresent) 1 else 0) +
            (if (custodianName.asKnown().isPresent) 1 else 0) +
            (if (feePerShare.asKnown().isPresent) 1 else 0) +
            (feeTerms.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (fundedPercent.asKnown().isPresent) 1 else 0) +
            (if (fundingDeadline.asKnown().isPresent) 1 else 0) +
            (if (managerName.asKnown().isPresent) 1 else 0) +
            (if (minimumInvestmentAmount.asKnown().isPresent) 1 else 0) +
            (if (openedAt.asKnown().isPresent) 1 else 0) +
            (if (pricePerShare.asKnown().isPresent) 1 else 0) +
            (if (remainingAllocationAmount.asKnown().isPresent) 1 else 0) +
            (if (remainingShareAllocation.asKnown().isPresent) 1 else 0) +
            (if (shareClass.asKnown().isPresent) 1 else 0) +
            (if (structureDescription.asKnown().isPresent) 1 else 0) +
            (if (totalAllocationAmount.asKnown().isPresent) 1 else 0) +
            (if (totalShareAllocation.asKnown().isPresent) 1 else 0) +
            (if (valuation.asKnown().isPresent) 1 else 0) +
            (valuationBasis.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpvDetail &&
            id == other.id &&
            companyId == other.companyId &&
            currency == other.currency &&
            name == other.name &&
            status == other.status &&
            allInPricePerShare == other.allInPricePerShare &&
            custodianName == other.custodianName &&
            feePerShare == other.feePerShare &&
            feeTerms == other.feeTerms &&
            fundedPercent == other.fundedPercent &&
            fundingDeadline == other.fundingDeadline &&
            managerName == other.managerName &&
            minimumInvestmentAmount == other.minimumInvestmentAmount &&
            openedAt == other.openedAt &&
            pricePerShare == other.pricePerShare &&
            remainingAllocationAmount == other.remainingAllocationAmount &&
            remainingShareAllocation == other.remainingShareAllocation &&
            shareClass == other.shareClass &&
            structureDescription == other.structureDescription &&
            totalAllocationAmount == other.totalAllocationAmount &&
            totalShareAllocation == other.totalShareAllocation &&
            valuation == other.valuation &&
            valuationBasis == other.valuationBasis &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            companyId,
            currency,
            name,
            status,
            allInPricePerShare,
            custodianName,
            feePerShare,
            feeTerms,
            fundedPercent,
            fundingDeadline,
            managerName,
            minimumInvestmentAmount,
            openedAt,
            pricePerShare,
            remainingAllocationAmount,
            remainingShareAllocation,
            shareClass,
            structureDescription,
            totalAllocationAmount,
            totalShareAllocation,
            valuation,
            valuationBasis,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpvDetail{id=$id, companyId=$companyId, currency=$currency, name=$name, status=$status, allInPricePerShare=$allInPricePerShare, custodianName=$custodianName, feePerShare=$feePerShare, feeTerms=$feeTerms, fundedPercent=$fundedPercent, fundingDeadline=$fundingDeadline, managerName=$managerName, minimumInvestmentAmount=$minimumInvestmentAmount, openedAt=$openedAt, pricePerShare=$pricePerShare, remainingAllocationAmount=$remainingAllocationAmount, remainingShareAllocation=$remainingShareAllocation, shareClass=$shareClass, structureDescription=$structureDescription, totalAllocationAmount=$totalAllocationAmount, totalShareAllocation=$totalShareAllocation, valuation=$valuation, valuationBasis=$valuationBasis, additionalProperties=$additionalProperties}"
}
