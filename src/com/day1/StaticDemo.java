package com.day1;

public class StaticDemo {
    static int num=0;
    static{
        System.out.println("static Block started executing .....");
        num=10;
    }
    static void displayNum(){
        System.out.println("The value in static method is  : "+num);

    }

    void concreteMethod(){
        System.out.println("concreteMethod value = "+num);
    }
    public static void main(String[] args) {
        System.out.println("main block started executing ....");

        System.out.println("Initial Value: "+num);

        displayNum();

        StaticDemo obj=new StaticDemo();
        obj.concreteMethod();
    }


}
