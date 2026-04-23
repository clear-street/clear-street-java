// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Suggested follow-up buttons rendered at the end of an assistant message. */
class SuggestedActionsPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionButtons: JsonField<List<ActionButton>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionButtons")
        @ExcludeMissing
        actionButtons: JsonField<List<ActionButton>> = JsonMissing.of()
    ) : this(actionButtons, mutableMapOf())

    /**
     * Ordered message-level buttons.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionButtons(): Optional<List<ActionButton>> = actionButtons.getOptional("actionButtons")

    /**
     * Returns the raw JSON value of [actionButtons].
     *
     * Unlike [actionButtons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionButtons")
    @ExcludeMissing
    fun _actionButtons(): JsonField<List<ActionButton>> = actionButtons

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

        /** Returns a mutable builder for constructing an instance of [SuggestedActionsPayload]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SuggestedActionsPayload]. */
    class Builder internal constructor() {

        private var actionButtons: JsonField<MutableList<ActionButton>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(suggestedActionsPayload: SuggestedActionsPayload) = apply {
            actionButtons = suggestedActionsPayload.actionButtons.map { it.toMutableList() }
            additionalProperties = suggestedActionsPayload.additionalProperties.toMutableMap()
        }

        /** Ordered message-level buttons. */
        fun actionButtons(actionButtons: List<ActionButton>) =
            actionButtons(JsonField.of(actionButtons))

        /**
         * Sets [Builder.actionButtons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionButtons] with a well-typed `List<ActionButton>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun actionButtons(actionButtons: JsonField<List<ActionButton>>) = apply {
            this.actionButtons = actionButtons.map { it.toMutableList() }
        }

        /**
         * Adds a single [ActionButton] to [actionButtons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActionButton(actionButton: ActionButton) = apply {
            actionButtons =
                (actionButtons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actionButtons", it).add(actionButton)
                }
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
         * Returns an immutable instance of [SuggestedActionsPayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SuggestedActionsPayload =
            SuggestedActionsPayload(
                (actionButtons ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SuggestedActionsPayload = apply {
        if (validated) {
            return@apply
        }

        actionButtons().ifPresent { it.forEach { it.validate() } }
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
        (actionButtons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SuggestedActionsPayload &&
            actionButtons == other.actionButtons &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(actionButtons, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SuggestedActionsPayload{actionButtons=$actionButtons, additionalProperties=$additionalProperties}"
}
