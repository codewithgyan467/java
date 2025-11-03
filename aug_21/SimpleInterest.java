public class SimpleInterest {
  public static void main(String[] args) {
    var principal = 30;
    var time = 12;
    var rate = 7;

    var si = (principal * time * rate) / 100;
    System.out.println("S.I = " + si);
  }
}
