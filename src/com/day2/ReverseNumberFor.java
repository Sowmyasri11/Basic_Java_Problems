package com.day2;

import java.util.Scanner;

public class ReverseNumberFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int lastDigit=0;
        for (int i = n; i > 0; i = i / 10)
        {
            lastDigit = i % 10;
            rev = rev * 10 + lastDigit;
        }
        System.out.println("The reverse number is "+rev);
    }
}
