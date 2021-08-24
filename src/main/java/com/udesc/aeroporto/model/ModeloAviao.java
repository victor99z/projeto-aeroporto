package com.udesc.aeroporto.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "modeloaviao")
public class ModeloAviao{
    @NotNull
    @Id
    private String codmodelo;
    @NotNull
    @Column(name = "capacidade")
    private int capacidade;
    @NotNull
    @Column(name = "peso")
    private Double peso;

    public String getCodmodelo() {
        return codmodelo;
    }

    public ModeloAviao setCodmodelo(String codmodelo) {
        this.codmodelo = codmodelo;
        return this;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public ModeloAviao setCapacidade(int capacidade) {
        this.capacidade = capacidade;
        return this;
    }

    public Double getPeso() {
        return peso;
    }

    public ModeloAviao setPeso(Double peso) {
        this.peso = peso;
        return this;
    }

    @Override
    public String toString() {
        return "ModeloAviao{" +
                "codmodelo='" + codmodelo + '\'' +
                ", capacidade=" + capacidade +
                ", peso=" + peso +
                '}';
    }
}
