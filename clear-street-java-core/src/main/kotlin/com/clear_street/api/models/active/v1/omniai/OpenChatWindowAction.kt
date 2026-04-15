// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Action to open a chat window. */
class OpenChatWindowAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val extras: JsonValue,
    private val threadId: JsonField<String>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("extras") @ExcludeMissing extras: JsonValue = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(extras, threadId, title, mutableMapOf())

    /**
     * Additional configuration
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = openChatWindowAction.extras().convert(MyClass.class);
     * ```
     */
    @JsonProperty("extras") @ExcludeMissing fun _extras(): JsonValue = extras

    /**
     * Thread ID to open (None to open a new chat window)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadId(): Optional<String> = threadId.getOptional("thread_id")

    /**
     * Window title
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [threadId].
     *
     * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

        /** Returns a mutable builder for constructing an instance of [OpenChatWindowAction]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OpenChatWindowAction]. */
    class Builder internal constructor() {

        private var extras: JsonValue = JsonMissing.of()
        private var threadId: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(openChatWindowAction: OpenChatWindowAction) = apply {
            extras = openChatWindowAction.extras
            threadId = openChatWindowAction.threadId
            title = openChatWindowAction.title
            additionalProperties = openChatWindowAction.additionalProperties.toMutableMap()
        }

        /** Additional configuration */
        fun extras(extras: JsonValue) = apply { this.extras = extras }

        /** Thread ID to open (None to open a new chat window) */
        fun threadId(threadId: String?) = threadId(JsonField.ofNullable(threadId))

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

        /** Window title */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /** Alias for calling [Builder.title] with `title.orElse(null)`. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [OpenChatWindowAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OpenChatWindowAction =
            OpenChatWindowAction(extras, threadId, title, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): OpenChatWindowAction = apply {
        if (validated) {
            return@apply
        }

        threadId()
        title()
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
        (if (threadId.asKnown().isPresent) 1 else 0) + (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpenChatWindowAction &&
            extras == other.extras &&
            threadId == other.threadId &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(extras, threadId, title, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OpenChatWindowAction{extras=$extras, threadId=$threadId, title=$title, additionalProperties=$additionalProperties}"
}
