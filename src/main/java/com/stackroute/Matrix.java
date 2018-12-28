package com.stackroute;

public class Matrix {
    public int[][] addMatrix(int[][] a,int[][] b,int rows,int cols) // for the time being it;s datatype is
    {
        int c[][]=new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for (int j=0; j <cols; j++) {
                c[i][j] = a[i][j] + b[i][j];    //use - for subtraction
                System.out.print(c[i][j] + " ");
            }
        }
        return c;
    }
}
