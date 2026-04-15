// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.allMaxBy
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.getOrThrow
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Send a follow-up prompt as the next user message */
@JsonDeserialize(using = ButtonAction.Deserializer::class)
@JsonSerialize(using = ButtonAction.Serializer::class)
class ButtonAction
private constructor(
    private val prompt: Prompt? = null,
    private val structured: StructuredAction? = null,
    private val _json: JsonValue? = null,
) {

    /** Send a follow-up prompt as the next user message */
    fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt)

    /** Trigger a structured action already present in the same message */
    fun structured(): Optional<StructuredAction> = Optional.ofNullable(structured)

    fun isPrompt(): Boolean = prompt != null

    fun isStructured(): Boolean = structured != null

    /** Send a follow-up prompt as the next user message */
    fun asPrompt(): Prompt = prompt.getOrThrow("prompt")

    /** Trigger a structured action already present in the same message */
    fun asStructured(): StructuredAction = structured.getOrThrow("structured")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            prompt != null -> visitor.visitPrompt(prompt)
            structured != null -> visitor.visitStructured(structured)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ButtonAction = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPrompt(prompt: Prompt) {
                    prompt.validate()
                }

                override fun visitStructured(structured: StructuredAction) {
                    structured.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitPrompt(prompt: Prompt) = prompt.validity()

                override fun visitStructured(structured: StructuredAction) = structured.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ButtonAction && prompt == other.prompt && structured == other.structured
    }

    override fun hashCode(): Int = Objects.hash(prompt, structured)

    override fun toString(): String =
        when {
            prompt != null -> "ButtonAction{prompt=$prompt}"
            structured != null -> "ButtonAction{structured=$structured}"
            _json != null -> "ButtonAction{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ButtonAction")
        }

    companion object {

        /** Send a follow-up prompt as the next user message */
        @JvmStatic fun ofPrompt(prompt: Prompt) = ButtonAction(prompt = prompt)

        /** Trigger a structured action already present in the same message */
        @JvmStatic
        fun ofStructured(structured: StructuredAction) = ButtonAction(structured = structured)
    }

    /**
     * An interface that defines how to map each variant of [ButtonAction] to a value of type [T].
     */
    interface Visitor<out T> {

        /** Send a follow-up prompt as the next user message */
        fun visitPrompt(prompt: Prompt): T

        /** Trigger a structured action already present in the same message */
        fun visitStructured(structured: StructuredAction): T

        /**
         * Maps an unknown variant of [ButtonAction] to a value of type [T].
         *
         * An instance of [ButtonAction] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws ClearStreetInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ClearStreetInvalidDataException("Unknown ButtonAction: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ButtonAction>(ButtonAction::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ButtonAction {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<Prompt>())?.let {
                            ButtonAction(prompt = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<StructuredAction>())?.let {
                            ButtonAction(structured = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ButtonAction(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ButtonAction>(ButtonAction::class) {

        override fun serialize(
            value: ButtonAction,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.prompt != null -> generator.writeObject(value.prompt)
                value.structured != null -> generator.writeObject(value.structured)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ButtonAction")
            }
        }
    }

    /** Send a follow-up prompt as the next user message */
    class Prompt
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val prompt: JsonField<String>,
        private val actionType: JsonField<ActionType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<ActionType> = JsonMissing.of(),
        ) : this(prompt, actionType, mutableMapOf())

        fun toPromptButtonAction(): PromptButtonAction =
            PromptButtonAction.builder().prompt(prompt).build()

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prompt(): String = prompt.getRequired("prompt")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actionType(): ActionType = actionType.getRequired("action_type")

        /**
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

        /**
         * Returns the raw JSON value of [actionType].
         *
         * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun _actionType(): JsonField<ActionType> = actionType

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
             * Returns a mutable builder for constructing an instance of [Prompt].
             *
             * The following fields are required:
             * ```java
             * .prompt()
             * .actionType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Prompt]. */
        class Builder internal constructor() {

            private var prompt: JsonField<String>? = null
            private var actionType: JsonField<ActionType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prompt: Prompt) = apply {
                this.prompt = prompt.prompt
                actionType = prompt.actionType
                additionalProperties = prompt.additionalProperties.toMutableMap()
            }

            fun prompt(prompt: String) = prompt(JsonField.of(prompt))

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

            fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

            /**
             * Sets [Builder.actionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionType] with a well-typed [ActionType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionType(actionType: JsonField<ActionType>) = apply {
                this.actionType = actionType
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
             * Returns an immutable instance of [Prompt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .prompt()
             * .actionType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Prompt =
                Prompt(
                    checkRequired("prompt", prompt),
                    checkRequired("actionType", actionType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Prompt = apply {
            if (validated) {
                return@apply
            }

            prompt()
            actionType().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (prompt.asKnown().isPresent) 1 else 0) +
                (actionType.asKnown().getOrNull()?.validity() ?: 0)

        class ActionType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PROMPT = of("prompt")

                @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
            }

            /** An enum containing [ActionType]'s known values. */
            enum class Known {
                PROMPT
            }

            /**
             * An enum containing [ActionType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ActionType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PROMPT,
                /**
                 * An enum member indicating that [ActionType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PROMPT -> Value.PROMPT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    PROMPT -> Known.PROMPT
                    else -> throw ClearStreetInvalidDataException("Unknown ActionType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ClearStreetInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ActionType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ActionType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Prompt &&
                prompt == other.prompt &&
                actionType == other.actionType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(prompt, actionType, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Prompt{prompt=$prompt, actionType=$actionType, additionalProperties=$additionalProperties}"
    }

    /** Trigger a structured action already present in the same message */
    class StructuredAction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val actionId: JsonField<String>,
        private val actionType: JsonField<ActionType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action_id")
            @ExcludeMissing
            actionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<ActionType> = JsonMissing.of(),
        ) : this(actionId, actionType, mutableMapOf())

        fun toStructuredActionButtonAction(): StructuredActionButtonAction =
            StructuredActionButtonAction.builder().actionId(actionId).build()

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun actionId(): Optional<String> = actionId.getOptional("action_id")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actionType(): ActionType = actionType.getRequired("action_type")

        /**
         * Returns the raw JSON value of [actionId].
         *
         * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_id") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

        /**
         * Returns the raw JSON value of [actionType].
         *
         * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun _actionType(): JsonField<ActionType> = actionType

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
             * Returns a mutable builder for constructing an instance of [StructuredAction].
             *
             * The following fields are required:
             * ```java
             * .actionType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [StructuredAction]. */
        class Builder internal constructor() {

            private var actionId: JsonField<String> = JsonMissing.of()
            private var actionType: JsonField<ActionType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(structuredAction: StructuredAction) = apply {
                actionId = structuredAction.actionId
                actionType = structuredAction.actionType
                additionalProperties = structuredAction.additionalProperties.toMutableMap()
            }

            fun actionId(actionId: String?) = actionId(JsonField.ofNullable(actionId))

            /** Alias for calling [Builder.actionId] with `actionId.orElse(null)`. */
            fun actionId(actionId: Optional<String>) = actionId(actionId.getOrNull())

            /**
             * Sets [Builder.actionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

            fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

            /**
             * Sets [Builder.actionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionType] with a well-typed [ActionType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionType(actionType: JsonField<ActionType>) = apply {
                this.actionType = actionType
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
             * Returns an immutable instance of [StructuredAction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .actionType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StructuredAction =
                StructuredAction(
                    actionId,
                    checkRequired("actionType", actionType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StructuredAction = apply {
            if (validated) {
                return@apply
            }

            actionId()
            actionType().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (actionId.asKnown().isPresent) 1 else 0) +
                (actionType.asKnown().getOrNull()?.validity() ?: 0)

        class ActionType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val STRUCTURED_ACTION = of("structured_action")

                @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
            }

            /** An enum containing [ActionType]'s known values. */
            enum class Known {
                STRUCTURED_ACTION
            }

            /**
             * An enum containing [ActionType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ActionType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRUCTURED_ACTION,
                /**
                 * An enum member indicating that [ActionType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    STRUCTURED_ACTION -> Value.STRUCTURED_ACTION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    STRUCTURED_ACTION -> Known.STRUCTURED_ACTION
                    else -> throw ClearStreetInvalidDataException("Unknown ActionType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ClearStreetInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ActionType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ActionType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StructuredAction &&
                actionId == other.actionId &&
                actionType == other.actionType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(actionId, actionType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StructuredAction{actionId=$actionId, actionType=$actionType, additionalProperties=$additionalProperties}"
    }
}
