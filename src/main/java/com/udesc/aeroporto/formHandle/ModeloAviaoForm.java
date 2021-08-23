package com.udesc.aeroporto.formHandle;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ModeloAviaoForm {
    @NotNull
    private int codmodelo;
    @NotNull()
    @Size()
    private int capacidade;
    @NotNull()
    @Size(min = 1)
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
