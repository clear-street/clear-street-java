// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.iois

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** IOI list item with the campaign identity needed to render it. */
class IoiListingResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val notionalAmount: JsonField<String>,
    private val offeringId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val ndaAcceptance: JsonField<NdaAcceptanceResource>,
    private val company: JsonField<IoiCompanyResource>,
    private val offering: JsonField<IoiOfferingResource>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("notional_amount")
        @ExcludeMissing
        notionalAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offering_id")
        @ExcludeMissing
        offeringId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("nda_acceptance")
        @ExcludeMissing
        ndaAcceptance: JsonField<NdaAcceptanceResource> = JsonMissing.of(),
        @JsonProperty("company")
        @ExcludeMissing
        company: JsonField<IoiCompanyResource> = JsonMissing.of(),
        @JsonProperty("offering")
        @ExcludeMissing
        offering: JsonField<IoiOfferingResource> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        createdAt,
        currency,
        notionalAmount,
        offeringId,
        updatedAt,
        ndaAcceptance,
        company,
        offering,
        mutableMapOf(),
    )

    fun toIoiResource(): IoiResource =
        IoiResource.builder()
            .id(id)
            .accountId(accountId)
            .createdAt(createdAt)
            .currency(currency)
            .notionalAmount(notionalAmount)
            .offeringId(offeringId)
            .updatedAt(updatedAt)
            .ndaAcceptance(ndaAcceptance)
            .build()

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): Long = accountId.getRequired("account_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Terms currency.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notionalAmount(): String = notionalAmount.getRequired("notional_amount")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offeringId(): String = offeringId.getRequired("offering_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Most recent NDA acceptance linked to this IOI, if any.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ndaAcceptance(): Optional<NdaAcceptanceResource> =
        ndaAcceptance.getOptional("nda_acceptance")

    /**
     * Company identity embedded in an IOI list item.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun company(): IoiCompanyResource = company.getRequired("company")

    /**
     * Offering identity embedded in an IOI list item.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offering(): IoiOfferingResource = offering.getRequired("offering")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [notionalAmount].
     *
     * Unlike [notionalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notional_amount")
    @ExcludeMissing
    fun _notionalAmount(): JsonField<String> = notionalAmount

    /**
     * Returns the raw JSON value of [offeringId].
     *
     * Unlike [offeringId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offering_id") @ExcludeMissing fun _offeringId(): JsonField<String> = offeringId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [ndaAcceptance].
     *
     * Unlike [ndaAcceptance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nda_acceptance")
    @ExcludeMissing
    fun _ndaAcceptance(): JsonField<NdaAcceptanceResource> = ndaAcceptance

    /**
     * Returns the raw JSON value of [company].
     *
     * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<IoiCompanyResource> = company

    /**
     * Returns the raw JSON value of [offering].
     *
     * Unlike [offering], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offering")
    @ExcludeMissing
    fun _offering(): JsonField<IoiOfferingResource> = offering

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
         * Returns a mutable builder for constructing an instance of [IoiListingResource].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .createdAt()
         * .currency()
         * .notionalAmount()
         * .offeringId()
         * .updatedAt()
         * .company()
         * .offering()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IoiListingResource]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var notionalAmount: JsonField<String>? = null
        private var offeringId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var ndaAcceptance: JsonField<NdaAcceptanceResource> = JsonMissing.of()
        private var company: JsonField<IoiCompanyResource>? = null
        private var offering: JsonField<IoiOfferingResource>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ioiListingResource: IoiListingResource) = apply {
            id = ioiListingResource.id
            accountId = ioiListingResource.accountId
            createdAt = ioiListingResource.createdAt
            currency = ioiListingResource.currency
            notionalAmount = ioiListingResource.notionalAmount
            offeringId = ioiListingResource.offeringId
            updatedAt = ioiListingResource.updatedAt
            ndaAcceptance = ioiListingResource.ndaAcceptance
            company = ioiListingResource.company
            offering = ioiListingResource.offering
            additionalProperties = ioiListingResource.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun accountId(accountId: Long) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        fun notionalAmount(notionalAmount: String) = notionalAmount(JsonField.of(notionalAmount))

        /**
         * Sets [Builder.notionalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notionalAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notionalAmount(notionalAmount: JsonField<String>) = apply {
            this.notionalAmount = notionalAmount
        }

        fun offeringId(offeringId: String) = offeringId(JsonField.of(offeringId))

        /**
         * Sets [Builder.offeringId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offeringId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun offeringId(offeringId: JsonField<String>) = apply { this.offeringId = offeringId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Most recent NDA acceptance linked to this IOI, if any. */
        fun ndaAcceptance(ndaAcceptance: NdaAcceptanceResource?) =
            ndaAcceptance(JsonField.ofNullable(ndaAcceptance))

        /** Alias for calling [Builder.ndaAcceptance] with `ndaAcceptance.orElse(null)`. */
        fun ndaAcceptance(ndaAcceptance: Optional<NdaAcceptanceResource>) =
            ndaAcceptance(ndaAcceptance.getOrNull())

        /**
         * Sets [Builder.ndaAcceptance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ndaAcceptance] with a well-typed [NdaAcceptanceResource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ndaAcceptance(ndaAcceptance: JsonField<NdaAcceptanceResource>) = apply {
            this.ndaAcceptance = ndaAcceptance
        }

        /** Company identity embedded in an IOI list item. */
        fun company(company: IoiCompanyResource) = company(JsonField.of(company))

        /**
         * Sets [Builder.company] to an arbitrary JSON value.
         *
         * You should usually call [Builder.company] with a well-typed [IoiCompanyResource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun company(company: JsonField<IoiCompanyResource>) = apply { this.company = company }

        /** Offering identity embedded in an IOI list item. */
        fun offering(offering: IoiOfferingResource) = offering(JsonField.of(offering))

        /**
         * Sets [Builder.offering] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offering] with a well-typed [IoiOfferingResource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun offering(offering: JsonField<IoiOfferingResource>) = apply { this.offering = offering }

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
         * Returns an immutable instance of [IoiListingResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .createdAt()
         * .currency()
         * .notionalAmount()
         * .offeringId()
         * .updatedAt()
         * .company()
         * .offering()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IoiListingResource =
            IoiListingResource(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("notionalAmount", notionalAmount),
                checkRequired("offeringId", offeringId),
                checkRequired("updatedAt", updatedAt),
                ndaAcceptance,
                checkRequired("company", company),
                checkRequired("offering", offering),
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
    fun validate(): IoiListingResource = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        createdAt()
        currency().validate()
        notionalAmount()
        offeringId()
        updatedAt()
        ndaAcceptance().ifPresent { it.validate() }
        company().validate()
        offering().validate()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (notionalAmount.asKnown().isPresent) 1 else 0) +
            (if (offeringId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (ndaAcceptance.asKnown().getOrNull()?.validity() ?: 0) +
            (company.asKnown().getOrNull()?.validity() ?: 0) +
            (offering.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IoiListingResource &&
            id == other.id &&
            accountId == other.accountId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            notionalAmount == other.notionalAmount &&
            offeringId == other.offeringId &&
            updatedAt == other.updatedAt &&
            ndaAcceptance == other.ndaAcceptance &&
            company == other.company &&
            offering == other.offering &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            createdAt,
            currency,
            notionalAmount,
            offeringId,
            updatedAt,
            ndaAcceptance,
            company,
            offering,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IoiListingResource{id=$id, accountId=$accountId, createdAt=$createdAt, currency=$currency, notionalAmount=$notionalAmount, offeringId=$offeringId, updatedAt=$updatedAt, ndaAcceptance=$ndaAcceptance, company=$company, offering=$offering, additionalProperties=$additionalProperties}"
}
