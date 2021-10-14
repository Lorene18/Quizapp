package com.example.my_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class QuestionActivity : AppCompatActivity() {

    class QuestionActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_question)
            setData.getQuestion()

var demo=setData.getQuestion()
            Log.e("My test","${demo.size}")
        }
    }
}