// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.accounts.exercises.ExerciseAction
import com.clear_street.api.models.v1.accounts.exercises.ExerciseCancelExerciseParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseGetExercisesParams
import com.clear_street.api.models.v1.accounts.exercises.ExerciseSubmitExercisesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExerciseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelExercise() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val exerciseService = client.v1().accounts().exercises()

        val response =
            exerciseService.cancelExercise(
                ExerciseCancelExerciseParams.builder()
                    .accountId(0L)
                    .exerciseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getExercises() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val exerciseService = client.v1().accounts().exercises()

        val response =
            exerciseService.getExercises(
                ExerciseGetExercisesParams.builder()
                    .accountId(0L)
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitExercises() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val exerciseService = client.v1().accounts().exercises()

        val response =
            exerciseService.submitExercises(
                ExerciseSubmitExercisesParams.builder()
                    .accountId(0L)
                    .addExercise(
                        ExerciseSubmitExercisesParams.Exercise.builder()
                            .action(ExerciseAction.EXERCISE)
                            .instrumentId("0195f6d0-a1b2-7c3d-8e4f-5a6b7c8d9e02")
                            .quantity("1")
                            .clientExerciseId("ui-20260424-001")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
