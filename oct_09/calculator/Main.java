public class Main {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.printf("%d + %d = %d%n", 5, 6, calc.add(5, 6));
    System.out.printf("%.1f + %.1f = %.1f%n", 4.3, 2.5, calc.add(4.3, 2.5));
    System.out.printf("%d + %d + %d = %d%n", 5, 6, 2, calc.add(5, 6, 2));
  }
}
