package br.EntregavelJava;

public abstract class  Professor {
    private String nome;
    private String sobreNome;
    private Integer tempoDeCasa;
    private Integer codProfessor;

    public Professor(String nome, String sobreNome, Integer tempoDeCasa, Integer codProfessor) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.tempoDeCasa = tempoDeCasa;
        this.codProfessor = codProfessor;
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

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }
}