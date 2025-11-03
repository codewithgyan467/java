public class EvenOddInArray {

    public static void findEvenOdd(int[] arr) {
        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); // For new line

        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 15, 22, 33, 40, 55, 60};

        findEvenOdd(array);
    }
}
