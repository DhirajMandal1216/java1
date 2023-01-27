package com.java.practice.conditional_statement.arrays;


public class Insertion {
    public static void main(String[] args) {
        int []A=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        int n=6;
        System.out.println("Before insertion");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
        System.out.println();
        int index=2;
        int value=20;
        for(int i=n;i>index;i--){
            A[i]=A[i-1];
        }
        A[index]=value;
        System.out.println("After insertion");
        for(int i=0;i<n;i++) {
            System.out.print(A[i] + ",");
        }


    }
}
/*
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int s=sc.nextInt();
        System.out.println("How many elements of an array we want int range of "+s);
        int n=sc.nextInt();
        System.out.println("Enter elements of an array");
        int []A=new int[s];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter index of new number to insert in an array");
        int index=sc.nextInt();
        System.out.println("Enter value of index");
        int value=sc.nextInt();
        System.out.println("Before insertion");

        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
        System.out.println();


        for(int i=n;i>index;i--){
            A[i]=A[i-1];

        }
        A[index]=value;
        System.out.println("After insertion");
        for(int i=0;i<n+1;i++){
            System.out.print(A[i]+",");
        }
    }
}

        */