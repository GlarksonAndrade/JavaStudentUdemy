public class DesafioLogico1 {
    public static void main (String [] args) {
        //Trabalho na terça (V ou F)
        // trabalho na Quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        // Operador Unário
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou TV 32\"Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável " + comprouSorvete);



    }
}
