package com.java.practice.conditional_statement.loops;

import java.util.Scanner;

public class ApSeries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter common difference");
        int d=sc.nextInt();
        System.out.println("Enter how many number of series you want = ");
        int n=sc.nextInt();
        int term=a;

        for(int i=1;i<=n;i++){
            System.out.print(term+" ,");
            term=term+d;
        }



    }
}
