package com.day1;/*
1.4 To find the sum of command-line arguments and count the invalid integers entered.
 */


public class SumCommandLineArgs {
    public static void main(String[] args){
        int sum=0;
        int invalidcount=0;
        for(String arg:args){
            try{
                int num=Integer.parseInt(arg);
                sum+=num;
            }
            catch(NumberFormatException e){
                invalidcount++;
            }
        }
        System.out.println(sum);
        System.out.println(invalidcount);
    }
}
