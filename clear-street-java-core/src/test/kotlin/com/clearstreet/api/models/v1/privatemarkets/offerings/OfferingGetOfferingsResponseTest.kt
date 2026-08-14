// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OfferingGetOfferingsResponseTest {

    @Test
    fun create() {
        val offeringGetOfferingsResponse =
            OfferingGetOfferingsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
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
                .addData(
                    OfferingCard.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .class_(OfferingClass.UPCOMING)
                        .company(
                            OfferingCompany.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .shortDescription("short_description")
                                .slug("slug")
                                .logoUrl("logo_url")
                                .primaryDomain("primary_domain")
                                .build()
                        )
                        .currency(Currency.USD)
                        .headline("headline")
                        .summary("summary")
                        .indicativePriceHigh("110")
                        .indicativePriceLow("90")
                        .indicativeValuationBasis(ValuationBasis.PRE_MONEY)
                        .indicativeValuationHigh("indicative_valuation_high")
                        .indicativeValuationLow("indicative_valuation_low")
                        .ioiDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .minimumIoiAmount("25000")
                        .spv(
                            OfferingSpv.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .status(SpvStatus.DRAFT)
                                .custodianName("custodian_name")
                                .managerName("manager_name")
                                .shareClass("share_class")
                                .structureDescription("structure_description")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(offeringGetOfferingsResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(offeringGetOfferingsResponse.error())
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
        assertThat(offeringGetOfferingsResponse.data())
            .containsExactly(
                OfferingCard.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .class_(OfferingClass.UPCOMING)
                    .company(
                        OfferingCompany.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .shortDescription("short_description")
                            .slug("slug")
                            .logoUrl("logo_url")
                            .primaryDomain("primary_domain")
                            .build()
                    )
                    .currency(Currency.USD)
                    .headline("headline")
                    .summary("summary")
                    .indicativePriceHigh("110")
                    .indicativePriceLow("90")
                    .indicativeValuationBasis(ValuationBasis.PRE_MONEY)
                    .indicativeValuationHigh("indicative_valuation_high")
                    .indicativeValuationLow("indicative_valuation_low")
                    .ioiDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .minimumIoiAmount("25000")
                    .spv(
                        OfferingSpv.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .status(SpvStatus.DRAFT)
                            .custodianName("custodian_name")
                            .managerName("manager_name")
                            .shareClass("share_class")
                            .structureDescription("structure_description")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offeringGetOfferingsResponse =
            OfferingGetOfferingsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
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
                .addData(
                    OfferingCard.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .class_(OfferingClass.UPCOMING)
                        .company(
                            OfferingCompany.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .shortDescription("short_description")
                                .slug("slug")
                                .logoUrl("logo_url")
                                .primaryDomain("primary_domain")
                                .build()
                        )
                        .currency(Currency.USD)
                        .headline("headline")
                        .summary("summary")
                        .indicativePriceHigh("110")
                        .indicativePriceLow("90")
                        .indicativeValuationBasis(ValuationBasis.PRE_MONEY)
                        .indicativeValuationHigh("indicative_valuation_high")
                        .indicativeValuationLow("indicative_valuation_low")
                        .ioiDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .minimumIoiAmount("25000")
                        .spv(
                            OfferingSpv.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .status(SpvStatus.DRAFT)
                                .custodianName("custodian_name")
                                .managerName("manager_name")
                                .shareClass("share_class")
                                .structureDescription("structure_description")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedOfferingGetOfferingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offeringGetOfferingsResponse),
                jacksonTypeRef<OfferingGetOfferingsResponse>(),
            )

        assertThat(roundtrippedOfferingGetOfferingsResponse).isEqualTo(offeringGetOfferingsResponse)
    }
}
