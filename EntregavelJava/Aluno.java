package br.EntregavelJava;

public class Aluno {
    private String nome;
    private String sobreNome;
    private Integer codAluno;

    public Aluno(String nome, String sobreNome, Integer codAluno) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }
}



