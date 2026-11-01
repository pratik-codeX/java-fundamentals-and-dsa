public class RuntimeDemo {
    public static void main(String[] args) {
        // 1. Get the singleton Runtime instance
        Runtime runtime = Runtime.getRuntime();

        // 2. Fetch system configuration info
        System.out.println("Available Processors: " + runtime.availableProcessors());
        
        // Convert bytes to Megabytes for readability
        long mb = 1024 * 1024;
        System.out.println("Total Memory: " + (runtime.totalMemory() / mb) + " MB");
        System.out.println("Free Memory: " + (runtime.freeMemory() / mb) + " MB");
        System.out.println("Max Memory: " + (runtime.maxMemory() / mb) + " MB");

        // 3. Trigger garbage collection manually
        runtime.gc();
        System.out.println("Free Memory after GC: " + (runtime.freeMemory() / mb) + " MB");

        // 4. Execute an external OS process (e.g., launching an app)
        try {
            System.out.println("Opening Notepad...");
            // Uses exec() to spin up an OS process
            //runtime.exec("notepad.exe"); 
        } catch (Exception e) {
            System.out.println("Could not execute command: " + e.getMessage());
        }
    }
}
