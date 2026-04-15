// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.watchlists.items

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add an instrument to a watchlist */
class ItemAddWatchlistItemParams
private constructor(
    private val watchlistId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun watchlistId(): Optional<String> = Optional.ofNullable(watchlistId)

    /**
     * OEMS instrument ID (mutually exclusive with security_id/security_id_source)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentId(): Optional<String> = body.instrumentId()

    /**
     * Security identifier
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun securityId(): Optional<String> = body.securityId()

    /**
     * Security identifier source
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun securityIdSource(): Optional<SecurityIdSource> = body.securityIdSource()

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instrumentId(): JsonField<String> = body._instrumentId()

    /**
     * Returns the raw JSON value of [securityId].
     *
     * Unlike [securityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _securityId(): JsonField<String> = body._securityId()

    /**
     * Returns the raw JSON value of [securityIdSource].
     *
     * Unlike [securityIdSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _securityIdSource(): JsonField<SecurityIdSource> = body._securityIdSource()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ItemAddWatchlistItemParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ItemAddWatchlistItemParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemAddWatchlistItemParams]. */
    class Builder internal constructor() {

        private var watchlistId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(itemAddWatchlistItemParams: ItemAddWatchlistItemParams) = apply {
            watchlistId = itemAddWatchlistItemParams.watchlistId
            body = itemAddWatchlistItemParams.body.toBuilder()
            additionalHeaders = itemAddWatchlistItemParams.additionalHeaders.toBuilder()
            additionalQueryParams = itemAddWatchlistItemParams.additionalQueryParams.toBuilder()
        }

        fun watchlistId(watchlistId: String?) = apply { this.watchlistId = watchlistId }

        /** Alias for calling [Builder.watchlistId] with `watchlistId.orElse(null)`. */
        fun watchlistId(watchlistId: Optional<String>) = watchlistId(watchlistId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [instrumentId]
         * - [securityId]
         * - [securityIdSource]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** OEMS instrument ID (mutually exclusive with security_id/security_id_source) */
        fun instrumentId(instrumentId: String?) = apply { body.instrumentId(instrumentId) }

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

        /**
         * Sets [Builder.instrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instrumentId(instrumentId: JsonField<String>) = apply {
            body.instrumentId(instrumentId)
        }

        /** Security identifier */
        fun securityId(securityId: String?) = apply { body.securityId(securityId) }

        /** Alias for calling [Builder.securityId] with `securityId.orElse(null)`. */
        fun securityId(securityId: Optional<String>) = securityId(securityId.getOrNull())

        /**
         * Sets [Builder.securityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun securityId(securityId: JsonField<String>) = apply { body.securityId(securityId) }

        /** Security identifier source */
        fun securityIdSource(securityIdSource: SecurityIdSource?) = apply {
            body.securityIdSource(securityIdSource)
        }

        /** Alias for calling [Builder.securityIdSource] with `securityIdSource.orElse(null)`. */
        fun securityIdSource(securityIdSource: Optional<SecurityIdSource>) =
            securityIdSource(securityIdSource.getOrNull())

        /**
         * Sets [Builder.securityIdSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityIdSource] with a well-typed [SecurityIdSource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun securityIdSource(securityIdSource: JsonField<SecurityIdSource>) = apply {
            body.securityIdSource(securityIdSource)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [ItemAddWatchlistItemParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ItemAddWatchlistItemParams =
            ItemAddWatchlistItemParams(
                watchlistId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> watchlistId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to add an instrument to a watchlist */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val instrumentId: JsonField<String>,
        private val securityId: JsonField<String>,
        private val securityIdSource: JsonField<SecurityIdSource>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instrument_id")
            @ExcludeMissing
            instrumentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("security_id")
            @ExcludeMissing
            securityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("security_id_source")
            @ExcludeMissing
            securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of(),
        ) : this(instrumentId, securityId, securityIdSource, mutableMapOf())

        /**
         * OEMS instrument ID (mutually exclusive with security_id/security_id_source)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

        /**
         * Security identifier
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun securityId(): Optional<String> = securityId.getOptional("security_id")

        /**
         * Security identifier source
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun securityIdSource(): Optional<SecurityIdSource> =
            securityIdSource.getOptional("security_id_source")

        /**
         * Returns the raw JSON value of [instrumentId].
         *
         * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instrument_id")
        @ExcludeMissing
        fun _instrumentId(): JsonField<String> = instrumentId

        /**
         * Returns the raw JSON value of [securityId].
         *
         * Unlike [securityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("security_id")
        @ExcludeMissing
        fun _securityId(): JsonField<String> = securityId

        /**
         * Returns the raw JSON value of [securityIdSource].
         *
         * Unlike [securityIdSource], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("security_id_source")
        @ExcludeMissing
        fun _securityIdSource(): JsonField<SecurityIdSource> = securityIdSource

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var instrumentId: JsonField<String> = JsonMissing.of()
            private var securityId: JsonField<String> = JsonMissing.of()
            private var securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                instrumentId = body.instrumentId
                securityId = body.securityId
                securityIdSource = body.securityIdSource
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** OEMS instrument ID (mutually exclusive with security_id/security_id_source) */
            fun instrumentId(instrumentId: String?) =
                instrumentId(JsonField.ofNullable(instrumentId))

            /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
            fun instrumentId(instrumentId: Optional<String>) =
                instrumentId(instrumentId.getOrNull())

            /**
             * Sets [Builder.instrumentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instrumentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instrumentId(instrumentId: JsonField<String>) = apply {
                this.instrumentId = instrumentId
            }

            /** Security identifier */
            fun securityId(securityId: String?) = securityId(JsonField.ofNullable(securityId))

            /** Alias for calling [Builder.securityId] with `securityId.orElse(null)`. */
            fun securityId(securityId: Optional<String>) = securityId(securityId.getOrNull())

            /**
             * Sets [Builder.securityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.securityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun securityId(securityId: JsonField<String>) = apply { this.securityId = securityId }

            /** Security identifier source */
            fun securityIdSource(securityIdSource: SecurityIdSource?) =
                securityIdSource(JsonField.ofNullable(securityIdSource))

            /**
             * Alias for calling [Builder.securityIdSource] with `securityIdSource.orElse(null)`.
             */
            fun securityIdSource(securityIdSource: Optional<SecurityIdSource>) =
                securityIdSource(securityIdSource.getOrNull())

            /**
             * Sets [Builder.securityIdSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.securityIdSource] with a well-typed
             * [SecurityIdSource] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun securityIdSource(securityIdSource: JsonField<SecurityIdSource>) = apply {
                this.securityIdSource = securityIdSource
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    instrumentId,
                    securityId,
                    securityIdSource,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            instrumentId()
            securityId()
            securityIdSource().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
                (if (securityId.asKnown().isPresent) 1 else 0) +
                (securityIdSource.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                instrumentId == other.instrumentId &&
                securityId == other.securityId &&
                securityIdSource == other.securityIdSource &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(instrumentId, securityId, securityIdSource, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{instrumentId=$instrumentId, securityId=$securityId, securityIdSource=$securityIdSource, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ItemAddWatchlistItemParams &&
            watchlistId == other.watchlistId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(watchlistId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ItemAddWatchlistItemParams{watchlistId=$watchlistId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
