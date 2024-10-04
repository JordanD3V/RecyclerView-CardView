package com.example.aulacomponenteslistagem

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aulacomponenteslistagem.teste.Usuario

class ListViewActivity2 : AppCompatActivity() {

    private lateinit var listaUsuario: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val userList = listOf("Amanda", "Ana", "Tatiana", "Rodrigo", "Miguel", "Carlos")

        listaUsuario = findViewById(R.id.list_usuarios)

        listaUsuario.adapter = ArrayAdapter(
            //Informando o contexto da ListView
            this,
            //Definindo o layout da ListView
            android.R.layout.simple_list_item_1,
            //Definindo o id da ListView
            android.R.id.text1,
            //Definindo a informação a ser carregada no layout da ListView
            userList
        )

        

    }
}