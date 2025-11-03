// 1. WAP to find all prime nos in a given range.

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      // Input start range
      System.out.print("Enter the start range upto which all prime nos are to be found: ");
      int minRange = sc.nextInt();
      sc.nextLine(); // Clear remaining buffer

      // Validate start range
      if (minRange <  0) {
        System.out.println("[Error] Expected a positive start range!!");
	return;
      }
 
      // Input end range
      System.out.print("Enter the end range upto which all prime nos are to be found: "); 
      int maxRange = sc.nextInt();

      // Validate end range
      if (maxRange < 0 || maxRange <= minRange) {
        System.out.println("Expected a positive end range or end range must not be lower than start range!!");
	return;
      }

      for (int i = minRange; i <= maxRange; i++) {
	if (i > 1) {
          int j; 
          for (j = 2; j * j <= i; j++) {
            if (i % j == 0) break; 
	  }
	  if (j * j > i) System.out.println(i);
	} 
      }
    } finally {
      sc.close(); // Cleanup resource.
    }
  }
}
