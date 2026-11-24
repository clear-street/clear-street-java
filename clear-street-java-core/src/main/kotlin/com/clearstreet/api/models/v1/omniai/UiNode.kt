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

/** One node of a composed UI tree. */
class UiNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonField<String>,
    private val children: JsonField<List<JsonValue>>,
    private val props: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("children")
        @ExcludeMissing
        children: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("props") @ExcludeMissing props: JsonValue = JsonMissing.of(),
    ) : this(type, children, props, mutableMapOf())

    /**
     * Catalog component name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Nested nodes (each shaped like this one), only where the component's `children` allows them.
     * Typed as generic objects so the schema is not self-referential, which SDK generators handle
     * poorly.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun children(): Optional<List<JsonValue>> = children.getOptional("children")

    /**
     * Props that satisfy the component's `props_schema`. Omitted when the component has none.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = uiNode.props().convert(MyClass.class);
     * ```
     */
    @JsonProperty("props") @ExcludeMissing fun _props(): JsonValue = props

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [children].
     *
     * Unlike [children], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("children") @ExcludeMissing fun _children(): JsonField<List<JsonValue>> = children

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
         * Returns a mutable builder for constructing an instance of [UiNode].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UiNode]. */
    class Builder internal constructor() {

        private var type: JsonField<String>? = null
        private var children: JsonField<MutableList<JsonValue>>? = null
        private var props: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uiNode: UiNode) = apply {
            type = uiNode.type
            children = uiNode.children.map { it.toMutableList() }
            props = uiNode.props
            additionalProperties = uiNode.additionalProperties.toMutableMap()
        }

        /** Catalog component name. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * Nested nodes (each shaped like this one), only where the component's `children` allows
         * them. Typed as generic objects so the schema is not self-referential, which SDK
         * generators handle poorly.
         */
        fun children(children: List<JsonValue>) = children(JsonField.of(children))

        /**
         * Sets [Builder.children] to an arbitrary JSON value.
         *
         * You should usually call [Builder.children] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun children(children: JsonField<List<JsonValue>>) = apply {
            this.children = children.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [children].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChild(child: JsonValue) = apply {
            children =
                (children ?: JsonField.of(mutableListOf())).also {
                    checkKnown("children", it).add(child)
                }
        }

        /**
         * Props that satisfy the component's `props_schema`. Omitted when the component has none.
         */
        fun props(props: JsonValue) = apply { this.props = props }

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
         * Returns an immutable instance of [UiNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UiNode =
            UiNode(
                checkRequired("type", type),
                (children ?: JsonMissing.of()).map { it.toImmutable() },
                props,
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
    fun validate(): UiNode = apply {
        if (validated) {
            return@apply
        }

        type()
        children()
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
        (if (type.asKnown().isPresent) 1 else 0) + (children.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UiNode &&
            type == other.type &&
            children == other.children &&
            props == other.props &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(type, children, props, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UiNode{type=$type, children=$children, props=$props, additionalProperties=$additionalProperties}"
}
