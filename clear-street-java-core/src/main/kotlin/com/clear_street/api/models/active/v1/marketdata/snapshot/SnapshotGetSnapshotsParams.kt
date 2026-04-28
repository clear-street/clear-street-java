// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.marketdata.snapshot

import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get market data snapshots for one or more securities. */
class SnapshotGetSnapshotsParams
private constructor(
    private val ids: String?,
    private val securityId: List<String>?,
    private val securityIdSource: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Comma-separated OEMS instrument UUIDs. */
    fun ids(): Optional<String> = Optional.ofNullable(ids)

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

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SnapshotGetSnapshotsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SnapshotGetSnapshotsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapshotGetSnapshotsParams]. */
    class Builder internal constructor() {

        private var ids: String? = null
        private var securityId: MutableList<String>? = null
        private var securityIdSource: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(snapshotGetSnapshotsParams: SnapshotGetSnapshotsParams) = apply {
            ids = snapshotGetSnapshotsParams.ids
            securityId = snapshotGetSnapshotsParams.securityId?.toMutableList()
            securityIdSource = snapshotGetSnapshotsParams.securityIdSource?.toMutableList()
            additionalHeaders = snapshotGetSnapshotsParams.additionalHeaders.toBuilder()
            additionalQueryParams = snapshotGetSnapshotsParams.additionalQueryParams.toBuilder()
        }

        /** Comma-separated OEMS instrument UUIDs. */
        fun ids(ids: String?) = apply { this.ids = ids }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<String>) = ids(ids.getOrNull())

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
         * Returns an immutable instance of [SnapshotGetSnapshotsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SnapshotGetSnapshotsParams =
            SnapshotGetSnapshotsParams(
                ids,
                securityId?.toImmutable(),
                securityIdSource?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                ids?.let { put("ids", it) }
                securityId?.forEachIndexed { index, it -> put("security_id[$index]", it) }
                securityIdSource?.forEachIndexed { index, it ->
                    put("security_id_source[$index]", it)
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotGetSnapshotsParams &&
            ids == other.ids &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(ids, securityId, securityIdSource, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SnapshotGetSnapshotsParams{ids=$ids, securityId=$securityId, securityIdSource=$securityIdSource, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
