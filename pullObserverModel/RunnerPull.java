package PullObserverModel;

public class RunnerPull {
    public static void main(String[] args) {
        ConcreteSubjectPull subject = new ConcreteSubjectPull();
        ObserverPullModel observer1 = new ObserverPullModel(subject);
        ObserverPullModel observer2 = new ObserverPullModel(subject);
        
        // Adding observers to the subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Updating news in the subject
        subject.setNews("Breaking News (Pull): Initial update!");

        // Observers pull updates explicitly
        observer1.update();
        observer2.update();

        // Updating news again in the subject
        subject.setNews("Breaking News (Pull): Second update!");

        // Observers pull updates explicitly
        observer1.update();
        observer2.update();
    }
}
