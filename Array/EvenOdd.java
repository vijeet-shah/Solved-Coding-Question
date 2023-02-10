//2. Print Even & odd Numbers from an Array
package Array;

public class EvenOdd {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        int y = 0;

        for (int i = 0; i < x.length; i++) {
            y = x[i];
            if (y % 2 == 0) {
                System.out.println(y + " is even Number");
            } else {
                System.out.println(y + " is odd number");
            }
        }
    }

}
