package com.example.quizapp2

object setData3 {
    const val dataNo:String="3"
    const val name:String="Happiness Test"
    const val score:String="score"

//Psychosis Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "I feel that life is very rewarding.",

            "Always",
            "often",
            "Some times",
            "Never",
            1

        )
        var question2 = QuestionData(
            2,
            "I am able to find the goodness in myself and others.",

            "Always",
            "often",
            "Some times",
            "Never",
            1
        )
        var question3 = QuestionData(
            3,
            "I am optimistic about the future.",

            "Always",
            "often",
            "Some times",
            "Never",
            2
        )
        var question4 = QuestionData(
            4,
            "I take pleasure in everyday activities.",

            "Always",
            "often",
            "Some times",
            "Never",
            3
        )

        var question5 = QuestionData(
            5,
            "I feel joy from moment to moment.",

            "Always",
            "often",
            "Some times",
            "Never",
            4
        )
        var question6 = QuestionData(
            6,
            "I have a sense of meaning and purpose in my life.",

            "Always",
            "often",
            "Some times",
            "Never",
            4
        )
        var question7 = QuestionData(
            7,
            "I have a lot of energy.",

            "Always",
            "often",
            "Some times",
            "Never",
            1
        )
        var question8 = QuestionData(
            8,
            "I feel best when I'm giving to others.",

            "Always",
            "often",
            "Some times",
            "Never",
            1
        )
        var question9 = QuestionData(
            9,
            "I can find the good, even in a difficult situation.",

            "Always",
            "often",
            "Some times",
            "Never",
            1
        )
        var question10 = QuestionData(
            10,
            "I welcome and accept my feelings throughout any given day.",

            "Always",
            "often",
            "Some times",
            "Never",
            1
        )
        var question11 = QuestionData(
            11,
            "I actively keep in touch with friends and family.",

            "Always",
            "often",
            "Some times",
            "Never",
            1

        )
        var question12 = QuestionData(
            12,
            "When things are tough, I reach out for support.",

            "Always",
            "often",
            "Some times",
            "Never",
            1
        )
        var question13 = QuestionData(
            13,
            "I feel grateful for what I have.",

            "Always",
            "often",
            "Some times",
            "Never",
            2
        )
        var question14 = QuestionData(
            14,
            "I let go of past disappointments or hurts.",

            "Always",
            "often",
            "Some times",
            "Never",
            3
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


        return que
    }
}