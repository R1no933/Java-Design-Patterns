package patterns.behavioral_patterns.observer;

public interface Subject {
    public void register(Observer object);
    public void unregister(Observer object);
    public void notifyObserver();
    public Object getUpdate(Observer object);
}
