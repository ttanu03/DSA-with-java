public class ConstructorDemo {
    String name;
    int age;

    // Constructor to initialize fields
    public ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display data
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create object with constructor
        ConstructorDemo obj = new ConstructorDemo("Alice", 25);

        // Call method to display data
        obj.display();
    }
}
