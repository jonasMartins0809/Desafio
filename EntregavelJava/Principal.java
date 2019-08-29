package br.EntregavelJava;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Aluno jonas = new Aluno("Jonas","Verdadeiro",11);
        Aluno diego = new Aluno ("Diego","Tenorio",12);
        Aluno lucas = new Aluno("Lucas", "Santos", 13);
        Aluno eduardo = new Aluno("Eduardo", "Pinheiro", 14);


        ProfessorTitular jessica = new ProfessorTitular("Jessica", "Correia","Android",2,321);
        ProfessorAdjunto joao = new ProfessorAdjunto("João", "Camargo",21,5,123);


        Curso android = new Curso("Android",12,jessica,joao,2);
        Date matriculaJonas = new Date (16/01/2019);
        Date matriculaDiego = new Date(05/04/2019);
        Date matriculaLucas = new Date(27/02/2019);
        Date matriculaEduardo = new Date(30/01/2019);

        Matricula matricula1 = new Matricula(jonas,android,matriculaJonas);
        Matricula matricula2 = new Matricula(diego,android,matriculaDiego);
        Matricula matricula3 = new Matricula(lucas,android,matriculaLucas);
        Matricula matricula4 = new Matricula(lucas,android,matriculaEduardo);


        android.adicionarUmAluno(jonas);
        android.adicionarUmAluno(diego);
        android.adicionarUmAluno(lucas);
        android.adicionarUmAluno(eduardo);




    }
}