// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

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

/** Button metadata shared by chart and suggested-actions payloads. */
class ActionButton
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buttonId: JsonField<String>,
    private val label: JsonField<String>,
    private val prompt: JsonField<PromptButtonAction>,
    private val structuredAction: JsonField<StructuredActionButtonAction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("buttonId") @ExcludeMissing buttonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt")
        @ExcludeMissing
        prompt: JsonField<PromptButtonAction> = JsonMissing.of(),
        @JsonProperty("structuredAction")
        @ExcludeMissing
        structuredAction: JsonField<StructuredActionButtonAction> = JsonMissing.of(),
    ) : this(buttonId, label, prompt, structuredAction, mutableMapOf())

    /**
     * Stable button identifier within the content part.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buttonId(): String = buttonId.getRequired("buttonId")

    /**
     * User-visible label.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Follow-up prompt to submit as the next user message.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompt(): Optional<PromptButtonAction> = prompt.getOptional("prompt")

    /**
     * Structured action in the same message to execute on click.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun structuredAction(): Optional<StructuredActionButtonAction> =
        structuredAction.getOptional("structuredAction")

    /**
     * Returns the raw JSON value of [buttonId].
     *
     * Unlike [buttonId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buttonId") @ExcludeMissing fun _buttonId(): JsonField<String> = buttonId

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<PromptButtonAction> = prompt

    /**
     * Returns the raw JSON value of [structuredAction].
     *
     * Unlike [structuredAction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("structuredAction")
    @ExcludeMissing
    fun _structuredAction(): JsonField<StructuredActionButtonAction> = structuredAction

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
        private var prompt: JsonField<PromptButtonAction> = JsonMissing.of()
        private var structuredAction: JsonField<StructuredActionButtonAction> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(actionButton: ActionButton) = apply {
            buttonId = actionButton.buttonId
            label = actionButton.label
            prompt = actionButton.prompt
            structuredAction = actionButton.structuredAction
            additionalProperties = actionButton.additionalProperties.toMutableMap()
        }

        /** Stable button identifier within the content part. */
        fun buttonId(buttonId: String) = buttonId(JsonField.of(buttonId))

        /**
         * Sets [Builder.buttonId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun buttonId(buttonId: JsonField<String>) = apply { this.buttonId = buttonId }

        /** User-visible label. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /** Follow-up prompt to submit as the next user message. */
        fun prompt(prompt: PromptButtonAction?) = prompt(JsonField.ofNullable(prompt))

        /** Alias for calling [Builder.prompt] with `prompt.orElse(null)`. */
        fun prompt(prompt: Optional<PromptButtonAction>) = prompt(prompt.getOrNull())

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [PromptButtonAction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prompt(prompt: JsonField<PromptButtonAction>) = apply { this.prompt = prompt }

        /** Structured action in the same message to execute on click. */
        fun structuredAction(structuredAction: StructuredActionButtonAction?) =
            structuredAction(JsonField.ofNullable(structuredAction))

        /** Alias for calling [Builder.structuredAction] with `structuredAction.orElse(null)`. */
        fun structuredAction(structuredAction: Optional<StructuredActionButtonAction>) =
            structuredAction(structuredAction.getOrNull())

        /**
         * Sets [Builder.structuredAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.structuredAction] with a well-typed
         * [StructuredActionButtonAction] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun structuredAction(structuredAction: JsonField<StructuredActionButtonAction>) = apply {
            this.structuredAction = structuredAction
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
                prompt,
                structuredAction,
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
    fun validate(): ActionButton = apply {
        if (validated) {
            return@apply
        }

        buttonId()
        label()
        prompt().ifPresent { it.validate() }
        structuredAction().ifPresent { it.validate() }
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
            (prompt.asKnown().getOrNull()?.validity() ?: 0) +
            (structuredAction.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionButton &&
            buttonId == other.buttonId &&
            label == other.label &&
            prompt == other.prompt &&
            structuredAction == other.structuredAction &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(buttonId, label, prompt, structuredAction, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ActionButton{buttonId=$buttonId, label=$label, prompt=$prompt, structuredAction=$structuredAction, additionalProperties=$additionalProperties}"
}
