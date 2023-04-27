import java.util.*;

public class BinaryArrayConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            Boolean s= canConvert(a, b);
            if ()
            System.out.println(canConvert(a, b) ? "YES" : "NO");
        }
        scanner.close();
    }

    public static boolean canConvert(int[] a, int[] b) {
        int onesA = 0, onesB = 0;
        for (int i = 0; i < a.length; i++) {
            onesA += a[i];
            onesB += b[i];
        }
        if (onesA != onesB) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                return false;
            }
        }
        return true;
    }
}