package ex_11jan_exam;

public class EvenNumberBetween1to50Dowhile {
    //10) Print Even Numbers
    //
    //Description:
    //Write a Java program to print all even numbers between 1 and 50 using a do-while loop
    public static void main(String[] args) {


        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }while(i<=50);
    }
}