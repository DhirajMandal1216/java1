package com.java.practice.conditional_statement.loops.pattern;

public class Pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");

                }

            }
            System.out.println(" ");
        }
    }
}
