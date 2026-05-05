// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a trading account */
class Account
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val accountHolderEntityId: JsonField<Long>,
    private val fullName: JsonField<String>,
    private val openDate: JsonField<LocalDate>,
    private val optionsLevel: JsonField<Long>,
    private val shortName: JsonField<String>,
    private val status: JsonField<AccountStatus>,
    private val subtype: JsonField<AccountSubtype>,
    private val type: JsonField<AccountType>,
    private val closeDate: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("account_holder_entity_id")
        @ExcludeMissing
        accountHolderEntityId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("full_name") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("open_date")
        @ExcludeMissing
        openDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("options_level")
        @ExcludeMissing
        optionsLevel: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("short_name") @ExcludeMissing shortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<AccountStatus> = JsonMissing.of(),
        @JsonProperty("subtype")
        @ExcludeMissing
        subtype: JsonField<AccountSubtype> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("close_date")
        @ExcludeMissing
        closeDate: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(
        id,
        accountHolderEntityId,
        fullName,
        openDate,
        optionsLevel,
        shortName,
        status,
        subtype,
        type,
        closeDate,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): Long = id.getRequired("id")

    /**
     * The account holder entity identifier
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountHolderEntityId(): Long =
        accountHolderEntityId.getRequired("account_holder_entity_id")

    /**
     * The full legal name of the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullName(): String = fullName.getRequired("full_name")

    /**
     * The date the account was opened
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun openDate(): LocalDate = openDate.getRequired("open_date")

    /**
     * The options level of the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optionsLevel(): Long = optionsLevel.getRequired("options_level")

    /**
     * The short name of the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shortName(): String = shortName.getRequired("short_name")

    /**
     * The current status of the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): AccountStatus = status.getRequired("status")

    /**
     * The sub-type of account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtype(): AccountSubtype = subtype.getRequired("subtype")

    /**
     * The type of account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): AccountType = type.getRequired("type")

    /**
     * The date the account was closed, if applicable
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closeDate(): Optional<LocalDate> = closeDate.getOptional("close_date")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [accountHolderEntityId].
     *
     * Unlike [accountHolderEntityId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_holder_entity_id")
    @ExcludeMissing
    fun _accountHolderEntityId(): JsonField<Long> = accountHolderEntityId

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

    /**
     * Returns the raw JSON value of [openDate].
     *
     * Unlike [openDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open_date") @ExcludeMissing fun _openDate(): JsonField<LocalDate> = openDate

    /**
     * Returns the raw JSON value of [optionsLevel].
     *
     * Unlike [optionsLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options_level")
    @ExcludeMissing
    fun _optionsLevel(): JsonField<Long> = optionsLevel

    /**
     * Returns the raw JSON value of [shortName].
     *
     * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_name") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<AccountStatus> = status

    /**
     * Returns the raw JSON value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<AccountSubtype> = subtype

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AccountType> = type

    /**
     * Returns the raw JSON value of [closeDate].
     *
     * Unlike [closeDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("close_date") @ExcludeMissing fun _closeDate(): JsonField<LocalDate> = closeDate

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
         * Returns a mutable builder for constructing an instance of [Account].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountHolderEntityId()
         * .fullName()
         * .openDate()
         * .optionsLevel()
         * .shortName()
         * .status()
         * .subtype()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Account]. */
    class Builder internal constructor() {

        private var id: JsonField<Long>? = null
        private var accountHolderEntityId: JsonField<Long>? = null
        private var fullName: JsonField<String>? = null
        private var openDate: JsonField<LocalDate>? = null
        private var optionsLevel: JsonField<Long>? = null
        private var shortName: JsonField<String>? = null
        private var status: JsonField<AccountStatus>? = null
        private var subtype: JsonField<AccountSubtype>? = null
        private var type: JsonField<AccountType>? = null
        private var closeDate: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            id = account.id
            accountHolderEntityId = account.accountHolderEntityId
            fullName = account.fullName
            openDate = account.openDate
            optionsLevel = account.optionsLevel
            shortName = account.shortName
            status = account.status
            subtype = account.subtype
            type = account.type
            closeDate = account.closeDate
            additionalProperties = account.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the account */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** The account holder entity identifier */
        fun accountHolderEntityId(accountHolderEntityId: Long) =
            accountHolderEntityId(JsonField.of(accountHolderEntityId))

        /**
         * Sets [Builder.accountHolderEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountHolderEntityId] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountHolderEntityId(accountHolderEntityId: JsonField<Long>) = apply {
            this.accountHolderEntityId = accountHolderEntityId
        }

        /** The full legal name of the account */
        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        /** The date the account was opened */
        fun openDate(openDate: LocalDate) = openDate(JsonField.of(openDate))

        /**
         * Sets [Builder.openDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun openDate(openDate: JsonField<LocalDate>) = apply { this.openDate = openDate }

        /** The options level of the account */
        fun optionsLevel(optionsLevel: Long) = optionsLevel(JsonField.of(optionsLevel))

        /**
         * Sets [Builder.optionsLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionsLevel] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun optionsLevel(optionsLevel: JsonField<Long>) = apply { this.optionsLevel = optionsLevel }

        /** The short name of the account */
        fun shortName(shortName: String) = shortName(JsonField.of(shortName))

        /**
         * Sets [Builder.shortName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

        /** The current status of the account */
        fun status(status: AccountStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [AccountStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<AccountStatus>) = apply { this.status = status }

        /** The sub-type of account */
        fun subtype(subtype: AccountSubtype) = subtype(JsonField.of(subtype))

        /**
         * Sets [Builder.subtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtype] with a well-typed [AccountSubtype] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subtype(subtype: JsonField<AccountSubtype>) = apply { this.subtype = subtype }

        /** The type of account */
        fun type(type: AccountType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [AccountType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<AccountType>) = apply { this.type = type }

        /** The date the account was closed, if applicable */
        fun closeDate(closeDate: LocalDate?) = closeDate(JsonField.ofNullable(closeDate))

        /** Alias for calling [Builder.closeDate] with `closeDate.orElse(null)`. */
        fun closeDate(closeDate: Optional<LocalDate>) = closeDate(closeDate.getOrNull())

        /**
         * Sets [Builder.closeDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closeDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun closeDate(closeDate: JsonField<LocalDate>) = apply { this.closeDate = closeDate }

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
         * Returns an immutable instance of [Account].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountHolderEntityId()
         * .fullName()
         * .openDate()
         * .optionsLevel()
         * .shortName()
         * .status()
         * .subtype()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Account =
            Account(
                checkRequired("id", id),
                checkRequired("accountHolderEntityId", accountHolderEntityId),
                checkRequired("fullName", fullName),
                checkRequired("openDate", openDate),
                checkRequired("optionsLevel", optionsLevel),
                checkRequired("shortName", shortName),
                checkRequired("status", status),
                checkRequired("subtype", subtype),
                checkRequired("type", type),
                closeDate,
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
    fun validate(): Account = apply {
        if (validated) {
            return@apply
        }

        id()
        accountHolderEntityId()
        fullName()
        openDate()
        optionsLevel()
        shortName()
        status().validate()
        subtype().validate()
        type().validate()
        closeDate()
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
            (if (accountHolderEntityId.asKnown().isPresent) 1 else 0) +
            (if (fullName.asKnown().isPresent) 1 else 0) +
            (if (openDate.asKnown().isPresent) 1 else 0) +
            (if (optionsLevel.asKnown().isPresent) 1 else 0) +
            (if (shortName.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (subtype.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (closeDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Account &&
            id == other.id &&
            accountHolderEntityId == other.accountHolderEntityId &&
            fullName == other.fullName &&
            openDate == other.openDate &&
            optionsLevel == other.optionsLevel &&
            shortName == other.shortName &&
            status == other.status &&
            subtype == other.subtype &&
            type == other.type &&
            closeDate == other.closeDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountHolderEntityId,
            fullName,
            openDate,
            optionsLevel,
            shortName,
            status,
            subtype,
            type,
            closeDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Account{id=$id, accountHolderEntityId=$accountHolderEntityId, fullName=$fullName, openDate=$openDate, optionsLevel=$optionsLevel, shortName=$shortName, status=$status, subtype=$subtype, type=$type, closeDate=$closeDate, additionalProperties=$additionalProperties}"
}
