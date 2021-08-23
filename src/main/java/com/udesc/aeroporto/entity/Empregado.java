package com.udesc.aeroporto.entity;

public class Empregado {
    private int idEmpregado;
    private String nome;

    public int getIdEmpregado() {
        return idEmpregado;
    }

    public Empregado setIdEmpregado(int idEmpregado) {
        this.idEmpregado = idEmpregado;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Empregado setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "empregado{" +
                "idEmpregado=" + idEmpregado +
                ", nome='" + nome + '\'' +
                '}';
    }
}
