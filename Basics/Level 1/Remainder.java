import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a % b);
            input--;
        }

    }
}

/* */