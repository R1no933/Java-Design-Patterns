package patterns.behavioral_patterns.state;

public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
