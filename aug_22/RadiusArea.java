import java.util.Scanner;

public class RadiusArea {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Radius: ");
    int radius = sc.nextInt();
    sc.close();

    double area = 3.14 * radius * radius;

    System.out.println("Area: " + area);
  }
}
