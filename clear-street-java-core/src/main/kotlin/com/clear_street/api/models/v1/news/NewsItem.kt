// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.news

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A single news item and its associated instruments. */
class NewsItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instruments: JsonField<List<NewsInstrument>>,
    private val newsType: JsonField<NewsType>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val publisher: JsonField<String>,
    private val title: JsonField<String>,
    private val url: JsonField<String>,
    private val imageUrl: JsonField<String>,
    private val site: JsonField<String>,
    private val text: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instruments")
        @ExcludeMissing
        instruments: JsonField<List<NewsInstrument>> = JsonMissing.of(),
        @JsonProperty("news_type") @ExcludeMissing newsType: JsonField<NewsType> = JsonMissing.of(),
        @JsonProperty("published_at")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("publisher") @ExcludeMissing publisher: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("image_url") @ExcludeMissing imageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("site") @ExcludeMissing site: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
    ) : this(
        instruments,
        newsType,
        publishedAt,
        publisher,
        title,
        url,
        imageUrl,
        site,
        text,
        mutableMapOf(),
    )

    /**
     * Instruments associated with this news item.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instruments(): List<NewsInstrument> = instruments.getRequired("instruments")

    /**
     * Classification of the item.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun newsType(): NewsType = newsType.getRequired("news_type")

    /**
     * The published date/time of the article in UTC.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publishedAt(): OffsetDateTime = publishedAt.getRequired("published_at")

    /**
     * The publisher or newswire source.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publisher(): String = publisher.getRequired("publisher")

    /**
     * The headline/title of the article.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * Canonical URL to the full article.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * URL of an associated image if provided by the source.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imageUrl(): Optional<String> = imageUrl.getOptional("image_url")

    /**
     * The primary domain/site of the publisher.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun site(): Optional<String> = site.getOptional("site")

    /**
     * The full or excerpted article body.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * Returns the raw JSON value of [instruments].
     *
     * Unlike [instruments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instruments")
    @ExcludeMissing
    fun _instruments(): JsonField<List<NewsInstrument>> = instruments

    /**
     * Returns the raw JSON value of [newsType].
     *
     * Unlike [newsType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("news_type") @ExcludeMissing fun _newsType(): JsonField<NewsType> = newsType

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published_at")
    @ExcludeMissing
    fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

    /**
     * Returns the raw JSON value of [publisher].
     *
     * Unlike [publisher], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publisher") @ExcludeMissing fun _publisher(): JsonField<String> = publisher

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [imageUrl].
     *
     * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image_url") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

    /**
     * Returns the raw JSON value of [site].
     *
     * Unlike [site], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("site") @ExcludeMissing fun _site(): JsonField<String> = site

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
         * Returns a mutable builder for constructing an instance of [NewsItem].
         *
         * The following fields are required:
         * ```java
         * .instruments()
         * .newsType()
         * .publishedAt()
         * .publisher()
         * .title()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NewsItem]. */
    class Builder internal constructor() {

        private var instruments: JsonField<MutableList<NewsInstrument>>? = null
        private var newsType: JsonField<NewsType>? = null
        private var publishedAt: JsonField<OffsetDateTime>? = null
        private var publisher: JsonField<String>? = null
        private var title: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var imageUrl: JsonField<String> = JsonMissing.of()
        private var site: JsonField<String> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(newsItem: NewsItem) = apply {
            instruments = newsItem.instruments.map { it.toMutableList() }
            newsType = newsItem.newsType
            publishedAt = newsItem.publishedAt
            publisher = newsItem.publisher
            title = newsItem.title
            url = newsItem.url
            imageUrl = newsItem.imageUrl
            site = newsItem.site
            text = newsItem.text
            additionalProperties = newsItem.additionalProperties.toMutableMap()
        }

        /** Instruments associated with this news item. */
        fun instruments(instruments: List<NewsInstrument>) = instruments(JsonField.of(instruments))

        /**
         * Sets [Builder.instruments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instruments] with a well-typed `List<NewsInstrument>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun instruments(instruments: JsonField<List<NewsInstrument>>) = apply {
            this.instruments = instruments.map { it.toMutableList() }
        }

        /**
         * Adds a single [NewsInstrument] to [instruments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstrument(instrument: NewsInstrument) = apply {
            instruments =
                (instruments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("instruments", it).add(instrument)
                }
        }

        /** Classification of the item. */
        fun newsType(newsType: NewsType) = newsType(JsonField.of(newsType))

        /**
         * Sets [Builder.newsType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newsType] with a well-typed [NewsType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun newsType(newsType: JsonField<NewsType>) = apply { this.newsType = newsType }

        /** The published date/time of the article in UTC. */
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

        /** The publisher or newswire source. */
        fun publisher(publisher: String) = publisher(JsonField.of(publisher))

        /**
         * Sets [Builder.publisher] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publisher] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publisher(publisher: JsonField<String>) = apply { this.publisher = publisher }

        /** The headline/title of the article. */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Canonical URL to the full article. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** URL of an associated image if provided by the source. */
        fun imageUrl(imageUrl: String?) = imageUrl(JsonField.ofNullable(imageUrl))

        /** Alias for calling [Builder.imageUrl] with `imageUrl.orElse(null)`. */
        fun imageUrl(imageUrl: Optional<String>) = imageUrl(imageUrl.getOrNull())

        /**
         * Sets [Builder.imageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

        /** The primary domain/site of the publisher. */
        fun site(site: String?) = site(JsonField.ofNullable(site))

        /** Alias for calling [Builder.site] with `site.orElse(null)`. */
        fun site(site: Optional<String>) = site(site.getOrNull())

        /**
         * Sets [Builder.site] to an arbitrary JSON value.
         *
         * You should usually call [Builder.site] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun site(site: JsonField<String>) = apply { this.site = site }

        /** The full or excerpted article body. */
        fun text(text: String?) = text(JsonField.ofNullable(text))

        /** Alias for calling [Builder.text] with `text.orElse(null)`. */
        fun text(text: Optional<String>) = text(text.getOrNull())

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

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
         * Returns an immutable instance of [NewsItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instruments()
         * .newsType()
         * .publishedAt()
         * .publisher()
         * .title()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewsItem =
            NewsItem(
                checkRequired("instruments", instruments).map { it.toImmutable() },
                checkRequired("newsType", newsType),
                checkRequired("publishedAt", publishedAt),
                checkRequired("publisher", publisher),
                checkRequired("title", title),
                checkRequired("url", url),
                imageUrl,
                site,
                text,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewsItem = apply {
        if (validated) {
            return@apply
        }

        instruments().forEach { it.validate() }
        newsType().validate()
        publishedAt()
        publisher()
        title()
        url()
        imageUrl()
        site()
        text()
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
        (instruments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (newsType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0) +
            (if (publisher.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (imageUrl.asKnown().isPresent) 1 else 0) +
            (if (site.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NewsItem &&
            instruments == other.instruments &&
            newsType == other.newsType &&
            publishedAt == other.publishedAt &&
            publisher == other.publisher &&
            title == other.title &&
            url == other.url &&
            imageUrl == other.imageUrl &&
            site == other.site &&
            text == other.text &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            instruments,
            newsType,
            publishedAt,
            publisher,
            title,
            url,
            imageUrl,
            site,
            text,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewsItem{instruments=$instruments, newsType=$newsType, publishedAt=$publishedAt, publisher=$publisher, title=$title, url=$url, imageUrl=$imageUrl, site=$site, text=$text, additionalProperties=$additionalProperties}"
}
