import java.io.*;

public class FinallyDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Open a file (may throw FileNotFoundException)
            reader = new BufferedReader(new FileReader("test.txt"));
            
            // Read a line (may throw IOException)
            String line = reader.readLine();
            System.out.println("First line: " + line);
            
            // Simulate an exception
            int result = 10 / 0;  // ArithmeticException
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found!");
        } catch (IOException e) {
            System.err.println("Error: Cannot read file!");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
        } finally {
            // This block ALWAYS runs (even if an exception occurs)
            System.out.println("Executing finally block...");
            
            // Close the file reader (critical cleanup)
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("File reader closed successfully.");
                } catch (IOException e) {
                    System.err.println("Error: Failed to close file reader!");
                }
            }
        }
        
        System.out.println("Program continues after exception handling.");
    }
}