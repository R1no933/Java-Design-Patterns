package patterns.behavioral_patterns.observer;

public interface Observer {
    public void update();
    public void setSubject(Subject subject);
}
