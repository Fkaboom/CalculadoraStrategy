package model;

import enuns.Operacao;
import enuns.OperacaoRaiz;

public class Calculadora {
    public double calcular(Operacao operacao, int a, int b){
        return operacao.getStrategy().calcular(a,b);
    }
    public double calcularRaiz(OperacaoRaiz operacaoRaiz, int a){
        return operacaoRaiz.getStrategy().Raiz(a);
    }
}
