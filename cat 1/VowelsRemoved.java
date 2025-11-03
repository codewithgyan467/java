// 2. WAP with a method that takes a string and returns a new string with all vowels removed.

import java.util.Scanner;

public class VowelsRemoved {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    // Take string input
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    sc.close(); // Cleanup resource

    System.out.print("The provided string after all vowels removed: ");
    System.out.println(removeVowels(str));
  }

  public static String removeVowels(String str) {
    String strVowelRemoved = "";

    for (int i = 0; i < str.length(); i++) {
      char current = str.charAt(i); 
      switch (current) {
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
	   break; // Compare the above cases, if found - ignore current char
	 default:
	   // concatenate the current char
           strVowelRemoved += current;
       }
    }

    return strVowelRemoved;
  }
}
