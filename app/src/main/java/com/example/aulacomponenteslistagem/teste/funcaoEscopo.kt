package com.example.aulacomponenteslistagem.teste

data class Produto(
    var nome: String,
    var preco: Double
){
    fun desativar(){
        println("Produto $nome com preço foi desativado")
    }
}

fun salvarProduto(produto: Produto) {

}

class AlertaMensagem{
    fun configurarTitulo(titulo: String) = println(titulo)
    fun configurarDescricao (descricao: String) = println(descricao)

    fun configurarCancelar () = println("Ação de cancelar")
    fun configurarConfirmar () = println("Ação de confirmar")
}

fun main() {

/*
    var produto: Produto? = null

    produto = Produto("Notebook", 2500.00)

    /* //Usando o método let para a validação de nulos
    if( produto != null){

    produto.preco = 110.00
    salvarProduto(produto)
}


// O método let verifica se produto não é nulo, caso não seja,
// ele passa para ser configurado em item(parâmetro)
/*produto?.let { item ->
    item.nome = "Notebook Gamer"
    item.preco = 2200.00
    salvarProduto(produto)
}

println(produto?.nome)
println(produto?.preco)*/

/*val novoProduto = produto?.let { it ->
    it.nome = "Notebook Gamer"
    it.preco = 2200.00
    it
}*/

produto?.let {
    it.preco = 2200.00
    salvarProduto(it)
}

println(novoProduto?.nome)
println(novoProduto?.preco)*/

    //Utilizando o método run
    //Você consegue fazer uma alteração/configuração diretamente no objeto
    produto?.run { desativar() }

    //Utilizando o método with
    // Também permite realizar configuração/alteração assim como run
    with(produto){desativar()}

    // Também é possivel criar um objeto com run ou with
    // o this será o retorno do objeto
    val novoObjeto = with(produto){
        desativar()
        this
    }*/

    val alertaMensagem = AlertaMensagem()
    /*alertaMensagem.configurarTitulo("Confirmar Salvar?")
    alertaMensagem.configurarDescricao("Você está certo disso?")
    alertaMensagem.configurarCancelar()
    alertaMensagem.configurarConfirmar()*/

    //Utilizando o apply
    alertaMensagem.apply {
        alertaMensagem.configurarTitulo("Confirmar Salvar?")
        alertaMensagem.configurarDescricao("Você está certo disso?")
        alertaMensagem.configurarCancelar()
        alertaMensagem.configurarConfirmar()
    }

    val listaDesenho = listOf("Tomas", "MegasX", "Billie")
    listaDesenho
        .map { it.uppercase() }
        .also { println(it) }


}