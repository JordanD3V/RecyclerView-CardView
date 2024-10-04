package com.example.aulacomponenteslistagem.teste

interface Conector{
    fun quantidadePinos() : Int
    fun ligarAparelho()
}

class TomadaAntiga(val conector: Conector){
    fun passarEnergia(){
        val qtdPinos = conector.quantidadePinos()
        if( qtdPinos == 2){
            conector.ligarAparelho()
            println("Quantidade de pinos: $qtdPinos")
            println("Passando Energia")
        } else{
            println("Essa tomada funciona apenas com 2 pinos, você passou uma tomada com $qtdPinos")
        }
    }
}

class ConectorNovoPadrao: Conector{
    override fun quantidadePinos() : Int{
        return 3
    }
    override fun ligarAparelho() {
        println("Aparelho ligado")
    }
}

class ConectorAdaptador (val conectorNovoPadrao: ConectorNovoPadrao): Conector{
    override fun quantidadePinos(): Int {
        return 2
    }
    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho()
    }
}

fun main() {

    val conectorNovoPadrao = ConectorNovoPadrao()

    val conectorAdaptador = ConectorAdaptador(conectorNovoPadrao)

    val tomadaAntiga = TomadaAntiga(conectorAdaptador )
    tomadaAntiga.passarEnergia()

}