// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.instrumentdata

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.handlers.jsonHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepare
import com.clearstreet.api.models.v1.instrumentdata.news.NewsGetNewsParams
import com.clearstreet.api.models.v1.instrumentdata.news.NewsGetNewsResponse
import java.util.function.Consumer

/** Retrieve instrument analytics, market data, news, and related reference data. */
class NewsServiceImpl internal constructor(private val clientOptions: ClientOptions) : NewsService {

    private val withRawResponse: NewsService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NewsService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NewsService =
        NewsServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getNews(
        params: NewsGetNewsParams,
        requestOptions: RequestOptions,
    ): NewsGetNewsResponse =
        // get /v1/news
        withRawResponse().getNews(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NewsService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NewsService.WithRawResponse =
            NewsServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getNewsHandler: Handler<NewsGetNewsResponse> =
            jsonHandler<NewsGetNewsResponse>(clientOptions.jsonMapper)

        override fun getNews(
            params: NewsGetNewsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NewsGetNewsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "news")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getNewsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
