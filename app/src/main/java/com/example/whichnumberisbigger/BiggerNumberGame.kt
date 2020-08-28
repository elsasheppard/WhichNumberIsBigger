package com.example.whichnumberisbigger

// in java, when you jad a class that had no Android functionality, it was called a POJO
// POJO = Plain Old Java Object
// POKO = Plain Old Kotlin Object...? maybe... or also a data class perhaps...
// Knows nothing about android
// Only the logic behind the game

class BiggerNumberGame(val lowerLimit: Int, val upperLimit: Int) {
    // class will automatically form with those instance variables

    var leftNumber = 0
    var rightNumber = 0
    var score = 0

    // init block gets run one time when the object is constructed
    // usually used for complex operations to set the initital state of the object
    init {
        generateRandomNumbers()
    }

    // need a function to generate random numbers
    fun generateRandomNumbers() {
        // give two unique numbers for leftNumber and rightNumber between upper and lower limits inclusive
    }

    // need a function to check the answer, update the score, and return a message
    // in java, if we wanted a function that accepted an int parameter called answer and returned a String
    // public String checkAnswer(int answer)
    // In Kotlin
    // fun methodName(paramVar: paramType) : returnType
    fun checkAnswer(answer: Int) : String {
        // decide if the answer was bigger or not
        //adjust the score accordingly
        // return a message for the MainActivity to Toast


    }



}