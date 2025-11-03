public class Obj {
  String value;

  Obj(String value) {
    this.value = value;
  }

  public void printObj() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Obj(value: " + value + ")";
  }
}
