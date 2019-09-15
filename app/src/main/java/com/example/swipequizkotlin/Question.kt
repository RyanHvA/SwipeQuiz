package com.example.swipequizkotlin

import java.lang.Boolean.*

data class Question(
    var questions: String,
    var answers: Boolean
) {
    companion object {
        val QUESTIONS = arrayOf(
            "A 'val' and 'var' are the same.",
            "Mobile Application Development grants 12 ECTS.",
            "A Unit in Kotlin corresponds to a void in Java.",
            "In Kotlin 'when' replaces the 'switch' operator in Java."
        )

        // 1 = TRUE | 0 = FALSE
        val QUESTION_ANSWERS = booleanArrayOf(
            FALSE,
            FALSE,
            TRUE,
            TRUE
        )
    }
}
