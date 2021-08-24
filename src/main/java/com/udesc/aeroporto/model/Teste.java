package com.udesc.aeroporto.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "teste")
public class Teste {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nroa;
    @NotNull
    private String nome;
    @NotNull
    private Double pontuacao_max;
    @NotNull
    private int num_registro;

    public int getNroa() {
        return nroa;
    }

    public Teste setNroa(int nroa) {
        this.nroa = nroa;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Teste setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Double getPontuacao_max() {
        return pontuacao_max;
    }

    public Teste setPontuacao_max(Double pontuacao_max) {
        this.pontuacao_max = pontuacao_max;
        return this;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public Teste setNum_registro(int num_registro) {
        this.num_registro = num_registro;
        return this;
    }

    @Override
    public String toString() {
        return "Teste{" +
                "nroa=" + nroa +
                ", nome='" + nome + '\'' +
                ", pontuacao_max=" + pontuacao_max +
                ", num_registro=" + num_registro +
                '}';
    }
}
