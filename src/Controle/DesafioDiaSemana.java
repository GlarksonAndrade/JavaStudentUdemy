package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do dia da Semana:");
        String dia = entrada.next();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        } else if ("terça".equalsIgnoreCase(dia)
                || "terca".equalsIgnoreCase(dia)) {
            System.out.println(3);
        } else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println(4);
        } else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println(5);
        } else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println(6);
        } else if ("sábado".equalsIgnoreCase(dia)
                || "sabado".equalsIgnoreCase(dia)) {
            System.out.println(7);
        } else  {
            System.out.println("Dia Inválido!");
        }
        entrada.close();
    }
}
