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
            "Over the last 2 weeks, how often have you been Feeling nervous, anxious, or on edge",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            4
        )
        var question2 = QuestionData(
            2,
            "Not being able to stop or control worrying",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            1
        )
        var question3 = QuestionData(
            3,
            "Worrying too much about different things",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            2
        )
        var question4 = QuestionData(
            4,
            "Trouble relaxing",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            3
        )

        var question5 = QuestionData(
            5,
            "Being so restless that it is hard to sit still",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            4
        )
        var question6 = QuestionData(
            6,
            "Becoming easily annoyed or irritable",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            4
        )
        var question7 = QuestionData(
            7,
            "Feeling afraid, as if something awful might happen",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            1
        )


        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)

        return que
    }
}