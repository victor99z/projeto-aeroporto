package com.udesc.aeroporto.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

@Entity
@Table(name = "testerealizado")
public class TesteRealizado {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtesterealizado;
    @NotNull
    @Column(name = "data_realizacao")
    private Date data;
    private LocalTime hrs_gastas;
    @NotNull
    private int idempregado;
    @NotNull
    @Column(name="nroa")
    private int idtest;
    @NotNull
    private Double pontuacao_obtida;

    public int getIdtesterealizado() {
        return idtesterealizado;
    }

    public TesteRealizado setIdtesterealizado(int idtesterealizado) {
        this.idtesterealizado = idtesterealizado;
        return this;
    }

    public Date getData() {
        return data;
    }

    public TesteRealizado setData(Date data) {
        this.data = data;
        return this;
    }

    public LocalTime getHrs_gastas() {
        return hrs_gastas;
    }

    public TesteRealizado setHrs_gastas(LocalTime hrs_gastas) {
        this.hrs_gastas = hrs_gastas;
        return this;
    }

    public int getIdempregado() {
        return idempregado;
    }

    public TesteRealizado setIdempregado(int idempregado) {
        this.idempregado = idempregado;
        return this;
    }

    public int getIdtest() {
        return idtest;
    }

    public TesteRealizado setIdtest(int idtest) {
        this.idtest = idtest;
        return this;
    }

    public Double getPontuacao_obtida() {
        return pontuacao_obtida;
    }

    public TesteRealizado setPontuacao_obtida(Double pontuacao_obtida) {
        this.pontuacao_obtida = pontuacao_obtida;
        return this;
    }

    @Override
    public String toString() {
        return "TesteRealizado{" +
                "idtesterealizado=" + idtesterealizado +
                ", data=" + data +
                ", hrs_gastas=" + hrs_gastas +
                ", idempregado=" + idempregado +
                ", idtest=" + idtest +
                ", pontuacao_obtida=" + pontuacao_obtida +
                '}';
    }
}
