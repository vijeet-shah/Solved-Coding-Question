import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            int a = x * n;
            System.out.println(a);
            if (a >= k) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
