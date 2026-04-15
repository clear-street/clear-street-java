// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.options.contracts

import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.ContractType
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns options contracts for a given underlier with options-specific metadata. Exactly one
 * underlier identifier must be provided.
 */
class ContractGetOptionContractsParams
private constructor(
    private val contractType: ContractType?,
    private val expiry: LocalDate?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val underlier: String?,
    private val underlierInstrumentId: String?,
    private val underlierSecurityId: String?,
    private val underlierSecurityIdSource: SecurityIdSource?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by contract type: CALL or PUT */
    fun contractType(): Optional<ContractType> = Optional.ofNullable(contractType)

    /** Filter to contracts expiring on this date (YYYY-MM-DD) */
    fun expiry(): Optional<LocalDate> = Optional.ofNullable(expiry)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next page of results. Contains encoded pagination state (limit +
     * offset). When provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Underlier symbol (e.g., AAPL, SPX) */
    fun underlier(): Optional<String> = Optional.ofNullable(underlier)

    /** OEMS instrument UUID of the underlying equity/index */
    fun underlierInstrumentId(): Optional<String> = Optional.ofNullable(underlierInstrumentId)

    /**
     * Security identifier of the underlying (e.g., CUSIP, ISIN). Must be paired with
     * underlier_security_id_source.
     */
    fun underlierSecurityId(): Optional<String> = Optional.ofNullable(underlierSecurityId)

    /**
     * Security ID source for the underlier (e.g., CMS, CUSIP). Must be paired with
     * underlier_security_id.
     */
    fun underlierSecurityIdSource(): Optional<SecurityIdSource> =
        Optional.ofNullable(underlierSecurityIdSource)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ContractGetOptionContractsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ContractGetOptionContractsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractGetOptionContractsParams]. */
    class Builder internal constructor() {

        private var contractType: ContractType? = null
        private var expiry: LocalDate? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var underlier: String? = null
        private var underlierInstrumentId: String? = null
        private var underlierSecurityId: String? = null
        private var underlierSecurityIdSource: SecurityIdSource? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractGetOptionContractsParams: ContractGetOptionContractsParams) =
            apply {
                contractType = contractGetOptionContractsParams.contractType
                expiry = contractGetOptionContractsParams.expiry
                pageSize = contractGetOptionContractsParams.pageSize
                pageToken = contractGetOptionContractsParams.pageToken
                underlier = contractGetOptionContractsParams.underlier
                underlierInstrumentId = contractGetOptionContractsParams.underlierInstrumentId
                underlierSecurityId = contractGetOptionContractsParams.underlierSecurityId
                underlierSecurityIdSource =
                    contractGetOptionContractsParams.underlierSecurityIdSource
                additionalHeaders = contractGetOptionContractsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    contractGetOptionContractsParams.additionalQueryParams.toBuilder()
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

        /** Underlier symbol (e.g., AAPL, SPX) */
        fun underlier(underlier: String?) = apply { this.underlier = underlier }

        /** Alias for calling [Builder.underlier] with `underlier.orElse(null)`. */
        fun underlier(underlier: Optional<String>) = underlier(underlier.getOrNull())

        /** OEMS instrument UUID of the underlying equity/index */
        fun underlierInstrumentId(underlierInstrumentId: String?) = apply {
            this.underlierInstrumentId = underlierInstrumentId
        }

        /**
         * Alias for calling [Builder.underlierInstrumentId] with
         * `underlierInstrumentId.orElse(null)`.
         */
        fun underlierInstrumentId(underlierInstrumentId: Optional<String>) =
            underlierInstrumentId(underlierInstrumentId.getOrNull())

        /**
         * Security identifier of the underlying (e.g., CUSIP, ISIN). Must be paired with
         * underlier_security_id_source.
         */
        fun underlierSecurityId(underlierSecurityId: String?) = apply {
            this.underlierSecurityId = underlierSecurityId
        }

        /**
         * Alias for calling [Builder.underlierSecurityId] with `underlierSecurityId.orElse(null)`.
         */
        fun underlierSecurityId(underlierSecurityId: Optional<String>) =
            underlierSecurityId(underlierSecurityId.getOrNull())

        /**
         * Security ID source for the underlier (e.g., CMS, CUSIP). Must be paired with
         * underlier_security_id.
         */
        fun underlierSecurityIdSource(underlierSecurityIdSource: SecurityIdSource?) = apply {
            this.underlierSecurityIdSource = underlierSecurityIdSource
        }

        /**
         * Alias for calling [Builder.underlierSecurityIdSource] with
         * `underlierSecurityIdSource.orElse(null)`.
         */
        fun underlierSecurityIdSource(underlierSecurityIdSource: Optional<SecurityIdSource>) =
            underlierSecurityIdSource(underlierSecurityIdSource.getOrNull())

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
         * Returns an immutable instance of [ContractGetOptionContractsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContractGetOptionContractsParams =
            ContractGetOptionContractsParams(
                contractType,
                expiry,
                pageSize,
                pageToken,
                underlier,
                underlierInstrumentId,
                underlierSecurityId,
                underlierSecurityIdSource,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                contractType?.let { put("contract_type", it.toString()) }
                expiry?.let { put("expiry", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                underlier?.let { put("underlier", it) }
                underlierInstrumentId?.let { put("underlier_instrument_id", it) }
                underlierSecurityId?.let { put("underlier_security_id", it) }
                underlierSecurityIdSource?.let {
                    put("underlier_security_id_source", it.toString())
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractGetOptionContractsParams &&
            contractType == other.contractType &&
            expiry == other.expiry &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            underlier == other.underlier &&
            underlierInstrumentId == other.underlierInstrumentId &&
            underlierSecurityId == other.underlierSecurityId &&
            underlierSecurityIdSource == other.underlierSecurityIdSource &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            contractType,
            expiry,
            pageSize,
            pageToken,
            underlier,
            underlierInstrumentId,
            underlierSecurityId,
            underlierSecurityIdSource,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ContractGetOptionContractsParams{contractType=$contractType, expiry=$expiry, pageSize=$pageSize, pageToken=$pageToken, underlier=$underlier, underlierInstrumentId=$underlierInstrumentId, underlierSecurityId=$underlierSecurityId, underlierSecurityIdSource=$underlierSecurityIdSource, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
