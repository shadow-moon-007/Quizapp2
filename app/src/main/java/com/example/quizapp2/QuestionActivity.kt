package com.example.quizapp2

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    private var Name:String?=null
    private var score:Int=0
    private var DataNo:String? =null
    private var Data  = setData
    private var currentPosition:Int = 1
    private var questionList: ArrayList<QuestionData>? = null
    private var selectedOption:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        DataNo = intent.getStringExtra("data")

//        Name=intent.getStringExtra(setData.name)

        if (DataNo=="1"){
            questionList=setData.getQuestion()
            Name=setData.name
        }
        else if (DataNo=="2"){
            questionList=setData2.getQuestion()
            Name=setData2.name
        }
        else if (DataNo=="3"){
            questionList=setData3.getQuestion()
            Name=setData3.name
        }
        else if (DataNo=="4"){
            questionList=setData4.getQuestion()
            Name=setData4.name
        }
        else if (DataNo=="5"){
            questionList=setData5.getQuestion()
            Name=setData5.name
        }
        else{
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
        }

        setQuestion()

        opt_1.setOnClickListener {
            selectedOptionStyle(opt_1,1)
        }
        opt_2.setOnClickListener {
            selectedOptionStyle(opt_2,2)
        }
        opt_3.setOnClickListener {
            selectedOptionStyle(opt_3,3)
        }
        opt_4.setOnClickListener {
            selectedOptionStyle(opt_4,4)
        }

        submit_btn.setOnClickListener {
            if (selectedOption!=0){
                var question=questionList!![currentPosition-1]
                if(selectedOption==4){
                    score = score+1;
                }
                if(selectedOption==3){
                    score = score+2;
                }
                if(selectedOption==2){
                    score = score+3;
                }
                if(selectedOption==1){
                    score = score+4;
                }
                if(currentPosition==questionList!!.size) {
                    submit_btn.text = "FINISH"
                }
                else{
                    submit_btn.text="Go To Next"
                }
            }else{
                currentPosition++
                when{
                    currentPosition<=questionList!!.size->{
                        setQuestion()
                    }else->{
                        var intent= Intent(this,ResultActivity::class.java)
                        intent.putExtra("mname",Name.toString())
                        intent.putExtra("mscore",score.toString())
                        intent.putExtra("total_questions",((questionList!!.size)*4).toString())
                        startActivity(intent)
                    finish()
                    }
                }
            }
            selectedOption=0
        }

    }



    fun setQuestion(){

        val question = questionList!![currentPosition-1]
        setOptionStyle()



        progress_bar.progress=currentPosition
        progress_bar.max=questionList!!.size
        progress_text.text="${currentPosition}"+"/"+"${questionList!!.size}"
        question_text.text=question.question
        opt_1.text=question.option_one
        opt_2.text=question.option_two
        opt_3.text=question.option_three
        opt_4.text=question.option_four
    }
    fun setOptionStyle(){
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,opt_1)
        optionList.add(1,opt_2)
        optionList.add(2,opt_3)
        optionList.add(3,opt_4)

        for(op in optionList){
            op.setTextColor(Color.parseColor("#555151"))
            op.background=ContextCompat.getDrawable(this,R.drawable.question_option)
            op.typeface= Typeface.DEFAULT
        }

    }

    fun selectedOptionStyle(view: TextView,opt:Int){
        setOptionStyle()
        selectedOption=opt
        view.background=ContextCompat.getDrawable(this,R.drawable.selected_question_option)
        view.typeface= Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }
}