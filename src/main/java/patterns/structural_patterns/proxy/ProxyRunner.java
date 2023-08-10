package patterns.structural_patterns.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        CommandExecutor executor = new ExecutorProxy("Dmitriy", "P@ssw0rd");
        try {
            executor.runCommand("ls -la");
            executor.runCommand(" rm -rf");
        } catch (Exception error) {
            System.out.println("Exception Message: " + error.getMessage());
        }
    }
}
