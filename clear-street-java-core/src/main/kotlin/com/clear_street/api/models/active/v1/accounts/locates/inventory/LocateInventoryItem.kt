// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates.inventory

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
import java.util.Collections
import java.util.Objects

/** Represents the available locate inventory for a symbol */
class LocateInventoryItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<Long>,
    private val available: JsonField<Long>,
    private val reserved: JsonField<Long>,
    private val symbol: JsonField<String>,
    private val used: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("available") @ExcludeMissing available: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reserved") @ExcludeMissing reserved: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("used") @ExcludeMissing used: JsonField<Long> = JsonMissing.of(),
    ) : this(accountId, available, reserved, symbol, used, mutableMapOf())

    /**
     * The account the locate inventory belongs to
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): Long = accountId.getRequired("account_id")

    /**
     * The available quantity of shares that can be located to borrow
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun available(): Long = available.getRequired("available")

    /**
     * The quantity of shares reserved for locate orders that have been `OFFERED` but not yet
     * `FILLED`
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reserved(): Long = reserved.getRequired("reserved")

    /**
     * The symbol of the security
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * The quantity of shares that have been `FILLED` and are currently borrowed
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun used(): Long = used.getRequired("used")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

    /**
     * Returns the raw JSON value of [available].
     *
     * Unlike [available], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available") @ExcludeMissing fun _available(): JsonField<Long> = available

    /**
     * Returns the raw JSON value of [reserved].
     *
     * Unlike [reserved], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reserved") @ExcludeMissing fun _reserved(): JsonField<Long> = reserved

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [used].
     *
     * Unlike [used], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("used") @ExcludeMissing fun _used(): JsonField<Long> = used

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
         * Returns a mutable builder for constructing an instance of [LocateInventoryItem].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .available()
         * .reserved()
         * .symbol()
         * .used()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LocateInventoryItem]. */
    class Builder internal constructor() {

        private var accountId: JsonField<Long>? = null
        private var available: JsonField<Long>? = null
        private var reserved: JsonField<Long>? = null
        private var symbol: JsonField<String>? = null
        private var used: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(locateInventoryItem: LocateInventoryItem) = apply {
            accountId = locateInventoryItem.accountId
            available = locateInventoryItem.available
            reserved = locateInventoryItem.reserved
            symbol = locateInventoryItem.symbol
            used = locateInventoryItem.used
            additionalProperties = locateInventoryItem.additionalProperties.toMutableMap()
        }

        /** The account the locate inventory belongs to */
        fun accountId(accountId: Long) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        /** The available quantity of shares that can be located to borrow */
        fun available(available: Long) = available(JsonField.of(available))

        /**
         * Sets [Builder.available] to an arbitrary JSON value.
         *
         * You should usually call [Builder.available] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun available(available: JsonField<Long>) = apply { this.available = available }

        /**
         * The quantity of shares reserved for locate orders that have been `OFFERED` but not yet
         * `FILLED`
         */
        fun reserved(reserved: Long) = reserved(JsonField.of(reserved))

        /**
         * Sets [Builder.reserved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reserved] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reserved(reserved: JsonField<Long>) = apply { this.reserved = reserved }

        /** The symbol of the security */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** The quantity of shares that have been `FILLED` and are currently borrowed */
        fun used(used: Long) = used(JsonField.of(used))

        /**
         * Sets [Builder.used] to an arbitrary JSON value.
         *
         * You should usually call [Builder.used] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun used(used: JsonField<Long>) = apply { this.used = used }

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
         * Returns an immutable instance of [LocateInventoryItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .available()
         * .reserved()
         * .symbol()
         * .used()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LocateInventoryItem =
            LocateInventoryItem(
                checkRequired("accountId", accountId),
                checkRequired("available", available),
                checkRequired("reserved", reserved),
                checkRequired("symbol", symbol),
                checkRequired("used", used),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LocateInventoryItem = apply {
        if (validated) {
            return@apply
        }

        accountId()
        available()
        reserved()
        symbol()
        used()
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
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (available.asKnown().isPresent) 1 else 0) +
            (if (reserved.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (used.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LocateInventoryItem &&
            accountId == other.accountId &&
            available == other.available &&
            reserved == other.reserved &&
            symbol == other.symbol &&
            used == other.used &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountId, available, reserved, symbol, used, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LocateInventoryItem{accountId=$accountId, available=$available, reserved=$reserved, symbol=$symbol, used=$used, additionalProperties=$additionalProperties}"
}
