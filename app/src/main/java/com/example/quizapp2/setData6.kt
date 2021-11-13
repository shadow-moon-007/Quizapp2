package com.example.quizapp2

object setData6 {
    const val dataNo:String="6"
    const val name:String="Sleep Deprivation Test"
    const val score:String="score"

//Addiction Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Do you find that you are moodier than normal?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1

        )
        var question2 = QuestionData(
            2,
            "Do you experience an increase in appetite?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question3 = QuestionData(
            3,
            "Do you struggle to remember details you would normally remember?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            2
        )
        var question4 = QuestionData(
            4,
            "Do you feel sleepy during the day?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            3
        )
        var question5 = QuestionData(
            5,
            "Do you find your sex drive is lower than normal?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            4
        )
        var question6 = QuestionData(
            6,
            "Do you find that you are stressed out by minor inconveniences?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            4
        )
        var question7 = QuestionData(
            7,
            "Are you slow to comprehend when you’re reading?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question8 = QuestionData(
            8,
            "Do you rely on more than the recommended amount of caffeine to keep you alert during the day?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
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

        return que
    }
}