package ModuloUm.Exercicios;

import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Valor: ");
        double valor = entrada.nextDouble();

        double quadrado = valor * valor;
        double cubo = valor * valor * valor;

        System.out.println("O quadrado do Valor digitado é: " + quadrado + " e o cubo é: " + cubo);

        entrada.close();
    }
}
