import java.util.Scanner;

public class InputPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter something: ");
        String input = scanner.nextLine();

        // Print the input
        System.out.println("You entered: " + input);

        scanner.close();
    }
}
