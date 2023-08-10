package patterns.behavioral_patterns.mediator;

public class MediatorRunner {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImp();
        User firstUser = new UserImpl(mediator, "Dmitriy");
        User secondUser = new UserImpl(mediator, "Sasha");
        User thirdUser = new UserImpl(mediator, "Andrey");
        User fourthUser = new UserImpl(mediator, "Lena");
        mediator.addUser(firstUser);
        mediator.addUser(secondUser);
        mediator.addUser(thirdUser);
        mediator.addUser(fourthUser);

        firstUser.send("Hello World!!!");
    }
}
