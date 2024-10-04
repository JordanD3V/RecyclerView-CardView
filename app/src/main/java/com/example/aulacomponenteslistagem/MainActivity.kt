package com.example.aulacomponenteslistagem

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textResultado: TextView
    private lateinit var buttonExecutar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonExecutar = findViewById(R.id.button_executar)
        textResultado = findViewById(R.id.text_resultado)


        }

        fun cliqueBotao(view : View){

            Toast.makeText(this, "Botão clicado com sucesso", Toast.LENGTH_LONG).show()

            textResultado.text = "Jordan Henrique"

    }
}