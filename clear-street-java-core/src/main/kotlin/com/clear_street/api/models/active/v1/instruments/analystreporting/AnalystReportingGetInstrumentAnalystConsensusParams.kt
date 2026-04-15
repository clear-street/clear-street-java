// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.analystreporting

import com.clear_street.api.core.Params
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.models.active.v1.SecurityIdSource
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves analyst ratings and price targets for an instrument. */
class AnalystReportingGetInstrumentAnalystConsensusParams
private constructor(
    private val securityIdSource: SecurityIdSource,
    private val securityId: String?,
    private val from: LocalDate?,
    private val to: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Security identifier source */
    fun securityIdSource(): SecurityIdSource = securityIdSource

    fun securityId(): Optional<String> = Optional.ofNullable(securityId)

    /** The start date for the query range, inclusive (YYYY-MM-DD) */
    fun from(): Optional<LocalDate> = Optional.ofNullable(from)

    /** The end date for the query range, inclusive (YYYY-MM-DD) */
    fun to(): Optional<LocalDate> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AnalystReportingGetInstrumentAnalystConsensusParams].
         *
         * The following fields are required:
         * ```java
         * .securityIdSource()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalystReportingGetInstrumentAnalystConsensusParams]. */
    class Builder internal constructor() {

        private var securityIdSource: SecurityIdSource? = null
        private var securityId: String? = null
        private var from: LocalDate? = null
        private var to: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            analystReportingGetInstrumentAnalystConsensusParams:
                AnalystReportingGetInstrumentAnalystConsensusParams
        ) = apply {
            securityIdSource = analystReportingGetInstrumentAnalystConsensusParams.securityIdSource
            securityId = analystReportingGetInstrumentAnalystConsensusParams.securityId
            from = analystReportingGetInstrumentAnalystConsensusParams.from
            to = analystReportingGetInstrumentAnalystConsensusParams.to
            additionalHeaders =
                analystReportingGetInstrumentAnalystConsensusParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                analystReportingGetInstrumentAnalystConsensusParams.additionalQueryParams
                    .toBuilder()
        }

        /** Security identifier source */
        fun securityIdSource(securityIdSource: SecurityIdSource) = apply {
            this.securityIdSource = securityIdSource
        }

        fun securityId(securityId: String?) = apply { this.securityId = securityId }

        /** Alias for calling [Builder.securityId] with `securityId.orElse(null)`. */
        fun securityId(securityId: Optional<String>) = securityId(securityId.getOrNull())

        /** The start date for the query range, inclusive (YYYY-MM-DD) */
        fun from(from: LocalDate?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<LocalDate>) = from(from.getOrNull())

        /** The end date for the query range, inclusive (YYYY-MM-DD) */
        fun to(to: LocalDate?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<LocalDate>) = to(to.getOrNull())

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
         * Returns an immutable instance of [AnalystReportingGetInstrumentAnalystConsensusParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .securityIdSource()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalystReportingGetInstrumentAnalystConsensusParams =
            AnalystReportingGetInstrumentAnalystConsensusParams(
                checkRequired("securityIdSource", securityIdSource),
                securityId,
                from,
                to,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> securityIdSource.toString()
            1 -> securityId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                from?.let { put("from", it.toString()) }
                to?.let { put("to", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalystReportingGetInstrumentAnalystConsensusParams &&
            securityIdSource == other.securityIdSource &&
            securityId == other.securityId &&
            from == other.from &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            securityIdSource,
            securityId,
            from,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AnalystReportingGetInstrumentAnalystConsensusParams{securityIdSource=$securityIdSource, securityId=$securityId, from=$from, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
