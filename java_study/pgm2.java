package java_study;

import java.util.Scanner;

class Matrix {
    int arr[][];

    Matrix(int arr[][]) {
        this.arr = arr;
    }
}

public class pgm2 {
    static void add(Matrix m1, Matrix m2) {
        if (m1.arr.length == m2.arr.length && m1.arr[0].length == m2.arr[0].length) {
            int rows = m1.arr.length;
            int cols = m1.arr[0].length;
            int res[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++) {
                    res[i][j] = m1.arr[i][j] + m2.arr[i][j];
                }
            System.out.println("Matrix addition is: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Addition not possible!!");
        }
    }

    static void mul(Matrix m1, Matrix m2) {
        if (m1.arr[0].length == m2.arr.length) {
            int rows = m1.arr.length;
            int cols = m2.arr[0].length;
            int res[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++) {
                    int sum=0;
                    for (int k = 0; k < m1.arr[0].length; k++) {
                        sum+= m1.arr[i][k]*m2.arr[k][j];
                    }
                    res[i][j]=sum;
                }
            System.out.println("Matrix multiplication is: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("multiplication not possible!!");
        }
    }

    static void transpose(Matrix m1)
    {
        System.out.println("The transpose is");
        for(int i=0;i<m1.arr.length;i++)
            {
                for(int j=0;j<m1.arr[0].length;j++)
                {
                    System.out.print(m1.arr[j][i]+" ");
                }
            System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix1[][] = new int[][] { { 1, 2 }, { 5, 4 } };
        int matrix2[][] = new int[][] { { 2, 4 }, { 8, 10 } };
        Matrix m1 = new Matrix(matrix1);
        Matrix m2 = new Matrix(matrix2);
        add(m1, m2);
        mul(m1, m2);
        transpose(m1);
        transpose(m2);
    }
}
