package com.example.my_quiz

object setData {
    fun getQuestion(): ArrayList<QuestionData> {
        var que: ArrayList<QuestionData> = arrayListOf()
        var question1 = QuestionData(
            1,
            "How many black keys are found in a traditional piano?",
            "32",
            "34",
            "52",
            "54",
            1,
        )

        var question2 = QuestionData(
            2,
            "Who won Chelsea player of the year 2012-2013?",
            "Eden Hazard",
            "David Luiz",
            "Fabio Borini",
            "Juan Mata",
            4,
        )
        var question3 = QuestionData(
            3,
            "What is the warmest sea on Earth?",
            "Dead Sea",
            "White Sea",
            "Red Sea",
            "Black Sea",
            3,
        )
        var question4 = QuestionData(
            4,
            "What is the only edible food that never expires?",
            "Rice",
            "Honey",
            "Bailey",
            "Wheat",
            2,
        )
        var question5 = QuestionData(
            5,
            "What is a group of turkeys called?",
            "A clutch",
            "A rafter",
            "A brood",
            "Peep",
            2,
        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}