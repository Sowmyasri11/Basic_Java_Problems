package com.Functional_Programs;


import java.util.Scanner;

/*
1. 2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.
*/
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows = sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        System.out.println("2D Array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }

}
