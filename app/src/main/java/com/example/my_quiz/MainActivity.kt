package com.example.my_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val order_button = findViewById<Button>(R.id.order_button)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    order_button.setOnClickListener {
        if (input.text.toString().isEmpty()){
            Toast.makeText(this,"Enter Your Name",Toast.LENGTH_SHORT).show()
        }else{
            var intent=Intent(this,QuestionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    }}












