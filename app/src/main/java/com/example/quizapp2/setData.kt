package com.example.quizapp2

import kotlinx.android.parcel.Parcelize

object setData  {
    const val dataNo:String="1"
    const val name:String="Depression Test"
    const val score:String="score"

//Depression Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Over the last 2 weeks, how often have you been Little interest or pleasure in doing things",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            4
        )
        var question2 = QuestionData(
            2,
            "Feeling down, depressed, or hopeless",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            1
        )
        var question3 = QuestionData(
            3,
            "Trouble falling or staying asleep, or sleeping too much",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            2
        )
        var question4 = QuestionData(
            4,
            "Feeling tired or having little energy",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            3
        )

        var question5 = QuestionData(
            5,
            "Poor appetite or overeating",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            4
        )
        var question6 = QuestionData(
            6,
            "Feeling bad about yourself - or that you are a failure or have let yourself or your family down",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            4
        )
        var question7 = QuestionData(
            7,
            "Trouble concentrating on things, such as reading the newspaper or watching television",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            1
        )
        var question8 = QuestionData(
            8,
            "Moving or speaking so slowly that other people could have noticed\n" +
                    "Or the opposite",

            "Not at all",
            "Several days",
            "More than half the days",
            "Nearly every day",
            2
        )
        var question9 = QuestionData(
            9,
            "Thoughts that you would be better off dead, or of hurting yourself",

            "NOT AT ALL",
            "SEVERAL DAYS",
            "MORE THAN HALF THE DAYS",
            "NEARLY EVERY DAY",
            3
        )

        var question10 = QuestionData(
            10,
            "If you checked off any problems, how difficult have these problems made it for you at work, home, or with other people?",

            "NOT DIFFICULT AT ALL",
            "SOMEWHAT DIFFICULT",
            "VERY DIFFICULT",
            "EXTREMELY DIFFICULT",
            4
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
        return que
    }
}