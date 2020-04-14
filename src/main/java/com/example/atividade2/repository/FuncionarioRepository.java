package com.example.atividade2.repository;

import com.example.atividade2.entity.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * FuncionarioRepository
 */
public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {

    
}