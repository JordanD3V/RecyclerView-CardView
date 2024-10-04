package com.example.aulacomponenteslistagem.teste

fun main() {

    val listaDoces = listOf("Refrigerantes", "Balinhas")
    val listaSalgados = listOf("Batatinhas", "Salgadinho")

    // O método union unirá os valores de duas listas em uma nova lista
    //val bomboniere = listaSalgados.union(listaDoces)

    //Versão resumida
    //val bomboniere = listaSalgados + listaDoces

    //Também podemos excluir valores com union
    val retornarItem = listOf("Balinhas")
    val bomboniere = listaDoces - retornarItem

    println(bomboniere)
}