package com.udesc.aeroporto.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "tecnico")
public class Tecnico{
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idempregado;
    @NotNull
    @Column(name = "num_matricula")
    private int numMatricula;
    @NotNull
    private String nome;
    @NotNull
    private String endereco;
    @NotNull
    @Column(name = "num_telefone")
    private String telefone;
    @NotNull
    private BigDecimal salario;

    public int getIdempregado() {
        return idempregado;
    }

    public Tecnico setIdempregado(int idempregado) {
        this.idempregado = idempregado;
        return this;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public Tecnico setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Tecnico setNome(String nome) {
        this.nome = nome;
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
                "idempregado=" + idempregado +
                ", numMatricula=" + numMatricula +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                '}';
    }
}
