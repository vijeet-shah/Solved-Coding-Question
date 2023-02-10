//1. Find Sum of elements in Array
package Array;

public class Sum {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = { 1, 2, 3, 4, 5 };
        int a = 0;
        for (int i = 0; i < y.length; i++) {
            a = a + y[i];
        }
        System.out.print(a);
    }

}
