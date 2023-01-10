package com.java.practice.conditional_statement;
//Find a number is odd or even
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" Is even number");
        }
        else{
            System.out.println(n+" Is odd number");
        }
    }
}
