// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves detailed information for a specific instrument. */
class InstrumentGetInstrumentByIdParams
private constructor(
    private val instrumentId: String?,
    private val includeOptionsExpiryDates: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** OEMS instrument UUID */
    fun instrumentId(): Optional<String> = Optional.ofNullable(instrumentId)

    /** When true, include unique options expiry dates for this instrument */
    fun includeOptionsExpiryDates(): Optional<Boolean> =
        Optional.ofNullable(includeOptionsExpiryDates)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstrumentGetInstrumentByIdParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentGetInstrumentByIdParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentGetInstrumentByIdParams]. */
    class Builder internal constructor() {

        private var instrumentId: String? = null
        private var includeOptionsExpiryDates: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(instrumentGetInstrumentByIdParams: InstrumentGetInstrumentByIdParams) =
            apply {
                instrumentId = instrumentGetInstrumentByIdParams.instrumentId
                includeOptionsExpiryDates =
                    instrumentGetInstrumentByIdParams.includeOptionsExpiryDates
                additionalHeaders = instrumentGetInstrumentByIdParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    instrumentGetInstrumentByIdParams.additionalQueryParams.toBuilder()
            }

        /** OEMS instrument UUID */
        fun instrumentId(instrumentId: String?) = apply { this.instrumentId = instrumentId }

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

        /** When true, include unique options expiry dates for this instrument */
        fun includeOptionsExpiryDates(includeOptionsExpiryDates: Boolean?) = apply {
            this.includeOptionsExpiryDates = includeOptionsExpiryDates
        }

        /**
         * Alias for [Builder.includeOptionsExpiryDates].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeOptionsExpiryDates(includeOptionsExpiryDates: Boolean) =
            includeOptionsExpiryDates(includeOptionsExpiryDates as Boolean?)

        /**
         * Alias for calling [Builder.includeOptionsExpiryDates] with
         * `includeOptionsExpiryDates.orElse(null)`.
         */
        fun includeOptionsExpiryDates(includeOptionsExpiryDates: Optional<Boolean>) =
            includeOptionsExpiryDates(includeOptionsExpiryDates.getOrNull())

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
         * Returns an immutable instance of [InstrumentGetInstrumentByIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentGetInstrumentByIdParams =
            InstrumentGetInstrumentByIdParams(
                instrumentId,
                includeOptionsExpiryDates,
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
                includeOptionsExpiryDates?.let {
                    put("include_options_expiry_dates", it.toString())
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentGetInstrumentByIdParams &&
            instrumentId == other.instrumentId &&
            includeOptionsExpiryDates == other.includeOptionsExpiryDates &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            instrumentId,
            includeOptionsExpiryDates,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentGetInstrumentByIdParams{instrumentId=$instrumentId, includeOptionsExpiryDates=$includeOptionsExpiryDates, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
