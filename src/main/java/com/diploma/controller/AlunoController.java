package com.diploma.controller;
import com.diploma.entity.Aluno;
import com.diploma.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    AlunoService alunoService = new AlunoService();

    @PostMapping("/cadastra")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
        alunoService.adicionaAluno(aluno);
        return aluno;
    }

    @GetMapping("/exibeAlunos")
    public List<Aluno> exibirAlunos(){
       return alunoService.getListaAlunos();
    }

    @GetMapping("/exibe/{nome}")
    public Aluno exibirAluno(@PathVariable String nome){
        return alunoService.getAluno(nome);
    }

    @GetMapping("/remove/{nome}")
    public String removerAluno(@PathVariable String nome){
       return alunoService.removeAluno(nome);
    }

    @PutMapping("/altera/{nome}")
    public Aluno alterarAluno(@RequestBody Aluno aluno){
        return alunoService.alteraAluno(aluno);
    }

    @GetMapping("/media/{nome}")
    public String calcularAluno(@PathVariable String nome){
        return alunoService.calculaAluno(nome);
    }
}
