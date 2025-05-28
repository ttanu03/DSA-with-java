public class GarbageCollectionDemo {

    // This method is called by the garbage collector before object is removed
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called for object: " + this);
    }

    public static void main(String[] args) {
        // Create objects
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        // Remove references
        obj1 = null;
        obj2 = null;

        // Request JVM to run garbage collector
        System.gc();

        // Pause to allow GC to run (not guaranteed but gives chance)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method");
    }
}
