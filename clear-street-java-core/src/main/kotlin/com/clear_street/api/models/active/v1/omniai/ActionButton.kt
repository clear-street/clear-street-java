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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ActionButton
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buttonId: JsonField<String>,
    private val label: JsonField<String>,
    private val action: JsonField<ButtonAction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("button_id") @ExcludeMissing buttonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("action") @ExcludeMissing action: JsonField<ButtonAction> = JsonMissing.of(),
    ) : this(buttonId, label, action, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buttonId(): String = buttonId.getRequired("button_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Send a follow-up prompt as the next user message
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun action(): Optional<ButtonAction> = action.getOptional("action")

    /**
     * Returns the raw JSON value of [buttonId].
     *
     * Unlike [buttonId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("button_id") @ExcludeMissing fun _buttonId(): JsonField<String> = buttonId

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<ButtonAction> = action

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
         * Returns a mutable builder for constructing an instance of [ActionButton].
         *
         * The following fields are required:
         * ```java
         * .buttonId()
         * .label()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionButton]. */
    class Builder internal constructor() {

        private var buttonId: JsonField<String>? = null
        private var label: JsonField<String>? = null
        private var action: JsonField<ButtonAction> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionButton: ActionButton) = apply {
            buttonId = actionButton.buttonId
            label = actionButton.label
            action = actionButton.action
            additionalProperties = actionButton.additionalProperties.toMutableMap()
        }

        fun buttonId(buttonId: String) = buttonId(JsonField.of(buttonId))

        /**
         * Sets [Builder.buttonId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun buttonId(buttonId: JsonField<String>) = apply { this.buttonId = buttonId }

        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Send a follow-up prompt as the next user message */
        fun action(action: ButtonAction?) = action(JsonField.ofNullable(action))

        /** Alias for calling [Builder.action] with `action.orElse(null)`. */
        fun action(action: Optional<ButtonAction>) = action(action.getOrNull())

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [ButtonAction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun action(action: JsonField<ButtonAction>) = apply { this.action = action }

        /** Alias for calling [action] with `ButtonAction.ofPrompt(prompt)`. */
        fun action(prompt: ButtonAction.Prompt) = action(ButtonAction.ofPrompt(prompt))

        /** Alias for calling [action] with `ButtonAction.ofStructured(structured)`. */
        fun action(structured: ButtonAction.StructuredAction) =
            action(ButtonAction.ofStructured(structured))

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
         * Returns an immutable instance of [ActionButton].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .buttonId()
         * .label()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ActionButton =
            ActionButton(
                checkRequired("buttonId", buttonId),
                checkRequired("label", label),
                action,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ActionButton = apply {
        if (validated) {
            return@apply
        }

        buttonId()
        label()
        action().ifPresent { it.validate() }
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
        (if (buttonId.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (action.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionButton &&
            buttonId == other.buttonId &&
            label == other.label &&
            action == other.action &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(buttonId, label, action, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionButton{buttonId=$buttonId, label=$label, action=$action, additionalProperties=$additionalProperties}"
}
