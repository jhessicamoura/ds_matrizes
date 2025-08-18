package com.devsuperior;

import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        for (int i=0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        System.out.print("QUANTIDADE DE NEGATIVOS = ");
        int cont = 0;
        for (int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    cont++;
                }
            }
        }
        System.out.print(cont);

        sc.close();

    }


}
