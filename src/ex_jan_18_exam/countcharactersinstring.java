package ex_jan_18_exam;

import java.util.Scanner;

public class countcharactersinstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("number of characters excluding spaces"+count);
    }
}
