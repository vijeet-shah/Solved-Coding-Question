import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner x = new Scanner(System.in);
        String a = x.next();
        String temp = "";
        int len = a.length();
        for (int i = len - 1; i >= 0; i--) {
            temp = temp + a.charAt(i);
        }

        if (a.equals(temp)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

}
