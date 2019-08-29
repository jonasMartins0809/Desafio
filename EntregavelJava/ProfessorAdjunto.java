package br.EntregavelJava;

public class ProfessorAdjunto extends Professor {
    private Integer horasDeMentoria;

    public ProfessorAdjunto(String nome, String sobreNome,Integer horasDeMentoria, Integer tempoDeCasa, Integer codProfessor) {
        super(nome, sobreNome, tempoDeCasa, codProfessor);
        this.horasDeMentoria = horasDeMentoria;
    }

    public Integer getHorasDeMentoria() {
        return horasDeMentoria;
    }

    public void setHorasDeMentoria(Integer horasDeMentoria) {
        this.horasDeMentoria = horasDeMentoria;
    }
}