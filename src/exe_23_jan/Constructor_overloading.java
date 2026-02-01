package exe_23_jan;

public class Constructor_overloading {
    public static void main(String[] args) {
        cat c=new cat();
        cat c1=new cat("praveen","male");
        cat c2=new cat("1000");
    }
}

class cat
{
     cat()
     {
         System.out.println("cat drinking milk");
     }

     cat(String name,String gender)
     {
         System.out.println("two parameterized constructore");
     }

     cat(String money)
     {
         System.out.println("one parameterized constructore");
     }

}
