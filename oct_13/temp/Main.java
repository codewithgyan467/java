import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Select the Temperature Converter Unit: ");
    System.out.println("1. Celsius to Fahrenheit");
    System.out.println("2. Fahrenheit to Celsius");

    Temperature temp = new Temperature();

    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();
    sc.nextLine();

    double value;
    switch (option) {
      case 1:
	System.out.print("Enter celsius: ");
	value = sc.nextDouble();
        System.out.printf("Fahrenheit: %.2f F", temp.toFahrenheit(value));
	break;
      case 2:
	System.out.print("Enter fahrenheit: ");
	value = sc.nextDouble();
        System.out.printf("Celsius: %.2f C", temp.toCelsius(value));
	break;
      default:
        System.out.println("[Error]: Invalid option selected!");
	break;
    }

    sc.close();
  }
}
