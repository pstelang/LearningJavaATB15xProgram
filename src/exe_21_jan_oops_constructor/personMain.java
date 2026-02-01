package exe_21_jan_oops_constructor;

public class personMain {
    public static void main(String[] args) {
        person p1=new person();
        p1.name="Praveen";
        p1.age=21;
        p1.gender="Male";

        p1.speak();
        p1.eat();
        p1.videowatching();

        person p2=new person();
        p2.name="Telang";
        p2.age=22;
        p2.gender="male";

    }
}
