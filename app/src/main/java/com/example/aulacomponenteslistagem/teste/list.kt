package com.example.aulacomponenteslistagem.teste

fun main() {


     var listaArray = mutableListOf("Jordan", "Henrique")

    listaArray[0] = "Jordan Alterado"
    listaArray.add("Marcia")

    val novaLista = listOf("Roberto", "Laerte")
    listaArray.addAll(novaLista)

    listaArray.remove("Henrique")

    //Removendo elemento pelo indice(posição)
    listaArray.removeAt(3)

    listaArray.forEach { item ->
        println(item)
    }
}