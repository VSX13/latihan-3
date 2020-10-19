package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Constrain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrain)
    }

    fun Back(view: View) {
        val intent = Intent(this@Constrain, MainActivity::class.java)
        startActivity(intent)
    }
}