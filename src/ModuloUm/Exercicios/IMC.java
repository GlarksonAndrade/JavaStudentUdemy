package ModuloUm.Exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a sua altura? ");
        double altura = entrada.nextDouble();

        System.out.println("Qual é o seu peso? ");
        double peso = entrada.nextDouble();

        double calc = peso / (altura * altura);


        System.out.printf("Seu IMC ideal é: %.2f " , calc);


        entrada.close();
    }
}
