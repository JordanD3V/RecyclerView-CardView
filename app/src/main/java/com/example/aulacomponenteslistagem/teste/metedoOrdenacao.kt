package com.example.aulacomponenteslistagem.teste

fun main() {
    val listaNomes = listOf("Maria", "Ana", "Débora", "Paula")
    val listaIdade = listOf(55, 12 , 18, 5)

    //Ordenando valores de forma ascendente - ASC
    val idadesOrdenadas = listaIdade.sorted()
    println(idadesOrdenadas)

    val listaChamadaAula = listaNomes.sorted()
    println(listaChamadaAula)

    //Ordenando valores de forma descendente - DESC
    val idadePreferencial = listaIdade.sortedDescending()
    println(idadePreferencial)

    val nomesFinais = listaNomes.sortedDescending()
    println(nomesFinais)


}