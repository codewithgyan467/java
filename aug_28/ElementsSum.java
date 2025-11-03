import java.util.Arrays;

public class ElementsSum {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};

    int sum = 0;
    for (int element : array) {
      sum += element;
    }

    System.out.println("Provided array: " + Arrays.toString(array));
    System.out.println("Sum of all elements of the array: " + sum);
  }
}
