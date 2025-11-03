public class SimpleNestedTry {
    public static void main(String[] args) {
        try {
            // Outer try block
            int a = 10;

            try {
                // Inner try block
                int result = a / 0; // Will cause ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught in inner catch: " + e);
            }

            int[] arr = new int[3];
            arr[5] = 100; // Will cause ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            // Outer catch block
            System.out.println("Caught in outer catch: " + e);
        }

        System.out.println("Program ends normally.");
    }
}
