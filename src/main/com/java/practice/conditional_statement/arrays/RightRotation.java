package com.java.practice.conditional_statement.arrays;

import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want in array:");
        int n=sc.nextInt();
        int[] A =new int[n];

        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("How many times you want to rotated:");
        int r=sc.nextInt();
        //printing whole array element
        System.out.println("Before Rotation");
        for (int i = 0; i<n; i++) {
            System.out.print(A[i] + ",");
        }

        for(int i=1;i<=r;i++){
            int j,last;
            last=A[n-1];
            for(j=n-1;j>0;j--){
                A[j]=A[j-1];
            }
            A[0]=last;
        }
        System.out.println();

        System.out.println("After rotation");
        for (int i = 0; i<n; i++) {
            System.out.print(A[i] + ",");
        }

    }
}
//simple program
/*
public class RightRotation {

public static void main(String[] args) {
    int []A={1,2,3,5,6,8,9,70};

    //before rotation
        System.out.println("Before rotation");
    for(int i=0;i<A.length;i++){
        System.out.print(A[i]+" ");

    }
    System.out.println();

    int last=A[A.length-1];
    for(int i=A.length-1;i>0;i--){
        A[i]=A[i-1];
    }
    System.out.println("After rotation");
    A[0]=last;
    for(int i=0;i<A.length;i++){
        System.out.print(A[i]+" ");
    }

  }

}
*/