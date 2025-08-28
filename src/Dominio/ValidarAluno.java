package Dominio;

public class ValidarAluno {
    public static boolean validarMatricula(int matricula) {
        return matricula >= 1 && matricula <= 5000;
    }

    public static boolean validarNotas(double[] notas) {
        for (double nota : notas) {
            if (nota < 0 || nota > 10) {
                return false;
            }
        }
        return true;
    }
}
