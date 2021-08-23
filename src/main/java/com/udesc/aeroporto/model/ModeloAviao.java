package com.udesc.aeroporto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "modeloaviao")
public class ModeloAviao{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codmodelo;
    @Column(name = "capacidade")
    private int capacidade;
    @Column(name = "peso")
    private Double peso;

    public int getCodmodelo() {
        return codmodelo;
    }

    public ModeloAviao setCodmodelo(int codModelo) {
        this.codmodelo = codModelo;
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
                "codModelo=" + codmodelo +
                ", capacidade=" + capacidade +
                ", peso=" + peso +
                '}';
    }
}
