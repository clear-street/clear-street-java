// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MergersAcquisitionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMergersAndAcquisitionsCalendar() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val mergersAcquisitionService = client.active().v1().calendars().mergersAcquisitions()

        val response =
            mergersAcquisitionService.getMergersAndAcquisitionsCalendar(
                MergersAcquisitionGetMergersAndAcquisitionsCalendarParams.builder()
                    .from(LocalDate.parse("2019-12-27"))
                    .to(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }
}
