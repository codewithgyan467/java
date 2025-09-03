public class EvenUpTo20DoWhile {
    public static void main(String[] args) {
        int i = 2;
        System.out.print("Even numbers up to 20 (do-while): ");
        if (i > 20) {
            System.out.println(); // nothing to print
            return;
        }
        do {
            System.out.print(i + (i == 20 ? "" : " "));
            i += 2;
        } while (i <= 20);
        System.out.println();
    }
}
