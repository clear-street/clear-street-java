// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.SecurityType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NonTradeActivity
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val activitySubtype: JsonField<String>,
    private val activityType: JsonField<ActivityType>,
    private val amount: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val effectiveDate: JsonField<LocalDate>,
    private val instrumentType: JsonField<SecurityType>,
    private val memo: JsonField<String>,
    private val qty: JsonField<String>,
    private val state: JsonField<ActivityState>,
    private val cancelledReferenceId: JsonField<String>,
    private val instrumentId: JsonField<String>,
    private val referenceId: JsonField<String>,
    private val symbol: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activity_subtype")
        @ExcludeMissing
        activitySubtype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activity_type")
        @ExcludeMissing
        activityType: JsonField<ActivityType> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("instrument_type")
        @ExcludeMissing
        instrumentType: JsonField<SecurityType> = JsonMissing.of(),
        @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("qty") @ExcludeMissing qty: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<ActivityState> = JsonMissing.of(),
        @JsonProperty("cancelled_reference_id")
        @ExcludeMissing
        cancelledReferenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_id")
        @ExcludeMissing
        referenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        activitySubtype,
        activityType,
        amount,
        createdAt,
        currency,
        effectiveDate,
        instrumentType,
        memo,
        qty,
        state,
        cancelledReferenceId,
        instrumentId,
        referenceId,
        symbol,
        mutableMapOf(),
    )

    /**
     * ID for the activity, in UUID-v7 format.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Account ID
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * Subtype within its `activity_type`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun activitySubtype(): String = activitySubtype.getRequired("activity_subtype")

    /**
     * Categorization for the activity.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun activityType(): ActivityType = activityType.getRequired("activity_type")

    /**
     * Cash amount change.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * The creation time at UTC, when this activity became part of the ledger
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Currency of the cash amount. Always USD for now.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Effective date for the activity
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /**
     * The security type.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentType(): SecurityType = instrumentType.getRequired("instrument_type")

    /**
     * Memo
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun memo(): String = memo.getRequired("memo")

    /**
     * Quantity change in the instrument.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun qty(): String = qty.getRequired("qty")

    /**
     * State for this activity.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): ActivityState = state.getRequired("state")

    /**
     * Reference ID for the record that is being cancelled. Present only on records where the
     * activity state is 'cancelled'. The contents of this fields points at the reference_id of the
     * original record that is being cancelled by this record.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancelledReferenceId(): Optional<String> =
        cancelledReferenceId.getOptional("cancelled_reference_id")

    /**
     * Instrument identifier. Omitted when the activity has no single resolvable instrument.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

    /**
     * Reference ID for the activity, in ULID format. Present only on records where activity state
     * is 'settled'. When a activity is cancelled, the cancelation record is pointing at this
     * reference_id.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceId(): Optional<String> = referenceId.getOptional("reference_id")

    /**
     * Symbol of the instrument. Omitted when the activity has no single resolvable instrument.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): Optional<String> = symbol.getOptional("symbol")

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
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [activitySubtype].
     *
     * Unlike [activitySubtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activity_subtype")
    @ExcludeMissing
    fun _activitySubtype(): JsonField<String> = activitySubtype

    /**
     * Returns the raw JSON value of [activityType].
     *
     * Unlike [activityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activity_type")
    @ExcludeMissing
    fun _activityType(): JsonField<ActivityType> = activityType

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

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
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

    /**
     * Returns the raw JSON value of [instrumentType].
     *
     * Unlike [instrumentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_type")
    @ExcludeMissing
    fun _instrumentType(): JsonField<SecurityType> = instrumentType

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * Returns the raw JSON value of [qty].
     *
     * Unlike [qty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qty") @ExcludeMissing fun _qty(): JsonField<String> = qty

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<ActivityState> = state

    /**
     * Returns the raw JSON value of [cancelledReferenceId].
     *
     * Unlike [cancelledReferenceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cancelled_reference_id")
    @ExcludeMissing
    fun _cancelledReferenceId(): JsonField<String> = cancelledReferenceId

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [referenceId].
     *
     * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reference_id")
    @ExcludeMissing
    fun _referenceId(): JsonField<String> = referenceId

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

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
         * Returns a mutable builder for constructing an instance of [NonTradeActivity].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .activitySubtype()
         * .activityType()
         * .amount()
         * .createdAt()
         * .currency()
         * .effectiveDate()
         * .instrumentType()
         * .memo()
         * .qty()
         * .state()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NonTradeActivity]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var activitySubtype: JsonField<String>? = null
        private var activityType: JsonField<ActivityType>? = null
        private var amount: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var instrumentType: JsonField<SecurityType>? = null
        private var memo: JsonField<String>? = null
        private var qty: JsonField<String>? = null
        private var state: JsonField<ActivityState>? = null
        private var cancelledReferenceId: JsonField<String> = JsonMissing.of()
        private var instrumentId: JsonField<String> = JsonMissing.of()
        private var referenceId: JsonField<String> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(nonTradeActivity: NonTradeActivity) = apply {
            id = nonTradeActivity.id
            accountId = nonTradeActivity.accountId
            activitySubtype = nonTradeActivity.activitySubtype
            activityType = nonTradeActivity.activityType
            amount = nonTradeActivity.amount
            createdAt = nonTradeActivity.createdAt
            currency = nonTradeActivity.currency
            effectiveDate = nonTradeActivity.effectiveDate
            instrumentType = nonTradeActivity.instrumentType
            memo = nonTradeActivity.memo
            qty = nonTradeActivity.qty
            state = nonTradeActivity.state
            cancelledReferenceId = nonTradeActivity.cancelledReferenceId
            instrumentId = nonTradeActivity.instrumentId
            referenceId = nonTradeActivity.referenceId
            symbol = nonTradeActivity.symbol
            additionalProperties = nonTradeActivity.additionalProperties.toMutableMap()
        }

        /** ID for the activity, in UUID-v7 format. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Account ID */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** Subtype within its `activity_type`. */
        fun activitySubtype(activitySubtype: String) =
            activitySubtype(JsonField.of(activitySubtype))

        /**
         * Sets [Builder.activitySubtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activitySubtype] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activitySubtype(activitySubtype: JsonField<String>) = apply {
            this.activitySubtype = activitySubtype
        }

        /** Categorization for the activity. */
        fun activityType(activityType: ActivityType) = activityType(JsonField.of(activityType))

        /**
         * Sets [Builder.activityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activityType] with a well-typed [ActivityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activityType(activityType: JsonField<ActivityType>) = apply {
            this.activityType = activityType
        }

        /** Cash amount change. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The creation time at UTC, when this activity became part of the ledger */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Currency of the cash amount. Always USD for now. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Effective date for the activity */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** The security type. */
        fun instrumentType(instrumentType: SecurityType) =
            instrumentType(JsonField.of(instrumentType))

        /**
         * Sets [Builder.instrumentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentType] with a well-typed [SecurityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instrumentType(instrumentType: JsonField<SecurityType>) = apply {
            this.instrumentType = instrumentType
        }

        /** Memo */
        fun memo(memo: String) = memo(JsonField.of(memo))

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /** Quantity change in the instrument. */
        fun qty(qty: String) = qty(JsonField.of(qty))

        /**
         * Sets [Builder.qty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qty] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun qty(qty: JsonField<String>) = apply { this.qty = qty }

        /** State for this activity. */
        fun state(state: ActivityState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [ActivityState] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun state(state: JsonField<ActivityState>) = apply { this.state = state }

        /**
         * Reference ID for the record that is being cancelled. Present only on records where the
         * activity state is 'cancelled'. The contents of this fields points at the reference_id of
         * the original record that is being cancelled by this record.
         */
        fun cancelledReferenceId(cancelledReferenceId: String?) =
            cancelledReferenceId(JsonField.ofNullable(cancelledReferenceId))

        /**
         * Alias for calling [Builder.cancelledReferenceId] with
         * `cancelledReferenceId.orElse(null)`.
         */
        fun cancelledReferenceId(cancelledReferenceId: Optional<String>) =
            cancelledReferenceId(cancelledReferenceId.getOrNull())

        /**
         * Sets [Builder.cancelledReferenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelledReferenceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelledReferenceId(cancelledReferenceId: JsonField<String>) = apply {
            this.cancelledReferenceId = cancelledReferenceId
        }

        /** Instrument identifier. Omitted when the activity has no single resolvable instrument. */
        fun instrumentId(instrumentId: String?) = instrumentId(JsonField.ofNullable(instrumentId))

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

        /**
         * Sets [Builder.instrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instrumentId(instrumentId: JsonField<String>) = apply {
            this.instrumentId = instrumentId
        }

        /**
         * Reference ID for the activity, in ULID format. Present only on records where activity
         * state is 'settled'. When a activity is cancelled, the cancelation record is pointing at
         * this reference_id.
         */
        fun referenceId(referenceId: String?) = referenceId(JsonField.ofNullable(referenceId))

        /** Alias for calling [Builder.referenceId] with `referenceId.orElse(null)`. */
        fun referenceId(referenceId: Optional<String>) = referenceId(referenceId.getOrNull())

        /**
         * Sets [Builder.referenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceId(referenceId: JsonField<String>) = apply { this.referenceId = referenceId }

        /**
         * Symbol of the instrument. Omitted when the activity has no single resolvable instrument.
         */
        fun symbol(symbol: String?) = symbol(JsonField.ofNullable(symbol))

        /** Alias for calling [Builder.symbol] with `symbol.orElse(null)`. */
        fun symbol(symbol: Optional<String>) = symbol(symbol.getOrNull())

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

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
         * Returns an immutable instance of [NonTradeActivity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .activitySubtype()
         * .activityType()
         * .amount()
         * .createdAt()
         * .currency()
         * .effectiveDate()
         * .instrumentType()
         * .memo()
         * .qty()
         * .state()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NonTradeActivity =
            NonTradeActivity(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("activitySubtype", activitySubtype),
                checkRequired("activityType", activityType),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("instrumentType", instrumentType),
                checkRequired("memo", memo),
                checkRequired("qty", qty),
                checkRequired("state", state),
                cancelledReferenceId,
                instrumentId,
                referenceId,
                symbol,
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
    fun validate(): NonTradeActivity = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        activitySubtype()
        activityType().validate()
        amount()
        createdAt()
        currency()
        effectiveDate()
        instrumentType().validate()
        memo()
        qty()
        state().validate()
        cancelledReferenceId()
        instrumentId()
        referenceId()
        symbol()
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
            (if (activitySubtype.asKnown().isPresent) 1 else 0) +
            (activityType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
            (instrumentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (memo.asKnown().isPresent) 1 else 0) +
            (if (qty.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cancelledReferenceId.asKnown().isPresent) 1 else 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (referenceId.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NonTradeActivity &&
            id == other.id &&
            accountId == other.accountId &&
            activitySubtype == other.activitySubtype &&
            activityType == other.activityType &&
            amount == other.amount &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            effectiveDate == other.effectiveDate &&
            instrumentType == other.instrumentType &&
            memo == other.memo &&
            qty == other.qty &&
            state == other.state &&
            cancelledReferenceId == other.cancelledReferenceId &&
            instrumentId == other.instrumentId &&
            referenceId == other.referenceId &&
            symbol == other.symbol &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            activitySubtype,
            activityType,
            amount,
            createdAt,
            currency,
            effectiveDate,
            instrumentType,
            memo,
            qty,
            state,
            cancelledReferenceId,
            instrumentId,
            referenceId,
            symbol,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NonTradeActivity{id=$id, accountId=$accountId, activitySubtype=$activitySubtype, activityType=$activityType, amount=$amount, createdAt=$createdAt, currency=$currency, effectiveDate=$effectiveDate, instrumentType=$instrumentType, memo=$memo, qty=$qty, state=$state, cancelledReferenceId=$cancelledReferenceId, instrumentId=$instrumentId, referenceId=$referenceId, symbol=$symbol, additionalProperties=$additionalProperties}"
}
