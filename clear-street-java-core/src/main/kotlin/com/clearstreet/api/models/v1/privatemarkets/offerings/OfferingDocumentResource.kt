// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A campaign document's display metadata. Exactly one of `url`/`object_key` is set; an object key
 * is resolved and signed elsewhere.
 */
class OfferingDocumentResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val displayOrder: JsonField<Int>,
    private val documentType: JsonField<OfferingDocumentType>,
    private val title: JsonField<String>,
    private val objectKey: JsonField<String>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val sourceUrl: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_order")
        @ExcludeMissing
        displayOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<OfferingDocumentType> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_key") @ExcludeMissing objectKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published_at")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_url") @ExcludeMissing sourceUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        displayOrder,
        documentType,
        title,
        objectKey,
        publishedAt,
        source,
        sourceUrl,
        url,
        mutableMapOf(),
    )

    /**
     * Stable identifier.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Stable display position.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayOrder(): Int = displayOrder.getRequired("display_order")

    /**
     * Document kind.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): OfferingDocumentType = documentType.getRequired("document_type")

    /**
     * Display title.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * Object-store key, when the document is stored internally.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectKey(): Optional<String> = objectKey.getOptional("object_key")

    /**
     * Publication time, when known.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publishedAt(): Optional<OffsetDateTime> = publishedAt.getOptional("published_at")

    /**
     * Source publisher/provider.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<String> = source.getOptional("source")

    /**
     * Source URL.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceUrl(): Optional<String> = sourceUrl.getOptional("source_url")

    /**
     * Externally reachable URL, when the document lives at one.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [displayOrder].
     *
     * Unlike [displayOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_order")
    @ExcludeMissing
    fun _displayOrder(): JsonField<Int> = displayOrder

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<OfferingDocumentType> = documentType

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [objectKey].
     *
     * Unlike [objectKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object_key") @ExcludeMissing fun _objectKey(): JsonField<String> = objectKey

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published_at")
    @ExcludeMissing
    fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [sourceUrl].
     *
     * Unlike [sourceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_url") @ExcludeMissing fun _sourceUrl(): JsonField<String> = sourceUrl

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [OfferingDocumentResource].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .displayOrder()
         * .documentType()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OfferingDocumentResource]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var displayOrder: JsonField<Int>? = null
        private var documentType: JsonField<OfferingDocumentType>? = null
        private var title: JsonField<String>? = null
        private var objectKey: JsonField<String> = JsonMissing.of()
        private var publishedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var sourceUrl: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(offeringDocumentResource: OfferingDocumentResource) = apply {
            id = offeringDocumentResource.id
            displayOrder = offeringDocumentResource.displayOrder
            documentType = offeringDocumentResource.documentType
            title = offeringDocumentResource.title
            objectKey = offeringDocumentResource.objectKey
            publishedAt = offeringDocumentResource.publishedAt
            source = offeringDocumentResource.source
            sourceUrl = offeringDocumentResource.sourceUrl
            url = offeringDocumentResource.url
            additionalProperties = offeringDocumentResource.additionalProperties.toMutableMap()
        }

        /** Stable identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Stable display position. */
        fun displayOrder(displayOrder: Int) = displayOrder(JsonField.of(displayOrder))

        /**
         * Sets [Builder.displayOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOrder] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayOrder(displayOrder: JsonField<Int>) = apply { this.displayOrder = displayOrder }

        /** Document kind. */
        fun documentType(documentType: OfferingDocumentType) =
            documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [OfferingDocumentType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentType(documentType: JsonField<OfferingDocumentType>) = apply {
            this.documentType = documentType
        }

        /** Display title. */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Object-store key, when the document is stored internally. */
        fun objectKey(objectKey: String?) = objectKey(JsonField.ofNullable(objectKey))

        /** Alias for calling [Builder.objectKey] with `objectKey.orElse(null)`. */
        fun objectKey(objectKey: Optional<String>) = objectKey(objectKey.getOrNull())

        /**
         * Sets [Builder.objectKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectKey(objectKey: JsonField<String>) = apply { this.objectKey = objectKey }

        /** Publication time, when known. */
        fun publishedAt(publishedAt: OffsetDateTime?) =
            publishedAt(JsonField.ofNullable(publishedAt))

        /** Alias for calling [Builder.publishedAt] with `publishedAt.orElse(null)`. */
        fun publishedAt(publishedAt: Optional<OffsetDateTime>) =
            publishedAt(publishedAt.getOrNull())

        /**
         * Sets [Builder.publishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishedAt(publishedAt: JsonField<OffsetDateTime>) = apply {
            this.publishedAt = publishedAt
        }

        /** Source publisher/provider. */
        fun source(source: String?) = source(JsonField.ofNullable(source))

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<String>) = source(source.getOrNull())

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Source URL. */
        fun sourceUrl(sourceUrl: String?) = sourceUrl(JsonField.ofNullable(sourceUrl))

        /** Alias for calling [Builder.sourceUrl] with `sourceUrl.orElse(null)`. */
        fun sourceUrl(sourceUrl: Optional<String>) = sourceUrl(sourceUrl.getOrNull())

        /**
         * Sets [Builder.sourceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceUrl(sourceUrl: JsonField<String>) = apply { this.sourceUrl = sourceUrl }

        /** Externally reachable URL, when the document lives at one. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** Alias for calling [Builder.url] with `url.orElse(null)`. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [OfferingDocumentResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .displayOrder()
         * .documentType()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OfferingDocumentResource =
            OfferingDocumentResource(
                checkRequired("id", id),
                checkRequired("displayOrder", displayOrder),
                checkRequired("documentType", documentType),
                checkRequired("title", title),
                objectKey,
                publishedAt,
                source,
                sourceUrl,
                url,
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
    fun validate(): OfferingDocumentResource = apply {
        if (validated) {
            return@apply
        }

        id()
        displayOrder()
        documentType().validate()
        title()
        objectKey()
        publishedAt()
        source()
        sourceUrl()
        url()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (displayOrder.asKnown().isPresent) 1 else 0) +
            (documentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (objectKey.asKnown().isPresent) 1 else 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (sourceUrl.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OfferingDocumentResource &&
            id == other.id &&
            displayOrder == other.displayOrder &&
            documentType == other.documentType &&
            title == other.title &&
            objectKey == other.objectKey &&
            publishedAt == other.publishedAt &&
            source == other.source &&
            sourceUrl == other.sourceUrl &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            displayOrder,
            documentType,
            title,
            objectKey,
            publishedAt,
            source,
            sourceUrl,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OfferingDocumentResource{id=$id, displayOrder=$displayOrder, documentType=$documentType, title=$title, objectKey=$objectKey, publishedAt=$publishedAt, source=$source, sourceUrl=$sourceUrl, url=$url, additionalProperties=$additionalProperties}"
}
