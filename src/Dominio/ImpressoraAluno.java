package Dominio;

public class ImpressoraAluno {
    public static void imprimir(Aluno aluno) {
        double media = AvaliadorAluno.calcularMedia(aluno);
        String situacao = AvaliadorAluno.verificarSituacao(media);

        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + situacao);
    }
}
