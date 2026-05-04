// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.marketdata.dailysummary

import com.clear_street.api.core.Params
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import java.util.Objects

/**
 * Returns the most recent OHLV and current price for the requested OEMS instruments. Backed by the
 * in-memory Polygon snapshot cache.
 *
 * Response contract: every request returns one row per **unique** `instrument_id`, in first-seen
 * request order. Unresolvable IDs come back with `symbol = null` and every market-data field
 * `null`; resolvable IDs with no cache entry come back with `symbol` populated but market-data
 * fields `null`.
 *
 * **Note (temporary):** ID resolution currently goes through the supplemental screener (OEMS
 * instrument_id → FMP fmp_symbol → metadata_id → realtime cache). Removed when the market-data
 * service serves daily aggregates directly, or when Polygon symbology is loaded into the instrument
 * cache.
 */
class DailySummaryGetDailySummariesParams
private constructor(
    private val instrumentIds: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Comma-separated OEMS instrument UUIDs (required, 1..=100) */
    fun instrumentIds(): String = instrumentIds

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DailySummaryGetDailySummariesParams].
         *
         * The following fields are required:
         * ```java
         * .instrumentIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DailySummaryGetDailySummariesParams]. */
    class Builder internal constructor() {

        private var instrumentIds: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            dailySummaryGetDailySummariesParams: DailySummaryGetDailySummariesParams
        ) = apply {
            instrumentIds = dailySummaryGetDailySummariesParams.instrumentIds
            additionalHeaders = dailySummaryGetDailySummariesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                dailySummaryGetDailySummariesParams.additionalQueryParams.toBuilder()
        }

        /** Comma-separated OEMS instrument UUIDs (required, 1..=100) */
        fun instrumentIds(instrumentIds: String) = apply { this.instrumentIds = instrumentIds }

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
         * Returns an immutable instance of [DailySummaryGetDailySummariesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instrumentIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DailySummaryGetDailySummariesParams =
            DailySummaryGetDailySummariesParams(
                checkRequired("instrumentIds", instrumentIds),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("instrument_ids", instrumentIds)
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DailySummaryGetDailySummariesParams &&
            instrumentIds == other.instrumentIds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(instrumentIds, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DailySummaryGetDailySummariesParams{instrumentIds=$instrumentIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
