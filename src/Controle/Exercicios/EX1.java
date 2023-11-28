package Controle.Exercicios;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String epar = "";
        System.out.println("Digite um numero: ");

        int numero = entrada.nextInt();

        switch (numero){
            case 10: case 8: case 6: case 4: case 2:
                epar = "O numero digitado é par! ";
                break;
            default:
                epar = " Numero Digitado é inválido! ";
        }
        System.out.println(epar);

        entrada.close();
    }
}
