import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int vowelCount = 0;

            String lowerCaseInput = input.toLowerCase();

            for (int i = 0; i < lowerCaseInput.length(); i++) {
                char ch = lowerCaseInput.charAt(i);

              
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
            System.out.println("The number of vowels in the string is: " + vowelCount);
        }
    }
}