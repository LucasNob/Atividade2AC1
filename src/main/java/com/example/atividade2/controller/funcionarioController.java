package com.example.atividade2.controller;

import com.example.atividade2.entity.Funcionario;
import com.example.atividade2.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class funcionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("funcionarios");
        mv.addObject("funcionarios", service.getFuncionarios());
        return mv;
    }
    @PostMapping("/salvarfuncionario")
    public String salvar(@ModelAttribute Funcionario f){
     service.newFuncionario(f);
     return "redirect:/funcionarios";
    }
}