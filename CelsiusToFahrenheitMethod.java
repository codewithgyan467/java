import java.util.Scanner;

public class CelsiusToFahrenheitMethod {

    
    static double cToF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = cToF(c);
        System.out.printf("%.2f °C \n  = %.2f  °F%n", c, f);
        sc.close();
    }
}
