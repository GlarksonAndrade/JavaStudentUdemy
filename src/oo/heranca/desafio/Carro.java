package oo.heranca.desafio;

public class Carro {

    int velAtual = 0;


    void acelerar() {
        if (velAtual >= 0) {
            velAtual += 5;
        }

    }
    void frear () {
        if (velAtual >=5) {
            velAtual -=5;
        } else {
            velAtual = 0;
        }
    }
}
