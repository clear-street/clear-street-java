// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateGetLocateByIdParamsTest {

    @Test
    fun create() {
        LocateGetLocateByIdParams.builder().accountId(0L).id("id").build()
    }

    @Test
    fun pathParams() {
        val params = LocateGetLocateByIdParams.builder().accountId(0L).id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
