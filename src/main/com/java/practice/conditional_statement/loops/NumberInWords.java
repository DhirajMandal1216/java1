package com.java.practice.conditional_statement.loops;

import java.util.Scanner;

public class NumberInWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        String str = " ";
        int r;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            str = str+r;
        }
        char c;
        for (int i = str.length() - 1; i > 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("ZERO ");
                    break;
                case '1':
                    System.out.print("ONE ");
                    break;
                case '2':
                    System.out.print("TWO ");
                    break;
                case '3':
                    System.out.print("THREE ");
                    break;
                case '4':
                    System.out.print("FOUR ");
                    break;
                case '5':
                    System.out.print("FIVE ");
                    break;
                case '6':
                    System.out.print("SIX ");
                    break;
                case '7':
                    System.out.print("SEVEN ");
                    break;
                case '8':
                    System.out.print("EIGHT ");
                    break;
                case '9':
                    System.out.print("NINE ");
                    break;
                default:
                    System.out.print("Invalid ");

            }
        }
    }
}