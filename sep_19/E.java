import java.util.Arrays;
import java.util.HashSet;

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

    HashSet<String> set = new HashSet<String>();
    for (String element : args) {
      set.add(element);
    }
    System.out.printf("%nSorted Strings (no duplication):%n%s", set);
  }
}
