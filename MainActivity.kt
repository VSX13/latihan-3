package com.example.latihan

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Dua(view: View) {
        val intent = Intent(this@MainActivity, Linier::class.java)
        startActivity(intent)
    }

    fun Back(view: View) {}

    fun tiga(view: View) {
        val intent = Intent(this@MainActivity, Constrain::class.java)
        startActivity(intent)
    }

    fun Empat(view: View) {
        val intent = Intent(this@MainActivity, Frame::class.java)
        startActivity(intent)
    }

    fun Satu(view: View) {
        val intent = Intent(this@MainActivity, Table ::class.java)
        startActivity(intent)
    }

    fun Lima(view: View) {
        val intent = Intent(this@MainActivity, Relative ::class.java)
        startActivity(intent)
    }
}