package com.example.quizapp2

object setData5 {
    const val dataNo:String="5"
    const val name:String="Addiction Test"
    const val score:String="score"

//Addiction Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Have you ever felt that you ought to cut down on your drinking or drug use?",

            "yes",
            "some times",
            "may be",
            "no",
            1

        )
        var question2 = QuestionData(
            2,
            "Have people annoyed you by criticizing your drinking or drug use?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question3 = QuestionData(
            3,
            "Have you ever felt bad or guilty about your drinking or drug use?",

            "yes",
            "some times",
            "may be",
            "no",
            2
        )
        var question4 = QuestionData(
            4,
            "Have you ever had a drink or used drugs first thing in the morning to steady your nerves or to get rid of a hangover?",

            "yes",
            "some times",
            "may be",
            "no",
            3
        )



        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)


        return que
    }
}