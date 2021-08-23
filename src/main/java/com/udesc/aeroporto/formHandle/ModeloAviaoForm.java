package com.udesc.aeroporto.model;

public class ModeloAviaoForm {
    private int codmodelo;
    private int capacidade;
    private Double peso;

    public int getCodmodelo() {
        return codmodelo;
    }

    public void setCodmodelo(int codmodelo) {
        this.codmodelo = codmodelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ModeloAviaoForm{" +
                "codmodelo=" + codmodelo +
                ", capacidade=" + capacidade +
                ", peso=" + peso +
                '}';
    }
}
