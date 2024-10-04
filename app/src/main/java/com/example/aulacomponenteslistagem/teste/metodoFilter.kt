package com.example.aulacomponenteslistagem.teste

fun main() {
     val listaFrutas = listOf("Banana", "Kiwi", "Abacaxi")

    val novaLista = listaFrutas.filter { frutas ->
        frutas == "Kiwi"
    }
    println(novaLista)

    val listaVendas = listOf(500, 600, 100, 30, 200, 50)

    // Método filter
    // O método filter vai gerar em memória uma nova lista
    // Com o valores que foram filtrados da lista onde foi aplicado
    // Vai percorrer cada um dos elementos da lista, e caso a condiçõa for atendida (true)
    // Será adicionada na nova lista filtrada
    /*val novasVendas = listaVendas.filter { venda->
        venda >=200 // condição para filtragem
    }*/

    val novasVendas = listaVendas.filter { it >=200 }

    println(novasVendas)

    //O método filter também permite o uso de contains
    // Neste caso, a lista será percorrida e somente os valores que contém a letra T serão selecionados
    // Ou no caso, somente o elementos que passam pela condição e resultarem true são recuperados
    val alunosCadastrados = listOf("Pedro","Alisson", "Thiago", "Jordan", "Renato", "Rebeca", "Theo")

    val chamadaAlunos = alunosCadastrados.filter { nomes ->
        nomes.contains("T")
    }
}