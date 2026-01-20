package ex_jan_18_exam;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        // String s="welcome";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }

}
