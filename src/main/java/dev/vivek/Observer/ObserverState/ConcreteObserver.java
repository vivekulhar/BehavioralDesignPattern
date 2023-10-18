package dev.vivek.Observer.ObserverState;

public class ConcreteObserver implements Observer{
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("state changed to "+subject.getState()+" in ConcreteObserver");
    }

}
