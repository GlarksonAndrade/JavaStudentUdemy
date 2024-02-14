package lambdas;

public class Mutiplicar implements Calculo{

    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
