package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDOis = n -> n + 2;
        UnaryOperator<Integer> vezesDOis = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDOis
                .andThen(vezesDOis)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(resultado1);


        int resultado2 = aoQuadrado
                .compose(vezesDOis)
                .compose(maisDOis)
                .apply(0);
        System.out.println(resultado2);
    }
}
