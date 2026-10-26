// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderPreviewErrorTest {

    @Test
    fun create() {
        val orderPreviewError =
            OrderPreviewError.builder()
                .description("Insufficient buying power")
                .metadata(
                    OrderPreviewError.Metadata.builder()
                        .putAdditionalProperty("available", JsonValue.from("5000"))
                        .putAdditionalProperty("required_total", JsonValue.from("10000"))
                        .build()
                )
                .type("BUYING_POWER")
                .build()

        assertThat(orderPreviewError.description()).isEqualTo("Insufficient buying power")
        assertThat(orderPreviewError.metadata())
            .isEqualTo(
                OrderPreviewError.Metadata.builder()
                    .putAdditionalProperty("available", JsonValue.from("5000"))
                    .putAdditionalProperty("required_total", JsonValue.from("10000"))
                    .build()
            )
        assertThat(orderPreviewError.type()).isEqualTo("BUYING_POWER")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreviewError =
            OrderPreviewError.builder()
                .description("Insufficient buying power")
                .metadata(
                    OrderPreviewError.Metadata.builder()
                        .putAdditionalProperty("available", JsonValue.from("5000"))
                        .putAdditionalProperty("required_total", JsonValue.from("10000"))
                        .build()
                )
                .type("BUYING_POWER")
                .build()

        val roundtrippedOrderPreviewError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreviewError),
                jacksonTypeRef<OrderPreviewError>(),
            )

        assertThat(roundtrippedOrderPreviewError).isEqualTo(orderPreviewError)
    }
}
