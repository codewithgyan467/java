// 1. WAP to find the smallest and largest element in an array.

public class SmallLargestElement {
  public static void main(String[] args) {
    int[] arr = {3, -6, 8, 7};

    int smallest = 0;
    int largest = 0;

    for (int num : arr) {
      if (smallest == 0 && largest == 0) {
        smallest = num;
	largest = num;
      }

      if (num > largest) largest = num;
      if (num < smallest) smallest = num;
    }

    System.out.println("Smallest: " + smallest);
    System.out.println("Largest: " + largest);
  }
}
