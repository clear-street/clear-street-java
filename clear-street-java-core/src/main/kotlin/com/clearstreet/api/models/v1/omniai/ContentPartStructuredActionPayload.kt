// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

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

/** Structured action content part. */
class ContentPartStructuredActionPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<StructuredAction>,
    private val actionId: JsonField<String>,
    private val clicked: JsonField<Boolean>,
    private val clickedItemIds: JsonField<List<String>>,
    private val itemId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action")
        @ExcludeMissing
        action: JsonField<StructuredAction> = JsonMissing.of(),
        @JsonProperty("action_id") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clicked") @ExcludeMissing clicked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("clicked_item_ids")
        @ExcludeMissing
        clickedItemIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
    ) : this(action, actionId, clicked, clickedItemIds, itemId, mutableMapOf())

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
     * Whether the current user clicked this action.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clicked(): Boolean = clicked.getRequired("clicked")

    /**
     * IDs of nested items clicked by the current user.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clickedItemIds(): Optional<List<String>> = clickedItemIds.getOptional("clicked_item_ids")

    /**
     * Interaction-tracking identity. Absent on messages created before tracking. When a
     * null/undefined value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun itemId(): Optional<String> = itemId.getOptional("item_id")

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

    /**
     * Returns the raw JSON value of [clicked].
     *
     * Unlike [clicked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clicked") @ExcludeMissing fun _clicked(): JsonField<Boolean> = clicked

    /**
     * Returns the raw JSON value of [clickedItemIds].
     *
     * Unlike [clickedItemIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clicked_item_ids")
    @ExcludeMissing
    fun _clickedItemIds(): JsonField<List<String>> = clickedItemIds

    /**
     * Returns the raw JSON value of [itemId].
     *
     * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

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
         * .clicked()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentPartStructuredActionPayload]. */
    class Builder internal constructor() {

        private var action: JsonField<StructuredAction>? = null
        private var actionId: JsonField<String>? = null
        private var clicked: JsonField<Boolean>? = null
        private var clickedItemIds: JsonField<MutableList<String>>? = null
        private var itemId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentPartStructuredActionPayload: ContentPartStructuredActionPayload) =
            apply {
                action = contentPartStructuredActionPayload.action
                actionId = contentPartStructuredActionPayload.actionId
                clicked = contentPartStructuredActionPayload.clicked
                clickedItemIds =
                    contentPartStructuredActionPayload.clickedItemIds.map { it.toMutableList() }
                itemId = contentPartStructuredActionPayload.itemId
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

        /**
         * Alias for calling [action] with
         * `StructuredAction.ofOpenEntitlementConsent(openEntitlementConsent)`.
         */
        fun action(openEntitlementConsent: StructuredAction.OpenEntitlementConsent) =
            action(StructuredAction.ofOpenEntitlementConsent(openEntitlementConsent))

        fun actionId(actionId: String) = actionId(JsonField.of(actionId))

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

        /** Whether the current user clicked this action. */
        fun clicked(clicked: Boolean) = clicked(JsonField.of(clicked))

        /**
         * Sets [Builder.clicked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clicked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clicked(clicked: JsonField<Boolean>) = apply { this.clicked = clicked }

        /** IDs of nested items clicked by the current user. */
        fun clickedItemIds(clickedItemIds: List<String>) =
            clickedItemIds(JsonField.of(clickedItemIds))

        /**
         * Sets [Builder.clickedItemIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clickedItemIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clickedItemIds(clickedItemIds: JsonField<List<String>>) = apply {
            this.clickedItemIds = clickedItemIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [clickedItemIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addClickedItemId(clickedItemId: String) = apply {
            clickedItemIds =
                (clickedItemIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("clickedItemIds", it).add(clickedItemId)
                }
        }

        /**
         * Interaction-tracking identity. Absent on messages created before tracking. When a
         * null/undefined value is observed, it indicates that there is no available data.
         */
        fun itemId(itemId: String?) = itemId(JsonField.ofNullable(itemId))

        /** Alias for calling [Builder.itemId] with `itemId.orElse(null)`. */
        fun itemId(itemId: Optional<String>) = itemId(itemId.getOrNull())

        /**
         * Sets [Builder.itemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

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
         * .clicked()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContentPartStructuredActionPayload =
            ContentPartStructuredActionPayload(
                checkRequired("action", action),
                checkRequired("actionId", actionId),
                checkRequired("clicked", clicked),
                (clickedItemIds ?: JsonMissing.of()).map { it.toImmutable() },
                itemId,
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
    fun validate(): ContentPartStructuredActionPayload = apply {
        if (validated) {
            return@apply
        }

        action().validate()
        actionId()
        clicked()
        clickedItemIds()
        itemId()
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
            (if (actionId.asKnown().isPresent) 1 else 0) +
            (if (clicked.asKnown().isPresent) 1 else 0) +
            (clickedItemIds.asKnown().getOrNull()?.size ?: 0) +
            (if (itemId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContentPartStructuredActionPayload &&
            action == other.action &&
            actionId == other.actionId &&
            clicked == other.clicked &&
            clickedItemIds == other.clickedItemIds &&
            itemId == other.itemId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(action, actionId, clicked, clickedItemIds, itemId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentPartStructuredActionPayload{action=$action, actionId=$actionId, clicked=$clicked, clickedItemIds=$clickedItemIds, itemId=$itemId, additionalProperties=$additionalProperties}"
}
