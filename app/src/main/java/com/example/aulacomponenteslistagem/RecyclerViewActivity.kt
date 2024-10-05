package com.example.aulacomponenteslistagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView
    private lateinit var btnExecutar: Button
    private lateinit var mensagemAdapter: MensagemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val lista = mutableListOf(
            Mensagem("Jordan", "Não esquece?", "18:00"),
            Mensagem("Paola", "Advinha a boa do dia?", "11:00"),
            Mensagem("Miguel", "X1 fraco?", "22:00"),
            Mensagem("Linda", "Vem pro culto?", "15:00"),
            Mensagem("Valfrido", "Cadê voçê?", "17:00"),
            Mensagem("Rafael", "Churras domingo", "17:00"),
            Mensagem("Leo", "VAMOOOO", "17:00"),
            Mensagem("Magda", "Prova?", "17:00"),
            Mensagem("Ana", "Boa noite", "17:00"),
            Mensagem("Carolina", "Sai fora", "17:00"),
            Mensagem("Wesley", "Anima um burger?", "17:00"),
            Mensagem("Thais", "Amor, vamos no parque?", "17:00")
        )

        rvLista = findViewById(R.id.rv_lista)
        btnExecutar= findViewById(R.id.btn_executar)
        mensagemAdapter = MensagemAdapter { mensagem ->
            Toast.makeText(this, "Msg: $mensagem", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ListViewActivity2::class.java)
            intent.putExtra("mensagem", mensagem)
            startActivity(intent)
        }
        rvLista.adapter = mensagemAdapter

        mensagemAdapter.atualizarListaDados(
            lista
        )
        //Utilizando Linear Layout Manager
        rvLista.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        btnExecutar.setOnClickListener {
            lista.add(Mensagem("Regina", "Sumiu da festa pq?", "03:00"))
            mensagemAdapter.atualizarListaDados(lista)
        }

        /*//Utilizando um divisor decorativo na recyclerView
        rvLista.addItemDecoration(
            DividerItemDecoration(this, RecyclerView.VERTICAL)
        )*/

        //Utilizando Grid layout manager
        //Na linha do gridlayout, sempre estará com o tamanho do maior item
        // Span count é o número de colunas do grid
        //rvLista.layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)

        /*//Utlizando o Stagerred GridLayout Manager
        //Ele organiza os itens em grade, porém não mantendo em linha de
        //acordo com o maior item
        //rvLista.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)*/


    }
}