import java.util.Scanner;

public class IsValidTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st side: ");
    int side1 = sc.nextInt();
 
    System.out.print("Enter 2nd side: ");
    int side2 = sc.nextInt();
 
    System.out.print("Enter 3rd side: ");
    int side3 = sc.nextInt();

   if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
     System.out.println("It is a valid triangle.");
   } else {
     System.out.println("It is not a valid triangle");
   }
  }
}
