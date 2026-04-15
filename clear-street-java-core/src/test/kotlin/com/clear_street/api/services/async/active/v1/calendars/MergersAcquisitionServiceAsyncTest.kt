// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MergersAcquisitionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMergersAndAcquisitionsCalendar() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mergersAcquisitionServiceAsync = client.active().v1().calendars().mergersAcquisitions()

        val responseFuture =
            mergersAcquisitionServiceAsync.getMergersAndAcquisitionsCalendar(
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.builder()
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
