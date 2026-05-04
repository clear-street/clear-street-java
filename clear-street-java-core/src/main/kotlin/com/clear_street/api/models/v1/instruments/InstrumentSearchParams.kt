// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.Params
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Fast in-memory typeahead search over the loaded instrument universe.
 *
 * Supports three independent match dimensions in a single `q` parameter: ticker symbol (exact >
 * prefix > substring), alt-id exact (CUSIP / ISIN / OPRA root / CMS), and company name (token +
 * character-trigram). Results are ranked by a composite score that includes ADV (log-scaled),
 * listing status, marginable / ETB flags, and OTC / restricted / liquidation-only penalties.
 * Defaults to the `EQUITY` asset class (common stock + ETFs + exchange-traded mutual funds); pass
 * `asset_class=OPTION` for option chains.
 */
class InstrumentSearchParams
private constructor(
    private val q: String,
    private val assetClass: String?,
    private val country: String?,
    private val currency: String?,
    private val cursor: String?,
    private val includeInactive: Boolean?,
    private val includeRestricted: Boolean?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Search term applied case-insensitively to ticker symbols, alt-IDs (CUSIP/ISIN/OPRA-root/CMS),
     * and company names.
     */
    fun q(): String = q

    /** Comma-separated asset classes (EQUITY|OPTION|WARRANT|BOND|FX|OTHER). Defaults to EQUITY. */
    fun assetClass(): Optional<String> = Optional.ofNullable(assetClass)

    /** Optional listing-country filter (e.g., US). */
    fun country(): Optional<String> = Optional.ofNullable(country)

    /** Optional ISO currency filter (e.g., USD). */
    fun currency(): Optional<String> = Optional.ofNullable(currency)

    /**
     * Opaque continuation cursor for show-more paging — pass the `next_page_token` from a prior
     * response. Same wire format as `page_token` on other paginated endpoints.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Include inactive instruments. Default false. */
    fun includeInactive(): Optional<Boolean> = Optional.ofNullable(includeInactive)

    /** Include restricted instruments. Default true (penalized in ranking). */
    fun includeRestricted(): Optional<Boolean> = Optional.ofNullable(includeRestricted)

    /** Maximum hits to return. Bounded [1, 100]. Default 20. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InstrumentSearchParams].
         *
         * The following fields are required:
         * ```java
         * .q()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentSearchParams]. */
    class Builder internal constructor() {

        private var q: String? = null
        private var assetClass: String? = null
        private var country: String? = null
        private var currency: String? = null
        private var cursor: String? = null
        private var includeInactive: Boolean? = null
        private var includeRestricted: Boolean? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(instrumentSearchParams: InstrumentSearchParams) = apply {
            q = instrumentSearchParams.q
            assetClass = instrumentSearchParams.assetClass
            country = instrumentSearchParams.country
            currency = instrumentSearchParams.currency
            cursor = instrumentSearchParams.cursor
            includeInactive = instrumentSearchParams.includeInactive
            includeRestricted = instrumentSearchParams.includeRestricted
            limit = instrumentSearchParams.limit
            additionalHeaders = instrumentSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = instrumentSearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * Search term applied case-insensitively to ticker symbols, alt-IDs
         * (CUSIP/ISIN/OPRA-root/CMS), and company names.
         */
        fun q(q: String) = apply { this.q = q }

        /**
         * Comma-separated asset classes (EQUITY|OPTION|WARRANT|BOND|FX|OTHER). Defaults to EQUITY.
         */
        fun assetClass(assetClass: String?) = apply { this.assetClass = assetClass }

        /** Alias for calling [Builder.assetClass] with `assetClass.orElse(null)`. */
        fun assetClass(assetClass: Optional<String>) = assetClass(assetClass.getOrNull())

        /** Optional listing-country filter (e.g., US). */
        fun country(country: String?) = apply { this.country = country }

        /** Alias for calling [Builder.country] with `country.orElse(null)`. */
        fun country(country: Optional<String>) = country(country.getOrNull())

        /** Optional ISO currency filter (e.g., USD). */
        fun currency(currency: String?) = apply { this.currency = currency }

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Opaque continuation cursor for show-more paging — pass the `next_page_token` from a prior
         * response. Same wire format as `page_token` on other paginated endpoints.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Include inactive instruments. Default false. */
        fun includeInactive(includeInactive: Boolean?) = apply {
            this.includeInactive = includeInactive
        }

        /**
         * Alias for [Builder.includeInactive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeInactive(includeInactive: Boolean) = includeInactive(includeInactive as Boolean?)

        /** Alias for calling [Builder.includeInactive] with `includeInactive.orElse(null)`. */
        fun includeInactive(includeInactive: Optional<Boolean>) =
            includeInactive(includeInactive.getOrNull())

        /** Include restricted instruments. Default true (penalized in ranking). */
        fun includeRestricted(includeRestricted: Boolean?) = apply {
            this.includeRestricted = includeRestricted
        }

        /**
         * Alias for [Builder.includeRestricted].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeRestricted(includeRestricted: Boolean) =
            includeRestricted(includeRestricted as Boolean?)

        /** Alias for calling [Builder.includeRestricted] with `includeRestricted.orElse(null)`. */
        fun includeRestricted(includeRestricted: Optional<Boolean>) =
            includeRestricted(includeRestricted.getOrNull())

        /** Maximum hits to return. Bounded [1, 100]. Default 20. */
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
         * Returns an immutable instance of [InstrumentSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .q()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentSearchParams =
            InstrumentSearchParams(
                checkRequired("q", q),
                assetClass,
                country,
                currency,
                cursor,
                includeInactive,
                includeRestricted,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("q", q)
                assetClass?.let { put("asset_class", it) }
                country?.let { put("country", it) }
                currency?.let { put("currency", it) }
                cursor?.let { put("cursor", it) }
                includeInactive?.let { put("include_inactive", it.toString()) }
                includeRestricted?.let { put("include_restricted", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentSearchParams &&
            q == other.q &&
            assetClass == other.assetClass &&
            country == other.country &&
            currency == other.currency &&
            cursor == other.cursor &&
            includeInactive == other.includeInactive &&
            includeRestricted == other.includeRestricted &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            q,
            assetClass,
            country,
            currency,
            cursor,
            includeInactive,
            includeRestricted,
            limit,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentSearchParams{q=$q, assetClass=$assetClass, country=$country, currency=$currency, cursor=$cursor, includeInactive=$includeInactive, includeRestricted=$includeRestricted, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
