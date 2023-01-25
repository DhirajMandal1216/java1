package com.java.practice.conditional_statement.arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        //liner search
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int A[]={3,9,7,8,12,6,15,5,4,10};
        for(int i=0;i<A.length;i++){
            if(A[i]==n){
                System.out.println("Number is valid");
            }
        }
        System.out.println("Number is invalid ");

    }
}
