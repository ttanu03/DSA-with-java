import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class DateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date in YYYY-MM-DD format
        System.out.print("Enter date (YYYY-MM-DD): ");
        String input = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(input);
            DayOfWeek day = date.getDayOfWeek();

            // Check if it's a weekend
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                System.out.println(day + " is a Weekend.");
            } else {
                System.out.println(day + " is a Weekday.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter in YYYY-MM-DD format.");
        }

        scanner.close();
    }
}
