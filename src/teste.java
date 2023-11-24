import java.util.Scanner;

public class teste {


    public static int testeString(String str1,String str2){
       int valor = str1.length() + str2.length();

        return valor;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Tamanho da soma das strings é:"
                        + testeString(sc.nextLine(),sc.nextLine()));
           }
}
