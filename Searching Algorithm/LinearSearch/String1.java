import java.util.*;

public class String1 {
    public static void main(String[] args) {
        String str = "ABCD";
        String a = " ";
        int x = str.length();
        String c = "B";

        for (int i = 0; i <= x; i++) {
            a = a + str.charAt(i);
            if (c.equals(a)) {
                System.out.println(a);
            } else {
                System.out.println("Not found");
            }
        }

    }
}
