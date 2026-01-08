package ex_08_break_contnue_while_dowhie;

public class Continue_even_number {
    public static void main(String[] args){
        for(int i=0;i<50;i++)
        {
            if(i%2!=0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
