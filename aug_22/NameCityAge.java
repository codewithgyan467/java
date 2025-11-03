import java.util.Scanner;

public class NameCityAge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter City: ");
    String city = sc.nextLine();

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.close();
 
    System.out.println("Name: " + name);
    System.out.println("City: " + city);
    System.out.println("Age: " + age);
  }
}
