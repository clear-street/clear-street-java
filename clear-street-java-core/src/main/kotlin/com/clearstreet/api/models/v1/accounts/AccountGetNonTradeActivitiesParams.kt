// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Results are paginated. */
class AccountGetNonTradeActivitiesParams
private constructor(
    private val accountId: Long?,
    private val activityType: List<ActivityType>?,
    private val from: OffsetDateTime?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val to: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountId(): Optional<Long> = Optional.ofNullable(accountId)

    /** Filter by activity type(s). Comma-delimited list. Example: `activity_type=dividend,fee`. */
    fun activityType(): Optional<List<ActivityType>> = Optional.ofNullable(activityType)

    /** The start date and time for the query range, inclusive (ISO 8601 format) */
    fun from(): Optional<OffsetDateTime> = Optional.ofNullable(from)

    /** The number of items to return per page. Only used when page_token is not provided. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next or previous page of results. Contains encoded pagination state;
     * when provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** The end date and time for the query range, inclusive (ISO 8601 format) */
    fun to(): Optional<OffsetDateTime> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountGetNonTradeActivitiesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountGetNonTradeActivitiesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountGetNonTradeActivitiesParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var activityType: MutableList<ActivityType>? = null
        private var from: OffsetDateTime? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var to: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountGetNonTradeActivitiesParams: AccountGetNonTradeActivitiesParams) =
            apply {
                accountId = accountGetNonTradeActivitiesParams.accountId
                activityType = accountGetNonTradeActivitiesParams.activityType?.toMutableList()
                from = accountGetNonTradeActivitiesParams.from
                pageSize = accountGetNonTradeActivitiesParams.pageSize
                pageToken = accountGetNonTradeActivitiesParams.pageToken
                to = accountGetNonTradeActivitiesParams.to
                additionalHeaders = accountGetNonTradeActivitiesParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    accountGetNonTradeActivitiesParams.additionalQueryParams.toBuilder()
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

        /**
         * Filter by activity type(s). Comma-delimited list. Example: `activity_type=dividend,fee`.
         */
        fun activityType(activityType: List<ActivityType>?) = apply {
            this.activityType = activityType?.toMutableList()
        }

        /** Alias for calling [Builder.activityType] with `activityType.orElse(null)`. */
        fun activityType(activityType: Optional<List<ActivityType>>) =
            activityType(activityType.getOrNull())

        /**
         * Adds a single [ActivityType] to [Builder.activityType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActivityType(activityType: ActivityType) = apply {
            this.activityType = (this.activityType ?: mutableListOf()).apply { add(activityType) }
        }

        /** The start date and time for the query range, inclusive (ISO 8601 format) */
        fun from(from: OffsetDateTime?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<OffsetDateTime>) = from(from.getOrNull())

        /** The number of items to return per page. Only used when page_token is not provided. */
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
         * Token for retrieving the next or previous page of results. Contains encoded pagination
         * state; when provided, page_size is ignored.
         */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /** The end date and time for the query range, inclusive (ISO 8601 format) */
        fun to(to: OffsetDateTime?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<OffsetDateTime>) = to(to.getOrNull())

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
         * Returns an immutable instance of [AccountGetNonTradeActivitiesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountGetNonTradeActivitiesParams =
            AccountGetNonTradeActivitiesParams(
                accountId,
                activityType?.toImmutable(),
                from,
                pageSize,
                pageToken,
                to,
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
                activityType?.let { put("activity_type", it.joinToString(",") { it.toString() }) }
                from?.let { put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                to?.let { put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Type of an activity. */
    class ActivityType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MONEY_MOVEMENT = of("money_movement")

            @JvmField val INTEREST = of("interest")

            @JvmField val FEE = of("fee")

            @JvmField val DIVIDEND = of("dividend")

            @JvmField val OPTION_EVENT = of("option_event")

            @JvmField val TRANSFER = of("transfer")

            @JvmField val CORPORATE_ACTION = of("corporate_action")

            @JvmField val TAX_WITHHOLDING = of("tax_withholding")

            @JvmField val ADJUSTMENT = of("adjustment")

            @JvmField val OTHER = of("other")

            @JvmStatic fun of(value: String) = ActivityType(JsonField.of(value))
        }

        /** An enum containing [ActivityType]'s known values. */
        enum class Known {
            MONEY_MOVEMENT,
            INTEREST,
            FEE,
            DIVIDEND,
            OPTION_EVENT,
            TRANSFER,
            CORPORATE_ACTION,
            TAX_WITHHOLDING,
            ADJUSTMENT,
            OTHER,
        }

        /**
         * An enum containing [ActivityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ActivityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MONEY_MOVEMENT,
            INTEREST,
            FEE,
            DIVIDEND,
            OPTION_EVENT,
            TRANSFER,
            CORPORATE_ACTION,
            TAX_WITHHOLDING,
            ADJUSTMENT,
            OTHER,
            /**
             * An enum member indicating that [ActivityType] was instantiated with an unknown value.
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
                MONEY_MOVEMENT -> Value.MONEY_MOVEMENT
                INTEREST -> Value.INTEREST
                FEE -> Value.FEE
                DIVIDEND -> Value.DIVIDEND
                OPTION_EVENT -> Value.OPTION_EVENT
                TRANSFER -> Value.TRANSFER
                CORPORATE_ACTION -> Value.CORPORATE_ACTION
                TAX_WITHHOLDING -> Value.TAX_WITHHOLDING
                ADJUSTMENT -> Value.ADJUSTMENT
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
                MONEY_MOVEMENT -> Known.MONEY_MOVEMENT
                INTEREST -> Known.INTEREST
                FEE -> Known.FEE
                DIVIDEND -> Known.DIVIDEND
                OPTION_EVENT -> Known.OPTION_EVENT
                TRANSFER -> Known.TRANSFER
                CORPORATE_ACTION -> Known.CORPORATE_ACTION
                TAX_WITHHOLDING -> Known.TAX_WITHHOLDING
                ADJUSTMENT -> Known.ADJUSTMENT
                OTHER -> Known.OTHER
                else -> throw ClearStreetInvalidDataException("Unknown ActivityType: $value")
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
        fun validate(): ActivityType = apply {
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

            return other is ActivityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountGetNonTradeActivitiesParams &&
            accountId == other.accountId &&
            activityType == other.activityType &&
            from == other.from &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountId,
            activityType,
            from,
            pageSize,
            pageToken,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AccountGetNonTradeActivitiesParams{accountId=$accountId, activityType=$activityType, from=$from, pageSize=$pageSize, pageToken=$pageToken, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
