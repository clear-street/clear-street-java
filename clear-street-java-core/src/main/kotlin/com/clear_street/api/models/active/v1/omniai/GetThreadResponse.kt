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

class GetThreadResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val thread: JsonField<Thread>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("thread") @ExcludeMissing thread: JsonField<Thread> = JsonMissing.of()
    ) : this(thread, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun thread(): Thread = thread.getRequired("thread")

    /**
     * Returns the raw JSON value of [thread].
     *
     * Unlike [thread], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread") @ExcludeMissing fun _thread(): JsonField<Thread> = thread

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
         * Returns a mutable builder for constructing an instance of [GetThreadResponse].
         *
         * The following fields are required:
         * ```java
         * .thread()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GetThreadResponse]. */
    class Builder internal constructor() {

        private var thread: JsonField<Thread>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(getThreadResponse: GetThreadResponse) = apply {
            thread = getThreadResponse.thread
            additionalProperties = getThreadResponse.additionalProperties.toMutableMap()
        }

        fun thread(thread: Thread) = thread(JsonField.of(thread))

        /**
         * Sets [Builder.thread] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thread] with a well-typed [Thread] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun thread(thread: JsonField<Thread>) = apply { this.thread = thread }

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
         * Returns an immutable instance of [GetThreadResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .thread()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GetThreadResponse =
            GetThreadResponse(checkRequired("thread", thread), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): GetThreadResponse = apply {
        if (validated) {
            return@apply
        }

        thread().validate()
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
    @JvmSynthetic internal fun validity(): Int = (thread.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GetThreadResponse &&
            thread == other.thread &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(thread, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GetThreadResponse{thread=$thread, additionalProperties=$additionalProperties}"
}
