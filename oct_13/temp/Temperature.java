public class Temperature {
  public double toFahrenheit(double celsius) {
    return (9 / 5 * celsius) + 32; 
  }

  public double toCelsius(double farenheit) {
    return (farenheit - 32) * 5 / 9;
  }
}
