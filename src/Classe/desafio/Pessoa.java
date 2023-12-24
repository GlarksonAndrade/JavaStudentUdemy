package Classe.desafio;

public class Pessoa {

    String nome;
    double peso;


    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }


    double comer (Comida prato ){
        if(prato != null)
        this.peso = this.peso + prato.pesoc;
        return this.peso + prato.pesoc;
    }
}
