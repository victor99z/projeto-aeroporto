package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;

public class Empregado {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public Empregado setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "id='" + id + '\'' +
                '}';
    }
}
