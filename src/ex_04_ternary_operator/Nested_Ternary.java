package ex_04_ternary_operator;

public class Nested_Ternary {
    public static void main(String[] args) {
        int a=2;
        int b=9;
        int c=-11;
        int result=(a>b)? a:(b>c)? b:c;
        System.out.println("Maximum of Three number:"+result);
    }
}
