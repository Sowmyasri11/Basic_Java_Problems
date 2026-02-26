package com.basic_core_programs;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int flips = sc.nextInt();
        if (flips <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int heads = 0;
        for (int i = 0; i < flips; i++) {
            if (Math.random() < 0.5) heads++;
        }

        double headPercent = (heads * 100.0) / flips;
        double tailPercent = 100 - headPercent;

        System.out.println("Heads: " + headPercent + "%");
        System.out.println("Tails: " + tailPercent + "%");
    }
}