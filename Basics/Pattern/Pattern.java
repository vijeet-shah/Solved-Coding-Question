class Pattern {
    public static void main(String[] args) {
        int n = 11;
        for (int r = 1; r <= n; r++) {

            int x = 6;

            if (r <= x) {
                for (int c = 1; c < r; c++) {
                    System.out.print(" * ");
                }
                System.out.println();
            } else {
                for (int c = 1; c < n - r + 1; c++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}