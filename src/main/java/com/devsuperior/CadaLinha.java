package com.devsuperior;

import java.util.Scanner;

public class CadaLinha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                System.out.print("Elemento [" + i + "," + j +"]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for (int i=0; i < mat.length; i++){
            int maior = 0;
            for (int j=0; j < mat[i].length; j++){
                if (mat[i][j] > maior){
                    maior = mat[i][j];
                }
            }
            System.out.println(maior);
        }

        sc.close();

    }
}
