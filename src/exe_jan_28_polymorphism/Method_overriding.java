package exe_jan_28_polymorphism;

public class Method_overriding {
    public static void main(String[] args) {
        praveen pr=new praveen();
        pr.home();

        father f=new father();
        f.home();

        father f1=new praveen();
        f1.home();
    }
}

class father
{
    void home()
    {
        System.out.println("2bhk");
    }

}
class praveen extends father
{
    @Override
    void home()
    {
        System.out.println("3bhk");
    }
}
