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
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List options contracts.
 *
 * Returns options contracts with options-specific metadata. Exactly one identifier must be
 * provided: `underlier`/`underlying_instrument_id` (list all contracts for that underlier) or
 * `contract_ids` (look up specific contracts directly). `expiry`/`contract_type` apply as filters
 * in either case.
 */
class InstrumentGetOptionContractsParams
private constructor(
    private val contractIds: List<String>?,
    private val contractType: ContractType?,
    private val expiry: LocalDate?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val underlier: String?,
    private val underlyingInstrumentId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Comma-separated contract instrument IDs (UUID) or OSI option symbols to look up directly,
     * bypassing underlier expansion. Mutually exclusive with underlier/underlying_instrument_id; up
     * to 100 values.
     */
    fun contractIds(): Optional<List<String>> = Optional.ofNullable(contractIds)

    /** Filter by contract type: CALL or PUT */
    fun contractType(): Optional<ContractType> = Optional.ofNullable(contractType)

    /** Filter to contracts expiring on this date (YYYY-MM-DD) */
    fun expiry(): Optional<LocalDate> = Optional.ofNullable(expiry)

    /** The number of items to return per page. Only used when page_token is not provided. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next or previous page of results. Contains encoded pagination state;
     * when provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Underlier symbol (e.g., AAPL, SPX) */
    fun underlier(): Optional<String> = Optional.ofNullable(underlier)

    /** Instrument identifier or symbol of the underlying equity/index */
    fun underlyingInstrumentId(): Optional<String> = Optional.ofNullable(underlyingInstrumentId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstrumentGetOptionContractsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentGetOptionContractsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentGetOptionContractsParams]. */
    class Builder internal constructor() {

        private var contractIds: MutableList<String>? = null
        private var contractType: ContractType? = null
        private var expiry: LocalDate? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var underlier: String? = null
        private var underlyingInstrumentId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(instrumentGetOptionContractsParams: InstrumentGetOptionContractsParams) =
            apply {
                contractIds = instrumentGetOptionContractsParams.contractIds?.toMutableList()
                contractType = instrumentGetOptionContractsParams.contractType
                expiry = instrumentGetOptionContractsParams.expiry
                pageSize = instrumentGetOptionContractsParams.pageSize
                pageToken = instrumentGetOptionContractsParams.pageToken
                underlier = instrumentGetOptionContractsParams.underlier
                underlyingInstrumentId = instrumentGetOptionContractsParams.underlyingInstrumentId
                additionalHeaders = instrumentGetOptionContractsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    instrumentGetOptionContractsParams.additionalQueryParams.toBuilder()
            }

        /**
         * Comma-separated contract instrument IDs (UUID) or OSI option symbols to look up directly,
         * bypassing underlier expansion. Mutually exclusive with
         * underlier/underlying_instrument_id; up to 100 values.
         */
        fun contractIds(contractIds: List<String>?) = apply {
            this.contractIds = contractIds?.toMutableList()
        }

        /** Alias for calling [Builder.contractIds] with `contractIds.orElse(null)`. */
        fun contractIds(contractIds: Optional<List<String>>) = contractIds(contractIds.getOrNull())

        /**
         * Adds a single [String] to [contractIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContractId(contractId: String) = apply {
            contractIds = (contractIds ?: mutableListOf()).apply { add(contractId) }
        }

        /** Filter by contract type: CALL or PUT */
        fun contractType(contractType: ContractType?) = apply { this.contractType = contractType }

        /** Alias for calling [Builder.contractType] with `contractType.orElse(null)`. */
        fun contractType(contractType: Optional<ContractType>) =
            contractType(contractType.getOrNull())

        /** Filter to contracts expiring on this date (YYYY-MM-DD) */
        fun expiry(expiry: LocalDate?) = apply { this.expiry = expiry }

        /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
        fun expiry(expiry: Optional<LocalDate>) = expiry(expiry.getOrNull())

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

        /** Underlier symbol (e.g., AAPL, SPX) */
        fun underlier(underlier: String?) = apply { this.underlier = underlier }

        /** Alias for calling [Builder.underlier] with `underlier.orElse(null)`. */
        fun underlier(underlier: Optional<String>) = underlier(underlier.getOrNull())

        /** Instrument identifier or symbol of the underlying equity/index */
        fun underlyingInstrumentId(underlyingInstrumentId: String?) = apply {
            this.underlyingInstrumentId = underlyingInstrumentId
        }

        /**
         * Alias for calling [Builder.underlyingInstrumentId] with
         * `underlyingInstrumentId.orElse(null)`.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: Optional<String>) =
            underlyingInstrumentId(underlyingInstrumentId.getOrNull())

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
         * Returns an immutable instance of [InstrumentGetOptionContractsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentGetOptionContractsParams =
            InstrumentGetOptionContractsParams(
                contractIds?.toImmutable(),
                contractType,
                expiry,
                pageSize,
                pageToken,
                underlier,
                underlyingInstrumentId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                contractIds?.let { put("contract_ids", it.joinToString(",")) }
                contractType?.let { put("contract_type", it.toString()) }
                expiry?.let { put("expiry", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                underlier?.let { put("underlier", it) }
                underlyingInstrumentId?.let { put("underlying_instrument_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by contract type: CALL or PUT */
    class ContractType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CALL = of("CALL")

            @JvmField val PUT = of("PUT")

            @JvmStatic fun of(value: String) = ContractType(JsonField.of(value))
        }

        /** An enum containing [ContractType]'s known values. */
        enum class Known {
            CALL,
            PUT,
        }

        /**
         * An enum containing [ContractType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ContractType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALL,
            PUT,
            /**
             * An enum member indicating that [ContractType] was instantiated with an unknown value.
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
                CALL -> Value.CALL
                PUT -> Value.PUT
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
                CALL -> Known.CALL
                PUT -> Known.PUT
                else -> throw ClearStreetInvalidDataException("Unknown ContractType: $value")
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
        fun validate(): ContractType = apply {
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

            return other is ContractType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentGetOptionContractsParams &&
            contractIds == other.contractIds &&
            contractType == other.contractType &&
            expiry == other.expiry &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            underlier == other.underlier &&
            underlyingInstrumentId == other.underlyingInstrumentId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            contractIds,
            contractType,
            expiry,
            pageSize,
            pageToken,
            underlier,
            underlyingInstrumentId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentGetOptionContractsParams{contractIds=$contractIds, contractType=$contractType, expiry=$expiry, pageSize=$pageSize, pageToken=$pageToken, underlier=$underlier, underlyingInstrumentId=$underlyingInstrumentId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
