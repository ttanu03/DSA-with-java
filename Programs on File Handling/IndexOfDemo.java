public class IndexOfDemo {
    public static void main(String[] args) {
        String text = "Hello, welcome to Java programming!";

        // Find index of a character
        int index1 = text.indexOf('w');

        // Find index of a word
        int index2 = text.indexOf("Java");

        // Find index starting from a specific position
        int index3 = text.indexOf('o', 10);

        // Output results
        System.out.println("Index of 'w': " + index1);
        System.out.println("Index of \"Java\": " + index2);
        System.out.println("Index of 'o' after position 10: " + index3);
    }
}
