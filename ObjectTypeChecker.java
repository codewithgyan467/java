import java.util.Scanner;

public class ObjectTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input: ");
        String input = scanner.nextLine();

        Object obj;

       
        try {
           
            obj = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            
            obj = input;
        }

       
        if (obj instanceof String) {
            System.out.println("The object is a String.");
        } else if (obj instanceof Integer) {
            System.out.println("The object is an Integer.");
        } else {
            System.out.println("The object is of some other type: " + obj.getClass().getName());
        }

        scanner.close();
    }
}
