package br.EntregavelJava;

import java.util.Date;

public class ,Matricula {

    private Aluno aluno;
    private Curso curso;


        public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;

    }
    public Matricula(){};

    public Matricula(Aluno lucas, Curso android, Date matriculaLucas) {
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


}

