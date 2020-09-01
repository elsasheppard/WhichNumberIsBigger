package com.example.whichnumberisbigger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // if you need instance variables, you can make them here
    private var leftNumber = 0
    private var rightNumber = 0
    private var score = 0
    var game = BiggerNumberGame(0, 100)
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // do your initial setup here in the onCreate
        // construct a BiggerNumberGame object
        // in java: Square s = new Square();
        // in Kotlin: don't need "new" or to declare the type either:
        updateButtons()

    }

    fun onLeftClick(view: View) {
        // decide if the answer was bigger or not
        //adjust the score accordingly
        // return a message for the MainActivity to Toast

        Toast.makeText(this, game.checkAnswer(button_main_left.toString().toInt()), Toast.LENGTH_SHORT).show()
        updateButtons()
    }

    fun onRightClick(view: View) {
        // decide if the answer was bigger or not
        //adjust the score accordingly
        // return a message for the MainActivity to Toast

        Toast.makeText(this, game.checkAnswer(button_main_right.toString().toInt()), Toast.LENGTH_SHORT).show()
        updateButtons()
    }

    fun updateButtons() {
        button_main_left.setText(game.generateRandomNumbers().toString())
        button_main_right.setText(game.generateRandomNumbers().toString())
        textView_main_score.text = game.score.toString()
    }
/*
    fun onLeftClick(view: View){
        // get button number values as String variables

        Toast.makeText(this, game.checkAnswer(button_main_left.toString().toInt()), Toast.LENGTH_SHORT).show()
        updateButtons()
    }
    fun onRightClick(view: View){

        // reset buttons to new numbers
        button_main_left.text = game.generateRandomNumbers().toString()
        button_main_right.text = game.generateRandomNumbers().toString()
        Toast.makeText(this, game.checkAnswer(button_main_right.toString().toInt()), Toast.LENGTH_SHORT).show()

        updateButtons()
    }
    */
}
