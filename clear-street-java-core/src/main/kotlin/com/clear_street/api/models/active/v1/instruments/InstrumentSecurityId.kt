// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Represents a tradable financial instrument, as a more concise item listing only key fields. */
class InstrumentSecurityId
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val securityId: JsonField<String>,
    private val securityIdSource: JsonField<SecurityIdSource>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("security_id")
        @ExcludeMissing
        securityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id_source")
        @ExcludeMissing
        securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of(),
    ) : this(securityId, securityIdSource, mutableMapOf())

    /**
     * The identifier for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityId(): String = securityId.getRequired("security_id")

    /**
     * The source system for the security identifier
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityIdSource(): SecurityIdSource = securityIdSource.getRequired("security_id_source")

    /**
     * Returns the raw JSON value of [securityId].
     *
     * Unlike [securityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("security_id") @ExcludeMissing fun _securityId(): JsonField<String> = securityId

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

        /**
         * Returns a mutable builder for constructing an instance of [InstrumentSecurityId].
         *
         * The following fields are required:
         * ```java
         * .securityId()
         * .securityIdSource()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentSecurityId]. */
    class Builder internal constructor() {

        private var securityId: JsonField<String>? = null
        private var securityIdSource: JsonField<SecurityIdSource>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentSecurityId: InstrumentSecurityId) = apply {
            securityId = instrumentSecurityId.securityId
            securityIdSource = instrumentSecurityId.securityIdSource
            additionalProperties = instrumentSecurityId.additionalProperties.toMutableMap()
        }

        /** The identifier for the instrument */
        fun securityId(securityId: String) = securityId(JsonField.of(securityId))

        /**
         * Sets [Builder.securityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun securityId(securityId: JsonField<String>) = apply { this.securityId = securityId }

        /** The source system for the security identifier */
        fun securityIdSource(securityIdSource: SecurityIdSource) =
            securityIdSource(JsonField.of(securityIdSource))

        /**
         * Sets [Builder.securityIdSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityIdSource] with a well-typed [SecurityIdSource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * Returns an immutable instance of [InstrumentSecurityId].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .securityId()
         * .securityIdSource()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentSecurityId =
            InstrumentSecurityId(
                checkRequired("securityId", securityId),
                checkRequired("securityIdSource", securityIdSource),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstrumentSecurityId = apply {
        if (validated) {
            return@apply
        }

        securityId()
        securityIdSource().validate()
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
        (if (securityId.asKnown().isPresent) 1 else 0) +
            (securityIdSource.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentSecurityId &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(securityId, securityIdSource, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentSecurityId{securityId=$securityId, securityIdSource=$securityIdSource, additionalProperties=$additionalProperties}"
}
