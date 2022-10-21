package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    // TODO : making the questions... getting the data model to Question.kt data class
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()


        // 1
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Philippines", "China", "India",
            1
        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Philippines", "Australia", "India",
            3
        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Philippines", "Canada", "Belgium",
            4
        )
        questionList.add(que3)
        // 4
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Brazil", "Canada", "Belgium",
            2
        )
        questionList.add(que4)
        // 5
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "Brazil", "Canada", "Belgium",
            1
        )
        questionList.add(que5)
        // 6
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Denmark", "Brazil", "Canada", "Fiji",
            4
        )
        questionList.add(que6)
        // 7
        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Denmark", "Brazil", "Germany", "Fiji",
            3
        )
        questionList.add(que7)

        // 8
        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Denmark", "India", "Germany", "Fiji",
            2
        )
        questionList.add(que8)

        // 9
        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "India", "Germany", "Fiji",
            1
        )
        questionList.add(que9)
        // 10
        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Kuwait", "India", "New Zealand", "Fiji",
            3
        )
        questionList.add(que10)


        return questionList
    }
}