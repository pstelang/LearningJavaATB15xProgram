package exe_23_jan_multlevel_inheritance;

public class main {
    public static void main(String[] args) {
        son s=new son();
        System.out.println(s.gold);
        s.bhk2();
        s.bhk3();
        s.bhk4();

        Father f=new Father();
        System.out.println(f.gold);
        f.bhk2();
        f.bhk3();
    }
}
