package Dominio;

public class Aluno {
    private int matricula;
    private double[] notas;

    public Aluno(int matricula, double[] notas) {
        if (!ValidarAluno.validarMatricula(matricula)) {
            throw new IllegalArgumentException("Matrícula inválida! Deve estar entre 0001 e 5000.");
        }
        if (!ValidarAluno.validarNotas(notas)) {
            throw new IllegalArgumentException("Notas inválidas! Cada nota deve estar entre 0 e 10.");
        }
        this.matricula = matricula;
        this.notas = notas;
    }

    public int getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }
}
