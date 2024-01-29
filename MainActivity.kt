package edu.vt.cs5254.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    // Name: Joel Hipkins
    // PID: joel5

    private lateinit var falseButton: Button
    private lateinit var trueButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        falseButton = findViewById(R.id.false_button)
        trueButton = findViewById(R.id.true_button)

        falseButton.setOnClickListener {
            Snackbar.make(it, R.string.incorrect_answer, Snackbar.LENGTH_SHORT).show()
      }

        trueButton.setOnClickListener {
            Snackbar.make(it, R.string.correct_answer, Snackbar.LENGTH_SHORT).show()
        }
    }
}