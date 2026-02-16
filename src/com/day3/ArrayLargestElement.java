package com.day3;

import java.util.Scanner;

public class ArrayLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest value : "+largestElement(arr));
    }
    public static int largestElement(int[] arr) {
        int largestNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }

        }
        return largestNum;
    }
}
