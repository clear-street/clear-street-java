// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.BaseDeserializer
import com.clearstreet.api.core.BaseSerializer
import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.allMaxBy
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.getOrThrow
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.ApiError
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

/** Either a successful preview or the error that prevented one, for a single order in the batch. */
@JsonDeserialize(using = OrderPreviewOutcome.Deserializer::class)
@JsonSerialize(using = OrderPreviewOutcome.Serializer::class)
class OrderPreviewOutcome
private constructor(
    private val preview: Preview? = null,
    private val error: Error? = null,
    private val _json: JsonValue? = null,
) {

    /** The order was previewed successfully. */
    fun preview(): Optional<Preview> = Optional.ofNullable(preview)

    /**
     * The order could not be previewed. Shaped exactly like the top-level `error` object on
     * rejected submissions.
     */
    fun error(): Optional<Error> = Optional.ofNullable(error)

    fun isPreview(): Boolean = preview != null

    fun isError(): Boolean = error != null

    /** The order was previewed successfully. */
    fun asPreview(): Preview = preview.getOrThrow("preview")

    /**
     * The order could not be previewed. Shaped exactly like the top-level `error` object on
     * rejected submissions.
     */
    fun asError(): Error = error.getOrThrow("error")

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
     * Optional<String> result = orderPreviewOutcome.accept(new OrderPreviewOutcome.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitPreview(Preview preview) {
     *         return Optional.of(preview.toString());
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
            preview != null -> visitor.visitPreview(preview)
            error != null -> visitor.visitError(error)
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
    fun validate(): OrderPreviewOutcome = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPreview(preview: Preview) {
                    preview.validate()
                }

                override fun visitError(error: Error) {
                    error.validate()
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
                override fun visitPreview(preview: Preview) = preview.validity()

                override fun visitError(error: Error) = error.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderPreviewOutcome && preview == other.preview && error == other.error
    }

    override fun hashCode(): Int = Objects.hash(preview, error)

    override fun toString(): String =
        when {
            preview != null -> "OrderPreviewOutcome{preview=$preview}"
            error != null -> "OrderPreviewOutcome{error=$error}"
            _json != null -> "OrderPreviewOutcome{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid OrderPreviewOutcome")
        }

    companion object {

        /** The order was previewed successfully. */
        @JvmStatic fun ofPreview(preview: Preview) = OrderPreviewOutcome(preview = preview)

        /**
         * The order could not be previewed. Shaped exactly like the top-level `error` object on
         * rejected submissions.
         */
        @JvmStatic fun ofError(error: Error) = OrderPreviewOutcome(error = error)
    }

    /**
     * An interface that defines how to map each variant of [OrderPreviewOutcome] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** The order was previewed successfully. */
        fun visitPreview(preview: Preview): T

        /**
         * The order could not be previewed. Shaped exactly like the top-level `error` object on
         * rejected submissions.
         */
        fun visitError(error: Error): T

        /**
         * Maps an unknown variant of [OrderPreviewOutcome] to a value of type [T].
         *
         * An instance of [OrderPreviewOutcome] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws ClearStreetInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ClearStreetInvalidDataException("Unknown OrderPreviewOutcome: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<OrderPreviewOutcome>(OrderPreviewOutcome::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): OrderPreviewOutcome {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<Preview>())?.let {
                            OrderPreviewOutcome(preview = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Error>())?.let {
                            OrderPreviewOutcome(error = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> OrderPreviewOutcome(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<OrderPreviewOutcome>(OrderPreviewOutcome::class) {

        override fun serialize(
            value: OrderPreviewOutcome,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.preview != null -> generator.writeObject(value.preview)
                value.error != null -> generator.writeObject(value.error)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid OrderPreviewOutcome")
            }
        }
    }

    /** The order was previewed successfully. */
    class Preview
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val preview: JsonField<OrderPreview>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("preview")
            @ExcludeMissing
            preview: JsonField<OrderPreview> = JsonMissing.of()
        ) : this(preview, mutableMapOf())

        /**
         * The projected impact of the order.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun preview(): OrderPreview = preview.getRequired("preview")

        /**
         * Returns the raw JSON value of [preview].
         *
         * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preview") @ExcludeMissing fun _preview(): JsonField<OrderPreview> = preview

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
             * Returns a mutable builder for constructing an instance of [Preview].
             *
             * The following fields are required:
             * ```java
             * .preview()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Preview]. */
        class Builder internal constructor() {

            private var preview: JsonField<OrderPreview>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(preview: Preview) = apply {
                this.preview = preview.preview
                additionalProperties = preview.additionalProperties.toMutableMap()
            }

            /** The projected impact of the order. */
            fun preview(preview: OrderPreview) = preview(JsonField.of(preview))

            /**
             * Sets [Builder.preview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preview] with a well-typed [OrderPreview] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preview(preview: JsonField<OrderPreview>) = apply { this.preview = preview }

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
             * Returns an immutable instance of [Preview].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .preview()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Preview =
                Preview(checkRequired("preview", preview), additionalProperties.toMutableMap())
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
        fun validate(): Preview = apply {
            if (validated) {
                return@apply
            }

            preview().validate()
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
        internal fun validity(): Int = (preview.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Preview &&
                preview == other.preview &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(preview, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Preview{preview=$preview, additionalProperties=$additionalProperties}"
    }

    /**
     * The order could not be previewed. Shaped exactly like the top-level `error` object on
     * rejected submissions.
     */
    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val error: JsonField<ApiError>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("error") @ExcludeMissing error: JsonField<ApiError> = JsonMissing.of()
        ) : this(error, mutableMapOf())

        /**
         * Why this order's preview failed.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun error(): ApiError = error.getRequired("error")

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<ApiError> = error

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```java
             * .error()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var error: JsonField<ApiError>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(error: Error) = apply {
                this.error = error.error
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            /** Why this order's preview failed. */
            fun error(error: ApiError) = error(JsonField.of(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [ApiError] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<ApiError>) = apply { this.error = error }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .error()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(checkRequired("error", error), additionalProperties.toMutableMap())
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
        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            error().validate()
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
        @JvmSynthetic internal fun validity(): Int = (error.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                error == other.error &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(error, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Error{error=$error, additionalProperties=$additionalProperties}"
    }
}
