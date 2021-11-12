package com.example.quizapp2

object setData4 {
    const val dataNo:String="4"
    const val name:String="PTSD Test"
    const val score:String="score"

//PTSD Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "had nightmares about the event(s) or thought about the event(s) when you did not want to?",

            "yes",
            "some times",
            "may be",
            "no",
            1

        )
        var question2 = QuestionData(
            2,
            "tried hard not to think about the event(s) or went out of your way to avoid situations that reminded you of the event(s)?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question3 = QuestionData(
            3,
            "been constantly on guard, watchful, or easily startled?",

            "yes",
            "some times",
            "may be",
            "no",
            2
        )
        var question4 = QuestionData(
            4,
            "felt numb or detached from people, activities, or your surroundings?",

            "yes",
            "some times",
            "may be",
            "no",
            3
        )

        var question5 = QuestionData(
            5,
            "felt guilty or unable to stop blaming yourself or others for the event(s) or any problems the event(s) may have caused?",

            "yes",
            "some times",
            "may be",
            "no",
            4
        )



        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)


        return que
    }
}