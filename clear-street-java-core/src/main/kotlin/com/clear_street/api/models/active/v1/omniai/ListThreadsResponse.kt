// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ListThreadsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val threads: JsonField<List<Thread>>,
    private val nextPageToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("threads")
        @ExcludeMissing
        threads: JsonField<List<Thread>> = JsonMissing.of(),
        @JsonProperty("next_page_token")
        @ExcludeMissing
        nextPageToken: JsonField<String> = JsonMissing.of(),
    ) : this(threads, nextPageToken, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun threads(): List<Thread> = threads.getRequired("threads")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPageToken(): Optional<String> = nextPageToken.getOptional("next_page_token")

    /**
     * Returns the raw JSON value of [threads].
     *
     * Unlike [threads], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("threads") @ExcludeMissing fun _threads(): JsonField<List<Thread>> = threads

    /**
     * Returns the raw JSON value of [nextPageToken].
     *
     * Unlike [nextPageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page_token")
    @ExcludeMissing
    fun _nextPageToken(): JsonField<String> = nextPageToken

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
         * Returns a mutable builder for constructing an instance of [ListThreadsResponse].
         *
         * The following fields are required:
         * ```java
         * .threads()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListThreadsResponse]. */
    class Builder internal constructor() {

        private var threads: JsonField<MutableList<Thread>>? = null
        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listThreadsResponse: ListThreadsResponse) = apply {
            threads = listThreadsResponse.threads.map { it.toMutableList() }
            nextPageToken = listThreadsResponse.nextPageToken
            additionalProperties = listThreadsResponse.additionalProperties.toMutableMap()
        }

        fun threads(threads: List<Thread>) = threads(JsonField.of(threads))

        /**
         * Sets [Builder.threads] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threads] with a well-typed `List<Thread>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun threads(threads: JsonField<List<Thread>>) = apply {
            this.threads = threads.map { it.toMutableList() }
        }

        /**
         * Adds a single [Thread] to [threads].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThread(thread: Thread) = apply {
            threads =
                (threads ?: JsonField.of(mutableListOf())).also {
                    checkKnown("threads", it).add(thread)
                }
        }

        fun nextPageToken(nextPageToken: String?) =
            nextPageToken(JsonField.ofNullable(nextPageToken))

        /** Alias for calling [Builder.nextPageToken] with `nextPageToken.orElse(null)`. */
        fun nextPageToken(nextPageToken: Optional<String>) =
            nextPageToken(nextPageToken.getOrNull())

        /**
         * Sets [Builder.nextPageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPageToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextPageToken(nextPageToken: JsonField<String>) = apply {
            this.nextPageToken = nextPageToken
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
         * Returns an immutable instance of [ListThreadsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .threads()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListThreadsResponse =
            ListThreadsResponse(
                checkRequired("threads", threads).map { it.toImmutable() },
                nextPageToken,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListThreadsResponse = apply {
        if (validated) {
            return@apply
        }

        threads().forEach { it.validate() }
        nextPageToken()
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
        (threads.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextPageToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListThreadsResponse &&
            threads == other.threads &&
            nextPageToken == other.nextPageToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(threads, nextPageToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListThreadsResponse{threads=$threads, nextPageToken=$nextPageToken, additionalProperties=$additionalProperties}"
}
