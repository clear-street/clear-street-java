// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves quarterly income statements for a specific instrument, sorted by fiscal period (most
 * recent first).
 *
 * Date range defaults:
 * - `from_date`: None (no lower bound)
 * - `to_date`: None (no upper bound)
 */
class InstrumentDataGetInstrumentIncomeStatementsParams
private constructor(
    private val instrumentId: String?,
    private val fromDate: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val toDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** OEMS instrument UUID */
    fun instrumentId(): Optional<String> = Optional.ofNullable(instrumentId)

    /** The start date for the query range, inclusive (YYYY-MM-DD). */
    fun fromDate(): Optional<String> = Optional.ofNullable(fromDate)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next page of results. Contains encoded pagination state (limit +
     * offset). When provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** The end date for the query range, inclusive (YYYY-MM-DD). */
    fun toDate(): Optional<String> = Optional.ofNullable(toDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstrumentDataGetInstrumentIncomeStatementsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentDataGetInstrumentIncomeStatementsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentDataGetInstrumentIncomeStatementsParams]. */
    class Builder internal constructor() {

        private var instrumentId: String? = null
        private var fromDate: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var toDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            instrumentDataGetInstrumentIncomeStatementsParams:
                InstrumentDataGetInstrumentIncomeStatementsParams
        ) = apply {
            instrumentId = instrumentDataGetInstrumentIncomeStatementsParams.instrumentId
            fromDate = instrumentDataGetInstrumentIncomeStatementsParams.fromDate
            pageSize = instrumentDataGetInstrumentIncomeStatementsParams.pageSize
            pageToken = instrumentDataGetInstrumentIncomeStatementsParams.pageToken
            toDate = instrumentDataGetInstrumentIncomeStatementsParams.toDate
            additionalHeaders =
                instrumentDataGetInstrumentIncomeStatementsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                instrumentDataGetInstrumentIncomeStatementsParams.additionalQueryParams.toBuilder()
        }

        /** OEMS instrument UUID */
        fun instrumentId(instrumentId: String?) = apply { this.instrumentId = instrumentId }

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

        /** The start date for the query range, inclusive (YYYY-MM-DD). */
        fun fromDate(fromDate: String?) = apply { this.fromDate = fromDate }

        /** Alias for calling [Builder.fromDate] with `fromDate.orElse(null)`. */
        fun fromDate(fromDate: Optional<String>) = fromDate(fromDate.getOrNull())

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

        /** The end date for the query range, inclusive (YYYY-MM-DD). */
        fun toDate(toDate: String?) = apply { this.toDate = toDate }

        /** Alias for calling [Builder.toDate] with `toDate.orElse(null)`. */
        fun toDate(toDate: Optional<String>) = toDate(toDate.getOrNull())

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
         * Returns an immutable instance of [InstrumentDataGetInstrumentIncomeStatementsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentDataGetInstrumentIncomeStatementsParams =
            InstrumentDataGetInstrumentIncomeStatementsParams(
                instrumentId,
                fromDate,
                pageSize,
                pageToken,
                toDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instrumentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                fromDate?.let { put("from_date", it) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                toDate?.let { put("to_date", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentDataGetInstrumentIncomeStatementsParams &&
            instrumentId == other.instrumentId &&
            fromDate == other.fromDate &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            toDate == other.toDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            instrumentId,
            fromDate,
            pageSize,
            pageToken,
            toDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentDataGetInstrumentIncomeStatementsParams{instrumentId=$instrumentId, fromDate=$fromDate, pageSize=$pageSize, pageToken=$pageToken, toDate=$toDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
