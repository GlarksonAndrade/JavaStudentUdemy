package ModuloUm.Exercicios;

import java.util.Scanner;

public class GrausFahren {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Graus Celcius: ");

        double grauc = entrada.nextDouble();
        double calc = grauc * 1.8 + 32;

        System.out.printf("A temperatura Digitada em Fahrenheit é: %.2f" , calc);

        entrada.close();
    }
}
