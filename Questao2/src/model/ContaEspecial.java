package model;

public class ContaEspecial extends Conta{
    public ContaEspecial(int numeroDaConta, String nomeTitular, double saldo) {
        super(numeroDaConta, nomeTitular, saldo);
    }

    private double limite;

    public ContaEspecial(int numeroDaConta, String nomeTitular, double saldo, double limite) {
        super(numeroDaConta, nomeTitular, saldo);
        this.limite = limite;
    }

    //imprimir o tipo da conta
    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Especial");
    }

    @Override
    public boolean sacar(double valor) {
        if(valor<= this.limite + this.saldo){
            this.saldo = saldo - valor;
            return true;
        }else {
            return false;
        }
    }

    //get e sets
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
