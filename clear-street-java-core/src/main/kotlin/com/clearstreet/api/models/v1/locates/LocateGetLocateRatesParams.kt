// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.Params
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.core.toImmutable
import java.util.Objects

/**
 * > **Beta** — this endpoint may change before general availability.
 *
 * Fetch the cached locate borrow rates for up to 1,000 instruments. The response returns one row
 * per requested instrument, in request order. Each row carries either the `rate` or an `error` — a
 * `404` when the instrument is unknown or has no cached rate. The status is `207` when any row has
 * an error, `200` when every instrument resolved to a rate.
 */
class LocateGetLocateRatesParams
private constructor(
    private val instrumentIds: List<String>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Comma-separated instrument IDs (UUID) or symbols; at least one, at most 1,000. */
    fun instrumentIds(): List<String> = instrumentIds

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LocateGetLocateRatesParams].
         *
         * The following fields are required:
         * ```java
         * .instrumentIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LocateGetLocateRatesParams]. */
    class Builder internal constructor() {

        private var instrumentIds: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(locateGetLocateRatesParams: LocateGetLocateRatesParams) = apply {
            instrumentIds = locateGetLocateRatesParams.instrumentIds.toMutableList()
            additionalHeaders = locateGetLocateRatesParams.additionalHeaders.toBuilder()
            additionalQueryParams = locateGetLocateRatesParams.additionalQueryParams.toBuilder()
        }

        /** Comma-separated instrument IDs (UUID) or symbols; at least one, at most 1,000. */
        fun instrumentIds(instrumentIds: List<String>) = apply {
            this.instrumentIds = instrumentIds.toMutableList()
        }

        /**
         * Adds a single [String] to [instrumentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstrumentId(instrumentId: String) = apply {
            instrumentIds = (instrumentIds ?: mutableListOf()).apply { add(instrumentId) }
        }

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
         * Returns an immutable instance of [LocateGetLocateRatesParams].
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
        fun build(): LocateGetLocateRatesParams =
            LocateGetLocateRatesParams(
                checkRequired("instrumentIds", instrumentIds).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("instrument_ids", instrumentIds.joinToString(","))
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LocateGetLocateRatesParams &&
            instrumentIds == other.instrumentIds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(instrumentIds, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LocateGetLocateRatesParams{instrumentIds=$instrumentIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
