package exe_23_jan;

public class constructore_chaining {
}

class login
{
    String email;
    String password;
    String submitbutton;

    login()
    {
        System.out.println("default constructor");
    }
    login(String email,String password)
    {
        this.email=email;
        this.password=password;
    }

    login(String email,String password,String submitbutton)
    {
        this(email,password);
        this.submitbutton=submitbutton;
    }
}
