// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List orders for an account with optional filtering */
class OrderGetOrdersParams
private constructor(
    private val accountId: Long?,
    private val from: OffsetDateTime?,
    private val instrumentIds: List<String>?,
    private val instrumentType: InstrumentType?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val status: List<Status>?,
    private val symbol: String?,
    private val to: OffsetDateTime?,
    private val underlyingInstrumentIds: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountId(): Optional<Long> = Optional.ofNullable(accountId)

    /** The start date and time for the query range, inclusive (ISO 8601 format) */
    fun from(): Optional<OffsetDateTime> = Optional.ofNullable(from)

    /** Comma-separated OEMS instrument UUIDs */
    fun instrumentIds(): Optional<List<String>> = Optional.ofNullable(instrumentIds)

    /** Instrument type filter (e.g., COMMON_STOCK, OPTION) */
    fun instrumentType(): Optional<InstrumentType> = Optional.ofNullable(instrumentType)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next page of results. Contains encoded pagination state (limit +
     * offset). When provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Comma-separated order statuses to filter by */
    fun status(): Optional<List<Status>> = Optional.ofNullable(status)

    /** Filter by symbol */
    fun symbol(): Optional<String> = Optional.ofNullable(symbol)

    /** The end date and time for the query range, inclusive (ISO 8601 format) */
    fun to(): Optional<OffsetDateTime> = Optional.ofNullable(to)

    /**
     * Comma-separated OEMS instrument UUIDs. Matches options orders whose resolved underlier is any
     * of the given IDs.
     */
    fun underlyingInstrumentIds(): Optional<String> = Optional.ofNullable(underlyingInstrumentIds)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OrderGetOrdersParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OrderGetOrdersParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderGetOrdersParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var from: OffsetDateTime? = null
        private var instrumentIds: MutableList<String>? = null
        private var instrumentType: InstrumentType? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var status: MutableList<Status>? = null
        private var symbol: String? = null
        private var to: OffsetDateTime? = null
        private var underlyingInstrumentIds: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(orderGetOrdersParams: OrderGetOrdersParams) = apply {
            accountId = orderGetOrdersParams.accountId
            from = orderGetOrdersParams.from
            instrumentIds = orderGetOrdersParams.instrumentIds?.toMutableList()
            instrumentType = orderGetOrdersParams.instrumentType
            pageSize = orderGetOrdersParams.pageSize
            pageToken = orderGetOrdersParams.pageToken
            status = orderGetOrdersParams.status?.toMutableList()
            symbol = orderGetOrdersParams.symbol
            to = orderGetOrdersParams.to
            underlyingInstrumentIds = orderGetOrdersParams.underlyingInstrumentIds
            additionalHeaders = orderGetOrdersParams.additionalHeaders.toBuilder()
            additionalQueryParams = orderGetOrdersParams.additionalQueryParams.toBuilder()
        }

        fun accountId(accountId: Long?) = apply { this.accountId = accountId }

        /**
         * Alias for [Builder.accountId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun accountId(accountId: Long) = accountId(accountId as Long?)

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<Long>) = accountId(accountId.getOrNull())

        /** The start date and time for the query range, inclusive (ISO 8601 format) */
        fun from(from: OffsetDateTime?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<OffsetDateTime>) = from(from.getOrNull())

        /** Comma-separated OEMS instrument UUIDs */
        fun instrumentIds(instrumentIds: List<String>?) = apply {
            this.instrumentIds = instrumentIds?.toMutableList()
        }

        /** Alias for calling [Builder.instrumentIds] with `instrumentIds.orElse(null)`. */
        fun instrumentIds(instrumentIds: Optional<List<String>>) =
            instrumentIds(instrumentIds.getOrNull())

        /**
         * Adds a single [String] to [instrumentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstrumentId(instrumentId: String) = apply {
            instrumentIds = (instrumentIds ?: mutableListOf()).apply { add(instrumentId) }
        }

        /** Instrument type filter (e.g., COMMON_STOCK, OPTION) */
        fun instrumentType(instrumentType: InstrumentType?) = apply {
            this.instrumentType = instrumentType
        }

        /** Alias for calling [Builder.instrumentType] with `instrumentType.orElse(null)`. */
        fun instrumentType(instrumentType: Optional<InstrumentType>) =
            instrumentType(instrumentType.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Token for retrieving the next page of results. Contains encoded pagination state (limit +
         * offset). When provided, page_size is ignored.
         */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /** Comma-separated order statuses to filter by */
        fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<List<Status>>) = status(status.getOrNull())

        /**
         * Adds a single [Status] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: Status) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

        /** Filter by symbol */
        fun symbol(symbol: String?) = apply { this.symbol = symbol }

        /** Alias for calling [Builder.symbol] with `symbol.orElse(null)`. */
        fun symbol(symbol: Optional<String>) = symbol(symbol.getOrNull())

        /** The end date and time for the query range, inclusive (ISO 8601 format) */
        fun to(to: OffsetDateTime?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<OffsetDateTime>) = to(to.getOrNull())

        /**
         * Comma-separated OEMS instrument UUIDs. Matches options orders whose resolved underlier is
         * any of the given IDs.
         */
        fun underlyingInstrumentIds(underlyingInstrumentIds: String?) = apply {
            this.underlyingInstrumentIds = underlyingInstrumentIds
        }

        /**
         * Alias for calling [Builder.underlyingInstrumentIds] with
         * `underlyingInstrumentIds.orElse(null)`.
         */
        fun underlyingInstrumentIds(underlyingInstrumentIds: Optional<String>) =
            underlyingInstrumentIds(underlyingInstrumentIds.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [OrderGetOrdersParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OrderGetOrdersParams =
            OrderGetOrdersParams(
                accountId,
                from,
                instrumentIds?.toImmutable(),
                instrumentType,
                pageSize,
                pageToken,
                status?.toImmutable(),
                symbol,
                to,
                underlyingInstrumentIds,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                from?.let { put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                instrumentIds?.forEachIndexed { index, it -> put("instrument_ids[$index]", it) }
                instrumentType?.let { put("instrument_type", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                status?.forEachIndexed { index, it -> put("status[$index]", it.toString()) }
                symbol?.let { put("symbol", it) }
                to?.let { put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                underlyingInstrumentIds?.let { put("underlying_instrument_ids", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Instrument type filter (e.g., COMMON_STOCK, OPTION) */
    class InstrumentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMMON_STOCK = of("COMMON_STOCK")

            @JvmField val PREFERRED_STOCK = of("PREFERRED_STOCK")

            @JvmField val CORPORATE_BOND = of("CORPORATE_BOND")

            @JvmField val OPTION = of("OPTION")

            @JvmField val FUTURE = of("FUTURE")

            @JvmField val WARRANT = of("WARRANT")

            @JvmField val CASH = of("CASH")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = InstrumentType(JsonField.of(value))
        }

        /** An enum containing [InstrumentType]'s known values. */
        enum class Known {
            COMMON_STOCK,
            PREFERRED_STOCK,
            CORPORATE_BOND,
            OPTION,
            FUTURE,
            WARRANT,
            CASH,
            OTHER,
        }

        /**
         * An enum containing [InstrumentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InstrumentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMMON_STOCK,
            PREFERRED_STOCK,
            CORPORATE_BOND,
            OPTION,
            FUTURE,
            WARRANT,
            CASH,
            OTHER,
            /**
             * An enum member indicating that [InstrumentType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                COMMON_STOCK -> Value.COMMON_STOCK
                PREFERRED_STOCK -> Value.PREFERRED_STOCK
                CORPORATE_BOND -> Value.CORPORATE_BOND
                OPTION -> Value.OPTION
                FUTURE -> Value.FUTURE
                WARRANT -> Value.WARRANT
                CASH -> Value.CASH
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                COMMON_STOCK -> Known.COMMON_STOCK
                PREFERRED_STOCK -> Known.PREFERRED_STOCK
                CORPORATE_BOND -> Known.CORPORATE_BOND
                OPTION -> Known.OPTION
                FUTURE -> Known.FUTURE
                WARRANT -> Known.WARRANT
                CASH -> Known.CASH
                OTHER -> Known.OTHER
                else -> throw ClearStreetInvalidDataException("Unknown InstrumentType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ClearStreetInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): InstrumentType = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InstrumentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Order status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING_NEW = of("PENDING_NEW")

            @JvmField val NEW = of("NEW")

            @JvmField val PARTIALLY_FILLED = of("PARTIALLY_FILLED")

            @JvmField val FILLED = of("FILLED")

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val REJECTED = of("REJECTED")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val PENDING_CANCEL = of("PENDING_CANCEL")

            @JvmField val PENDING_REPLACE = of("PENDING_REPLACE")

            @JvmField val REPLACED = of("REPLACED")

            @JvmField val DONE_FOR_DAY = of("DONE_FOR_DAY")

            @JvmField val STOPPED = of("STOPPED")

            @JvmField val SUSPENDED = of("SUSPENDED")

            @JvmField val CALCULATED = of("CALCULATED")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING_NEW,
            NEW,
            PARTIALLY_FILLED,
            FILLED,
            CANCELED,
            REJECTED,
            EXPIRED,
            PENDING_CANCEL,
            PENDING_REPLACE,
            REPLACED,
            DONE_FOR_DAY,
            STOPPED,
            SUSPENDED,
            CALCULATED,
            OTHER,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING_NEW,
            NEW,
            PARTIALLY_FILLED,
            FILLED,
            CANCELED,
            REJECTED,
            EXPIRED,
            PENDING_CANCEL,
            PENDING_REPLACE,
            REPLACED,
            DONE_FOR_DAY,
            STOPPED,
            SUSPENDED,
            CALCULATED,
            OTHER,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING_NEW -> Value.PENDING_NEW
                NEW -> Value.NEW
                PARTIALLY_FILLED -> Value.PARTIALLY_FILLED
                FILLED -> Value.FILLED
                CANCELED -> Value.CANCELED
                REJECTED -> Value.REJECTED
                EXPIRED -> Value.EXPIRED
                PENDING_CANCEL -> Value.PENDING_CANCEL
                PENDING_REPLACE -> Value.PENDING_REPLACE
                REPLACED -> Value.REPLACED
                DONE_FOR_DAY -> Value.DONE_FOR_DAY
                STOPPED -> Value.STOPPED
                SUSPENDED -> Value.SUSPENDED
                CALCULATED -> Value.CALCULATED
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING_NEW -> Known.PENDING_NEW
                NEW -> Known.NEW
                PARTIALLY_FILLED -> Known.PARTIALLY_FILLED
                FILLED -> Known.FILLED
                CANCELED -> Known.CANCELED
                REJECTED -> Known.REJECTED
                EXPIRED -> Known.EXPIRED
                PENDING_CANCEL -> Known.PENDING_CANCEL
                PENDING_REPLACE -> Known.PENDING_REPLACE
                REPLACED -> Known.REPLACED
                DONE_FOR_DAY -> Known.DONE_FOR_DAY
                STOPPED -> Known.STOPPED
                SUSPENDED -> Known.SUSPENDED
                CALCULATED -> Known.CALCULATED
                OTHER -> Known.OTHER
                else -> throw ClearStreetInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ClearStreetInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Status = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderGetOrdersParams &&
            accountId == other.accountId &&
            from == other.from &&
            instrumentIds == other.instrumentIds &&
            instrumentType == other.instrumentType &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            status == other.status &&
            symbol == other.symbol &&
            to == other.to &&
            underlyingInstrumentIds == other.underlyingInstrumentIds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountId,
            from,
            instrumentIds,
            instrumentType,
            pageSize,
            pageToken,
            status,
            symbol,
            to,
            underlyingInstrumentIds,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OrderGetOrdersParams{accountId=$accountId, from=$from, instrumentIds=$instrumentIds, instrumentType=$instrumentType, pageSize=$pageSize, pageToken=$pageToken, status=$status, symbol=$symbol, to=$to, underlyingInstrumentIds=$underlyingInstrumentIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
