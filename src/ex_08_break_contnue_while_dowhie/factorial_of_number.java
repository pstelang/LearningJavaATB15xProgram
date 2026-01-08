package ex_08_break_contnue_while_dowhie;

import java.util.Scanner;

public class factorial_of_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorila of number is=>"+fact);
    }
}
