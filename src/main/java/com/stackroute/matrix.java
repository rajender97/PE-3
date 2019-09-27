package com.stackroute;

import java.util.Scanner;

public class matrix {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix : ");
        int row1 = scan.nextInt();
        System.out.println("Enter the columns of first matrix : ");
        int col1 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the number of rows of Second matrix : ");
        int row2 = scan2.nextInt();
        System.out.println("Enter the columns of Second matrix : ");
        int col2 = scan.nextInt();
        if(row1==row2 && col1==col2) {
            int[][] matrix1 = new int[row1][col1];
            int i, j;
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++) {
                    Scanner str = new Scanner(System.in);
                    System.out.println("Enter the " + (i + 1) + " row and " + (j + 1) + " column element of first matrix : ");
                    matrix1[i][j] = str.nextInt();
                }
            }
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++) {
                    System.out.print(matrix1[i][j]);
                    System.out.print(" ");
                }
            }


            int[][] matrix2 = new int[row2][col2];

            for (i = 0; i < row2; i++) {
                for (j = 0; j < col2; j++) {
                    Scanner str2 = new Scanner(System.in);
                    System.out.println("Enter the " + (i + 1) + " row and " + (j + 1) + " column element of second matrix : ");
                    matrix2[i][j] = str2.nextInt();
                }
            }
            for (i = 0; i < row2; i++) {
                for (j = 0; j < col1; j++) {
                    System.out.print(matrix2[i][j]);
                    System.out.print(" ");
                }
            }
            int[][] sum = new int[row1][col1];
            for (i = 0; i < row1; i++) {
                for(j=0;j<col1;j++){

                    sum[i][j] = matrix1[i][j]+matrix2[i][j];
                }

            }
            for(i=0;i<row1;i++){
                for (j=0;j<col1;j++){
                    System.out.print(+sum[i][j]);
                    System.out.print("  ");
                }
                System.out.println(" ");
            }
        }
        else
        {
            System.out.println("Sorry! Summation of enterd two matrices not possible ");
        }

    }
}
