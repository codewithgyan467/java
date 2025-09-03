public class EvenUpTo20While {
    public static void main(String[] args) {
        int i = 2;
        System.out.print("Even numbers up to 20 (while): ");
        while (i <= 20) {
            System.out.print(i + (i == 20 ? "" : " "));
            i += 2;
        }
        System.out.println();
    }
}
