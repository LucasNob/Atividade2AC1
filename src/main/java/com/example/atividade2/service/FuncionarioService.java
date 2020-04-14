package com.example.atividade2.service;

import java.util.List;

import com.example.atividade2.entity.Funcionario;
import com.example.atividade2.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getFuncionarios(){
        return repository.findAll();
    }
    public void newFuncionario(String nome,double salario, String dataNasc, String departamento){
        repository.save(new Funcionario(nome,salario,dataNasc,departamento));
    }
}

