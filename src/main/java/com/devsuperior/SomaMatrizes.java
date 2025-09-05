package com.devsuperior;

import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        int m = sc.nextInt();

        System.out.print("Quantas colunas vai ter cada matriz? ");
        int n = sc.nextInt();

        int[][] matA = new int[m][n];
        int[][] matB = new int[m][n];
        int[][] matSoma = new int[m][n];

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < matA.length; i++){
            for (int j=0; j < matA[i].length; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < matB.length; i++){
            for (int j=0; j < matB[i].length; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matB[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ SOMA:");
        for (int i=0; i < matSoma.length; i++){
            for (int j=0; j < matSoma[i].length; j++){
                matSoma[i][j] = matA[i][j] + matB[i][j];
                System.out.print(matSoma[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
