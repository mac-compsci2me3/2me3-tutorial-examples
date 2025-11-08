package PushObserverModel;

public class RunnerPush {
    public static void main(String[] args) {
        ConcreteSubjectPush subject = new ConcreteSubjectPush();
        ObserverPushModel observer1 = new ObserverPushModel();
        ObserverPushModel observer2 = new ObserverPushModel();
        
        // Adding observers to the subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Updating news in the subject
        subject.setNews("Breaking News (Push): Initial update!");

        // Updating news again in the subject
        subject.setNews("Breaking News (Push): Second update!");
    }
}
