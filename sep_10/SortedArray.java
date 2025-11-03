public class CheckSortedArray {

    public static boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Not sorted
            }
        }
        return true; // Sorted
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 9};  // Try changing this to test

        if (isSortedAscending(array)) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted in ascending order.");
        }
    }
}
