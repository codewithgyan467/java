import java.util.Scanner;

public class RecursiveStringReverseNoTry {

    
    public static String reverseString(String str) {
       
        if (str == null || str.length() <= 1) {
            return str;
        }

       
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String originalString = scanner.nextLine();
        String reversedString = reverseString(originalString);
        System.out.println("Reversed string: " + reversedString);
        scanner.close(); 
    }
}