package patterns.behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean isChanged;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer object) {
        if (object == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(object)) observers.add(object);
        }
    }

    @Override
    public void unregister(Observer object) {
        synchronized (MUTEX) {
            observers.remove(object);
        }
    }

    @Override
    public void notifyObserver() {
        List<Observer> observersLocal = null;
        synchronized (MUTEX) {
            if (!isChanged) return;
            observersLocal = new ArrayList<>(this.observers);
            this.isChanged = false;
        }

        for (Observer object : observersLocal) {
            object.update();
        }
    }

    @Override
    public Object getUpdate(Observer object) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to topic: " + message);
        this.message = message;
        this.isChanged = true;
        notifyObserver();
    }
}
