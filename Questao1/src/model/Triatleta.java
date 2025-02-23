package model;

import model.Pessoa;
import interfaces.Ciclista;
import interfaces.Corredor;
import interfaces.Nadador;

public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista {
    public Triatleta (String nome, String endereco){
        super(nome, endereco);
    }

    @Override
    public void correrDeBicileta() {
        System.out.println(this.getNome() + " está correndo de Bike");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando");
    }

    @Override
    public void aquecer() {
        System.out.println(this.getNome() + " está aquecendo");
    }
}
