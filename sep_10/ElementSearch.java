public class ElementSearch {
  public static void main(String[] args) {
    int[] arr = {6, 7, 3, 9, 1};
    int num = 3;

    boolean found = false;
    for (int element : arr) {
      if (element == num) found = true;
    }

    if (found) {
      System.out.println("The element is found!");
    } else {
      System.out.println("The element is not found!");
    }
  }
}
