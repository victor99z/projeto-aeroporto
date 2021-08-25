package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Teste {
    @Id
    private String id;
    private Double pontuacao_max;
    private String nome;
    private List<Aviao> avioes;

    public String getId() {
        return id;
    }

    public Teste setId(String id) {
        this.id = id;
        return this;
    }

    public Double getPontuacao_max() {
        return pontuacao_max;
    }

    public Teste setPontuacao_max(Double pontuacao_max) {
        this.pontuacao_max = pontuacao_max;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Teste setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public List<Aviao> getAvioes() {
        return avioes;
    }

    public Teste setAvioes(List<Aviao> avioes) {
        this.avioes = avioes;
        return this;
    }

    @Override
    public String toString() {
        return "Teste{" +
                "id='" + id + '\'' +
                ", pontuacao_max=" + pontuacao_max +
                ", nome='" + nome + '\'' +
                ", avioes=" + avioes +
                '}';
    }
}
