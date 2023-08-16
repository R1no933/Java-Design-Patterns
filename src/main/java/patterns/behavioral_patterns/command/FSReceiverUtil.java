package patterns.behavioral_patterns.command;

public class FSReceiverUtil {
    public static FSReceiver getFS() {
        String osName = System.getProperty("os.name");
        System.out.println("Current os is: " + osName);
        if(osName.contains("Windows")) {
            return new WindowsFSReceiver();
        } else {
            return new UnixFSReceiver();
        }
    }
}
