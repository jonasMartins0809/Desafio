package br.EntregavelJava;

public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(String nome, String sobreNome,String especialidade, Integer tempoDeCasa, Integer codProfessor) {
        super(nome, sobreNome, tempoDeCasa, codProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}