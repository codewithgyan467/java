import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StringsStartingWithVowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter how many strings you want to input: ");
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid number.");
            scanner.close();
            return;
        }

        if (n <= 0) {
            System.out.println("The number of strings must be positive.");
            scanner.close();
            return;
        }

        String[] strings = new String[n];

      
        System.out.println("Enter " + n + " strings (one per line):");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

       
        List<String> vowelStrings = new ArrayList<>();
        for (String str : strings) {
           
            if (str != null && !str.isEmpty()) {
             
                char firstChar = Character.toLowerCase(str.charAt(0));
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                    vowelStrings.add(str);
                }
            }
        }


        if (vowelStrings.isEmpty()) {
            System.out.println("No strings starting with a vowel were found.");
        } else {
            System.out.println("The strings that start with a vowel are:");
            for (String s : vowelStrings) {
                System.out.println("- " + s);
            }
        }

        scanner.close();
    }
}