// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves a list of tradeable instruments. */
class InstrumentGetInstrumentsParams
private constructor(
    private val easyToBorrow: Boolean?,
    private val instrumentIds: List<String>?,
    private val instrumentType: InstrumentType?,
    private val isLiquidationOnly: Boolean?,
    private val isMarginable: Boolean?,
    private val isPtp: Boolean?,
    private val isShortProhibited: Boolean?,
    private val isThresholdSecurity: Boolean?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by easy to borrow status */
    fun easyToBorrow(): Optional<Boolean> = Optional.ofNullable(easyToBorrow)

    /** Comma-separated OEMS instrument UUIDs */
    fun instrumentIds(): Optional<List<String>> = Optional.ofNullable(instrumentIds)

    /** Filter by instrument type (e.g. COMMON_STOCK, OPTION) */
    fun instrumentType(): Optional<InstrumentType> = Optional.ofNullable(instrumentType)

    /** Filter by liquidation only status */
    fun isLiquidationOnly(): Optional<Boolean> = Optional.ofNullable(isLiquidationOnly)

    /** Filter by marginable status */
    fun isMarginable(): Optional<Boolean> = Optional.ofNullable(isMarginable)

    /** Filter by publicly traded partnership (PTP) status */
    fun isPtp(): Optional<Boolean> = Optional.ofNullable(isPtp)

    /** Filter by short prohibited status */
    fun isShortProhibited(): Optional<Boolean> = Optional.ofNullable(isShortProhibited)

    /** Filter by threshold security status */
    fun isThresholdSecurity(): Optional<Boolean> = Optional.ofNullable(isThresholdSecurity)

    /** The number of items to return per page. Only used when page_token is not provided. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next or previous page of results. Contains encoded pagination state;
     * when provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstrumentGetInstrumentsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentGetInstrumentsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentGetInstrumentsParams]. */
    class Builder internal constructor() {

        private var easyToBorrow: Boolean? = null
        private var instrumentIds: MutableList<String>? = null
        private var instrumentType: InstrumentType? = null
        private var isLiquidationOnly: Boolean? = null
        private var isMarginable: Boolean? = null
        private var isPtp: Boolean? = null
        private var isShortProhibited: Boolean? = null
        private var isThresholdSecurity: Boolean? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(instrumentGetInstrumentsParams: InstrumentGetInstrumentsParams) = apply {
            easyToBorrow = instrumentGetInstrumentsParams.easyToBorrow
            instrumentIds = instrumentGetInstrumentsParams.instrumentIds?.toMutableList()
            instrumentType = instrumentGetInstrumentsParams.instrumentType
            isLiquidationOnly = instrumentGetInstrumentsParams.isLiquidationOnly
            isMarginable = instrumentGetInstrumentsParams.isMarginable
            isPtp = instrumentGetInstrumentsParams.isPtp
            isShortProhibited = instrumentGetInstrumentsParams.isShortProhibited
            isThresholdSecurity = instrumentGetInstrumentsParams.isThresholdSecurity
            pageSize = instrumentGetInstrumentsParams.pageSize
            pageToken = instrumentGetInstrumentsParams.pageToken
            additionalHeaders = instrumentGetInstrumentsParams.additionalHeaders.toBuilder()
            additionalQueryParams = instrumentGetInstrumentsParams.additionalQueryParams.toBuilder()
        }

        /** Filter by easy to borrow status */
        fun easyToBorrow(easyToBorrow: Boolean?) = apply { this.easyToBorrow = easyToBorrow }

        /**
         * Alias for [Builder.easyToBorrow].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun easyToBorrow(easyToBorrow: Boolean) = easyToBorrow(easyToBorrow as Boolean?)

        /** Alias for calling [Builder.easyToBorrow] with `easyToBorrow.orElse(null)`. */
        fun easyToBorrow(easyToBorrow: Optional<Boolean>) = easyToBorrow(easyToBorrow.getOrNull())

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

        /** Filter by instrument type (e.g. COMMON_STOCK, OPTION) */
        fun instrumentType(instrumentType: InstrumentType?) = apply {
            this.instrumentType = instrumentType
        }

        /** Alias for calling [Builder.instrumentType] with `instrumentType.orElse(null)`. */
        fun instrumentType(instrumentType: Optional<InstrumentType>) =
            instrumentType(instrumentType.getOrNull())

        /** Filter by liquidation only status */
        fun isLiquidationOnly(isLiquidationOnly: Boolean?) = apply {
            this.isLiquidationOnly = isLiquidationOnly
        }

        /**
         * Alias for [Builder.isLiquidationOnly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isLiquidationOnly(isLiquidationOnly: Boolean) =
            isLiquidationOnly(isLiquidationOnly as Boolean?)

        /** Alias for calling [Builder.isLiquidationOnly] with `isLiquidationOnly.orElse(null)`. */
        fun isLiquidationOnly(isLiquidationOnly: Optional<Boolean>) =
            isLiquidationOnly(isLiquidationOnly.getOrNull())

        /** Filter by marginable status */
        fun isMarginable(isMarginable: Boolean?) = apply { this.isMarginable = isMarginable }

        /**
         * Alias for [Builder.isMarginable].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isMarginable(isMarginable: Boolean) = isMarginable(isMarginable as Boolean?)

        /** Alias for calling [Builder.isMarginable] with `isMarginable.orElse(null)`. */
        fun isMarginable(isMarginable: Optional<Boolean>) = isMarginable(isMarginable.getOrNull())

        /** Filter by publicly traded partnership (PTP) status */
        fun isPtp(isPtp: Boolean?) = apply { this.isPtp = isPtp }

        /**
         * Alias for [Builder.isPtp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isPtp(isPtp: Boolean) = isPtp(isPtp as Boolean?)

        /** Alias for calling [Builder.isPtp] with `isPtp.orElse(null)`. */
        fun isPtp(isPtp: Optional<Boolean>) = isPtp(isPtp.getOrNull())

        /** Filter by short prohibited status */
        fun isShortProhibited(isShortProhibited: Boolean?) = apply {
            this.isShortProhibited = isShortProhibited
        }

        /**
         * Alias for [Builder.isShortProhibited].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isShortProhibited(isShortProhibited: Boolean) =
            isShortProhibited(isShortProhibited as Boolean?)

        /** Alias for calling [Builder.isShortProhibited] with `isShortProhibited.orElse(null)`. */
        fun isShortProhibited(isShortProhibited: Optional<Boolean>) =
            isShortProhibited(isShortProhibited.getOrNull())

        /** Filter by threshold security status */
        fun isThresholdSecurity(isThresholdSecurity: Boolean?) = apply {
            this.isThresholdSecurity = isThresholdSecurity
        }

        /**
         * Alias for [Builder.isThresholdSecurity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isThresholdSecurity(isThresholdSecurity: Boolean) =
            isThresholdSecurity(isThresholdSecurity as Boolean?)

        /**
         * Alias for calling [Builder.isThresholdSecurity] with `isThresholdSecurity.orElse(null)`.
         */
        fun isThresholdSecurity(isThresholdSecurity: Optional<Boolean>) =
            isThresholdSecurity(isThresholdSecurity.getOrNull())

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
         * Returns an immutable instance of [InstrumentGetInstrumentsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentGetInstrumentsParams =
            InstrumentGetInstrumentsParams(
                easyToBorrow,
                instrumentIds?.toImmutable(),
                instrumentType,
                isLiquidationOnly,
                isMarginable,
                isPtp,
                isShortProhibited,
                isThresholdSecurity,
                pageSize,
                pageToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                easyToBorrow?.let { put("easy_to_borrow", it.toString()) }
                instrumentIds?.let { put("instrument_ids", it.joinToString(",")) }
                instrumentType?.let { put("instrument_type", it.toString()) }
                isLiquidationOnly?.let { put("is_liquidation_only", it.toString()) }
                isMarginable?.let { put("is_marginable", it.toString()) }
                isPtp?.let { put("is_ptp", it.toString()) }
                isShortProhibited?.let { put("is_short_prohibited", it.toString()) }
                isThresholdSecurity?.let { put("is_threshold_security", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by instrument type (e.g. COMMON_STOCK, OPTION) */
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

            @JvmField val OPTION = of("OPTION")

            @JvmField val CASH = of("CASH")

            @JvmStatic fun of(value: String) = InstrumentType(JsonField.of(value))
        }

        /** An enum containing [InstrumentType]'s known values. */
        enum class Known {
            COMMON_STOCK,
            OPTION,
            CASH,
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
            OPTION,
            CASH,
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
                OPTION -> Value.OPTION
                CASH -> Value.CASH
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
                OPTION -> Known.OPTION
                CASH -> Known.CASH
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentGetInstrumentsParams &&
            easyToBorrow == other.easyToBorrow &&
            instrumentIds == other.instrumentIds &&
            instrumentType == other.instrumentType &&
            isLiquidationOnly == other.isLiquidationOnly &&
            isMarginable == other.isMarginable &&
            isPtp == other.isPtp &&
            isShortProhibited == other.isShortProhibited &&
            isThresholdSecurity == other.isThresholdSecurity &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            easyToBorrow,
            instrumentIds,
            instrumentType,
            isLiquidationOnly,
            isMarginable,
            isPtp,
            isShortProhibited,
            isThresholdSecurity,
            pageSize,
            pageToken,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentGetInstrumentsParams{easyToBorrow=$easyToBorrow, instrumentIds=$instrumentIds, instrumentType=$instrumentType, isLiquidationOnly=$isLiquidationOnly, isMarginable=$isMarginable, isPtp=$isPtp, isShortProhibited=$isShortProhibited, isThresholdSecurity=$isThresholdSecurity, pageSize=$pageSize, pageToken=$pageToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
