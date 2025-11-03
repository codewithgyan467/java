import java.util.Scanner;

public class Celsius {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Celsius: ");
    float celsius = sc.nextFloat();
    float faherenheit = toFaherenheit(celsius);
    System.out.println("Faherenheit: " + faherenheit);
  }

  public static float toFaherenheit(float celsius) {
    return (celsius * 9/5) + 32;
  }
}
