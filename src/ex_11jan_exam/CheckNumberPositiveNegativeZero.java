package ex_11jan_exam;

import java.util.Scanner;

public class CheckNumberPositiveNegativeZero {

    //5) Positive, Negative or Zero

    //Description:
   // Write a Java program to check whether a given number is positive, n
    // egative, or zero using the ternary operator.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Number is positive");
        }else if (num<0)
        {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }

    }
}
