package com.eduardo.variasactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val oneActivityButton : Button by lazy { findViewById(R.id.one_activity_button) }
    private val twoActivityButton : Button by lazy { findViewById(R.id.two_activity_button) }
    private val campoTexto: TextInputEditText by lazy { findViewById(R.id.campo_texto) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        oneActivityButton.setOnClickListener(this)
        twoActivityButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.one_activity_button -> {
                val valorCampoTexto = campoTexto.text.toString()

                val intent = Intent(this, OneActivity::class.java)
                intent.putExtra("nome", valorCampoTexto)
                intent.putExtra("idade", 20)

                startActivity(intent)
            }

            R.id.two_activity_button -> {
                val intent = Intent(this, TwoActivity::class.java)
                startActivity(intent)
            }
        }
    }
}