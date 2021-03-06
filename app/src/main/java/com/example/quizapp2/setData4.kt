package com.example.quizapp2

object setData4 {
    const val dataNo:String="4"
    const val name:String="Stress Test"
    const val score:String="score"

//PTSD Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "How often are you able to stay focused on the present moment?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1

        )
        var question2 = QuestionData(
            2,
            "How often do you feel overwhelmed with your life?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1
        )
        var question3 = QuestionData(
            3,
            "Do you fall asleep easily at night? (The average person falls asleep in 7-10 minutes.)",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            2
        )
        var question4 = QuestionData(
            4,
            "On average, do you get 7-8 hours of sleep?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            3
        )

        var question5 = QuestionData(
            5,
            "Do you turn to unhealthy food indulgences such as eating junk food, drinking excessively, or eating sugary foods/sweets when feeling overwhelmed?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            4
        )
        var question6 = QuestionData(
            6,
            "Do you experience headaches or muscle tension?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1

        )
        var question7 = QuestionData(
            7,
            "During work hours, do you have a hard time staying focused and concentrating on the task-at-hand?",

            "Never",
            "Rarely",
            "Sometimes",
            "Often",
            1

        )
        var question8 = QuestionData(
            8,
            "Do you feel pain or tension in your stomach, muscles, chest, or head? ",

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