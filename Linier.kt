package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Linier : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linier)
    }
    fun Back (view: View) {
        val intent = Intent(this@Linier, MainActivity::class.java)
        startActivity(intent)
    }
}