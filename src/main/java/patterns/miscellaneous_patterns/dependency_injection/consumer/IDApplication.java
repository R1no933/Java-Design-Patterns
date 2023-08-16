package patterns.miscellaneous_patterns.dependency_injection.consumer;

import patterns.miscellaneous_patterns.dependency_injection.service.MessageService;

public class IDApplication implements Consumer {
    private MessageService service;

    public IDApplication(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String message, String rec) {
        this.service.sendMessage(message, rec);
    }
}
