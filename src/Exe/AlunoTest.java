package Exe;

import Dominio.Aluno;
import Dominio.ImpressoraAluno;

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] notas = new double[3];

        System.out.print("Mátricula: ");
        int matricula = teclado.nextInt();

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%dº nota: ", i + 1);
            notas[i] = teclado.nextDouble();
        }

        Aluno aluno = new Aluno(matricula, notas);

        System.out.println("\n-------------");
        ImpressoraAluno.imprimir(aluno);
        teclado.close();
    }
}


