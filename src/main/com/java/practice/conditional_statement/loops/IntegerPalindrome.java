package com.java.practice.conditional_statement.loops;

import java.util.Scanner;
//Palindrome means any number or string are read both the side we get same output ex=madam, 512215.
public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int r,rev=0;
        int m=n;
        while(n>0){
            r=n%10;
            n=n/10;
            rev=(rev*10)+r;
        }
        if(rev==m){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
