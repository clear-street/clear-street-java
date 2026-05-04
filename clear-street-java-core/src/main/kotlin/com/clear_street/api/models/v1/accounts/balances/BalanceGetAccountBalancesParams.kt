// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.balances

import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Fetch account balance information */
class BalanceGetAccountBalancesParams
private constructor(
    private val accountId: Long?,
    private val topMarginContributorsLimit: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountId(): Optional<Long> = Optional.ofNullable(accountId)

    /** Limit the number of top margin contributors returned by the engine. */
    fun topMarginContributorsLimit(): Optional<Int> =
        Optional.ofNullable(topMarginContributorsLimit)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BalanceGetAccountBalancesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceGetAccountBalancesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceGetAccountBalancesParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var topMarginContributorsLimit: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceGetAccountBalancesParams: BalanceGetAccountBalancesParams) =
            apply {
                accountId = balanceGetAccountBalancesParams.accountId
                topMarginContributorsLimit =
                    balanceGetAccountBalancesParams.topMarginContributorsLimit
                additionalHeaders = balanceGetAccountBalancesParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    balanceGetAccountBalancesParams.additionalQueryParams.toBuilder()
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

        /** Limit the number of top margin contributors returned by the engine. */
        fun topMarginContributorsLimit(topMarginContributorsLimit: Int?) = apply {
            this.topMarginContributorsLimit = topMarginContributorsLimit
        }

        /**
         * Alias for [Builder.topMarginContributorsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topMarginContributorsLimit(topMarginContributorsLimit: Int) =
            topMarginContributorsLimit(topMarginContributorsLimit as Int?)

        /**
         * Alias for calling [Builder.topMarginContributorsLimit] with
         * `topMarginContributorsLimit.orElse(null)`.
         */
        fun topMarginContributorsLimit(topMarginContributorsLimit: Optional<Int>) =
            topMarginContributorsLimit(topMarginContributorsLimit.getOrNull())

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
         * Returns an immutable instance of [BalanceGetAccountBalancesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BalanceGetAccountBalancesParams =
            BalanceGetAccountBalancesParams(
                accountId,
                topMarginContributorsLimit,
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
                topMarginContributorsLimit?.let {
                    put("top_margin_contributors_limit", it.toString())
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceGetAccountBalancesParams &&
            accountId == other.accountId &&
            topMarginContributorsLimit == other.topMarginContributorsLimit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountId,
            topMarginContributorsLimit,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BalanceGetAccountBalancesParams{accountId=$accountId, topMarginContributorsLimit=$topMarginContributorsLimit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
