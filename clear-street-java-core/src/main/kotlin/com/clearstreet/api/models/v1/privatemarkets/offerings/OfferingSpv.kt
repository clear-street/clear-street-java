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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The attached SPV's identity and lifecycle. Exact economics surface once the SPV opens; an
 * upcoming offering's indicative ranges describe the terms until then.
 */
class OfferingSpv
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val status: JsonField<SpvStatus>,
    private val custodianName: JsonField<String>,
    private val managerName: JsonField<String>,
    private val shareClass: JsonField<String>,
    private val structureDescription: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<SpvStatus> = JsonMissing.of(),
        @JsonProperty("custodian_name")
        @ExcludeMissing
        custodianName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manager_name")
        @ExcludeMissing
        managerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("share_class")
        @ExcludeMissing
        shareClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("structure_description")
        @ExcludeMissing
        structureDescription: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        name,
        status,
        custodianName,
        managerName,
        shareClass,
        structureDescription,
        mutableMapOf(),
    )

    /**
     * Stable SPV identifier.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Legal/display name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Lifecycle state.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): SpvStatus = status.getRequired("status")

    /**
     * Custodian.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun custodianName(): Optional<String> = custodianName.getOptional("custodian_name")

    /**
     * SPV manager.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managerName(): Optional<String> = managerName.getOptional("manager_name")

    /**
     * Underlying share class, when specified.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shareClass(): Optional<String> = shareClass.getOptional("share_class")

    /**
     * Plain-text vehicle structure.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun structureDescription(): Optional<String> =
        structureDescription.getOptional("structure_description")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<SpvStatus> = status

    /**
     * Returns the raw JSON value of [custodianName].
     *
     * Unlike [custodianName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custodian_name")
    @ExcludeMissing
    fun _custodianName(): JsonField<String> = custodianName

    /**
     * Returns the raw JSON value of [managerName].
     *
     * Unlike [managerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manager_name")
    @ExcludeMissing
    fun _managerName(): JsonField<String> = managerName

    /**
     * Returns the raw JSON value of [shareClass].
     *
     * Unlike [shareClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("share_class") @ExcludeMissing fun _shareClass(): JsonField<String> = shareClass

    /**
     * Returns the raw JSON value of [structureDescription].
     *
     * Unlike [structureDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("structure_description")
    @ExcludeMissing
    fun _structureDescription(): JsonField<String> = structureDescription

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
         * Returns a mutable builder for constructing an instance of [OfferingSpv].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OfferingSpv]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var status: JsonField<SpvStatus>? = null
        private var custodianName: JsonField<String> = JsonMissing.of()
        private var managerName: JsonField<String> = JsonMissing.of()
        private var shareClass: JsonField<String> = JsonMissing.of()
        private var structureDescription: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(offeringSpv: OfferingSpv) = apply {
            id = offeringSpv.id
            name = offeringSpv.name
            status = offeringSpv.status
            custodianName = offeringSpv.custodianName
            managerName = offeringSpv.managerName
            shareClass = offeringSpv.shareClass
            structureDescription = offeringSpv.structureDescription
            additionalProperties = offeringSpv.additionalProperties.toMutableMap()
        }

        /** Stable SPV identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Legal/display name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Lifecycle state. */
        fun status(status: SpvStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [SpvStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<SpvStatus>) = apply { this.status = status }

        /** Custodian. */
        fun custodianName(custodianName: String?) =
            custodianName(JsonField.ofNullable(custodianName))

        /** Alias for calling [Builder.custodianName] with `custodianName.orElse(null)`. */
        fun custodianName(custodianName: Optional<String>) =
            custodianName(custodianName.getOrNull())

        /**
         * Sets [Builder.custodianName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.custodianName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun custodianName(custodianName: JsonField<String>) = apply {
            this.custodianName = custodianName
        }

        /** SPV manager. */
        fun managerName(managerName: String?) = managerName(JsonField.ofNullable(managerName))

        /** Alias for calling [Builder.managerName] with `managerName.orElse(null)`. */
        fun managerName(managerName: Optional<String>) = managerName(managerName.getOrNull())

        /**
         * Sets [Builder.managerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun managerName(managerName: JsonField<String>) = apply { this.managerName = managerName }

        /** Underlying share class, when specified. */
        fun shareClass(shareClass: String?) = shareClass(JsonField.ofNullable(shareClass))

        /** Alias for calling [Builder.shareClass] with `shareClass.orElse(null)`. */
        fun shareClass(shareClass: Optional<String>) = shareClass(shareClass.getOrNull())

        /**
         * Sets [Builder.shareClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareClass] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shareClass(shareClass: JsonField<String>) = apply { this.shareClass = shareClass }

        /** Plain-text vehicle structure. */
        fun structureDescription(structureDescription: String?) =
            structureDescription(JsonField.ofNullable(structureDescription))

        /**
         * Alias for calling [Builder.structureDescription] with
         * `structureDescription.orElse(null)`.
         */
        fun structureDescription(structureDescription: Optional<String>) =
            structureDescription(structureDescription.getOrNull())

        /**
         * Sets [Builder.structureDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.structureDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun structureDescription(structureDescription: JsonField<String>) = apply {
            this.structureDescription = structureDescription
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
         * Returns an immutable instance of [OfferingSpv].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OfferingSpv =
            OfferingSpv(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("status", status),
                custodianName,
                managerName,
                shareClass,
                structureDescription,
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
    fun validate(): OfferingSpv = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        status().validate()
        custodianName()
        managerName()
        shareClass()
        structureDescription()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (custodianName.asKnown().isPresent) 1 else 0) +
            (if (managerName.asKnown().isPresent) 1 else 0) +
            (if (shareClass.asKnown().isPresent) 1 else 0) +
            (if (structureDescription.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OfferingSpv &&
            id == other.id &&
            name == other.name &&
            status == other.status &&
            custodianName == other.custodianName &&
            managerName == other.managerName &&
            shareClass == other.shareClass &&
            structureDescription == other.structureDescription &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            status,
            custodianName,
            managerName,
            shareClass,
            structureDescription,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OfferingSpv{id=$id, name=$name, status=$status, custodianName=$custodianName, managerName=$managerName, shareClass=$shareClass, structureDescription=$structureDescription, additionalProperties=$additionalProperties}"
}
