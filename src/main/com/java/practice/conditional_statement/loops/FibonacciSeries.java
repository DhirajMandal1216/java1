package com.java.practice.conditional_statement.loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to print fibonacci Series");
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter how many number of series you want = ");
        int n=sc.nextInt();
        int c=0;
       /*for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ,");

        }*/
        while (n>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ,");
            n--;
        }



    }
}
