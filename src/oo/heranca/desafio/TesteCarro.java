package oo.heranca.desafio;

public class TesteCarro {

    public static void main(String[] args) {


        Carro c1 = new Civic();
        Carro c2 = new Ferrari();

        System.out.println( c1.velAtual + "\n" + c2.velAtual);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        System.out.println( c1.velAtual + "\n" + c2.velAtual);

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        c2.frear();
        c2.frear();
        c2.frear();
        c2.frear();

        System.out.println( c1.velAtual + "\n" + c2.velAtual);

    }
}
