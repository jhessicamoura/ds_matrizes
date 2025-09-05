package com.devsuperior;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int n = sc.nextInt();

        System.out.print("Qual a quantidade de colunas da matriz? ");
        int m = sc.nextInt();

        double[][] mat = new double[n][m];

        for (int i = 0; i < mat.length; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + "a. linha: ");
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        System.out.println("VETOR GERADO: ");
        for (int i = 0; i < mat.length; i++) {
            double somaLinha = 0.0;
            for (int j = 0; j < mat[i].length; j++) {
                somaLinha += mat[i][j];
            }
            System.out.println(somaLinha);
        }


        sc.close();

    }
}
