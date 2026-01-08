package ex_08_break_contnue_while_dowhie;

public class factorial_of_number_while_loop {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        int i=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
