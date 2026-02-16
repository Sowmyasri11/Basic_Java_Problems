package com.day3;

import java.util.Scanner;

public class ArraySmallestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Smallest Number is "+smallestElement(arr));
    }
    public static int smallestElement(int[] arr){
        int smallestNum=Integer.MAX_VALUE;
        int smallestIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallestNum){
                smallestNum=arr[i];
            }
        }
        return smallestNum;
    }
}
