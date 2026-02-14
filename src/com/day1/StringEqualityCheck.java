package com.day1;/*1.3 Write a program to check two strings are equal or not.
*/

import java.util.Scanner;

public class StringEqualityCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.print("Your Strings are the same! ");
        }
        else{
            System.out.print("Your Strings are not the same! ");
        }

    }
}
