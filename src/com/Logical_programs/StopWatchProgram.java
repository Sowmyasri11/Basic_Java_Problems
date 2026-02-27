package com.Logical_programs;

public class StopWatchProgram {
    public static void main(String[] args) throws Exception {

        System.out.println("Press Enter to Start");
        System.in.read();
        long start = System.currentTimeMillis();

        System.out.println("Press Enter to Stop");
        System.in.read();
        long end = System.currentTimeMillis();

        double elapsed = (end - start) / 1000.0;
        System.out.println("Elapsed Time = " + elapsed + " seconds");
    }
}
