package com.day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year=scan.nextInt();
        boolean isLeap=false;
        if(year > 1582){
            isLeap=(year % 4 ==0 && year%100 !=0) || (year % 400 ==0);
        }
        if(isLeap){
            System.out.println(year+" is a Leap year");
        }
        else{
            System.out.println(year+" is Not a leap year");
        }
    }
}
