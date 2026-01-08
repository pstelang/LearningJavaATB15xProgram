package ex_06_if_else_condition;

import java.util.Scanner;

public class Triagnle_classifier {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
//Given three input values representing the lengths of the sides,
//determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
//or scalene (no sides are equal). Use an if-else statement to classify the triangle.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1");
        int a=sc.nextInt();
        System.out.println("Enter side 2");
        int b=sc.nextInt();
        System.out.println("Enetr side 3");
        int c=sc.nextInt();
        if(a==b && b==c)
        {
            System.out.println("The triangle is equilateral");
        }else if(a==b || b==c || a==c)
        {
            System.out.println("The triangle is isosceles ");
        }
        else{
            System.out.println("The triangle is scalene");
        }
        sc.close();
    }
}
