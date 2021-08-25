package com.udesc.aeroporto.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Document
public class Controlador extends Empregado{
    private String nome;
    private String endereco;
    private String num_telefone;
    private BigDecimal salario;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @CreatedDate
    private Date data_exame;

    public String getNome() {
        return nome;
    }

    public Controlador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Controlador setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getNum_telefone() {
        return num_telefone;
    }

    public Controlador setNum_telefone(String num_telefone) {
        this.num_telefone = num_telefone;
        return this;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Controlador setSalario(BigDecimal salario) {
        this.salario = salario;
        return this;
    }

    public Date getData_exame() {
        return data_exame;
    }

    public Controlador setData_exame(Date data_exame) {
        this.data_exame = data_exame;
        return this;
    }

    @Override
    public String toString() {
        return "Controlador{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", num_telefone='" + num_telefone + '\'' +
                ", salario=" + salario +
                ", data_exame=" + data_exame +
                "} " + super.toString();
    }
}
