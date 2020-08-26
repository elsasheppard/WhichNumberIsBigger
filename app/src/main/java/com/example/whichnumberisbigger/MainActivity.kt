package com.example.whichnumberisbigger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // if you need instance variables, you can make them here
    private var score = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // do your initial setup here in the onCreate
        // generate two random numbers
        // assign those numbers to the buttons
        button_main_left.setText(generateNumbers().toString())
        button_main_right.setText(generateNumbers().toString())
        // set an initial score to 0
        textView_main_score.setText(score.toString())

    }

    fun generateNumbers(): Int {
        // code to make new random numbers
        return (Math.random()*100 +1).toInt()
    }

    fun onLeftClick(view: View){
        var checkLeftInt = button_main_left.text.toString().toInt()
        var checkRightInt = button_main_right.text.toString().toInt()
        // read the buttons
        if(checkLeftInt > checkRightInt) {
            score++
            textView_main_score.setText(score.toString())
        }
        else {
            score--
            textView_main_score.setText(score.toString())
        }
        // button_main_left.setText(generateNumbers().toString())
        // button_main_right.setText(generateNumbers().toString())
    }
    fun onRightClick(view: View){
        var checkLeftInt = button_main_left.text.toString().toInt()
        var checkRightInt = button_main_right.text.toString().toInt()
        if(checkRightInt > checkLeftInt) {
            score++
            textView_main_score.setText(score.toString())
        }
        else {
            score--
            textView_main_score.setText(score.toString())
        }
        // button_main_left.setText(generateNumbers().toString())
        // button_main_right.setText(generateNumbers().toString())
    }

}

//To access the number on a button:
//button_main_left.text.toString().toInt()
//You don't need to use getters to access instance variable values anymore in Kotlin. The text attribute is a CharSequence that needs to be converted to a String before going to an Int.