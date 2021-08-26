package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


@Document
public class TesteRealizado {
    @Id
    private String id;
    private Double pontuacao_obtida;
    @DateTimeFormat(pattern = "HH:mm:ss")
    private String horas_gastas;
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private String data;
    private Teste teste;
    private Empregado empregado;

    public String getId() {
        return id;
    }

    public TesteRealizado setId(String id) {
        this.id = id;
        return this;
    }

    public Double getPontuacao_obtida() {
        return pontuacao_obtida;
    }

    public TesteRealizado setPontuacao_obtida(Double pontuacao_obtida) {
        this.pontuacao_obtida = pontuacao_obtida;
        return this;
    }

    public String getHoras_gastas() {
        return horas_gastas;
    }

    public TesteRealizado setHoras_gastas(String horas_gastas) {
        this.horas_gastas = horas_gastas;
        return this;
    }

    public String getData() {
        return data;
    }

    public TesteRealizado setData(String data) {
        this.data = data;
        return this;
    }

    public Teste getTeste() {
        return teste;
    }

    public TesteRealizado setTeste(Teste teste) {
        this.teste = teste;
        return this;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public TesteRealizado setEmpregado(Empregado empregado) {
        this.empregado = empregado;
        return this;
    }

    @Override
    public String toString() {
        return "TesteRealizado{" +
                "id='" + id + '\'' +
                ", pontuacao_obtida=" + pontuacao_obtida +
                ", horas_gastas='" + horas_gastas + '\'' +
                ", data='" + data + '\'' +
                ", teste=" + teste +
                ", empregado=" + empregado +
                '}';
    }
}
