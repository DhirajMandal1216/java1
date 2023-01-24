package com.java.practice.conditional_statement.loops.pattern;
//nested loop
public class Pattern1 {
         /* 1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5*/
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){     //outer loop
            for(int j=1;j<=5;j++){   //inner loop
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
