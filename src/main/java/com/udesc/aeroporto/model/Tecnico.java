package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document
public class Tecnico extends Empregado{

    private String nome;
    private Integer matricula;
    private String endereco;
    private String telefone;
    private BigDecimal salario;
    private List<Aviao> avioes;


    public String getNome() {
        return nome;
    }

    public Tecnico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Tecnico setMatricula(Integer matricula) {
        this.matricula = matricula;
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

    public List<Aviao> getAvioes() {
        return avioes;
    }

    public Tecnico setAvioes(List<Aviao> avioes) {
        this.avioes = avioes;
        return this;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                ", avioes=" + avioes +
                "} " + super.toString();
    }
}
