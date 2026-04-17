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

class Message
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contentText: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val role: JsonField<MessageRole>,
    private val seq: JsonField<Long>,
    private val id: JsonField<String>,
    private val authorUserId: JsonField<String>,
    private val content: JsonField<MessageContent>,
    private val metadata: JsonValue,
    private val runId: JsonField<String>,
    private val threadId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content_text")
        @ExcludeMissing
        contentText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing role: JsonField<MessageRole> = JsonMissing.of(),
        @JsonProperty("seq") @ExcludeMissing seq: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("author_user_id")
        @ExcludeMissing
        authorUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<MessageContent> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
    ) : this(
        contentText,
        createdAt,
        role,
        seq,
        id,
        authorUserId,
        content,
        metadata,
        runId,
        threadId,
        mutableMapOf(),
    )

    /**
     * Denormalized text content for search/display
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentText(): String = contentText.getRequired("content_text")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("created_at")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun role(): MessageRole = role.getRequired("role")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seq(): Long = seq.getRequired("seq")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorUserId(): Optional<String> = authorUserId.getOptional("author_user_id")

    /**
     * Parsed content parts (text, thinking, and structured actions)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<MessageContent> = content.getOptional("content")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = message.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runId(): Optional<String> = runId.getOptional("run_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadId(): Optional<String> = threadId.getOptional("thread_id")

    /**
     * Returns the raw JSON value of [contentText].
     *
     * Unlike [contentText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_text")
    @ExcludeMissing
    fun _contentText(): JsonField<String> = contentText

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [role].
     *
     * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<MessageRole> = role

    /**
     * Returns the raw JSON value of [seq].
     *
     * Unlike [seq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seq") @ExcludeMissing fun _seq(): JsonField<Long> = seq

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [authorUserId].
     *
     * Unlike [authorUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author_user_id")
    @ExcludeMissing
    fun _authorUserId(): JsonField<String> = authorUserId

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<MessageContent> = content

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [threadId].
     *
     * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

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
         * Returns a mutable builder for constructing an instance of [Message].
         *
         * The following fields are required:
         * ```java
         * .contentText()
         * .createdAt()
         * .role()
         * .seq()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Message]. */
    class Builder internal constructor() {

        private var contentText: JsonField<String>? = null
        private var createdAt: JsonField<String>? = null
        private var role: JsonField<MessageRole>? = null
        private var seq: JsonField<Long>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var authorUserId: JsonField<String> = JsonMissing.of()
        private var content: JsonField<MessageContent> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var runId: JsonField<String> = JsonMissing.of()
        private var threadId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(message: Message) = apply {
            contentText = message.contentText
            createdAt = message.createdAt
            role = message.role
            seq = message.seq
            id = message.id
            authorUserId = message.authorUserId
            content = message.content
            metadata = message.metadata
            runId = message.runId
            threadId = message.threadId
            additionalProperties = message.additionalProperties.toMutableMap()
        }

        /** Denormalized text content for search/display */
        fun contentText(contentText: String) = contentText(JsonField.of(contentText))

        /**
         * Sets [Builder.contentText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentText(contentText: JsonField<String>) = apply { this.contentText = contentText }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun role(role: MessageRole) = role(JsonField.of(role))

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [MessageRole] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun role(role: JsonField<MessageRole>) = apply { this.role = role }

        fun seq(seq: Long) = seq(JsonField.of(seq))

        /**
         * Sets [Builder.seq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seq] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seq(seq: JsonField<Long>) = apply { this.seq = seq }

        fun id(id: String?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun authorUserId(authorUserId: String?) = authorUserId(JsonField.ofNullable(authorUserId))

        /** Alias for calling [Builder.authorUserId] with `authorUserId.orElse(null)`. */
        fun authorUserId(authorUserId: Optional<String>) = authorUserId(authorUserId.getOrNull())

        /**
         * Sets [Builder.authorUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorUserId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorUserId(authorUserId: JsonField<String>) = apply {
            this.authorUserId = authorUserId
        }

        /** Parsed content parts (text, thinking, and structured actions) */
        fun content(content: MessageContent?) = content(JsonField.ofNullable(content))

        /** Alias for calling [Builder.content] with `content.orElse(null)`. */
        fun content(content: Optional<MessageContent>) = content(content.getOrNull())

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [MessageContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<MessageContent>) = apply { this.content = content }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun runId(runId: String?) = runId(JsonField.ofNullable(runId))

        /** Alias for calling [Builder.runId] with `runId.orElse(null)`. */
        fun runId(runId: Optional<String>) = runId(runId.getOrNull())

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

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
         * Returns an immutable instance of [Message].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contentText()
         * .createdAt()
         * .role()
         * .seq()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Message =
            Message(
                checkRequired("contentText", contentText),
                checkRequired("createdAt", createdAt),
                checkRequired("role", role),
                checkRequired("seq", seq),
                id,
                authorUserId,
                content,
                metadata,
                runId,
                threadId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Message = apply {
        if (validated) {
            return@apply
        }

        contentText()
        createdAt()
        role().validate()
        seq()
        id()
        authorUserId()
        content().ifPresent { it.validate() }
        runId()
        threadId()
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
        (if (contentText.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (role.asKnown().getOrNull()?.validity() ?: 0) +
            (if (seq.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (authorUserId.asKnown().isPresent) 1 else 0) +
            (content.asKnown().getOrNull()?.validity() ?: 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (threadId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Message &&
            contentText == other.contentText &&
            createdAt == other.createdAt &&
            role == other.role &&
            seq == other.seq &&
            id == other.id &&
            authorUserId == other.authorUserId &&
            content == other.content &&
            metadata == other.metadata &&
            runId == other.runId &&
            threadId == other.threadId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contentText,
            createdAt,
            role,
            seq,
            id,
            authorUserId,
            content,
            metadata,
            runId,
            threadId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Message{contentText=$contentText, createdAt=$createdAt, role=$role, seq=$seq, id=$id, authorUserId=$authorUserId, content=$content, metadata=$metadata, runId=$runId, threadId=$threadId, additionalProperties=$additionalProperties}"
}
