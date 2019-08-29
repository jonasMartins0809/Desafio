package br.EntregavelJava;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeCurso;
    private Integer codCurso;
    private ProfessorTitular profDoCurso;
    private ProfessorAdjunto prodAdjDoCurso;
    private Integer quantdeMaxDAlunos ;


    List<Aluno> listAlunos = new ArrayList<>();


    public Curso(String nomeCurso, Integer codCurso, ProfessorTitular profDoCurso, ProfessorAdjunto prodAdjDoCurso, Integer quantdeMaxDAlunos) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.profDoCurso = profDoCurso;
        this.prodAdjDoCurso = prodAdjDoCurso;
        this.quantdeMaxDAlunos = quantdeMaxDAlunos;

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public ProfessorTitular getProfDoCurso() {
        return profDoCurso;
    }

    public void setProfDoCurso(ProfessorTitular profDoCurso) {
        this.profDoCurso = profDoCurso;
    }

    public ProfessorAdjunto getProdAdjDoCurso() {
        return prodAdjDoCurso;
    }

    public void setProdAdjDoCurso(ProfessorAdjunto prodAdjDoCurso) {
        this.prodAdjDoCurso = prodAdjDoCurso;
    }

    public Integer getQuantdeMaxDAlunos() {
        return quantdeMaxDAlunos;
    }

    public void setQuantdeMaxDAlunos(Integer quantdeMaxDAlunos) {
        this.quantdeMaxDAlunos = quantdeMaxDAlunos;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (listAlunos.size() < getQuantdeMaxDAlunos()) {
            listAlunos.add(umAluno);
            System.out.println("O segunite aluno foi adicionado: " + umAluno.getNome() + " " + umAluno.getSobreNome() + "\n"
                    + "A lista da turma de: " + getNomeCurso() + "\n");
            return true;

        } else {
            System.out.println("O Aluno: " + umAluno.getNome() + " " + umAluno.getSobreNome() + " Não podera fazer parte do curso de: " + getNomeCurso() + "\n"+ "pois não a mais vagas");
            return false;
        }

    }

    public void exlcuirAluno(Aluno umAluno){
        listAlunos.remove(umAluno);
        System.out.println("O Aluno foi Removido: " + umAluno.getNome() + " " + umAluno.getSobreNome() +
                "\n" + "Não faz mais parte da turma de: " + getNomeCurso() + "\n");
    }


}