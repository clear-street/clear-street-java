// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ContentPartSuggestedActions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionButtons: JsonField<List<ActionButton>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action_buttons")
        @ExcludeMissing
        actionButtons: JsonField<List<ActionButton>> = JsonMissing.of()
    ) : this(actionButtons, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionButtons(): List<ActionButton> = actionButtons.getRequired("action_buttons")

    /**
     * Returns the raw JSON value of [actionButtons].
     *
     * Unlike [actionButtons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action_buttons")
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

        /**
         * Returns a mutable builder for constructing an instance of [ContentPartSuggestedActions].
         *
         * The following fields are required:
         * ```java
         * .actionButtons()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentPartSuggestedActions]. */
    class Builder internal constructor() {

        private var actionButtons: JsonField<MutableList<ActionButton>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentPartSuggestedActions: ContentPartSuggestedActions) = apply {
            actionButtons = contentPartSuggestedActions.actionButtons.map { it.toMutableList() }
            additionalProperties = contentPartSuggestedActions.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [ContentPartSuggestedActions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionButtons()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContentPartSuggestedActions =
            ContentPartSuggestedActions(
                checkRequired("actionButtons", actionButtons).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContentPartSuggestedActions = apply {
        if (validated) {
            return@apply
        }

        actionButtons().forEach { it.validate() }
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

        return other is ContentPartSuggestedActions &&
            actionButtons == other.actionButtons &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(actionButtons, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentPartSuggestedActions{actionButtons=$actionButtons, additionalProperties=$additionalProperties}"
}
