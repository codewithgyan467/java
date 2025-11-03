// 3. WAP to reverse an array.
import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = {4, 9, 3, 5, 6};
    int maxIter = arr.length / 2;

    System.out.println("Original Array: " + Arrays.toString(arr));
    for (int i = 0; i < maxIter; ++i) {
      int negatedIndex = i + 1;
      arr[i] ^= arr[arr.length - negatedIndex];
      arr[arr.length - negatedIndex] ^= arr[i];
      arr[i] ^= arr[arr.length - negatedIndex];
    }

    System.out.println("Reversed Array: " + Arrays.toString(arr));
  }
}
