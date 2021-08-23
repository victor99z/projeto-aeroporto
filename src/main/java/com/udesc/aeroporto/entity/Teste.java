package com.udesc.aeroporto.entity;

public class Teste {
    private int idTeste;
    private String nome;
    private float pontuacaoMax;
    private Aviao aviao;

    public int getIdTeste() {
        return idTeste;
    }

    public Teste setIdTeste(int idTeste) {
        this.idTeste = idTeste;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Teste setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Float getPontuacaoMax() {
        return pontuacaoMax;
    }

    public Teste setPontuacaoMax(Float pontuacaoMax) {
        this.pontuacaoMax = pontuacaoMax;
        return this;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public Teste setAviao(Aviao aviao) {
        this.aviao = aviao;
        return this;
    }

    @Override
    public String toString() {
        return "testes{" +
                "idTeste=" + idTeste +
                ", nome='" + nome + '\'' +
                ", pontuacao_max=" + pontuacaoMax +
                ", aviao=" + aviao +
                '}';
    }
}
