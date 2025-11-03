void main() {
  MathOperation mathOp = new MathOperation();

  System.out.println("2 + 3 = " + mathOp.add(2, 3));
  System.out.println("2.3 + 3.5 = " + mathOp.add(2.3, 3.5));
  System.out.println("7 - 3 = " + mathOp.sub(7, 3));
  System.out.println("5.1 - 3.9 = " + mathOp.sub(5.1, 3.9));
}
