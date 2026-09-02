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

/** Current NDA agreement for an SPV-backed deal. */
class NdaAgreementResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptanceText: JsonField<String>,
    private val acceptanceTextVersion: JsonField<Int>,
    private val agreementId: JsonField<String>,
    private val documentReference: JsonField<String>,
    private val documentSha256: JsonField<String>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val version: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acceptance_text")
        @ExcludeMissing
        acceptanceText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acceptance_text_version")
        @ExcludeMissing
        acceptanceTextVersion: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("agreement_id")
        @ExcludeMissing
        agreementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_reference")
        @ExcludeMissing
        documentReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_sha256")
        @ExcludeMissing
        documentSha256: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Int> = JsonMissing.of(),
    ) : this(
        acceptanceText,
        acceptanceTextVersion,
        agreementId,
        documentReference,
        documentSha256,
        effectiveAt,
        version,
        mutableMapOf(),
    )

    /**
     * Exact assent and authority representation shown to the signer.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptanceText(): String = acceptanceText.getRequired("acceptance_text")

    /**
     * Version of the acceptance representation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptanceTextVersion(): Int = acceptanceTextVersion.getRequired("acceptance_text_version")

    /**
     * Stable agreement identifier submitted with an IOI acceptance.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agreementId(): String = agreementId.getRequired("agreement_id")

    /**
     * Durable reference to the immutable NDA artifact.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentReference(): String = documentReference.getRequired("document_reference")

    /**
     * Lowercase SHA-256 digest of the artifact bytes.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentSha256(): String = documentSha256.getRequired("document_sha256")

    /**
     * Time this version became effective.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    /**
     * Strictly increasing SPV-local agreement version.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Int = version.getRequired("version")

    /**
     * Returns the raw JSON value of [acceptanceText].
     *
     * Unlike [acceptanceText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acceptance_text")
    @ExcludeMissing
    fun _acceptanceText(): JsonField<String> = acceptanceText

    /**
     * Returns the raw JSON value of [acceptanceTextVersion].
     *
     * Unlike [acceptanceTextVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acceptance_text_version")
    @ExcludeMissing
    fun _acceptanceTextVersion(): JsonField<Int> = acceptanceTextVersion

    /**
     * Returns the raw JSON value of [agreementId].
     *
     * Unlike [agreementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreement_id")
    @ExcludeMissing
    fun _agreementId(): JsonField<String> = agreementId

    /**
     * Returns the raw JSON value of [documentReference].
     *
     * Unlike [documentReference], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("document_reference")
    @ExcludeMissing
    fun _documentReference(): JsonField<String> = documentReference

    /**
     * Returns the raw JSON value of [documentSha256].
     *
     * Unlike [documentSha256], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_sha256")
    @ExcludeMissing
    fun _documentSha256(): JsonField<String> = documentSha256

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

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
         * Returns a mutable builder for constructing an instance of [NdaAgreementResource].
         *
         * The following fields are required:
         * ```java
         * .acceptanceText()
         * .acceptanceTextVersion()
         * .agreementId()
         * .documentReference()
         * .documentSha256()
         * .effectiveAt()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NdaAgreementResource]. */
    class Builder internal constructor() {

        private var acceptanceText: JsonField<String>? = null
        private var acceptanceTextVersion: JsonField<Int>? = null
        private var agreementId: JsonField<String>? = null
        private var documentReference: JsonField<String>? = null
        private var documentSha256: JsonField<String>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var version: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ndaAgreementResource: NdaAgreementResource) = apply {
            acceptanceText = ndaAgreementResource.acceptanceText
            acceptanceTextVersion = ndaAgreementResource.acceptanceTextVersion
            agreementId = ndaAgreementResource.agreementId
            documentReference = ndaAgreementResource.documentReference
            documentSha256 = ndaAgreementResource.documentSha256
            effectiveAt = ndaAgreementResource.effectiveAt
            version = ndaAgreementResource.version
            additionalProperties = ndaAgreementResource.additionalProperties.toMutableMap()
        }

        /** Exact assent and authority representation shown to the signer. */
        fun acceptanceText(acceptanceText: String) = acceptanceText(JsonField.of(acceptanceText))

        /**
         * Sets [Builder.acceptanceText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptanceText] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptanceText(acceptanceText: JsonField<String>) = apply {
            this.acceptanceText = acceptanceText
        }

        /** Version of the acceptance representation. */
        fun acceptanceTextVersion(acceptanceTextVersion: Int) =
            acceptanceTextVersion(JsonField.of(acceptanceTextVersion))

        /**
         * Sets [Builder.acceptanceTextVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptanceTextVersion] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptanceTextVersion(acceptanceTextVersion: JsonField<Int>) = apply {
            this.acceptanceTextVersion = acceptanceTextVersion
        }

        /** Stable agreement identifier submitted with an IOI acceptance. */
        fun agreementId(agreementId: String) = agreementId(JsonField.of(agreementId))

        /**
         * Sets [Builder.agreementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agreementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agreementId(agreementId: JsonField<String>) = apply { this.agreementId = agreementId }

        /** Durable reference to the immutable NDA artifact. */
        fun documentReference(documentReference: String) =
            documentReference(JsonField.of(documentReference))

        /**
         * Sets [Builder.documentReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentReference] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentReference(documentReference: JsonField<String>) = apply {
            this.documentReference = documentReference
        }

        /** Lowercase SHA-256 digest of the artifact bytes. */
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

        /** Time this version became effective. */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /** Strictly increasing SPV-local agreement version. */
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
         * Returns an immutable instance of [NdaAgreementResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .acceptanceText()
         * .acceptanceTextVersion()
         * .agreementId()
         * .documentReference()
         * .documentSha256()
         * .effectiveAt()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NdaAgreementResource =
            NdaAgreementResource(
                checkRequired("acceptanceText", acceptanceText),
                checkRequired("acceptanceTextVersion", acceptanceTextVersion),
                checkRequired("agreementId", agreementId),
                checkRequired("documentReference", documentReference),
                checkRequired("documentSha256", documentSha256),
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("version", version),
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
    fun validate(): NdaAgreementResource = apply {
        if (validated) {
            return@apply
        }

        acceptanceText()
        acceptanceTextVersion()
        agreementId()
        documentReference()
        documentSha256()
        effectiveAt()
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
        (if (acceptanceText.asKnown().isPresent) 1 else 0) +
            (if (acceptanceTextVersion.asKnown().isPresent) 1 else 0) +
            (if (agreementId.asKnown().isPresent) 1 else 0) +
            (if (documentReference.asKnown().isPresent) 1 else 0) +
            (if (documentSha256.asKnown().isPresent) 1 else 0) +
            (if (effectiveAt.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NdaAgreementResource &&
            acceptanceText == other.acceptanceText &&
            acceptanceTextVersion == other.acceptanceTextVersion &&
            agreementId == other.agreementId &&
            documentReference == other.documentReference &&
            documentSha256 == other.documentSha256 &&
            effectiveAt == other.effectiveAt &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acceptanceText,
            acceptanceTextVersion,
            agreementId,
            documentReference,
            documentSha256,
            effectiveAt,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NdaAgreementResource{acceptanceText=$acceptanceText, acceptanceTextVersion=$acceptanceTextVersion, agreementId=$agreementId, documentReference=$documentReference, documentSha256=$documentSha256, effectiveAt=$effectiveAt, version=$version, additionalProperties=$additionalProperties}"
}
