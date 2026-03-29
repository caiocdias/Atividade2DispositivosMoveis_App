package com.uemg.atividade2dispositivosmoveis_app.model;

public class Servico extends Produto{
    private double valorHora;

    public Servico() {
    }

    public Servico(int codigo, String nome, double valorHora) {
        super(codigo, nome);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora <= 0)
            throw new IllegalArgumentException("O valor da hora deve possuir valor positivo");

        this.valorHora = valorHora;
    }
}
