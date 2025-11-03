// 2. WAP to print even numbers from 1 to 20 with do-while.

public class EvenNumberDoWhile {
    public static void main(String[] args) {
        int num = 1;

        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        } while (num < 21);
    } 
}
