import java.io.InputStream;
import java.util.Scanner;

//Build Array from Permutation

public class Permutation {
    public static void main(String[] args) {
        int[] x = new int[5];
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            x[i] = a.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

    }
}
