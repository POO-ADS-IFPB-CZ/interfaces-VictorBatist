package model;

import interfaces.Investimento;

public class ContaPoupanca extends Conta implements Investimento {
    private double rendimentos;
    public ContaPoupanca(int numeroDaConta, String nomeTitular, double saldo, double rendimentos) {
        super(numeroDaConta, nomeTitular, saldo);
        this.rendimentos = rendimentos;
    }

    @Override
    public void reajustar(double valor) {
        Investimento.super.reajustar(valor);
    }

    //imprimir o tipo da conta
    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Poupança");
    }

}
