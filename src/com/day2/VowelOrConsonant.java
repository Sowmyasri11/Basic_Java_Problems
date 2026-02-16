package com.day2;
//1. Write a Program to Check Vowel or Consonant

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String letter = String.valueOf(sc.next().charAt(0)).toLowerCase();

        switch (letter) {
            case "a":
                System.out.println("The  letter is a vowel.");
            case "e":
                System.out.println("The  letter is a vowel");
            case "i":
                System.out.println("The  letter is a vowel");
            case "o":
                System.out.println("The  letter is a vowel");
            case "u":
                System.out.println("The  letter is a vowel");
            default:
                System.out.println("The letter is consonant.");
        }




    }
}
