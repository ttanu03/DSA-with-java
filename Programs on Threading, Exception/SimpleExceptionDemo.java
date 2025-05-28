public class SimpleExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Exception Handling Demo in VS Code");
        System.out.println("---------------------------------");
        
        // Example 1: Handling division by zero
        try {
            System.out.println("\nExample 1: Division");
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example 2: Handling array index out of bounds
        try {
            System.out.println("\nExample 2: Array Access");
            int value = getArrayElement(new int[]{1, 2, 3}, 5);
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example 3: Handling null pointer
        try {
            System.out.println("\nExample 3: String Length");
            String text = null;
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram completed!");
    }

    // Helper method that might throw ArithmeticException
    public static int divideNumbers(int a, int b) {
        return a / b;
    }

    // Helper method that might throw ArrayIndexOutOfBoundsException
    public static int getArrayElement(int[] array, int index) {
        return array[index];
    }
}