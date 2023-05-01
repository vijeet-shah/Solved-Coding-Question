import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) {
        System.out.println("Enter no.");
        Scanner p = new Scanner(System.in);
        int count = p.nextInt();

        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a + " " + b);

        for (int i = 2; i < count; ++i) {
            temp = a + b;
            System.out.print(" " + temp + " ");

            a = b;
            b = temp;
        }

    }
}