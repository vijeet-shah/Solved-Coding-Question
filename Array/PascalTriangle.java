/* */

package array_1;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static int getPascalElement(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return getPascalElement(row - 1, col - 1) + getPascalElement(row - 1, col);
        }
    }

    public static List<Integer> getNthRow(int n) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= n; i++) {
            int num = row.get(i - 1) * (n - i + 1) / i;
            row.add(num);
        }
        return row;
    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = getNthRow(i);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        // Variation 1: Print the element at position (r, c)
        int r = 3;
        int c = 2;
        int pascalElement = getPascalElement(r, c);
        System.out.println("Element at position (" + r + ", " + c + ") in Pascal's triangle: " + pascalElement);

        // Variation 2: Print the nth row of Pascal's triangle
        int n = 5;
        List<Integer> nthRow = getNthRow(n);
        System.out.println("Nth row of Pascal's triangle (n = " + n + "): " + nthRow);

        // Variation 3: Print the first n rows of Pascal's triangle
        int numRows = 4;
        List<List<Integer>> pascalTriangle = generatePascalTriangle(numRows);
        System.out.println("First " + numRows + " rows of Pascal's triangle:");
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}