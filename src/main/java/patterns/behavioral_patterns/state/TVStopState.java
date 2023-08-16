package patterns.behavioral_patterns.state;

public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TC is turned OFF");
    }
}
