package com.devsuperior;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        double[][] mat = new double[n][n];
        double[][] matAlterada = new double[n][n];

        double somaPositivos = 0.0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextDouble();
                if (mat[i][j] > 0) {
                    somaPositivos += mat[i][j];
                }
            }
        }

        System.out.println();
        System.out.print("SOMA DOS POSITIVOS: " + somaPositivos);

        System.out.println();
        System.out.println();
        System.out.print("Escolha uma linha: ");
        int linha = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == linha) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.print("Escolha uma coluna: ");
        int coluna = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j == coluna) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < matAlterada.length; i++) {
            for (int j = 0; j < matAlterada[i].length; j++) {
                if (mat[i][j] < 0) {
                    matAlterada[i][j] = mat[i][j] * mat[i][j];
                    System.out.print(matAlterada[i][j] + " ");
                } else {
                    matAlterada[i][j] = mat[i][j];
                    System.out.print(matAlterada[i][j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();

    }
}
