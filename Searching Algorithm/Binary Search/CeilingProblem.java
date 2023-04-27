public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int start = 0;
        int end = arr.length - 1;
        int target = 8;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                end = -1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                end = -1;
            }
        }
        if (end == -1) {
            System.out.println("Element Not found");
        }

    }
}
