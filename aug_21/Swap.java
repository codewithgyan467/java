public class Swap {
  public static void main(String[] args) {
    var a = 3;
    var b = 4;

    var stdout = System.out;
 
    stdout.println("Value of a: " + a);
    stdout.println("Value of b: " + b);

    var temp = a;
    a = b;
    b = temp;

    stdout.println("New value of a: " + a);
    stdout.println("New value of b: " + b);
  }
} 
