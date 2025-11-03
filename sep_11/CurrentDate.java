// 4. WAP to display the current date and time using the LocalDateTime class.
import java.time.LocalDateTime;

public class CurrentDate {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Current Time: " + dateTime);
  }
}
