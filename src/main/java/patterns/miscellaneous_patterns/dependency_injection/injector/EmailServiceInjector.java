package patterns.miscellaneous_patterns.dependency_injection.injector;

import patterns.miscellaneous_patterns.dependency_injection.consumer.Consumer;
import patterns.miscellaneous_patterns.dependency_injection.consumer.IDApplication;
import patterns.miscellaneous_patterns.dependency_injection.service.EmailService;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new IDApplication(new EmailService());
    }
}
