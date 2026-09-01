// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omnifeed

import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
 *
 * Returns the caller's personalized feed of market stories: upcoming earnings, dividends, and
 * splits, plus market news.
 *
 * The feed is a stable, append-only sequence per caller. Without a `cursor`, the response resumes
 * from the caller's oldest unseen item and continues forward; passing the id of the last item
 * received as `cursor` returns the items after it. Either way, when the known sequence runs short
 * of `limit`, fresh stories are appended and included. Re-requesting an earlier cursor replays the
 * same items in the same order.
 */
class OmniFeedGetFeedParams
private constructor(
    private val accountId: Long?,
    private val cursor: String?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Trading account to serve as context. Optional — the feed works without one. */
    fun accountId(): Optional<Long> = Optional.ofNullable(accountId)

    /**
     * Id of the last item already received; the response continues from the item after it. Omit to
     * resume from the oldest unseen item.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Maximum number of items to return (1–100, default 20). */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OmniFeedGetFeedParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [OmniFeedGetFeedParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OmniFeedGetFeedParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(omniFeedGetFeedParams: OmniFeedGetFeedParams) = apply {
            accountId = omniFeedGetFeedParams.accountId
            cursor = omniFeedGetFeedParams.cursor
            limit = omniFeedGetFeedParams.limit
            additionalHeaders = omniFeedGetFeedParams.additionalHeaders.toBuilder()
            additionalQueryParams = omniFeedGetFeedParams.additionalQueryParams.toBuilder()
        }

        /** Trading account to serve as context. Optional — the feed works without one. */
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
         * Id of the last item already received; the response continues from the item after it. Omit
         * to resume from the oldest unseen item.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Maximum number of items to return (1–100, default 20). */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

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
         * Returns an immutable instance of [OmniFeedGetFeedParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OmniFeedGetFeedParams =
            OmniFeedGetFeedParams(
                accountId,
                cursor,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountId?.let { put("account_id", it.toString()) }
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OmniFeedGetFeedParams &&
            accountId == other.accountId &&
            cursor == other.cursor &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountId, cursor, limit, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OmniFeedGetFeedParams{accountId=$accountId, cursor=$cursor, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
