package patterns.miscellaneous_patterns.dependency_injection.injector;

import patterns.miscellaneous_patterns.dependency_injection.consumer.Consumer;
import patterns.miscellaneous_patterns.dependency_injection.consumer.IDApplication;
import patterns.miscellaneous_patterns.dependency_injection.service.SmsService;

public class SmsServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new IDApplication(new SmsService());
    }
}
