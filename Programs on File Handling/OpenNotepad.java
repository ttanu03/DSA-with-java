import java.io.IOException;

public class OpenNotepad {
    public static void main(String[] args) {
        try {
            // Command to open Notepad on Windows
            Runtime.getRuntime().exec("notepad");

            System.out.println("Notepad opened successfully.");
        } catch (IOException e) {
            System.out.println("Error opening Notepad.");
            e.printStackTrace();
        }
    }
}
