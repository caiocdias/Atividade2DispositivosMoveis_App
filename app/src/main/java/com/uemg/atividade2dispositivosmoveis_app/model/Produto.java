package com.uemg.atividade2dispositivosmoveis_app.model;

public class Produto {
    private int codigo;
    private String nome;

    public Produto() {

    }

    public Produto(int codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCodigo(int codigo) {
        if (codigo < 0 )
            throw new IllegalArgumentException("O codigo nao pode ser negativo");

        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("O nome nao pode ser nulo, vazio ou conter apenas espaços");

        this.nome = nome;
    }
}
