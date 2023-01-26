package com.java.practice.conditional_statement.arrays;

import java.util.Scanner;
public class LeftRotation {
    //left rotation through user input
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want in array:");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("How many times you want to rotated an array:");
        int r=sc.nextInt();
        System.out.println("Before Rotation");
        //printing array before left rotation
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
        System.out.println(" ");

        for(int i=0;i<r;i++){//this loop is used for rotation number
            int j,first;
            first=A[0];

            for(j=1;j<n;j++){//this loop is used for rotating each an element of an array
                A[j-1]=A[j];
            }
            A[n-1]=first;
        }
        System.out.println();
        //printing array After left rotation
        System.out.println("After Rotation");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
    }
}
//simple program
/*
public class LeftRotation {
public static void main(String[] args) {
    int A[]={1,2,3,5,6,8,9,70};

    //before rotation
        System.out.println("Before rotation");
    for(int i=0;i<A.length;i++){
        System.out.print(A[i]+" ");
        System.out.println();
    }
    System.out.println();
    int first=A[0];
    for(int i=1;i<A.length;i++){
        A[i-1]=A[i];
    }
    A[A.length-1]=first;
    //After rotation
        System.out.println("After rotation");
    for(int i=0;i<A.length;i++){
        System.out.print(A[i]+" ");
        System.out.println();
         }
  }

}

*/
