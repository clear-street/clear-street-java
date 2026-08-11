// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.alerts

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

/** Response payload for alert creation. */
class CreateAlertResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val alertId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("alert_id") @ExcludeMissing alertId: JsonField<String> = JsonMissing.of()
    ) : this(alertId, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun alertId(): String = alertId.getRequired("alert_id")

    /**
     * Returns the raw JSON value of [alertId].
     *
     * Unlike [alertId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alert_id") @ExcludeMissing fun _alertId(): JsonField<String> = alertId

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
         * Returns a mutable builder for constructing an instance of [CreateAlertResponse].
         *
         * The following fields are required:
         * ```java
         * .alertId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateAlertResponse]. */
    class Builder internal constructor() {

        private var alertId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createAlertResponse: CreateAlertResponse) = apply {
            alertId = createAlertResponse.alertId
            additionalProperties = createAlertResponse.additionalProperties.toMutableMap()
        }

        fun alertId(alertId: String) = alertId(JsonField.of(alertId))

        /**
         * Sets [Builder.alertId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alertId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alertId(alertId: JsonField<String>) = apply { this.alertId = alertId }

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
         * Returns an immutable instance of [CreateAlertResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .alertId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateAlertResponse =
            CreateAlertResponse(
                checkRequired("alertId", alertId),
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
    fun validate(): CreateAlertResponse = apply {
        if (validated) {
            return@apply
        }

        alertId()
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
    @JvmSynthetic internal fun validity(): Int = (if (alertId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateAlertResponse &&
            alertId == other.alertId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(alertId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateAlertResponse{alertId=$alertId, additionalProperties=$additionalProperties}"
}
