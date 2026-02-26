package com.basic_core_programs;


import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number (non zero integer): ");
        int n = sc.nextInt();



        double harmonic = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("Harmonic Number: " + harmonic);
    }
}