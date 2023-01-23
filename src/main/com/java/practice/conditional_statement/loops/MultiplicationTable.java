package com.java.practice.conditional_statement.loops;

import java.util.Scanner;
//Display multiplication of table.
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int n=sc.nextInt();//n=number
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
