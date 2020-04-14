package com.example.atividade2.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    @Column(nullable=false)
    private String nome;
    private Double salario;
    private String dataNasc;
    private String departamento;

    public Funcionario(String nome, Double salario, String dataNasc, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.dataNasc = dataNasc;
        this.departamento = departamento;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario [dataNasc=" + dataNasc + ", departamento=" + departamento + ", id=" + id + ", nome=" + nome
                + ", salario=" + salario + "]";
    }

   

    
    
}