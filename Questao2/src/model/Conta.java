package model;

public class Conta {
    private int numeroDaConta;
    private String nomeTitular;
    protected double saldo;

    public Conta(int numeroDaConta, String nomeTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    //metodo depositar
    public void depositar(double valor){
        saldo = this.getSaldo() + valor;
    }

    //metodo sacar
    public boolean sacar (double valor){
        if(this.getSaldo() >= valor ){
            //saldo = saldo - valor;
            saldo-=valor;
            return true;
        }
        return false;
    }

    //metodo tipo da conta
    public void imprimirTipoConta(){
        System.out.println("Conta comum");
    }


    //gets e sets

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
