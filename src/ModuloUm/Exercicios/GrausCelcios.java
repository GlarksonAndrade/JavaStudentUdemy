package ModuloUm.Exercicios;

import java.util.Scanner;

public class GrausCelcios {
    public static void main(String[] args) {

        // converter Fahrenheit para Celsius

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a Temperatura em Fahrenheit: ");
        //DecimalFormat deci = new DecimalFormat("00,00"); < ---  esse metodo não funcionou
        // Procurar entender como funciona o metodo DecimalFormat do Scanner

        double grauf = entrada.nextDouble();
        double sub = grauf - 32;
        double result = sub / 1.8;

        System.out.printf("A temperatura digitada em Graus Celcius é: %.2f Cº", result );

        entrada.close();
    }
}
