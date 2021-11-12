package com.example.quizapp2

object setData3 {
    const val dataNo:String="3"
    const val name:String="Psychosis Test"
    const val score:String="score"

//Psychosis Test

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "In the last month, Do familiar surroundings sometimes seem strange, confusing, threatening or unreal to you?",

            "yes",
            "some times",
            "may be",
            "no",
            1

        )
        var question2 = QuestionData(
            2,
            "Have you heard unusual sounds like banging, clicking, hissing, clapping or ringing in your ears?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question3 = QuestionData(
            3,
            "Do things that you see appear different from the way they usually do?",

            "yes",
            "some times",
            "may be",
            "no",
            2
        )
        var question4 = QuestionData(
            4,
            "Have you had experiences with telepathy, psychic forces, or fortune telling?",

            "yes",
            "some times",
            "may be",
            "no",
            3
        )

        var question5 = QuestionData(
            5,
            "Have you felt that you are not in control of your own ideas or thoughts?",

            "yes",
            "some times",
            "may be",
            "no",
            4
        )
        var question6 = QuestionData(
            6,
            "Do you have difficulty getting your point across, because you ramble or go off the track a lot when you talk?",

            "yes",
            "some times",
            "may be",
            "no",
            4
        )
        var question7 = QuestionData(
            7,
            "Do you have strong feelings or beliefs about being unusually gifted or talented in some way?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question8 = QuestionData(
            8,
            "Do you feel that other people are watching you or talking about you?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question9 = QuestionData(
            9,
            "Do you sometimes get strange feelings on or just beneath your skin, like bugs crawling?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question10 = QuestionData(
            10,
            "Do you sometimes feel suddenly distracted by distant sounds that you are not normally aware of?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question11 = QuestionData(
            11,
            "Have you had the sense that some person or force is around you, although you couldn’t see anyone?",

            "yes",
            "some times",
            "may be",
            "no",
            1

        )
        var question12 = QuestionData(
            12,
            "Do you worry at times that something may be wrong with your mind?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question13 = QuestionData(
            13,
            "Have you ever felt that you don't exist, the world does not exist, or that you are dead?",

            "yes",
            "some times",
            "may be",
            "no",
            2
        )
        var question14 = QuestionData(
            14,
            "Have you been confused at times whether something you experienced was real or imaginary?",

            "yes",
            "some times",
            "may be",
            "no",
            3
        )

        var question15 = QuestionData(
            15,
            "Do you hold beliefs that other people would find unusual or bizarre?",

            "yes",
            "some times",
            "may be",
            "no",
            4
        )
        var question16 = QuestionData(
            16,
            "Do you feel that parts of your body have changed in some way, or that parts of your body are working differently?",

            "yes",
            "some times",
            "may be",
            "no",
            4
        )
        var question17 = QuestionData(
            17,
            "Are your thoughts sometimes so strong that you can almost hear them?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question18 = QuestionData(
            18,
            "Do you find yourself feeling mistrustful or suspicious of other people?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question19 = QuestionData(
            19,
            "Have you seen unusual things like flashes, flames, blinding light, or geometric figures?",

            "yes",
            "some times",
            "may be",
            "no",
            1
        )
        var question20 = QuestionData(
            20,
            "Have you seen things that other people can't see or don't seem to see?",

            "yes",
            "some times",
            "may be",
            "no",
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
        que.add(question12)
        que.add(question13)
        que.add(question14)
        que.add(question15)
        que.add(question16)
        que.add(question17)
        que.add(question18)
        que.add(question19)
        que.add(question20)

        return que
    }
}