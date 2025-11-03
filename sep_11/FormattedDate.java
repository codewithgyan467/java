// 5. WAP to format the current date and time into a custom format like dd-MM-yyyy HH:mm:ss.

import java.time.LocalDateTime;

public class CurrentDate {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();

    System.out.println("Current Time: " + dateTime.format(fmt));
  }
}
