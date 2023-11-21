package ModuloUm.Exercicios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da Base: ");
        double base = entrada.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double altura = entrada.nextDouble();

        double resultado = base * altura / 2;

        System.out.println("A área do seu trângulo é: " + resultado);

        entrada.close();
    }
}
