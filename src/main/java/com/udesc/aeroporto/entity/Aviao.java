package com.udesc.aeroporto.entity;

import com.udesc.aeroporto.model.ModeloAviao;

public class Aviao {
    private int idAviao;
    private int numRegisto;
    private ModeloAviao modelo;

    public int getIdAviao() {
        return idAviao;
    }

    public Aviao setIdAviao(int idAviao) {
        this.idAviao = idAviao;
        return this;
    }

    public int getNumRegisto() {
        return numRegisto;
    }

    public Aviao setNumRegisto(int numRegisto) {
        this.numRegisto = numRegisto;
        return this;
    }

    public ModeloAviao getModelo() {
        return modelo;
    }

    public Aviao setModelo(ModeloAviao modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public String toString() {
        return "aviao{" +
                "idAviao=" + idAviao +
                ", numRegisto=" + numRegisto +
                ", modelo=" + modelo +
                '}';
    }
}
