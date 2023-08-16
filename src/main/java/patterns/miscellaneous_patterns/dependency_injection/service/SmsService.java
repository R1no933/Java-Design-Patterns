package patterns.miscellaneous_patterns.dependency_injection.service;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message, String rec) {
        System.out.println("Sms sent to " + rec + " with message: " + message);
    }
}
