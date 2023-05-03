import enuns.OperacaoRaiz;
import model.Calculadora;
import enuns.Operacao;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(Operacao.MULTIPLICACAO,6,4));
        System.out.println(calculadora.calcular(Operacao.SOMA,6,4));
        System.out.println(calculadora.calcular(Operacao.DIVISAO,10,2));
        System.out.println(calculadora.calcular(Operacao.SUBTRACAO,6,4));
        System.out.println(calculadora.calcular(Operacao.POTENCIA,2,4));
        System.out.println(calculadora.calcular(Operacao.POTENCIA,2,4));
        System.out.println(calculadora.calcularRaiz(OperacaoRaiz.RAIZ_QUADRADA,9));
        System.out.println(calculadora.calcularRaiz(OperacaoRaiz.RAIZ_CUBICA,27));

    }
}