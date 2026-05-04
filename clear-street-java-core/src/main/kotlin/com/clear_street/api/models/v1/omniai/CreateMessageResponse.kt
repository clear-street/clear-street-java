// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

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

/** Response payload for continuing a thread with a new message. */
class CreateMessageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val responseId: JsonField<String>,
    private val threadId: JsonField<String>,
    private val userMessageId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("response_id")
        @ExcludeMissing
        responseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_message_id")
        @ExcludeMissing
        userMessageId: JsonField<String> = JsonMissing.of(),
    ) : this(responseId, threadId, userMessageId, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun responseId(): String = responseId.getRequired("response_id")

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
     * Returns the raw JSON value of [responseId].
     *
     * Unlike [responseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_id") @ExcludeMissing fun _responseId(): JsonField<String> = responseId

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
         * Returns a mutable builder for constructing an instance of [CreateMessageResponse].
         *
         * The following fields are required:
         * ```java
         * .responseId()
         * .threadId()
         * .userMessageId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateMessageResponse]. */
    class Builder internal constructor() {

        private var responseId: JsonField<String>? = null
        private var threadId: JsonField<String>? = null
        private var userMessageId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createMessageResponse: CreateMessageResponse) = apply {
            responseId = createMessageResponse.responseId
            threadId = createMessageResponse.threadId
            userMessageId = createMessageResponse.userMessageId
            additionalProperties = createMessageResponse.additionalProperties.toMutableMap()
        }

        fun responseId(responseId: String) = responseId(JsonField.of(responseId))

        /**
         * Sets [Builder.responseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun responseId(responseId: JsonField<String>) = apply { this.responseId = responseId }

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
         * Returns an immutable instance of [CreateMessageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .responseId()
         * .threadId()
         * .userMessageId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateMessageResponse =
            CreateMessageResponse(
                checkRequired("responseId", responseId),
                checkRequired("threadId", threadId),
                checkRequired("userMessageId", userMessageId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreateMessageResponse = apply {
        if (validated) {
            return@apply
        }

        responseId()
        threadId()
        userMessageId()
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
        (if (responseId.asKnown().isPresent) 1 else 0) +
            (if (threadId.asKnown().isPresent) 1 else 0) +
            (if (userMessageId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateMessageResponse &&
            responseId == other.responseId &&
            threadId == other.threadId &&
            userMessageId == other.userMessageId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(responseId, threadId, userMessageId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateMessageResponse{responseId=$responseId, threadId=$threadId, userMessageId=$userMessageId, additionalProperties=$additionalProperties}"
}
