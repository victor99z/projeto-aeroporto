package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Aviao {
    @Id
    private String id;
    private String num_registro;
    private Modelo modelo;

    public String getId() {
        return id;
    }

    public Aviao setId(String id) {
        this.id = id;
        return this;
    }

    public String getNum_registro() {
        return num_registro;
    }

    public Aviao setNum_registro(String num_registro) {
        this.num_registro = num_registro;
        return this;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Aviao setModelo(Modelo modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "id='" + id + '\'' +
                ", num_registro='" + num_registro + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
