package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_move)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.move)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnMoveActivity = findViewById<Button>(R.id.btn_main_activity)
        btnMoveActivity.setOnClickListener {
            OnClick()
        }
    }

    private fun OnClick() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }
}