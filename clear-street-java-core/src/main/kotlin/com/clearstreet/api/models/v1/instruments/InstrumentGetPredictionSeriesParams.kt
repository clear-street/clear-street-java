// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
 *
 * Lists the distinct series codes of prediction markets that can currently be listed: markets that
 * are initialized or active and have not yet closed. Series are ordered by code.
 *
 * `categories` keeps series with a market in any listed category, ignoring case. Pages carry no
 * totals: follow `next_page_token` until it is absent.
 */
class InstrumentGetPredictionSeriesParams
private constructor(
    private val categories: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Comma-separated categories. Keeps series with a market in any of them, ignoring case. */
    fun categories(): Optional<String> = Optional.ofNullable(categories)

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

        @JvmStatic fun none(): InstrumentGetPredictionSeriesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentGetPredictionSeriesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentGetPredictionSeriesParams]. */
    class Builder internal constructor() {

        private var categories: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            instrumentGetPredictionSeriesParams: InstrumentGetPredictionSeriesParams
        ) = apply {
            categories = instrumentGetPredictionSeriesParams.categories
            pageSize = instrumentGetPredictionSeriesParams.pageSize
            pageToken = instrumentGetPredictionSeriesParams.pageToken
            additionalHeaders = instrumentGetPredictionSeriesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                instrumentGetPredictionSeriesParams.additionalQueryParams.toBuilder()
        }

        /** Comma-separated categories. Keeps series with a market in any of them, ignoring case. */
        fun categories(categories: String?) = apply { this.categories = categories }

        /** Alias for calling [Builder.categories] with `categories.orElse(null)`. */
        fun categories(categories: Optional<String>) = categories(categories.getOrNull())

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
         * Returns an immutable instance of [InstrumentGetPredictionSeriesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentGetPredictionSeriesParams =
            InstrumentGetPredictionSeriesParams(
                categories,
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
                categories?.let { put("categories", it) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentGetPredictionSeriesParams &&
            categories == other.categories &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(categories, pageSize, pageToken, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InstrumentGetPredictionSeriesParams{categories=$categories, pageSize=$pageSize, pageToken=$pageToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
