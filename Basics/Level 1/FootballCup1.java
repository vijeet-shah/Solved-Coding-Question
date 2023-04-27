import java.util.Scanner;

public class FootballCup1 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int t = i.nextInt();
        while (t > 0) {
            int x, y;
            Scanner x1 = new Scanner(System.in);
            x = x1.nextInt();
            Scanner x2 = new Scanner(System.in);
            y = x2.nextInt();
            if (x > 0 & y > 0) {
                if (x == y) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
            t--;

        }
    }
}
