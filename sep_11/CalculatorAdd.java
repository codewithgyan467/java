public class CalculatorAdd {
  public static void main(String[] args) {
    Calculator calc = new Calculator(5, 6);

    System.out.printf(
      "Given, num1 = %d and num2 = %d%n",
      calc.num1,
      calc.num2
    );

    System.out.println("Now, num1 + num2 = " + calc.add());
  }
}

class Calculator {
  int num1;
  int num2;

  Calculator(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  int add() {
    return num1 + num2;
  }
}
