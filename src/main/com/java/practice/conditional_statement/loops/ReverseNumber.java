package com.java.practice.conditional_statement.loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number= ");
        int n=sc.nextInt();//n=number
        int r,rev=0;//r=reminder rev=reverse
        while(n>0){
            r=n%10;
            n=n/10;
            rev=rev*10+r;

        }
        System.out.println(rev);
    }
}
