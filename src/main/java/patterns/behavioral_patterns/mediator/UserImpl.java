package patterns.behavioral_patterns.mediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " : Sending message = " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void recive(String message) {
        System.out.println(this.name + " : Received message: " + message);
    }
}
