package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@Document(collection = "Funcionario")
public class Funcionario {
    @Id
    private String codigo;
    private String nome;
    private Integer idade;
    private BigDecimal salario;

    public String getCodigo() {
        return codigo;
    }

    public Funcionario setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getIdade() {
        return idade;
    }

    public Funcionario setIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Funcionario setSalario(BigDecimal salario) {
        this.salario = salario;
        return this;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
