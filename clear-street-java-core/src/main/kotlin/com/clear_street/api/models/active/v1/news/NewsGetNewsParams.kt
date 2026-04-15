// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.news

import com.clear_street.api.core.Enum
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves news items with optional filtering by security IDs, time range, publisher, type, and
 * text query.
 */
class NewsGetNewsParams
private constructor(
    private val excludePublishers: String?,
    private val from: String?,
    private val includePublishers: String?,
    private val instrumentIds: List<String>?,
    private val newsType: NewsType?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val searchQuery: String?,
    private val securityId: List<String>?,
    private val securityIdSource: List<String>?,
    private val to: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Comma-separated list of publishers to exclude (mutually exclusive with include_publishers).
     */
    fun excludePublishers(): Optional<String> = Optional.ofNullable(excludePublishers)

    /** Inclusive start timestamp. Accepts `YYYY-MM-DD` or RFC3339 datetime. */
    fun from(): Optional<String> = Optional.ofNullable(from)

    /**
     * Comma-separated list of publishers to include (mutually exclusive with exclude_publishers).
     */
    fun includePublishers(): Optional<String> = Optional.ofNullable(includePublishers)

    /** Comma-delimited OEMS instrument UUIDs to filter by. */
    fun instrumentIds(): Optional<List<String>> = Optional.ofNullable(instrumentIds)

    /** Filter by news type. */
    fun newsType(): Optional<NewsType> = Optional.ofNullable(newsType)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next page of results. Contains encoded pagination state (limit +
     * offset). When provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Free-text query matched against title/text and associated security IDs. */
    fun searchQuery(): Optional<String> = Optional.ofNullable(searchQuery)

    /**
     * Filter by security ID(s). Accepts single value or indexed array.
     *
     * Examples:
     * - Single: `security_id=037833100`
     * - Multiple: `security_id[0]=037833100&security_id[1]=594918104`
     */
    fun securityId(): Optional<List<String>> = Optional.ofNullable(securityId)

    /**
     * Source(s) for the security ID filter. Must match the count and order of security_id.
     *
     * Examples:
     * - Single: `security_id_source=CUSIP`
     * - Multiple: `security_id_source[0]=CUSIP&security_id_source[1]=FIGI`
     */
    fun securityIdSource(): Optional<List<String>> = Optional.ofNullable(securityIdSource)

    /** Inclusive end timestamp. Accepts `YYYY-MM-DD` or RFC3339 datetime. */
    fun to(): Optional<String> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): NewsGetNewsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [NewsGetNewsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NewsGetNewsParams]. */
    class Builder internal constructor() {

        private var excludePublishers: String? = null
        private var from: String? = null
        private var includePublishers: String? = null
        private var instrumentIds: MutableList<String>? = null
        private var newsType: NewsType? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var searchQuery: String? = null
        private var securityId: MutableList<String>? = null
        private var securityIdSource: MutableList<String>? = null
        private var to: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(newsGetNewsParams: NewsGetNewsParams) = apply {
            excludePublishers = newsGetNewsParams.excludePublishers
            from = newsGetNewsParams.from
            includePublishers = newsGetNewsParams.includePublishers
            instrumentIds = newsGetNewsParams.instrumentIds?.toMutableList()
            newsType = newsGetNewsParams.newsType
            pageSize = newsGetNewsParams.pageSize
            pageToken = newsGetNewsParams.pageToken
            searchQuery = newsGetNewsParams.searchQuery
            securityId = newsGetNewsParams.securityId?.toMutableList()
            securityIdSource = newsGetNewsParams.securityIdSource?.toMutableList()
            to = newsGetNewsParams.to
            additionalHeaders = newsGetNewsParams.additionalHeaders.toBuilder()
            additionalQueryParams = newsGetNewsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Comma-separated list of publishers to exclude (mutually exclusive with
         * include_publishers).
         */
        fun excludePublishers(excludePublishers: String?) = apply {
            this.excludePublishers = excludePublishers
        }

        /** Alias for calling [Builder.excludePublishers] with `excludePublishers.orElse(null)`. */
        fun excludePublishers(excludePublishers: Optional<String>) =
            excludePublishers(excludePublishers.getOrNull())

        /** Inclusive start timestamp. Accepts `YYYY-MM-DD` or RFC3339 datetime. */
        fun from(from: String?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<String>) = from(from.getOrNull())

        /**
         * Comma-separated list of publishers to include (mutually exclusive with
         * exclude_publishers).
         */
        fun includePublishers(includePublishers: String?) = apply {
            this.includePublishers = includePublishers
        }

        /** Alias for calling [Builder.includePublishers] with `includePublishers.orElse(null)`. */
        fun includePublishers(includePublishers: Optional<String>) =
            includePublishers(includePublishers.getOrNull())

        /** Comma-delimited OEMS instrument UUIDs to filter by. */
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

        /** Filter by news type. */
        fun newsType(newsType: NewsType?) = apply { this.newsType = newsType }

        /** Alias for calling [Builder.newsType] with `newsType.orElse(null)`. */
        fun newsType(newsType: Optional<NewsType>) = newsType(newsType.getOrNull())

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

        /** Free-text query matched against title/text and associated security IDs. */
        fun searchQuery(searchQuery: String?) = apply { this.searchQuery = searchQuery }

        /** Alias for calling [Builder.searchQuery] with `searchQuery.orElse(null)`. */
        fun searchQuery(searchQuery: Optional<String>) = searchQuery(searchQuery.getOrNull())

        /**
         * Filter by security ID(s). Accepts single value or indexed array.
         *
         * Examples:
         * - Single: `security_id=037833100`
         * - Multiple: `security_id[0]=037833100&security_id[1]=594918104`
         */
        fun securityId(securityId: List<String>?) = apply {
            this.securityId = securityId?.toMutableList()
        }

        /** Alias for calling [Builder.securityId] with `securityId.orElse(null)`. */
        fun securityId(securityId: Optional<List<String>>) = securityId(securityId.getOrNull())

        /**
         * Adds a single [String] to [Builder.securityId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecurityId(securityId: String) = apply {
            this.securityId = (this.securityId ?: mutableListOf()).apply { add(securityId) }
        }

        /**
         * Source(s) for the security ID filter. Must match the count and order of security_id.
         *
         * Examples:
         * - Single: `security_id_source=CUSIP`
         * - Multiple: `security_id_source[0]=CUSIP&security_id_source[1]=FIGI`
         */
        fun securityIdSource(securityIdSource: List<String>?) = apply {
            this.securityIdSource = securityIdSource?.toMutableList()
        }

        /** Alias for calling [Builder.securityIdSource] with `securityIdSource.orElse(null)`. */
        fun securityIdSource(securityIdSource: Optional<List<String>>) =
            securityIdSource(securityIdSource.getOrNull())

        /**
         * Adds a single [String] to [Builder.securityIdSource].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecurityIdSource(securityIdSource: String) = apply {
            this.securityIdSource =
                (this.securityIdSource ?: mutableListOf()).apply { add(securityIdSource) }
        }

        /** Inclusive end timestamp. Accepts `YYYY-MM-DD` or RFC3339 datetime. */
        fun to(to: String?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<String>) = to(to.getOrNull())

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
         * Returns an immutable instance of [NewsGetNewsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NewsGetNewsParams =
            NewsGetNewsParams(
                excludePublishers,
                from,
                includePublishers,
                instrumentIds?.toImmutable(),
                newsType,
                pageSize,
                pageToken,
                searchQuery,
                securityId?.toImmutable(),
                securityIdSource?.toImmutable(),
                to,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                excludePublishers?.let { put("exclude_publishers", it) }
                from?.let { put("from", it) }
                includePublishers?.let { put("include_publishers", it) }
                instrumentIds?.forEachIndexed { index, it -> put("instrument_ids[$index]", it) }
                newsType?.let { put("news_type", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                searchQuery?.let { put("search_query", it) }
                securityId?.forEachIndexed { index, it -> put("security_id[$index]", it) }
                securityIdSource?.forEachIndexed { index, it ->
                    put("security_id_source[$index]", it)
                }
                to?.let { put("to", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by news type. */
    class NewsType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NEWS = of("NEWS")

            @JvmField val PRESS_RELEASE = of("PRESS_RELEASE")

            @JvmStatic fun of(value: String) = NewsType(JsonField.of(value))
        }

        /** An enum containing [NewsType]'s known values. */
        enum class Known {
            NEWS,
            PRESS_RELEASE,
        }

        /**
         * An enum containing [NewsType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NewsType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NEWS,
            PRESS_RELEASE,
            /** An enum member indicating that [NewsType] was instantiated with an unknown value. */
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
                NEWS -> Value.NEWS
                PRESS_RELEASE -> Value.PRESS_RELEASE
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
                NEWS -> Known.NEWS
                PRESS_RELEASE -> Known.PRESS_RELEASE
                else -> throw ClearStreetInvalidDataException("Unknown NewsType: $value")
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

        fun validate(): NewsType = apply {
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

            return other is NewsType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NewsGetNewsParams &&
            excludePublishers == other.excludePublishers &&
            from == other.from &&
            includePublishers == other.includePublishers &&
            instrumentIds == other.instrumentIds &&
            newsType == other.newsType &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            searchQuery == other.searchQuery &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            excludePublishers,
            from,
            includePublishers,
            instrumentIds,
            newsType,
            pageSize,
            pageToken,
            searchQuery,
            securityId,
            securityIdSource,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "NewsGetNewsParams{excludePublishers=$excludePublishers, from=$from, includePublishers=$includePublishers, instrumentIds=$instrumentIds, newsType=$newsType, pageSize=$pageSize, pageToken=$pageToken, searchQuery=$searchQuery, securityId=$securityId, securityIdSource=$securityIdSource, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
