public class Distance {
  private int point1;
  private int point2;

  public Distance() {
    this.point1 = 0;
    this.point2 = 0;
  }

  public Distance(int point1, int point2) {
    this.point1 = point1;
    this.point2 = point2;
  }

  public int findDistance() {
    return Math.abs(point1 - point2);
  }
}
