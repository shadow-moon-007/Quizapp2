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
            "Do you find yourself looking at your phone or using it than you realize?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1

        )
        var question2 = QuestionData(
            2,
            "Do you try to cut down on your phone use without much success?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question3 = QuestionData(
            3,
            "Do you ever feel that you lose large amounts of time mindlessly checking apps or browsing the Internet on your phone?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            2
        )
        var question4 = QuestionData(
            4,
            "Do you ever feel anxious or restless when you cannot access your phone, such as when the battery has run out or you’ve forgotten it?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            3
        )
        var question5 = QuestionData(
            5,
            "Do you sleep with your phone and/or lose sleep due to phone use?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            4
        )
        var question6 = QuestionData(
            6,
            "Has your phone use ever interfered with your productivity at school or work?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            4
        )
        var question7 = QuestionData(
            7,
            "Do you ever look at your phone in dangerous or inappropriate situations, such as driving or when crossing the street?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question8 = QuestionData(
            8,
            "Has your phone use negatively affected your relationships?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question9 = QuestionData(
            9,
            "Do you struggle to wait to check your phone when you receive an alert?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question10 = QuestionData(
            10,
            "Do you ever feel guilty, sad, or anxious about your phone use?",

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

        return que
    }
}