package com.uemg.atividade2dispositivosmoveis_app.model;

public class Mercadoria extends Produto {
    private double peso;

    public Mercadoria() {

    }

    public Mercadoria(int codigo, String nome, double peso) {
        super(codigo, nome);
        setPeso(peso);
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0)
            throw new IllegalArgumentException("O peso deve possuir valor positivo");

        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeso: " + peso;
    }
}
