package com.example.whichnumberisbigger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // if you need instance variables, you can make them here
    private var score = 0
    private var leftRandInt = 0
    private var rightRandInt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // do your initial setup here in the onCreate
        // generate two random numbers
        // assign those numbers to the buttons
        // set an initial score to 0

    }

    fun generateNumbers()
    {
        // code to make new random numbers
        leftRandInt = (Math.random()*100 +1).toInt()
        rightRandInt = (Math.random()*100 +1).toInt()
    }

    fun onLeftClick(view: View){
        button_main_left.setText(leftRandInt.toString())
        // read the buttons


    }
    fun onRightClick(view: View){
        button_main_right.setText(rightRandInt.toString())

    }

}

//To access the number on a button:
//button_main_left.text.toString().toInt()
//You don't need to use getters to access instance variable values anymore in Kotlin. The text attribute is a CharSequence that needs to be converted to a String before going to an Int.