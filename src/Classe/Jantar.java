package Classe;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.25);
        Comida c2 = new Comida("Frango", 0.20);

        Pessoa  p1 = new Pessoa("Luiz", 81.00 ) ;
        Pessoa p2 = new Pessoa("Manoel", 65.00);

        double pesoAntigo = p1.peso;

        p1.comer(c1);
        p1.comer(c2);
        System.out.printf("Antes de comer %s pesava %.2f Kg e após o jantar passou a pesar %.2f Kg",
                                    p1.nome, pesoAntigo, p1.peso );

    }
}
