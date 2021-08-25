package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Modelo {
    @Id
    private String id;
    private String codigo_modelo;
    private Double capacidade;
    private Integer peso;

    public String getId() {
        return id;
    }

    public Modelo setId(String id) {
        this.id = id;
        return this;
    }

    public String getCodigo_modelo() {
        return codigo_modelo;
    }

    public Modelo setCodigo_modelo(String codigo_modelo) {
        this.codigo_modelo = codigo_modelo;
        return this;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public Modelo setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
        return this;
    }

    public Integer getPeso() {
        return peso;
    }

    public Modelo setPeso(Integer peso) {
        this.peso = peso;
        return this;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "id='" + id + '\'' +
                ", codigo_modelo='" + codigo_modelo + '\'' +
                ", capacidade=" + capacidade +
                ", peso=" + peso +
                '}';
    }
}
