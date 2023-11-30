package Controle.Exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o ano Inicial");
        int anoinicial = entrada.nextInt();

        System.out.println("Digite o ano Final");
        int anofinal = entrada.nextInt();

        int ano = 0;

        int total = 0;

        int bisexto = 0;
        int normal = 0;

        for (ano = anofinal; ano != anoinicial; ano--) {

            if (ebissexto(ano)) {
                total = total+ 366;
                bisexto++;
            } else
                total = total + 365;
                normal++;
        }
        System.out.printf("Neste intervalo de anos temos,\n%d, anos bissextos,\n%d anos normais e um total de %d dias", bisexto, normal, total);

        entrada.close();
    }

    static boolean ebissexto(int ano) {
        if (ano % 100 != 0 && ano % 4 == 0) {
            //System.out.printf("O ano %d, é bissexto e tem 366 dias!", ano);
            return true;
        } else if (ano % 400 == 0 && ano % 100 == 0) {
            //System.out.printf("O ano %d, é bissexto e tem 366 dias!", ano);
            return true;
        } else {
            //System.out.printf("O ano %d, não é um ano bissexto e tem 365 dias ", ano);
        }
        return false;

    }

}


