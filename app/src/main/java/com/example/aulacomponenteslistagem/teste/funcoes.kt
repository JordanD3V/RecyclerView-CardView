package com.example.aulacomponenteslistagem.teste

/*class Matematica{
    fun somar(n1: Int, n2: Int) : Int{
        return n1 + n2
    }
}*/

//Função
fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}

//Definindo a estrutura da função a ser recebida como parâmetro
// (Int, Int) define o tipo de parâmetro a ser recebido
// "" -> o tipo a ser retornado"

fun calcular(funcao: (Int, Int) -> Int) {

    val retorna = funcao(10, 10)
    println(retorna)
}

/*class Botao {

    //Utilizamos Unit quando queremos que a função não tenha retorno
    // Unit corresponde ao vazio(null)
    fun configurarCliqueBotao(nome: String, funcao: () -> Unit) {
        funcao()
        println("$nome")
    }

}*/

class Botao {

    //Utilizamos Unit quando queremos que a função não tenha retorno
    // Unit corresponde ao vazio(null)
    fun configurarCliqueBotao( funcao: (String) -> Unit) {
        funcao("Jordan")
    }

}

fun main() {

    /*//Utilizando a class botão 1
    val botao = Botao()
    botao.configurarCliqueBotao("Jordan") {
        println("Executou função Lambda")
    }*/

    val botao = Botao()
    botao.configurarCliqueBotao { nome ->
        println("Executou função Lambda e nome é: $nome")

    //Função Lambda
    //Normalmente funções lambdas por serem curtas, são passadas como parametro
    //É recomendado funções lambdas caso precise de utilizar funções como parametro
    //Funções Lambdas possuem apenas o bloco de execução
    //Lambdas não possuem nome, sendo assim, utilize o nome da varíavel onde ela foi atribuida
    //Também é possivel utilizar paramentros dentro das funções Lambda
    /*val funcaoLambda =  { nome: String, idade: Int ->
        println("Nome registrado: $nome, idade $idade")
    }
    funcaoLambda("Jordan", 31)*/

    //
    //calcular(::somar)

    /*val matematica = Matematica ()
    val retorno = matematica.somar(10,20)*/

    //val retorno = somar(10,20)
    //println(retorno)


}
}