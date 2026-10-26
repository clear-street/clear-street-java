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

/** One requested order's entry in the batch response. */
@JsonDeserialize(using = OrderPreviewEntry.Deserializer::class)
@JsonSerialize(using = OrderPreviewEntry.Serializer::class)
class OrderPreviewEntry
private constructor(
    private val unionMember0: UnionMember0? = null,
    private val unionMember1: UnionMember1? = null,
    private val _json: JsonValue? = null,
) {

    /** The order was previewed successfully. */
    fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

    /**
     * The order could not be previewed. Shaped exactly like the top-level `error` object on
     * rejected submissions.
     */
    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

    fun isUnionMember0(): Boolean = unionMember0 != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    /** The order was previewed successfully. */
    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

    /**
     * The order could not be previewed. Shaped exactly like the top-level `error` object on
     * rejected submissions.
     */
    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

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
     * Optional<String> result = orderPreviewEntry.accept(new OrderPreviewEntry.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
     *         return Optional.of(unionMember0.toString());
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
            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
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
    fun validate(): OrderPreviewEntry = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnionMember0(unionMember0: UnionMember0) {
                    unionMember0.validate()
                }

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
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
                override fun visitUnionMember0(unionMember0: UnionMember0) = unionMember0.validity()

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderPreviewEntry &&
            unionMember0 == other.unionMember0 &&
            unionMember1 == other.unionMember1
    }

    override fun hashCode(): Int = Objects.hash(unionMember0, unionMember1)

    override fun toString(): String =
        when {
            unionMember0 != null -> "OrderPreviewEntry{unionMember0=$unionMember0}"
            unionMember1 != null -> "OrderPreviewEntry{unionMember1=$unionMember1}"
            _json != null -> "OrderPreviewEntry{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid OrderPreviewEntry")
        }

    companion object {

        /** The order was previewed successfully. */
        @JvmStatic
        fun ofUnionMember0(unionMember0: UnionMember0) =
            OrderPreviewEntry(unionMember0 = unionMember0)

        /**
         * The order could not be previewed. Shaped exactly like the top-level `error` object on
         * rejected submissions.
         */
        @JvmStatic
        fun ofUnionMember1(unionMember1: UnionMember1) =
            OrderPreviewEntry(unionMember1 = unionMember1)
    }

    /**
     * An interface that defines how to map each variant of [OrderPreviewEntry] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** The order was previewed successfully. */
        fun visitUnionMember0(unionMember0: UnionMember0): T

        /**
         * The order could not be previewed. Shaped exactly like the top-level `error` object on
         * rejected submissions.
         */
        fun visitUnionMember1(unionMember1: UnionMember1): T

        /**
         * Maps an unknown variant of [OrderPreviewEntry] to a value of type [T].
         *
         * An instance of [OrderPreviewEntry] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws ClearStreetInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ClearStreetInvalidDataException("Unknown OrderPreviewEntry: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<OrderPreviewEntry>(OrderPreviewEntry::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): OrderPreviewEntry {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            OrderPreviewEntry(unionMember0 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            OrderPreviewEntry(unionMember1 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> OrderPreviewEntry(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<OrderPreviewEntry>(OrderPreviewEntry::class) {

        override fun serialize(
            value: OrderPreviewEntry,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid OrderPreviewEntry")
            }
        }
    }

    /** The order was previewed successfully. */
    class UnionMember0
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val preview: JsonField<OrderPreview>,
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("preview")
            @ExcludeMissing
            preview: JsonField<OrderPreview> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        ) : this(preview, id, mutableMapOf())

        /**
         * The projected impact of the order.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun preview(): OrderPreview = preview.getRequired("preview")

        /**
         * The client-provided `id` of the order this entry belongs to, echoed from the request.
         * Always present when the request contains more than one order, since ids are required
         * there.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Returns the raw JSON value of [preview].
         *
         * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preview") @ExcludeMissing fun _preview(): JsonField<OrderPreview> = preview

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns a mutable builder for constructing an instance of [UnionMember0].
             *
             * The following fields are required:
             * ```java
             * .preview()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember0]. */
        class Builder internal constructor() {

            private var preview: JsonField<OrderPreview>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember0: UnionMember0) = apply {
                preview = unionMember0.preview
                id = unionMember0.id
                additionalProperties = unionMember0.additionalProperties.toMutableMap()
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

            /**
             * The client-provided `id` of the order this entry belongs to, echoed from the request.
             * Always present when the request contains more than one order, since ids are required
             * there.
             */
            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * Returns an immutable instance of [UnionMember0].
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
            fun build(): UnionMember0 =
                UnionMember0(
                    checkRequired("preview", preview),
                    id,
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
        fun validate(): UnionMember0 = apply {
            if (validated) {
                return@apply
            }

            preview().validate()
            id()
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
            (preview.asKnown().getOrNull()?.validity() ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember0 &&
                preview == other.preview &&
                id == other.id &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(preview, id, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember0{preview=$preview, id=$id, additionalProperties=$additionalProperties}"
    }

    /**
     * The order could not be previewed. Shaped exactly like the top-level `error` object on
     * rejected submissions.
     */
    class UnionMember1
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val error: JsonField<ApiError>,
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("error") @ExcludeMissing error: JsonField<ApiError> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        ) : this(error, id, mutableMapOf())

        /**
         * Why this order's preview failed.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun error(): ApiError = error.getRequired("error")

        /**
         * The client-provided `id` of the order this entry belongs to, echoed from the request.
         * Always present when the request contains more than one order, since ids are required
         * there.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<ApiError> = error

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns a mutable builder for constructing an instance of [UnionMember1].
             *
             * The following fields are required:
             * ```java
             * .error()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var error: JsonField<ApiError>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember1: UnionMember1) = apply {
                error = unionMember1.error
                id = unionMember1.id
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
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

            /**
             * The client-provided `id` of the order this entry belongs to, echoed from the request.
             * Always present when the request contains more than one order, since ids are required
             * there.
             */
            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * Returns an immutable instance of [UnionMember1].
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
            fun build(): UnionMember1 =
                UnionMember1(checkRequired("error", error), id, additionalProperties.toMutableMap())
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
        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

            error().validate()
            id()
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
            (error.asKnown().getOrNull()?.validity() ?: 0) + (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember1 &&
                error == other.error &&
                id == other.id &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(error, id, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember1{error=$error, id=$id, additionalProperties=$additionalProperties}"
    }
}
