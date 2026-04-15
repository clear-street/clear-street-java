// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.venues

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

/** A trading session within a venue's trading day */
class VenueSession
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endLocal: JsonField<String>,
    private val name: JsonField<String>,
    private val startLocal: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end_local") @ExcludeMissing endLocal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_local")
        @ExcludeMissing
        startLocal: JsonField<String> = JsonMissing.of(),
    ) : this(endLocal, name, startLocal, mutableMapOf())

    /**
     * Session end time in venue's local timezone (HH:MM format, 24-hour)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endLocal(): String = endLocal.getRequired("end_local")

    /**
     * The name of the trading session
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Session start time in venue's local timezone (HH:MM format, 24-hour)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startLocal(): String = startLocal.getRequired("start_local")

    /**
     * Returns the raw JSON value of [endLocal].
     *
     * Unlike [endLocal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_local") @ExcludeMissing fun _endLocal(): JsonField<String> = endLocal

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [startLocal].
     *
     * Unlike [startLocal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_local") @ExcludeMissing fun _startLocal(): JsonField<String> = startLocal

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
         * Returns a mutable builder for constructing an instance of [VenueSession].
         *
         * The following fields are required:
         * ```java
         * .endLocal()
         * .name()
         * .startLocal()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VenueSession]. */
    class Builder internal constructor() {

        private var endLocal: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var startLocal: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(venueSession: VenueSession) = apply {
            endLocal = venueSession.endLocal
            name = venueSession.name
            startLocal = venueSession.startLocal
            additionalProperties = venueSession.additionalProperties.toMutableMap()
        }

        /** Session end time in venue's local timezone (HH:MM format, 24-hour) */
        fun endLocal(endLocal: String) = endLocal(JsonField.of(endLocal))

        /**
         * Sets [Builder.endLocal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endLocal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endLocal(endLocal: JsonField<String>) = apply { this.endLocal = endLocal }

        /** The name of the trading session */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Session start time in venue's local timezone (HH:MM format, 24-hour) */
        fun startLocal(startLocal: String) = startLocal(JsonField.of(startLocal))

        /**
         * Sets [Builder.startLocal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startLocal] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startLocal(startLocal: JsonField<String>) = apply { this.startLocal = startLocal }

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
         * Returns an immutable instance of [VenueSession].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endLocal()
         * .name()
         * .startLocal()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VenueSession =
            VenueSession(
                checkRequired("endLocal", endLocal),
                checkRequired("name", name),
                checkRequired("startLocal", startLocal),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VenueSession = apply {
        if (validated) {
            return@apply
        }

        endLocal()
        name()
        startLocal()
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
        (if (endLocal.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (startLocal.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VenueSession &&
            endLocal == other.endLocal &&
            name == other.name &&
            startLocal == other.startLocal &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endLocal, name, startLocal, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VenueSession{endLocal=$endLocal, name=$name, startLocal=$startLocal, additionalProperties=$additionalProperties}"
}
