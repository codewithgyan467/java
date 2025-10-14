public class Temperature {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Temperature tempConverter = new Temperature();
        System.out.println("100 Celsius to Fahrenheit: " + tempConverter.celsiusToFahrenheit(100));
        System.out.println("212 Fahrenheit to Celsius: " + tempConverter.fahrenheitToCelsius(212));
  }
}
