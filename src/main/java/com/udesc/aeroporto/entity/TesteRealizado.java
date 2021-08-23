package com.udesc.aeroporto.entity;

public class TesteRealizado {
    private int idTesteRealizado;
    private String data;
    private String horasGastas;
    private float pontuacaoObtida;
    private Teste test;
    private Tecnico tecnico;

    public int getIdTesteRealizado() {
        return idTesteRealizado;
    }

    public TesteRealizado setIdTesteRealizado(int idTesteRealizado) {
        this.idTesteRealizado = idTesteRealizado;
        return this;
    }

    public String getData() {
        return data;
    }

    public TesteRealizado setData(String data) {
        this.data = data;
        return this;
    }

    public String getHorasGastas() {
        return horasGastas;
    }

    public TesteRealizado setHorasGastas(String horasGastas) {
        this.horasGastas = horasGastas;
        return this;
    }

    public float getPontuacaoObtida() {
        return pontuacaoObtida;
    }

    public TesteRealizado setPontuacaoObtida(float pontuacaoObtida) {
        this.pontuacaoObtida = pontuacaoObtida;
        return this;
    }

    public Teste getTest() {
        return test;
    }

    public TesteRealizado setTest(Teste test) {
        this.test = test;
        return this;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public TesteRealizado setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
        return this;
    }

    @Override
    public String toString() {
        return "testeRealizado{" +
                "idTesteRealizado=" + idTesteRealizado +
                ", data='" + data + '\'' +
                ", horasGastas='" + horasGastas + '\'' +
                ", pontuacaoObtida=" + pontuacaoObtida +
                ", teste=" + test +
                '}';
    }
}
