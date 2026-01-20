package ex_jan_18_exam;

public class Compare_Strings_equal_not {
    public static void main(String[] args) {
        String s1="welcome";
        String s2="welcomE";
        if(s1.equals(s2))
        {
            System.out.println("Two strings are equal");
        }
        else
        {
            System.out.println("Two strings are not equal");
        }
    }
}
