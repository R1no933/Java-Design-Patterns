package patterns.miscellaneous_patterns.dependency_injection;

import patterns.miscellaneous_patterns.dependency_injection.consumer.Consumer;
import patterns.miscellaneous_patterns.dependency_injection.injector.EmailServiceInjector;
import patterns.miscellaneous_patterns.dependency_injection.injector.MessageServiceInjector;
import patterns.miscellaneous_patterns.dependency_injection.injector.SmsServiceInjector;

public class InjectorRunner {
    public static void main(String[] args) {
        String message = "Hello World!";
        String email = "test@test.ru";
        String phone = "8(999)123-45-67";
        MessageServiceInjector injector = null;
        Consumer app = null;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(message, email);

        injector = new SmsServiceInjector();
        app = injector.getConsumer();
        app.processMessages(message, phone);
    }
}
