package com.eduardo.variasactivities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class OneActivity : AppCompatActivity() {
    private val button: Button by lazy { findViewById(R.id.button) }
    private val textView: TextView by lazy { findViewById(R.id.one_textview) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        val nome = intent.getStringExtra("nome")
//        val idade = intent.getIntExtra("idade", 0)

        textView.text = nome

        button.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:88889999"))
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.betrybe.com"))
            startActivity(intent)
        }
    }
}