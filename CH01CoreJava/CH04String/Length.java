package CH01CoreJava.CH04String;
//import java.util.*;

public class Length {
    public static void main(String[] args) {
        String s = "Shivam Bhaiya";
        String s2 = "SHIVAM";
        int l = s.length();
        System.out.println(l);
        System.out.println(s.charAt(9));
        System.out.println(s.substring(4,9));
        System.out.println(s.substring(0,6).equals(s2));
        System.out.println(s.substring(0,6).equalsIgnoreCase(s2));
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
//        System.out.println(s.split(" "));
        s.hashCode();
    }
}