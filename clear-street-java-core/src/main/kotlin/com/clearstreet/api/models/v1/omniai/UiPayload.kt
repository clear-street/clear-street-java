// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

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
import kotlin.jvm.optionals.getOrNull

/** Model-composed UI, built only from Omni's built-in component catalog. */
class UiPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val root: JsonField<UiNode>,
    private val uiId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("root") @ExcludeMissing root: JsonField<UiNode> = JsonMissing.of(),
        @JsonProperty("ui_id") @ExcludeMissing uiId: JsonField<String> = JsonMissing.of(),
    ) : this(root, uiId, mutableMapOf())

    /**
     * Root of the component tree.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun root(): UiNode = root.getRequired("root")

    /**
     * Stable identifier of this UI within the message.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uiId(): String = uiId.getRequired("ui_id")

    /**
     * Returns the raw JSON value of [root].
     *
     * Unlike [root], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("root") @ExcludeMissing fun _root(): JsonField<UiNode> = root

    /**
     * Returns the raw JSON value of [uiId].
     *
     * Unlike [uiId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ui_id") @ExcludeMissing fun _uiId(): JsonField<String> = uiId

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
         * Returns a mutable builder for constructing an instance of [UiPayload].
         *
         * The following fields are required:
         * ```java
         * .root()
         * .uiId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UiPayload]. */
    class Builder internal constructor() {

        private var root: JsonField<UiNode>? = null
        private var uiId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uiPayload: UiPayload) = apply {
            root = uiPayload.root
            uiId = uiPayload.uiId
            additionalProperties = uiPayload.additionalProperties.toMutableMap()
        }

        /** Root of the component tree. */
        fun root(root: UiNode) = root(JsonField.of(root))

        /**
         * Sets [Builder.root] to an arbitrary JSON value.
         *
         * You should usually call [Builder.root] with a well-typed [UiNode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun root(root: JsonField<UiNode>) = apply { this.root = root }

        /** Stable identifier of this UI within the message. */
        fun uiId(uiId: String) = uiId(JsonField.of(uiId))

        /**
         * Sets [Builder.uiId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uiId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uiId(uiId: JsonField<String>) = apply { this.uiId = uiId }

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
         * Returns an immutable instance of [UiPayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .root()
         * .uiId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UiPayload =
            UiPayload(
                checkRequired("root", root),
                checkRequired("uiId", uiId),
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
    fun validate(): UiPayload = apply {
        if (validated) {
            return@apply
        }

        root().validate()
        uiId()
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
        (root.asKnown().getOrNull()?.validity() ?: 0) + (if (uiId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UiPayload &&
            root == other.root &&
            uiId == other.uiId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(root, uiId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UiPayload{root=$root, uiId=$uiId, additionalProperties=$additionalProperties}"
}
