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
import kotlin.jvm.optionals.getOrNull

class StartRunResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val run: JsonField<Run>,
    private val thread: JsonField<Thread>,
    private val userMessage: JsonField<Message>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("run") @ExcludeMissing run: JsonField<Run> = JsonMissing.of(),
        @JsonProperty("thread") @ExcludeMissing thread: JsonField<Thread> = JsonMissing.of(),
        @JsonProperty("user_message")
        @ExcludeMissing
        userMessage: JsonField<Message> = JsonMissing.of(),
    ) : this(run, thread, userMessage, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun run(): Run = run.getRequired("run")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun thread(): Thread = thread.getRequired("thread")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userMessage(): Message = userMessage.getRequired("user_message")

    /**
     * Returns the raw JSON value of [run].
     *
     * Unlike [run], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run") @ExcludeMissing fun _run(): JsonField<Run> = run

    /**
     * Returns the raw JSON value of [thread].
     *
     * Unlike [thread], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread") @ExcludeMissing fun _thread(): JsonField<Thread> = thread

    /**
     * Returns the raw JSON value of [userMessage].
     *
     * Unlike [userMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_message")
    @ExcludeMissing
    fun _userMessage(): JsonField<Message> = userMessage

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
         * Returns a mutable builder for constructing an instance of [StartRunResponse].
         *
         * The following fields are required:
         * ```java
         * .run()
         * .thread()
         * .userMessage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StartRunResponse]. */
    class Builder internal constructor() {

        private var run: JsonField<Run>? = null
        private var thread: JsonField<Thread>? = null
        private var userMessage: JsonField<Message>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(startRunResponse: StartRunResponse) = apply {
            run = startRunResponse.run
            thread = startRunResponse.thread
            userMessage = startRunResponse.userMessage
            additionalProperties = startRunResponse.additionalProperties.toMutableMap()
        }

        fun run(run: Run) = run(JsonField.of(run))

        /**
         * Sets [Builder.run] to an arbitrary JSON value.
         *
         * You should usually call [Builder.run] with a well-typed [Run] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun run(run: JsonField<Run>) = apply { this.run = run }

        fun thread(thread: Thread) = thread(JsonField.of(thread))

        /**
         * Sets [Builder.thread] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thread] with a well-typed [Thread] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun thread(thread: JsonField<Thread>) = apply { this.thread = thread }

        fun userMessage(userMessage: Message) = userMessage(JsonField.of(userMessage))

        /**
         * Sets [Builder.userMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userMessage] with a well-typed [Message] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userMessage(userMessage: JsonField<Message>) = apply { this.userMessage = userMessage }

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
         * Returns an immutable instance of [StartRunResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .run()
         * .thread()
         * .userMessage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StartRunResponse =
            StartRunResponse(
                checkRequired("run", run),
                checkRequired("thread", thread),
                checkRequired("userMessage", userMessage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StartRunResponse = apply {
        if (validated) {
            return@apply
        }

        run().validate()
        thread().validate()
        userMessage().validate()
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
        (run.asKnown().getOrNull()?.validity() ?: 0) +
            (thread.asKnown().getOrNull()?.validity() ?: 0) +
            (userMessage.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StartRunResponse &&
            run == other.run &&
            thread == other.thread &&
            userMessage == other.userMessage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(run, thread, userMessage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StartRunResponse{run=$run, thread=$thread, userMessage=$userMessage, additionalProperties=$additionalProperties}"
}
