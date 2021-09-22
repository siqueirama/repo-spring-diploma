package com.diploma.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Aluno {
    private String nome;
    private String endereco;
    private String idade;
    private List<Disciplina> disciplinas;

    public Aluno(String nome, String endereco, String idade, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.disciplinas = disciplinas;
    }

    public Aluno() {
    }

    @Override
    public String toString() {
        return "Aluno" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade='" + idade + '\'' +
                ", disciplinas=" + disciplinas ;
    }
}
