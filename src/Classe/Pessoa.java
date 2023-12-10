package Classe;

public class Pessoa {

    String nome;
    double peso;


    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }


    double comer (Comida prato ){
        this.peso = this.peso + prato.pesoc;
        return this.peso + prato.pesoc;
    }

}
