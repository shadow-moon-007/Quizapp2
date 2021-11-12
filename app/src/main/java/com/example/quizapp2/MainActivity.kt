package com.example.quizapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        button1.setOnClickListener {

                var intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra("data","1")
                startActivity(intent)
                finish()
        }
        button2.setOnClickListener {

            var intent = Intent(this,QuestionActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
            finish()
        }
        button3.setOnClickListener {

            var intent = Intent(this,QuestionActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
            finish()
        }
        button4.setOnClickListener {

            var intent = Intent(this,QuestionActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
            finish()
        }
        button5.setOnClickListener {

            var intent = Intent(this,QuestionActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
            finish()
        }
    }
}