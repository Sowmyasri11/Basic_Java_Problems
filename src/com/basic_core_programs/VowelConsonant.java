package com.basic_core_programs;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println(ch + " is a consonant.");
        }
        else
        {
            System.out.println(ch + " is a Vowel.");
        }
    }
}
