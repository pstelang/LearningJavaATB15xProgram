package exe_jan_28_polymorphism;

public class Method_overrind2xe2 {
    public static void main(String[] args) {
        commonToAll cl=new commonToAll();
        cl.openBrowser();
        ChromeBrowser cb=new ChromeBrowser();
        cb.openBrowser();
        Firefox ff=new Firefox();
        ff.openBrowser();
        commonToAll dd=new ChromeBrowser();
        dd.openBrowser();

    }
}

class commonToAll
{
    void openBrowser()
    {
        System.out.println("open IE browser");
    }
}
class ChromeBrowser extends commonToAll
{
    void openBrowser()
    {
        System.out.println("Open chrome browser");
    }
}

class Firefox extends commonToAll {
    void openBrowser()
    {
        System.out.println("open firefox browser");
    }
}
