package com.java.practice.conditional_statement;

import java.util.Scanner;

public class Grades {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of given subject");
        //e=English M=Maths S=Science H=Hindi
        int e=sc.nextInt();
        int h=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        int total=e+h+m+s;
        double avg=total/4;

       if(avg>=70){
           System.out.println("Grade-A");
       } else if (avg>=60 && avg<70) {
           System.out.println("Grade-B");
       } else if (avg>=50 && avg<60) {
           System.out.println("Grade-C");
       } else if (avg>=40 && avg<50) {
           System.out.println("Grade-D");
       }
       else{
           System.out.println("Grade-F");
       }

    }
}
