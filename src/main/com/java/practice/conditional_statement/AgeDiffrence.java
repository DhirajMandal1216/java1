package com.java.practice.conditional_statement;
import java.util.*;
public class AgeDiffrence {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
      int age=sc.nextInt();
      if(age>=14 && age<=55){
          System.out.println("Person is young");
      }
      else{
          System.out.println("Person is not young");
      }
    }
}
