package exe_jan_28_polymorphism;

public class overrind_real {
    public static void main(String[] args) {
        commontoAll c=new commontoAll();
        c.openbrowser();
        chromebrowser cb=new chromebrowser();
        cb.openbrowser();

        firefox fb=new firefox();
        fb.openbrowser();

        commontoAll fb1=new chromebrowser();
        fb1.openbrowser();


    }
}

class commontoAll
{
    void openbrowser()
    {
        System.out.println("Starting IE browser");
    }
}

class chromebrowser extends commontoAll
{
    @Override
    void openbrowser()
    {
        System.out.println("chromebrowser starting");
    }
}

class firefox extends commontoAll
{
    @Override
    void openbrowser() {
        System.out.println("firefox browser starting");
    }
}
