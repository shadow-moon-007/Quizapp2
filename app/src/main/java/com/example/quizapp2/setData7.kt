package com.example.quizapp2

object setData7 {
    const val dataNo:String="7"
    const val name:String="Panic Disorder Test"
    const val score:String="score"

//Addiction Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Have you ever experienced an abrupt surge of intense fear or discomfort seemingly out of the blue, that lasted several minutes?",

            "Never",
            "Rarely",
            "Sometimes",
            "Yes",
            1

        )
        var question2 = QuestionData(
            2,
            "If yes, have you experienced any of the following symptoms during those minutes? Palpitations, pounding heart, or accelerated heart rate?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question3 = QuestionData(
            3,
            "Sweating?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            2
        )
        var question4 = QuestionData(
            4,
            "Trembling or shaking?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            3
        )
        var question5 = QuestionData(
            5,
            "Shortness of breath or a feeling that you are being smothered?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            4
        )
        var question6 = QuestionData(
            6,
            "Feeling like you are choking?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            4
        )
        var question7 = QuestionData(
            7,
            "Chest pain or discomfort?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question8 = QuestionData(
            8,
            "Nausea or stomach ache?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question9 = QuestionData(
            9,
            "Feeling dizzy, light-headed or faint?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question10 = QuestionData(
            10,
            "Chills or heat sensations?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question11 = QuestionData(
            11,
            "'Pins and needles' (numbness or a tingling sensation)?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question12 = QuestionData(
            12,
            "A feeling that you are crazy or losing control?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question13 = QuestionData(
            13,
            "A sense of being detached from yourself or your surroundings, or observing yourself from outside your body? Or, that things are not real?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question14 = QuestionData(
            14,
            "Worried that you are going to die?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question15 = QuestionData(
            15,
            "For at least one month after you've had this experience, have you worried that you might experience these symptoms again?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question16 = QuestionData(
            16,
            "Taken steps to avoid a repeat attack—for example, avoiding unfamiliar situations?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question17 = QuestionData(
            17,
            "Have you been diagnosed with cardiac arrhythmias, hyperthyroidism, asthma, COPD, or irritable bowel syndrome?",

            "Never",
            "Rarely",
            "Sometimes",
            "Yes",
            1
        )
        var question18 = QuestionData(
            18,
            "Do you have a fear of a certain situation, animal, or object that causes you to experience the panic, sweating, trembling, and/or heart palpitations?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question19 = QuestionData(
            19,
            "Do you experience persistent and excessive worry about a number of different things, so much so that it interferes with your daily life?",

            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )
        var question20 = QuestionData(
            20,
            "Do people tell you you look nervous?",
            "Never",
            "Rarely",
            "Sometimes",
            "Always",
            1
        )




        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)
        que.add(question8)
        que.add(question9)
        que.add(question10)
        que.add(question11)
        que.add(question12)
        que.add(question13)
        que.add(question14)
        que.add(question15)
        que.add(question16)
        que.add(question17)
        que.add(question18)
        que.add(question19)
        que.add(question20)

        return que
    }
}