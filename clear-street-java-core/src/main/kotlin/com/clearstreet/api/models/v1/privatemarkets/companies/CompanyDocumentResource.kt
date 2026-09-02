// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

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

/** A company-level research or source document. */
class CompanyDocumentResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val documentType: JsonField<CompanyDocumentType>,
    private val relation: JsonField<CompanyDocumentRelation>,
    private val title: JsonField<String>,
    private val url: JsonField<String>,
    private val externalId: JsonField<String>,
    private val preview: JsonField<CompanyDocumentPreview>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<CompanyDocumentType> = JsonMissing.of(),
        @JsonProperty("relation")
        @ExcludeMissing
        relation: JsonField<CompanyDocumentRelation> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preview")
        @ExcludeMissing
        preview: JsonField<CompanyDocumentPreview> = JsonMissing.of(),
        @JsonProperty("published_at")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(documentType, relation, title, url, externalId, preview, publishedAt, mutableMapOf())

    /**
     * Typed document kind.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): CompanyDocumentType = documentType.getRequired("document_type")

    /**
     * Relationship to this company.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun relation(): CompanyDocumentRelation = relation.getRequired("relation")

    /**
     * Display title.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * Document URL.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Optional source identifier retained for reconciliation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("external_id")

    /**
     * Optional card preview.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preview(): Optional<CompanyDocumentPreview> = preview.getOptional("preview")

    /**
     * Publication time, when known.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publishedAt(): Optional<OffsetDateTime> = publishedAt.getOptional("published_at")

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<CompanyDocumentType> = documentType

    /**
     * Returns the raw JSON value of [relation].
     *
     * Unlike [relation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relation")
    @ExcludeMissing
    fun _relation(): JsonField<CompanyDocumentRelation> = relation

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [preview].
     *
     * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preview")
    @ExcludeMissing
    fun _preview(): JsonField<CompanyDocumentPreview> = preview

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published_at")
    @ExcludeMissing
    fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

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
         * Returns a mutable builder for constructing an instance of [CompanyDocumentResource].
         *
         * The following fields are required:
         * ```java
         * .documentType()
         * .relation()
         * .title()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyDocumentResource]. */
    class Builder internal constructor() {

        private var documentType: JsonField<CompanyDocumentType>? = null
        private var relation: JsonField<CompanyDocumentRelation>? = null
        private var title: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var externalId: JsonField<String> = JsonMissing.of()
        private var preview: JsonField<CompanyDocumentPreview> = JsonMissing.of()
        private var publishedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyDocumentResource: CompanyDocumentResource) = apply {
            documentType = companyDocumentResource.documentType
            relation = companyDocumentResource.relation
            title = companyDocumentResource.title
            url = companyDocumentResource.url
            externalId = companyDocumentResource.externalId
            preview = companyDocumentResource.preview
            publishedAt = companyDocumentResource.publishedAt
            additionalProperties = companyDocumentResource.additionalProperties.toMutableMap()
        }

        /** Typed document kind. */
        fun documentType(documentType: CompanyDocumentType) =
            documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [CompanyDocumentType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentType(documentType: JsonField<CompanyDocumentType>) = apply {
            this.documentType = documentType
        }

        /** Relationship to this company. */
        fun relation(relation: CompanyDocumentRelation) = relation(JsonField.of(relation))

        /**
         * Sets [Builder.relation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relation] with a well-typed [CompanyDocumentRelation]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun relation(relation: JsonField<CompanyDocumentRelation>) = apply {
            this.relation = relation
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

        /** Document URL. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Optional source identifier retained for reconciliation. */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
        fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** Optional card preview. */
        fun preview(preview: CompanyDocumentPreview?) = preview(JsonField.ofNullable(preview))

        /** Alias for calling [Builder.preview] with `preview.orElse(null)`. */
        fun preview(preview: Optional<CompanyDocumentPreview>) = preview(preview.getOrNull())

        /**
         * Sets [Builder.preview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preview] with a well-typed [CompanyDocumentPreview]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun preview(preview: JsonField<CompanyDocumentPreview>) = apply { this.preview = preview }

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
         * Returns an immutable instance of [CompanyDocumentResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .documentType()
         * .relation()
         * .title()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyDocumentResource =
            CompanyDocumentResource(
                checkRequired("documentType", documentType),
                checkRequired("relation", relation),
                checkRequired("title", title),
                checkRequired("url", url),
                externalId,
                preview,
                publishedAt,
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
    fun validate(): CompanyDocumentResource = apply {
        if (validated) {
            return@apply
        }

        documentType().validate()
        relation().validate()
        title()
        url()
        externalId()
        preview().ifPresent { it.validate() }
        publishedAt()
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
        (documentType.asKnown().getOrNull()?.validity() ?: 0) +
            (relation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (preview.asKnown().getOrNull()?.validity() ?: 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyDocumentResource &&
            documentType == other.documentType &&
            relation == other.relation &&
            title == other.title &&
            url == other.url &&
            externalId == other.externalId &&
            preview == other.preview &&
            publishedAt == other.publishedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            documentType,
            relation,
            title,
            url,
            externalId,
            preview,
            publishedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyDocumentResource{documentType=$documentType, relation=$relation, title=$title, url=$url, externalId=$externalId, preview=$preview, publishedAt=$publishedAt, additionalProperties=$additionalProperties}"
}
