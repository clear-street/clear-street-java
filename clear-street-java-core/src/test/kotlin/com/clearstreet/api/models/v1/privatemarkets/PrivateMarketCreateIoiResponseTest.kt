// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.clearstreet.api.models.v1.privatemarkets.iois.IoiCompanyResource
import com.clearstreet.api.models.v1.privatemarkets.iois.IoiListingResource
import com.clearstreet.api.models.v1.privatemarkets.iois.IoiOfferingResource
import com.clearstreet.api.models.v1.privatemarkets.iois.NdaAcceptanceResource
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateMarketCreateIoiResponseTest {

    @Test
    fun create() {
        val privateMarketCreateIoiResponse =
            PrivateMarketCreateIoiResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
                    IoiListingResource.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.USD)
                        .notionalAmount("100000.00")
                        .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ndaAcceptance(
                            NdaAcceptanceResource.builder()
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .version(0)
                                .build()
                        )
                        .company(
                            IoiCompanyResource.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .offering(
                            IoiOfferingResource.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .headline("headline")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(privateMarketCreateIoiResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(1)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(42L)
                    .totalPages(5)
                    .build()
            )
        assertThat(privateMarketCreateIoiResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(privateMarketCreateIoiResponse.data())
            .isEqualTo(
                IoiListingResource.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.USD)
                    .notionalAmount("100000.00")
                    .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ndaAcceptance(
                        NdaAcceptanceResource.builder()
                            .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .version(0)
                            .build()
                    )
                    .company(
                        IoiCompanyResource.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .offering(
                        IoiOfferingResource.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .headline("headline")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privateMarketCreateIoiResponse =
            PrivateMarketCreateIoiResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
                    IoiListingResource.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.USD)
                        .notionalAmount("100000.00")
                        .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ndaAcceptance(
                            NdaAcceptanceResource.builder()
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .version(0)
                                .build()
                        )
                        .company(
                            IoiCompanyResource.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .offering(
                            IoiOfferingResource.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .headline("headline")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPrivateMarketCreateIoiResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privateMarketCreateIoiResponse),
                jacksonTypeRef<PrivateMarketCreateIoiResponse>(),
            )

        assertThat(roundtrippedPrivateMarketCreateIoiResponse)
            .isEqualTo(privateMarketCreateIoiResponse)
    }
}
