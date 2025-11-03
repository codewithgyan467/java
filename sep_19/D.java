// 4. WAP that accepts an array of strings from the user and sort them in
//    alphabetical order.

import java.util.Arrays;

public class D {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: command <STRINGS>");
      System.out.println();
      System.out.println("STRINGS = THe strings to provide.");
      return;
    }

    Arrays.sort(args);

    System.out.printf("Sorted Strings:%n%s", Arrays.toString(args));
  }
}
