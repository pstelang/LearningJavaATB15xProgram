package ex_11jan_exam;

import java.util.Scanner;

public class CheckEvenOROddnumber {
    //2) Even or Odd Number

   // Description:
   // Write a Java program to check whether a given number is even or odd using arithmetic operators.
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
       if(num%2==0)
       {
           System.out.println("Number is Even");
       }
       else {
           System.out.println("Number is odd");
       }
       sc.close();

   }



}
