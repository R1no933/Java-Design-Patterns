package patterns.miscellaneous_patterns.dependency_injection.injector;

import patterns.miscellaneous_patterns.dependency_injection.consumer.Consumer;

public interface MessageServiceInjector {
    public Consumer getConsumer();
}
