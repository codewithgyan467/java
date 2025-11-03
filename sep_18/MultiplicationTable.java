// 2. WAP to print the multiplication table of a number using a for loop.

public class MultiplicationTable {
  public static void main(String[] args) {
    int num = 5;
    int upto = 15;

    for (int i = 1; i <= upto; i++) {
      System.out.printf("%d x %d = %d%n", num, i, num * i);
    }
  }
}
