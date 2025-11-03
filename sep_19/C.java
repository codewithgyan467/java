// 3. WAP that replaces all 'a' characters in a string with '@' using replace().

import java.util.Scanner;

public class C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    sc.close();

    System.out.println();
    System.out.println("Provided String: " + str);
    System.out.println("Replaced String (a to @): " + str.replace("a", "@"));
  }
}
