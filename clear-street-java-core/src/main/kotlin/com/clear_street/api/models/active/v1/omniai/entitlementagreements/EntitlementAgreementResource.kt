// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.entitlementagreements

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class EntitlementAgreementResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agreementId: JsonField<String>,
    private val agreementKey: JsonField<String>,
    private val documentContent: JsonField<String>,
    private val documentSha256: JsonField<String>,
    private val entitlementCodes: JsonField<List<String>>,
    private val title: JsonField<String>,
    private val version: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agreement_id")
        @ExcludeMissing
        agreementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agreement_key")
        @ExcludeMissing
        agreementKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_content")
        @ExcludeMissing
        documentContent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_sha256")
        @ExcludeMissing
        documentSha256: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entitlement_codes")
        @ExcludeMissing
        entitlementCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Int> = JsonMissing.of(),
    ) : this(
        agreementId,
        agreementKey,
        documentContent,
        documentSha256,
        entitlementCodes,
        title,
        version,
        mutableMapOf(),
    )

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agreementId(): String = agreementId.getRequired("agreement_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agreementKey(): String = agreementKey.getRequired("agreement_key")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentContent(): String = documentContent.getRequired("document_content")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentSha256(): String = documentSha256.getRequired("document_sha256")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlementCodes(): List<String> = entitlementCodes.getRequired("entitlement_codes")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Int = version.getRequired("version")

    /**
     * Returns the raw JSON value of [agreementId].
     *
     * Unlike [agreementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreement_id")
    @ExcludeMissing
    fun _agreementId(): JsonField<String> = agreementId

    /**
     * Returns the raw JSON value of [agreementKey].
     *
     * Unlike [agreementKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreement_key")
    @ExcludeMissing
    fun _agreementKey(): JsonField<String> = agreementKey

    /**
     * Returns the raw JSON value of [documentContent].
     *
     * Unlike [documentContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_content")
    @ExcludeMissing
    fun _documentContent(): JsonField<String> = documentContent

    /**
     * Returns the raw JSON value of [documentSha256].
     *
     * Unlike [documentSha256], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_sha256")
    @ExcludeMissing
    fun _documentSha256(): JsonField<String> = documentSha256

    /**
     * Returns the raw JSON value of [entitlementCodes].
     *
     * Unlike [entitlementCodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("entitlement_codes")
    @ExcludeMissing
    fun _entitlementCodes(): JsonField<List<String>> = entitlementCodes

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Int> = version

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
         * Returns a mutable builder for constructing an instance of [EntitlementAgreementResource].
         *
         * The following fields are required:
         * ```java
         * .agreementId()
         * .agreementKey()
         * .documentContent()
         * .documentSha256()
         * .entitlementCodes()
         * .title()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntitlementAgreementResource]. */
    class Builder internal constructor() {

        private var agreementId: JsonField<String>? = null
        private var agreementKey: JsonField<String>? = null
        private var documentContent: JsonField<String>? = null
        private var documentSha256: JsonField<String>? = null
        private var entitlementCodes: JsonField<MutableList<String>>? = null
        private var title: JsonField<String>? = null
        private var version: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entitlementAgreementResource: EntitlementAgreementResource) = apply {
            agreementId = entitlementAgreementResource.agreementId
            agreementKey = entitlementAgreementResource.agreementKey
            documentContent = entitlementAgreementResource.documentContent
            documentSha256 = entitlementAgreementResource.documentSha256
            entitlementCodes =
                entitlementAgreementResource.entitlementCodes.map { it.toMutableList() }
            title = entitlementAgreementResource.title
            version = entitlementAgreementResource.version
            additionalProperties = entitlementAgreementResource.additionalProperties.toMutableMap()
        }

        fun agreementId(agreementId: String) = agreementId(JsonField.of(agreementId))

        /**
         * Sets [Builder.agreementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agreementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agreementId(agreementId: JsonField<String>) = apply { this.agreementId = agreementId }

        fun agreementKey(agreementKey: String) = agreementKey(JsonField.of(agreementKey))

        /**
         * Sets [Builder.agreementKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agreementKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agreementKey(agreementKey: JsonField<String>) = apply {
            this.agreementKey = agreementKey
        }

        fun documentContent(documentContent: String) =
            documentContent(JsonField.of(documentContent))

        /**
         * Sets [Builder.documentContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentContent] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentContent(documentContent: JsonField<String>) = apply {
            this.documentContent = documentContent
        }

        fun documentSha256(documentSha256: String) = documentSha256(JsonField.of(documentSha256))

        /**
         * Sets [Builder.documentSha256] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentSha256] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentSha256(documentSha256: JsonField<String>) = apply {
            this.documentSha256 = documentSha256
        }

        fun entitlementCodes(entitlementCodes: List<String>) =
            entitlementCodes(JsonField.of(entitlementCodes))

        /**
         * Sets [Builder.entitlementCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlementCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entitlementCodes(entitlementCodes: JsonField<List<String>>) = apply {
            this.entitlementCodes = entitlementCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [entitlementCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntitlementCode(entitlementCode: String) = apply {
            entitlementCodes =
                (entitlementCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entitlementCodes", it).add(entitlementCode)
                }
        }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        fun version(version: Int) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Int>) = apply { this.version = version }

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
         * Returns an immutable instance of [EntitlementAgreementResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agreementId()
         * .agreementKey()
         * .documentContent()
         * .documentSha256()
         * .entitlementCodes()
         * .title()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntitlementAgreementResource =
            EntitlementAgreementResource(
                checkRequired("agreementId", agreementId),
                checkRequired("agreementKey", agreementKey),
                checkRequired("documentContent", documentContent),
                checkRequired("documentSha256", documentSha256),
                checkRequired("entitlementCodes", entitlementCodes).map { it.toImmutable() },
                checkRequired("title", title),
                checkRequired("version", version),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EntitlementAgreementResource = apply {
        if (validated) {
            return@apply
        }

        agreementId()
        agreementKey()
        documentContent()
        documentSha256()
        entitlementCodes()
        title()
        version()
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
        (if (agreementId.asKnown().isPresent) 1 else 0) +
            (if (agreementKey.asKnown().isPresent) 1 else 0) +
            (if (documentContent.asKnown().isPresent) 1 else 0) +
            (if (documentSha256.asKnown().isPresent) 1 else 0) +
            (entitlementCodes.asKnown().getOrNull()?.size ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementAgreementResource &&
            agreementId == other.agreementId &&
            agreementKey == other.agreementKey &&
            documentContent == other.documentContent &&
            documentSha256 == other.documentSha256 &&
            entitlementCodes == other.entitlementCodes &&
            title == other.title &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            agreementId,
            agreementKey,
            documentContent,
            documentSha256,
            entitlementCodes,
            title,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EntitlementAgreementResource{agreementId=$agreementId, agreementKey=$agreementKey, documentContent=$documentContent, documentSha256=$documentSha256, entitlementCodes=$entitlementCodes, title=$title, version=$version, additionalProperties=$additionalProperties}"
}
