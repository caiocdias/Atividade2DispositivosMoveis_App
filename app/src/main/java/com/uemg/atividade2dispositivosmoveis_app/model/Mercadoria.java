package com.uemg.atividade2dispositivosmoveis_app.model;

public class Mercadoria extends Produto {
    private double peso;

    public Mercadoria() {

    }

    public Mercadoria(double peso) {

    }

    public double getPeso(peso) {
        return this.peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0)
            throw new IllegalArgumentException("O peso deve possuir valor positivo");

        this.peso = peso;
    }

}
