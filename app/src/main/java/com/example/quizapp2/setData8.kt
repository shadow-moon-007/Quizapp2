package com.example.quizapp2

object setData8 {
    const val dataNo:String="8"
    const val name:String="Workaholic Test"
    const val score:String="score"

//Addiction Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Do you ever work more hours in a week than you plan to work?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            1

        )
        var question2 = QuestionData(
            2,
            "Do you feel moody, guilty, anxious when you are not working?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            1
        )
        var question3 = QuestionData(
            3,
            "When you aren’t at work, do you spend large amounts of time checking your work email or phone, or thinking about work you’ve yet to finish?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            2
        )
        var question4 = QuestionData(
            4,
            "Do you plan to reduce your work hours with little success?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            3
        )
        var question5 = QuestionData(
            5,
            "Does work ever negatively affect your relationships?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            4
        )
        var question6 = QuestionData(
            6,
            "Has work ever kept you from getting a healthy amount of sleep?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            4
        )
        var question7 = QuestionData(
            7,
            "Has work ever interfered with your health?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            1
        )
        var question8 = QuestionData(
            8,
            "Do you not take vacation or sick days in order to complete more work?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            1
        )
        var question9 = QuestionData(
            9,
            "Do you find it difficult to concentrate on conversations or other tasks when you’re not working?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            4
        )
        var question10 = QuestionData(
            10,
            "Do you hide how much you work to loved ones?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
            1
        )
        var question11 = QuestionData(
            11,
            "Are you experiencing burnout from working too much?",

            "No",
            "Rarely",
            "Sometimes",
            "Yes",
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