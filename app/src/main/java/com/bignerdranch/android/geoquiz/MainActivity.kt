package com.bignerdranch.android.geoquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var cheatButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        cheatButton = findViewById(R.id.cheat_button)

        trueButton.setOnClickListener{view: View ->
           val correctToast = Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_LONG)
            correctToast.setGravity(Gravity.TOP, 0, 0)
            correctToast.show()
        }

        falseButton.setOnClickListener{view:View->
            val correctToast = Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_LONG)
            correctToast.setGravity(Gravity.TOP, 0, 0)
            correctToast.show()
        }

        cheatButton.setOnClickListener {
            // Start CheatActivity
            val intent = Intent(this, CheatActivity::class.java)
            startActivity(intent)
        }

    }
}