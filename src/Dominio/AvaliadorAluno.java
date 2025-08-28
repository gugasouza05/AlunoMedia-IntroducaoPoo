package Dominio;

public class AvaliadorAluno {
    public static double calcularMedia(Aluno aluno) {
        double soma = 0;
        for (double nota : aluno.getNotas()) {
            soma += nota;
        }
        return soma / aluno.getNotas().length;
    }

    public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
