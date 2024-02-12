package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velAtual = 0;
    private int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }



    void acelerar() {
        if (velAtual  + getDelta() > VELOCIDADE_MAXIMA) {
            velAtual = VELOCIDADE_MAXIMA;
        }else {
            velAtual += getDelta();
        }

    }
    void frear () {
        if (velAtual >=5) {
            velAtual -=5;
        } else {
            velAtual = 0;
        }

    }
    public String toString(){
        return "Velocidade atual é " + velAtual +"Km/h.";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
