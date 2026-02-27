package com.Logical_programs;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static int getRandom(int n) {
        Random r = new Random();
        return r.nextInt(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        while (set.size() < n) {
            int num = getRandom(n);
            count++;
            set.add(num);
        }

        System.out.println("Total Random Numbers Generated = " + count);
    }


}
