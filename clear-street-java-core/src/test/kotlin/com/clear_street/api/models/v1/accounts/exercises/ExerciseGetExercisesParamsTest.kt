// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.exercises

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExerciseGetExercisesParamsTest {

    @Test
    fun create() {
        ExerciseGetExercisesParams.builder()
            .accountId(0L)
            .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ExerciseGetExercisesParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExerciseGetExercisesParams.builder()
                .accountId(0L)
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("instrument_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExerciseGetExercisesParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
