// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.alerts

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertGetAlertsResponseTest {

    @Test
    fun create() {
        val alertGetAlertsResponse =
            AlertGetAlertsResponse.builder()
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
                    Alert.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .condition(JsonValue.from(mapOf<String, Any>()))
                        .createdAt("created_at")
                        .schedule(Schedule.EVERY_1M)
                        .source(AlertSource.API)
                        .status(AlertStatus.ACTIVE)
                        .trigger(TriggerMode.ONCE)
                        .accountId(0L)
                        .expiresAt("expires_at")
                        .omniText("omni_text")
                        .triggeredAt("triggered_at")
                        .build()
                )
                .build()

        assertThat(alertGetAlertsResponse.metadata())
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
        assertThat(alertGetAlertsResponse.error())
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
        assertThat(alertGetAlertsResponse.data())
            .containsExactly(
                Alert.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .condition(JsonValue.from(mapOf<String, Any>()))
                    .createdAt("created_at")
                    .schedule(Schedule.EVERY_1M)
                    .source(AlertSource.API)
                    .status(AlertStatus.ACTIVE)
                    .trigger(TriggerMode.ONCE)
                    .accountId(0L)
                    .expiresAt("expires_at")
                    .omniText("omni_text")
                    .triggeredAt("triggered_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alertGetAlertsResponse =
            AlertGetAlertsResponse.builder()
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
                    Alert.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .condition(JsonValue.from(mapOf<String, Any>()))
                        .createdAt("created_at")
                        .schedule(Schedule.EVERY_1M)
                        .source(AlertSource.API)
                        .status(AlertStatus.ACTIVE)
                        .trigger(TriggerMode.ONCE)
                        .accountId(0L)
                        .expiresAt("expires_at")
                        .omniText("omni_text")
                        .triggeredAt("triggered_at")
                        .build()
                )
                .build()

        val roundtrippedAlertGetAlertsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alertGetAlertsResponse),
                jacksonTypeRef<AlertGetAlertsResponse>(),
            )

        assertThat(roundtrippedAlertGetAlertsResponse).isEqualTo(alertGetAlertsResponse)
    }
}
