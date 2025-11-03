// 2. WAP to convert a numeric String to an int and perform an arithmetic operation on it.

public class NumString {
    public static void main(String[] args) {
        String numString = "25";
        int number = Integer.parseInt(numString);

        int result = number + 10;

        System.out.println("Original number: " + number);
        System.out.println("After adding 10: " + result);
    }
}
