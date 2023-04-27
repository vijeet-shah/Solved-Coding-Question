import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int temp = 0;
        while (input > 0) {
            int a = sc.nextInt();
            int sum = a % 10;
            temp += sum;
            a = a / 10;
            input--;

        }
        System.out.println(temp);
    }
}
