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

        boolean obesidade3 = calc >= 40;
        boolean obesidade2 = calc <= 39.9 && calc >= 35;
        boolean obesidade1 = calc <= 34.9 && calc >= 30;
        boolean sobrepeso = calc <= 29.9 && calc >= 25;
        boolean pesonorm = calc <= 24.9 && calc >= 18.5;
        boolean abaixopeso = calc < 18.5;

        System.out.println(obesidade3);
        System.out.println(obesidade2);
        System.out.println(obesidade1);
        System.out.println(sobrepeso);
        System.out.println(pesonorm);
        System.out.println(abaixopeso);

        //String resultado = "true".equals(obesidade3) ? "Você está Obeso Nivel 3! " : obesidade2;
        //resultado = "true".equals(obesidade2) ? "Voçê está Obeso Nivel 2! " : obesidade1;

       // boolean resultado = obesidade3 = true ? "Voçê está Obeso Nivel 3! ": 0;
        //resultado = "calc".equals(obesidade2) ? "Voçê está Obeso Nivel 2! ": calc;
       // resultado = "calc".equals(obesidade1) ? "Voçê está Obeso Nivel 1! ": calc;
        //resultado = "calc".equals(sobrepeso) ? "Voçê está Sobrepeso! ": calc;
        //resultado = "calc".equals(pesonorm) ? "Voçê está com o peso normal! ": calc;
       // resultado = "calc".equals(abaixopeso) ? "Voçê está abaixo do peso! ": calc;

        //System.out.println( "vocês está obeso!");


        entrada.close();
    }
}
