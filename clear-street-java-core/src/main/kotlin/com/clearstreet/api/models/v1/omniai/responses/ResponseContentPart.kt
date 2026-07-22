// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.responses

import com.clearstreet.api.core.BaseDeserializer
import com.clearstreet.api.core.BaseSerializer
import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.allMaxBy
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.getOrThrow
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.omniai.ChartPayload
import com.clearstreet.api.models.v1.omniai.ContentPartChartPayload
import com.clearstreet.api.models.v1.omniai.ContentPartCustomPayload
import com.clearstreet.api.models.v1.omniai.ContentPartStructuredActionPayload
import com.clearstreet.api.models.v1.omniai.ContentPartSuggestedActionsPayload
import com.clearstreet.api.models.v1.omniai.ContentPartTextPayload
import com.clearstreet.api.models.v1.omniai.ContentPartThinkingPayload
import com.clearstreet.api.models.v1.omniai.StructuredAction
import com.clearstreet.api.models.v1.omniai.SuggestedActionsPayload
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

/** Dynamic content part visible on a pollable response. */
@JsonDeserialize(using = ResponseContentPart.Deserializer::class)
@JsonSerialize(using = ResponseContentPart.Serializer::class)
class ResponseContentPart
private constructor(
    private val contentPartText: ContentPartText? = null,
    private val contentPartThinking: ContentPartThinking? = null,
    private val contentPartStructuredAction: ContentPartStructuredAction? = null,
    private val contentPartChart: ContentPartChart? = null,
    private val contentPartSuggestedActions: ContentPartSuggestedActions? = null,
    private val contentPartCustom: ContentPartCustom? = null,
    private val _json: JsonValue? = null,
) {

    /** Text content part. */
    fun contentPartText(): Optional<ContentPartText> = Optional.ofNullable(contentPartText)

    /** Thinking content part shown on dynamic response polling. */
    fun contentPartThinking(): Optional<ContentPartThinking> =
        Optional.ofNullable(contentPartThinking)

    /** Structured action content part. */
    fun contentPartStructuredAction(): Optional<ContentPartStructuredAction> =
        Optional.ofNullable(contentPartStructuredAction)

    /** Chart payload content part. */
    fun contentPartChart(): Optional<ContentPartChart> = Optional.ofNullable(contentPartChart)

    /** Suggested actions payload content part. */
    fun contentPartSuggestedActions(): Optional<ContentPartSuggestedActions> =
        Optional.ofNullable(contentPartSuggestedActions)

    /** Escape-hatch custom payload content part. */
    fun contentPartCustom(): Optional<ContentPartCustom> = Optional.ofNullable(contentPartCustom)

    fun isContentPartText(): Boolean = contentPartText != null

    fun isContentPartThinking(): Boolean = contentPartThinking != null

    fun isContentPartStructuredAction(): Boolean = contentPartStructuredAction != null

    fun isContentPartChart(): Boolean = contentPartChart != null

    fun isContentPartSuggestedActions(): Boolean = contentPartSuggestedActions != null

    fun isContentPartCustom(): Boolean = contentPartCustom != null

    /** Text content part. */
    fun asContentPartText(): ContentPartText = contentPartText.getOrThrow("contentPartText")

    /** Thinking content part shown on dynamic response polling. */
    fun asContentPartThinking(): ContentPartThinking =
        contentPartThinking.getOrThrow("contentPartThinking")

    /** Structured action content part. */
    fun asContentPartStructuredAction(): ContentPartStructuredAction =
        contentPartStructuredAction.getOrThrow("contentPartStructuredAction")

    /** Chart payload content part. */
    fun asContentPartChart(): ContentPartChart = contentPartChart.getOrThrow("contentPartChart")

    /** Suggested actions payload content part. */
    fun asContentPartSuggestedActions(): ContentPartSuggestedActions =
        contentPartSuggestedActions.getOrThrow("contentPartSuggestedActions")

    /** Escape-hatch custom payload content part. */
    fun asContentPartCustom(): ContentPartCustom = contentPartCustom.getOrThrow("contentPartCustom")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.clearstreet.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = responseContentPart.accept(new ResponseContentPart.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitContentPartText(ContentPartText contentPartText) {
     *         return Optional.of(contentPartText.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws ClearStreetInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
     *   and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            contentPartText != null -> visitor.visitContentPartText(contentPartText)
            contentPartThinking != null -> visitor.visitContentPartThinking(contentPartThinking)
            contentPartStructuredAction != null ->
                visitor.visitContentPartStructuredAction(contentPartStructuredAction)
            contentPartChart != null -> visitor.visitContentPartChart(contentPartChart)
            contentPartSuggestedActions != null ->
                visitor.visitContentPartSuggestedActions(contentPartSuggestedActions)
            contentPartCustom != null -> visitor.visitContentPartCustom(contentPartCustom)
            else -> visitor.unknown(_json)
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
    fun validate(): ResponseContentPart = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitContentPartText(contentPartText: ContentPartText) {
                    contentPartText.validate()
                }

                override fun visitContentPartThinking(contentPartThinking: ContentPartThinking) {
                    contentPartThinking.validate()
                }

                override fun visitContentPartStructuredAction(
                    contentPartStructuredAction: ContentPartStructuredAction
                ) {
                    contentPartStructuredAction.validate()
                }

                override fun visitContentPartChart(contentPartChart: ContentPartChart) {
                    contentPartChart.validate()
                }

                override fun visitContentPartSuggestedActions(
                    contentPartSuggestedActions: ContentPartSuggestedActions
                ) {
                    contentPartSuggestedActions.validate()
                }

                override fun visitContentPartCustom(contentPartCustom: ContentPartCustom) {
                    contentPartCustom.validate()
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
                override fun visitContentPartText(contentPartText: ContentPartText) =
                    contentPartText.validity()

                override fun visitContentPartThinking(contentPartThinking: ContentPartThinking) =
                    contentPartThinking.validity()

                override fun visitContentPartStructuredAction(
                    contentPartStructuredAction: ContentPartStructuredAction
                ) = contentPartStructuredAction.validity()

                override fun visitContentPartChart(contentPartChart: ContentPartChart) =
                    contentPartChart.validity()

                override fun visitContentPartSuggestedActions(
                    contentPartSuggestedActions: ContentPartSuggestedActions
                ) = contentPartSuggestedActions.validity()

                override fun visitContentPartCustom(contentPartCustom: ContentPartCustom) =
                    contentPartCustom.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResponseContentPart &&
            contentPartText == other.contentPartText &&
            contentPartThinking == other.contentPartThinking &&
            contentPartStructuredAction == other.contentPartStructuredAction &&
            contentPartChart == other.contentPartChart &&
            contentPartSuggestedActions == other.contentPartSuggestedActions &&
            contentPartCustom == other.contentPartCustom
    }

    override fun hashCode(): Int =
        Objects.hash(
            contentPartText,
            contentPartThinking,
            contentPartStructuredAction,
            contentPartChart,
            contentPartSuggestedActions,
            contentPartCustom,
        )

    override fun toString(): String =
        when {
            contentPartText != null -> "ResponseContentPart{contentPartText=$contentPartText}"
            contentPartThinking != null ->
                "ResponseContentPart{contentPartThinking=$contentPartThinking}"
            contentPartStructuredAction != null ->
                "ResponseContentPart{contentPartStructuredAction=$contentPartStructuredAction}"
            contentPartChart != null -> "ResponseContentPart{contentPartChart=$contentPartChart}"
            contentPartSuggestedActions != null ->
                "ResponseContentPart{contentPartSuggestedActions=$contentPartSuggestedActions}"
            contentPartCustom != null -> "ResponseContentPart{contentPartCustom=$contentPartCustom}"
            _json != null -> "ResponseContentPart{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ResponseContentPart")
        }

    companion object {

        /** Text content part. */
        @JvmStatic
        fun ofContentPartText(contentPartText: ContentPartText) =
            ResponseContentPart(contentPartText = contentPartText)

        /** Thinking content part shown on dynamic response polling. */
        @JvmStatic
        fun ofContentPartThinking(contentPartThinking: ContentPartThinking) =
            ResponseContentPart(contentPartThinking = contentPartThinking)

        /** Structured action content part. */
        @JvmStatic
        fun ofContentPartStructuredAction(
            contentPartStructuredAction: ContentPartStructuredAction
        ) = ResponseContentPart(contentPartStructuredAction = contentPartStructuredAction)

        /** Chart payload content part. */
        @JvmStatic
        fun ofContentPartChart(contentPartChart: ContentPartChart) =
            ResponseContentPart(contentPartChart = contentPartChart)

        /** Suggested actions payload content part. */
        @JvmStatic
        fun ofContentPartSuggestedActions(
            contentPartSuggestedActions: ContentPartSuggestedActions
        ) = ResponseContentPart(contentPartSuggestedActions = contentPartSuggestedActions)

        /** Escape-hatch custom payload content part. */
        @JvmStatic
        fun ofContentPartCustom(contentPartCustom: ContentPartCustom) =
            ResponseContentPart(contentPartCustom = contentPartCustom)
    }

    /**
     * An interface that defines how to map each variant of [ResponseContentPart] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Text content part. */
        fun visitContentPartText(contentPartText: ContentPartText): T

        /** Thinking content part shown on dynamic response polling. */
        fun visitContentPartThinking(contentPartThinking: ContentPartThinking): T

        /** Structured action content part. */
        fun visitContentPartStructuredAction(
            contentPartStructuredAction: ContentPartStructuredAction
        ): T

        /** Chart payload content part. */
        fun visitContentPartChart(contentPartChart: ContentPartChart): T

        /** Suggested actions payload content part. */
        fun visitContentPartSuggestedActions(
            contentPartSuggestedActions: ContentPartSuggestedActions
        ): T

        /** Escape-hatch custom payload content part. */
        fun visitContentPartCustom(contentPartCustom: ContentPartCustom): T

        /**
         * Maps an unknown variant of [ResponseContentPart] to a value of type [T].
         *
         * An instance of [ResponseContentPart] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws ClearStreetInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ClearStreetInvalidDataException("Unknown ResponseContentPart: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ResponseContentPart>(ResponseContentPart::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ResponseContentPart {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ContentPartText>())?.let {
                            ResponseContentPart(contentPartText = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ContentPartThinking>())?.let {
                            ResponseContentPart(contentPartThinking = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ContentPartStructuredAction>())?.let {
                            ResponseContentPart(contentPartStructuredAction = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ContentPartChart>())?.let {
                            ResponseContentPart(contentPartChart = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ContentPartSuggestedActions>())?.let {
                            ResponseContentPart(contentPartSuggestedActions = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ContentPartCustom>())?.let {
                            ResponseContentPart(contentPartCustom = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ResponseContentPart(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ResponseContentPart>(ResponseContentPart::class) {

        override fun serialize(
            value: ResponseContentPart,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.contentPartText != null -> generator.writeObject(value.contentPartText)
                value.contentPartThinking != null ->
                    generator.writeObject(value.contentPartThinking)
                value.contentPartStructuredAction != null ->
                    generator.writeObject(value.contentPartStructuredAction)
                value.contentPartChart != null -> generator.writeObject(value.contentPartChart)
                value.contentPartSuggestedActions != null ->
                    generator.writeObject(value.contentPartSuggestedActions)
                value.contentPartCustom != null -> generator.writeObject(value.contentPartCustom)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ResponseContentPart")
            }
        }
    }

    /** Text content part. */
    class ContentPartText
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val text: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(text, type, mutableMapOf())

        fun toContentPartTextPayload(): ContentPartTextPayload =
            ContentPartTextPayload.builder().text(text).build()

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [ContentPartText].
             *
             * The following fields are required:
             * ```java
             * .text()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContentPartText]. */
        class Builder internal constructor() {

            private var text: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contentPartText: ContentPartText) = apply {
                text = contentPartText.text
                type = contentPartText.type
                additionalProperties = contentPartText.additionalProperties.toMutableMap()
            }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [ContentPartText].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .text()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ContentPartText =
                ContentPartText(
                    checkRequired("text", text),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ContentPartText = apply {
            if (validated) {
                return@apply
            }

            text()
            type().validate()
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
            (if (text.asKnown().isPresent) 1 else 0) + (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val TEXT = of("text")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TEXT
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    TEXT -> Value.TEXT
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
                    TEXT -> Known.TEXT
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentPartText &&
                text == other.text &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContentPartText{text=$text, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Thinking content part shown on dynamic response polling. */
    class ContentPartThinking
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val thoughts: JsonField<List<String>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("thoughts")
            @ExcludeMissing
            thoughts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(thoughts, type, mutableMapOf())

        fun toContentPartThinkingPayload(): ContentPartThinkingPayload =
            ContentPartThinkingPayload.builder().thoughts(thoughts).build()

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun thoughts(): List<String> = thoughts.getRequired("thoughts")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [thoughts].
         *
         * Unlike [thoughts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thoughts")
        @ExcludeMissing
        fun _thoughts(): JsonField<List<String>> = thoughts

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [ContentPartThinking].
             *
             * The following fields are required:
             * ```java
             * .thoughts()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContentPartThinking]. */
        class Builder internal constructor() {

            private var thoughts: JsonField<MutableList<String>>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contentPartThinking: ContentPartThinking) = apply {
                thoughts = contentPartThinking.thoughts.map { it.toMutableList() }
                type = contentPartThinking.type
                additionalProperties = contentPartThinking.additionalProperties.toMutableMap()
            }

            fun thoughts(thoughts: List<String>) = thoughts(JsonField.of(thoughts))

            /**
             * Sets [Builder.thoughts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thoughts] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thoughts(thoughts: JsonField<List<String>>) = apply {
                this.thoughts = thoughts.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [thoughts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addThought(thought: String) = apply {
                thoughts =
                    (thoughts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("thoughts", it).add(thought)
                    }
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [ContentPartThinking].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .thoughts()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ContentPartThinking =
                ContentPartThinking(
                    checkRequired("thoughts", thoughts).map { it.toImmutable() },
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ContentPartThinking = apply {
            if (validated) {
                return@apply
            }

            thoughts()
            type().validate()
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
            (thoughts.asKnown().getOrNull()?.size ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val THINKING = of("thinking")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                THINKING
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                THINKING,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    THINKING -> Value.THINKING
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
                    THINKING -> Known.THINKING
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentPartThinking &&
                thoughts == other.thoughts &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(thoughts, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContentPartThinking{thoughts=$thoughts, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Structured action content part. */
    class ContentPartStructuredAction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<StructuredAction>,
        private val actionId: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action")
            @ExcludeMissing
            action: JsonField<StructuredAction> = JsonMissing.of(),
            @JsonProperty("action_id")
            @ExcludeMissing
            actionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(action, actionId, type, mutableMapOf())

        fun toContentPartStructuredActionPayload(): ContentPartStructuredActionPayload =
            ContentPartStructuredActionPayload.builder().action(action).actionId(actionId).build()

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
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * [ContentPartStructuredAction].
             *
             * The following fields are required:
             * ```java
             * .action()
             * .actionId()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContentPartStructuredAction]. */
        class Builder internal constructor() {

            private var action: JsonField<StructuredAction>? = null
            private var actionId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contentPartStructuredAction: ContentPartStructuredAction) = apply {
                action = contentPartStructuredAction.action
                actionId = contentPartStructuredAction.actionId
                type = contentPartStructuredAction.type
                additionalProperties =
                    contentPartStructuredAction.additionalProperties.toMutableMap()
            }

            /**
             * Structured actions that Omni AI can return to clients.
             *
             * These actions provide machine-readable instructions for the client to execute, such
             * as prefilling an order ticket, opening a chart, or navigating to a route.
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
             * You should usually call [Builder.actionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [ContentPartStructuredAction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * .actionId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ContentPartStructuredAction =
                ContentPartStructuredAction(
                    checkRequired("action", action),
                    checkRequired("actionId", actionId),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ContentPartStructuredAction = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            actionId()
            type().validate()
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
            (action.asKnown().getOrNull()?.validity() ?: 0) +
                (if (actionId.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                STRUCTURED_ACTION
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRUCTURED_ACTION,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentPartStructuredAction &&
                action == other.action &&
                actionId == other.actionId &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(action, actionId, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContentPartStructuredAction{action=$action, actionId=$actionId, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Chart payload content part. */
    class ContentPartChart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val payload: JsonField<ChartPayload>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payload")
            @ExcludeMissing
            payload: JsonField<ChartPayload> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(payload, type, mutableMapOf())

        fun toContentPartChartPayload(): ContentPartChartPayload =
            ContentPartChartPayload.builder().payload(payload).build()

        /**
         * Typed chart payload rendered inline in assistant content.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payload(): ChartPayload = payload.getRequired("payload")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<ChartPayload> = payload

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [ContentPartChart].
             *
             * The following fields are required:
             * ```java
             * .payload()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContentPartChart]. */
        class Builder internal constructor() {

            private var payload: JsonField<ChartPayload>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contentPartChart: ContentPartChart) = apply {
                payload = contentPartChart.payload
                type = contentPartChart.type
                additionalProperties = contentPartChart.additionalProperties.toMutableMap()
            }

            /** Typed chart payload rendered inline in assistant content. */
            fun payload(payload: ChartPayload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [ChartPayload] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<ChartPayload>) = apply { this.payload = payload }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [ContentPartChart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .payload()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ContentPartChart =
                ContentPartChart(
                    checkRequired("payload", payload),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ContentPartChart = apply {
            if (validated) {
                return@apply
            }

            payload().validate()
            type().validate()
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
            (payload.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CHART = of("chart")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CHART
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHART,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    CHART -> Value.CHART
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
                    CHART -> Known.CHART
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentPartChart &&
                payload == other.payload &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(payload, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContentPartChart{payload=$payload, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Suggested actions payload content part. */
    class ContentPartSuggestedActions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val payload: JsonField<SuggestedActionsPayload>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payload")
            @ExcludeMissing
            payload: JsonField<SuggestedActionsPayload> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(payload, type, mutableMapOf())

        fun toContentPartSuggestedActionsPayload(): ContentPartSuggestedActionsPayload =
            ContentPartSuggestedActionsPayload.builder().payload(payload).build()

        /**
         * Suggested follow-up buttons rendered at the end of an assistant message.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payload(): SuggestedActionsPayload = payload.getRequired("payload")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload")
        @ExcludeMissing
        fun _payload(): JsonField<SuggestedActionsPayload> = payload

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * [ContentPartSuggestedActions].
             *
             * The following fields are required:
             * ```java
             * .payload()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContentPartSuggestedActions]. */
        class Builder internal constructor() {

            private var payload: JsonField<SuggestedActionsPayload>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contentPartSuggestedActions: ContentPartSuggestedActions) = apply {
                payload = contentPartSuggestedActions.payload
                type = contentPartSuggestedActions.type
                additionalProperties =
                    contentPartSuggestedActions.additionalProperties.toMutableMap()
            }

            /** Suggested follow-up buttons rendered at the end of an assistant message. */
            fun payload(payload: SuggestedActionsPayload) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [SuggestedActionsPayload]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun payload(payload: JsonField<SuggestedActionsPayload>) = apply {
                this.payload = payload
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * .payload()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ContentPartSuggestedActions =
                ContentPartSuggestedActions(
                    checkRequired("payload", payload),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ContentPartSuggestedActions = apply {
            if (validated) {
                return@apply
            }

            payload().validate()
            type().validate()
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
            (payload.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val SUGGESTED_ACTIONS = of("suggested_actions")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SUGGESTED_ACTIONS
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUGGESTED_ACTIONS,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    SUGGESTED_ACTIONS -> Value.SUGGESTED_ACTIONS
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
                    SUGGESTED_ACTIONS -> Known.SUGGESTED_ACTIONS
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentPartSuggestedActions &&
                payload == other.payload &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(payload, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContentPartSuggestedActions{payload=$payload, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Escape-hatch custom payload content part. */
    class ContentPartCustom
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val payload: JsonValue,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payload") @ExcludeMissing payload: JsonValue = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(payload, type, mutableMapOf())

        fun toContentPartCustomPayload(): ContentPartCustomPayload =
            ContentPartCustomPayload.builder().payload(payload).build()

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = contentPartCustom.payload().convert(MyClass.class);
         * ```
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonValue = payload

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [ContentPartCustom].
             *
             * The following fields are required:
             * ```java
             * .payload()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContentPartCustom]. */
        class Builder internal constructor() {

            private var payload: JsonValue? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contentPartCustom: ContentPartCustom) = apply {
                payload = contentPartCustom.payload
                type = contentPartCustom.type
                additionalProperties = contentPartCustom.additionalProperties.toMutableMap()
            }

            fun payload(payload: JsonValue) = apply { this.payload = payload }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [ContentPartCustom].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .payload()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ContentPartCustom =
                ContentPartCustom(
                    checkRequired("payload", payload),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ContentPartCustom = apply {
            if (validated) {
                return@apply
            }

            type().validate()
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
        @JvmSynthetic internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val CUSTOM = of("custom")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CUSTOM
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CUSTOM,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    CUSTOM -> Value.CUSTOM
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
                    CUSTOM -> Known.CUSTOM
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentPartCustom &&
                payload == other.payload &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(payload, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContentPartCustom{payload=$payload, type=$type, additionalProperties=$additionalProperties}"
    }
}
