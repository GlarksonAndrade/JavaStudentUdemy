package Controle.Exercicios;

import java.util.Scanner;

public class bissexto {
    public static void main() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digíte o ano: ");

        int ano = entrada.nextInt();


        if (ano % 100 != 0 && ano % 4 == 0) {
            System.out.printf("O ano %d, é bissexto e tem 366 dias!", ano);
        }
            else if (ano % 400 == 0 && ano % 100 == 0) {
            System.out.printf("O ano %d, é bissexto e tem 366 dias!", ano);
        }
       else
        System.out.printf("O ano %d, não é um ano bissexto e tem 365 dias ", ano);

        entrada.close();

    }
}
