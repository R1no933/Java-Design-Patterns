package patterns.behavioral_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator {

    private List<User> users;

    public ChatMediatorImp() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User usr : this.users) {
            if(usr != user) {
                usr.recive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
