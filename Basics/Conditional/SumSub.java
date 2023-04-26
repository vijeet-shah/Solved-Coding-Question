
//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class SumSub {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner x = new Scanner(System.in);
        int b = x.nextInt();
        SubSum(b);

    }

    static int SubSum(int a) {
        int s = 0, p = 1;
        while (a > 0) {
            int c = a % 10;
            s += c;
            p *= c;
            a = a / 10;
        }
        System.out.println(p - s);
        return 0;

    }
}