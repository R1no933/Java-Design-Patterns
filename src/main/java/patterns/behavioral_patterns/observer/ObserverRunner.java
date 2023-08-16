package patterns.behavioral_patterns.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer object1 = new MyTopicSubsriber("Object 1");
        Observer object2 = new MyTopicSubsriber("Object 2");
        Observer object3 = new MyTopicSubsriber("Object 3");

        topic.register(object1);
        topic.register(object2);
        topic.register(object3);

        object1.setSubject(topic);
        object2.setSubject(topic);
        object3.setSubject(topic);

        object1.update();

        topic.postMessage("Hello World!!!");
    }
}
