// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.positions

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionGetPositionsResponseTest {

    @Test
    fun create() {
        val positionGetPositionsResponse =
            PositionGetPositionsResponse.builder()
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
                    Position.builder()
                        .accountId(19816L)
                        .availableQuantity("100")
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .marketValue("15050.00")
                        .positionType(PositionType.LONG)
                        .quantity("100")
                        .securityId("AAPL")
                        .securityIdSource(SecurityIdSource.CMS)
                        .symbol("AAPL")
                        .avgPrice("145.00")
                        .closingPrice("150.50")
                        .costBasis("14500.00")
                        .dailyUnrealizedPnl("550.00")
                        .dailyUnrealizedPnlPct("3.65")
                        .marketPrice("151.00")
                        .underlierInstrumentId("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                        .unrealizedPnl("550.00")
                        .unrealizedPnlPct("3.79")
                        .build()
                )
                .build()

        assertThat(positionGetPositionsResponse.metadata())
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
        assertThat(positionGetPositionsResponse.error())
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
        assertThat(positionGetPositionsResponse.data())
            .containsExactly(
                Position.builder()
                    .accountId(19816L)
                    .availableQuantity("100")
                    .instrumentType(SecurityType.COMMON_STOCK)
                    .marketValue("15050.00")
                    .positionType(PositionType.LONG)
                    .quantity("100")
                    .securityId("AAPL")
                    .securityIdSource(SecurityIdSource.CMS)
                    .symbol("AAPL")
                    .avgPrice("145.00")
                    .closingPrice("150.50")
                    .costBasis("14500.00")
                    .dailyUnrealizedPnl("550.00")
                    .dailyUnrealizedPnlPct("3.65")
                    .marketPrice("151.00")
                    .underlierInstrumentId("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                    .unrealizedPnl("550.00")
                    .unrealizedPnlPct("3.79")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val positionGetPositionsResponse =
            PositionGetPositionsResponse.builder()
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
                    Position.builder()
                        .accountId(19816L)
                        .availableQuantity("100")
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .marketValue("15050.00")
                        .positionType(PositionType.LONG)
                        .quantity("100")
                        .securityId("AAPL")
                        .securityIdSource(SecurityIdSource.CMS)
                        .symbol("AAPL")
                        .avgPrice("145.00")
                        .closingPrice("150.50")
                        .costBasis("14500.00")
                        .dailyUnrealizedPnl("550.00")
                        .dailyUnrealizedPnlPct("3.65")
                        .marketPrice("151.00")
                        .underlierInstrumentId("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                        .unrealizedPnl("550.00")
                        .unrealizedPnlPct("3.79")
                        .build()
                )
                .build()

        val roundtrippedPositionGetPositionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(positionGetPositionsResponse),
                jacksonTypeRef<PositionGetPositionsResponse>(),
            )

        assertThat(roundtrippedPositionGetPositionsResponse).isEqualTo(positionGetPositionsResponse)
    }
}
