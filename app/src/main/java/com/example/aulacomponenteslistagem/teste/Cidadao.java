package com.example.aulacomponenteslistagem.teste;

public class Cidadao {
    private String nome = "";
    private int idade = 0;

    //Utilizando varargs (String...)
    //Isso não é limitado ao tipo String, sendo válido para outros tipos
    // até mesmo classes
    //Permite adicionar mais valores
    //Utilize varargs sempre no final
    public void salvarTelefone(String... telefone){
        System.out.println("Telefone: " + telefone);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
