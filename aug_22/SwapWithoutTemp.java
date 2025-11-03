import java.util.Scanner;

public class SwapWithoutTemp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    var a = 3;
    var b = 4;

    var stdout = System.out;
 
    stdout.println("Enter value of a: ");
    stdout.println("Value of b: " + b);

    a ^= b;
    b ^= a;
    a ^= b;


    stdout.println("New value of a: " + a);
    stdout.println("New value of b: " + b);
  }
} 
