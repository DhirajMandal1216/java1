package com.java.practice.conditional_statement.loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int m=n;
        int sum=0,r;
        while (n>0){
            r=n%10;
            n=n/10;
            sum=sum+(r*r*r);
        }
        if(m==sum){
            System.out.println("These is Armstrong Number");
        }
        else{
            System.out.println("These is not Armstrong Number");
        }

    }
}
