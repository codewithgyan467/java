// 1. WAP to generate a random number between 1 and 100.

import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    Random rand = new Random();
    int randNum = rand.nextInt(100) + 1;
    System.out.println("Random Number (1-100): " + randNum);
  }
}
