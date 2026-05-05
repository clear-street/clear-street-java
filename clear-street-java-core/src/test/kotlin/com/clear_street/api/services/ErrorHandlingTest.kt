// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services

import com.clear_street.api.client.ClearStreetClient
import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.BadRequestException
import com.clear_street.api.errors.ClearStreetException
import com.clear_street.api.errors.InternalServerException
import com.clear_street.api.errors.NotFoundException
import com.clear_street.api.errors.PermissionDeniedException
import com.clear_street.api.errors.RateLimitException
import com.clear_street.api.errors.UnauthorizedException
import com.clear_street.api.errors.UnexpectedStatusCodeException
import com.clear_street.api.errors.UnprocessableEntityException
import com.clear_street.api.models.v1.accounts.AccountGetAccountsParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: ClearStreetClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun accountsGetAccounts400() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts400WithRawResponse() {
        val accountService = client.v1().accounts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts401() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts401WithRawResponse() {
        val accountService = client.v1().accounts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts403() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts403WithRawResponse() {
        val accountService = client.v1().accounts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts404() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts404WithRawResponse() {
        val accountService = client.v1().accounts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts422() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts422WithRawResponse() {
        val accountService = client.v1().accounts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts429() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts429WithRawResponse() {
        val accountService = client.v1().accounts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts500() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts500WithRawResponse() {
        val accountService = client.v1().accounts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts999() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccounts999WithRawResponse() {
        val accountService = client.v1().accounts().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsGetAccountsInvalidJsonBody() {
        val accountService = client.v1().accounts()
        stubFor(
            get(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<ClearStreetException> {
                accountService.getAccounts(
                    AccountGetAccountsParams.builder()
                        .pageSize(1L)
                        .pageToken("U3RhaW5sZXNzIHJvY2tz")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
