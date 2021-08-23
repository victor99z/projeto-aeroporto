package com.udesc.aeroporto.entity;

public class Controlador extends Empregado{
    private int idControlador;
    private String dataExame;

    public int getIdControlador() {
        return idControlador;
    }

    public Controlador setIdControlador(int idControlador) {
        this.idControlador = idControlador;
        return this;
    }

    public String getDataExame() {
        return dataExame;
    }

    public Controlador setDataExame(String dataExame) {
        this.dataExame = dataExame;
        return this;
    }

    @Override
    public String toString() {
        return "Controlador{" +
                "idControlador=" + idControlador +
                ", dataExame='" + dataExame + '\'' +
                "} " + super.toString();
    }
}
