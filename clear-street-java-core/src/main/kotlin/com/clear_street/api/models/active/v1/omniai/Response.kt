// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Dynamic pollable response. */
class Response
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val status: JsonField<ResponseStatus>,
    private val threadId: JsonField<String>,
    private val userMessageId: JsonField<String>,
    private val content: JsonField<ResponseContent>,
    private val error: JsonField<ErrorStatus>,
    private val outputMessageId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<ResponseStatus> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_message_id")
        @ExcludeMissing
        userMessageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<ResponseContent> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<ErrorStatus> = JsonMissing.of(),
        @JsonProperty("output_message_id")
        @ExcludeMissing
        outputMessageId: JsonField<String> = JsonMissing.of(),
    ) : this(id, status, threadId, userMessageId, content, error, outputMessageId, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Dynamic lifecycle status for a pollable response.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): ResponseStatus = status.getRequired("status")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun threadId(): String = threadId.getRequired("thread_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userMessageId(): String = userMessageId.getRequired("user_message_id")

    /**
     * Dynamic response content container. May include thinking parts.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<ResponseContent> = content.getOptional("content")

    /**
     * Shared sanitized error payload.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<ErrorStatus> = error.getOptional("error")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputMessageId(): Optional<String> = outputMessageId.getOptional("output_message_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<ResponseStatus> = status

    /**
     * Returns the raw JSON value of [threadId].
     *
     * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

    /**
     * Returns the raw JSON value of [userMessageId].
     *
     * Unlike [userMessageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_message_id")
    @ExcludeMissing
    fun _userMessageId(): JsonField<String> = userMessageId

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<ResponseContent> = content

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<ErrorStatus> = error

    /**
     * Returns the raw JSON value of [outputMessageId].
     *
     * Unlike [outputMessageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_message_id")
    @ExcludeMissing
    fun _outputMessageId(): JsonField<String> = outputMessageId

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
         * Returns a mutable builder for constructing an instance of [Response].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .status()
         * .threadId()
         * .userMessageId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Response]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var status: JsonField<ResponseStatus>? = null
        private var threadId: JsonField<String>? = null
        private var userMessageId: JsonField<String>? = null
        private var content: JsonField<ResponseContent> = JsonMissing.of()
        private var error: JsonField<ErrorStatus> = JsonMissing.of()
        private var outputMessageId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(response: Response) = apply {
            id = response.id
            status = response.status
            threadId = response.threadId
            userMessageId = response.userMessageId
            content = response.content
            error = response.error
            outputMessageId = response.outputMessageId
            additionalProperties = response.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Dynamic lifecycle status for a pollable response. */
        fun status(status: ResponseStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [ResponseStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<ResponseStatus>) = apply { this.status = status }

        fun threadId(threadId: String) = threadId(JsonField.of(threadId))

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

        fun userMessageId(userMessageId: String) = userMessageId(JsonField.of(userMessageId))

        /**
         * Sets [Builder.userMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userMessageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userMessageId(userMessageId: JsonField<String>) = apply {
            this.userMessageId = userMessageId
        }

        /** Dynamic response content container. May include thinking parts. */
        fun content(content: ResponseContent?) = content(JsonField.ofNullable(content))

        /** Alias for calling [Builder.content] with `content.orElse(null)`. */
        fun content(content: Optional<ResponseContent>) = content(content.getOrNull())

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [ResponseContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<ResponseContent>) = apply { this.content = content }

        /** Shared sanitized error payload. */
        fun error(error: ErrorStatus?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<ErrorStatus>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [ErrorStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun error(error: JsonField<ErrorStatus>) = apply { this.error = error }

        fun outputMessageId(outputMessageId: String?) =
            outputMessageId(JsonField.ofNullable(outputMessageId))

        /** Alias for calling [Builder.outputMessageId] with `outputMessageId.orElse(null)`. */
        fun outputMessageId(outputMessageId: Optional<String>) =
            outputMessageId(outputMessageId.getOrNull())

        /**
         * Sets [Builder.outputMessageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputMessageId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputMessageId(outputMessageId: JsonField<String>) = apply {
            this.outputMessageId = outputMessageId
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
         * Returns an immutable instance of [Response].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .status()
         * .threadId()
         * .userMessageId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Response =
            Response(
                checkRequired("id", id),
                checkRequired("status", status),
                checkRequired("threadId", threadId),
                checkRequired("userMessageId", userMessageId),
                content,
                error,
                outputMessageId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Response = apply {
        if (validated) {
            return@apply
        }

        id()
        status().validate()
        threadId()
        userMessageId()
        content().ifPresent { it.validate() }
        error().ifPresent { it.validate() }
        outputMessageId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (threadId.asKnown().isPresent) 1 else 0) +
            (if (userMessageId.asKnown().isPresent) 1 else 0) +
            (content.asKnown().getOrNull()?.validity() ?: 0) +
            (error.asKnown().getOrNull()?.validity() ?: 0) +
            (if (outputMessageId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Response &&
            id == other.id &&
            status == other.status &&
            threadId == other.threadId &&
            userMessageId == other.userMessageId &&
            content == other.content &&
            error == other.error &&
            outputMessageId == other.outputMessageId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            status,
            threadId,
            userMessageId,
            content,
            error,
            outputMessageId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Response{id=$id, status=$status, threadId=$threadId, userMessageId=$userMessageId, content=$content, error=$error, outputMessageId=$outputMessageId, additionalProperties=$additionalProperties}"
}
