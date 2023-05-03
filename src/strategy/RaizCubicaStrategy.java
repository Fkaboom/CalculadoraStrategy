package strategy;

public class RaizCubicaStrategy implements OperacaoRaizStrategy {
    @Override
    public double Raiz(int a) {
        return Math.cbrt(a);
    }
}
