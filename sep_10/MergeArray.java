import java.util.Arrays;

public class MergeArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];

        // Copy first array
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = arr2[i];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int[] merged = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
