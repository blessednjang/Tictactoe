package com.njang.timefighter

import android.app.MediaRouteButton
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    internal lateinit var tapMeButton: Button
    internal lateinit var gameScoreTextView: TextView
    internal lateinit var timeleftTextView: TextView

    private var timeleftOnTimer: Long = 6000

    companion object {
        private const val SCORE_KEY = "SCORE_KEY"
        private const val TIME_LEFT_KEY = "TIME_LEFT_KEY"
    }

    internal var score = 0

    internal var gameStarted = false

    internal lateinit var countDownTimer: CountDownTimer

    internal val initialcountDownTimer: Long = 60000

    internal val countDownInterval: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tapMeButton = findViewById(R.id.tapMeButton)
        gameScoreTextView = findViewById(R.id.gameScoreTextView)
        timeleftTextView = findViewById(R.id.timeLeftTextView)


        tapMeButton.setOnClickListener { view ->
            incrementScore()

        }

        resetGame()
    }

    private fun resetGame() {
        score = 0
        gameScoreTextView.text = getString(R.string.score_1_d, score)


        val iniitialTimerLeft = initialcountDownTimer / 1000
        timeleftTextView.text = getString(R.string.time_left_1_d, iniitialTimerLeft)

        countDownTimer = object : CountDownTimer(initialcountDownTimer, countDownInterval) {

            override fun onTick(millisUntilFinished: Long) {
                val timeleft = millisUntilFinished / 1000
                timeleftTextView.text = getString(R.string.time_left_1_d, timeleft)
            }

            override fun onFinish() {
                endGame()
            }

        }

        gameStarted = false

    }


    private fun incrementScore() {
        if (!gameStarted) {
            startGame()
        }


        score += 1
        val newScore = getString(R.string.score_1_d, score)
        gameScoreTextView.text = newScore
    }

    private fun startGame() {
        countDownTimer.start()
        gameStarted = true
    }

    private fun endGame() {
        Toast.makeText(this, getString(R.string.game_over_message, score), Toast.LENGTH_LONG).show()
        resetGame()
    }

    private fun restorGame() {
        score = 0
        gameScoreTextView.text = getString(R.string.score_1_d, score)
        val restoredTime = timeleftOnTimer / 1000
        timeleftTextView.text = getString(R.string.time_left_1_d, restoredTime)
        countDownTimer = object : CountDownTimer(timeleftOnTimer, countDownInterval) {
            override fun onTick(millisUnitFinished: Long) {
                val timeLeft = millisUnitFinished / 1000
            }

            override fun onFinish() {
                endGame()
            }
        }
        countDownTimer.start()
        gameStarted = true

    }
}




