package com.udesc.aeroporto.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "aviao")
public class Aviao {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num_registro;
    @NotNull
    private String codmodelo;

    public int getNum_registro() {
        return num_registro;
    }

    public Aviao setNum_registro(int num_registro) {
        this.num_registro = num_registro;
        return this;
    }

    public String getCodmodelo() {
        return codmodelo;
    }

    public Aviao setCodmodelo(String codmodelo) {
        this.codmodelo = codmodelo;
        return this;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "num_registro=" + num_registro +
                ", codmodelo='" + codmodelo + '\'' +
                '}';
    }
}
