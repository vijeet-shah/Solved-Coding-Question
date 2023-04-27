import java.util.Scanner;

public class Enormpus {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int k = x.nextInt();

        int count = 0;
        int i = 1;
        while (i <= n) {
            int u = x.nextInt();
            if (u % k == 0) {
                count++;
            }
            i++;
        }
        System.out.println(count);
        x.close();
    }
}

/*
 * The purpose of this problem is to verify whether the method you are using to
 * read input data is sufficiently fast to handle
 * problems branded with the enormous Input/Output warning.
 * You are expected to be able to process at least 2.5MB of input data per
 * second at runtime.
 */
/*
 * Q. Take input n :(No. of integer input we have to take from user) & k: (check
 * if All interger input is divisible by k or not )
 * E.G.
 * n=5 & K=2
 * 10
 * 21
 * 3
 * 4
 * 5
 * O/P:- 2 (2 no. out of 5 is divisible by 2.)
 */