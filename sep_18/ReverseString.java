public class ReverseString {
  public static void main(String[] args) {
    String str = "Hello";
    String strReverse = reverseStr(str);

    System.out.println("Original String: " + str);
    System.out.println("Reverse String: " + strReverse);
  }

  public static String reverseStr(String str) {
    if (str.length() < 2) return str;
    return reverseStr(str.substring(1)) + str.charAt(0);
  }
}

