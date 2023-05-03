package strategy;

public class PotenciaStrategy implements OperacaoStrategy{

    @Override
    public double calcular(int a, int b) {
        return Math.pow(a,b);
    }
}
