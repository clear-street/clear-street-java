// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.options

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.v1.instruments.ContractType
import com.clear_street.api.models.v1.instruments.ExerciseStyle
import com.clear_street.api.models.v1.instruments.ListingType
import com.clear_street.api.models.v1.instruments.OptionsContract
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionGetOptionContractsResponseTest {

    @Test
    fun create() {
        val optionGetOptionContractsResponse =
            OptionGetOptionContractsResponse.builder()
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
                    OptionsContract.builder()
                        .id("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                        .contractType(ContractType.CALL)
                        .currency("USD")
                        .exchange("BATO")
                        .exerciseStyle(ExerciseStyle.AMERICAN)
                        .expiry(LocalDate.parse("2026-03-18"))
                        .isLiquidationOnly(true)
                        .isMarginable(true)
                        .isRestricted(true)
                        .listingType(ListingType.STANDARD)
                        .multiplier("100")
                        .strikePrice("150.00")
                        .symbol("AAPL  251219C00150000")
                        .openInterest(0L)
                        .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(optionGetOptionContractsResponse.metadata())
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
        assertThat(optionGetOptionContractsResponse.error())
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
        assertThat(optionGetOptionContractsResponse.data())
            .containsExactly(
                OptionsContract.builder()
                    .id("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                    .contractType(ContractType.CALL)
                    .currency("USD")
                    .exchange("BATO")
                    .exerciseStyle(ExerciseStyle.AMERICAN)
                    .expiry(LocalDate.parse("2026-03-18"))
                    .isLiquidationOnly(true)
                    .isMarginable(true)
                    .isRestricted(true)
                    .listingType(ListingType.STANDARD)
                    .multiplier("100")
                    .strikePrice("150.00")
                    .symbol("AAPL  251219C00150000")
                    .openInterest(0L)
                    .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optionGetOptionContractsResponse =
            OptionGetOptionContractsResponse.builder()
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
                    OptionsContract.builder()
                        .id("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                        .contractType(ContractType.CALL)
                        .currency("USD")
                        .exchange("BATO")
                        .exerciseStyle(ExerciseStyle.AMERICAN)
                        .expiry(LocalDate.parse("2026-03-18"))
                        .isLiquidationOnly(true)
                        .isMarginable(true)
                        .isRestricted(true)
                        .listingType(ListingType.STANDARD)
                        .multiplier("100")
                        .strikePrice("150.00")
                        .symbol("AAPL  251219C00150000")
                        .openInterest(0L)
                        .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedOptionGetOptionContractsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optionGetOptionContractsResponse),
                jacksonTypeRef<OptionGetOptionContractsResponse>(),
            )

        assertThat(roundtrippedOptionGetOptionContractsResponse)
            .isEqualTo(optionGetOptionContractsResponse)
    }
}
