package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double calc = 0;
        double valor = 0;

        while ( nota != -1){
            System.out.print("Digite a Nota do aluno: ");
            nota = entrada.nextDouble();
            if (nota >= 0 && nota <= 10){
                calc = calc + nota;
                valor = valor + 1;
            } else {
                System.out.println(" Por favor digite uma nota válida!");
            }
        }
        double media = calc  / valor;
        System.out.printf("Voccê digitou %.2f notas e a média do aluno é: %.2f ", valor, media);

        entrada.close();
    }
}
