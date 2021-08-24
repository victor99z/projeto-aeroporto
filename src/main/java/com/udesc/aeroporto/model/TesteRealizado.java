package com.udesc.aeroporto.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "testesrealizados")
public class TestesRealizados {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtesterealizado;
    @NotNull
    @Column(name = "data_realizacao")
    private Date data;
    @NotNull
    private Time hrs_gastas;
    @NotNull
    private int idempregado;
    @NotNull
    @Column(name="nroa")
    private int idaviao;

    public int getIdtesterealizado() {
        return idtesterealizado;
    }

    public TestesRealizados setIdtesterealizado(int idtesterealizado) {
        this.idtesterealizado = idtesterealizado;
        return this;
    }

    public Date getData() {
        return data;
    }

    public TestesRealizados setData(Date data) {
        this.data = data;
        return this;
    }

    public Time getHrs_gastas() {
        return hrs_gastas;
    }

    public TestesRealizados setHrs_gastas(Time hrs_gastas) {
        this.hrs_gastas = hrs_gastas;
        return this;
    }

    public int getIdempregado() {
        return idempregado;
    }

    public TestesRealizados setIdempregado(int idempregado) {
        this.idempregado = idempregado;
        return this;
    }

    public int getIdaviao() {
        return idaviao;
    }

    public TestesRealizados setIdaviao(int idaviao) {
        this.idaviao = idaviao;
        return this;
    }

    @Override
    public String toString() {
        return "TestesRealizados{" +
                "idtesterealizado=" + idtesterealizado +
                ", data=" + data +
                ", hrs_gastas=" + hrs_gastas +
                ", idempregado=" + idempregado +
                ", idaviao=" + idaviao +
                '}';
    }
}
