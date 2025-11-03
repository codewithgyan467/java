public class Vowels {
  public static void main(String[] args) {
    String str = "Hello world";

    int vowelsCount = 0;
    for (int i = 0; i < str.length(); i++) {
      switch (str.charAt(i)) {
        case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	  vowelsCount++;
      }
    }

    System.out.println("Total vowels in '" + str + "' is " + vowelsCount);
  }
}
