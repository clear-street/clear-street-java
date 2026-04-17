// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

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
import kotlin.jvm.optionals.getOrNull

/** Structured action content part. */
class ContentPartStructuredActionPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<StructuredAction>,
    private val actionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action")
        @ExcludeMissing
        action: JsonField<StructuredAction> = JsonMissing.of(),
        @JsonProperty("action_id") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
    ) : this(action, actionId, mutableMapOf())

    /**
     * Structured actions that Omni AI can return to clients.
     *
     * These actions provide machine-readable instructions for the client to execute, such as
     * prefilling an order ticket, opening a chart, or navigating to a route.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): StructuredAction = action.getRequired("action")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionId(): String = actionId.getRequired("action_id")

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<StructuredAction> = action

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action_id") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

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
         * Returns a mutable builder for constructing an instance of
         * [ContentPartStructuredActionPayload].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .actionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentPartStructuredActionPayload]. */
    class Builder internal constructor() {

        private var action: JsonField<StructuredAction>? = null
        private var actionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentPartStructuredActionPayload: ContentPartStructuredActionPayload) =
            apply {
                action = contentPartStructuredActionPayload.action
                actionId = contentPartStructuredActionPayload.actionId
                additionalProperties =
                    contentPartStructuredActionPayload.additionalProperties.toMutableMap()
            }

        /**
         * Structured actions that Omni AI can return to clients.
         *
         * These actions provide machine-readable instructions for the client to execute, such as
         * prefilling an order ticket, opening a chart, or navigating to a route.
         */
        fun action(action: StructuredAction) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [StructuredAction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun action(action: JsonField<StructuredAction>) = apply { this.action = action }

        /** Alias for calling [action] with `StructuredAction.ofPrefillOrder(prefillOrder)`. */
        fun action(prefillOrder: StructuredAction.PrefillOrder) =
            action(StructuredAction.ofPrefillOrder(prefillOrder))

        /** Alias for calling [action] with `StructuredAction.ofOpenChart(openChart)`. */
        fun action(openChart: StructuredAction.OpenChart) =
            action(StructuredAction.ofOpenChart(openChart))

        /** Alias for calling [action] with `StructuredAction.ofOpenScreener(openScreener)`. */
        fun action(openScreener: StructuredAction.OpenScreener) =
            action(StructuredAction.ofOpenScreener(openScreener))

        fun actionId(actionId: String) = actionId(JsonField.of(actionId))

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

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
         * Returns an immutable instance of [ContentPartStructuredActionPayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .action()
         * .actionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContentPartStructuredActionPayload =
            ContentPartStructuredActionPayload(
                checkRequired("action", action),
                checkRequired("actionId", actionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContentPartStructuredActionPayload = apply {
        if (validated) {
            return@apply
        }

        action().validate()
        actionId()
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
        (action.asKnown().getOrNull()?.validity() ?: 0) +
            (if (actionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContentPartStructuredActionPayload &&
            action == other.action &&
            actionId == other.actionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(action, actionId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentPartStructuredActionPayload{action=$action, actionId=$actionId, additionalProperties=$additionalProperties}"
}
