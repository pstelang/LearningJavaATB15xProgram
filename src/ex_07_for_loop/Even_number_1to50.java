package ex_07_for_loop;

public class Even_number_1to50 {
    public static void main(String[] args) {
        //print even number from 1 to 50
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even=>"+ i);
            }
        }
    }
}
