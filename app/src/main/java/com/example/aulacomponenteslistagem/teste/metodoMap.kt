package com.example.aulacomponenteslistagem.teste

fun main() {
    val lista = listOf("Jordan", "Kleber", "Inácio")
   /* lista.forEach{ it ->
        println(it.uppercase())
    }*/

    /*//Transformando cada elemento da lista sem o método map
    val listaNova = mutableListOf<String>()
    lista.forEach{ it ->
        listaNova.add(it.uppercase())
    }
    println(listaNova)*/

    // O método map vai percorrer cada um dos itens e aplicar uma transformação
    val newLista = lista.map { it ->
        println("+ ${it.uppercase()}")
    }

    //Versão mais resumida
    val newestLista = lista.map{it.uppercase()}
}