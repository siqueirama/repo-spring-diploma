package com.diploma.service;

import com.diploma.entity.Aluno;
import com.diploma.entity.Disciplina;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    List<Aluno> listAluno = new ArrayList<>();

    public void adicionaAluno(Aluno aluno) {
        listAluno.add(aluno);
    }

    public List<Aluno> getListaAlunos() {
        return listAluno;
    }

    public Aluno getAluno(String nome) {
        for (Aluno aluno : listAluno) {
            //    for (int i = 0; i<=listAluno.size(); i++){
            if (aluno.getNome().equals(nome))
                return aluno;
        }
        return null;
    }


    public String removeAluno(String nome) {
        for (Aluno aluno : listAluno) {
            if (aluno.getNome().equals(nome)) {
                listAluno.remove(aluno);
                return "Removido " + aluno.toString();
            } else {
                return "Não encontrado " + nome;
            }
        }
        return null;
    }

    public Aluno alteraAluno(Aluno aluno) {
        for (Aluno alunoAltera : listAluno) {
            if (alunoAltera.getNome().equals(aluno.getNome())) {
                listAluno.set(listAluno.indexOf(alunoAltera),aluno);
                return aluno;
            }
        }return null;
    }


    public String calculaAluno(String nome) {
        for ( Aluno aluno : listAluno){
            double media =0;
            if (aluno.getNome().equals(nome)) {
                for (int i=0; i< aluno.getDisciplinas().size(); i++){
                    media += aluno.getDisciplinas().get(i).getNota();
                }
                Double mediaTotal =media/aluno.getDisciplinas().size();
                String resultado = String.format("%.2f", mediaTotal);
                String mensagem= "";
                if (mediaTotal >= 9){ mensagem = "- PARABÉNS!";}
                return aluno.toString()+"\n"+" Média: "+resultado + mensagem;
            }
        }
        return "Aluno não encontrado!";
    }
}
