import java.util.Scanner;

public class Subscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int a = sc.nextInt();
            if (a > 30) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
