package exe_23_jan;

public class LoginPage {
    String email;
    String password;
    String submit;

    LoginPage()
    {
        System.out.println("DC");
    }
    LoginPage(String email)
    {
        this.email=email;
    }
    LoginPage(String email,String password,String submit)
    {
        this.email=email;
        this.password=password;
        this.submit=submit;
    }
}

