package ex_11jan_exam;

public class ReverseNumberDowhile {
    //11) Reverse a Number
    //
    //Description:
    //Write a Java program to reverse a given number using a do-while loop.
    public static void main(String[] args) {
        int num=1234;
        int rev=0;
        do {
            rev=rev*10+num%10;
            num=num/10;
        }while (num!=0);
        System.out.println(rev);
    }
}
