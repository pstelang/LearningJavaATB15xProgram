package exe_23_jan;

public class ConstrureOverloading {
    public static void main(String[] args) {
        Baby b = new Baby();
        Baby b1 = new Baby("praveen");
        Baby b2 = new Baby("telang", "thousand");
    }
}

    class Baby {
        Baby() {
            System.out.println("DC");
        }

        Baby(String name) {
            System.out.println("Parameterized constructor");
        }

        Baby(String ename, String money) {
            System.out.println("parameterized constructore--with two paramas");
        }
    }
