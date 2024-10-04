package com.example.aulacomponenteslistagem.teste

//DRY - Don't repeat yourself (Não repita código
//Divisão de Responsabilidades
//Alto acoplamento e Baixo Acoplamente
// Classes devem utilizar outras classes

class Musico(val instrumentos: Instrumentos){
    fun tocar(){
        //val violao = Violao()// Alto acoplamento
        println("Músico tocando")
        instrumentos
    }
}

/*abstract class Instrumentos{
    abstract fun sendoTocado()
}*/
interface Instrumentos{
     fun sendoTocado()
}

class Violao : Instrumentos{ // Dois tipos: Violão e Instrumento
    override fun sendoTocado(){
        println("Utilizar as cordas")
        println("Para tocar o violão")
    }
}

class Bateria: Instrumentos{
    override fun sendoTocado(){
        println("Utilizar as baquetas")
        println("Para tocar a bateria")
    }
}


fun main() {

    //val violao: Instrumentos = Violao()
    //Tela1
    val violao = Violao()
    val musico1 = Musico(violao)
    musico1.tocar()

    //Tela2
    val violao2 = Violao()
    val musico2 = Musico(violao)
    musico2.tocar()

    //Tela3

    val musico3 = Musico(violao)
    musico3.tocar()
}