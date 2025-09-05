package com.devsuperior;

import java.util.Scanner;

public class AcimaDiagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        int soma = 0;
        for (int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
                if (j > i){
                    soma += mat[i][j];
                }
            }
        }

        System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);

        sc.close();

    }
}
