// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A key person associated with the company. */
class CompanyPerson
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val externalId: JsonField<String>,
    private val roles: JsonField<List<CompanyPersonRole>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("roles")
        @ExcludeMissing
        roles: JsonField<List<CompanyPersonRole>> = JsonMissing.of(),
    ) : this(name, externalId, roles, mutableMapOf())

    /**
     * Display name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Optional source identifier retained for reconciliation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("external_id")

    /**
     * One or more curated company roles.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roles(): Optional<List<CompanyPersonRole>> = roles.getOptional("roles")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [roles].
     *
     * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<CompanyPersonRole>> = roles

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
         * Returns a mutable builder for constructing an instance of [CompanyPerson].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyPerson]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var externalId: JsonField<String> = JsonMissing.of()
        private var roles: JsonField<MutableList<CompanyPersonRole>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyPerson: CompanyPerson) = apply {
            name = companyPerson.name
            externalId = companyPerson.externalId
            roles = companyPerson.roles.map { it.toMutableList() }
            additionalProperties = companyPerson.additionalProperties.toMutableMap()
        }

        /** Display name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** One or more curated company roles. */
        fun roles(roles: List<CompanyPersonRole>) = roles(JsonField.of(roles))

        /**
         * Sets [Builder.roles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roles] with a well-typed `List<CompanyPersonRole>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun roles(roles: JsonField<List<CompanyPersonRole>>) = apply {
            this.roles = roles.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyPersonRole] to [roles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRole(role: CompanyPersonRole) = apply {
            roles =
                (roles ?: JsonField.of(mutableListOf())).also { checkKnown("roles", it).add(role) }
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
         * Returns an immutable instance of [CompanyPerson].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyPerson =
            CompanyPerson(
                checkRequired("name", name),
                externalId,
                (roles ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): CompanyPerson = apply {
        if (validated) {
            return@apply
        }

        name()
        externalId()
        roles().ifPresent { it.forEach { it.validate() } }
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (roles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyPerson &&
            name == other.name &&
            externalId == other.externalId &&
            roles == other.roles &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, externalId, roles, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyPerson{name=$name, externalId=$externalId, roles=$roles, additionalProperties=$additionalProperties}"
}
