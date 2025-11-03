// 1. WAP to print even numbers from 1 to 20 with while.

public class EvenNumberWhile {
    public static void main(String[] args) {
        int num = 1;

        while (num < 21) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    } 
}
