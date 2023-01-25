package com.java.practice.conditional_statement.arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int sum=0;
        int A[]={3,9,7,8,12,6,15,5,4,10};
        for(int i=0;i<A.length;i++){   //using counter control for loop
            sum=sum+A[i];
        }
        /*
        for(int x:A)    //using for each loop
        {
           sum=sum+x;
        }
        * */
        System.out.println("Sum= "+sum);
    }
}
