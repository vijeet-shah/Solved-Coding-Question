import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int p = 0;

        /*
         * function to calculate
         * the sum of individual digits
         */
        while (n > 0) {

            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }

        /*
         * condition to check whether
         * the value of P equals
         * to user input or not.
         */
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        } else {
            System.out.println(
                    "No. It is not an Armstrong No.");
        }
    }

}