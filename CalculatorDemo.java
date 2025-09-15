class Calculator {
    int i;
    int j;

    // Constructor name must match class name
    Calculator(int i, int j) {
        this.i = i;
        this.j = j;
    }

   
    int add() {
        return i + j;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator(2, 4);
        System.out.println("The first number is:-"+calc.i+ "  and the second number is:-"+calc.j);

        
        System.out.println("The sum is: " + calc.add());
    }
}
