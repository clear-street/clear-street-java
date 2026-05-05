// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Metadata for the response. This will always contain a request ID which can be used to identify
 * the request to Clear Street for tracing, and optionally may include pagination data.
 */
class ResponseMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val requestId: JsonField<String>,
    private val nextPageToken: JsonField<String>,
    private val pageNumber: JsonField<Int>,
    private val previousPageToken: JsonField<String>,
    private val totalItems: JsonField<Long>,
    private val totalPages: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("request_id") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_page_token")
        @ExcludeMissing
        nextPageToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("page_number") @ExcludeMissing pageNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("previous_page_token")
        @ExcludeMissing
        previousPageToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_items") @ExcludeMissing totalItems: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_pages") @ExcludeMissing totalPages: JsonField<Int> = JsonMissing.of(),
    ) : this(
        requestId,
        nextPageToken,
        pageNumber,
        previousPageToken,
        totalItems,
        totalPages,
        mutableMapOf(),
    )

    /**
     * A unique ID for this request, generated upon ingestion of the request.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestId(): String = requestId.getRequired("request_id")

    /**
     * Base64URL-encoded pagination token containing limit and offset
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPageToken(): Optional<String> = nextPageToken.getOptional("next_page_token")

    /**
     * Pagination. Included if this was a GET (list) response
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageNumber(): Optional<Int> = pageNumber.getOptional("page_number")

    /**
     * Base64URL-encoded pagination token containing limit and offset
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousPageToken(): Optional<String> = previousPageToken.getOptional("previous_page_token")

    /**
     * Total number of items available (not just in this page).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalItems(): Optional<Long> = totalItems.getOptional("total_items")

    /**
     * Total number of pages available.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalPages(): Optional<Int> = totalPages.getOptional("total_pages")

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

    /**
     * Returns the raw JSON value of [nextPageToken].
     *
     * Unlike [nextPageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page_token")
    @ExcludeMissing
    fun _nextPageToken(): JsonField<String> = nextPageToken

    /**
     * Returns the raw JSON value of [pageNumber].
     *
     * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Int> = pageNumber

    /**
     * Returns the raw JSON value of [previousPageToken].
     *
     * Unlike [previousPageToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_page_token")
    @ExcludeMissing
    fun _previousPageToken(): JsonField<String> = previousPageToken

    /**
     * Returns the raw JSON value of [totalItems].
     *
     * Unlike [totalItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_items") @ExcludeMissing fun _totalItems(): JsonField<Long> = totalItems

    /**
     * Returns the raw JSON value of [totalPages].
     *
     * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Int> = totalPages

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

        /**
         * Returns a mutable builder for constructing an instance of [ResponseMetadata].
         *
         * The following fields are required:
         * ```java
         * .requestId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResponseMetadata]. */
    class Builder internal constructor() {

        private var requestId: JsonField<String>? = null
        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var pageNumber: JsonField<Int> = JsonMissing.of()
        private var previousPageToken: JsonField<String> = JsonMissing.of()
        private var totalItems: JsonField<Long> = JsonMissing.of()
        private var totalPages: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responseMetadata: ResponseMetadata) = apply {
            requestId = responseMetadata.requestId
            nextPageToken = responseMetadata.nextPageToken
            pageNumber = responseMetadata.pageNumber
            previousPageToken = responseMetadata.previousPageToken
            totalItems = responseMetadata.totalItems
            totalPages = responseMetadata.totalPages
            additionalProperties = responseMetadata.additionalProperties.toMutableMap()
        }

        /** A unique ID for this request, generated upon ingestion of the request. */
        fun requestId(requestId: String) = requestId(JsonField.of(requestId))

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

        /** Base64URL-encoded pagination token containing limit and offset */
        fun nextPageToken(nextPageToken: String?) =
            nextPageToken(JsonField.ofNullable(nextPageToken))

        /** Alias for calling [Builder.nextPageToken] with `nextPageToken.orElse(null)`. */
        fun nextPageToken(nextPageToken: Optional<String>) =
            nextPageToken(nextPageToken.getOrNull())

        /**
         * Sets [Builder.nextPageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPageToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextPageToken(nextPageToken: JsonField<String>) = apply {
            this.nextPageToken = nextPageToken
        }

        /** Pagination. Included if this was a GET (list) response */
        fun pageNumber(pageNumber: Int?) = pageNumber(JsonField.ofNullable(pageNumber))

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Int>) = pageNumber(pageNumber.getOrNull())

        /**
         * Sets [Builder.pageNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageNumber] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageNumber(pageNumber: JsonField<Int>) = apply { this.pageNumber = pageNumber }

        /** Base64URL-encoded pagination token containing limit and offset */
        fun previousPageToken(previousPageToken: String?) =
            previousPageToken(JsonField.ofNullable(previousPageToken))

        /** Alias for calling [Builder.previousPageToken] with `previousPageToken.orElse(null)`. */
        fun previousPageToken(previousPageToken: Optional<String>) =
            previousPageToken(previousPageToken.getOrNull())

        /**
         * Sets [Builder.previousPageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousPageToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousPageToken(previousPageToken: JsonField<String>) = apply {
            this.previousPageToken = previousPageToken
        }

        /** Total number of items available (not just in this page). */
        fun totalItems(totalItems: Long?) = totalItems(JsonField.ofNullable(totalItems))

        /**
         * Alias for [Builder.totalItems].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalItems(totalItems: Long) = totalItems(totalItems as Long?)

        /** Alias for calling [Builder.totalItems] with `totalItems.orElse(null)`. */
        fun totalItems(totalItems: Optional<Long>) = totalItems(totalItems.getOrNull())

        /**
         * Sets [Builder.totalItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalItems] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalItems(totalItems: JsonField<Long>) = apply { this.totalItems = totalItems }

        /** Total number of pages available. */
        fun totalPages(totalPages: Int?) = totalPages(JsonField.ofNullable(totalPages))

        /**
         * Alias for [Builder.totalPages].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalPages(totalPages: Int) = totalPages(totalPages as Int?)

        /** Alias for calling [Builder.totalPages] with `totalPages.orElse(null)`. */
        fun totalPages(totalPages: Optional<Int>) = totalPages(totalPages.getOrNull())

        /**
         * Sets [Builder.totalPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPages] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalPages(totalPages: JsonField<Int>) = apply { this.totalPages = totalPages }

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
         * Returns an immutable instance of [ResponseMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .requestId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResponseMetadata =
            ResponseMetadata(
                checkRequired("requestId", requestId),
                nextPageToken,
                pageNumber,
                previousPageToken,
                totalItems,
                totalPages,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ClearStreetInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ResponseMetadata = apply {
        if (validated) {
            return@apply
        }

        requestId()
        nextPageToken()
        pageNumber()
        previousPageToken()
        totalItems()
        totalPages()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (requestId.asKnown().isPresent) 1 else 0) +
            (if (nextPageToken.asKnown().isPresent) 1 else 0) +
            (if (pageNumber.asKnown().isPresent) 1 else 0) +
            (if (previousPageToken.asKnown().isPresent) 1 else 0) +
            (if (totalItems.asKnown().isPresent) 1 else 0) +
            (if (totalPages.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResponseMetadata &&
            requestId == other.requestId &&
            nextPageToken == other.nextPageToken &&
            pageNumber == other.pageNumber &&
            previousPageToken == other.previousPageToken &&
            totalItems == other.totalItems &&
            totalPages == other.totalPages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            requestId,
            nextPageToken,
            pageNumber,
            previousPageToken,
            totalItems,
            totalPages,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponseMetadata{requestId=$requestId, nextPageToken=$nextPageToken, pageNumber=$pageNumber, previousPageToken=$previousPageToken, totalItems=$totalItems, totalPages=$totalPages, additionalProperties=$additionalProperties}"
}
