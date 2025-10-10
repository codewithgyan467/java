import java.util.Scanner;

public class ReplaceCharacter {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
        
       System.out.print("Enter a string: ");
       
       String originalString = scanner.nextLine();
       
       String modifiedString = originalString.replace('a', '@').replace('A', '@');

       
        System.out.println("The Modified replaced string is :  " + modifiedString);
        scanner.close();
    }
}