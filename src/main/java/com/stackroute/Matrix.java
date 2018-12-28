package com.stackroute;

public class Matrix

{
public int[][] Sum(int[][]a,int[][]b)
{
    int [][]c=new int[a.length][a[0].length];

    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            c[i][j]=a[i][j] + b[i][j];
        }
    }


return c;
}
}
