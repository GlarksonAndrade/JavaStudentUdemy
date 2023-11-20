package ModuloUm;

import java.util.Scanner;
public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler Num1
        // Ler num2
        // + - * / %

        System.out.println("Digite o Primeiro Numero:");
        Scanner entrada = new Scanner(System.in);
        double num1 = entrada.nextDouble();

        System.out.println("Digite o Segundo Numero:");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operação:");
        String operador = entrada.next();

        // Lógica

        double resultado = "+".equals(operador) ? num1 + num2 : 0;
         resultado = "-".equals(operador) ? num1 - num2 : resultado;
         resultado = "*".equals(operador) ? num1 * num2 : resultado;
         resultado = "/".equals(operador) ? num1 / num2 : resultado;
         resultado = "%".equals(operador) ? num1 % num2 : resultado;


       System.out.printf("%.2f %s %.2f = %.2f",
               num1, operador, num2, resultado);

       entrada.close();

    }
}
