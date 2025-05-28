import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo {
    public static void main(String[] args) {
        // Get current date
        LocalDate today = LocalDate.now();

        // Different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy"); // e.g., May 28, 2025
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("E, dd MMM yyyy"); // e.g., Wed, 28 May 2025

        // Print date in different formats
        System.out.println("Format 1 (yyyy-MM-dd): " + today.format(format1));
        System.out.println("Format 2 (dd/MM/yyyy): " + today.format(format2));
        System.out.println("Format 3 (MMMM dd, yyyy): " + today.format(format3));
        System.out.println("Format 4 (E, dd MMM yyyy): " + today.format(format4));
    }
}
