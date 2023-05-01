import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter no.");
        Scanner p = new Scanner(System.in);
        int num = p.nextInt();

        for (int i = num; i > 0; i--) {
            num = num * (num - 1);
        }
        System.out.println(num);

    }
}
