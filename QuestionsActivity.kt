package com.example.assignment2imad

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.material.color.utilities.Score

class QuestionsActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Nelson Mandela was the president in 1994." ,
        "World War I began in 1914." ,
        "Napoleon was a famous Roman emperor." ,
        "The Declaration of Independence was signed in 1776." ,
        "The Titanic sank in 1912."
    )

    private val answers = arrayOf(true , true , false , true , false)

    private var currentQuestionIndex = 0
    private var score = 0

    private val userAnswers = arrayListOf<String>()
    private val correctAnswersList = arrayListOf<String>()

    private val TAG = "QuizActivity"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionTextView = findViewById<TextView>(R.id.questionText)
        val feedbackTextView = findViewById<TextView>(R.id.feedbackText)
        val trueButton = findViewById<Button>(R.id.trueButton)
        val falseButton = findViewById<Button>(R.id.falseButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        questionTextView.text = questions[currentQuestionIndex]

        trueButton.setOnClickListener {
            checkAnswer(true , feedbackTextView)
        }

        falseButton.setOnClickListener {
            checkAnswer(false , feedbackTextView)
        }

        nextButton.setOnClickListener {
            currentQuestionIndex++

            if (currentQuestionIndex < questions.size) {
                questionTextView.text = questions[currentQuestionIndex]
                feedbackTextView.text = ""
            } else {
                val intent = Intent(this , Score::class.java)
                intent.putExtra("SCORE" , score)
                intent.putStringArrayListExtra("questions" , ArrayList(questions.toList()))
                intent.putStringArrayListExtra("userAnswers" , userAnswers)
                intent.putStringArrayListExtra("correctAnswers" , correctAnswersList)
                startActivity(intent)
                finish()

            }
        }
    }

    @SuppressLint("SetTextI18n") // Disables the warning about setting text directly without localization
    private fun checkAnswer(userAnswer: Boolean , feedbackTextView: TextView) {
        val correctAnswer = answers[currentQuestionIndex]

        // Record the user's response and the correct answer for review or scoring
        userAnswers.add(userAnswer.toString())
        correctAnswersList.add(correctAnswer.toString())

        if (userAnswer == correctAnswer) {
            // Provide positive feedback and update the score if the user's answer is right
            feedbackTextView.text = "Excellent choice"
            score++
            Log.d(TAG , "Victory! Correct response. Current score: $score")
        } else {
            // Display negative feedback if the user's answer is wrong
            feedbackTextView.text = "Not happy with your answer."
            Log.d(TAG , "That was incorrect. Current score: $score")
        }
    }
}