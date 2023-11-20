package ModuloUm.Exercicios;

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
        //boolean abaixopeso = calc < 18.5;

            String teste = obesidade3 ? "Você está Obeso(a) Nível 3!"  :
               obesidade2 ? " Você está Obeso(a) Nivel 2! ":
                       obesidade1 ? "Você está Obeso(a) Nivel 1!" :
                sobrepeso ? "Você está Sobrepeso! " :
                        pesonorm ? "Você está Dentro do seu peso Normal! " :
                                "Você está abáixo do Peso Ideal! ";

       System.out.println(teste);

        entrada.close();
    }
}