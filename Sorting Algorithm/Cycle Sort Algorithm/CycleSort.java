class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }
            if (pos == cycleStart) {
                continue;
            }
            while (item == arr[pos]) {
                pos++;
            }
            int temp = arr[pos];
            arr[pos] = item;
            item = temp;
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }
                while (item == arr[pos]) {
                    pos++;
                }
                temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
