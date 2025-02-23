package view;

import model.Triatleta;

public class Main {
    public static void main(String[] args) {
        Triatleta atleta = new Triatleta("Joao", "Aurelio");

        atleta.aquecer();
        atleta.correr();
        atleta.nadar();
        atleta.correrDeBicileta();
    }
}