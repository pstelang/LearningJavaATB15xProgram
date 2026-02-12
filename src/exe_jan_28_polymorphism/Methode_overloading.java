package exe_jan_28_polymorphism;

public class Methode_overloading {
    public static void main(String[] args) {
        Methodoverloading ov=new Methodoverloading();
        ov.add();
        ov.add(10);
        ov.add(10,20);
        ov.add(10.5);
        ov.add("Praveen");
        System.out.println(ov.add(10.5,10.5));
    }
}
class Methodoverloading
{
    void add()
    {
        System.out.println("print ---");
    }

    void add(int a)
    {
        System.out.println(a);
    }

    void add(String praveen)
    {
        System.out.println(praveen);
    }

    void add(int a,int b)
    {
        System.out.println(a+b);
    }

   void add(double f)
    {
        System.out.println(f);
    }

    double add(double a,double b)
    {
        return a+b;
    }
}