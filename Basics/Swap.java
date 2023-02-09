import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        System.out.print("Enter 1st No.");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Enter 2nd No.");
        Scanner t = new Scanner(System.in);
        int b = t.nextInt();
        int temp = 0;

        temp = a;
        a = b;
        b = temp;
        System.out.println("Temp Method " + "\n" + "1st No. " + a + "\n" + "2nd no. " + b);

        b = a + b - (a = b);
        System.out.println("b = a + b - (a = b); " + "\n" + "1st No. " + a + "\n" + "2nd no. " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Without Temp" + "\n" + "1st No. " + a + "\n" + "2nd no. " + b);

    }
}
