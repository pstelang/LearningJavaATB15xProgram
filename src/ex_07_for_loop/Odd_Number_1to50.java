package ex_07_for_loop;

public class Odd_Number_1to50 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
          if(i%2!=0)
          {
              System.out.println("Odd=>"+ i);
          }
        }
    }
}
