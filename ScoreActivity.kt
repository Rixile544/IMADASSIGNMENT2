package com.example.assignment2imad

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n" , "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("SCORE", 0)
        val questions = intent.getStringArrayListExtra("questions")
        val userAnswers = intent.getStringArrayListExtra("userAnswers")
        val correctAnswers = intent.getStringArrayListExtra("correctAnswers")

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val feedbackText = findViewById<TextView>(R.id.feedbackText)
        val reviewButton = findViewById<Button>(R.id.reviewButton)

        scoreText.text = "Your score: $score / 5"
        feedbackText.text = if (score >= 3) "Great job!" else "Keep practicing!"

        reviewButton.setOnClickListener {
            val reviewIntent = Intent(this, ReviewActivity::class.java)
            reviewIntent.putStringArrayListExtra("questions", questions)
            reviewIntent.putStringArrayListExtra("userAnswers", userAnswers)
            reviewIntent.putStringArrayListExtra("correctAnswers", correctAnswers)
            startActivity(reviewIntent)
        }
    }
}