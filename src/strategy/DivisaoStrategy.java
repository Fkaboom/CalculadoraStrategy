package strategy;

public class DivisaoStrategy implements OperacaoStrategy{
    @Override
    public double calcular(int a, int b) {
        try {
            return a/b;
        }catch (Exception e){
           throw new ArithmeticException();
        }

    }
}
