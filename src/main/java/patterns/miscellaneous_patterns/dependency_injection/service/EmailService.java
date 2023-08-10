package patterns.miscellaneous_patterns.dependency_injection.service;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String rec) {
        System.out.println("Email sent to " + rec + "with message: " + message);
    }
}
