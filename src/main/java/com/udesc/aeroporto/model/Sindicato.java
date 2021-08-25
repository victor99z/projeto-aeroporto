package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sindicato {
    @Id
    private String id;
    private Empregado empregado;

    public String getId() {
        return id;
    }

    public Sindicato setId(String id) {
        this.id = id;
        return this;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public Sindicato setEmpregado(Empregado empregado) {
        this.empregado = empregado;
        return this;
    }

    @Override
    public String toString() {
        return "Sindicato{" +
                "id='" + id + '\'' +
                ", empregado=" + empregado +
                '}';
    }
}
