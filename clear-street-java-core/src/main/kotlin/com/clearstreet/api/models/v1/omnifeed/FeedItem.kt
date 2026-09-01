// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omnifeed

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** One item in the caller's feed. */
class FeedItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val headline: JsonField<String>,
    private val kind: JsonField<FeedItemKind>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val summary: JsonField<String>,
    private val metric: JsonField<FeedItemMetric>,
    private val occursAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headline") @ExcludeMissing headline: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<FeedItemKind> = JsonMissing.of(),
        @JsonProperty("published_at")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metric")
        @ExcludeMissing
        metric: JsonField<FeedItemMetric> = JsonMissing.of(),
        @JsonProperty("occurs_at")
        @ExcludeMissing
        occursAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, headline, kind, publishedAt, summary, metric, occursAt, mutableMapOf())

    /**
     * Unique item id. Also the pagination cursor: pass it as `cursor` to fetch the items that
     * follow it.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Headline text.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun headline(): String = headline.getRequired("headline")

    /**
     * What the item is about.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): FeedItemKind = kind.getRequired("kind")

    /**
     * When the item's content was published.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publishedAt(): OffsetDateTime = publishedAt.getRequired("published_at")

    /**
     * Summary text.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun summary(): String = summary.getRequired("summary")

    /**
     * The item's headline number. When a null/undefined value is observed, it indicates that there
     * is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metric(): Optional<FeedItemMetric> = metric.getOptional("metric")

    /**
     * When the underlying event is expected to occur, for items about an upcoming event. When a
     * null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun occursAt(): Optional<OffsetDateTime> = occursAt.getOptional("occurs_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [headline].
     *
     * Unlike [headline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headline") @ExcludeMissing fun _headline(): JsonField<String> = headline

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<FeedItemKind> = kind

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published_at")
    @ExcludeMissing
    fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

    /**
     * Returns the raw JSON value of [metric].
     *
     * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<FeedItemMetric> = metric

    /**
     * Returns the raw JSON value of [occursAt].
     *
     * Unlike [occursAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occurs_at") @ExcludeMissing fun _occursAt(): JsonField<OffsetDateTime> = occursAt

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
         * Returns a mutable builder for constructing an instance of [FeedItem].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .headline()
         * .kind()
         * .publishedAt()
         * .summary()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var headline: JsonField<String>? = null
        private var kind: JsonField<FeedItemKind>? = null
        private var publishedAt: JsonField<OffsetDateTime>? = null
        private var summary: JsonField<String>? = null
        private var metric: JsonField<FeedItemMetric> = JsonMissing.of()
        private var occursAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedItem: FeedItem) = apply {
            id = feedItem.id
            headline = feedItem.headline
            kind = feedItem.kind
            publishedAt = feedItem.publishedAt
            summary = feedItem.summary
            metric = feedItem.metric
            occursAt = feedItem.occursAt
            additionalProperties = feedItem.additionalProperties.toMutableMap()
        }

        /**
         * Unique item id. Also the pagination cursor: pass it as `cursor` to fetch the items that
         * follow it.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Headline text. */
        fun headline(headline: String) = headline(JsonField.of(headline))

        /**
         * Sets [Builder.headline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headline] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headline(headline: JsonField<String>) = apply { this.headline = headline }

        /** What the item is about. */
        fun kind(kind: FeedItemKind) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [FeedItemKind] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kind(kind: JsonField<FeedItemKind>) = apply { this.kind = kind }

        /** When the item's content was published. */
        fun publishedAt(publishedAt: OffsetDateTime) = publishedAt(JsonField.of(publishedAt))

        /**
         * Sets [Builder.publishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishedAt(publishedAt: JsonField<OffsetDateTime>) = apply {
            this.publishedAt = publishedAt
        }

        /** Summary text. */
        fun summary(summary: String) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

        /**
         * The item's headline number. When a null/undefined value is observed, it indicates that
         * there is no available data.
         */
        fun metric(metric: FeedItemMetric?) = metric(JsonField.ofNullable(metric))

        /** Alias for calling [Builder.metric] with `metric.orElse(null)`. */
        fun metric(metric: Optional<FeedItemMetric>) = metric(metric.getOrNull())

        /**
         * Sets [Builder.metric] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metric] with a well-typed [FeedItemMetric] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metric(metric: JsonField<FeedItemMetric>) = apply { this.metric = metric }

        /**
         * When the underlying event is expected to occur, for items about an upcoming event. When a
         * null/undefined value is observed, it indicates it does not apply.
         */
        fun occursAt(occursAt: OffsetDateTime?) = occursAt(JsonField.ofNullable(occursAt))

        /** Alias for calling [Builder.occursAt] with `occursAt.orElse(null)`. */
        fun occursAt(occursAt: Optional<OffsetDateTime>) = occursAt(occursAt.getOrNull())

        /**
         * Sets [Builder.occursAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occursAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occursAt(occursAt: JsonField<OffsetDateTime>) = apply { this.occursAt = occursAt }

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
         * Returns an immutable instance of [FeedItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .headline()
         * .kind()
         * .publishedAt()
         * .summary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedItem =
            FeedItem(
                checkRequired("id", id),
                checkRequired("headline", headline),
                checkRequired("kind", kind),
                checkRequired("publishedAt", publishedAt),
                checkRequired("summary", summary),
                metric,
                occursAt,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): FeedItem = apply {
        if (validated) {
            return@apply
        }

        id()
        headline()
        kind().validate()
        publishedAt()
        summary()
        metric().ifPresent { it.validate() }
        occursAt()
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
            (if (headline.asKnown().isPresent) 1 else 0) +
            (kind.asKnown().getOrNull()?.validity() ?: 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (metric.asKnown().getOrNull()?.validity() ?: 0) +
            (if (occursAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedItem &&
            id == other.id &&
            headline == other.headline &&
            kind == other.kind &&
            publishedAt == other.publishedAt &&
            summary == other.summary &&
            metric == other.metric &&
            occursAt == other.occursAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            headline,
            kind,
            publishedAt,
            summary,
            metric,
            occursAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FeedItem{id=$id, headline=$headline, kind=$kind, publishedAt=$publishedAt, summary=$summary, metric=$metric, occursAt=$occursAt, additionalProperties=$additionalProperties}"
}
