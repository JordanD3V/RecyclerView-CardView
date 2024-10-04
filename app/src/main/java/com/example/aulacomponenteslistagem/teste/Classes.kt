package com.example.aulacomponenteslistagem.teste

/*class Motorista(val nome: String) {
    fun exibirDadosMotorista() = println("Motorista: $nome")

    //Classe aninhada = NestedClass (É uma classe independente porém dentro de outra classe)
    // Funciona de forma independente mas precisa ser acessada a partir da classe anfitriã
    class Caminhao(val nomeCaminhao: String) {
        fun exibirCaminhao() = println("Caminhao: $nomeCaminhao")
    }

    // Inner class possui maior conexão com a classe onde está hospedada
    inner class Caminhao2(val nomeCaminhao: String) {
        fun exibirCaminhao() = println("Caminhao: $nomeCaminhao, $nome")
    }
}*/

/*
// data class funciona como uma classe convencional mas focadas nos dados
// Podendo ser usada somente para dados
data class Pergunta(val pergunta: String, val respostaCerta: Int){
    fun exibir() = println("Show do milhão")
}

// É possível utilizar data class apenas com parâmetros
//data class Pergunta(val pergunta: String, val respostaCerta: Int)

 */

/*
//Getters (conseguir, recuperar) e Setters(Configurar)
class Usuario(){
    var nome: String = ""
        get() {
            println("get: $field")
            return field.uppercase() //Campo
        }
        set(value) {
            field = "set: $value"
        }
    var idade: Int = 0
    val maiorIdade
        get() = idade >= 18
}*/

class Usuario(){
    //Utilizando varargs em Kotlin
    fun salvarTelefones(vararg telefones: String){
        for(telefone in telefones){
            println("telefone: $telefone")
        }
    }
}

fun main() {

    //Utilizando varargs em Kotlin
    val usuario = Usuario()
    usuario.salvarTelefones("11 23456789", "21 23456789", "22 987654")

    /*
    // Utilizando varargs com Java
    val pessoa = Pessoa()

    // Quando houver o 3 pontinhos (...) significa que o parametro é varargs
    // Graças a varargs podesse passar vários valores do mesmo tipo
    pessoa.salvarTelefone("11 2345678", "11 559779", "11 5979")*/

    /*
    //Utilizando Getters and Setters
    val usuario = Usuario()
    usuario.nome = "Pedro"
    usuario.idade = 33

    println("Usuario cadastrado: ${usuario.nome}, idade: ${usuario.idade}: ${usuario.maiorIdade  }")


    //Get e Set com Java, usando a Java class Pessoa
    val pessoa = Pessoa()
    pessoa.nome = "Jordan"

    println("nome: $pessoa.nome")*/

/*
    // Instanciando data class
    val pergunta1 = Pergunta("Qual a resposta correta?", 1)
    val pergunta2 = Pergunta("Qual a resposta correta?", 1)

    //Comparando os valores de uma data class
    //println(pergunta1 == pergunta2)

    //Destructuring
    //Pegando dados de uma data class
    val (pergunta, resposta) = pergunta1*/

    /*val motorista = Motorista("Jordan")
     motorista.exibirDadosMotorista()*/


    /*// Criando um objeto de uma NestedClass
    val motorista = Motorista.Caminhao("Volvo")

    // Criando um instancia de uma InnerClass
    // A innerClass é dependente de uma instancia da classe onde está contida
    val motorista2 = Motorista("Jordan")
    val caminhao = motorista2.Caminhao2("Volvo")
    caminhao.exibirCaminhao()*/
}