package patterns.behavioral_patterns.state;

public class TVRemoteState {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State startState = new TVStartState();
        State stopState = new TVStopState();

        context.setTvState(startState);
        context.doAction();

        context.setTvState(stopState);
        context.doAction();
    }

}
