package com.example.whichnumberisbigger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // if you need instance variables, you can make them here
    var game = BiggerNumberGame(0, 100)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // do your initial setup here in the onCreate
        // construct a BiggerNumberGame object
        // in java: Square s = new Square();
        // in Kotlin: don't need "new" or to declare the type either:

        // generate two random numbers
        game.generateRandomNumbers()
        game.leftNumber
        game.rightNumber
        game.score
        game.checkAnswer(button_main_left.text.toString().toInt())
        // assign those numbers to the buttons
        button_main_left.text = game.generateRandomNumbers().toString()
        button_main_right.text = game.generateRandomNumbers().toString()
        // set an initial score to 0
        textView_main_score.text = game.score.toString()

    }



    fun onLeftClick(view: View){
        // get button number values as String variables
        var checkLeftInt = button_main_left.text.toString().toInt()
        var checkRightInt = button_main_right.text.toString().toInt()

        // read the buttons
        if(checkLeftInt == checkRightInt){
            button_main_left.text = game.generateRandomNumbers().toString()
            button_main_right.text = game.generateRandomNumbers().toString()
        }
        else if(checkLeftInt > checkRightInt) {
            game.score++
            textView_main_score.text = game.score.toString()
            Toast.makeText(this, "Congrats! You're not an idiot!", Toast.LENGTH_SHORT).show()
        }
        else {
            game.score--
            textView_main_score.text = game.score.toString()
            Toast.makeText(this, "Dude... come on...", Toast.LENGTH_SHORT).show()
        }

        // reset buttons to new numbers
        button_main_left.text = game.generateRandomNumbers().toString()
        button_main_right.text = game.generateRandomNumbers().toString()
    }
    fun onRightClick(view: View){
        // get button number values as String variables
        var checkLeftInt = button_main_left.text.toString().toInt()
        var checkRightInt = button_main_right.text.toString().toInt()

        if(checkLeftInt == checkRightInt){
            button_main_left.text = game.generateRandomNumbers().toString()
            button_main_right.text = game.generateRandomNumbers().toString()
        }
        else if(checkRightInt > checkLeftInt) {
            game.score++
            textView_main_score.text = game.score.toString()
            Toast.makeText(this, "Congrats! You're not an idiot!", Toast.LENGTH_SHORT).show()
        }
        else {
            game.score--
            textView_main_score.text = game.score.toString()
            Toast.makeText(this, "Dude... come on...", Toast.LENGTH_SHORT).show()
        }

        fun checkAnswer(numClicked: Int) {

        }

        // reset buttons to new numbers
        button_main_left.text = game.generateRandomNumbers().toString()
        button_main_right.text = game.generateRandomNumbers().toString()
    }
}

/*
if(answer == leftNumber) {
    reutrn if(answer > rightNumber){
        score++
        generateRandomNumbers()
        "Good job"
        // last line in a return if is what will be returned
    }
    else {
        score--
        generateRandmonNumbers()
        "Wrong"
    }
}
if(answer == rightNumber){
    return if(answer > leftNumber){
        score++
        generateRandomNumbers()
        "Good"
    }
    else{
        score--
        generateRandomNumbers()
        "No"
    }
}
*/
