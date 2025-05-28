import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample regex: check if input is a valid email
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        System.out.print("Enter a string to check if it is a valid email: ");
        String input = scanner.nextLine();

        // Compile regex
        Pattern pattern = Pattern.compile(regex);

        // Match input with regex
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid email!");
        } else {
            System.out.println("Invalid email.");
        }

        scanner.close();
    }
}
