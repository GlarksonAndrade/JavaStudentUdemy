package Controle;

import java.util.ArrayList;
import java.util.Scanner;
public class ForIt {
    static ArrayList<String> dias = new ArrayList<>();
    public static void main(String[] args) {
        dias.add("Domingo");
        dias.add("Segunda");
        dias.add("Terça");
        dias.add("Quarta");
        dias.add("Quinta");
        dias.add("Sexta");
        dias.add("Sábado");
        Scanner sc = new Scanner(System.in);
        String escolha = sc.nextLine();

        for(String dia: dias){
            if (dia.equalsIgnoreCase(escolha)){
                System.out.println(dias.indexOf(dia) +1 );
            }
        }





    }

}
