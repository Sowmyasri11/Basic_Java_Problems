package com.day3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArrayElementFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        elementFrequency(arr);
    }
    public static void elementFrequency(int[] arr) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Map.Entry<Integer,Integer>> set=map.entrySet();
        for (Map.Entry<Integer,Integer> entry:set){
            System.out.println (entry.getKey() +" : "+entry.getValue());
        }
    }
}
