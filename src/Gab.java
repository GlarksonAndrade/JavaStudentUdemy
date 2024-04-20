import java.util.Scanner;

public class Gab {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

          System.out.println("Digite dois numero : ");

          double  scan1 = sc1.nextDouble();
          double  scan2 = sc1.nextDouble();

                 System.out.println("Para Mutiplicar digite 1, para somar digite 2, Para subtrair digite 3 e Para dividir digite 4");
                    int scanOperador = sc1.nextInt();

                       double resultado = 0;

         if (scanOperador == 1)
             resultado  = scan1 * scan2;
         else if (scanOperador ==2 ) resultado = scan1 + scan2;
         else if (scanOperador== 3) resultado = scan1 - scan2;
         else if (scanOperador== 4) resultado = scan1 / scan2;

        System.out.print("O resultado é: " + resultado);




        sc1.close();

    }
}
