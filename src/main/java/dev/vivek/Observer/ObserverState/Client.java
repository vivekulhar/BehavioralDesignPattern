package dev.vivek.Observer.ObserverState;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        subject.setState(1);
        subject.setState(2);

        subject.detach(observer2);
        subject.setState(3);
    }
}
