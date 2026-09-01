// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omnifeed

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OmniFeedPostFeedEventParamsTest {

    @Test
    fun create() {
        OmniFeedPostFeedEventParams.builder()
            .event(
                OmniFeedPostFeedEventParams.Event.builder()
                    .itemId("0198f3a2-4b3d-7c1e-9f2a-3b4c5d6e7f80")
                    .type(OmniFeedPostFeedEventParams.Event.Type.SEEN)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OmniFeedPostFeedEventParams.builder()
                .event(
                    OmniFeedPostFeedEventParams.Event.builder()
                        .itemId("0198f3a2-4b3d-7c1e-9f2a-3b4c5d6e7f80")
                        .type(OmniFeedPostFeedEventParams.Event.Type.SEEN)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.event())
            .isEqualTo(
                OmniFeedPostFeedEventParams.Event.builder()
                    .itemId("0198f3a2-4b3d-7c1e-9f2a-3b4c5d6e7f80")
                    .type(OmniFeedPostFeedEventParams.Event.Type.SEEN)
                    .build()
            )
    }
}
