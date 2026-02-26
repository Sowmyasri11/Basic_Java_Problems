package com.basic_core_programs;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N must be between 0 and 30");
        int n = sc.nextInt();



        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}
