package com.example.quizapp2

object setData2 {
    const val dataNo:String="2"
    const val name:String="Anxiety Test"
    const val score:String="score"

//Anxiety Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Over the last 2 weeks, how often Do you worry about lots of different things?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            4
        )
        var question2 = QuestionData(
            2,
            "Do you have trouble controlling your worries?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question3 = QuestionData(
            3,
            "Do you get irritable and/or easily annoyed when anxious?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            2
        )
        var question4 = QuestionData(
            4,
            "Does worry or anxiety make you feel fatigued or worn out?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            3
        )

        var question5 = QuestionData(
            5,
            "Does worry or anxiety interfere with falling and/or staying asleep?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            4
        )
        var question6 = QuestionData(
            6,
            "Does worry or anxiety make it hard to concentrate?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            4
        )
        var question7 = QuestionData(
            7,
            "Do you feel jumpy?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question8 = QuestionData(
            8,
            "Do you worry about how well you do things?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question9 = QuestionData(
            9,
            "Do you worry about things working out in the future?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question10 = QuestionData(
            10,
            "Do you worry about things that have already happened in the past?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question11 = QuestionData(
            11,
            "Do your muscles get tense when you are worried or anxious?",

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
        que.add(question9)
        que.add(question10)
        que.add(question11)

        return que
    }
}