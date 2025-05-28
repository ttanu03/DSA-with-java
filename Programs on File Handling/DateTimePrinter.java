import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePrinter {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime current = LocalDateTime.now();

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatted = current.format(formatter);

        // Print result
        System.out.println("Current Date and Time: " + formatted);
    }
}
