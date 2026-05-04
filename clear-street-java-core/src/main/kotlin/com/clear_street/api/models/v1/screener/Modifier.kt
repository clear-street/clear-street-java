// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.screener

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.allMaxBy
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.getOrThrow
import com.clear_street.api.core.toImmutable
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

/** Arithmetic modifier applied to a variable value. */
class Modifier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val args: JsonField<List<Arg>>,
    private val name: JsonField<ModifierOp>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("args") @ExcludeMissing args: JsonField<List<Arg>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<ModifierOp> = JsonMissing.of(),
    ) : this(args, name, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun args(): List<Arg> = args.getRequired("args")

    /**
     * The modifier operation.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): ModifierOp = name.getRequired("name")

    /**
     * Returns the raw JSON value of [args].
     *
     * Unlike [args], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<List<Arg>> = args

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<ModifierOp> = name

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
         * Returns a mutable builder for constructing an instance of [Modifier].
         *
         * The following fields are required:
         * ```java
         * .args()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Modifier]. */
    class Builder internal constructor() {

        private var args: JsonField<MutableList<Arg>>? = null
        private var name: JsonField<ModifierOp>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modifier: Modifier) = apply {
            args = modifier.args.map { it.toMutableList() }
            name = modifier.name
            additionalProperties = modifier.additionalProperties.toMutableMap()
        }

        fun args(args: List<Arg>) = args(JsonField.of(args))

        /**
         * Sets [Builder.args] to an arbitrary JSON value.
         *
         * You should usually call [Builder.args] with a well-typed `List<Arg>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun args(args: JsonField<List<Arg>>) = apply { this.args = args.map { it.toMutableList() } }

        /**
         * Adds a single [Arg] to [args].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addArg(arg: Arg) = apply {
            args = (args ?: JsonField.of(mutableListOf())).also { checkKnown("args", it).add(arg) }
        }

        /** Alias for calling [addArg] with `Arg.ofNumber(number)`. */
        fun addArg(number: Double) = addArg(Arg.ofNumber(number))

        /** Alias for calling [addArg] with `Arg.ofString(string)`. */
        fun addArg(string: String) = addArg(Arg.ofString(string))

        /** The modifier operation. */
        fun name(name: ModifierOp) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [ModifierOp] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<ModifierOp>) = apply { this.name = name }

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
         * Returns an immutable instance of [Modifier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .args()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Modifier =
            Modifier(
                checkRequired("args", args).map { it.toImmutable() },
                checkRequired("name", name),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Modifier = apply {
        if (validated) {
            return@apply
        }

        args().forEach { it.validate() }
        name().validate()
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
        (args.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (name.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Arg.Deserializer::class)
    @JsonSerialize(using = Arg.Serializer::class)
    class Arg
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Arg = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Arg && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "Arg{number=$number}"
                string != null -> "Arg{string=$string}"
                _json != null -> "Arg{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Arg")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Arg(number = number)

            @JvmStatic fun ofString(string: String) = Arg(string = string)
        }

        /** An interface that defines how to map each variant of [Arg] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Arg] to a value of type [T].
             *
             * An instance of [Arg] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws ClearStreetInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw ClearStreetInvalidDataException("Unknown Arg: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Arg>(Arg::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Arg {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Arg(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Arg(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Arg(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Arg>(Arg::class) {

            override fun serialize(
                value: Arg,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Arg")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Modifier &&
            args == other.args &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(args, name, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Modifier{args=$args, name=$name, additionalProperties=$additionalProperties}"
}
