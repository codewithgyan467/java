// 2. WAP that takes an array of strings from the user and prints only
//    the strings that start with a vowel.

public class B {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: command <STRINGS>");
      System.out.println();
      System.out.println("STRINGS - The strings to provide.");
      return;
    }

    System.out.println("The provided strings which starts with a vowel:");
    for (String str : args) {
      switch (str.charAt(0)) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
          System.out.println(str);
      }
    }
  }
}
