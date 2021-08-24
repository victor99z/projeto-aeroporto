package com.udesc.aeroporto.entity;

import com.udesc.aeroporto.model.Empregado;

import java.math.BigDecimal;

public class Tecnico extends Empregado {
    private int idTecnico;
    private int numMatricula;
    private String endereco;
    private String telefone;
    private BigDecimal salario;

    public int getIdTecnico() {
        return idTecnico;
    }

    public Tecnico setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
        return this;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public Tecnico setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Tecnico setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Tecnico setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Tecnico setSalario(BigDecimal salario) {
        this.salario = salario;
        return this;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "idTecnico=" + idTecnico +
                ", numMatricula=" + numMatricula +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
