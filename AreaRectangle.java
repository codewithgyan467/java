import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(                    );
        int b = sc.nextInt();
        System.out.println("Area = " + (l*b));
        sc.close();
    }
}
