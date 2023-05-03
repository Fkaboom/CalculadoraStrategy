package enuns;


import strategy.OperacaoRaizStrategy;
import strategy.OperacaoStrategy;
import strategy.RaizCubicaStrategy;
import strategy.RaizQuadradaStrategy;

public enum OperacaoRaiz {
    RAIZ_QUADRADA(new RaizQuadradaStrategy()),
    RAIZ_CUBICA(new RaizCubicaStrategy());

    private final OperacaoRaizStrategy strategy;

    private OperacaoRaiz(OperacaoRaizStrategy strategy){this.strategy = strategy;}
    public OperacaoRaizStrategy getStrategy(){return strategy;}
}
